package com.teamviewer.chatviewmodel.swig;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class MessageData {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public MessageData() {
        this(MessageDataSWIGJNI.new_MessageData(), true);
    }

    public static long getCPtr(MessageData messageData) {
        if (messageData == null) {
            return 0L;
        }
        return messageData.swigCPtr;
    }

    public static long swigRelease(MessageData messageData) {
        if (messageData != null) {
            if (messageData.swigCMemOwn) {
                long j = messageData.swigCPtr;
                messageData.swigCMemOwn = false;
                messageData.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    MessageDataSWIGJNI.delete_MessageData(j);
                }
                this.swigCPtr = 0L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void finalize() {
        delete();
    }

    public String getChatRoomId() {
        return MessageDataSWIGJNI.MessageData_chatRoomId_get(this.swigCPtr, this);
    }

    public String getSenderDisplayName() {
        return MessageDataSWIGJNI.MessageData_senderDisplayName_get(this.swigCPtr, this);
    }

    public void setChatRoomId(String str) {
        MessageDataSWIGJNI.MessageData_chatRoomId_set(this.swigCPtr, this, str);
    }

    public void setSenderDisplayName(String str) {
        MessageDataSWIGJNI.MessageData_senderDisplayName_set(this.swigCPtr, this, str);
    }

    public MessageData(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
