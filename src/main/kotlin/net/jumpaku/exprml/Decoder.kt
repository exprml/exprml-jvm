package net.jumpaku.exprml

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.node.JsonNodeType
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory
import net.jumpaku.exprml.pb.exprml.v1.*


class Decoder {
    fun decode(input: DecodeInput): DecodeOutput = try {
        val factory = YAMLFactory()
        val node = ObjectMapper(factory).readTree(input.yaml)
        decodeOutput { value = convertFromJackson(node) }
    } catch (e: Exception) {
        decodeOutput { isError = true;errorMessage = e.toString() }
    }

    private fun convertFromJackson(v: JsonNode): Value = when (v.nodeType) {
        JsonNodeType.NULL -> value { type = Value.Type.NULL }
        JsonNodeType.BOOLEAN -> value { type = Value.Type.BOOL; bool = v.booleanValue() }
        JsonNodeType.NUMBER -> value { type = Value.Type.NUM; num = v.doubleValue() }
        JsonNodeType.STRING -> value { type = Value.Type.STR; str = v.textValue() }
        JsonNodeType.ARRAY -> value {
            type = Value.Type.ARR
            arr.addAll(v.elements().asSequence().map { convertFromJackson(it) }.toList())
        }

        JsonNodeType.OBJECT -> value {
            type = Value.Type.OBJ
            obj.putAll(v.fields().asSequence().map { it.key to convertFromJackson(it.value) }.toMap())
        }

        else -> throw IllegalArgumentException("Unsupported type: ${v.nodeType}")
    }
}
