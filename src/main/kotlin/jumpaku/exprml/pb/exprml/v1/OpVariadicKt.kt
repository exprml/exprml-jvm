// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: exprml/v1/expr.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package jumpaku.exprml.pb.exprml.v1;

@kotlin.jvm.JvmName("-initializeopVariadic")
public inline fun opVariadic(block: jumpaku.exprml.pb.exprml.v1.OpVariadicKt.Dsl.() -> kotlin.Unit): jumpaku.exprml.pb.exprml.v1.OpVariadic =
  jumpaku.exprml.pb.exprml.v1.OpVariadicKt.Dsl._create(jumpaku.exprml.pb.exprml.v1.OpVariadic.newBuilder()).apply { block() }._build()
/**
 * ```
 * OpVariadic is an OpVariadic expression.
 * ```
 *
 * Protobuf type `exprml.v1.OpVariadic`
 */
public object OpVariadicKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: jumpaku.exprml.pb.exprml.v1.OpVariadic.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: jumpaku.exprml.pb.exprml.v1.OpVariadic.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): jumpaku.exprml.pb.exprml.v1.OpVariadic = _builder.build()

    /**
     * ```
     * Op is the operator.
     * ```
     *
     * `.exprml.v1.OpVariadic.Op op = 1 [json_name = "op"];`
     */
    public var op: jumpaku.exprml.pb.exprml.v1.OpVariadic.Op
      @JvmName("getOp")
      get() = _builder.op
      @JvmName("setOp")
      set(value) {
        _builder.op = value
      }
    public var opValue: kotlin.Int
      @JvmName("getOpValue")
      get() = _builder.opValue
      @JvmName("setOpValue")
      set(value) {
        _builder.opValue = value
      }
    /**
     * ```
     * Op is the operator.
     * ```
     *
     * `.exprml.v1.OpVariadic.Op op = 1 [json_name = "op"];`
     */
    public fun clearOp() {
      _builder.clearOp()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class OperandsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * ```
     * Operands is the list of operands.
     * ```
     *
     * `repeated .exprml.v1.Expr operands = 2 [json_name = "operands"];`
     */
     public val operands: com.google.protobuf.kotlin.DslList<jumpaku.exprml.pb.exprml.v1.Expr, OperandsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.operandsList
      )
    /**
     * ```
     * Operands is the list of operands.
     * ```
     *
     * `repeated .exprml.v1.Expr operands = 2 [json_name = "operands"];`
     * @param value The operands to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addOperands")
    public fun com.google.protobuf.kotlin.DslList<jumpaku.exprml.pb.exprml.v1.Expr, OperandsProxy>.add(value: jumpaku.exprml.pb.exprml.v1.Expr) {
      _builder.addOperands(value)
    }
    /**
     * ```
     * Operands is the list of operands.
     * ```
     *
     * `repeated .exprml.v1.Expr operands = 2 [json_name = "operands"];`
     * @param value The operands to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignOperands")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<jumpaku.exprml.pb.exprml.v1.Expr, OperandsProxy>.plusAssign(value: jumpaku.exprml.pb.exprml.v1.Expr) {
      add(value)
    }
    /**
     * ```
     * Operands is the list of operands.
     * ```
     *
     * `repeated .exprml.v1.Expr operands = 2 [json_name = "operands"];`
     * @param values The operands to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllOperands")
    public fun com.google.protobuf.kotlin.DslList<jumpaku.exprml.pb.exprml.v1.Expr, OperandsProxy>.addAll(values: kotlin.collections.Iterable<jumpaku.exprml.pb.exprml.v1.Expr>) {
      _builder.addAllOperands(values)
    }
    /**
     * ```
     * Operands is the list of operands.
     * ```
     *
     * `repeated .exprml.v1.Expr operands = 2 [json_name = "operands"];`
     * @param values The operands to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllOperands")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<jumpaku.exprml.pb.exprml.v1.Expr, OperandsProxy>.plusAssign(values: kotlin.collections.Iterable<jumpaku.exprml.pb.exprml.v1.Expr>) {
      addAll(values)
    }
    /**
     * ```
     * Operands is the list of operands.
     * ```
     *
     * `repeated .exprml.v1.Expr operands = 2 [json_name = "operands"];`
     * @param index The index to set the value at.
     * @param value The operands to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setOperands")
    public operator fun com.google.protobuf.kotlin.DslList<jumpaku.exprml.pb.exprml.v1.Expr, OperandsProxy>.set(index: kotlin.Int, value: jumpaku.exprml.pb.exprml.v1.Expr) {
      _builder.setOperands(index, value)
    }
    /**
     * ```
     * Operands is the list of operands.
     * ```
     *
     * `repeated .exprml.v1.Expr operands = 2 [json_name = "operands"];`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearOperands")
    public fun com.google.protobuf.kotlin.DslList<jumpaku.exprml.pb.exprml.v1.Expr, OperandsProxy>.clear() {
      _builder.clearOperands()
    }

  }
}
@kotlin.jvm.JvmSynthetic
public inline fun jumpaku.exprml.pb.exprml.v1.OpVariadic.copy(block: `jumpaku.exprml.pb.exprml.v1`.OpVariadicKt.Dsl.() -> kotlin.Unit): jumpaku.exprml.pb.exprml.v1.OpVariadic =
  `jumpaku.exprml.pb.exprml.v1`.OpVariadicKt.Dsl._create(this.toBuilder()).apply { block() }._build()

