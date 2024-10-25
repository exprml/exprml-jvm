// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: exprml/v1/expr.proto
// Protobuf Java Version: 4.28.2

package net.jumpaku.exprml.pb.exprml.v1;

/**
 * <pre>
 * OpBinary is an OpBinary expression.
 * </pre>
 *
 * Protobuf type {@code exprml.v1.OpBinary}
 */
public final class OpBinary extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:exprml.v1.OpBinary)
    OpBinaryOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      OpBinary.class.getName());
  }
  // Use OpBinary.newBuilder() to construct.
  private OpBinary(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private OpBinary() {
    op_ = 0;
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return net.jumpaku.exprml.pb.exprml.v1.ExprProto.internal_static_exprml_v1_OpBinary_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.jumpaku.exprml.pb.exprml.v1.ExprProto.internal_static_exprml_v1_OpBinary_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.jumpaku.exprml.pb.exprml.v1.OpBinary.class, net.jumpaku.exprml.pb.exprml.v1.OpBinary.Builder.class);
  }

  /**
   * <pre>
   * Op is a operator.
   * </pre>
   *
   * Protobuf enum {@code exprml.v1.OpBinary.Op}
   */
  public enum Op
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * Sub operator.
     * </pre>
     *
     * <code>SUB = 1;</code>
     */
    SUB(1),
    /**
     * <pre>
     * Div operator.
     * </pre>
     *
     * <code>DIV = 2;</code>
     */
    DIV(2),
    /**
     * <pre>
     * Eq operator.
     * </pre>
     *
     * <code>EQ = 3;</code>
     */
    EQ(3),
    /**
     * <pre>
     * Neq operator.
     * </pre>
     *
     * <code>NEQ = 4;</code>
     */
    NEQ(4),
    /**
     * <pre>
     * Lt operator.
     * </pre>
     *
     * <code>LT = 5;</code>
     */
    LT(5),
    /**
     * <pre>
     * Lte operator.
     * </pre>
     *
     * <code>LTE = 6;</code>
     */
    LTE(6),
    /**
     * <pre>
     * Gt operator.
     * </pre>
     *
     * <code>GT = 7;</code>
     */
    GT(7),
    /**
     * <pre>
     * Gte operator.
     * </pre>
     *
     * <code>GTE = 8;</code>
     */
    GTE(8),
    UNRECOGNIZED(-1),
    ;

    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 28,
        /* patch= */ 2,
        /* suffix= */ "",
        Op.class.getName());
    }
    /**
     * <pre>
     * Unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Sub operator.
     * </pre>
     *
     * <code>SUB = 1;</code>
     */
    public static final int SUB_VALUE = 1;
    /**
     * <pre>
     * Div operator.
     * </pre>
     *
     * <code>DIV = 2;</code>
     */
    public static final int DIV_VALUE = 2;
    /**
     * <pre>
     * Eq operator.
     * </pre>
     *
     * <code>EQ = 3;</code>
     */
    public static final int EQ_VALUE = 3;
    /**
     * <pre>
     * Neq operator.
     * </pre>
     *
     * <code>NEQ = 4;</code>
     */
    public static final int NEQ_VALUE = 4;
    /**
     * <pre>
     * Lt operator.
     * </pre>
     *
     * <code>LT = 5;</code>
     */
    public static final int LT_VALUE = 5;
    /**
     * <pre>
     * Lte operator.
     * </pre>
     *
     * <code>LTE = 6;</code>
     */
    public static final int LTE_VALUE = 6;
    /**
     * <pre>
     * Gt operator.
     * </pre>
     *
     * <code>GT = 7;</code>
     */
    public static final int GT_VALUE = 7;
    /**
     * <pre>
     * Gte operator.
     * </pre>
     *
     * <code>GTE = 8;</code>
     */
    public static final int GTE_VALUE = 8;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Op valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Op forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return SUB;
        case 2: return DIV;
        case 3: return EQ;
        case 4: return NEQ;
        case 5: return LT;
        case 6: return LTE;
        case 7: return GT;
        case 8: return GTE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Op>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Op> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Op>() {
            public Op findValueByNumber(int number) {
              return Op.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return net.jumpaku.exprml.pb.exprml.v1.OpBinary.getDescriptor().getEnumTypes().get(0);
    }

    private static final Op[] VALUES = values();

    public static Op valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Op(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:exprml.v1.OpBinary.Op)
  }

  private int bitField0_;
  public static final int OP_FIELD_NUMBER = 1;
  private int op_ = 0;
  /**
   * <pre>
   * Op is the operator.
   * </pre>
   *
   * <code>.exprml.v1.OpBinary.Op op = 1 [json_name = "op"];</code>
   * @return The enum numeric value on the wire for op.
   */
  @java.lang.Override public int getOpValue() {
    return op_;
  }
  /**
   * <pre>
   * Op is the operator.
   * </pre>
   *
   * <code>.exprml.v1.OpBinary.Op op = 1 [json_name = "op"];</code>
   * @return The op.
   */
  @java.lang.Override public net.jumpaku.exprml.pb.exprml.v1.OpBinary.Op getOp() {
    net.jumpaku.exprml.pb.exprml.v1.OpBinary.Op result = net.jumpaku.exprml.pb.exprml.v1.OpBinary.Op.forNumber(op_);
    return result == null ? net.jumpaku.exprml.pb.exprml.v1.OpBinary.Op.UNRECOGNIZED : result;
  }

  public static final int LEFT_FIELD_NUMBER = 2;
  private net.jumpaku.exprml.pb.exprml.v1.Expr left_;
  /**
   * <pre>
   * Left is the left operand.
   * </pre>
   *
   * <code>.exprml.v1.Expr left = 2 [json_name = "left"];</code>
   * @return Whether the left field is set.
   */
  @java.lang.Override
  public boolean hasLeft() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Left is the left operand.
   * </pre>
   *
   * <code>.exprml.v1.Expr left = 2 [json_name = "left"];</code>
   * @return The left.
   */
  @java.lang.Override
  public net.jumpaku.exprml.pb.exprml.v1.Expr getLeft() {
    return left_ == null ? net.jumpaku.exprml.pb.exprml.v1.Expr.getDefaultInstance() : left_;
  }
  /**
   * <pre>
   * Left is the left operand.
   * </pre>
   *
   * <code>.exprml.v1.Expr left = 2 [json_name = "left"];</code>
   */
  @java.lang.Override
  public net.jumpaku.exprml.pb.exprml.v1.ExprOrBuilder getLeftOrBuilder() {
    return left_ == null ? net.jumpaku.exprml.pb.exprml.v1.Expr.getDefaultInstance() : left_;
  }

  public static final int RIGHT_FIELD_NUMBER = 3;
  private net.jumpaku.exprml.pb.exprml.v1.Expr right_;
  /**
   * <pre>
   * Right is the right operand.
   * </pre>
   *
   * <code>.exprml.v1.Expr right = 3 [json_name = "right"];</code>
   * @return Whether the right field is set.
   */
  @java.lang.Override
  public boolean hasRight() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Right is the right operand.
   * </pre>
   *
   * <code>.exprml.v1.Expr right = 3 [json_name = "right"];</code>
   * @return The right.
   */
  @java.lang.Override
  public net.jumpaku.exprml.pb.exprml.v1.Expr getRight() {
    return right_ == null ? net.jumpaku.exprml.pb.exprml.v1.Expr.getDefaultInstance() : right_;
  }
  /**
   * <pre>
   * Right is the right operand.
   * </pre>
   *
   * <code>.exprml.v1.Expr right = 3 [json_name = "right"];</code>
   */
  @java.lang.Override
  public net.jumpaku.exprml.pb.exprml.v1.ExprOrBuilder getRightOrBuilder() {
    return right_ == null ? net.jumpaku.exprml.pb.exprml.v1.Expr.getDefaultInstance() : right_;
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
    if (op_ != net.jumpaku.exprml.pb.exprml.v1.OpBinary.Op.UNSPECIFIED.getNumber()) {
      output.writeEnum(1, op_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getLeft());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(3, getRight());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (op_ != net.jumpaku.exprml.pb.exprml.v1.OpBinary.Op.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, op_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getLeft());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getRight());
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
    if (!(obj instanceof net.jumpaku.exprml.pb.exprml.v1.OpBinary)) {
      return super.equals(obj);
    }
    net.jumpaku.exprml.pb.exprml.v1.OpBinary other = (net.jumpaku.exprml.pb.exprml.v1.OpBinary) obj;

    if (op_ != other.op_) return false;
    if (hasLeft() != other.hasLeft()) return false;
    if (hasLeft()) {
      if (!getLeft()
          .equals(other.getLeft())) return false;
    }
    if (hasRight() != other.hasRight()) return false;
    if (hasRight()) {
      if (!getRight()
          .equals(other.getRight())) return false;
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
    hash = (37 * hash) + OP_FIELD_NUMBER;
    hash = (53 * hash) + op_;
    if (hasLeft()) {
      hash = (37 * hash) + LEFT_FIELD_NUMBER;
      hash = (53 * hash) + getLeft().hashCode();
    }
    if (hasRight()) {
      hash = (37 * hash) + RIGHT_FIELD_NUMBER;
      hash = (53 * hash) + getRight().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.jumpaku.exprml.pb.exprml.v1.OpBinary parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.jumpaku.exprml.pb.exprml.v1.OpBinary parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.jumpaku.exprml.pb.exprml.v1.OpBinary parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.jumpaku.exprml.pb.exprml.v1.OpBinary parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.jumpaku.exprml.pb.exprml.v1.OpBinary parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.jumpaku.exprml.pb.exprml.v1.OpBinary parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.jumpaku.exprml.pb.exprml.v1.OpBinary parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static net.jumpaku.exprml.pb.exprml.v1.OpBinary parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static net.jumpaku.exprml.pb.exprml.v1.OpBinary parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static net.jumpaku.exprml.pb.exprml.v1.OpBinary parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.jumpaku.exprml.pb.exprml.v1.OpBinary parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static net.jumpaku.exprml.pb.exprml.v1.OpBinary parseFrom(
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
  public static Builder newBuilder(net.jumpaku.exprml.pb.exprml.v1.OpBinary prototype) {
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
   * OpBinary is an OpBinary expression.
   * </pre>
   *
   * Protobuf type {@code exprml.v1.OpBinary}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:exprml.v1.OpBinary)
      net.jumpaku.exprml.pb.exprml.v1.OpBinaryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.jumpaku.exprml.pb.exprml.v1.ExprProto.internal_static_exprml_v1_OpBinary_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.jumpaku.exprml.pb.exprml.v1.ExprProto.internal_static_exprml_v1_OpBinary_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.jumpaku.exprml.pb.exprml.v1.OpBinary.class, net.jumpaku.exprml.pb.exprml.v1.OpBinary.Builder.class);
    }

    // Construct using net.jumpaku.exprml.pb.exprml.v1.OpBinary.newBuilder()
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
        getLeftFieldBuilder();
        getRightFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      op_ = 0;
      left_ = null;
      if (leftBuilder_ != null) {
        leftBuilder_.dispose();
        leftBuilder_ = null;
      }
      right_ = null;
      if (rightBuilder_ != null) {
        rightBuilder_.dispose();
        rightBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.jumpaku.exprml.pb.exprml.v1.ExprProto.internal_static_exprml_v1_OpBinary_descriptor;
    }

    @java.lang.Override
    public net.jumpaku.exprml.pb.exprml.v1.OpBinary getDefaultInstanceForType() {
      return net.jumpaku.exprml.pb.exprml.v1.OpBinary.getDefaultInstance();
    }

    @java.lang.Override
    public net.jumpaku.exprml.pb.exprml.v1.OpBinary build() {
      net.jumpaku.exprml.pb.exprml.v1.OpBinary result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public net.jumpaku.exprml.pb.exprml.v1.OpBinary buildPartial() {
      net.jumpaku.exprml.pb.exprml.v1.OpBinary result = new net.jumpaku.exprml.pb.exprml.v1.OpBinary(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(net.jumpaku.exprml.pb.exprml.v1.OpBinary result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.op_ = op_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.left_ = leftBuilder_ == null
            ? left_
            : leftBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.right_ = rightBuilder_ == null
            ? right_
            : rightBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof net.jumpaku.exprml.pb.exprml.v1.OpBinary) {
        return mergeFrom((net.jumpaku.exprml.pb.exprml.v1.OpBinary)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.jumpaku.exprml.pb.exprml.v1.OpBinary other) {
      if (other == net.jumpaku.exprml.pb.exprml.v1.OpBinary.getDefaultInstance()) return this;
      if (other.op_ != 0) {
        setOpValue(other.getOpValue());
      }
      if (other.hasLeft()) {
        mergeLeft(other.getLeft());
      }
      if (other.hasRight()) {
        mergeRight(other.getRight());
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
            case 8: {
              op_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getLeftFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getRightFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private int op_ = 0;
    /**
     * <pre>
     * Op is the operator.
     * </pre>
     *
     * <code>.exprml.v1.OpBinary.Op op = 1 [json_name = "op"];</code>
     * @return The enum numeric value on the wire for op.
     */
    @java.lang.Override public int getOpValue() {
      return op_;
    }
    /**
     * <pre>
     * Op is the operator.
     * </pre>
     *
     * <code>.exprml.v1.OpBinary.Op op = 1 [json_name = "op"];</code>
     * @param value The enum numeric value on the wire for op to set.
     * @return This builder for chaining.
     */
    public Builder setOpValue(int value) {
      op_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Op is the operator.
     * </pre>
     *
     * <code>.exprml.v1.OpBinary.Op op = 1 [json_name = "op"];</code>
     * @return The op.
     */
    @java.lang.Override
    public net.jumpaku.exprml.pb.exprml.v1.OpBinary.Op getOp() {
      net.jumpaku.exprml.pb.exprml.v1.OpBinary.Op result = net.jumpaku.exprml.pb.exprml.v1.OpBinary.Op.forNumber(op_);
      return result == null ? net.jumpaku.exprml.pb.exprml.v1.OpBinary.Op.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Op is the operator.
     * </pre>
     *
     * <code>.exprml.v1.OpBinary.Op op = 1 [json_name = "op"];</code>
     * @param value The op to set.
     * @return This builder for chaining.
     */
    public Builder setOp(net.jumpaku.exprml.pb.exprml.v1.OpBinary.Op value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      op_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Op is the operator.
     * </pre>
     *
     * <code>.exprml.v1.OpBinary.Op op = 1 [json_name = "op"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOp() {
      bitField0_ = (bitField0_ & ~0x00000001);
      op_ = 0;
      onChanged();
      return this;
    }

    private net.jumpaku.exprml.pb.exprml.v1.Expr left_;
    private com.google.protobuf.SingleFieldBuilder<
        net.jumpaku.exprml.pb.exprml.v1.Expr, net.jumpaku.exprml.pb.exprml.v1.Expr.Builder, net.jumpaku.exprml.pb.exprml.v1.ExprOrBuilder> leftBuilder_;
    /**
     * <pre>
     * Left is the left operand.
     * </pre>
     *
     * <code>.exprml.v1.Expr left = 2 [json_name = "left"];</code>
     * @return Whether the left field is set.
     */
    public boolean hasLeft() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Left is the left operand.
     * </pre>
     *
     * <code>.exprml.v1.Expr left = 2 [json_name = "left"];</code>
     * @return The left.
     */
    public net.jumpaku.exprml.pb.exprml.v1.Expr getLeft() {
      if (leftBuilder_ == null) {
        return left_ == null ? net.jumpaku.exprml.pb.exprml.v1.Expr.getDefaultInstance() : left_;
      } else {
        return leftBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Left is the left operand.
     * </pre>
     *
     * <code>.exprml.v1.Expr left = 2 [json_name = "left"];</code>
     */
    public Builder setLeft(net.jumpaku.exprml.pb.exprml.v1.Expr value) {
      if (leftBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        left_ = value;
      } else {
        leftBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Left is the left operand.
     * </pre>
     *
     * <code>.exprml.v1.Expr left = 2 [json_name = "left"];</code>
     */
    public Builder setLeft(
        net.jumpaku.exprml.pb.exprml.v1.Expr.Builder builderForValue) {
      if (leftBuilder_ == null) {
        left_ = builderForValue.build();
      } else {
        leftBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Left is the left operand.
     * </pre>
     *
     * <code>.exprml.v1.Expr left = 2 [json_name = "left"];</code>
     */
    public Builder mergeLeft(net.jumpaku.exprml.pb.exprml.v1.Expr value) {
      if (leftBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          left_ != null &&
          left_ != net.jumpaku.exprml.pb.exprml.v1.Expr.getDefaultInstance()) {
          getLeftBuilder().mergeFrom(value);
        } else {
          left_ = value;
        }
      } else {
        leftBuilder_.mergeFrom(value);
      }
      if (left_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Left is the left operand.
     * </pre>
     *
     * <code>.exprml.v1.Expr left = 2 [json_name = "left"];</code>
     */
    public Builder clearLeft() {
      bitField0_ = (bitField0_ & ~0x00000002);
      left_ = null;
      if (leftBuilder_ != null) {
        leftBuilder_.dispose();
        leftBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Left is the left operand.
     * </pre>
     *
     * <code>.exprml.v1.Expr left = 2 [json_name = "left"];</code>
     */
    public net.jumpaku.exprml.pb.exprml.v1.Expr.Builder getLeftBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getLeftFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Left is the left operand.
     * </pre>
     *
     * <code>.exprml.v1.Expr left = 2 [json_name = "left"];</code>
     */
    public net.jumpaku.exprml.pb.exprml.v1.ExprOrBuilder getLeftOrBuilder() {
      if (leftBuilder_ != null) {
        return leftBuilder_.getMessageOrBuilder();
      } else {
        return left_ == null ?
            net.jumpaku.exprml.pb.exprml.v1.Expr.getDefaultInstance() : left_;
      }
    }
    /**
     * <pre>
     * Left is the left operand.
     * </pre>
     *
     * <code>.exprml.v1.Expr left = 2 [json_name = "left"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        net.jumpaku.exprml.pb.exprml.v1.Expr, net.jumpaku.exprml.pb.exprml.v1.Expr.Builder, net.jumpaku.exprml.pb.exprml.v1.ExprOrBuilder> 
        getLeftFieldBuilder() {
      if (leftBuilder_ == null) {
        leftBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            net.jumpaku.exprml.pb.exprml.v1.Expr, net.jumpaku.exprml.pb.exprml.v1.Expr.Builder, net.jumpaku.exprml.pb.exprml.v1.ExprOrBuilder>(
                getLeft(),
                getParentForChildren(),
                isClean());
        left_ = null;
      }
      return leftBuilder_;
    }

    private net.jumpaku.exprml.pb.exprml.v1.Expr right_;
    private com.google.protobuf.SingleFieldBuilder<
        net.jumpaku.exprml.pb.exprml.v1.Expr, net.jumpaku.exprml.pb.exprml.v1.Expr.Builder, net.jumpaku.exprml.pb.exprml.v1.ExprOrBuilder> rightBuilder_;
    /**
     * <pre>
     * Right is the right operand.
     * </pre>
     *
     * <code>.exprml.v1.Expr right = 3 [json_name = "right"];</code>
     * @return Whether the right field is set.
     */
    public boolean hasRight() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Right is the right operand.
     * </pre>
     *
     * <code>.exprml.v1.Expr right = 3 [json_name = "right"];</code>
     * @return The right.
     */
    public net.jumpaku.exprml.pb.exprml.v1.Expr getRight() {
      if (rightBuilder_ == null) {
        return right_ == null ? net.jumpaku.exprml.pb.exprml.v1.Expr.getDefaultInstance() : right_;
      } else {
        return rightBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Right is the right operand.
     * </pre>
     *
     * <code>.exprml.v1.Expr right = 3 [json_name = "right"];</code>
     */
    public Builder setRight(net.jumpaku.exprml.pb.exprml.v1.Expr value) {
      if (rightBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        right_ = value;
      } else {
        rightBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Right is the right operand.
     * </pre>
     *
     * <code>.exprml.v1.Expr right = 3 [json_name = "right"];</code>
     */
    public Builder setRight(
        net.jumpaku.exprml.pb.exprml.v1.Expr.Builder builderForValue) {
      if (rightBuilder_ == null) {
        right_ = builderForValue.build();
      } else {
        rightBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Right is the right operand.
     * </pre>
     *
     * <code>.exprml.v1.Expr right = 3 [json_name = "right"];</code>
     */
    public Builder mergeRight(net.jumpaku.exprml.pb.exprml.v1.Expr value) {
      if (rightBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          right_ != null &&
          right_ != net.jumpaku.exprml.pb.exprml.v1.Expr.getDefaultInstance()) {
          getRightBuilder().mergeFrom(value);
        } else {
          right_ = value;
        }
      } else {
        rightBuilder_.mergeFrom(value);
      }
      if (right_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Right is the right operand.
     * </pre>
     *
     * <code>.exprml.v1.Expr right = 3 [json_name = "right"];</code>
     */
    public Builder clearRight() {
      bitField0_ = (bitField0_ & ~0x00000004);
      right_ = null;
      if (rightBuilder_ != null) {
        rightBuilder_.dispose();
        rightBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Right is the right operand.
     * </pre>
     *
     * <code>.exprml.v1.Expr right = 3 [json_name = "right"];</code>
     */
    public net.jumpaku.exprml.pb.exprml.v1.Expr.Builder getRightBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getRightFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Right is the right operand.
     * </pre>
     *
     * <code>.exprml.v1.Expr right = 3 [json_name = "right"];</code>
     */
    public net.jumpaku.exprml.pb.exprml.v1.ExprOrBuilder getRightOrBuilder() {
      if (rightBuilder_ != null) {
        return rightBuilder_.getMessageOrBuilder();
      } else {
        return right_ == null ?
            net.jumpaku.exprml.pb.exprml.v1.Expr.getDefaultInstance() : right_;
      }
    }
    /**
     * <pre>
     * Right is the right operand.
     * </pre>
     *
     * <code>.exprml.v1.Expr right = 3 [json_name = "right"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        net.jumpaku.exprml.pb.exprml.v1.Expr, net.jumpaku.exprml.pb.exprml.v1.Expr.Builder, net.jumpaku.exprml.pb.exprml.v1.ExprOrBuilder> 
        getRightFieldBuilder() {
      if (rightBuilder_ == null) {
        rightBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            net.jumpaku.exprml.pb.exprml.v1.Expr, net.jumpaku.exprml.pb.exprml.v1.Expr.Builder, net.jumpaku.exprml.pb.exprml.v1.ExprOrBuilder>(
                getRight(),
                getParentForChildren(),
                isClean());
        right_ = null;
      }
      return rightBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:exprml.v1.OpBinary)
  }

  // @@protoc_insertion_point(class_scope:exprml.v1.OpBinary)
  private static final net.jumpaku.exprml.pb.exprml.v1.OpBinary DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.jumpaku.exprml.pb.exprml.v1.OpBinary();
  }

  public static net.jumpaku.exprml.pb.exprml.v1.OpBinary getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OpBinary>
      PARSER = new com.google.protobuf.AbstractParser<OpBinary>() {
    @java.lang.Override
    public OpBinary parsePartialFrom(
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

  public static com.google.protobuf.Parser<OpBinary> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OpBinary> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public net.jumpaku.exprml.pb.exprml.v1.OpBinary getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

