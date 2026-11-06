package com.teamviewer.remotecontrolviewmodellib.swig;

import com.teamviewer.swigcallbacklib.SignalCallbackBase;
import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public abstract class TrustedDeviceRequestPayloadSignalCallback extends SignalCallbackBase {
    private transient long swigCPtr;

    public TrustedDeviceRequestPayloadSignalCallback(long j, boolean z) {
        super(TrustedDeviceRequestPayloadSignalCallbackSWIGJNI.TrustedDeviceRequestPayloadSignalCallback_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public static long getCPtr(TrustedDeviceRequestPayloadSignalCallback trustedDeviceRequestPayloadSignalCallback) {
        if (trustedDeviceRequestPayloadSignalCallback == null) {
            return 0L;
        }
        return trustedDeviceRequestPayloadSignalCallback.swigCPtr;
    }

    public static long swigRelease(TrustedDeviceRequestPayloadSignalCallback trustedDeviceRequestPayloadSignalCallback) {
        if (trustedDeviceRequestPayloadSignalCallback != null) {
            if (trustedDeviceRequestPayloadSignalCallback.swigCMemOwn) {
                long j = trustedDeviceRequestPayloadSignalCallback.swigCPtr;
                trustedDeviceRequestPayloadSignalCallback.swigCMemOwn = false;
                trustedDeviceRequestPayloadSignalCallback.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public abstract void OnCallback(TrustedDeviceRequestPayloadNative trustedDeviceRequestPayloadNative);

    @Override // com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    TrustedDeviceRequestPayloadSignalCallbackSWIGJNI.delete_TrustedDeviceRequestPayloadSignalCallback(j);
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
