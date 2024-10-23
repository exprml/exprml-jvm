package jumpaku.exprml

import jumpaku.exprml.pb.exprml.v1.*
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
        val decodeResult = Decoder().decode(decodeInput { yaml = inSource })
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

    // Matcher for values of type protobuf Value
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
                val want = Decoder().decode(decodeInput { yaml = resourceContents["$name.want.yaml"]!! })
                when {
                    "want_value" in want.value.objMap ->
                        Arguments.arguments(name, inYaml, false, want.value.objMap["want_value"]!!)

                    "want_error" in want.value.objMap ->
                        Arguments.arguments(name, inYaml, want.value.objMap["want_error"]!!.bool, null)

                    else -> error("invalid want: $want")
                }
            }
    }
}

