package com.teamviewer.chatviewmodel.swig;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class ChatConversationIDSerializer {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public ChatConversationIDSerializer(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static ChatConversationID Deserialize(String str) {
        return new ChatConversationID(ChatConversationIDSerializerSWIGJNI.ChatConversationIDSerializer_Deserialize(str), true);
    }

    public static String Serialize(ChatConversationID chatConversationID) {
        return ChatConversationIDSerializerSWIGJNI.ChatConversationIDSerializer_Serialize(ChatConversationID.getCPtr(chatConversationID), chatConversationID);
    }

    public static long getCPtr(ChatConversationIDSerializer chatConversationIDSerializer) {
        if (chatConversationIDSerializer == null) {
            return 0L;
        }
        return chatConversationIDSerializer.swigCPtr;
    }

    public static long swigRelease(ChatConversationIDSerializer chatConversationIDSerializer) {
        if (chatConversationIDSerializer != null) {
            if (chatConversationIDSerializer.swigCMemOwn) {
                long j = chatConversationIDSerializer.swigCPtr;
                chatConversationIDSerializer.swigCMemOwn = false;
                chatConversationIDSerializer.delete();
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
                    ChatConversationIDSerializerSWIGJNI.delete_ChatConversationIDSerializer(j);
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
}
