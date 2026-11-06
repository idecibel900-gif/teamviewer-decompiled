package com.teamviewer.swigcallbacklib;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public abstract class IntSignalCallback extends SignalCallbackBase {
    private transient long swigCPtr;

    public IntSignalCallback(long j, boolean z) {
        super(IntSignalCallbackSWIGJNI.IntSignalCallback_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public static long getCPtr(IntSignalCallback intSignalCallback) {
        if (intSignalCallback == null) {
            return 0L;
        }
        return intSignalCallback.swigCPtr;
    }

    public static long swigRelease(IntSignalCallback intSignalCallback) {
        if (intSignalCallback != null) {
            if (intSignalCallback.swigCMemOwn) {
                long j = intSignalCallback.swigCPtr;
                intSignalCallback.swigCMemOwn = false;
                intSignalCallback.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public abstract void OnCallback(int i);

    @Override // com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IntSignalCallbackSWIGJNI.delete_IntSignalCallback(j);
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
