// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: exprml/v1/decoder.proto
// Protobuf Java Version: 4.28.2

package jumpaku.exprml.pb.exprml.v1;

public final class DecoderProto {
  private DecoderProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      DecoderProto.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_exprml_v1_DecodeInput_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_exprml_v1_DecodeInput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_exprml_v1_DecodeOutput_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_exprml_v1_DecodeOutput_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027exprml/v1/decoder.proto\022\texprml.v1\032\025ex" +
      "prml/v1/value.proto\"!\n\013DecodeInput\022\022\n\004ya" +
      "ml\030\001 \001(\tR\004yaml\"v\n\014DecodeOutput\022\031\n\010is_err" +
      "or\030\001 \001(\010R\007isError\022#\n\rerror_message\030\002 \001(\t" +
      "R\014errorMessage\022&\n\005value\030\003 \001(\0132\020.exprml.v" +
      "1.ValueR\005value2F\n\007Decoder\022;\n\006Decode\022\026.ex" +
      "prml.v1.DecodeInput\032\027.exprml.v1.DecodeOu" +
      "tput\"\000Bp\n\033jumpaku.exprml.pb.exprml.v1B\014D" +
      "ecoderProtoP\001\242\002\003EXX\252\002\tExprml.V1\312\002\tExprml" +
      "\\V1\342\002\025Exprml\\V1\\GPBMetadata\352\002\nExprml::V1" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          jumpaku.exprml.pb.exprml.v1.ValueProto.getDescriptor(),
        });
    internal_static_exprml_v1_DecodeInput_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_exprml_v1_DecodeInput_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_exprml_v1_DecodeInput_descriptor,
        new java.lang.String[] { "Yaml", });
    internal_static_exprml_v1_DecodeOutput_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_exprml_v1_DecodeOutput_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_exprml_v1_DecodeOutput_descriptor,
        new java.lang.String[] { "IsError", "ErrorMessage", "Value", });
    descriptor.resolveAllFeaturesImmutable();
    jumpaku.exprml.pb.exprml.v1.ValueProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
