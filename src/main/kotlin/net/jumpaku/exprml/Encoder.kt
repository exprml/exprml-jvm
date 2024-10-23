package net.jumpaku.exprml

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory
import net.jumpaku.exprml.pb.exprml.v1.EncodeInput
import net.jumpaku.exprml.pb.exprml.v1.EncodeOutput
import net.jumpaku.exprml.pb.exprml.v1.Value
import net.jumpaku.exprml.pb.exprml.v1.encodeOutput

class Encoder {
    fun encode(input: EncodeInput): EncodeOutput = try {
        when (input.format) {
            EncodeInput.Format.YAML -> encodeOutput {
                result = ObjectMapper(YAMLFactory()).writeValueAsString(convertToJackson(input.value))
            }

            EncodeInput.Format.JSON -> encodeOutput {
                result = ObjectMapper().writeValueAsString(convertToJackson(input.value))
            }

            else -> encodeOutput { isError = true; errorMessage = "Unsupported format: ${input.format}" }
        }
    } catch (e: Exception) {
        encodeOutput { isError = true; errorMessage = e.toString() }
    }

    private fun convertToJackson(v: Value): JsonNode = when (v.type) {
        Value.Type.NULL -> ObjectMapper().createObjectNode()
        Value.Type.BOOL -> ObjectMapper().valueToTree(v.bool)
        Value.Type.NUM -> ObjectMapper().valueToTree(v.num)
        Value.Type.STR -> ObjectMapper().valueToTree(v.str)
        Value.Type.ARR -> ObjectMapper().createArrayNode().addAll(v.arrList.map { convertToJackson(it) })
        Value.Type.OBJ -> ObjectMapper().createObjectNode().setAll(v.objMap.mapValues { convertToJackson(it.value) })
        else -> throw IllegalArgumentException("Unsupported type: ${v.type}")
    }
}