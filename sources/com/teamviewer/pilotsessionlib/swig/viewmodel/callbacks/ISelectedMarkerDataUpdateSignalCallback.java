package com.teamviewer.pilotsessionlib.swig.viewmodel.callbacks;

import com.teamviewer.swigcallbacklib.SignalCallbackBase;
import o.hk0;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
public abstract class ISelectedMarkerDataUpdateSignalCallback extends SignalCallbackBase {
    private transient long swigCPtr;

    public ISelectedMarkerDataUpdateSignalCallback() {
        this(ISelectedMarkerDataUpdateSignalCallbackSWIGJNI.new_ISelectedMarkerDataUpdateSignalCallback(), true);
        ISelectedMarkerDataUpdateSignalCallbackSWIGJNI.ISelectedMarkerDataUpdateSignalCallback_director_connect(this, this.swigCPtr, true, true);
    }

    public static long getCPtr(ISelectedMarkerDataUpdateSignalCallback iSelectedMarkerDataUpdateSignalCallback) {
        if (iSelectedMarkerDataUpdateSignalCallback == null) {
            return 0L;
        }
        return iSelectedMarkerDataUpdateSignalCallback.swigCPtr;
    }

    public static long swigRelease(ISelectedMarkerDataUpdateSignalCallback iSelectedMarkerDataUpdateSignalCallback) {
        if (iSelectedMarkerDataUpdateSignalCallback != null) {
            if (iSelectedMarkerDataUpdateSignalCallback.swigCMemOwn) {
                long j = iSelectedMarkerDataUpdateSignalCallback.swigCPtr;
                iSelectedMarkerDataUpdateSignalCallback.swigCMemOwn = false;
                iSelectedMarkerDataUpdateSignalCallback.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public abstract void OnCallback(MarkerData markerData);

    public void PerformCallback(MarkerData markerData) {
        try {
            OnCallback(markerData);
        } catch (Throwable th) {
            ye4.d("ISelectedMarkerDataUpdateSignalCallback", th);
            throw th;
        }
    }

    @Override // com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ISelectedMarkerDataUpdateSignalCallbackSWIGJNI.delete_ISelectedMarkerDataUpdateSignalCallback(j);
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

    public void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        ISelectedMarkerDataUpdateSignalCallbackSWIGJNI.ISelectedMarkerDataUpdateSignalCallback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        ISelectedMarkerDataUpdateSignalCallbackSWIGJNI.ISelectedMarkerDataUpdateSignalCallback_change_ownership(this, this.swigCPtr, true);
    }

    public ISelectedMarkerDataUpdateSignalCallback(long j, boolean z) {
        super(ISelectedMarkerDataUpdateSignalCallbackSWIGJNI.ISelectedMarkerDataUpdateSignalCallback_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }
}
