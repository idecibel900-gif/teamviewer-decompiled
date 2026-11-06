package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

import o.hk0;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
public abstract class RemoteAccessEndpointActivationSignalCallbackImpl extends RemoteAccessEndpointActivationSignalCallback {
    private transient long swigCPtr;

    public RemoteAccessEndpointActivationSignalCallbackImpl() {
        this(RemoteAccessEndpointActivationSignalCallbackImplSWIGJNI.new_RemoteAccessEndpointActivationSignalCallbackImpl(), true);
        RemoteAccessEndpointActivationSignalCallbackImplSWIGJNI.RemoteAccessEndpointActivationSignalCallbackImpl_director_connect(this, this.swigCPtr, true, true);
    }

    public static long getCPtr(RemoteAccessEndpointActivationSignalCallbackImpl remoteAccessEndpointActivationSignalCallbackImpl) {
        if (remoteAccessEndpointActivationSignalCallbackImpl == null) {
            return 0L;
        }
        return remoteAccessEndpointActivationSignalCallbackImpl.swigCPtr;
    }

    public static long swigRelease(RemoteAccessEndpointActivationSignalCallbackImpl remoteAccessEndpointActivationSignalCallbackImpl) {
        if (remoteAccessEndpointActivationSignalCallbackImpl != null) {
            if (remoteAccessEndpointActivationSignalCallbackImpl.swigCMemOwn) {
                long j = remoteAccessEndpointActivationSignalCallbackImpl.swigCPtr;
                remoteAccessEndpointActivationSignalCallbackImpl.swigCMemOwn = false;
                remoteAccessEndpointActivationSignalCallbackImpl.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public void PerformCallback(EndpointActivationResponseCode endpointActivationResponseCode) {
        try {
            OnCallback(endpointActivationResponseCode);
        } catch (Throwable th) {
            ye4.d(getClass().getSimpleName(), th);
            throw th;
        }
    }

    @Override // com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.RemoteAccessEndpointActivationSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    RemoteAccessEndpointActivationSignalCallbackImplSWIGJNI.delete_RemoteAccessEndpointActivationSignalCallbackImpl(j);
                }
                this.swigCPtr = 0L;
            }
            super.delete();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.RemoteAccessEndpointActivationSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public void finalize() {
        delete();
    }

    public void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        RemoteAccessEndpointActivationSignalCallbackImplSWIGJNI.RemoteAccessEndpointActivationSignalCallbackImpl_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        RemoteAccessEndpointActivationSignalCallbackImplSWIGJNI.RemoteAccessEndpointActivationSignalCallbackImpl_change_ownership(this, this.swigCPtr, true);
    }

    public RemoteAccessEndpointActivationSignalCallbackImpl(long j, boolean z) {
        super(RemoteAccessEndpointActivationSignalCallbackImplSWIGJNI.RemoteAccessEndpointActivationSignalCallbackImpl_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }
}
