// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: exprml/v1/expr.proto
// Protobuf Java Version: 4.28.2

package jumpaku.exprml.pb.exprml.v1;

public interface CallOrBuilder extends
    // @@protoc_insertion_point(interface_extends:exprml.v1.Call)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Ident is the identifier of the call.
   * </pre>
   *
   * <code>string ident = 1 [json_name = "ident"];</code>
   * @return The ident.
   */
  java.lang.String getIdent();
  /**
   * <pre>
   * Ident is the identifier of the call.
   * </pre>
   *
   * <code>string ident = 1 [json_name = "ident"];</code>
   * @return The bytes for ident.
   */
  com.google.protobuf.ByteString
      getIdentBytes();

  /**
   * <pre>
   * Args is the list of arguments.
   * </pre>
   *
   * <code>map&lt;string, .exprml.v1.Expr&gt; args = 2 [json_name = "args"];</code>
   */
  int getArgsCount();
  /**
   * <pre>
   * Args is the list of arguments.
   * </pre>
   *
   * <code>map&lt;string, .exprml.v1.Expr&gt; args = 2 [json_name = "args"];</code>
   */
  boolean containsArgs(
      java.lang.String key);
  /**
   * Use {@link #getArgsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, jumpaku.exprml.pb.exprml.v1.Expr>
  getArgs();
  /**
   * <pre>
   * Args is the list of arguments.
   * </pre>
   *
   * <code>map&lt;string, .exprml.v1.Expr&gt; args = 2 [json_name = "args"];</code>
   */
  java.util.Map<java.lang.String, jumpaku.exprml.pb.exprml.v1.Expr>
  getArgsMap();
  /**
   * <pre>
   * Args is the list of arguments.
   * </pre>
   *
   * <code>map&lt;string, .exprml.v1.Expr&gt; args = 2 [json_name = "args"];</code>
   */
  /* nullable */
jumpaku.exprml.pb.exprml.v1.Expr getArgsOrDefault(
      java.lang.String key,
      /* nullable */
jumpaku.exprml.pb.exprml.v1.Expr defaultValue);
  /**
   * <pre>
   * Args is the list of arguments.
   * </pre>
   *
   * <code>map&lt;string, .exprml.v1.Expr&gt; args = 2 [json_name = "args"];</code>
   */
  jumpaku.exprml.pb.exprml.v1.Expr getArgsOrThrow(
      java.lang.String key);
}
