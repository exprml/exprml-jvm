package jumpaku.exprml

import jumpaku.exprml.pb.exprml.v1.*
import jumpaku.exprml.pb.exprml.v1.EvaluateOutput.Status
import jumpaku.exprml.pb.exprml.v1.Expr.Path

class Evaluator(private val config: Config = Config()) {
    data class Config(
        val extension: Map<String, (path: Path, args: Map<String, Value>) -> EvaluateOutput> = emptyMap(),
        val beforeEvaluate: (input: EvaluateInput) -> Unit = {},
        val afterEvaluate: (input: EvaluateInput, output: EvaluateOutput) -> Unit = { _, _ -> },
    )

    fun evaluateExpr(input: EvaluateInput): EvaluateOutput {

        try {
            config.beforeEvaluate(input)
        } catch (e: Exception) {
            return evaluateOutput {
                status = Status.UNKNOWN_ERROR
                errorPath = input.expr.path
                errorMessage = "BeforeEvaluate failed: ${e.message}"
            }
        }

        val output = when (input.expr.kind) {
            Expr.Kind.EVAL -> evaluateEval(input)
            Expr.Kind.SCALAR -> evaluateScalar(input)
            Expr.Kind.REF -> evaluateRef(input)
            Expr.Kind.OBJ -> evaluateObj(input)
            Expr.Kind.ARR -> evaluateArr(input)
            Expr.Kind.JSON -> evaluateJson(input)
            Expr.Kind.ITER -> evaluateIter(input)
            Expr.Kind.ELEM -> evaluateElem(input)
            Expr.Kind.CALL -> evaluateCall(input)
            Expr.Kind.CASES -> evaluateCases(input)
            Expr.Kind.OP_UNARY -> evaluateOpUnary(input)
            Expr.Kind.OP_BINARY -> evaluateOpBinary(input)
            Expr.Kind.OP_VARIADIC -> evaluateOpVariadic(input)
            else -> error("given expression must be validated")
        }

        try {
            config.afterEvaluate(input, output)
        } catch (e: Exception) {
            return evaluateOutput {
                status = Status.UNKNOWN_ERROR
                errorPath = input.expr.path
                errorMessage = "AfterEvaluate failed: ${e.message}"
            }
        }

        return output
    }

    fun evaluateEval(input: EvaluateInput): EvaluateOutput {
        var st = input.defStack
        val eval = input.expr.eval
        for (def in eval.whereList) {
            st = st.register(def)
        }
        return evaluateExpr(evaluateInput {
            expr = eval.eval
            defStack = st
        })
    }

    fun evaluateScalar(input: EvaluateInput): EvaluateOutput {
        return evaluateOutput { value = input.expr.scalar.scalar }
    }

    fun evaluateRef(input: EvaluateInput): EvaluateOutput {
        val ref = input.expr.ref
        val st = input.defStack.find(ref.ident)
        if (st == null) {
            val ext = config.extension[ref.ident]
                ?: return errorReferenceNotFound(input.expr.path, ref.ident)
            return ext(input.expr.path, emptyMap())
        }

        return evaluateExpr(evaluateInput {
            expr = st.def.body
            defStack = st
        })
    }

    fun evaluateObj(input: EvaluateInput): EvaluateOutput {
        val result = mutableMapOf<String, Value>()
        for ((pos, expr) in input.expr.obj.objMap) {
            val valOutput = evaluateExpr(evaluateInput {
                defStack = input.defStack
                this.expr = expr
            })
            if (valOutput.status != Status.OK) {
                return valOutput
            }
            result[pos] = valOutput.value
        }
        return evaluateOutput { value = objValue(result) }
    }

    fun evaluateArr(input: EvaluateInput): EvaluateOutput {
        val result = mutableListOf<Value>()
        for (expr in input.expr.arr.arrList) {
            val valOutput = evaluateExpr(evaluateInput {
                defStack = input.defStack
                this.expr = expr
            })
            if (valOutput.status != Status.OK) {
                return valOutput
            }
            result.add(valOutput.value)
        }
        return evaluateOutput { value = arrValue(result) }
    }

