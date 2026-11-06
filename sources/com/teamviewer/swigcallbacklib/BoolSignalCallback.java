package com.teamviewer.swigcallbacklib;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public abstract class BoolSignalCallback extends SignalCallbackBase {
    private transient long swigCPtr;

    public BoolSignalCallback(long j, boolean z) {
        super(BoolSignalCallbackSWIGJNI.BoolSignalCallback_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public static long getCPtr(BoolSignalCallback boolSignalCallback) {
        if (boolSignalCallback == null) {
            return 0L;
        }
        return boolSignalCallback.swigCPtr;
    }

    public static long swigRelease(BoolSignalCallback boolSignalCallback) {
        if (boolSignalCallback != null) {
            if (boolSignalCallback.swigCMemOwn) {
                long j = boolSignalCallback.swigCPtr;
                boolSignalCallback.swigCMemOwn = false;
                boolSignalCallback.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public abstract void OnCallback(boolean z);

    @Override // com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    BoolSignalCallbackSWIGJNI.delete_BoolSignalCallback(j);
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
