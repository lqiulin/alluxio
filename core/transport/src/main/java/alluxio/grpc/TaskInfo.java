// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/job_master.proto

package alluxio.grpc;

/**
 * Protobuf type {@code alluxio.grpc.job.TaskInfo}
 */
public  final class TaskInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:alluxio.grpc.job.TaskInfo)
    TaskInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TaskInfo.newBuilder() to construct.
  private TaskInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TaskInfo() {
    jobId_ = 0L;
    taskId_ = 0;
    status_ = 0;
    errorMessage_ = "";
    result_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TaskInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            bitField0_ |= 0x00000001;
            jobId_ = input.readInt64();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            taskId_ = input.readInt32();
            break;
          }
          case 24: {
            int rawValue = input.readEnum();
            alluxio.grpc.Status value = alluxio.grpc.Status.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(3, rawValue);
            } else {
              bitField0_ |= 0x00000004;
              status_ = rawValue;
            }
            break;
          }
          case 34: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000008;
            errorMessage_ = bs;
            break;
          }
          case 42: {
            bitField0_ |= 0x00000010;
            result_ = input.readBytes();
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
    return alluxio.grpc.JobMasterProto.internal_static_alluxio_grpc_job_TaskInfo_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return alluxio.grpc.JobMasterProto.internal_static_alluxio_grpc_job_TaskInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            alluxio.grpc.TaskInfo.class, alluxio.grpc.TaskInfo.Builder.class);
  }

  private int bitField0_;
  public static final int JOBID_FIELD_NUMBER = 1;
  private long jobId_;
  /**
   * <code>optional int64 jobId = 1;</code>
   */
  public boolean hasJobId() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional int64 jobId = 1;</code>
   */
  public long getJobId() {
    return jobId_;
  }

  public static final int TASKID_FIELD_NUMBER = 2;
  private int taskId_;
  /**
   * <code>optional int32 taskId = 2;</code>
   */
  public boolean hasTaskId() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional int32 taskId = 2;</code>
   */
  public int getTaskId() {
    return taskId_;
  }

  public static final int STATUS_FIELD_NUMBER = 3;
  private int status_;
  /**
   * <code>optional .alluxio.grpc.job.Status status = 3;</code>
   */
  public boolean hasStatus() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional .alluxio.grpc.job.Status status = 3;</code>
   */
  public alluxio.grpc.Status getStatus() {
    alluxio.grpc.Status result = alluxio.grpc.Status.valueOf(status_);
    return result == null ? alluxio.grpc.Status.UNKNOWN : result;
  }

  public static final int ERRORMESSAGE_FIELD_NUMBER = 4;
  private volatile java.lang.Object errorMessage_;
  /**
   * <code>optional string errorMessage = 4;</code>
   */
  public boolean hasErrorMessage() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <code>optional string errorMessage = 4;</code>
   */
  public java.lang.String getErrorMessage() {
    java.lang.Object ref = errorMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        errorMessage_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string errorMessage = 4;</code>
   */
  public com.google.protobuf.ByteString
      getErrorMessageBytes() {
    java.lang.Object ref = errorMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      errorMessage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESULT_FIELD_NUMBER = 5;
  private com.google.protobuf.ByteString result_;
  /**
   * <code>optional bytes result = 5;</code>
   */
  public boolean hasResult() {
    return ((bitField0_ & 0x00000010) == 0x00000010);
  }
  /**
   * <code>optional bytes result = 5;</code>
   */
  public com.google.protobuf.ByteString getResult() {
    return result_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeInt64(1, jobId_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt32(2, taskId_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeEnum(3, status_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, errorMessage_);
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      output.writeBytes(5, result_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, jobId_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, taskId_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, status_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, errorMessage_);
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(5, result_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof alluxio.grpc.TaskInfo)) {
      return super.equals(obj);
    }
    alluxio.grpc.TaskInfo other = (alluxio.grpc.TaskInfo) obj;

    boolean result = true;
    result = result && (hasJobId() == other.hasJobId());
    if (hasJobId()) {
      result = result && (getJobId()
          == other.getJobId());
    }
    result = result && (hasTaskId() == other.hasTaskId());
    if (hasTaskId()) {
      result = result && (getTaskId()
          == other.getTaskId());
    }
    result = result && (hasStatus() == other.hasStatus());
    if (hasStatus()) {
      result = result && status_ == other.status_;
    }
    result = result && (hasErrorMessage() == other.hasErrorMessage());
    if (hasErrorMessage()) {
      result = result && getErrorMessage()
          .equals(other.getErrorMessage());
    }
    result = result && (hasResult() == other.hasResult());
    if (hasResult()) {
      result = result && getResult()
          .equals(other.getResult());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasJobId()) {
      hash = (37 * hash) + JOBID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getJobId());
    }
    if (hasTaskId()) {
      hash = (37 * hash) + TASKID_FIELD_NUMBER;
      hash = (53 * hash) + getTaskId();
    }
    if (hasStatus()) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + status_;
    }
    if (hasErrorMessage()) {
      hash = (37 * hash) + ERRORMESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getErrorMessage().hashCode();
    }
    if (hasResult()) {
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + getResult().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static alluxio.grpc.TaskInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.TaskInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.TaskInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.TaskInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.TaskInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.TaskInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.TaskInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.TaskInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.TaskInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static alluxio.grpc.TaskInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.TaskInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.TaskInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(alluxio.grpc.TaskInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code alluxio.grpc.job.TaskInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:alluxio.grpc.job.TaskInfo)
      alluxio.grpc.TaskInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return alluxio.grpc.JobMasterProto.internal_static_alluxio_grpc_job_TaskInfo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return alluxio.grpc.JobMasterProto.internal_static_alluxio_grpc_job_TaskInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              alluxio.grpc.TaskInfo.class, alluxio.grpc.TaskInfo.Builder.class);
    }

    // Construct using alluxio.grpc.TaskInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      jobId_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      taskId_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      status_ = 0;
      bitField0_ = (bitField0_ & ~0x00000004);
      errorMessage_ = "";
      bitField0_ = (bitField0_ & ~0x00000008);
      result_ = com.google.protobuf.ByteString.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000010);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return alluxio.grpc.JobMasterProto.internal_static_alluxio_grpc_job_TaskInfo_descriptor;
    }

    public alluxio.grpc.TaskInfo getDefaultInstanceForType() {
      return alluxio.grpc.TaskInfo.getDefaultInstance();
    }

    public alluxio.grpc.TaskInfo build() {
      alluxio.grpc.TaskInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public alluxio.grpc.TaskInfo buildPartial() {
      alluxio.grpc.TaskInfo result = new alluxio.grpc.TaskInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.jobId_ = jobId_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.taskId_ = taskId_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.status_ = status_;
      if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
        to_bitField0_ |= 0x00000008;
      }
      result.errorMessage_ = errorMessage_;
      if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
        to_bitField0_ |= 0x00000010;
      }
      result.result_ = result_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof alluxio.grpc.TaskInfo) {
        return mergeFrom((alluxio.grpc.TaskInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(alluxio.grpc.TaskInfo other) {
      if (other == alluxio.grpc.TaskInfo.getDefaultInstance()) return this;
      if (other.hasJobId()) {
        setJobId(other.getJobId());
      }
      if (other.hasTaskId()) {
        setTaskId(other.getTaskId());
      }
      if (other.hasStatus()) {
        setStatus(other.getStatus());
      }
      if (other.hasErrorMessage()) {
        bitField0_ |= 0x00000008;
        errorMessage_ = other.errorMessage_;
        onChanged();
      }
      if (other.hasResult()) {
        setResult(other.getResult());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      alluxio.grpc.TaskInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (alluxio.grpc.TaskInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long jobId_ ;
    /**
     * <code>optional int64 jobId = 1;</code>
     */
    public boolean hasJobId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int64 jobId = 1;</code>
     */
    public long getJobId() {
      return jobId_;
    }
    /**
     * <code>optional int64 jobId = 1;</code>
     */
    public Builder setJobId(long value) {
      bitField0_ |= 0x00000001;
      jobId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 jobId = 1;</code>
     */
    public Builder clearJobId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      jobId_ = 0L;
      onChanged();
      return this;
    }

    private int taskId_ ;
    /**
     * <code>optional int32 taskId = 2;</code>
     */
    public boolean hasTaskId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 taskId = 2;</code>
     */
    public int getTaskId() {
      return taskId_;
    }
    /**
     * <code>optional int32 taskId = 2;</code>
     */
    public Builder setTaskId(int value) {
      bitField0_ |= 0x00000002;
      taskId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 taskId = 2;</code>
     */
    public Builder clearTaskId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      taskId_ = 0;
      onChanged();
      return this;
    }

    private int status_ = 0;
    /**
     * <code>optional .alluxio.grpc.job.Status status = 3;</code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .alluxio.grpc.job.Status status = 3;</code>
     */
    public alluxio.grpc.Status getStatus() {
      alluxio.grpc.Status result = alluxio.grpc.Status.valueOf(status_);
      return result == null ? alluxio.grpc.Status.UNKNOWN : result;
    }
    /**
     * <code>optional .alluxio.grpc.job.Status status = 3;</code>
     */
    public Builder setStatus(alluxio.grpc.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.job.Status status = 3;</code>
     */
    public Builder clearStatus() {
      bitField0_ = (bitField0_ & ~0x00000004);
      status_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object errorMessage_ = "";
    /**
     * <code>optional string errorMessage = 4;</code>
     */
    public boolean hasErrorMessage() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional string errorMessage = 4;</code>
     */
    public java.lang.String getErrorMessage() {
      java.lang.Object ref = errorMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          errorMessage_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string errorMessage = 4;</code>
     */
    public com.google.protobuf.ByteString
        getErrorMessageBytes() {
      java.lang.Object ref = errorMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        errorMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string errorMessage = 4;</code>
     */
    public Builder setErrorMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
      errorMessage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string errorMessage = 4;</code>
     */
    public Builder clearErrorMessage() {
      bitField0_ = (bitField0_ & ~0x00000008);
      errorMessage_ = getDefaultInstance().getErrorMessage();
      onChanged();
      return this;
    }
    /**
     * <code>optional string errorMessage = 4;</code>
     */
    public Builder setErrorMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
      errorMessage_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString result_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes result = 5;</code>
     */
    public boolean hasResult() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional bytes result = 5;</code>
     */
    public com.google.protobuf.ByteString getResult() {
      return result_;
    }
    /**
     * <code>optional bytes result = 5;</code>
     */
    public Builder setResult(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes result = 5;</code>
     */
    public Builder clearResult() {
      bitField0_ = (bitField0_ & ~0x00000010);
      result_ = getDefaultInstance().getResult();
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:alluxio.grpc.job.TaskInfo)
  }

  // @@protoc_insertion_point(class_scope:alluxio.grpc.job.TaskInfo)
  private static final alluxio.grpc.TaskInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new alluxio.grpc.TaskInfo();
  }

  public static alluxio.grpc.TaskInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<TaskInfo>
      PARSER = new com.google.protobuf.AbstractParser<TaskInfo>() {
    public TaskInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TaskInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TaskInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TaskInfo> getParserForType() {
    return PARSER;
  }

  public alluxio.grpc.TaskInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

