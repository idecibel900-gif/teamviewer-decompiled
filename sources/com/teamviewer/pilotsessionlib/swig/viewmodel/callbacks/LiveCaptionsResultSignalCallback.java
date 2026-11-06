package com.teamviewer.pilotsessionlib.swig.viewmodel.callbacks;

import com.teamviewer.swigcallbacklib.SignalCallbackBase;
import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public abstract class LiveCaptionsResultSignalCallback extends SignalCallbackBase {
    private transient long swigCPtr;

    public LiveCaptionsResultSignalCallback(long j, boolean z) {
        super(LiveCaptionsResultSignalCallbackSWIGJNI.LiveCaptionsResultSignalCallback_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public static long getCPtr(LiveCaptionsResultSignalCallback liveCaptionsResultSignalCallback) {
        if (liveCaptionsResultSignalCallback == null) {
            return 0L;
        }
        return liveCaptionsResultSignalCallback.swigCPtr;
    }

    public static long swigRelease(LiveCaptionsResultSignalCallback liveCaptionsResultSignalCallback) {
        if (liveCaptionsResultSignalCallback != null) {
            if (liveCaptionsResultSignalCallback.swigCMemOwn) {
                long j = liveCaptionsResultSignalCallback.swigCPtr;
                liveCaptionsResultSignalCallback.swigCMemOwn = false;
                liveCaptionsResultSignalCallback.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public abstract void OnCallback(LiveCaptionsResult liveCaptionsResult);

    @Override // com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    LiveCaptionsResultSignalCallbackSWIGJNI.delete_LiveCaptionsResultSignalCallback(j);
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
