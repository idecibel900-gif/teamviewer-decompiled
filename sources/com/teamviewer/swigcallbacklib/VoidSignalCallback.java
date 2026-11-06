package com.teamviewer.swigcallbacklib;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public abstract class VoidSignalCallback extends SignalCallbackBase {
    private transient long swigCPtr;

    public VoidSignalCallback(long j, boolean z) {
        super(VoidSignalCallbackSWIGJNI.VoidSignalCallback_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public static long getCPtr(VoidSignalCallback voidSignalCallback) {
        if (voidSignalCallback == null) {
            return 0L;
        }
        return voidSignalCallback.swigCPtr;
    }

    public static long swigRelease(VoidSignalCallback voidSignalCallback) {
        if (voidSignalCallback != null) {
            if (voidSignalCallback.swigCMemOwn) {
                long j = voidSignalCallback.swigCPtr;
                voidSignalCallback.swigCMemOwn = false;
                voidSignalCallback.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public abstract void OnCallback();

    @Override // com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    VoidSignalCallbackSWIGJNI.delete_VoidSignalCallback(j);
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
