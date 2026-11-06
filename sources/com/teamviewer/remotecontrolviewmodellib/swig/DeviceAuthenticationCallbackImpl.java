package com.teamviewer.remotecontrolviewmodellib.swig;

import o.hk0;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
public abstract class DeviceAuthenticationCallbackImpl extends DeviceAuthenticationCallback {
    private transient long swigCPtr;

    public DeviceAuthenticationCallbackImpl() {
        this(DeviceAuthCallbackImplSWIGJNI.new_DeviceAuthenticationCallbackImpl(), true);
        DeviceAuthCallbackImplSWIGJNI.DeviceAuthenticationCallbackImpl_director_connect(this, this.swigCPtr, true, true);
    }

    public static long getCPtr(DeviceAuthenticationCallbackImpl deviceAuthenticationCallbackImpl) {
        if (deviceAuthenticationCallbackImpl == null) {
            return 0L;
        }
        return deviceAuthenticationCallbackImpl.swigCPtr;
    }

    public static long swigRelease(DeviceAuthenticationCallbackImpl deviceAuthenticationCallbackImpl) {
        if (deviceAuthenticationCallbackImpl != null) {
            if (deviceAuthenticationCallbackImpl.swigCMemOwn) {
                long j = deviceAuthenticationCallbackImpl.swigCPtr;
                deviceAuthenticationCallbackImpl.swigCMemOwn = false;
                deviceAuthenticationCallbackImpl.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public void PerformCallback(DeviceAuthenticationData deviceAuthenticationData) {
        try {
            OnCallback(deviceAuthenticationData);
        } catch (Throwable th) {
            ye4.d(getClass().getSimpleName(), th);
            throw th;
        }
    }

    @Override // com.teamviewer.remotecontrolviewmodellib.swig.DeviceAuthenticationCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    DeviceAuthCallbackImplSWIGJNI.delete_DeviceAuthenticationCallbackImpl(j);
                }
                this.swigCPtr = 0L;
            }
            super.delete();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.teamviewer.remotecontrolviewmodellib.swig.DeviceAuthenticationCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public void finalize() {
        delete();
    }

    public void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        DeviceAuthCallbackImplSWIGJNI.DeviceAuthenticationCallbackImpl_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        DeviceAuthCallbackImplSWIGJNI.DeviceAuthenticationCallbackImpl_change_ownership(this, this.swigCPtr, true);
    }

    public DeviceAuthenticationCallbackImpl(long j, boolean z) {
        super(DeviceAuthCallbackImplSWIGJNI.DeviceAuthenticationCallbackImpl_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }
}
