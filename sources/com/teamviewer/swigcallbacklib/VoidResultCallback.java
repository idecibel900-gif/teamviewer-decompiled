package com.teamviewer.swigcallbacklib;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public abstract class VoidResultCallback extends SignalCallbackBase {
    private transient long swigCPtr;

    public VoidResultCallback(long j, boolean z) {
        super(VoidResultCallbackSWIGJNI.VoidResultCallback_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public static long getCPtr(VoidResultCallback voidResultCallback) {
        if (voidResultCallback == null) {
            return 0L;
        }
        return voidResultCallback.swigCPtr;
    }

    public static long swigRelease(VoidResultCallback voidResultCallback) {
        if (voidResultCallback != null) {
            if (voidResultCallback.swigCMemOwn) {
                long j = voidResultCallback.swigCPtr;
                voidResultCallback.swigCMemOwn = false;
                voidResultCallback.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public abstract void OnError();

    public abstract void OnSuccess();

    @Override // com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    VoidResultCallbackSWIGJNI.delete_VoidResultCallback(j);
                }
                this.swigCPtr = 0L;
            }
            super.delete();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.teamviewer.swigcallbacklib.SignalCallbackBase
    public void finalize() {
        delete();
    }
}
