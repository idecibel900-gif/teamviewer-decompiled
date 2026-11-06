package com.teamviewer.chatviewmodel.swig;

/* JADX INFO: loaded from: classes.dex */
public class IUnreadChatMessageHandler {
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IUnreadChatMessageHandler(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IUnreadChatMessageHandler iUnreadChatMessageHandler) {
        if (iUnreadChatMessageHandler == null) {
            return 0L;
        }
        return iUnreadChatMessageHandler.swigCPtr;
    }

    public long GetNumberOfUnreadMessages() {
        return IUnreadChatMessageHandlerSWIGJNI.IUnreadChatMessageHandler_GetNumberOfUnreadMessages(this.swigCPtr, this);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IUnreadChatMessageHandlerSWIGJNI.delete_IUnreadChatMessageHandler(j);
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

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }
}
