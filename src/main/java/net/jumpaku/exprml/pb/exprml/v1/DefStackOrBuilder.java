// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: exprml/v1/evaluator.proto
// Protobuf Java Version: 4.28.2

package net.jumpaku.exprml.pb.exprml.v1;

public interface DefStackOrBuilder extends
    // @@protoc_insertion_point(interface_extends:exprml.v1.DefStack)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Parent definition list.
   * </pre>
   *
   * <code>.exprml.v1.DefStack parent = 1 [json_name = "parent"];</code>
   * @return Whether the parent field is set.
   */
  boolean hasParent();
  /**
   * <pre>
   * Parent definition list.
   * </pre>
   *
   * <code>.exprml.v1.DefStack parent = 1 [json_name = "parent"];</code>
   * @return The parent.
   */
  net.jumpaku.exprml.pb.exprml.v1.DefStack getParent();
  /**
   * <pre>
   * Parent definition list.
   * </pre>
   *
   * <code>.exprml.v1.DefStack parent = 1 [json_name = "parent"];</code>
   */
  net.jumpaku.exprml.pb.exprml.v1.DefStackOrBuilder getParentOrBuilder();

  /**
   * <pre>
   * Definition.
   * </pre>
   *
   * <code>.exprml.v1.Eval.Definition def = 2 [json_name = "def"];</code>
   * @return Whether the def field is set.
   */
  boolean hasDef();
  /**
   * <pre>
   * Definition.
   * </pre>
   *
   * <code>.exprml.v1.Eval.Definition def = 2 [json_name = "def"];</code>
   * @return The def.
   */
  net.jumpaku.exprml.pb.exprml.v1.Eval.Definition getDef();
  /**
   * <pre>
   * Definition.
   * </pre>
   *
   * <code>.exprml.v1.Eval.Definition def = 2 [json_name = "def"];</code>
   */
  net.jumpaku.exprml.pb.exprml.v1.Eval.DefinitionOrBuilder getDefOrBuilder();
}