    fun evaluateJson(input: EvaluateInput): EvaluateOutput {
        return evaluateOutput { value = input.expr.json.json }
    }

    fun evaluateIter(input: EvaluateInput): EvaluateOutput {
        val iter = input.expr.iter
        val forPos = iter.posIdent
        val forElem = iter.elemIdent
        val inVal = evaluateExpr(evaluateInput {
            defStack = input.defStack
            expr = iter.col
        })

        return when (inVal.value.type) {
            Value.Type.STR -> {
                val result = mutableListOf<Value>()
                for ((i, c) in inVal.value.str.withIndex()) {
                    val st = input.defStack
                        .register(newDefinition(input.expr.path, forPos, numValue(i.toDouble())))
                        .register(newDefinition(input.expr.path, forElem, strValue(c.toString())))
                    if (iter.hasIf()) {
                        val ifVal = evaluateExpr(evaluateInput {
                            defStack = st
                            expr = iter.`if`
                        })
                        if (ifVal.status != Status.OK) {
                            return ifVal
                        }
                        if (ifVal.value.type != Value.Type.BOOL) {
                            return errorUnexpectedType(iter.`if`.path, ifVal.value.type, listOf(Value.Type.BOOL))
                        }
                        if (!ifVal.value.bool) {
                            continue
                        }
                    }
                    val v = evaluateExpr(evaluateInput {
                        defStack = st
                        expr = iter.`do`
                    })
                    if (v.status != Status.OK) {
                        return v
                    }
                    result.add(v.value)
                }
                evaluateOutput { value = arrValue(result) }
            }

            Value.Type.ARR -> {
                val result = mutableListOf<Value>()
                for ((i, elemVal) in inVal.value.arrList.withIndex()) {
                    val st = input.defStack
                        .register(newDefinition(input.expr.path, forPos, numValue(i.toDouble())))
                        .register(newDefinition(input.expr.path, forElem, elemVal))
                    if (iter.hasIf()) {
                        val ifVal = evaluateExpr(evaluateInput {
                            defStack = st
                            expr = iter.`if`
                        })
                        if (ifVal.status != Status.OK) {
                            return ifVal
                        }
                        if (ifVal.value.type != Value.Type.BOOL) {
                            return errorUnexpectedType(iter.`if`.path, ifVal.value.type, listOf(Value.Type.BOOL))
                        }
                        if (!ifVal.value.bool) {
                            continue
                        }
                    }
                    val v = evaluateExpr(evaluateInput {
                        defStack = st
                        expr = iter.`do`
                    })
                    if (v.status != Status.OK) {
                        return v
                    }
                    result.add(v.value)
                }
                evaluateOutput { value = arrValue(result) }
            }

            Value.Type.OBJ -> {
                val result = mutableMapOf<String, Value>()
                for (key in inVal.value.objMap.keys.sorted()) {
                    val st = input.defStack
                        .register(newDefinition(input.expr.path, forPos, strValue(key)))
                        .register(newDefinition(input.expr.path, forElem, inVal.value.objMap[key]!!))
                    if (iter.hasIf()) {
                        val ifVal = evaluateExpr(evaluateInput {
                            defStack = st
                            expr = iter.`if`
                        })
                        if (ifVal.status != Status.OK) {
                            return ifVal
                        }
                        if (ifVal.value.type != Value.Type.BOOL) {
                            return errorUnexpectedType(iter.`if`.path, ifVal.value.type, listOf(Value.Type.BOOL))
                        }
                        if (!ifVal.value.bool) {
                            continue
                        }
                    }
                    val v = evaluateExpr(evaluateInput {
                        defStack = st
                        expr = iter.`do`
                    })
                    if (v.status != Status.OK) {
                        return v
                    }
                    result[key] = v.value
                }
                evaluateOutput { value = objValue(result) }
            }

            else -> errorUnexpectedType(
                iter.col.path,
                inVal.value.type,
                listOf(Value.Type.STR, Value.Type.ARR, Value.Type.OBJ)
            )
        }
    }

