package com.teamviewer.pilotsessionlib.swig.viewmodel.callbacks;

import com.teamviewer.swigcallbacklib.SignalCallbackBase;
import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public abstract class IncomingSystemMessageSignalCallback extends SignalCallbackBase {
    private transient long swigCPtr;

    public IncomingSystemMessageSignalCallback(long j, boolean z) {
        super(IncomingSystemMessageSignalCallbackSWIGJNI.IncomingSystemMessageSignalCallback_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public static long getCPtr(IncomingSystemMessageSignalCallback incomingSystemMessageSignalCallback) {
        if (incomingSystemMessageSignalCallback == null) {
            return 0L;
        }
        return incomingSystemMessageSignalCallback.swigCPtr;
    }

    public static long swigRelease(IncomingSystemMessageSignalCallback incomingSystemMessageSignalCallback) {
        if (incomingSystemMessageSignalCallback != null) {
            if (incomingSystemMessageSignalCallback.swigCMemOwn) {
                long j = incomingSystemMessageSignalCallback.swigCPtr;
                incomingSystemMessageSignalCallback.swigCMemOwn = false;
                incomingSystemMessageSignalCallback.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public abstract void OnCallback(IncomingSystemMessage incomingSystemMessage);

    @Override // com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IncomingSystemMessageSignalCallbackSWIGJNI.delete_IncomingSystemMessageSignalCallback(j);
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
