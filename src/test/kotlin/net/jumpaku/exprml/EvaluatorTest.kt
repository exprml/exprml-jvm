package net.jumpaku.exprml

import net.jumpaku.exprml.pb.exprml.v1.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.fail

class EvaluatorTest {
    @ParameterizedTest
    @MethodSource("provide")
    fun testEvaluateExpr(name: String, inSource: String, wantError: Boolean, wantValue: Value?) {
        val decodeResult = Decoder().decode(decodeInput { text = inSource })
        if (decodeResult.isError) {
            fail("decode error: ${decodeResult.errorMessage}")
        }
        val pareResult = Parser().parse(parseInput { value = decodeResult.value })
        if (pareResult.isError) {
            fail("parse error: ${pareResult.errorMessage}")
        }
        val evaluateResult = Evaluator().evaluateExpr(evaluateInput { expr = pareResult.expr })
        if (wantError) {
            assertNotEquals(EvaluateOutput.Status.OK, evaluateResult.status)
        } else {
            assertEquals(EvaluateOutput.Status.OK, evaluateResult.status)
            assertEqualsValue(emptyList(), wantValue!!, evaluateResult.value)
        }
    }

    @ParameterizedTest
    @MethodSource("provide_extension")
    fun testEvaluateExpr_extension(name: String, inSource: String, wantValue: Value) {
        val decodeResult = Decoder().decode(decodeInput { text = inSource })
        if (decodeResult.isError) {
            fail("decode error: ${decodeResult.errorMessage}")
        }
        val pareResult = Parser().parse(parseInput { value = decodeResult.value })
        if (pareResult.isError) {
            fail("parse error: ${pareResult.errorMessage}")
        }

        val sut = Evaluator(
            config = Evaluator.Config(
                extension = mapOf(
                    "\$ext_func" to { _, args -> evaluateOutput { value = objValue(args) } }
                )
            )
        )
        val evaluateResult = sut.evaluateExpr(evaluateInput { expr = pareResult.expr })
        assertEquals(EvaluateOutput.Status.OK, evaluateResult.status)
        assertEqualsValue(emptyList(), wantValue, evaluateResult.value)
    }

    @Test
    fun testEvaluateExpr_beforeEvaluate() {
        val evalPaths = mutableListOf<String>()

        val decodeResult = Decoder().decode(decodeInput {
            text = "cat: ['`Hello`', '`, `', '`ExprML`', '`!`']"
        })
        if (decodeResult.isError) {
            fail("decode error: ${decodeResult.errorMessage}")
        }
        val pareResult = Parser().parse(parseInput { value = decodeResult.value })
        if (pareResult.isError) {
            fail("parse error: ${pareResult.errorMessage}")
        }

        val sut = Evaluator(
            config = Evaluator.Config(
                beforeEvaluate = { input ->
                    evalPaths.add(input.expr.path.format())
                }
            )
        )
        val evaluateResult = sut.evaluateExpr(evaluateInput { expr = pareResult.expr })
        assertEquals(EvaluateOutput.Status.OK, evaluateResult.status)
        assertEquals(listOf("/", "/cat/0", "/cat/1", "/cat/2", "/cat/3"), evalPaths)
    }

    @Test
    fun testEvaluateExpr_afterEvaluate() {
        val evalTypes = mutableListOf<Value.Type>()

        val decodeResult = Decoder().decode(decodeInput {
            text = "cat: ['`Hello`', '`, `', '`ExprML`', '`!`']"
        })
        if (decodeResult.isError) {
            fail("decode error: ${decodeResult.errorMessage}")
        }
        val pareResult = Parser().parse(parseInput { value = decodeResult.value })
        if (pareResult.isError) {
            fail("parse error: ${pareResult.errorMessage}")
        }

        val sut = Evaluator(
            config = Evaluator.Config(
                afterEvaluate = { _, output ->
                    evalTypes.add(output.value.type)
                }
            )
        )
        val evaluateResult = sut.evaluateExpr(evaluateInput { expr = pareResult.expr })
        assertEquals(EvaluateOutput.Status.OK, evaluateResult.status)
        assertEquals(listOf(Value.Type.STR, Value.Type.STR, Value.Type.STR, Value.Type.STR, Value.Type.STR), evalTypes)
    }

    fun assertEqualsValue(path: List<String>, expect: Value, actual: Value) {
        assertEquals(expect.type, actual.type, "type mismatch at $path")
        when (expect.type) {
            Value.Type.NULL -> Unit
            Value.Type.BOOL -> assertEquals(expect.bool, actual.bool, "value mismatch at $path")
            Value.Type.NUM -> assertEquals(expect.num, actual.num, "value mismatch at $path")
            Value.Type.STR -> assertEquals(expect.str, actual.str, "value mismatch at $path")
            Value.Type.ARR -> {
                assertEquals(expect.arrList.size, actual.arrList.size, "array size mismatch at $path")
                for ((i, p) in expect.arrList.zip(actual.arrList).withIndex()) {
                    val (a, e) = p
                    assertEqualsValue(path + i.toString(), e, a)
                }
            }

            Value.Type.OBJ -> {
                assertEquals(expect.objMap.keys, actual.objMap.keys, "object keys mismatch at $path")
                for ((k, e) in expect.objMap) {
                    val a = actual.objMap[k]!!
                    assertEqualsValue(path + k, e, a)
                }
            }

            else -> error("unknown type: ${expect.type}")
        }
    }

    companion object {
        @JvmStatic
        fun provide(): List<Arguments> = resourceContents
            .filter { (name, _) -> name.startsWith("testdata/evaluator") }
            .map { (name, _) -> name.replace(Regex("""\.(want|in)\.yaml$"""), "") }
            .distinct()
            .map { name ->
                val inYaml = resourceContents["$name.in.yaml"]!!
                val want = Decoder().decode(decodeInput { text = resourceContents["$name.want.yaml"]!! })
                when {
                    "want_value" in want.value.objMap ->
                        Arguments.arguments(name, inYaml, false, want.value.objMap["want_value"]!!)

                    "want_error" in want.value.objMap ->
                        Arguments.arguments(name, inYaml, want.value.objMap["want_error"]!!.bool, null)

                    else -> error("invalid want: $want")
                }
            }

        @JvmStatic
        fun provide_extension(): List<Arguments> = listOf(
            Arguments.arguments(
                "Ref",
                "\$ext_func",
                objValue(mapOf())
            ),
            Arguments.arguments(
                "Call",
                "\$ext_func: { \$arg: '`arg`'}",
                objValue(mapOf("\$arg" to strValue("arg")))
            ),
        )
    }
}

