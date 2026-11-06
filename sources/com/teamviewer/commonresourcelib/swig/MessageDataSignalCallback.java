package com.teamviewer.commonresourcelib.swig;

import com.teamviewer.swigcallbacklib.SignalCallbackBase;
import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public abstract class MessageDataSignalCallback extends SignalCallbackBase {
    private transient long swigCPtr;

    public MessageDataSignalCallback(long j, boolean z) {
        super(MessageDataSignalCallbackSWIGJNI.MessageDataSignalCallback_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public static long getCPtr(MessageDataSignalCallback messageDataSignalCallback) {
        if (messageDataSignalCallback == null) {
            return 0L;
        }
        return messageDataSignalCallback.swigCPtr;
    }

    public static long swigRelease(MessageDataSignalCallback messageDataSignalCallback) {
        if (messageDataSignalCallback != null) {
            if (messageDataSignalCallback.swigCMemOwn) {
                long j = messageDataSignalCallback.swigCPtr;
                messageDataSignalCallback.swigCMemOwn = false;
                messageDataSignalCallback.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public abstract void OnCallback(DefaultMessageViewModel defaultMessageViewModel);

    @Override // com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    MessageDataSignalCallbackSWIGJNI.delete_MessageDataSignalCallback(j);
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
