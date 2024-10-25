// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: exprml/v1/parser.proto
// Protobuf Java Version: 4.28.2

package net.jumpaku.exprml.pb.exprml.v1;

public interface ParseOutputOrBuilder extends
    // @@protoc_insertion_point(interface_extends:exprml.v1.ParseOutput)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Whether an error occurred during parsing.
   * </pre>
   *
   * <code>bool is_error = 1 [json_name = "isError"];</code>
   * @return The isError.
   */
  boolean getIsError();

  /**
   * <pre>
   * Error message if is_error is true.
   * </pre>
   *
   * <code>string error_message = 2 [json_name = "errorMessage"];</code>
   * @return The errorMessage.
   */
  java.lang.String getErrorMessage();
  /**
   * <pre>
   * Error message if is_error is true.
   * </pre>
   *
   * <code>string error_message = 2 [json_name = "errorMessage"];</code>
   * @return The bytes for errorMessage.
   */
  com.google.protobuf.ByteString
      getErrorMessageBytes();

  /**
   * <pre>
   * Parsed Expr.
   * </pre>
   *
   * <code>.exprml.v1.Expr expr = 3 [json_name = "expr"];</code>
   * @return Whether the expr field is set.
   */
  boolean hasExpr();
  /**
   * <pre>
   * Parsed Expr.
   * </pre>
   *
   * <code>.exprml.v1.Expr expr = 3 [json_name = "expr"];</code>
   * @return The expr.
   */
  net.jumpaku.exprml.pb.exprml.v1.Expr getExpr();
  /**
   * <pre>
   * Parsed Expr.
   * </pre>
   *
   * <code>.exprml.v1.Expr expr = 3 [json_name = "expr"];</code>
   */
  net.jumpaku.exprml.pb.exprml.v1.ExprOrBuilder getExprOrBuilder();
}
