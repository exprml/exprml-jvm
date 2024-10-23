package net.jumpaku.exprml

import net.jumpaku.exprml.pb.exprml.v1.*
import net.jumpaku.exprml.pb.exprml.v1.CasesKt.case
import net.jumpaku.exprml.pb.exprml.v1.EvalKt.definition
import net.jumpaku.exprml.pb.exprml.v1.Expr.Path
import net.jumpaku.exprml.pb.exprml.v1.ExprKt.path

class Parser {

    fun parse(input: ParseInput): ParseOutput = try {
        parseOutput { expr = parse(path {}, input.value) }
    } catch (e: Exception) {
        parseOutput { isError = true; errorMessage = e.toString() }
    }

    private fun parse(path: Path, value: Value): Expr = when (value.type) {
        Value.Type.BOOL, Value.Type.NUM -> expr {
            this.path = path
            kind = Expr.Kind.SCALAR
            scalar = scalar { scalar = value }
        }

        Value.Type.STR -> when {
            regexIdentifier.matches(value.str) -> expr {
                this.path = path
                kind = Expr.Kind.REF
                ref = ref { ident = value.str }
            }

            Regex("^`.*`$").matches(value.str) -> expr {
                this.path = path
                kind = Expr.Kind.SCALAR
                scalar = scalar {
                    scalar = strValue(value.str.substring(1, value.str.length - 1))
                }
            }

            else -> error("invalid Scalar: ${path.format()}: string literal must be enclosed by '`'")
        }

        Value.Type.OBJ -> when {
            "eval" in value.objMap -> expr {
                this.path = path
                kind = Expr.Kind.EVAL
                eval = eval {
                    eval = parse(path.append("eval"), value.objMap["eval"]!!)

                    if ("where" in value.objMap) {
                        val whereVal = value.objMap["where"]!!
                        if (whereVal.type != Value.Type.ARR) {
                            val p = path.append("where").format()
                            error("invalid Expr: ${p}: where clause must be an array")
                        }
                        for ((i, def) in whereVal.arrList.withIndex()) {
                            if (def.type != Value.Type.OBJ) {
                                val p = path.append("where", i).format()
                                error("invalid definition: ${p}: where clause must contain only objects but got ${def.type}")
                            }
                            val keys = def.objMap.keys
                            if (keys.size != 1) {
                                val p = path.append("where", i).format()
                                error("invalid definition: ${p}: definition must contain one property")
                            }
                            val prop = keys.first()
                            if (!regexFunctionDeclaration.matches(prop)) {
                                val p = path.append("where", i, prop).format()
                                error("invalid definition: ${p}: definition must match ${regexFunctionDeclaration.pattern}")
                            }
                            val idents = prop.replace(regexNonIdentifier, "").split("$").map { "$$it" }
                            where.add(definition {
                                ident = idents[1]
                                args.addAll(idents.drop(2))
                                body = parse(path.append("where", i, prop), def.objMap[prop]!!)
                            })
                        }
                    }
                }
            }

            "obj" in value.objMap -> expr {
                if (value.objMap["obj"]?.type != Value.Type.OBJ) {
                    val p = path.append("obj").format()
                    error("invalid Obj: ${p}: 'obj' property must be an object")
                }
                this.path = path
                kind = Expr.Kind.OBJ
                obj = obj {
                    for ((k, v) in value.objMap["obj"]!!.objMap) {
                        obj.put(k, parse(path.append("obj", k), v))
                    }
                }
            }

            "arr" in value.objMap -> expr {
                if (value.objMap["arr"]?.type != Value.Type.ARR) {
                    val p = path.append("arr").format()
                    error("invalid Arr: ${p}: 'arr' property must be an array")
                }
                this.path = path
                kind = Expr.Kind.ARR
                arr = arr {
                    for ((i, v) in value.objMap["arr"]!!.arrList.withIndex()) {
                        arr.add(parse(path.append("arr", i), v))
                    }
                }
            }

            "json" in value.objMap -> expr {
                if (includesNull(value.objMap["json"]!!)) {
                    val p = path.append("json").format()
                    error("invalid JSON: ${p}: JSON must not contain null")
                }
                this.path = path
                kind = Expr.Kind.JSON
                json = json { json = value.objMap["json"]!! }
            }

            "do" in value.objMap -> expr {
                this.path = path
                kind = Expr.Kind.ITER
                iter = iter {
                    for (prop in value.objMap.keys) {
                        when {
                            prop == "do" -> {
                                do_ = parse(path.append("do"), value.objMap["do"]!!)
                            }

                            prop == "if" -> {
                                if_ = parse(path.append("if"), value.objMap["if"]!!)
                            }

                            regexForVariables.matches(prop) -> {
                                val idents = prop.replace(regexNonIdentifier, "")
                                    .split("$")
                                    .map { "$$it" }
                                posIdent = idents[1]
                                elemIdent = idents[2]
                                col = parse(path.append(prop), value.objMap[prop]!!)
                            }

                            else -> error("invalid Iter: ${path.append("do", prop).format()}: invalid property $prop")
                        }
                    }
                    if (!hasCol()) {
                        error("invalid Iter: ${path.format()}: 'for(...vars...)' property is required")
                    }
                }
            }

            "get" in value.objMap -> expr {
                if (!value.objMap.containsKey("from")) {
                    error("invalid Elem: ${path.format()}: 'from' property is required")
                }
                this.path = path
                kind = Expr.Kind.ELEM
                elem = elem {
                    get = parse(path.append("get"), value.objMap["get"]!!)
                    from = parse(path.append("from"), value.objMap["from"]!!)
                }
            }

            "cases" in value.objMap -> expr {
                if (value.objMap["cases"]?.type != Value.Type.ARR) {
                    val p = path.append("cases").format()
                    error("invalid Cases: ${p}: 'cases' property must be an array")
                }
                this.path = path
                kind = Expr.Kind.CASES
                cases = cases {
                    for ((i, c) in value.objMap["cases"]!!.arrList.withIndex()) {
                        if (c.type != Value.Type.OBJ) {
                            val p = path.append("cases", i).format()
                            error("invalid Case: ${p}: 'cases' property must contain only objects but got ${c.type}")
                        }
                        if ("otherwise" in c.objMap) {
                            cases.add(case {
                                isOtherwise = true
                                otherwise = parse(path.append("cases", i, "otherwise"), c.objMap["otherwise"]!!)
                            })
                        } else {
                            if ("when" !in c.objMap) {
                                val p = path.append("cases", i).format()
                                error("invalid Case: ${p}: 'when' property is required")
                            }
                            if ("then" !in c.objMap) {
                                val p = path.append("cases", i).format()
                                error("invalid Case: ${p}: 'then' property is required")
                            }
                            cases.add(case {
                                when_ = parse(path.append("cases", i, "when"), c.objMap["when"]!!)
                                then = parse(path.append("cases", i, "then"), c.objMap["then"]!!)
                            })
                        }
                    }
                }
            }

            else -> parseOpOrCall(value, path)

        }

        else -> error("invalid Expr: ${path.format()}: one of string, number, boolean, or object required but got ${value.type}")
    }

