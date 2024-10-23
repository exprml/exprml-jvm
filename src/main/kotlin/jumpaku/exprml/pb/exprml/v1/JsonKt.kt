// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: exprml/v1/expr.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package jumpaku.exprml.pb.exprml.v1;

@kotlin.jvm.JvmName("-initializejson")
public inline fun json(block: jumpaku.exprml.pb.exprml.v1.JsonKt.Dsl.() -> kotlin.Unit): jumpaku.exprml.pb.exprml.v1.Json =
  jumpaku.exprml.pb.exprml.v1.JsonKt.Dsl._create(jumpaku.exprml.pb.exprml.v1.Json.newBuilder()).apply { block() }._build()
/**
 * ```
 * Json is a Json expression.
 * ```
 *
 * Protobuf type `exprml.v1.Json`
 */
public object JsonKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: jumpaku.exprml.pb.exprml.v1.Json.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: jumpaku.exprml.pb.exprml.v1.Json.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): jumpaku.exprml.pb.exprml.v1.Json = _builder.build()

    /**
     * ```
     * Json is a JSON value.
     * ```
     *
     * `.exprml.v1.Value json = 1 [json_name = "json"];`
     */
    public var json: jumpaku.exprml.pb.exprml.v1.Value
      @JvmName("getJson")
      get() = _builder.json
      @JvmName("setJson")
      set(value) {
        _builder.json = value
      }
    /**
     * ```
     * Json is a JSON value.
     * ```
     *
     * `.exprml.v1.Value json = 1 [json_name = "json"];`
     */
    public fun clearJson() {
      _builder.clearJson()
    }
    /**
     * ```
     * Json is a JSON value.
     * ```
     *
     * `.exprml.v1.Value json = 1 [json_name = "json"];`
     * @return Whether the json field is set.
     */
    public fun hasJson(): kotlin.Boolean {
      return _builder.hasJson()
    }
    public val JsonKt.Dsl.jsonOrNull: jumpaku.exprml.pb.exprml.v1.Value?
      get() = _builder.jsonOrNull
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun jumpaku.exprml.pb.exprml.v1.Json.copy(block: `jumpaku.exprml.pb.exprml.v1`.JsonKt.Dsl.() -> kotlin.Unit): jumpaku.exprml.pb.exprml.v1.Json =
  `jumpaku.exprml.pb.exprml.v1`.JsonKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val jumpaku.exprml.pb.exprml.v1.JsonOrBuilder.jsonOrNull: jumpaku.exprml.pb.exprml.v1.Value?
  get() = if (hasJson()) getJson() else null
