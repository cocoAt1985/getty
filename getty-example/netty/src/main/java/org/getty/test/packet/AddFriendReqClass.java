// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AddFriendReq.proto
package org.getty.test.packet;
public final class AddFriendReqClass {
  private AddFriendReqClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AddFriendReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AddFriendReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * ������ID
     * </pre>
     *
     * <code>optional string senderId = 1;</code>
     */
    String getSenderId();
    /**
     * <pre>
     * ������ID
     * </pre>
     *
     * <code>optional string senderId = 1;</code>
     */
    com.google.protobuf.ByteString
        getSenderIdBytes();

    /**
     * <pre>
     *���������
     * </pre>
     *
     * <code>optional string senderName = 2;</code>
     */
    String getSenderName();
    /**
     * <pre>
     *���������
     * </pre>
     *
     * <code>optional string senderName = 2;</code>
     */
    com.google.protobuf.ByteString
        getSenderNameBytes();

    /**
     * <pre>
     *������ͷ��URL
     * </pre>
     *
     * <code>optional string senderHeadImgUrl = 3;</code>
     */
    String getSenderHeadImgUrl();
    /**
     * <pre>
     *������ͷ��URL
     * </pre>
     *
     * <code>optional string senderHeadImgUrl = 3;</code>
     */
    com.google.protobuf.ByteString
        getSenderHeadImgUrlBytes();

    /**
     * <pre>
     * ������ID
     * </pre>
     *
     * <code>optional string receiverId = 4;</code>
     */
    String getReceiverId();
    /**
     * <pre>
     * ������ID
     * </pre>
     *
     * <code>optional string receiverId = 4;</code>
     */
    com.google.protobuf.ByteString
        getReceiverIdBytes();

    /**
     * <pre>
     *��Ϣ����
     * </pre>
     *
     * <code>optional int32 msgType = 5;</code>
     */
    int getMsgType();