    fun evaluateElem(input: EvaluateInput): EvaluateOutput {
        val elem = input.expr.elem
        val getVal = evaluateExpr(evaluateInput {
            defStack = input.defStack
            expr = elem.get
        })
        if (getVal.status != Status.OK) {
            return getVal
        }
        val pos = getVal.value
        val fromVal = evaluateExpr(evaluateInput {
            defStack = input.defStack
            expr = elem.from
        })
        if (fromVal.status != Status.OK) {
            return fromVal
        }
        val col = fromVal.value

        return when (col.type) {
            Value.Type.STR -> {
                if (pos.type != Value.Type.NUM) {
                    return errorUnexpectedType(elem.from.path, pos.type, listOf(Value.Type.NUM))
                }
                if (!canInt(pos)) {
                    return errorIndexNotInteger(elem.get.path, pos.num)
                }
                val idx = pos.num.toInt()
                if (idx < 0 || idx >= col.str.length) {
                    return errorIndexOutOfBounds(elem.get.path, pos, 0, col.str.length)
                }
                evaluateOutput { value = strValue(col.str[idx].toString()) }
            }

            Value.Type.ARR -> {
                if (pos.type != Value.Type.NUM) {
                    return errorUnexpectedType(elem.get.path, pos.type, listOf(Value.Type.NUM))
                }
                if (!canInt(pos)) {
                    return errorIndexNotInteger(elem.get.path, pos.num)
                }
                val idx = pos.num.toInt()
                if (idx < 0 || idx >= col.arrList.size) {
                    return errorIndexOutOfBounds(elem.get.path, pos, 0, col.arrList.size)
                }
                evaluateOutput { value = col.arrList[idx] }
            }

            Value.Type.OBJ -> {
                if (pos.type != Value.Type.STR) {
                    return errorUnexpectedType(elem.get.path, pos.type, listOf(Value.Type.STR))
                }
                val key = pos.str
                if (key !in col.objMap) {
                    return errorInvalidKey(elem.get.path, key, col.objMap.keys.sorted())
                }
                evaluateOutput { value = col.objMap[key]!! }
            }

            else -> errorUnexpectedType(
                elem.from.path,
                col.type,
                listOf(Value.Type.STR, Value.Type.ARR, Value.Type.OBJ)
            )
        }
    }

    fun evaluateCall(input: EvaluateInput): EvaluateOutput {
        val call = input.expr.call
        val found = input.defStack.find(call.ident)
        if (found == null) {
            val ext = config.extension[call.ident]
                ?: return errorReferenceNotFound(input.expr.path, call.ident)
            val args = mutableMapOf<String, Value>()
            for ((argName, argExpr) in call.argsMap) {
                val argVal = evaluateExpr(evaluateInput {
                    defStack = input.defStack
                    expr = argExpr
                })
                if (argVal.status != Status.OK) {
                    return argVal
                }
                args[argName] = argVal.value
            }
            return ext(input.expr.path, args)
        }

        val def = found.def
        var st: DefStack = found
        for (argName in def.argsList) {
            val arg = call.argsMap[argName] ?: return errorArgumentMismatch(input.expr.path, argName)
            val argVal = evaluateExpr(evaluateInput {
                defStack = input.defStack
                expr = arg
            })
            if (argVal.status != Status.OK) {
                return argVal
            }
            st = st.register(newDefinition(input.expr.path.append(call.ident, argName), argName, argVal.value))
        }
        return evaluateExpr(evaluateInput {
            defStack = st
            expr = def.body
        })
    }

    fun evaluateCases(input: EvaluateInput): EvaluateOutput {
        val cases = input.expr.cases.casesList
        for (case in cases) {
            if (case.isOtherwise) {
                return evaluateExpr(evaluateInput {
                    defStack = input.defStack
                    expr = case.otherwise
                })
            } else {
                val boolVal = evaluateExpr(evaluateInput {
                    defStack = input.defStack
                    expr = case.`when`
                })
                if (boolVal.status != Status.OK) {
                    return boolVal
                }
                if (boolVal.value.type != Value.Type.BOOL) {
                    return errorUnexpectedType(case.`when`.path, boolVal.value.type, listOf(Value.Type.BOOL))
                }
                if (boolVal.value.bool) {
                    return evaluateExpr(evaluateInput {
                        defStack = input.defStack
                        expr = case.then
                    })
                }
            }
        }
        return errorCasesNotExhaustive(input.expr.path.append("cases"))
    }

