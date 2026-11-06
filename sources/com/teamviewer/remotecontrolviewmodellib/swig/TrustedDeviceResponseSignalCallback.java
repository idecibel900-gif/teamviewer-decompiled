package com.teamviewer.remotecontrolviewmodellib.swig;

import com.teamviewer.swigcallbacklib.SignalCallbackBase;
import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public abstract class TrustedDeviceResponseSignalCallback extends SignalCallbackBase {
    private transient long swigCPtr;

    public TrustedDeviceResponseSignalCallback(long j, boolean z) {
        super(TrustedDeviceResponseSignalCallbackSWIGJNI.TrustedDeviceResponseSignalCallback_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public static long getCPtr(TrustedDeviceResponseSignalCallback trustedDeviceResponseSignalCallback) {
        if (trustedDeviceResponseSignalCallback == null) {
            return 0L;
        }
        return trustedDeviceResponseSignalCallback.swigCPtr;
    }

    public static long swigRelease(TrustedDeviceResponseSignalCallback trustedDeviceResponseSignalCallback) {
        if (trustedDeviceResponseSignalCallback != null) {
            if (trustedDeviceResponseSignalCallback.swigCMemOwn) {
                long j = trustedDeviceResponseSignalCallback.swigCPtr;
                trustedDeviceResponseSignalCallback.swigCMemOwn = false;
                trustedDeviceResponseSignalCallback.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public abstract void OnCallback(ResponseCode responseCode);

    @Override // com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    TrustedDeviceResponseSignalCallbackSWIGJNI.delete_TrustedDeviceResponseSignalCallback(j);
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
