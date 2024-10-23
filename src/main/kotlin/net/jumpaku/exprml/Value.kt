package net.jumpaku.exprml

import net.jumpaku.exprml.pb.exprml.v1.Value
import net.jumpaku.exprml.pb.exprml.v1.value

fun objValue(obj: Map<String, Value>): Value = value {
    this.type = Value.Type.OBJ
    this.obj.putAll(obj)
}

fun arrValue(arr: List<Value>): Value = value {
    this.type = Value.Type.ARR
    this.arr.addAll(arr)
}

fun strValue(str: String): Value {
    return value {
        this.type = Value.Type.STR
        this.str = str
    }
}

fun numValue(num: Double): Value {
    return value {
        this.type = Value.Type.NUM
        this.num = num
    }
}

fun boolValue(b: Boolean): Value {
    return value {
        this.type = Value.Type.BOOL
        this.bool = b
    }
}