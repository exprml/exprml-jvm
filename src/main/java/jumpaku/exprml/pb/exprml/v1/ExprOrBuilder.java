// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: exprml/v1/expr.proto
// Protobuf Java Version: 4.28.2

package jumpaku.exprml.pb.exprml.v1;

public interface ExprOrBuilder extends
    // @@protoc_insertion_point(interface_extends:exprml.v1.Expr)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Path is the path to the Node.
   * </pre>
   *
   * <code>.exprml.v1.Expr.Path path = 1 [json_name = "path"];</code>
   * @return Whether the path field is set.
   */
  boolean hasPath();
  /**
   * <pre>
   * Path is the path to the Node.
   * </pre>
   *
   * <code>.exprml.v1.Expr.Path path = 1 [json_name = "path"];</code>
   * @return The path.
   */
  jumpaku.exprml.pb.exprml.v1.Expr.Path getPath();
  /**
   * <pre>
   * Path is the path to the Node.
   * </pre>
   *
   * <code>.exprml.v1.Expr.Path path = 1 [json_name = "path"];</code>
   */
  jumpaku.exprml.pb.exprml.v1.Expr.PathOrBuilder getPathOrBuilder();

  /**
   * <pre>
   * Value is the JSON value of the Node.
   * </pre>
   *
   * <code>.exprml.v1.Value value = 2 [json_name = "value"];</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <pre>
   * Value is the JSON value of the Node.
   * </pre>
   *
   * <code>.exprml.v1.Value value = 2 [json_name = "value"];</code>
   * @return The value.
   */
  jumpaku.exprml.pb.exprml.v1.Value getValue();
  /**
   * <pre>
   * Value is the JSON value of the Node.
   * </pre>
   *
   * <code>.exprml.v1.Value value = 2 [json_name = "value"];</code>
   */
  jumpaku.exprml.pb.exprml.v1.ValueOrBuilder getValueOrBuilder();

  /**
   * <pre>
   * Kind is the kind of the Expr.
   * </pre>
   *
   * <code>.exprml.v1.Expr.Kind kind = 3 [json_name = "kind"];</code>
   * @return The enum numeric value on the wire for kind.
   */
  int getKindValue();
  /**
   * <pre>
   * Kind is the kind of the Expr.
   * </pre>
   *
   * <code>.exprml.v1.Expr.Kind kind = 3 [json_name = "kind"];</code>
   * @return The kind.
   */
  jumpaku.exprml.pb.exprml.v1.Expr.Kind getKind();

  /**
   * <pre>
   * Eval is an Eval Expr.
   * </pre>
   *
   * <code>.exprml.v1.Eval eval = 10 [json_name = "eval"];</code>
   * @return Whether the eval field is set.
   */
  boolean hasEval();
  /**
   * <pre>
   * Eval is an Eval Expr.
   * </pre>
   *
   * <code>.exprml.v1.Eval eval = 10 [json_name = "eval"];</code>
   * @return The eval.
   */
  jumpaku.exprml.pb.exprml.v1.Eval getEval();
  /**
   * <pre>
   * Eval is an Eval Expr.
   * </pre>
   *
   * <code>.exprml.v1.Eval eval = 10 [json_name = "eval"];</code>
   */
  jumpaku.exprml.pb.exprml.v1.EvalOrBuilder getEvalOrBuilder();

  /**
   * <pre>
   * Scalar is a Scalar Expr.
   * </pre>
   *
   * <code>.exprml.v1.Scalar scalar = 11 [json_name = "scalar"];</code>
   * @return Whether the scalar field is set.
   */
  boolean hasScalar();
  /**
   * <pre>
   * Scalar is a Scalar Expr.
   * </pre>
   *
   * <code>.exprml.v1.Scalar scalar = 11 [json_name = "scalar"];</code>
   * @return The scalar.
   */
  jumpaku.exprml.pb.exprml.v1.Scalar getScalar();
  /**
   * <pre>
   * Scalar is a Scalar Expr.
   * </pre>
   *
   * <code>.exprml.v1.Scalar scalar = 11 [json_name = "scalar"];</code>
   */
  jumpaku.exprml.pb.exprml.v1.ScalarOrBuilder getScalarOrBuilder();

  /**
   * <pre>
   * Ref is a Ref Expr.
   * </pre>
   *
   * <code>.exprml.v1.Ref ref = 12 [json_name = "ref"];</code>
   * @return Whether the ref field is set.
   */
  boolean hasRef();
  /**
   * <pre>
   * Ref is a Ref Expr.
   * </pre>
   *
   * <code>.exprml.v1.Ref ref = 12 [json_name = "ref"];</code>
   * @return The ref.
   */
  jumpaku.exprml.pb.exprml.v1.Ref getRef();
  /**
   * <pre>
   * Ref is a Ref Expr.
   * </pre>
   *
   * <code>.exprml.v1.Ref ref = 12 [json_name = "ref"];</code>
   */
  jumpaku.exprml.pb.exprml.v1.RefOrBuilder getRefOrBuilder();

  /**
   * <pre>
   * Obj is an Obj Expr.
   * </pre>
   *
   * <code>.exprml.v1.Obj obj = 13 [json_name = "obj"];</code>
   * @return Whether the obj field is set.
   */
  boolean hasObj();
  /**
   * <pre>
   * Obj is an Obj Expr.
   * </pre>
   *
   * <code>.exprml.v1.Obj obj = 13 [json_name = "obj"];</code>
   * @return The obj.
   */
  jumpaku.exprml.pb.exprml.v1.Obj getObj();
  /**
   * <pre>
   * Obj is an Obj Expr.
   * </pre>
   *
   * <code>.exprml.v1.Obj obj = 13 [json_name = "obj"];</code>
   */
  jumpaku.exprml.pb.exprml.v1.ObjOrBuilder getObjOrBuilder();

  /**
   * <pre>
   * Arr is an Arr Expr.
   * </pre>
   *
   * <code>.exprml.v1.Arr arr = 14 [json_name = "arr"];</code>
   * @return Whether the arr field is set.
   */
  boolean hasArr();
  /**
   * <pre>
   * Arr is an Arr Expr.
   * </pre>
   *
   * <code>.exprml.v1.Arr arr = 14 [json_name = "arr"];</code>
   * @return The arr.
   */
  jumpaku.exprml.pb.exprml.v1.Arr getArr();
  /**
   * <pre>
   * Arr is an Arr Expr.
   * </pre>
   *
   * <code>.exprml.v1.Arr arr = 14 [json_name = "arr"];</code>
   */
  jumpaku.exprml.pb.exprml.v1.ArrOrBuilder getArrOrBuilder();

  /**
   * <pre>
   * Json is a Json Expr.
   * </pre>
   *
   * <code>.exprml.v1.Json json = 15 [json_name = "json"];</code>
   * @return Whether the json field is set.
   */
  boolean hasJson();
  /**
   * <pre>
   * Json is a Json Expr.
   * </pre>
   *
   * <code>.exprml.v1.Json json = 15 [json_name = "json"];</code>
   * @return The json.
   */
  jumpaku.exprml.pb.exprml.v1.Json getJson();
  /**
   * <pre>
   * Json is a Json Expr.
   * </pre>
   *
   * <code>.exprml.v1.Json json = 15 [json_name = "json"];</code>
   */
  jumpaku.exprml.pb.exprml.v1.JsonOrBuilder getJsonOrBuilder();

  /**
   * <pre>
   * Iter is an Iter Expr.
   * </pre>
   *
   * <code>.exprml.v1.Iter iter = 16 [json_name = "iter"];</code>
   * @return Whether the iter field is set.
   */
  boolean hasIter();
  /**
   * <pre>
   * Iter is an Iter Expr.
   * </pre>
   *
   * <code>.exprml.v1.Iter iter = 16 [json_name = "iter"];</code>
   * @return The iter.
   */
  jumpaku.exprml.pb.exprml.v1.Iter getIter();
  /**
   * <pre>
   * Iter is an Iter Expr.
   * </pre>
   *
   * <code>.exprml.v1.Iter iter = 16 [json_name = "iter"];</code>
   */
  jumpaku.exprml.pb.exprml.v1.IterOrBuilder getIterOrBuilder();

  /**
   * <pre>
   * Elem is an Elem Expr.
   * </pre>
   *
   * <code>.exprml.v1.Elem elem = 17 [json_name = "elem"];</code>
   * @return Whether the elem field is set.
   */
  boolean hasElem();
  /**
   * <pre>
   * Elem is an Elem Expr.
   * </pre>
   *
   * <code>.exprml.v1.Elem elem = 17 [json_name = "elem"];</code>
   * @return The elem.
   */
  jumpaku.exprml.pb.exprml.v1.Elem getElem();
  /**
   * <pre>
   * Elem is an Elem Expr.
   * </pre>
   *
   * <code>.exprml.v1.Elem elem = 17 [json_name = "elem"];</code>
   */
  jumpaku.exprml.pb.exprml.v1.ElemOrBuilder getElemOrBuilder();

  /**
   * <pre>
   * Call is a Call Expr.
   * </pre>
   *
   * <code>.exprml.v1.Call call = 18 [json_name = "call"];</code>
   * @return Whether the call field is set.
   */
  boolean hasCall();
  /**
   * <pre>
   * Call is a Call Expr.
   * </pre>
   *
   * <code>.exprml.v1.Call call = 18 [json_name = "call"];</code>
   * @return The call.
   */
  jumpaku.exprml.pb.exprml.v1.Call getCall();
  /**
   * <pre>
   * Call is a Call Expr.
   * </pre>
   *
   * <code>.exprml.v1.Call call = 18 [json_name = "call"];</code>
   */
  jumpaku.exprml.pb.exprml.v1.CallOrBuilder getCallOrBuilder();

  /**
   * <pre>
   * Cases is a Cases Expr.
   * </pre>
   *
   * <code>.exprml.v1.Cases cases = 19 [json_name = "cases"];</code>
   * @return Whether the cases field is set.
   */
  boolean hasCases();
  /**
   * <pre>
   * Cases is a Cases Expr.
   * </pre>
   *
   * <code>.exprml.v1.Cases cases = 19 [json_name = "cases"];</code>
   * @return The cases.
   */
  jumpaku.exprml.pb.exprml.v1.Cases getCases();
  /**
   * <pre>
   * Cases is a Cases Expr.
   * </pre>
   *
   * <code>.exprml.v1.Cases cases = 19 [json_name = "cases"];</code>
   */
  jumpaku.exprml.pb.exprml.v1.CasesOrBuilder getCasesOrBuilder();

  /**
   * <pre>
   * OpUnary is an OpUnary Expr.
   * </pre>
   *
   * <code>.exprml.v1.OpUnary op_unary = 20 [json_name = "opUnary"];</code>
   * @return Whether the opUnary field is set.
   */
  boolean hasOpUnary();
  /**
   * <pre>
   * OpUnary is an OpUnary Expr.
   * </pre>
   *
   * <code>.exprml.v1.OpUnary op_unary = 20 [json_name = "opUnary"];</code>
   * @return The opUnary.
   */
  jumpaku.exprml.pb.exprml.v1.OpUnary getOpUnary();
  /**
   * <pre>
   * OpUnary is an OpUnary Expr.
   * </pre>
   *
   * <code>.exprml.v1.OpUnary op_unary = 20 [json_name = "opUnary"];</code>
   */
  jumpaku.exprml.pb.exprml.v1.OpUnaryOrBuilder getOpUnaryOrBuilder();

  /**
   * <pre>
   * OpBinary is an OpBinary Expr.
   * </pre>
   *
   * <code>.exprml.v1.OpBinary op_binary = 21 [json_name = "opBinary"];</code>
   * @return Whether the opBinary field is set.
   */
  boolean hasOpBinary();
  /**
   * <pre>
   * OpBinary is an OpBinary Expr.
   * </pre>
   *
   * <code>.exprml.v1.OpBinary op_binary = 21 [json_name = "opBinary"];</code>
   * @return The opBinary.
   */
  jumpaku.exprml.pb.exprml.v1.OpBinary getOpBinary();
  /**
   * <pre>
   * OpBinary is an OpBinary Expr.
   * </pre>
   *
   * <code>.exprml.v1.OpBinary op_binary = 21 [json_name = "opBinary"];</code>
   */
  jumpaku.exprml.pb.exprml.v1.OpBinaryOrBuilder getOpBinaryOrBuilder();

  /**
   * <pre>
   * OpVariadic is an OpVariadic Expr.
   * </pre>
   *
   * <code>.exprml.v1.OpVariadic op_variadic = 22 [json_name = "opVariadic"];</code>
   * @return Whether the opVariadic field is set.
   */
  boolean hasOpVariadic();
  /**
   * <pre>
   * OpVariadic is an OpVariadic Expr.
   * </pre>
   *
   * <code>.exprml.v1.OpVariadic op_variadic = 22 [json_name = "opVariadic"];</code>
   * @return The opVariadic.
   */
  jumpaku.exprml.pb.exprml.v1.OpVariadic getOpVariadic();
  /**
   * <pre>
   * OpVariadic is an OpVariadic Expr.
   * </pre>
   *
   * <code>.exprml.v1.OpVariadic op_variadic = 22 [json_name = "opVariadic"];</code>
   */
  jumpaku.exprml.pb.exprml.v1.OpVariadicOrBuilder getOpVariadicOrBuilder();
}
