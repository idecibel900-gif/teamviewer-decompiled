package com.teamviewer.swigcallbacklib;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class SignalCallbackBase {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public SignalCallbackBase() {
        this(SignalCallbackBaseSWIGJNI.new_SignalCallbackBase(), true);
    }

    public static long getCPtr(SignalCallbackBase signalCallbackBase) {
        if (signalCallbackBase == null) {
            return 0L;
        }
        return signalCallbackBase.swigCPtr;
    }

    public static long swigRelease(SignalCallbackBase signalCallbackBase) {
        if (signalCallbackBase != null) {
            if (signalCallbackBase.swigCMemOwn) {
                long j = signalCallbackBase.swigCPtr;
                signalCallbackBase.swigCMemOwn = false;
                signalCallbackBase.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public void Disconnect() {
        SignalCallbackBaseSWIGJNI.SignalCallbackBase_Disconnect(this.swigCPtr, this);
    }

    public boolean IsConnected() {
        return SignalCallbackBaseSWIGJNI.SignalCallbackBase_IsConnected(this.swigCPtr, this);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    SignalCallbackBaseSWIGJNI.delete_SignalCallbackBase(j);
                }
                this.swigCPtr = 0L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void finalize() {
        delete();
    }

    public SignalCallbackBase(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
