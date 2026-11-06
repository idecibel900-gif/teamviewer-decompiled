package com.teamviewer.remotecontrolviewmodellib.swig;

import com.teamviewer.swigcallbacklib.SignalCallbackBase;
import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public abstract class DeviceAuthenticationCallback extends SignalCallbackBase {
    private transient long swigCPtr;

    public DeviceAuthenticationCallback(long j, boolean z) {
        super(DeviceAuthCallbackSWIGJNI.DeviceAuthenticationCallback_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public static long getCPtr(DeviceAuthenticationCallback deviceAuthenticationCallback) {
        if (deviceAuthenticationCallback == null) {
            return 0L;
        }
        return deviceAuthenticationCallback.swigCPtr;
    }

    public static long swigRelease(DeviceAuthenticationCallback deviceAuthenticationCallback) {
        if (deviceAuthenticationCallback != null) {
            if (deviceAuthenticationCallback.swigCMemOwn) {
                long j = deviceAuthenticationCallback.swigCPtr;
                deviceAuthenticationCallback.swigCMemOwn = false;
                deviceAuthenticationCallback.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public abstract void OnCallback(DeviceAuthenticationData deviceAuthenticationData);

    @Override // com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    DeviceAuthCallbackSWIGJNI.delete_DeviceAuthenticationCallback(j);
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