    fun evaluateOpUnary(input: EvaluateInput): EvaluateOutput {
        val op = input.expr.opUnary
        val o = evaluateExpr(evaluateInput {
            defStack = input.defStack
            expr = op.operand
        })
        if (o.status != Status.OK) {
            return o
        }
        val operand = o.value
        return when (op.op) {
            OpUnary.Op.LEN -> when (operand.type) {
                Value.Type.STR -> evaluateOutput { value = numValue(operand.str.length.toDouble()) }
                Value.Type.ARR -> evaluateOutput { value = numValue(operand.arrList.size.toDouble()) }
                Value.Type.OBJ -> evaluateOutput { value = numValue(operand.objMap.size.toDouble()) }
                else -> errorUnexpectedType(
                    input.expr.path.append("len"),
                    operand.type,
                    listOf(Value.Type.STR, Value.Type.ARR, Value.Type.OBJ)
                )
            }

            OpUnary.Op.NOT -> {
                if (operand.type != Value.Type.BOOL) {
                    return errorUnexpectedType(input.expr.path.append("not"), operand.type, listOf(Value.Type.BOOL))
                }
                evaluateOutput { value = boolValue(!operand.bool) }
            }

            OpUnary.Op.FLAT -> {
                if (operand.type != Value.Type.ARR) {
                    return errorUnexpectedType(input.expr.path.append("flat"), operand.type, listOf(Value.Type.ARR))
                }
                val v = operand.arrList.flatMap {
                    if (it.type != Value.Type.ARR) {
                        return errorUnexpectedType(input.expr.path.append("flat"), it.type, listOf(Value.Type.ARR))
                    }
                    it.arrList
                }
                evaluateOutput { value = arrValue(v) }
            }

            OpUnary.Op.FLOOR -> {
                if (operand.type != Value.Type.NUM) {
                    return errorUnexpectedType(input.expr.path.append("floor"), operand.type, listOf(Value.Type.NUM))
                }
                evaluateOutput { value = numValue(kotlin.math.floor(operand.num)) }
            }

            OpUnary.Op.CEIL -> {
                if (operand.type != Value.Type.NUM) {
                    return errorUnexpectedType(input.expr.path.append("ceil"), operand.type, listOf(Value.Type.NUM))
                }
                evaluateOutput { value = numValue(kotlin.math.ceil(operand.num)) }
            }

            OpUnary.Op.ABORT -> {
                if (operand.type != Value.Type.STR) {
                    return errorUnexpectedType(input.expr.path.append("abort"), operand.type, listOf(Value.Type.STR))
                }
                evaluateOutput {
                    status = Status.ABORTED
                    errorMessage = operand.str
                }
            }

            else -> error("unexpected unary operator ${op.op}")
        }
    }

