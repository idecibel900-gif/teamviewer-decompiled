package com.teamviewer.swigcallbacklib;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public abstract class StringSignalCallback extends SignalCallbackBase {
    private transient long swigCPtr;

    public StringSignalCallback(long j, boolean z) {
        super(StringSignalCallbackSWIGJNI.StringSignalCallback_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public static long getCPtr(StringSignalCallback stringSignalCallback) {
        if (stringSignalCallback == null) {
            return 0L;
        }
        return stringSignalCallback.swigCPtr;
    }

    public static long swigRelease(StringSignalCallback stringSignalCallback) {
        if (stringSignalCallback != null) {
            if (stringSignalCallback.swigCMemOwn) {
                long j = stringSignalCallback.swigCPtr;
                stringSignalCallback.swigCMemOwn = false;
                stringSignalCallback.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public abstract void OnCallback(String str);

    @Override // com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    StringSignalCallbackSWIGJNI.delete_StringSignalCallback(j);
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
