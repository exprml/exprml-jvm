package jumpaku.exprml

import jumpaku.exprml.pb.exprml.v1.*
import jumpaku.exprml.pb.exprml.v1.Eval.Definition
import jumpaku.exprml.pb.exprml.v1.EvalKt.definition
import jumpaku.exprml.pb.exprml.v1.Expr.Kind
import jumpaku.exprml.pb.exprml.v1.Expr.Path


fun DefStack.register(def: Definition): DefStack = defStack {
    this.def = def
    this.parent = this@register
}

fun DefStack.find(ident: String): DefStack? = when {
    !hasDef() -> null
    def.ident == ident -> this
    !hasParent() -> null
    else -> parent.find(ident)
}

fun newDefinition(path: Path, ident: String, value: Value): Definition = definition {
    this.ident = ident
    this.body = expr {
        this.path = path
        this.kind = Kind.JSON
        this.value = value
        this.json = json { json = value }
    }
}