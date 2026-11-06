package com.teamviewer.chatviewmodel.swig;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class IConnectionInfoCallback {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IConnectionInfoCallback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IConnectionInfoCallback iConnectionInfoCallback) {
        if (iConnectionInfoCallback == null) {
            return 0L;
        }
        return iConnectionInfoCallback.swigCPtr;
    }

    public static long swigRelease(IConnectionInfoCallback iConnectionInfoCallback) {
        if (iConnectionInfoCallback != null) {
            if (iConnectionInfoCallback.swigCMemOwn) {
                long j = iConnectionInfoCallback.swigCPtr;
                iConnectionInfoCallback.swigCMemOwn = false;
                iConnectionInfoCallback.delete();
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
                    IConnectionInfoCallbackSWIGJNI.delete_IConnectionInfoCallback(j);
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
