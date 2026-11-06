package com.teamviewer.chatviewmodel.swig;

import com.teamviewer.swigcallbacklib.SignalCallbackBase;
import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public abstract class NewMessageSignalCallback extends SignalCallbackBase {
    private transient long swigCPtr;

    public NewMessageSignalCallback(long j, boolean z) {
        super(NewMessageSignalCallbackSWIGJNI.NewMessageSignalCallback_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public static long getCPtr(NewMessageSignalCallback newMessageSignalCallback) {
        if (newMessageSignalCallback == null) {
            return 0L;
        }
        return newMessageSignalCallback.swigCPtr;
    }

    public static long swigRelease(NewMessageSignalCallback newMessageSignalCallback) {
        if (newMessageSignalCallback != null) {
            if (newMessageSignalCallback.swigCMemOwn) {
                long j = newMessageSignalCallback.swigCPtr;
                newMessageSignalCallback.swigCMemOwn = false;
                newMessageSignalCallback.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public abstract void OnCallback(MessageData messageData);

    @Override // com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    NewMessageSignalCallbackSWIGJNI.delete_NewMessageSignalCallback(j);
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