    private fun parseOpOrCall(value: Value, path: Path): Expr {
        if (value.objMap.size != 1) {
            error("invalid Expr: ${path.format()}: operation or function call must contain only one property")
        }
        val prop = value.objMap.keys.first()

        val opu = mapOf(
            "len" to OpUnary.Op.LEN,
            "not" to OpUnary.Op.NOT,
            "flat" to OpUnary.Op.FLAT,
            "floor" to OpUnary.Op.FLOOR,
            "ceil" to OpUnary.Op.CEIL,
            "abort" to OpUnary.Op.ABORT
        )[prop]
        if (opu != null) {
            return expr {
                this.path = path
                kind = Expr.Kind.OP_UNARY
                opUnary = opUnary {
                    op = opu
                    operand = parse(path.append(prop), value.objMap[prop]!!)
                }
            }
        }
        val opb = mapOf(
            "sub" to OpBinary.Op.SUB,
            "div" to OpBinary.Op.DIV,
            "eq" to OpBinary.Op.EQ,
            "neq" to OpBinary.Op.NEQ,
            "lt" to OpBinary.Op.LT,
            "lte" to OpBinary.Op.LTE,
            "gt" to OpBinary.Op.GT,
            "gte" to OpBinary.Op.GTE
        )[prop]
        if (opb != null) {
            if (value.objMap[prop]!!.type != Value.Type.ARR) {
                val p = path.append(prop).format()
                error("invalid OpBinary: ${p}: '$prop' property must be an array")
            }
            if (value.objMap[prop]!!.arrList.size != 2) {
                val p = path.append(prop).format()
                error("invalid OpBinary: ${p}: '$prop' property must contain two elements")
            }
            return expr {
                this.path = path
                kind = Expr.Kind.OP_BINARY
                opBinary = opBinary {
                    op = opb
                    left = parse(path.append(prop, 0), value.objMap[prop]!!.arrList[0])
                    right = parse(path.append(prop, 1), value.objMap[prop]!!.arrList[1])
                }
            }
        }

        val opv = mapOf(
            "add" to opVariadic { op = OpVariadic.Op.ADD },
            "mul" to opVariadic { op = OpVariadic.Op.MUL },
            "and" to opVariadic { op = OpVariadic.Op.AND },
            "or" to opVariadic { op = OpVariadic.Op.OR },
            "cat" to opVariadic { op = OpVariadic.Op.CAT },
            "min" to opVariadic { op = OpVariadic.Op.MIN },
            "max" to opVariadic { op = OpVariadic.Op.MAX },
            "merge" to opVariadic { op = OpVariadic.Op.MERGE }
        )[prop]
        if (opv != null) {
            if (value.objMap[prop]!!.type != Value.Type.ARR) {
                val p = path.append(prop).format()
                error("invalid OpVariadic: ${p}: '$prop' property must be an array")
            }
            if ((prop == "min" || prop == "max") && value.objMap[prop]!!.arrList.isEmpty()) {
                val p = path.append(prop).format()
                error("invalid OpVariadic: ${p}: '$prop' property must contain at least one element")
            }
            return expr {
                this.path = path
                kind = Expr.Kind.OP_VARIADIC
                opVariadic = opVariadic {
                    op = opv.op
                    for ((i, v) in value.objMap[prop]!!.arrList.withIndex()) {
                        operands.add(parse(path.append(prop, i), v))
                    }
                }
            }
        }

        if (!regexIdentifier.matches(prop)) {
            error("invalid Call: ${path.format()}: function call property '$prop' must match '${regexIdentifier.pattern}'")
        }
        val argsVal = value.objMap[prop]!!
        if (argsVal.type != Value.Type.OBJ) {
            error("invalid Call: ${path.append(prop).format()}: arguments must be given as an object")
        }

        return expr {
            this.path = path
            kind = Expr.Kind.CALL
            call = call {
                ident = prop
                for ((k, v) in argsVal.objMap) {
                    if (!regexIdentifier.matches(k)) {
                        val p = path.append(prop, k).format()
                        error("invalid Call: ${p}: argument property '$k' must match '${regexIdentifier.pattern}'")
                    }
                    args.put(k, parse(path.append(prop, k), v))
                }
            }
        }
    }

    private fun includesNull(value: Value): Boolean = when (value.type) {
        Value.Type.NULL -> true
        Value.Type.ARR -> value.arrList.any { includesNull(it) }
        Value.Type.OBJ -> value.objMap.values.any { includesNull(it) }
        else -> false
    }

    companion object {
        private val regexIdentifier = Regex("""^\$[_a-zA-Z][_a-zA-Z0-9]*$""")
        private val regexNonIdentifier = Regex("""[^_a-zA-Z0-9$]""")
        private val regexFunctionDeclaration =
            Regex("""^\$[_a-zA-Z][_a-zA-Z0-9]*(\(\s*\)|\(\s*\$[_a-zA-Z][_a-zA-Z0-9]*(\s*,\s*\$[_a-zA-Z][_a-zA-Z0-9]*)*(\s*,)?\s*\))?$""")
        private val regexForVariables =
            Regex("""^for\(\s*\$[_a-zA-Z][_a-zA-Z0-9]*\s*,\s*\$[_a-zA-Z][_a-zA-Z0-9]*\s*\)$""")

    }
}