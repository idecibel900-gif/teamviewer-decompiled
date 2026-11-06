package com.teamviewer.swigcallbacklib;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public abstract class DoubleSignalCallback extends SignalCallbackBase {
    private transient long swigCPtr;

    public DoubleSignalCallback(long j, boolean z) {
        super(DoubleSignalCallbackSWIGJNI.DoubleSignalCallback_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public static long getCPtr(DoubleSignalCallback doubleSignalCallback) {
        if (doubleSignalCallback == null) {
            return 0L;
        }
        return doubleSignalCallback.swigCPtr;
    }

    public static long swigRelease(DoubleSignalCallback doubleSignalCallback) {
        if (doubleSignalCallback != null) {
            if (doubleSignalCallback.swigCMemOwn) {
                long j = doubleSignalCallback.swigCPtr;
                doubleSignalCallback.swigCMemOwn = false;
                doubleSignalCallback.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public abstract void OnCallback(double d);

    @Override // com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    DoubleSignalCallbackSWIGJNI.delete_DoubleSignalCallback(j);
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
