package com.teamviewer.chatviewmodel.swig;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class ChatConversationID {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public ChatConversationID() {
        this(ConversationIDSWIGJNI.new_ChatConversationID(), true);
    }

    public static long getCPtr(ChatConversationID chatConversationID) {
        if (chatConversationID == null) {
            return 0L;
        }
        return chatConversationID.swigCPtr;
    }

    public static ChatConversationID getInvalidConversationID() {
        long jChatConversationID_InvalidConversationID_get = ConversationIDSWIGJNI.ChatConversationID_InvalidConversationID_get();
        if (jChatConversationID_InvalidConversationID_get == 0) {
            return null;
        }
        return new ChatConversationID(jChatConversationID_InvalidConversationID_get, false);
    }

    public static long swigRelease(ChatConversationID chatConversationID) {
        if (chatConversationID != null) {
            if (chatConversationID.swigCMemOwn) {
                long j = chatConversationID.swigCPtr;
                chatConversationID.swigCMemOwn = false;
                chatConversationID.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public boolean Equal(ChatConversationID chatConversationID) {
        return ConversationIDSWIGJNI.ChatConversationID_Equal(this.swigCPtr, this, getCPtr(chatConversationID), chatConversationID);
    }

    public boolean IsTemporaryRoomForNewConversation() {
        return ConversationIDSWIGJNI.ChatConversationID_IsTemporaryRoomForNewConversation(this.swigCPtr, this);
    }

    public boolean LessThan(ChatConversationID chatConversationID) {
        return ConversationIDSWIGJNI.ChatConversationID_LessThan(this.swigCPtr, this, getCPtr(chatConversationID), chatConversationID);
    }

    public boolean NotEqual(ChatConversationID chatConversationID) {
        return ConversationIDSWIGJNI.ChatConversationID_NotEqual(this.swigCPtr, this, getCPtr(chatConversationID), chatConversationID);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ConversationIDSWIGJNI.delete_ChatConversationID(j);
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

    public ChatConversationID(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
