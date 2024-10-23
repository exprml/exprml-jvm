package jumpaku.exprml

import jumpaku.exprml.pb.exprml.v1.Expr.Path
import jumpaku.exprml.pb.exprml.v1.ExprKt.PathKt.pos
import jumpaku.exprml.pb.exprml.v1.ExprKt.path

fun Path.append(vararg ps: Any): Path = path {
    pos.addAll(posList)
    for (p in ps) {
        when (p) {
            is Int -> pos.add(pos { index = p.toLong() })
            is String -> pos.add(pos { key = p })
            else -> throw IllegalArgumentException("pos must be int or string")
        }
    }
}

fun Path.format(): String = when {
    posList.isEmpty() -> "/"
    else -> posList.joinToString { pos ->
        when {
            pos.key.isNotEmpty() -> "/${pos.key}"
            else -> "/${pos.index}"
        }
    }
}