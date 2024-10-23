// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: exprml/v1/expr.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package jumpaku.exprml.pb.exprml.v1;

@kotlin.jvm.JvmName("-initializeexpr")
public inline fun expr(block: jumpaku.exprml.pb.exprml.v1.ExprKt.Dsl.() -> kotlin.Unit): jumpaku.exprml.pb.exprml.v1.Expr =
  jumpaku.exprml.pb.exprml.v1.ExprKt.Dsl._create(jumpaku.exprml.pb.exprml.v1.Expr.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `exprml.v1.Expr`
 */
public object ExprKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: jumpaku.exprml.pb.exprml.v1.Expr.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: jumpaku.exprml.pb.exprml.v1.Expr.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): jumpaku.exprml.pb.exprml.v1.Expr = _builder.build()

    /**
     * ```
     * Path is the path to the Node.
     * ```
     *
     * `.exprml.v1.Expr.Path path = 1 [json_name = "path"];`
     */
    public var path: jumpaku.exprml.pb.exprml.v1.Expr.Path
      @JvmName("getPath")
      get() = _builder.path
      @JvmName("setPath")
      set(value) {
        _builder.path = value
      }
    /**
     * ```
     * Path is the path to the Node.
     * ```
     *
     * `.exprml.v1.Expr.Path path = 1 [json_name = "path"];`
     */
    public fun clearPath() {
      _builder.clearPath()
    }
    /**
     * ```
     * Path is the path to the Node.
     * ```
     *
     * `.exprml.v1.Expr.Path path = 1 [json_name = "path"];`
     * @return Whether the path field is set.
     */
    public fun hasPath(): kotlin.Boolean {
      return _builder.hasPath()
    }
    public val ExprKt.Dsl.pathOrNull: jumpaku.exprml.pb.exprml.v1.Expr.Path?
      get() = _builder.pathOrNull

    /**
     * ```
     * Value is the JSON value of the Node.
     * ```
     *
     * `.exprml.v1.Value value = 2 [json_name = "value"];`
     */
    public var value: jumpaku.exprml.pb.exprml.v1.Value
      @JvmName("getValue")
      get() = _builder.value
      @JvmName("setValue")
      set(value) {
        _builder.value = value
      }
    /**
     * ```
     * Value is the JSON value of the Node.
     * ```
     *
     * `.exprml.v1.Value value = 2 [json_name = "value"];`
     */
    public fun clearValue() {
      _builder.clearValue()
    }
    /**
     * ```
     * Value is the JSON value of the Node.
     * ```
     *
     * `.exprml.v1.Value value = 2 [json_name = "value"];`
     * @return Whether the value field is set.
     */
    public fun hasValue(): kotlin.Boolean {
      return _builder.hasValue()
    }
    public val ExprKt.Dsl.valueOrNull: jumpaku.exprml.pb.exprml.v1.Value?
      get() = _builder.valueOrNull

    /**
     * ```
     * Kind is the kind of the Expr.
     * ```
     *
     * `.exprml.v1.Expr.Kind kind = 3 [json_name = "kind"];`
     */
    public var kind: jumpaku.exprml.pb.exprml.v1.Expr.Kind
      @JvmName("getKind")
      get() = _builder.kind
      @JvmName("setKind")
      set(value) {
        _builder.kind = value
      }
    public var kindValue: kotlin.Int
      @JvmName("getKindValue")
      get() = _builder.kindValue
      @JvmName("setKindValue")
      set(value) {
        _builder.kindValue = value
      }
    /**
     * ```
     * Kind is the kind of the Expr.
     * ```
     *
     * `.exprml.v1.Expr.Kind kind = 3 [json_name = "kind"];`
     */
    public fun clearKind() {
      _builder.clearKind()
    }

    /**
     * ```
     * Eval is an Eval Expr.
     * ```
     *
     * `.exprml.v1.Eval eval = 10 [json_name = "eval"];`
     */
    public var eval: jumpaku.exprml.pb.exprml.v1.Eval
      @JvmName("getEval")
      get() = _builder.eval
      @JvmName("setEval")
      set(value) {
        _builder.eval = value
      }
    /**
     * ```
     * Eval is an Eval Expr.
     * ```
     *
     * `.exprml.v1.Eval eval = 10 [json_name = "eval"];`
     */
    public fun clearEval() {
      _builder.clearEval()
    }
    /**
     * ```
     * Eval is an Eval Expr.
     * ```
     *
     * `.exprml.v1.Eval eval = 10 [json_name = "eval"];`
     * @return Whether the eval field is set.
     */
    public fun hasEval(): kotlin.Boolean {
      return _builder.hasEval()
    }
    public val ExprKt.Dsl.evalOrNull: jumpaku.exprml.pb.exprml.v1.Eval?
      get() = _builder.evalOrNull

    /**
     * ```
     * Scalar is a Scalar Expr.
     * ```
     *
     * `.exprml.v1.Scalar scalar = 11 [json_name = "scalar"];`
     */
    public var scalar: jumpaku.exprml.pb.exprml.v1.Scalar
      @JvmName("getScalar")
      get() = _builder.scalar
      @JvmName("setScalar")
      set(value) {
        _builder.scalar = value
      }
    /**
     * ```
     * Scalar is a Scalar Expr.
     * ```
     *
     * `.exprml.v1.Scalar scalar = 11 [json_name = "scalar"];`
     */
    public fun clearScalar() {
      _builder.clearScalar()
    }
    /**
     * ```
     * Scalar is a Scalar Expr.
     * ```
     *
     * `.exprml.v1.Scalar scalar = 11 [json_name = "scalar"];`
     * @return Whether the scalar field is set.
     */
    public fun hasScalar(): kotlin.Boolean {
      return _builder.hasScalar()
    }
    public val ExprKt.Dsl.scalarOrNull: jumpaku.exprml.pb.exprml.v1.Scalar?
      get() = _builder.scalarOrNull

    /**
     * ```
     * Ref is a Ref Expr.
     * ```
     *
     * `.exprml.v1.Ref ref = 12 [json_name = "ref"];`
     */
    public var ref: jumpaku.exprml.pb.exprml.v1.Ref
      @JvmName("getRef")
      get() = _builder.ref
      @JvmName("setRef")
      set(value) {
        _builder.ref = value
      }
    /**
     * ```
     * Ref is a Ref Expr.
     * ```
     *
     * `.exprml.v1.Ref ref = 12 [json_name = "ref"];`
     */
    public fun clearRef() {
      _builder.clearRef()
    }
    /**
     * ```
     * Ref is a Ref Expr.
     * ```
     *
     * `.exprml.v1.Ref ref = 12 [json_name = "ref"];`
     * @return Whether the ref field is set.
     */
    public fun hasRef(): kotlin.Boolean {
      return _builder.hasRef()
    }
    public val ExprKt.Dsl.refOrNull: jumpaku.exprml.pb.exprml.v1.Ref?
      get() = _builder.refOrNull

    /**
     * ```
     * Obj is an Obj Expr.
     * ```
     *
     * `.exprml.v1.Obj obj = 13 [json_name = "obj"];`
     */
    public var obj: jumpaku.exprml.pb.exprml.v1.Obj
      @JvmName("getObj")
      get() = _builder.obj
      @JvmName("setObj")
      set(value) {
        _builder.obj = value
      }
    /**
     * ```
     * Obj is an Obj Expr.
     * ```
     *
     * `.exprml.v1.Obj obj = 13 [json_name = "obj"];`
     */
    public fun clearObj() {
      _builder.clearObj()
    }
    /**
     * ```
     * Obj is an Obj Expr.
     * ```
     *
     * `.exprml.v1.Obj obj = 13 [json_name = "obj"];`
     * @return Whether the obj field is set.
     */
    public fun hasObj(): kotlin.Boolean {
      return _builder.hasObj()
    }
    public val ExprKt.Dsl.objOrNull: jumpaku.exprml.pb.exprml.v1.Obj?
      get() = _builder.objOrNull

    /**
     * ```
     * Arr is an Arr Expr.
     * ```
     *
     * `.exprml.v1.Arr arr = 14 [json_name = "arr"];`
     */
    public var arr: jumpaku.exprml.pb.exprml.v1.Arr
      @JvmName("getArr")
      get() = _builder.arr
      @JvmName("setArr")
      set(value) {
        _builder.arr = value
      }
    /**
     * ```
     * Arr is an Arr Expr.
     * ```
     *
     * `.exprml.v1.Arr arr = 14 [json_name = "arr"];`
     */
    public fun clearArr() {
      _builder.clearArr()
    }
    /**
     * ```
     * Arr is an Arr Expr.
     * ```
     *
     * `.exprml.v1.Arr arr = 14 [json_name = "arr"];`
     * @return Whether the arr field is set.
     */
    public fun hasArr(): kotlin.Boolean {
      return _builder.hasArr()
    }
    public val ExprKt.Dsl.arrOrNull: jumpaku.exprml.pb.exprml.v1.Arr?
      get() = _builder.arrOrNull

    /**
     * ```
     * Json is a Json Expr.
     * ```
     *
     * `.exprml.v1.Json json = 15 [json_name = "json"];`
     */
    public var json: jumpaku.exprml.pb.exprml.v1.Json
      @JvmName("getJson")
      get() = _builder.json
      @JvmName("setJson")
      set(value) {
        _builder.json = value
      }
    /**
     * ```
     * Json is a Json Expr.
     * ```
     *
     * `.exprml.v1.Json json = 15 [json_name = "json"];`
     */
    public fun clearJson() {
      _builder.clearJson()
    }
    /**
     * ```
     * Json is a Json Expr.
     * ```
     *
     * `.exprml.v1.Json json = 15 [json_name = "json"];`
     * @return Whether the json field is set.
     */
    public fun hasJson(): kotlin.Boolean {
      return _builder.hasJson()
    }
    public val ExprKt.Dsl.jsonOrNull: jumpaku.exprml.pb.exprml.v1.Json?
      get() = _builder.jsonOrNull

    /**
     * ```
     * Iter is an Iter Expr.
     * ```
     *
     * `.exprml.v1.Iter iter = 16 [json_name = "iter"];`
     */
    public var iter: jumpaku.exprml.pb.exprml.v1.Iter
      @JvmName("getIter")
      get() = _builder.iter
      @JvmName("setIter")
      set(value) {
        _builder.iter = value
      }
    /**
     * ```
     * Iter is an Iter Expr.
     * ```
     *
     * `.exprml.v1.Iter iter = 16 [json_name = "iter"];`
     */
    public fun clearIter() {
      _builder.clearIter()
    }
    /**
     * ```
     * Iter is an Iter Expr.
     * ```
     *
     * `.exprml.v1.Iter iter = 16 [json_name = "iter"];`
     * @return Whether the iter field is set.
     */
    public fun hasIter(): kotlin.Boolean {
      return _builder.hasIter()
    }
    public val ExprKt.Dsl.iterOrNull: jumpaku.exprml.pb.exprml.v1.Iter?
      get() = _builder.iterOrNull

    /**
     * ```
     * Elem is an Elem Expr.
     * ```
     *
     * `.exprml.v1.Elem elem = 17 [json_name = "elem"];`
     */
    public var elem: jumpaku.exprml.pb.exprml.v1.Elem
      @JvmName("getElem")
      get() = _builder.elem
      @JvmName("setElem")
      set(value) {
        _builder.elem = value
      }
    /**
     * ```
     * Elem is an Elem Expr.
     * ```
     *
     * `.exprml.v1.Elem elem = 17 [json_name = "elem"];`
     */
    public fun clearElem() {
      _builder.clearElem()
    }
    /**
     * ```
     * Elem is an Elem Expr.
     * ```
     *
     * `.exprml.v1.Elem elem = 17 [json_name = "elem"];`
     * @return Whether the elem field is set.
     */
    public fun hasElem(): kotlin.Boolean {
      return _builder.hasElem()
    }
    public val ExprKt.Dsl.elemOrNull: jumpaku.exprml.pb.exprml.v1.Elem?
      get() = _builder.elemOrNull

    /**
     * ```
     * Call is a Call Expr.
     * ```
     *
     * `.exprml.v1.Call call = 18 [json_name = "call"];`
     */
    public var call: jumpaku.exprml.pb.exprml.v1.Call
      @JvmName("getCall")
      get() = _builder.call
      @JvmName("setCall")
      set(value) {
        _builder.call = value
      }
    /**
     * ```
     * Call is a Call Expr.
     * ```
     *
     * `.exprml.v1.Call call = 18 [json_name = "call"];`
     */
    public fun clearCall() {
      _builder.clearCall()
    }
    /**
     * ```
     * Call is a Call Expr.
     * ```
     *
     * `.exprml.v1.Call call = 18 [json_name = "call"];`
     * @return Whether the call field is set.
     */
    public fun hasCall(): kotlin.Boolean {
      return _builder.hasCall()
    }
    public val ExprKt.Dsl.callOrNull: jumpaku.exprml.pb.exprml.v1.Call?
      get() = _builder.callOrNull

    /**
     * ```
     * Cases is a Cases Expr.
     * ```
     *
     * `.exprml.v1.Cases cases = 19 [json_name = "cases"];`
     */
    public var cases: jumpaku.exprml.pb.exprml.v1.Cases
      @JvmName("getCases")
      get() = _builder.cases
      @JvmName("setCases")
      set(value) {
        _builder.cases = value
      }
    /**
     * ```
     * Cases is a Cases Expr.
     * ```
     *
     * `.exprml.v1.Cases cases = 19 [json_name = "cases"];`
     */
    public fun clearCases() {
      _builder.clearCases()
    }
    /**
     * ```
     * Cases is a Cases Expr.
     * ```
     *
     * `.exprml.v1.Cases cases = 19 [json_name = "cases"];`
     * @return Whether the cases field is set.
     */
    public fun hasCases(): kotlin.Boolean {
      return _builder.hasCases()
    }
    public val ExprKt.Dsl.casesOrNull: jumpaku.exprml.pb.exprml.v1.Cases?
      get() = _builder.casesOrNull

    /**
     * ```
     * OpUnary is an OpUnary Expr.
     * ```
     *
     * `.exprml.v1.OpUnary op_unary = 20 [json_name = "opUnary"];`
     */
    public var opUnary: jumpaku.exprml.pb.exprml.v1.OpUnary
      @JvmName("getOpUnary")
      get() = _builder.opUnary
      @JvmName("setOpUnary")
      set(value) {
        _builder.opUnary = value
      }
    /**
     * ```
     * OpUnary is an OpUnary Expr.
     * ```
     *
     * `.exprml.v1.OpUnary op_unary = 20 [json_name = "opUnary"];`
     */
    public fun clearOpUnary() {
      _builder.clearOpUnary()
    }
    /**
     * ```
     * OpUnary is an OpUnary Expr.
     * ```
     *
     * `.exprml.v1.OpUnary op_unary = 20 [json_name = "opUnary"];`
     * @return Whether the opUnary field is set.
     */
    public fun hasOpUnary(): kotlin.Boolean {
      return _builder.hasOpUnary()
    }
    public val ExprKt.Dsl.opUnaryOrNull: jumpaku.exprml.pb.exprml.v1.OpUnary?
      get() = _builder.opUnaryOrNull

    /**
     * ```
     * OpBinary is an OpBinary Expr.
     * ```
     *
     * `.exprml.v1.OpBinary op_binary = 21 [json_name = "opBinary"];`
     */
    public var opBinary: jumpaku.exprml.pb.exprml.v1.OpBinary
      @JvmName("getOpBinary")
      get() = _builder.opBinary
      @JvmName("setOpBinary")
      set(value) {
        _builder.opBinary = value
      }
    /**
     * ```
     * OpBinary is an OpBinary Expr.
     * ```
     *
     * `.exprml.v1.OpBinary op_binary = 21 [json_name = "opBinary"];`
     */
    public fun clearOpBinary() {
      _builder.clearOpBinary()
    }
    /**
     * ```
     * OpBinary is an OpBinary Expr.
     * ```
     *
     * `.exprml.v1.OpBinary op_binary = 21 [json_name = "opBinary"];`
     * @return Whether the opBinary field is set.
     */
    public fun hasOpBinary(): kotlin.Boolean {
      return _builder.hasOpBinary()
    }
    public val ExprKt.Dsl.opBinaryOrNull: jumpaku.exprml.pb.exprml.v1.OpBinary?
      get() = _builder.opBinaryOrNull

    /**
     * ```
     * OpVariadic is an OpVariadic Expr.
     * ```
     *
     * `.exprml.v1.OpVariadic op_variadic = 22 [json_name = "opVariadic"];`
     */
    public var opVariadic: jumpaku.exprml.pb.exprml.v1.OpVariadic
      @JvmName("getOpVariadic")
      get() = _builder.opVariadic
      @JvmName("setOpVariadic")
      set(value) {
        _builder.opVariadic = value
      }
    /**
     * ```
     * OpVariadic is an OpVariadic Expr.
     * ```
     *
     * `.exprml.v1.OpVariadic op_variadic = 22 [json_name = "opVariadic"];`
     */
    public fun clearOpVariadic() {
      _builder.clearOpVariadic()
    }
    /**
     * ```
     * OpVariadic is an OpVariadic Expr.
     * ```
     *
     * `.exprml.v1.OpVariadic op_variadic = 22 [json_name = "opVariadic"];`
     * @return Whether the opVariadic field is set.
     */
    public fun hasOpVariadic(): kotlin.Boolean {
      return _builder.hasOpVariadic()
    }
    public val ExprKt.Dsl.opVariadicOrNull: jumpaku.exprml.pb.exprml.v1.OpVariadic?
      get() = _builder.opVariadicOrNull
  }
  @kotlin.jvm.JvmName("-initializepath")
  public inline fun path(block: jumpaku.exprml.pb.exprml.v1.ExprKt.PathKt.Dsl.() -> kotlin.Unit): jumpaku.exprml.pb.exprml.v1.Expr.Path =
    jumpaku.exprml.pb.exprml.v1.ExprKt.PathKt.Dsl._create(jumpaku.exprml.pb.exprml.v1.Expr.Path.newBuilder()).apply { block() }._build()
  /**
   * ```
   * Path represents a path to the Node.
   * ```
   *
   * Protobuf type `exprml.v1.Expr.Path`
   */
  public object PathKt {
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
      private val _builder: jumpaku.exprml.pb.exprml.v1.Expr.Path.Builder
    ) {
      public companion object {
        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _create(builder: jumpaku.exprml.pb.exprml.v1.Expr.Path.Builder): Dsl = Dsl(builder)
      }

      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _build(): jumpaku.exprml.pb.exprml.v1.Expr.Path = _builder.build()

      /**
       * An uninstantiable, behaviorless type to represent the field in
       * generics.
       */
      @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
      public class PosProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
      /**
       * ```
       * Pos is a position in the path.
       * ```
       *
       * `repeated .exprml.v1.Expr.Path.Pos pos = 1 [json_name = "pos"];`
       */
       public val pos: com.google.protobuf.kotlin.DslList<jumpaku.exprml.pb.exprml.v1.Expr.Path.Pos, PosProxy>
        @kotlin.jvm.JvmSynthetic
        get() = com.google.protobuf.kotlin.DslList(
          _builder.posList
        )
      /**
       * ```
       * Pos is a position in the path.
       * ```
       *
       * `repeated .exprml.v1.Expr.Path.Pos pos = 1 [json_name = "pos"];`
       * @param value The pos to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("addPos")
      public fun com.google.protobuf.kotlin.DslList<jumpaku.exprml.pb.exprml.v1.Expr.Path.Pos, PosProxy>.add(value: jumpaku.exprml.pb.exprml.v1.Expr.Path.Pos) {
        _builder.addPos(value)
      }
      /**
       * ```
       * Pos is a position in the path.
       * ```
       *
       * `repeated .exprml.v1.Expr.Path.Pos pos = 1 [json_name = "pos"];`
       * @param value The pos to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("plusAssignPos")
      @Suppress("NOTHING_TO_INLINE")
      public inline operator fun com.google.protobuf.kotlin.DslList<jumpaku.exprml.pb.exprml.v1.Expr.Path.Pos, PosProxy>.plusAssign(value: jumpaku.exprml.pb.exprml.v1.Expr.Path.Pos) {
        add(value)
      }
      /**
       * ```
       * Pos is a position in the path.
       * ```
       *
       * `repeated .exprml.v1.Expr.Path.Pos pos = 1 [json_name = "pos"];`
       * @param values The pos to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("addAllPos")
      public fun com.google.protobuf.kotlin.DslList<jumpaku.exprml.pb.exprml.v1.Expr.Path.Pos, PosProxy>.addAll(values: kotlin.collections.Iterable<jumpaku.exprml.pb.exprml.v1.Expr.Path.Pos>) {
        _builder.addAllPos(values)
      }
      /**
       * ```
       * Pos is a position in the path.
       * ```
       *
       * `repeated .exprml.v1.Expr.Path.Pos pos = 1 [json_name = "pos"];`
       * @param values The pos to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("plusAssignAllPos")
      @Suppress("NOTHING_TO_INLINE")
      public inline operator fun com.google.protobuf.kotlin.DslList<jumpaku.exprml.pb.exprml.v1.Expr.Path.Pos, PosProxy>.plusAssign(values: kotlin.collections.Iterable<jumpaku.exprml.pb.exprml.v1.Expr.Path.Pos>) {
        addAll(values)
      }
      /**
       * ```
       * Pos is a position in the path.
       * ```
       *
       * `repeated .exprml.v1.Expr.Path.Pos pos = 1 [json_name = "pos"];`
       * @param index The index to set the value at.
       * @param value The pos to set.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("setPos")
      public operator fun com.google.protobuf.kotlin.DslList<jumpaku.exprml.pb.exprml.v1.Expr.Path.Pos, PosProxy>.set(index: kotlin.Int, value: jumpaku.exprml.pb.exprml.v1.Expr.Path.Pos) {
        _builder.setPos(index, value)
      }
      /**
       * ```
       * Pos is a position in the path.
       * ```
       *
       * `repeated .exprml.v1.Expr.Path.Pos pos = 1 [json_name = "pos"];`
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("clearPos")
      public fun com.google.protobuf.kotlin.DslList<jumpaku.exprml.pb.exprml.v1.Expr.Path.Pos, PosProxy>.clear() {
        _builder.clearPos()
      }

    }
    @kotlin.jvm.JvmName("-initializepos")
    public inline fun pos(block: jumpaku.exprml.pb.exprml.v1.ExprKt.PathKt.PosKt.Dsl.() -> kotlin.Unit): jumpaku.exprml.pb.exprml.v1.Expr.Path.Pos =
      jumpaku.exprml.pb.exprml.v1.ExprKt.PathKt.PosKt.Dsl._create(jumpaku.exprml.pb.exprml.v1.Expr.Path.Pos.newBuilder()).apply { block() }._build()
    /**
     * ```
     * Pos represents a position in the path.
     * ```
     *
     * Protobuf type `exprml.v1.Expr.Path.Pos`
     */
    public object PosKt {
      @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
      @com.google.protobuf.kotlin.ProtoDslMarker
      public class Dsl private constructor(
        private val _builder: jumpaku.exprml.pb.exprml.v1.Expr.Path.Pos.Builder
      ) {
        public companion object {
          @kotlin.jvm.JvmSynthetic
          @kotlin.PublishedApi
          internal fun _create(builder: jumpaku.exprml.pb.exprml.v1.Expr.Path.Pos.Builder): Dsl = Dsl(builder)
        }

        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _build(): jumpaku.exprml.pb.exprml.v1.Expr.Path.Pos = _builder.build()

        /**
         * ```
         * Index is the index of the position.
         * ```
         *
         * `int64 index = 1 [json_name = "index"];`
         */
        public var index: kotlin.Long
          @JvmName("getIndex")
          get() = _builder.index
          @JvmName("setIndex")
          set(value) {
            _builder.index = value
          }
        /**
         * ```
         * Index is the index of the position.
         * ```
         *
         * `int64 index = 1 [json_name = "index"];`
         */
        public fun clearIndex() {
          _builder.clearIndex()
        }

        /**
         * ```
         * Key is the key of the position.
         * ```
         *
         * `string key = 2 [json_name = "key"];`
         */
        public var key: kotlin.String
          @JvmName("getKey")
          get() = _builder.key
          @JvmName("setKey")
          set(value) {
            _builder.key = value
          }
        /**
         * ```
         * Key is the key of the position.
         * ```
         *
         * `string key = 2 [json_name = "key"];`
         */
        public fun clearKey() {
          _builder.clearKey()
        }
      }
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun jumpaku.exprml.pb.exprml.v1.Expr.copy(block: `jumpaku.exprml.pb.exprml.v1`.ExprKt.Dsl.() -> kotlin.Unit): jumpaku.exprml.pb.exprml.v1.Expr =
  `jumpaku.exprml.pb.exprml.v1`.ExprKt.Dsl._create(this.toBuilder()).apply { block() }._build()

@kotlin.jvm.JvmSynthetic
public inline fun jumpaku.exprml.pb.exprml.v1.Expr.Path.copy(block: `jumpaku.exprml.pb.exprml.v1`.ExprKt.PathKt.Dsl.() -> kotlin.Unit): jumpaku.exprml.pb.exprml.v1.Expr.Path =
  `jumpaku.exprml.pb.exprml.v1`.ExprKt.PathKt.Dsl._create(this.toBuilder()).apply { block() }._build()

@kotlin.jvm.JvmSynthetic
public inline fun jumpaku.exprml.pb.exprml.v1.Expr.Path.Pos.copy(block: `jumpaku.exprml.pb.exprml.v1`.ExprKt.PathKt.PosKt.Dsl.() -> kotlin.Unit): jumpaku.exprml.pb.exprml.v1.Expr.Path.Pos =
  `jumpaku.exprml.pb.exprml.v1`.ExprKt.PathKt.PosKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val jumpaku.exprml.pb.exprml.v1.ExprOrBuilder.pathOrNull: jumpaku.exprml.pb.exprml.v1.Expr.Path?
  get() = if (hasPath()) getPath() else null

public val jumpaku.exprml.pb.exprml.v1.ExprOrBuilder.valueOrNull: jumpaku.exprml.pb.exprml.v1.Value?
  get() = if (hasValue()) getValue() else null

public val jumpaku.exprml.pb.exprml.v1.ExprOrBuilder.evalOrNull: jumpaku.exprml.pb.exprml.v1.Eval?
  get() = if (hasEval()) getEval() else null

public val jumpaku.exprml.pb.exprml.v1.ExprOrBuilder.scalarOrNull: jumpaku.exprml.pb.exprml.v1.Scalar?
  get() = if (hasScalar()) getScalar() else null

public val jumpaku.exprml.pb.exprml.v1.ExprOrBuilder.refOrNull: jumpaku.exprml.pb.exprml.v1.Ref?
  get() = if (hasRef()) getRef() else null

public val jumpaku.exprml.pb.exprml.v1.ExprOrBuilder.objOrNull: jumpaku.exprml.pb.exprml.v1.Obj?
  get() = if (hasObj()) getObj() else null

public val jumpaku.exprml.pb.exprml.v1.ExprOrBuilder.arrOrNull: jumpaku.exprml.pb.exprml.v1.Arr?
  get() = if (hasArr()) getArr() else null

public val jumpaku.exprml.pb.exprml.v1.ExprOrBuilder.jsonOrNull: jumpaku.exprml.pb.exprml.v1.Json?
  get() = if (hasJson()) getJson() else null

public val jumpaku.exprml.pb.exprml.v1.ExprOrBuilder.iterOrNull: jumpaku.exprml.pb.exprml.v1.Iter?
  get() = if (hasIter()) getIter() else null

public val jumpaku.exprml.pb.exprml.v1.ExprOrBuilder.elemOrNull: jumpaku.exprml.pb.exprml.v1.Elem?
  get() = if (hasElem()) getElem() else null

public val jumpaku.exprml.pb.exprml.v1.ExprOrBuilder.callOrNull: jumpaku.exprml.pb.exprml.v1.Call?
  get() = if (hasCall()) getCall() else null

public val jumpaku.exprml.pb.exprml.v1.ExprOrBuilder.casesOrNull: jumpaku.exprml.pb.exprml.v1.Cases?
  get() = if (hasCases()) getCases() else null

public val jumpaku.exprml.pb.exprml.v1.ExprOrBuilder.opUnaryOrNull: jumpaku.exprml.pb.exprml.v1.OpUnary?
  get() = if (hasOpUnary()) getOpUnary() else null

public val jumpaku.exprml.pb.exprml.v1.ExprOrBuilder.opBinaryOrNull: jumpaku.exprml.pb.exprml.v1.OpBinary?
  get() = if (hasOpBinary()) getOpBinary() else null

public val jumpaku.exprml.pb.exprml.v1.ExprOrBuilder.opVariadicOrNull: jumpaku.exprml.pb.exprml.v1.OpVariadic?
  get() = if (hasOpVariadic()) getOpVariadic() else null

