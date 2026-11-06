package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

import com.teamviewer.swigcallbacklib.SignalCallbackBase;
import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public abstract class RemoteAccessEndpointActivationSignalCallback extends SignalCallbackBase {
    private transient long swigCPtr;

    public RemoteAccessEndpointActivationSignalCallback(long j, boolean z) {
        super(RemoteAccessEndpointActivationSignalCallbackSWIGJNI.RemoteAccessEndpointActivationSignalCallback_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public static long getCPtr(RemoteAccessEndpointActivationSignalCallback remoteAccessEndpointActivationSignalCallback) {
        if (remoteAccessEndpointActivationSignalCallback == null) {
            return 0L;
        }
        return remoteAccessEndpointActivationSignalCallback.swigCPtr;
    }

    public static long swigRelease(RemoteAccessEndpointActivationSignalCallback remoteAccessEndpointActivationSignalCallback) {
        if (remoteAccessEndpointActivationSignalCallback != null) {
            if (remoteAccessEndpointActivationSignalCallback.swigCMemOwn) {
                long j = remoteAccessEndpointActivationSignalCallback.swigCPtr;
                remoteAccessEndpointActivationSignalCallback.swigCMemOwn = false;
                remoteAccessEndpointActivationSignalCallback.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public abstract void OnCallback(EndpointActivationResponseCode endpointActivationResponseCode);

    @Override // com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    RemoteAccessEndpointActivationSignalCallbackSWIGJNI.delete_RemoteAccessEndpointActivationSignalCallback(j);
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