    /**
     * <pre>
     *��Ϣ��
     * </pre>
     *
     * <code>optional string body = 6;</code>
     */
    String getBody();
    /**
     * <pre>
     *��Ϣ��
     * </pre>
     *
     * <code>optional string body = 6;</code>
     */
    com.google.protobuf.ByteString
        getBodyBytes();
  }
  /**
   * Protobuf type {@code AddFriendReq}
   */
  public  static final class AddFriendReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AddFriendReq)
      AddFriendReqOrBuilder {
    // Use AddFriendReq.newBuilder() to construct.
    private AddFriendReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AddFriendReq() {
      senderId_ = "";
      senderName_ = "";
      senderHeadImgUrl_ = "";
      receiverId_ = "";
      msgType_ = 0;
      body_ = "";
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private AddFriendReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              String s = input.readStringRequireUtf8();

              senderId_ = s;
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();

              senderName_ = s;
              break;
            }
            case 26: {
              String s = input.readStringRequireUtf8();

              senderHeadImgUrl_ = s;
              break;
            }
            case 34: {
              String s = input.readStringRequireUtf8();

              receiverId_ = s;
              break;
            }
            case 40: {

              msgType_ = input.readInt32();
              break;
            }
            case 50: {
              String s = input.readStringRequireUtf8();

              body_ = s;
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
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return AddFriendReqClass.internal_static_AddFriendReq_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return AddFriendReqClass.internal_static_AddFriendReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AddFriendReq.class, Builder.class);
    }

    public static final int SENDERID_FIELD_NUMBER = 1;
    private volatile Object senderId_;
    /**
     * <pre>
     * ������ID
     * </pre>
     *
     * <code>optional string senderId = 1;</code>
     */
    public String getSenderId() {
      Object ref = senderId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        senderId_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * ������ID
     * </pre>
     *
     * <code>optional string senderId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSenderIdBytes() {
      Object ref = senderId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        senderId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SENDERNAME_FIELD_NUMBER = 2;
    private volatile Object senderName_;
    /**
     * <pre>
     *���������
     * </pre>
     *
     * <code>optional string senderName = 2;</code>
     */
    public String getSenderName() {
      Object ref = senderName_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        senderName_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *���������
     * </pre>
     *
     * <code>optional string senderName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getSenderNameBytes() {
      Object ref = senderName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        senderName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SENDERHEADIMGURL_FIELD_NUMBER = 3;
    private volatile Object senderHeadImgUrl_;
    /**
     * <pre>
     *������ͷ��URL
     * </pre>
     *
     * <code>optional string senderHeadImgUrl = 3;</code>
     */
    public String getSenderHeadImgUrl() {
      Object ref = senderHeadImgUrl_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        senderHeadImgUrl_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *������ͷ��URL
     * </pre>
     *
     * <code>optional string senderHeadImgUrl = 3;</code>
     */
    public com.google.protobuf.ByteString
        getSenderHeadImgUrlBytes() {
      Object ref = senderHeadImgUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        senderHeadImgUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RECEIVERID_FIELD_NUMBER = 4;
    private volatile Object receiverId_;
    /**
     * <pre>
     * ������ID
     * </pre>
     *
     * <code>optional string receiverId = 4;</code>
     */
    public String getReceiverId() {
      Object ref = receiverId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        receiverId_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * ������ID
     * </pre>
     *
     * <code>optional string receiverId = 4;</code>
     */
    public com.google.protobuf.ByteString
        getReceiverIdBytes() {
      Object ref = receiverId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        receiverId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MSGTYPE_FIELD_NUMBER = 5;
    private int msgType_;
    /**
     * <pre>
     *��Ϣ����
     * </pre>
     *
     * <code>optional int32 msgType = 5;</code>
     */
    public int getMsgType() {
      return msgType_;
    }

    public static final int BODY_FIELD_NUMBER = 6;
    private volatile Object body_;
    /**
     * <pre>
     *��Ϣ��
     * </pre>
     *
     * <code>optional string body = 6;</code>
     */
    public String getBody() {
      Object ref = body_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        body_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *��Ϣ��
     * </pre>
     *
     * <code>optional string body = 6;</code>
     */
    public com.google.protobuf.ByteString
        getBodyBytes() {
      Object ref = body_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        body_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!getSenderIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, senderId_);
      }
      if (!getSenderNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, senderName_);
      }
      if (!getSenderHeadImgUrlBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, senderHeadImgUrl_);
      }
      if (!getReceiverIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, receiverId_);
      }
      if (msgType_ != 0) {
        output.writeInt32(5, msgType_);
      }
      if (!getBodyBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, body_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getSenderIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, senderId_);
      }
      if (!getSenderNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, senderName_);
      }
      if (!getSenderHeadImgUrlBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, senderHeadImgUrl_);
      }
      if (!getReceiverIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, receiverId_);
      }
      if (msgType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, msgType_);
      }
      if (!getBodyBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, body_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof AddFriendReq)) {
        return super.equals(obj);
      }
      AddFriendReq other = (AddFriendReq) obj;

      boolean result = true;
      result = result && getSenderId()
          .equals(other.getSenderId());
      result = result && getSenderName()
          .equals(other.getSenderName());
      result = result && getSenderHeadImgUrl()
          .equals(other.getSenderHeadImgUrl());
      result = result && getReceiverId()
          .equals(other.getReceiverId());
      result = result && (getMsgType()
          == other.getMsgType());
      result = result && getBody()
          .equals(other.getBody());
      return result;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + SENDERID_FIELD_NUMBER;
      hash = (53 * hash) + getSenderId().hashCode();
      hash = (37 * hash) + SENDERNAME_FIELD_NUMBER;
      hash = (53 * hash) + getSenderName().hashCode();
      hash = (37 * hash) + SENDERHEADIMGURL_FIELD_NUMBER;
      hash = (53 * hash) + getSenderHeadImgUrl().hashCode();
      hash = (37 * hash) + RECEIVERID_FIELD_NUMBER;
      hash = (53 * hash) + getReceiverId().hashCode();
      hash = (37 * hash) + MSGTYPE_FIELD_NUMBER;
      hash = (53 * hash) + getMsgType();
      hash = (37 * hash) + BODY_FIELD_NUMBER;
      hash = (53 * hash) + getBody().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static AddFriendReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AddFriendReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AddFriendReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AddFriendReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AddFriendReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static AddFriendReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static AddFriendReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static AddFriendReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static AddFriendReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static AddFriendReq parseFrom(
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
    public static Builder newBuilder(AddFriendReq prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code AddFriendReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AddFriendReq)
        AddFriendReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return AddFriendReqClass.internal_static_AddFriendReq_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return AddFriendReqClass.internal_static_AddFriendReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                AddFriendReq.class, Builder.class);
      }

      // Construct using AddFriendReqClass.AddFriendReq.newBuilder()
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
        senderId_ = "";

        senderName_ = "";

        senderHeadImgUrl_ = "";

        receiverId_ = "";

        msgType_ = 0;

        body_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return AddFriendReqClass.internal_static_AddFriendReq_descriptor;
      }

      public AddFriendReq getDefaultInstanceForType() {
        return AddFriendReq.getDefaultInstance();
      }

      public AddFriendReq build() {
        AddFriendReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public AddFriendReq buildPartial() {
        AddFriendReq result = new AddFriendReq(this);
        result.senderId_ = senderId_;
        result.senderName_ = senderName_;
        result.senderHeadImgUrl_ = senderHeadImgUrl_;
        result.receiverId_ = receiverId_;
        result.msgType_ = msgType_;
        result.body_ = body_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
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
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof AddFriendReq) {
          return mergeFrom((AddFriendReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(AddFriendReq other) {
        if (other == AddFriendReq.getDefaultInstance()) return this;
        if (!other.getSenderId().isEmpty()) {
          senderId_ = other.senderId_;
          onChanged();
        }
        if (!other.getSenderName().isEmpty()) {
          senderName_ = other.senderName_;
          onChanged();
        }
        if (!other.getSenderHeadImgUrl().isEmpty()) {
          senderHeadImgUrl_ = other.senderHeadImgUrl_;
          onChanged();
        }
        if (!other.getReceiverId().isEmpty()) {
          receiverId_ = other.receiverId_;
          onChanged();
        }
        if (other.getMsgType() != 0) {
          setMsgType(other.getMsgType());
        }
        if (!other.getBody().isEmpty()) {
          body_ = other.body_;
          onChanged();
        }
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
        AddFriendReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (AddFriendReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private Object senderId_ = "";
      /**
       * <pre>
       * ������ID
       * </pre>
       *
       * <code>optional string senderId = 1;</code>
       */
      public String getSenderId() {
        Object ref = senderId_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          senderId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <pre>
       * ������ID
       * </pre>
       *
       * <code>optional string senderId = 1;</code>
       */
      public com.google.protobuf.ByteString
          getSenderIdBytes() {
        Object ref = senderId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          senderId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * ������ID
       * </pre>
       *
       * <code>optional string senderId = 1;</code>
       */
      public Builder setSenderId(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        senderId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * ������ID
       * </pre>
       *
       * <code>optional string senderId = 1;</code>
       */
      public Builder clearSenderId() {
        
        senderId_ = getDefaultInstance().getSenderId();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * ������ID
       * </pre>
       *
       * <code>optional string senderId = 1;</code>
       */
      public Builder setSenderIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        senderId_ = value;
        onChanged();
        return this;
      }

      private Object senderName_ = "";
      /**
       * <pre>
       *���������
       * </pre>
       *
       * <code>optional string senderName = 2;</code>
       */
      public String getSenderName() {
        Object ref = senderName_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          senderName_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <pre>
       *���������
       * </pre>
       *
       * <code>optional string senderName = 2;</code>
       */
      public com.google.protobuf.ByteString
          getSenderNameBytes() {
        Object ref = senderName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          senderName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *���������
       * </pre>
       *
       * <code>optional string senderName = 2;</code>
       */
      public Builder setSenderName(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        senderName_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *���������
       * </pre>
       *
       * <code>optional string senderName = 2;</code>
       */
      public Builder clearSenderName() {
        
        senderName_ = getDefaultInstance().getSenderName();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *���������
       * </pre>
       *
       * <code>optional string senderName = 2;</code>
       */
      public Builder setSenderNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        senderName_ = value;
        onChanged();
        return this;
      }

      private Object senderHeadImgUrl_ = "";
      /**
       * <pre>
       *������ͷ��URL
       * </pre>
       *
       * <code>optional string senderHeadImgUrl = 3;</code>
       */
      public String getSenderHeadImgUrl() {
        Object ref = senderHeadImgUrl_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          senderHeadImgUrl_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <pre>
       *������ͷ��URL
       * </pre>
       *
       * <code>optional string senderHeadImgUrl = 3;</code>
       */
      public com.google.protobuf.ByteString
          getSenderHeadImgUrlBytes() {
        Object ref = senderHeadImgUrl_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          senderHeadImgUrl_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *������ͷ��URL
       * </pre>
       *
       * <code>optional string senderHeadImgUrl = 3;</code>
       */
      public Builder setSenderHeadImgUrl(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        senderHeadImgUrl_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *������ͷ��URL
       * </pre>
       *
       * <code>optional string senderHeadImgUrl = 3;</code>
       */
      public Builder clearSenderHeadImgUrl() {
        
        senderHeadImgUrl_ = getDefaultInstance().getSenderHeadImgUrl();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *������ͷ��URL
       * </pre>
       *
       * <code>optional string senderHeadImgUrl = 3;</code>
       */
      public Builder setSenderHeadImgUrlBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        senderHeadImgUrl_ = value;
        onChanged();
        return this;
      }

      private Object receiverId_ = "";
      /**
       * <pre>
       * ������ID
       * </pre>
       *
       * <code>optional string receiverId = 4;</code>
       */
      public String getReceiverId() {
        Object ref = receiverId_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          receiverId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <pre>
       * ������ID
       * </pre>
       *
       * <code>optional string receiverId = 4;</code>
       */
      public com.google.protobuf.ByteString
          getReceiverIdBytes() {
        Object ref = receiverId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          receiverId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * ������ID
       * </pre>
       *
       * <code>optional string receiverId = 4;</code>
       */
      public Builder setReceiverId(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        receiverId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * ������ID
       * </pre>
       *
       * <code>optional string receiverId = 4;</code>
       */
      public Builder clearReceiverId() {
        
        receiverId_ = getDefaultInstance().getReceiverId();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * ������ID
       * </pre>
       *
       * <code>optional string receiverId = 4;</code>
       */
      public Builder setReceiverIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        receiverId_ = value;
        onChanged();
        return this;
      }

      private int msgType_ ;
      /**
       * <pre>
       *��Ϣ����
       * </pre>
       *
       * <code>optional int32 msgType = 5;</code>
       */
      public int getMsgType() {
        return msgType_;
      }
      /**
       * <pre>
       *��Ϣ����
       * </pre>
       *
       * <code>optional int32 msgType = 5;</code>
       */
      public Builder setMsgType(int value) {
        
        msgType_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *��Ϣ����
       * </pre>
       *
       * <code>optional int32 msgType = 5;</code>
       */
      public Builder clearMsgType() {
        
        msgType_ = 0;
        onChanged();
        return this;
      }

      private Object body_ = "";
      /**
       * <pre>
       *��Ϣ��
       * </pre>
       *
       * <code>optional string body = 6;</code>
       */
      public String getBody() {
        Object ref = body_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          body_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <pre>
       *��Ϣ��
       * </pre>
       *
       * <code>optional string body = 6;</code>
       */
      public com.google.protobuf.ByteString
          getBodyBytes() {
        Object ref = body_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          body_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *��Ϣ��
       * </pre>
       *
       * <code>optional string body = 6;</code>
       */
      public Builder setBody(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        body_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *��Ϣ��
       * </pre>
       *
       * <code>optional string body = 6;</code>
       */
      public Builder clearBody() {
        
        body_ = getDefaultInstance().getBody();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *��Ϣ��
       * </pre>
       *
       * <code>optional string body = 6;</code>
       */
      public Builder setBodyBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        body_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:AddFriendReq)
    }

    // @@protoc_insertion_point(class_scope:AddFriendReq)
    private static final AddFriendReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new AddFriendReq();
    }

    public static AddFriendReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AddFriendReq>
        PARSER = new com.google.protobuf.AbstractParser<AddFriendReq>() {
      public AddFriendReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new AddFriendReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AddFriendReq> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<AddFriendReq> getParserForType() {
      return PARSER;
    }

    public AddFriendReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AddFriendReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AddFriendReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\022AddFriendReq.proto\032\031google/protobuf/an" +
      "y.proto\"\201\001\n\014AddFriendReq\022\020\n\010senderId\030\001 \001" +
      "(\t\022\022\n\nsenderName\030\002 \001(\t\022\030\n\020senderHeadImgU" +
      "rl\030\003 \001(\t\022\022\n\nreceiverId\030\004 \001(\t\022\017\n\007msgType\030" +
      "\005 \001(\005\022\014\n\004body\030\006 \001(\tB\023B\021AddFriendReqClass" +
      "b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
        }, assigner);
    internal_static_AddFriendReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AddFriendReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AddFriendReq_descriptor,
        new String[] { "SenderId", "SenderName", "SenderHeadImgUrl", "ReceiverId", "MsgType", "Body", });
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}