    fun evaluateOpBinary(input: EvaluateInput): EvaluateOutput {
        val op = input.expr.opBinary
        val ol = evaluateExpr(evaluateInput {
            defStack = input.defStack
            expr = op.left
        })
        if (ol.status != Status.OK) {
            return ol
        }
        val or = evaluateExpr(evaluateInput {
            defStack = input.defStack
            expr = op.right
        })
        if (or.status != Status.OK) {
            return or
        }
        val operandL = ol.value
        val operandR = or.value

        return when (op.op) {
            OpBinary.Op.SUB -> {
                if (operandL.type != Value.Type.NUM) {
                    return errorUnexpectedType(input.expr.path.append("sub", 0), operandL.type, listOf(Value.Type.NUM))
                }
                if (operandR.type != Value.Type.NUM) {
                    return errorUnexpectedType(input.expr.path.append("sub", 1), operandR.type, listOf(Value.Type.NUM))
                }
                val v = operandL.num - operandR.num
                if (!v.isFinite()) {
                    return errorNotFiniteNumber(input.expr.path)
                }
                evaluateOutput { value = numValue(v) }
            }

            OpBinary.Op.DIV -> {
                if (operandL.type != Value.Type.NUM) {
                    return errorUnexpectedType(input.expr.path.append("div", 0), operandL.type, listOf(Value.Type.NUM))
                }
                if (operandR.type != Value.Type.NUM) {
                    return errorUnexpectedType(input.expr.path.append("div", 1), operandR.type, listOf(Value.Type.NUM))
                }
                val v = operandL.num / operandR.num
                if (!v.isFinite()) {
                    return errorNotFiniteNumber(input.expr.path)
                }
                evaluateOutput { value = numValue(v) }
            }

            OpBinary.Op.EQ -> evaluateOutput { value = equal(operandL, operandR) }
            OpBinary.Op.NEQ -> evaluateOutput { value = boolValue(!equal(operandL, operandR).bool) }
            OpBinary.Op.LT -> {
                val cmpVal = compare(input.expr.path.append("lt"), operandL, operandR)
                if (cmpVal.status != Status.OK) {
                    return cmpVal
                }
                evaluateOutput { value = boolValue(cmpVal.value.num < 0) }
            }

            OpBinary.Op.LTE -> {
                val cmpVal = compare(input.expr.path.append("lte"), operandL, operandR)
                if (cmpVal.status != Status.OK) {
                    return cmpVal
                }
                evaluateOutput { value = boolValue(cmpVal.value.num <= 0) }
            }

            OpBinary.Op.GT -> {
                val cmpVal = compare(input.expr.path.append("gt"), operandL, operandR)
                if (cmpVal.status != Status.OK) {
                    return cmpVal
                }
                evaluateOutput { value = boolValue(cmpVal.value.num > 0) }
            }

            OpBinary.Op.GTE -> {
                val cmpVal = compare(input.expr.path.append("gte"), operandL, operandR)
                if (cmpVal.status != Status.OK) {
                    return cmpVal
                }
                evaluateOutput { value = boolValue(cmpVal.value.num >= 0) }
            }

            else -> error("unexpected binary operator ${op.op}")
        }
    }

