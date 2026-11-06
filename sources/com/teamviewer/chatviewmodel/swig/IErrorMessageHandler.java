package com.teamviewer.chatviewmodel.swig;

/* JADX INFO: loaded from: classes.dex */
public class IErrorMessageHandler {
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IErrorMessageHandler(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IErrorMessageHandler iErrorMessageHandler) {
        if (iErrorMessageHandler == null) {
            return 0L;
        }
        return iErrorMessageHandler.swigCPtr;
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IErrorMessageHandlerSWIGJNI.delete_IErrorMessageHandler(j);
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
