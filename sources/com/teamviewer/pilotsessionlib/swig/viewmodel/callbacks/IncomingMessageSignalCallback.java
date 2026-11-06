package com.teamviewer.pilotsessionlib.swig.viewmodel.callbacks;

import com.teamviewer.swigcallbacklib.SignalCallbackBase;
import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public abstract class IncomingMessageSignalCallback extends SignalCallbackBase {
    private transient long swigCPtr;

    public IncomingMessageSignalCallback(long j, boolean z) {
        super(IncomingMessageSignalCallbackSWIGJNI.IncomingMessageSignalCallback_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public static long getCPtr(IncomingMessageSignalCallback incomingMessageSignalCallback) {
        if (incomingMessageSignalCallback == null) {
            return 0L;
        }
        return incomingMessageSignalCallback.swigCPtr;
    }

    public static long swigRelease(IncomingMessageSignalCallback incomingMessageSignalCallback) {
        if (incomingMessageSignalCallback != null) {
            if (incomingMessageSignalCallback.swigCMemOwn) {
                long j = incomingMessageSignalCallback.swigCPtr;
                incomingMessageSignalCallback.swigCMemOwn = false;
                incomingMessageSignalCallback.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public abstract void OnCallback(IncomingChatMessage incomingChatMessage);

    @Override // com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IncomingMessageSignalCallbackSWIGJNI.delete_IncomingMessageSignalCallback(j);
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
