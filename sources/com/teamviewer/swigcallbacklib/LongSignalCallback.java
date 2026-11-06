package com.teamviewer.swigcallbacklib;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public abstract class LongSignalCallback extends SignalCallbackBase {
    private transient long swigCPtr;

    public LongSignalCallback(long j, boolean z) {
        super(LongSignalCallbackSWIGJNI.LongSignalCallback_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public static long getCPtr(LongSignalCallback longSignalCallback) {
        if (longSignalCallback == null) {
            return 0L;
        }
        return longSignalCallback.swigCPtr;
    }

    public static long swigRelease(LongSignalCallback longSignalCallback) {
        if (longSignalCallback != null) {
            if (longSignalCallback.swigCMemOwn) {
                long j = longSignalCallback.swigCPtr;
                longSignalCallback.swigCMemOwn = false;
                longSignalCallback.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public abstract void OnCallback(long j);

    @Override // com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    LongSignalCallbackSWIGJNI.delete_LongSignalCallback(j);
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
