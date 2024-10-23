// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: exprml/v1/expr.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package jumpaku.exprml.pb.exprml.v1;

@kotlin.jvm.JvmName("-initializeopUnary")
public inline fun opUnary(block: jumpaku.exprml.pb.exprml.v1.OpUnaryKt.Dsl.() -> kotlin.Unit): jumpaku.exprml.pb.exprml.v1.OpUnary =
  jumpaku.exprml.pb.exprml.v1.OpUnaryKt.Dsl._create(jumpaku.exprml.pb.exprml.v1.OpUnary.newBuilder()).apply { block() }._build()
/**
 * ```
 * OpUnary is an OpUnary expression.
 * ```
 *
 * Protobuf type `exprml.v1.OpUnary`
 */
public object OpUnaryKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: jumpaku.exprml.pb.exprml.v1.OpUnary.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: jumpaku.exprml.pb.exprml.v1.OpUnary.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): jumpaku.exprml.pb.exprml.v1.OpUnary = _builder.build()

    /**
     * ```
     * Op is the operator.
     * ```
     *
     * `.exprml.v1.OpUnary.Op op = 1 [json_name = "op"];`
     */
    public var op: jumpaku.exprml.pb.exprml.v1.OpUnary.Op
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
     * `.exprml.v1.OpUnary.Op op = 1 [json_name = "op"];`
     */
    public fun clearOp() {
      _builder.clearOp()
    }

    /**
     * ```
     * Operand is the operand.
     * ```
     *
     * `.exprml.v1.Expr operand = 2 [json_name = "operand"];`
     */
    public var operand: jumpaku.exprml.pb.exprml.v1.Expr
      @JvmName("getOperand")
      get() = _builder.operand
      @JvmName("setOperand")
      set(value) {
        _builder.operand = value
      }
    /**
     * ```
     * Operand is the operand.
     * ```
     *
     * `.exprml.v1.Expr operand = 2 [json_name = "operand"];`
     */
    public fun clearOperand() {
      _builder.clearOperand()
    }
    /**
     * ```
     * Operand is the operand.
     * ```
     *
     * `.exprml.v1.Expr operand = 2 [json_name = "operand"];`
     * @return Whether the operand field is set.
     */
    public fun hasOperand(): kotlin.Boolean {
      return _builder.hasOperand()
    }
    public val OpUnaryKt.Dsl.operandOrNull: jumpaku.exprml.pb.exprml.v1.Expr?
      get() = _builder.operandOrNull
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun jumpaku.exprml.pb.exprml.v1.OpUnary.copy(block: `jumpaku.exprml.pb.exprml.v1`.OpUnaryKt.Dsl.() -> kotlin.Unit): jumpaku.exprml.pb.exprml.v1.OpUnary =
  `jumpaku.exprml.pb.exprml.v1`.OpUnaryKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val jumpaku.exprml.pb.exprml.v1.OpUnaryOrBuilder.operandOrNull: jumpaku.exprml.pb.exprml.v1.Expr?
  get() = if (hasOperand()) getOperand() else null

