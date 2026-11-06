package com.teamviewer.swigcallbacklib;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public abstract class UnsignedIntSignalCallback extends SignalCallbackBase {
    private transient long swigCPtr;

    public UnsignedIntSignalCallback(long j, boolean z) {
        super(UnsignedIntSignalCallbackSWIGJNI.UnsignedIntSignalCallback_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public static long getCPtr(UnsignedIntSignalCallback unsignedIntSignalCallback) {
        if (unsignedIntSignalCallback == null) {
            return 0L;
        }
        return unsignedIntSignalCallback.swigCPtr;
    }

    public static long swigRelease(UnsignedIntSignalCallback unsignedIntSignalCallback) {
        if (unsignedIntSignalCallback != null) {
            if (unsignedIntSignalCallback.swigCMemOwn) {
                long j = unsignedIntSignalCallback.swigCPtr;
                unsignedIntSignalCallback.swigCMemOwn = false;
                unsignedIntSignalCallback.delete();
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
                    UnsignedIntSignalCallbackSWIGJNI.delete_UnsignedIntSignalCallback(j);
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