    fun evaluateOpVariadic(input: EvaluateInput): EvaluateOutput {
        val op = input.expr.opVariadic
        val operands = mutableListOf<Value>()
        for (elem in op.operandsList) {
            val valOutput = evaluateExpr(evaluateInput {
                defStack = input.defStack
                expr = elem
            })
            if (valOutput.status != Status.OK) {
                return valOutput
            }
            operands.add(valOutput.value)
        }

        return when (op.op) {
            OpVariadic.Op.ADD -> {
                var addVal = 0.0
                for ((i, operand) in operands.withIndex()) {
                    if (operand.type != Value.Type.NUM) {
                        return errorUnexpectedType(
                            input.expr.path.append("add", i),
                            operand.type,
                            listOf(Value.Type.NUM)
                        )
                    }
                    addVal += operand.num
                }
                if (!addVal.isFinite()) {
                    return errorNotFiniteNumber(input.expr.path.append("add"))
                }
                evaluateOutput { value = numValue(addVal) }
            }

            OpVariadic.Op.MUL -> {
                var mulVal = 1.0
                for ((i, operand) in operands.withIndex()) {
                    if (operand.type != Value.Type.NUM) {
                        return errorUnexpectedType(
                            input.expr.path.append("mul", i),
                            operand.type,
                            listOf(Value.Type.NUM)
                        )
                    }
                    mulVal *= operand.num
                }
                if (!mulVal.isFinite()) {
                    return errorNotFiniteNumber(input.expr.path.append("mul"))
                }
                evaluateOutput { value = numValue(mulVal) }
            }

            OpVariadic.Op.AND -> {
                for ((i, operand) in operands.withIndex()) {
                    if (operand.type != Value.Type.BOOL) {
                        return errorUnexpectedType(
                            input.expr.path.append("and", i),
                            operand.type,
                            listOf(Value.Type.BOOL)
                        )
                    }
                    if (!operand.bool) {
                        return evaluateOutput { value = boolValue(false) }
                    }
                }
                evaluateOutput { value = boolValue(true) }
            }

            OpVariadic.Op.OR -> {
                for ((i, operand) in operands.withIndex()) {
                    if (operand.type != Value.Type.BOOL) {
                        return errorUnexpectedType(
                            input.expr.path.append("or", i),
                            operand.type,
                            listOf(Value.Type.BOOL)
                        )
                    }
                    if (operand.bool) {
                        return evaluateOutput { value = boolValue(true) }
                    }
                }
                evaluateOutput { value = boolValue(false) }
            }

            OpVariadic.Op.CAT -> {
                val catVal = StringBuilder()
                for ((i, operand) in operands.withIndex()) {
                    if (operand.type != Value.Type.STR) {
                        return errorUnexpectedType(
                            input.expr.path.append("cat", i),
                            operand.type,
                            listOf(Value.Type.STR)
                        )
                    }
                    catVal.append(operand.str)
                }
                evaluateOutput { value = strValue(catVal.toString()) }
            }

            OpVariadic.Op.MIN -> {
                var minVal = Double.POSITIVE_INFINITY
                for ((i, operand) in operands.withIndex()) {
                    if (operand.type != Value.Type.NUM) {
                        return errorUnexpectedType(
                            input.expr.path.append("min", i),
                            operand.type,
                            listOf(Value.Type.NUM)
                        )
                    }
                    minVal = kotlin.math.min(minVal, operand.num)
                }
                evaluateOutput { value = numValue(minVal) }
            }

            OpVariadic.Op.MAX -> {
                var maxVal = Double.NEGATIVE_INFINITY
                for ((i, operand) in operands.withIndex()) {
                    if (operand.type != Value.Type.NUM) {
                        return errorUnexpectedType(
                            input.expr.path.append("max", i),
                            operand.type,
                            listOf(Value.Type.NUM)
                        )
                    }
                    maxVal = kotlin.math.max(maxVal, operand.num)
                }
                evaluateOutput { value = numValue(maxVal) }
            }

            OpVariadic.Op.MERGE -> {
                val mergeVal = mutableMapOf<String, Value>()
                for ((i, operand) in operands.withIndex()) {
                    if (operand.type != Value.Type.OBJ) {
                        return errorUnexpectedType(
                            input.expr.path.append("merge", i),
                            operand.type,
                            listOf(Value.Type.OBJ)
                        )
                    }
                    mergeVal.putAll(operand.objMap)
                }
                evaluateOutput { value = objValue(mergeVal) }
            }

            else -> error("unexpected variadic operator ${op.op}")
        }
    }

    private fun errorIndexOutOfBounds(path: Path, index: Value, begin: Int, end: Int): EvaluateOutput {
        return evaluateOutput {
            status = Status.INVALID_INDEX
            errorPath = path
            errorMessage = "invalid index: index out of bounds: ${index.num.toLong()} not in [$begin, $end)"
        }
    }

    private fun errorIndexNotInteger(path: Path, index: Double): EvaluateOutput {
        return evaluateOutput {
            status = Status.INVALID_INDEX
            errorPath = path
            errorMessage = "invalid index: non integer index: $index"
        }
    }

    private fun errorInvalidKey(path: Path, key: String, keys: List<String>): EvaluateOutput {
        return evaluateOutput {
            status = Status.INVALID_KEY
            errorPath = path
            errorMessage = "invalid key: \"$key\" not in {${keys.joinToString(",")}}"
        }
    }

    private fun errorUnexpectedType(path: Path, got: Value.Type, want: List<Value.Type>): EvaluateOutput {
        return evaluateOutput {
            val wantStr = want.joinToString(",") { it.name }
            status = Status.UNEXPECTED_TYPE
            errorPath = path
            errorMessage = "unexpected type: got ${got.name}, want {$wantStr}"
        }
    }

