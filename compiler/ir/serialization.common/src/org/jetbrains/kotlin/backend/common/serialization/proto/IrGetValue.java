// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compiler/ir/serialization.common/src/KotlinIr.proto

package org.jetbrains.kotlin.backend.common.serialization.proto;

/**
 * Protobuf type {@code org.jetbrains.kotlin.backend.common.serialization.proto.IrGetValue}
 */
public final class IrGetValue extends
    org.jetbrains.kotlin.protobuf.GeneratedMessageLite implements
    // @@protoc_insertion_point(message_implements:org.jetbrains.kotlin.backend.common.serialization.proto.IrGetValue)
    IrGetValueOrBuilder {
  // Use IrGetValue.newBuilder() to construct.
  private IrGetValue(org.jetbrains.kotlin.protobuf.GeneratedMessageLite.Builder builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private IrGetValue(boolean noInit) { this.unknownFields = org.jetbrains.kotlin.protobuf.ByteString.EMPTY;}

  private static final IrGetValue defaultInstance;
  public static IrGetValue getDefaultInstance() {
    return defaultInstance;
  }

  public IrGetValue getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final org.jetbrains.kotlin.protobuf.ByteString unknownFields;
  private IrGetValue(
      org.jetbrains.kotlin.protobuf.CodedInputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    initFields();
    int mutable_bitField0_ = 0;
    org.jetbrains.kotlin.protobuf.ByteString.Output unknownFieldsOutput =
        org.jetbrains.kotlin.protobuf.ByteString.newOutput();
    org.jetbrains.kotlin.protobuf.CodedOutputStream unknownFieldsCodedOutput =
        org.jetbrains.kotlin.protobuf.CodedOutputStream.newInstance(
            unknownFieldsOutput);
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(input, unknownFieldsCodedOutput,
                                   extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            org.jetbrains.kotlin.backend.common.serialization.proto.IrSymbol.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
              subBuilder = symbol_.toBuilder();
            }
            symbol_ = input.readMessage(org.jetbrains.kotlin.backend.common.serialization.proto.IrSymbol.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(symbol_);
              symbol_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
            break;
          }
          case 18: {
            org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin.Builder subBuilder = null;
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
              subBuilder = origin_.toBuilder();
            }
            origin_ = input.readMessage(org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(origin_);
              origin_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000002;
            break;
          }
        }
      }
    } catch (org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException(
          e.getMessage()).setUnfinishedMessage(this);
    } finally {
      try {
        unknownFieldsCodedOutput.flush();
      } catch (java.io.IOException e) {
      // Should not happen
      } finally {
        unknownFields = unknownFieldsOutput.toByteString();
      }
      makeExtensionsImmutable();
    }
  }
  public static org.jetbrains.kotlin.protobuf.Parser<IrGetValue> PARSER =
      new org.jetbrains.kotlin.protobuf.AbstractParser<IrGetValue>() {
    public IrGetValue parsePartialFrom(
        org.jetbrains.kotlin.protobuf.CodedInputStream input,
        org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
      return new IrGetValue(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public org.jetbrains.kotlin.protobuf.Parser<IrGetValue> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int SYMBOL_FIELD_NUMBER = 1;
  private org.jetbrains.kotlin.backend.common.serialization.proto.IrSymbol symbol_;
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrSymbol symbol = 1;</code>
   */
  public boolean hasSymbol() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrSymbol symbol = 1;</code>
   */
  public org.jetbrains.kotlin.backend.common.serialization.proto.IrSymbol getSymbol() {
    return symbol_;
  }

  public static final int ORIGIN_FIELD_NUMBER = 2;
  private org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin origin_;
  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin origin = 2;</code>
   */
  public boolean hasOrigin() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin origin = 2;</code>
   */
  public org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin getOrigin() {
    return origin_;
  }

  private void initFields() {
    symbol_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrSymbol.getDefaultInstance();
    origin_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin.getDefaultInstance();
  }
  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasSymbol()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!getSymbol().isInitialized()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (hasOrigin()) {
      if (!getOrigin().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
    }
    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(org.jetbrains.kotlin.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeMessage(1, symbol_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeMessage(2, origin_);
    }
    output.writeRawBytes(unknownFields);
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += org.jetbrains.kotlin.protobuf.CodedOutputStream
        .computeMessageSize(1, symbol_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += org.jetbrains.kotlin.protobuf.CodedOutputStream
        .computeMessageSize(2, origin_);
    }
    size += unknownFields.size();
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  protected java.lang.Object writeReplace()
      throws java.io.ObjectStreamException {
    return super.writeReplace();
  }

  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrGetValue parseFrom(
      org.jetbrains.kotlin.protobuf.ByteString data)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrGetValue parseFrom(
      org.jetbrains.kotlin.protobuf.ByteString data,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrGetValue parseFrom(byte[] data)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrGetValue parseFrom(
      byte[] data,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrGetValue parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrGetValue parseFrom(
      java.io.InputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrGetValue parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrGetValue parseDelimitedFrom(
      java.io.InputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrGetValue parseFrom(
      org.jetbrains.kotlin.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrGetValue parseFrom(
      org.jetbrains.kotlin.protobuf.CodedInputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(org.jetbrains.kotlin.backend.common.serialization.proto.IrGetValue prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }

  /**
   * Protobuf type {@code org.jetbrains.kotlin.backend.common.serialization.proto.IrGetValue}
   */
  public static final class Builder extends
      org.jetbrains.kotlin.protobuf.GeneratedMessageLite.Builder<
        org.jetbrains.kotlin.backend.common.serialization.proto.IrGetValue, Builder>
      implements
      // @@protoc_insertion_point(builder_implements:org.jetbrains.kotlin.backend.common.serialization.proto.IrGetValue)
      org.jetbrains.kotlin.backend.common.serialization.proto.IrGetValueOrBuilder {
    // Construct using org.jetbrains.kotlin.backend.common.serialization.proto.IrGetValue.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      symbol_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrSymbol.getDefaultInstance();
      bitField0_ = (bitField0_ & ~0x00000001);
      origin_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin.getDefaultInstance();
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public org.jetbrains.kotlin.backend.common.serialization.proto.IrGetValue getDefaultInstanceForType() {
      return org.jetbrains.kotlin.backend.common.serialization.proto.IrGetValue.getDefaultInstance();
    }

    public org.jetbrains.kotlin.backend.common.serialization.proto.IrGetValue build() {
      org.jetbrains.kotlin.backend.common.serialization.proto.IrGetValue result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.jetbrains.kotlin.backend.common.serialization.proto.IrGetValue buildPartial() {
      org.jetbrains.kotlin.backend.common.serialization.proto.IrGetValue result = new org.jetbrains.kotlin.backend.common.serialization.proto.IrGetValue(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.symbol_ = symbol_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.origin_ = origin_;
      result.bitField0_ = to_bitField0_;
      return result;
    }

    public Builder mergeFrom(org.jetbrains.kotlin.backend.common.serialization.proto.IrGetValue other) {
      if (other == org.jetbrains.kotlin.backend.common.serialization.proto.IrGetValue.getDefaultInstance()) return this;
      if (other.hasSymbol()) {
        mergeSymbol(other.getSymbol());
      }
      if (other.hasOrigin()) {
        mergeOrigin(other.getOrigin());
      }
      setUnknownFields(
          getUnknownFields().concat(other.unknownFields));
      return this;
    }

    public final boolean isInitialized() {
      if (!hasSymbol()) {
        
        return false;
      }
      if (!getSymbol().isInitialized()) {
        
        return false;
      }
      if (hasOrigin()) {
        if (!getOrigin().isInitialized()) {
          
          return false;
        }
      }
      return true;
    }

    public Builder mergeFrom(
        org.jetbrains.kotlin.protobuf.CodedInputStream input,
        org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.jetbrains.kotlin.backend.common.serialization.proto.IrGetValue parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.jetbrains.kotlin.backend.common.serialization.proto.IrGetValue) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private org.jetbrains.kotlin.backend.common.serialization.proto.IrSymbol symbol_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrSymbol.getDefaultInstance();
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrSymbol symbol = 1;</code>
     */
    public boolean hasSymbol() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrSymbol symbol = 1;</code>
     */
    public org.jetbrains.kotlin.backend.common.serialization.proto.IrSymbol getSymbol() {
      return symbol_;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrSymbol symbol = 1;</code>
     */
    public Builder setSymbol(org.jetbrains.kotlin.backend.common.serialization.proto.IrSymbol value) {
      if (value == null) {
        throw new NullPointerException();
      }
      symbol_ = value;

      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrSymbol symbol = 1;</code>
     */
    public Builder setSymbol(
        org.jetbrains.kotlin.backend.common.serialization.proto.IrSymbol.Builder builderForValue) {
      symbol_ = builderForValue.build();

      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrSymbol symbol = 1;</code>
     */
    public Builder mergeSymbol(org.jetbrains.kotlin.backend.common.serialization.proto.IrSymbol value) {
      if (((bitField0_ & 0x00000001) == 0x00000001) &&
          symbol_ != org.jetbrains.kotlin.backend.common.serialization.proto.IrSymbol.getDefaultInstance()) {
        symbol_ =
          org.jetbrains.kotlin.backend.common.serialization.proto.IrSymbol.newBuilder(symbol_).mergeFrom(value).buildPartial();
      } else {
        symbol_ = value;
      }

      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrSymbol symbol = 1;</code>
     */
    public Builder clearSymbol() {
      symbol_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrSymbol.getDefaultInstance();

      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    private org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin origin_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin.getDefaultInstance();
    /**
     * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin origin = 2;</code>
     */
    public boolean hasOrigin() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin origin = 2;</code>
     */
    public org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin getOrigin() {
      return origin_;
    }
    /**
     * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin origin = 2;</code>
     */
    public Builder setOrigin(org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin value) {
      if (value == null) {
        throw new NullPointerException();
      }
      origin_ = value;

      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin origin = 2;</code>
     */
    public Builder setOrigin(
        org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin.Builder builderForValue) {
      origin_ = builderForValue.build();

      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin origin = 2;</code>
     */
    public Builder mergeOrigin(org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin value) {
      if (((bitField0_ & 0x00000002) == 0x00000002) &&
          origin_ != org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin.getDefaultInstance()) {
        origin_ =
          org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin.newBuilder(origin_).mergeFrom(value).buildPartial();
      } else {
        origin_ = value;
      }

      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin origin = 2;</code>
     */
    public Builder clearOrigin() {
      origin_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin.getDefaultInstance();

      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:org.jetbrains.kotlin.backend.common.serialization.proto.IrGetValue)
  }

  static {
    defaultInstance = new IrGetValue(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:org.jetbrains.kotlin.backend.common.serialization.proto.IrGetValue)
}