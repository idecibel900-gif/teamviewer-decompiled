package com.teamviewer.remotecontrolviewmodellib.swig;

import com.teamviewer.swigcallbacklib.SignalCallbackBase;
import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public abstract class ConditionalAccessAuthenticationPayloadSignalCallback extends SignalCallbackBase {
    private transient long swigCPtr;

    public ConditionalAccessAuthenticationPayloadSignalCallback(long j, boolean z) {
        super(ConditionalAccessAuthPayloadSignalCallbackSWIGJNI.ConditionalAccessAuthenticationPayloadSignalCallback_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public static long getCPtr(ConditionalAccessAuthenticationPayloadSignalCallback conditionalAccessAuthenticationPayloadSignalCallback) {
        if (conditionalAccessAuthenticationPayloadSignalCallback == null) {
            return 0L;
        }
        return conditionalAccessAuthenticationPayloadSignalCallback.swigCPtr;
    }

    public static long swigRelease(ConditionalAccessAuthenticationPayloadSignalCallback conditionalAccessAuthenticationPayloadSignalCallback) {
        if (conditionalAccessAuthenticationPayloadSignalCallback != null) {
            if (conditionalAccessAuthenticationPayloadSignalCallback.swigCMemOwn) {
                long j = conditionalAccessAuthenticationPayloadSignalCallback.swigCPtr;
                conditionalAccessAuthenticationPayloadSignalCallback.swigCMemOwn = false;
                conditionalAccessAuthenticationPayloadSignalCallback.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public abstract void OnCallback(ConditionalAccessAuthenticationPayloadNative conditionalAccessAuthenticationPayloadNative);

    @Override // com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ConditionalAccessAuthPayloadSignalCallbackSWIGJNI.delete_ConditionalAccessAuthenticationPayloadSignalCallback(j);
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
