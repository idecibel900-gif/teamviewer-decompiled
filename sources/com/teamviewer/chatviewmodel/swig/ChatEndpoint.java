package com.teamviewer.chatviewmodel.swig;

import java.math.BigInteger;
import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class ChatEndpoint {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public ChatEndpoint(long j, SWIGTYPE_p_ChatEndpointType sWIGTYPE_p_ChatEndpointType) {
        this(ChatDataSWIGJNI.new_ChatEndpoint__SWIG_1(j, SWIGTYPE_p_ChatEndpointType.getCPtr(sWIGTYPE_p_ChatEndpointType)), true);
    }

    public static boolean TryUnpack(BigInteger bigInteger, ChatEndpoint chatEndpoint) {
        return ChatDataSWIGJNI.ChatEndpoint_TryUnpack(bigInteger, getCPtr(chatEndpoint), chatEndpoint);
    }

    public static ChatEndpoint Unpack(BigInteger bigInteger) {
        return new ChatEndpoint(ChatDataSWIGJNI.ChatEndpoint_Unpack(bigInteger), true);
    }

    public static long getCPtr(ChatEndpoint chatEndpoint) {
        if (chatEndpoint == null) {
            return 0L;
        }
        return chatEndpoint.swigCPtr;
    }

    public static long swigRelease(ChatEndpoint chatEndpoint) {
        if (chatEndpoint != null) {
            if (chatEndpoint.swigCMemOwn) {
                long j = chatEndpoint.swigCPtr;
                chatEndpoint.swigCMemOwn = false;
                chatEndpoint.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public boolean Equal(ChatEndpoint chatEndpoint) {
        return ChatDataSWIGJNI.ChatEndpoint_Equal(this.swigCPtr, this, getCPtr(chatEndpoint), chatEndpoint);
    }

    public boolean IsAccount() {
        return ChatDataSWIGJNI.ChatEndpoint_IsAccount(this.swigCPtr, this);
    }

    public boolean IsMachine() {
        return ChatDataSWIGJNI.ChatEndpoint_IsMachine(this.swigCPtr, this);
    }

    public boolean IsSessionCode() {
        return ChatDataSWIGJNI.ChatEndpoint_IsSessionCode(this.swigCPtr, this);
    }

    public boolean IsValid() {
        return ChatDataSWIGJNI.ChatEndpoint_IsValid(this.swigCPtr, this);
    }

    public boolean LessThan(ChatEndpoint chatEndpoint) {
        return ChatDataSWIGJNI.ChatEndpoint_LessThan(this.swigCPtr, this, getCPtr(chatEndpoint), chatEndpoint);
    }

    public boolean NotEqual(ChatEndpoint chatEndpoint) {
        return ChatDataSWIGJNI.ChatEndpoint_NotEqual(this.swigCPtr, this, getCPtr(chatEndpoint), chatEndpoint);
    }

    public BigInteger Pack() {
        return ChatDataSWIGJNI.ChatEndpoint_Pack(this.swigCPtr, this);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ChatDataSWIGJNI.delete_ChatEndpoint(j);
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

    public long getId() {
        return ChatDataSWIGJNI.ChatEndpoint_Id_get(this.swigCPtr, this);
    }

    public SWIGTYPE_p_ChatEndpointType getType() {
        return new SWIGTYPE_p_ChatEndpointType(ChatDataSWIGJNI.ChatEndpoint_Type_get(this.swigCPtr, this), true);
    }

    public void setId(long j) {
        ChatDataSWIGJNI.ChatEndpoint_Id_set(this.swigCPtr, this, j);
    }

    public void setType(SWIGTYPE_p_ChatEndpointType sWIGTYPE_p_ChatEndpointType) {
        ChatDataSWIGJNI.ChatEndpoint_Type_set(this.swigCPtr, this, SWIGTYPE_p_ChatEndpointType.getCPtr(sWIGTYPE_p_ChatEndpointType));
    }

    public ChatEndpoint() {
        this(ChatDataSWIGJNI.new_ChatEndpoint__SWIG_0(), true);
    }

    public ChatEndpoint(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
