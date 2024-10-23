// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: exprml/v1/expr.proto
// Protobuf Java Version: 4.28.2

package jumpaku.exprml.pb.exprml.v1;

/**
 * <pre>
 * Scalar is a Scalar expression.
 * </pre>
 *
 * Protobuf type {@code exprml.v1.Scalar}
 */
public final class Scalar extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:exprml.v1.Scalar)
    ScalarOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      Scalar.class.getName());
  }
  // Use Scalar.newBuilder() to construct.
  private Scalar(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Scalar() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return jumpaku.exprml.pb.exprml.v1.ExprProto.internal_static_exprml_v1_Scalar_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return jumpaku.exprml.pb.exprml.v1.ExprProto.internal_static_exprml_v1_Scalar_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            jumpaku.exprml.pb.exprml.v1.Scalar.class, jumpaku.exprml.pb.exprml.v1.Scalar.Builder.class);
  }

  private int bitField0_;
  public static final int SCALAR_FIELD_NUMBER = 1;
  private jumpaku.exprml.pb.exprml.v1.Value scalar_;
  /**
   * <pre>
   * Scalar is a scalar value.
   * </pre>
   *
   * <code>.exprml.v1.Value scalar = 1 [json_name = "scalar"];</code>
   * @return Whether the scalar field is set.
   */
  @java.lang.Override
  public boolean hasScalar() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Scalar is a scalar value.
   * </pre>
   *
   * <code>.exprml.v1.Value scalar = 1 [json_name = "scalar"];</code>
   * @return The scalar.
   */
  @java.lang.Override
  public jumpaku.exprml.pb.exprml.v1.Value getScalar() {
    return scalar_ == null ? jumpaku.exprml.pb.exprml.v1.Value.getDefaultInstance() : scalar_;
  }
  /**
   * <pre>
   * Scalar is a scalar value.
   * </pre>
   *
   * <code>.exprml.v1.Value scalar = 1 [json_name = "scalar"];</code>
   */
  @java.lang.Override
  public jumpaku.exprml.pb.exprml.v1.ValueOrBuilder getScalarOrBuilder() {
    return scalar_ == null ? jumpaku.exprml.pb.exprml.v1.Value.getDefaultInstance() : scalar_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getScalar());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getScalar());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof jumpaku.exprml.pb.exprml.v1.Scalar)) {
      return super.equals(obj);
    }
    jumpaku.exprml.pb.exprml.v1.Scalar other = (jumpaku.exprml.pb.exprml.v1.Scalar) obj;

    if (hasScalar() != other.hasScalar()) return false;
    if (hasScalar()) {
      if (!getScalar()
          .equals(other.getScalar())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasScalar()) {
      hash = (37 * hash) + SCALAR_FIELD_NUMBER;
      hash = (53 * hash) + getScalar().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static jumpaku.exprml.pb.exprml.v1.Scalar parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static jumpaku.exprml.pb.exprml.v1.Scalar parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static jumpaku.exprml.pb.exprml.v1.Scalar parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static jumpaku.exprml.pb.exprml.v1.Scalar parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static jumpaku.exprml.pb.exprml.v1.Scalar parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static jumpaku.exprml.pb.exprml.v1.Scalar parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static jumpaku.exprml.pb.exprml.v1.Scalar parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static jumpaku.exprml.pb.exprml.v1.Scalar parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static jumpaku.exprml.pb.exprml.v1.Scalar parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static jumpaku.exprml.pb.exprml.v1.Scalar parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static jumpaku.exprml.pb.exprml.v1.Scalar parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static jumpaku.exprml.pb.exprml.v1.Scalar parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(jumpaku.exprml.pb.exprml.v1.Scalar prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Scalar is a Scalar expression.
   * </pre>
   *
   * Protobuf type {@code exprml.v1.Scalar}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:exprml.v1.Scalar)
      jumpaku.exprml.pb.exprml.v1.ScalarOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return jumpaku.exprml.pb.exprml.v1.ExprProto.internal_static_exprml_v1_Scalar_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return jumpaku.exprml.pb.exprml.v1.ExprProto.internal_static_exprml_v1_Scalar_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              jumpaku.exprml.pb.exprml.v1.Scalar.class, jumpaku.exprml.pb.exprml.v1.Scalar.Builder.class);
    }

    // Construct using jumpaku.exprml.pb.exprml.v1.Scalar.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        getScalarFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      scalar_ = null;
      if (scalarBuilder_ != null) {
        scalarBuilder_.dispose();
        scalarBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return jumpaku.exprml.pb.exprml.v1.ExprProto.internal_static_exprml_v1_Scalar_descriptor;
    }

    @java.lang.Override
    public jumpaku.exprml.pb.exprml.v1.Scalar getDefaultInstanceForType() {
      return jumpaku.exprml.pb.exprml.v1.Scalar.getDefaultInstance();
    }

    @java.lang.Override
    public jumpaku.exprml.pb.exprml.v1.Scalar build() {
      jumpaku.exprml.pb.exprml.v1.Scalar result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public jumpaku.exprml.pb.exprml.v1.Scalar buildPartial() {
      jumpaku.exprml.pb.exprml.v1.Scalar result = new jumpaku.exprml.pb.exprml.v1.Scalar(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(jumpaku.exprml.pb.exprml.v1.Scalar result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.scalar_ = scalarBuilder_ == null
            ? scalar_
            : scalarBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof jumpaku.exprml.pb.exprml.v1.Scalar) {
        return mergeFrom((jumpaku.exprml.pb.exprml.v1.Scalar)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(jumpaku.exprml.pb.exprml.v1.Scalar other) {
      if (other == jumpaku.exprml.pb.exprml.v1.Scalar.getDefaultInstance()) return this;
      if (other.hasScalar()) {
        mergeScalar(other.getScalar());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getScalarFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private jumpaku.exprml.pb.exprml.v1.Value scalar_;
    private com.google.protobuf.SingleFieldBuilder<
        jumpaku.exprml.pb.exprml.v1.Value, jumpaku.exprml.pb.exprml.v1.Value.Builder, jumpaku.exprml.pb.exprml.v1.ValueOrBuilder> scalarBuilder_;
    /**
     * <pre>
     * Scalar is a scalar value.
     * </pre>
     *
     * <code>.exprml.v1.Value scalar = 1 [json_name = "scalar"];</code>
     * @return Whether the scalar field is set.
     */
    public boolean hasScalar() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Scalar is a scalar value.
     * </pre>
     *
     * <code>.exprml.v1.Value scalar = 1 [json_name = "scalar"];</code>
     * @return The scalar.
     */
    public jumpaku.exprml.pb.exprml.v1.Value getScalar() {
      if (scalarBuilder_ == null) {
        return scalar_ == null ? jumpaku.exprml.pb.exprml.v1.Value.getDefaultInstance() : scalar_;
      } else {
        return scalarBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Scalar is a scalar value.
     * </pre>
     *
     * <code>.exprml.v1.Value scalar = 1 [json_name = "scalar"];</code>
     */
    public Builder setScalar(jumpaku.exprml.pb.exprml.v1.Value value) {
      if (scalarBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        scalar_ = value;
      } else {
        scalarBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Scalar is a scalar value.
     * </pre>
     *
     * <code>.exprml.v1.Value scalar = 1 [json_name = "scalar"];</code>
     */
    public Builder setScalar(
        jumpaku.exprml.pb.exprml.v1.Value.Builder builderForValue) {
      if (scalarBuilder_ == null) {
        scalar_ = builderForValue.build();
      } else {
        scalarBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Scalar is a scalar value.
     * </pre>
     *
     * <code>.exprml.v1.Value scalar = 1 [json_name = "scalar"];</code>
     */
    public Builder mergeScalar(jumpaku.exprml.pb.exprml.v1.Value value) {
      if (scalarBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          scalar_ != null &&
          scalar_ != jumpaku.exprml.pb.exprml.v1.Value.getDefaultInstance()) {
          getScalarBuilder().mergeFrom(value);
        } else {
          scalar_ = value;
        }
      } else {
        scalarBuilder_.mergeFrom(value);
      }
      if (scalar_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Scalar is a scalar value.
     * </pre>
     *
     * <code>.exprml.v1.Value scalar = 1 [json_name = "scalar"];</code>
     */
    public Builder clearScalar() {
      bitField0_ = (bitField0_ & ~0x00000001);
      scalar_ = null;
      if (scalarBuilder_ != null) {
        scalarBuilder_.dispose();
        scalarBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Scalar is a scalar value.
     * </pre>
     *
     * <code>.exprml.v1.Value scalar = 1 [json_name = "scalar"];</code>
     */
    public jumpaku.exprml.pb.exprml.v1.Value.Builder getScalarBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getScalarFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Scalar is a scalar value.
     * </pre>
     *
     * <code>.exprml.v1.Value scalar = 1 [json_name = "scalar"];</code>
     */
    public jumpaku.exprml.pb.exprml.v1.ValueOrBuilder getScalarOrBuilder() {
      if (scalarBuilder_ != null) {
        return scalarBuilder_.getMessageOrBuilder();
      } else {
        return scalar_ == null ?
            jumpaku.exprml.pb.exprml.v1.Value.getDefaultInstance() : scalar_;
      }
    }
    /**
     * <pre>
     * Scalar is a scalar value.
     * </pre>
     *
     * <code>.exprml.v1.Value scalar = 1 [json_name = "scalar"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        jumpaku.exprml.pb.exprml.v1.Value, jumpaku.exprml.pb.exprml.v1.Value.Builder, jumpaku.exprml.pb.exprml.v1.ValueOrBuilder> 
        getScalarFieldBuilder() {
      if (scalarBuilder_ == null) {
        scalarBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            jumpaku.exprml.pb.exprml.v1.Value, jumpaku.exprml.pb.exprml.v1.Value.Builder, jumpaku.exprml.pb.exprml.v1.ValueOrBuilder>(
                getScalar(),
                getParentForChildren(),
                isClean());
        scalar_ = null;
      }
      return scalarBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:exprml.v1.Scalar)
  }

  // @@protoc_insertion_point(class_scope:exprml.v1.Scalar)
  private static final jumpaku.exprml.pb.exprml.v1.Scalar DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new jumpaku.exprml.pb.exprml.v1.Scalar();
  }

  public static jumpaku.exprml.pb.exprml.v1.Scalar getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Scalar>
      PARSER = new com.google.protobuf.AbstractParser<Scalar>() {
    @java.lang.Override
    public Scalar parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Scalar> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Scalar> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public jumpaku.exprml.pb.exprml.v1.Scalar getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

