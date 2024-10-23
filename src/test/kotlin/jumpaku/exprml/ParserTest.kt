package jumpaku.exprml

import jumpaku.exprml.pb.exprml.v1.decodeInput
import jumpaku.exprml.pb.exprml.v1.parseInput
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertTrue

class ParserTest {

    @ParameterizedTest
    @MethodSource("provide")
    fun testParse_false(name: String, inSource: String) {
        val decodeResult = Decoder().decode(decodeInput { yaml = inSource })
        if (decodeResult.isError) {
            kotlin.test.fail("decode error: ${decodeResult.errorMessage}")
        }
        val parseResult = Parser().parse(parseInput { value = decodeResult.value })
        assertTrue(parseResult.isError)
    }

    companion object {
        @JvmStatic
        fun provide(): List<Arguments> = resourceContents
            .filter { (name, _) -> name.startsWith("testdata/parser/error") && name.endsWith(".in.yaml") }
            .map { (name, _) -> Arguments.arguments(name, resourceContents[name]!!) }
    }

}

