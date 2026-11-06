package com.teamviewer.commonviewmodel.swig;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class IAccountLoginErrorResultCallback {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IAccountLoginErrorResultCallback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IAccountLoginErrorResultCallback iAccountLoginErrorResultCallback) {
        if (iAccountLoginErrorResultCallback == null) {
            return 0L;
        }
        return iAccountLoginErrorResultCallback.swigCPtr;
    }

    public static long swigRelease(IAccountLoginErrorResultCallback iAccountLoginErrorResultCallback) {
        if (iAccountLoginErrorResultCallback != null) {
            if (iAccountLoginErrorResultCallback.swigCMemOwn) {
                long j = iAccountLoginErrorResultCallback.swigCPtr;
                iAccountLoginErrorResultCallback.swigCMemOwn = false;
                iAccountLoginErrorResultCallback.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public void OnActivationExpired(String str) {
        IAccountLoginErrorResultCallbackSWIGJNI.IAccountLoginErrorResultCallback_OnActivationExpired(this.swigCPtr, this, str);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IAccountLoginErrorResultCallbackSWIGJNI.delete_IAccountLoginErrorResultCallback(j);
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
