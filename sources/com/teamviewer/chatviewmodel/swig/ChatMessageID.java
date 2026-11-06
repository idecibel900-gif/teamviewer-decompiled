package com.teamviewer.chatviewmodel.swig;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class ChatMessageID {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public ChatMessageID() {
        this(ChatMessageIDSWIGJNI.new_ChatMessageID(), true);
    }

    public static long getCPtr(ChatMessageID chatMessageID) {
        if (chatMessageID == null) {
            return 0L;
        }
        return chatMessageID.swigCPtr;
    }

    public static long swigRelease(ChatMessageID chatMessageID) {
        if (chatMessageID != null) {
            if (chatMessageID.swigCMemOwn) {
                long j = chatMessageID.swigCPtr;
                chatMessageID.swigCMemOwn = false;
                chatMessageID.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public boolean Equal(ChatMessageID chatMessageID) {
        return ChatMessageIDSWIGJNI.ChatMessageID_Equal(this.swigCPtr, this, getCPtr(chatMessageID), chatMessageID);
    }

    public ChatMessageUITypes GetType() {
        return ChatMessageUITypes.swigToEnum(ChatMessageIDSWIGJNI.ChatMessageID_GetType(this.swigCPtr, this));
    }

    public boolean LessThan(ChatMessageID chatMessageID) {
        return ChatMessageIDSWIGJNI.ChatMessageID_LessThan(this.swigCPtr, this, getCPtr(chatMessageID), chatMessageID);
    }

    public boolean NotEqual(ChatMessageID chatMessageID) {
        return ChatMessageIDSWIGJNI.ChatMessageID_NotEqual(this.swigCPtr, this, getCPtr(chatMessageID), chatMessageID);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ChatMessageIDSWIGJNI.delete_ChatMessageID(j);
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

    public ChatMessageID(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
