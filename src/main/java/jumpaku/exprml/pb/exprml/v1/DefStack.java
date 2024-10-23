// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: exprml/v1/evaluator.proto
// Protobuf Java Version: 4.28.2

package jumpaku.exprml.pb.exprml.v1;

/**
 * <pre>
 * FunDefList is a list of function definitions.
 * </pre>
 *
 * Protobuf type {@code exprml.v1.DefStack}
 */
public final class DefStack extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:exprml.v1.DefStack)
    DefStackOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      DefStack.class.getName());
  }
  // Use DefStack.newBuilder() to construct.
  private DefStack(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private DefStack() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return jumpaku.exprml.pb.exprml.v1.EvaluatorProto.internal_static_exprml_v1_DefStack_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return jumpaku.exprml.pb.exprml.v1.EvaluatorProto.internal_static_exprml_v1_DefStack_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            jumpaku.exprml.pb.exprml.v1.DefStack.class, jumpaku.exprml.pb.exprml.v1.DefStack.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;
  private jumpaku.exprml.pb.exprml.v1.DefStack parent_;
  /**
   * <pre>
   * Parent definition list.
   * </pre>
   *
   * <code>.exprml.v1.DefStack parent = 1 [json_name = "parent"];</code>
   * @return Whether the parent field is set.
   */
  @java.lang.Override
  public boolean hasParent() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Parent definition list.
   * </pre>
   *
   * <code>.exprml.v1.DefStack parent = 1 [json_name = "parent"];</code>
   * @return The parent.
   */
  @java.lang.Override
  public jumpaku.exprml.pb.exprml.v1.DefStack getParent() {
    return parent_ == null ? jumpaku.exprml.pb.exprml.v1.DefStack.getDefaultInstance() : parent_;
  }
  /**
   * <pre>
   * Parent definition list.
   * </pre>
   *
   * <code>.exprml.v1.DefStack parent = 1 [json_name = "parent"];</code>
   */
  @java.lang.Override
  public jumpaku.exprml.pb.exprml.v1.DefStackOrBuilder getParentOrBuilder() {
    return parent_ == null ? jumpaku.exprml.pb.exprml.v1.DefStack.getDefaultInstance() : parent_;
  }

  public static final int DEF_FIELD_NUMBER = 2;
  private jumpaku.exprml.pb.exprml.v1.Eval.Definition def_;
  /**
   * <pre>
   * Definition.
   * </pre>
   *
   * <code>.exprml.v1.Eval.Definition def = 2 [json_name = "def"];</code>
   * @return Whether the def field is set.
   */
  @java.lang.Override
  public boolean hasDef() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Definition.
   * </pre>
   *
   * <code>.exprml.v1.Eval.Definition def = 2 [json_name = "def"];</code>
   * @return The def.
   */
  @java.lang.Override
  public jumpaku.exprml.pb.exprml.v1.Eval.Definition getDef() {
    return def_ == null ? jumpaku.exprml.pb.exprml.v1.Eval.Definition.getDefaultInstance() : def_;
  }
  /**
   * <pre>
   * Definition.
   * </pre>
   *
   * <code>.exprml.v1.Eval.Definition def = 2 [json_name = "def"];</code>
   */
  @java.lang.Override
  public jumpaku.exprml.pb.exprml.v1.Eval.DefinitionOrBuilder getDefOrBuilder() {
    return def_ == null ? jumpaku.exprml.pb.exprml.v1.Eval.Definition.getDefaultInstance() : def_;
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
      output.writeMessage(1, getParent());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getDef());
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
        .computeMessageSize(1, getParent());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDef());
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
    if (!(obj instanceof jumpaku.exprml.pb.exprml.v1.DefStack)) {
      return super.equals(obj);
    }
    jumpaku.exprml.pb.exprml.v1.DefStack other = (jumpaku.exprml.pb.exprml.v1.DefStack) obj;

    if (hasParent() != other.hasParent()) return false;
    if (hasParent()) {
      if (!getParent()
          .equals(other.getParent())) return false;
    }
    if (hasDef() != other.hasDef()) return false;
    if (hasDef()) {
      if (!getDef()
          .equals(other.getDef())) return false;
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
    if (hasParent()) {
      hash = (37 * hash) + PARENT_FIELD_NUMBER;
      hash = (53 * hash) + getParent().hashCode();
    }
    if (hasDef()) {
      hash = (37 * hash) + DEF_FIELD_NUMBER;
      hash = (53 * hash) + getDef().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static jumpaku.exprml.pb.exprml.v1.DefStack parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static jumpaku.exprml.pb.exprml.v1.DefStack parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static jumpaku.exprml.pb.exprml.v1.DefStack parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static jumpaku.exprml.pb.exprml.v1.DefStack parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static jumpaku.exprml.pb.exprml.v1.DefStack parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static jumpaku.exprml.pb.exprml.v1.DefStack parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static jumpaku.exprml.pb.exprml.v1.DefStack parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static jumpaku.exprml.pb.exprml.v1.DefStack parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static jumpaku.exprml.pb.exprml.v1.DefStack parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static jumpaku.exprml.pb.exprml.v1.DefStack parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static jumpaku.exprml.pb.exprml.v1.DefStack parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static jumpaku.exprml.pb.exprml.v1.DefStack parseFrom(
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
  public static Builder newBuilder(jumpaku.exprml.pb.exprml.v1.DefStack prototype) {
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
   * FunDefList is a list of function definitions.
   * </pre>
   *
   * Protobuf type {@code exprml.v1.DefStack}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:exprml.v1.DefStack)
      jumpaku.exprml.pb.exprml.v1.DefStackOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return jumpaku.exprml.pb.exprml.v1.EvaluatorProto.internal_static_exprml_v1_DefStack_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return jumpaku.exprml.pb.exprml.v1.EvaluatorProto.internal_static_exprml_v1_DefStack_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              jumpaku.exprml.pb.exprml.v1.DefStack.class, jumpaku.exprml.pb.exprml.v1.DefStack.Builder.class);
    }

    // Construct using jumpaku.exprml.pb.exprml.v1.DefStack.newBuilder()
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
        getParentFieldBuilder();
        getDefFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = null;
      if (parentBuilder_ != null) {
        parentBuilder_.dispose();
        parentBuilder_ = null;
      }
      def_ = null;
      if (defBuilder_ != null) {
        defBuilder_.dispose();
        defBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return jumpaku.exprml.pb.exprml.v1.EvaluatorProto.internal_static_exprml_v1_DefStack_descriptor;
    }

    @java.lang.Override
    public jumpaku.exprml.pb.exprml.v1.DefStack getDefaultInstanceForType() {
      return jumpaku.exprml.pb.exprml.v1.DefStack.getDefaultInstance();
    }

    @java.lang.Override
    public jumpaku.exprml.pb.exprml.v1.DefStack build() {
      jumpaku.exprml.pb.exprml.v1.DefStack result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public jumpaku.exprml.pb.exprml.v1.DefStack buildPartial() {
      jumpaku.exprml.pb.exprml.v1.DefStack result = new jumpaku.exprml.pb.exprml.v1.DefStack(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(jumpaku.exprml.pb.exprml.v1.DefStack result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parentBuilder_ == null
            ? parent_
            : parentBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.def_ = defBuilder_ == null
            ? def_
            : defBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof jumpaku.exprml.pb.exprml.v1.DefStack) {
        return mergeFrom((jumpaku.exprml.pb.exprml.v1.DefStack)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(jumpaku.exprml.pb.exprml.v1.DefStack other) {
      if (other == jumpaku.exprml.pb.exprml.v1.DefStack.getDefaultInstance()) return this;
      if (other.hasParent()) {
        mergeParent(other.getParent());
      }
      if (other.hasDef()) {
        mergeDef(other.getDef());
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
                  getParentFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getDefFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private jumpaku.exprml.pb.exprml.v1.DefStack parent_;
    private com.google.protobuf.SingleFieldBuilder<
        jumpaku.exprml.pb.exprml.v1.DefStack, jumpaku.exprml.pb.exprml.v1.DefStack.Builder, jumpaku.exprml.pb.exprml.v1.DefStackOrBuilder> parentBuilder_;
    /**
     * <pre>
     * Parent definition list.
     * </pre>
     *
     * <code>.exprml.v1.DefStack parent = 1 [json_name = "parent"];</code>
     * @return Whether the parent field is set.
     */
    public boolean hasParent() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Parent definition list.
     * </pre>
     *
     * <code>.exprml.v1.DefStack parent = 1 [json_name = "parent"];</code>
     * @return The parent.
     */
    public jumpaku.exprml.pb.exprml.v1.DefStack getParent() {
      if (parentBuilder_ == null) {
        return parent_ == null ? jumpaku.exprml.pb.exprml.v1.DefStack.getDefaultInstance() : parent_;
      } else {
        return parentBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Parent definition list.
     * </pre>
     *
     * <code>.exprml.v1.DefStack parent = 1 [json_name = "parent"];</code>
     */
    public Builder setParent(jumpaku.exprml.pb.exprml.v1.DefStack value) {
      if (parentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        parent_ = value;
      } else {
        parentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Parent definition list.
     * </pre>
     *
     * <code>.exprml.v1.DefStack parent = 1 [json_name = "parent"];</code>
     */
    public Builder setParent(
        jumpaku.exprml.pb.exprml.v1.DefStack.Builder builderForValue) {
      if (parentBuilder_ == null) {
        parent_ = builderForValue.build();
      } else {
        parentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Parent definition list.
     * </pre>
     *
     * <code>.exprml.v1.DefStack parent = 1 [json_name = "parent"];</code>
     */
    public Builder mergeParent(jumpaku.exprml.pb.exprml.v1.DefStack value) {
      if (parentBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          parent_ != null &&
          parent_ != jumpaku.exprml.pb.exprml.v1.DefStack.getDefaultInstance()) {
          getParentBuilder().mergeFrom(value);
        } else {
          parent_ = value;
        }
      } else {
        parentBuilder_.mergeFrom(value);
      }
      if (parent_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Parent definition list.
     * </pre>
     *
     * <code>.exprml.v1.DefStack parent = 1 [json_name = "parent"];</code>
     */
    public Builder clearParent() {
      bitField0_ = (bitField0_ & ~0x00000001);
      parent_ = null;
      if (parentBuilder_ != null) {
        parentBuilder_.dispose();
        parentBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Parent definition list.
     * </pre>
     *
     * <code>.exprml.v1.DefStack parent = 1 [json_name = "parent"];</code>
     */
    public jumpaku.exprml.pb.exprml.v1.DefStack.Builder getParentBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getParentFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Parent definition list.
     * </pre>
     *
     * <code>.exprml.v1.DefStack parent = 1 [json_name = "parent"];</code>
     */
    public jumpaku.exprml.pb.exprml.v1.DefStackOrBuilder getParentOrBuilder() {
      if (parentBuilder_ != null) {
        return parentBuilder_.getMessageOrBuilder();
      } else {
        return parent_ == null ?
            jumpaku.exprml.pb.exprml.v1.DefStack.getDefaultInstance() : parent_;
      }
    }
    /**
     * <pre>
     * Parent definition list.
     * </pre>
     *
     * <code>.exprml.v1.DefStack parent = 1 [json_name = "parent"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        jumpaku.exprml.pb.exprml.v1.DefStack, jumpaku.exprml.pb.exprml.v1.DefStack.Builder, jumpaku.exprml.pb.exprml.v1.DefStackOrBuilder> 
        getParentFieldBuilder() {
      if (parentBuilder_ == null) {
        parentBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            jumpaku.exprml.pb.exprml.v1.DefStack, jumpaku.exprml.pb.exprml.v1.DefStack.Builder, jumpaku.exprml.pb.exprml.v1.DefStackOrBuilder>(
                getParent(),
                getParentForChildren(),
                isClean());
        parent_ = null;
      }
      return parentBuilder_;
    }

    private jumpaku.exprml.pb.exprml.v1.Eval.Definition def_;
    private com.google.protobuf.SingleFieldBuilder<
        jumpaku.exprml.pb.exprml.v1.Eval.Definition, jumpaku.exprml.pb.exprml.v1.Eval.Definition.Builder, jumpaku.exprml.pb.exprml.v1.Eval.DefinitionOrBuilder> defBuilder_;
    /**
     * <pre>
     * Definition.
     * </pre>
     *
     * <code>.exprml.v1.Eval.Definition def = 2 [json_name = "def"];</code>
     * @return Whether the def field is set.
     */
    public boolean hasDef() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Definition.
     * </pre>
     *
     * <code>.exprml.v1.Eval.Definition def = 2 [json_name = "def"];</code>
     * @return The def.
     */
    public jumpaku.exprml.pb.exprml.v1.Eval.Definition getDef() {
      if (defBuilder_ == null) {
        return def_ == null ? jumpaku.exprml.pb.exprml.v1.Eval.Definition.getDefaultInstance() : def_;
      } else {
        return defBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Definition.
     * </pre>
     *
     * <code>.exprml.v1.Eval.Definition def = 2 [json_name = "def"];</code>
     */
    public Builder setDef(jumpaku.exprml.pb.exprml.v1.Eval.Definition value) {
      if (defBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        def_ = value;
      } else {
        defBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Definition.
     * </pre>
     *
     * <code>.exprml.v1.Eval.Definition def = 2 [json_name = "def"];</code>
     */
    public Builder setDef(
        jumpaku.exprml.pb.exprml.v1.Eval.Definition.Builder builderForValue) {
      if (defBuilder_ == null) {
        def_ = builderForValue.build();
      } else {
        defBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Definition.
     * </pre>
     *
     * <code>.exprml.v1.Eval.Definition def = 2 [json_name = "def"];</code>
     */
    public Builder mergeDef(jumpaku.exprml.pb.exprml.v1.Eval.Definition value) {
      if (defBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          def_ != null &&
          def_ != jumpaku.exprml.pb.exprml.v1.Eval.Definition.getDefaultInstance()) {
          getDefBuilder().mergeFrom(value);
        } else {
          def_ = value;
        }
      } else {
        defBuilder_.mergeFrom(value);
      }
      if (def_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Definition.
     * </pre>
     *
     * <code>.exprml.v1.Eval.Definition def = 2 [json_name = "def"];</code>
     */
    public Builder clearDef() {
      bitField0_ = (bitField0_ & ~0x00000002);
      def_ = null;
      if (defBuilder_ != null) {
        defBuilder_.dispose();
        defBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Definition.
     * </pre>
     *
     * <code>.exprml.v1.Eval.Definition def = 2 [json_name = "def"];</code>
     */
    public jumpaku.exprml.pb.exprml.v1.Eval.Definition.Builder getDefBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getDefFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Definition.
     * </pre>
     *
     * <code>.exprml.v1.Eval.Definition def = 2 [json_name = "def"];</code>
     */
    public jumpaku.exprml.pb.exprml.v1.Eval.DefinitionOrBuilder getDefOrBuilder() {
      if (defBuilder_ != null) {
        return defBuilder_.getMessageOrBuilder();
      } else {
        return def_ == null ?
            jumpaku.exprml.pb.exprml.v1.Eval.Definition.getDefaultInstance() : def_;
      }
    }
    /**
     * <pre>
     * Definition.
     * </pre>
     *
     * <code>.exprml.v1.Eval.Definition def = 2 [json_name = "def"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        jumpaku.exprml.pb.exprml.v1.Eval.Definition, jumpaku.exprml.pb.exprml.v1.Eval.Definition.Builder, jumpaku.exprml.pb.exprml.v1.Eval.DefinitionOrBuilder> 
        getDefFieldBuilder() {
      if (defBuilder_ == null) {
        defBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            jumpaku.exprml.pb.exprml.v1.Eval.Definition, jumpaku.exprml.pb.exprml.v1.Eval.Definition.Builder, jumpaku.exprml.pb.exprml.v1.Eval.DefinitionOrBuilder>(
                getDef(),
                getParentForChildren(),
                isClean());
        def_ = null;
      }
      return defBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:exprml.v1.DefStack)
  }

  // @@protoc_insertion_point(class_scope:exprml.v1.DefStack)
  private static final jumpaku.exprml.pb.exprml.v1.DefStack DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new jumpaku.exprml.pb.exprml.v1.DefStack();
  }

  public static jumpaku.exprml.pb.exprml.v1.DefStack getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DefStack>
      PARSER = new com.google.protobuf.AbstractParser<DefStack>() {
    @java.lang.Override
    public DefStack parsePartialFrom(
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

  public static com.google.protobuf.Parser<DefStack> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DefStack> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public jumpaku.exprml.pb.exprml.v1.DefStack getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