    private fun errorArgumentMismatch(path: Path, arg: String): EvaluateOutput {
        return evaluateOutput {
            status = Status.ARGUMENT_MISMATCH
            errorPath = path
            errorMessage = "argument mismatch: argument \"$arg\" required"
        }
    }

    private fun errorReferenceNotFound(path: Path, ref: String): EvaluateOutput {
        return evaluateOutput {
            status = Status.REFERENCE_NOT_FOUND
            errorPath = path
            errorMessage = "reference not found: \"$ref\""
        }
    }

    private fun errorCasesNotExhaustive(path: Path): EvaluateOutput {
        return evaluateOutput {
            status = Status.CASES_NOT_EXHAUSTIVE
            errorPath = path
            errorMessage = "cases not exhaustive"
        }
    }

    private fun errorNotComparable(path: Path): EvaluateOutput {
        return evaluateOutput {
            status = Status.NOT_COMPARABLE
            errorPath = path
            errorMessage = "not comparable"
        }
    }

    private fun errorNotFiniteNumber(path: Path): EvaluateOutput {
        return evaluateOutput {
            status = Status.NOT_FINITE_NUMBER
            errorPath = path
            errorMessage = "not finite number"
        }
    }

    private fun canInt(v: Value): Boolean {
        return v.type == Value.Type.NUM && v.num == v.num.toInt().toDouble()
    }

    private fun equal(l: Value, r: Value): Value {
        val falseValue = boolValue(false)
        val trueValue = boolValue(true)
        return when {
            l.type != r.type -> falseValue
            l.type == Value.Type.NUM -> boolValue(l.num == r.num)
            l.type == Value.Type.BOOL -> boolValue(l.bool == r.bool)
            l.type == Value.Type.STR -> boolValue(l.str == r.str)
            l.type == Value.Type.ARR -> {
                if (l.arrList.size != r.arrList.size) {
                    return falseValue
                }
                for (i in l.arrList.indices) {
                    if (!equal(l.arrList[i], r.arrList[i]).bool) {
                        return falseValue
                    }
                }
                trueValue
            }

            l.type == Value.Type.OBJ -> {
                val lk = l.objMap.keys.sorted()
                val rk = r.objMap.keys.sorted()
                if (lk != rk) {
                    return falseValue
                }
                for (k in lk) {
                    if (!equal(l.objMap[k]!!, r.objMap[k]!!).bool) {
                        return falseValue
                    }
                }
                trueValue
            }

            else -> throw IllegalArgumentException("unexpected type ${l.type}")
        }
    }

    private fun compare(path: Path, l: Value, r: Value): EvaluateOutput {
        val ltValue = evaluateOutput { value = numValue(-1.0) }
        val gtValue = evaluateOutput { value = numValue(1.0) }
        val eqValue = evaluateOutput { value = numValue(0.0) }
        return when {
            l.type != r.type -> errorNotComparable(path)
            l.type == Value.Type.NUM -> when {
                l.num < r.num -> ltValue
                l.num > r.num -> gtValue
                else -> eqValue
            }

            l.type == Value.Type.BOOL -> when {
                !l.bool && r.bool -> ltValue
                l.bool && !r.bool -> gtValue
                else -> eqValue
            }

            l.type == Value.Type.STR -> when {
                l.str < r.str -> ltValue
                l.str > r.str -> gtValue
                else -> eqValue
            }

            l.type == Value.Type.ARR -> {
                val n = minOf(l.arrList.size, r.arrList.size)
                for (i in 0 until n) {
                    val cmp = compare(path, l.arrList[i], r.arrList[i])
                    if (cmp.status != Status.OK) {
                        return cmp
                    }
                    if (cmp.value.num != 0.0) {
                        return cmp
                    }
                }
                when {
                    l.arrList.size < r.arrList.size -> ltValue
                    l.arrList.size > r.arrList.size -> gtValue
                    else -> eqValue
                }
            }

            else -> errorNotComparable(path)
        }
    }
}