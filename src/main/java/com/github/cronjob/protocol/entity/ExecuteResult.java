// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SchedularMessage.proto

package com.github.cronjob.protocol.entity;

/**
 * Protobuf type {@code com.github.cronjob.ExecuteResult}
 */
public  final class ExecuteResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.github.cronjob.ExecuteResult)
    ExecuteResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExecuteResult.newBuilder() to construct.
  private ExecuteResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExecuteResult() {
    message_ = "";
    err_ = "";
    startTime_ = "";
    endTime_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExecuteResult();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ExecuteResult(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            String s = input.readStringRequireUtf8();

            message_ = s;
            break;
          }
          case 16: {

            success_ = input.readBool();
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            err_ = s;
            break;
          }
          case 34: {
            String s = input.readStringRequireUtf8();

            startTime_ = s;
            break;
          }
          case 42: {
            String s = input.readStringRequireUtf8();

            endTime_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return SchedularEntity.internal_static_com_github_cronjob_ExecuteResult_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return SchedularEntity.internal_static_com_github_cronjob_ExecuteResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ExecuteResult.class, ExecuteResult.Builder.class);
  }

  public static final int MESSAGE_FIELD_NUMBER = 1;
  private volatile Object message_;
  /**
   * <pre>
   *执行结果
   * </pre>
   *
   * <code>string message = 1;</code>
   * @return The message.
   */
  public String getMessage() {
    Object ref = message_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *执行结果
   * </pre>
   *
   * <code>string message = 1;</code>
   * @return The bytes for message.
   */
  public com.google.protobuf.ByteString
      getMessageBytes() {
    Object ref = message_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUCCESS_FIELD_NUMBER = 2;
  private boolean success_;
  /**
   * <pre>
   *是否成功
   * </pre>
   *
   * <code>bool success = 2;</code>
   * @return The success.
   */
  public boolean getSuccess() {
    return success_;
  }

  public static final int ERR_FIELD_NUMBER = 3;
  private volatile Object err_;
  /**
   * <pre>
   *错误
   * </pre>
   *
   * <code>string err = 3;</code>
   * @return The err.
   */
  public String getErr() {
    Object ref = err_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      err_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *错误
   * </pre>
   *
   * <code>string err = 3;</code>
   * @return The bytes for err.
   */
  public com.google.protobuf.ByteString
      getErrBytes() {
    Object ref = err_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      err_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STARTTIME_FIELD_NUMBER = 4;
  private volatile Object startTime_;
  /**
   * <pre>
   *实际开启时间
   * </pre>
   *
   * <code>string startTime = 4;</code>
   * @return The startTime.
   */
  public String getStartTime() {
    Object ref = startTime_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      startTime_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *实际开启时间
   * </pre>
   *
   * <code>string startTime = 4;</code>
   * @return The bytes for startTime.
   */
  public com.google.protobuf.ByteString
      getStartTimeBytes() {
    Object ref = startTime_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      startTime_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENDTIME_FIELD_NUMBER = 5;
  private volatile Object endTime_;
  /**
   * <pre>
   *实际结束时间
   * </pre>
   *
   * <code>string endTime = 5;</code>
   * @return The endTime.
   */
  public String getEndTime() {
    Object ref = endTime_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      endTime_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *实际结束时间
   * </pre>
   *
   * <code>string endTime = 5;</code>
   * @return The bytes for endTime.
   */
  public com.google.protobuf.ByteString
      getEndTimeBytes() {
    Object ref = endTime_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      endTime_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, message_);
    }
    if (success_ != false) {
      output.writeBool(2, success_);
    }
    if (!getErrBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, err_);
    }
    if (!getStartTimeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, startTime_);
    }
    if (!getEndTimeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, endTime_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, message_);
    }
    if (success_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, success_);
    }
    if (!getErrBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, err_);
    }
    if (!getStartTimeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, startTime_);
    }
    if (!getEndTimeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, endTime_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ExecuteResult)) {
      return super.equals(obj);
    }
    ExecuteResult other = (ExecuteResult) obj;

    if (!getMessage()
        .equals(other.getMessage())) return false;
    if (getSuccess()
        != other.getSuccess()) return false;
    if (!getErr()
        .equals(other.getErr())) return false;
    if (!getStartTime()
        .equals(other.getStartTime())) return false;
    if (!getEndTime()
        .equals(other.getEndTime())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (37 * hash) + SUCCESS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSuccess());
    hash = (37 * hash) + ERR_FIELD_NUMBER;
    hash = (53 * hash) + getErr().hashCode();
    hash = (37 * hash) + STARTTIME_FIELD_NUMBER;
    hash = (53 * hash) + getStartTime().hashCode();
    hash = (37 * hash) + ENDTIME_FIELD_NUMBER;
    hash = (53 * hash) + getEndTime().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ExecuteResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ExecuteResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ExecuteResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ExecuteResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ExecuteResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ExecuteResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ExecuteResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ExecuteResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ExecuteResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ExecuteResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ExecuteResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ExecuteResult parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ExecuteResult prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.github.cronjob.ExecuteResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.github.cronjob.ExecuteResult)
      ExecuteResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SchedularEntity.internal_static_com_github_cronjob_ExecuteResult_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SchedularEntity.internal_static_com_github_cronjob_ExecuteResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ExecuteResult.class, ExecuteResult.Builder.class);
    }

    // Construct using com.github.cronjob.protocol.entity.ExecuteResult.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      message_ = "";

      success_ = false;

      err_ = "";

      startTime_ = "";

      endTime_ = "";

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return SchedularEntity.internal_static_com_github_cronjob_ExecuteResult_descriptor;
    }

    @Override
    public ExecuteResult getDefaultInstanceForType() {
      return ExecuteResult.getDefaultInstance();
    }

    @Override
    public ExecuteResult build() {
      ExecuteResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public ExecuteResult buildPartial() {
      ExecuteResult result = new ExecuteResult(this);
      result.message_ = message_;
      result.success_ = success_;
      result.err_ = err_;
      result.startTime_ = startTime_;
      result.endTime_ = endTime_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ExecuteResult) {
        return mergeFrom((ExecuteResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ExecuteResult other) {
      if (other == ExecuteResult.getDefaultInstance()) return this;
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      if (other.getSuccess() != false) {
        setSuccess(other.getSuccess());
      }
      if (!other.getErr().isEmpty()) {
        err_ = other.err_;
        onChanged();
      }
      if (!other.getStartTime().isEmpty()) {
        startTime_ = other.startTime_;
        onChanged();
      }
      if (!other.getEndTime().isEmpty()) {
        endTime_ = other.endTime_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ExecuteResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ExecuteResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object message_ = "";
    /**
     * <pre>
     *执行结果
     * </pre>
     *
     * <code>string message = 1;</code>
     * @return The message.
     */
    public String getMessage() {
      Object ref = message_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     *执行结果
     * </pre>
     *
     * <code>string message = 1;</code>
     * @return The bytes for message.
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *执行结果
     * </pre>
     *
     * <code>string message = 1;</code>
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *执行结果
     * </pre>
     *
     * <code>string message = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMessage() {

      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *执行结果
     * </pre>
     *
     * <code>string message = 1;</code>
     * @param value The bytes for message to set.
     * @return This builder for chaining.
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      message_ = value;
      onChanged();
      return this;
    }

    private boolean success_ ;
    /**
     * <pre>
     *是否成功
     * </pre>
     *
     * <code>bool success = 2;</code>
     * @return The success.
     */
    public boolean getSuccess() {
      return success_;
    }
    /**
     * <pre>
     *是否成功
     * </pre>
     *
     * <code>bool success = 2;</code>
     * @param value The success to set.
     * @return This builder for chaining.
     */
    public Builder setSuccess(boolean value) {

      success_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *是否成功
     * </pre>
     *
     * <code>bool success = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSuccess() {

      success_ = false;
      onChanged();
      return this;
    }

    private Object err_ = "";
    /**
     * <pre>
     *错误
     * </pre>
     *
     * <code>string err = 3;</code>
     * @return The err.
     */
    public String getErr() {
      Object ref = err_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        err_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     *错误
     * </pre>
     *
     * <code>string err = 3;</code>
     * @return The bytes for err.
     */
    public com.google.protobuf.ByteString
        getErrBytes() {
      Object ref = err_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        err_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *错误
     * </pre>
     *
     * <code>string err = 3;</code>
     * @param value The err to set.
     * @return This builder for chaining.
     */
    public Builder setErr(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      err_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *错误
     * </pre>
     *
     * <code>string err = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearErr() {

      err_ = getDefaultInstance().getErr();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *错误
     * </pre>
     *
     * <code>string err = 3;</code>
     * @param value The bytes for err to set.
     * @return This builder for chaining.
     */
    public Builder setErrBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      err_ = value;
      onChanged();
      return this;
    }

    private Object startTime_ = "";
    /**
     * <pre>
     *实际开启时间
     * </pre>
     *
     * <code>string startTime = 4;</code>
     * @return The startTime.
     */
    public String getStartTime() {
      Object ref = startTime_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        startTime_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     *实际开启时间
     * </pre>
     *
     * <code>string startTime = 4;</code>
     * @return The bytes for startTime.
     */
    public com.google.protobuf.ByteString
        getStartTimeBytes() {
      Object ref = startTime_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        startTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *实际开启时间
     * </pre>
     *
     * <code>string startTime = 4;</code>
     * @param value The startTime to set.
     * @return This builder for chaining.
     */
    public Builder setStartTime(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      startTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *实际开启时间
     * </pre>
     *
     * <code>string startTime = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartTime() {

      startTime_ = getDefaultInstance().getStartTime();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *实际开启时间
     * </pre>
     *
     * <code>string startTime = 4;</code>
     * @param value The bytes for startTime to set.
     * @return This builder for chaining.
     */
    public Builder setStartTimeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      startTime_ = value;
      onChanged();
      return this;
    }

    private Object endTime_ = "";
    /**
     * <pre>
     *实际结束时间
     * </pre>
     *
     * <code>string endTime = 5;</code>
     * @return The endTime.
     */
    public String getEndTime() {
      Object ref = endTime_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        endTime_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     *实际结束时间
     * </pre>
     *
     * <code>string endTime = 5;</code>
     * @return The bytes for endTime.
     */
    public com.google.protobuf.ByteString
        getEndTimeBytes() {
      Object ref = endTime_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        endTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *实际结束时间
     * </pre>
     *
     * <code>string endTime = 5;</code>
     * @param value The endTime to set.
     * @return This builder for chaining.
     */
    public Builder setEndTime(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      endTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *实际结束时间
     * </pre>
     *
     * <code>string endTime = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearEndTime() {

      endTime_ = getDefaultInstance().getEndTime();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *实际结束时间
     * </pre>
     *
     * <code>string endTime = 5;</code>
     * @param value The bytes for endTime to set.
     * @return This builder for chaining.
     */
    public Builder setEndTimeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      endTime_ = value;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.github.cronjob.ExecuteResult)
  }

  // @@protoc_insertion_point(class_scope:com.github.cronjob.ExecuteResult)
  private static final ExecuteResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ExecuteResult();
  }

  public static ExecuteResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExecuteResult>
      PARSER = new com.google.protobuf.AbstractParser<ExecuteResult>() {
    @Override
    public ExecuteResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ExecuteResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ExecuteResult> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<ExecuteResult> getParserForType() {
    return PARSER;
  }

  @Override
  public ExecuteResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

