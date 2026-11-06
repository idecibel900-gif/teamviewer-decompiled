package com.teamviewer.pilotsessionlib.swig.viewmodel.callbacks;

import o.hk0;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
public abstract class LiveCaptionsResultSignalCallbackImpl extends LiveCaptionsResultSignalCallback {
    private transient long swigCPtr;

    public LiveCaptionsResultSignalCallbackImpl() {
        this(LiveCaptionsResultSignalCallbackImplSWIGJNI.new_LiveCaptionsResultSignalCallbackImpl(), true);
        LiveCaptionsResultSignalCallbackImplSWIGJNI.LiveCaptionsResultSignalCallbackImpl_director_connect(this, this.swigCPtr, true, true);
    }

    public static long getCPtr(LiveCaptionsResultSignalCallbackImpl liveCaptionsResultSignalCallbackImpl) {
        if (liveCaptionsResultSignalCallbackImpl == null) {
            return 0L;
        }
        return liveCaptionsResultSignalCallbackImpl.swigCPtr;
    }

    public static long swigRelease(LiveCaptionsResultSignalCallbackImpl liveCaptionsResultSignalCallbackImpl) {
        if (liveCaptionsResultSignalCallbackImpl != null) {
            if (liveCaptionsResultSignalCallbackImpl.swigCMemOwn) {
                long j = liveCaptionsResultSignalCallbackImpl.swigCPtr;
                liveCaptionsResultSignalCallbackImpl.swigCMemOwn = false;
                liveCaptionsResultSignalCallbackImpl.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public void PerformCallback(LiveCaptionsResult liveCaptionsResult) {
        try {
            OnCallback(liveCaptionsResult);
        } catch (Throwable th) {
            ye4.d(getClass().getSimpleName(), th);
            throw th;
        }
    }

    @Override // com.teamviewer.pilotsessionlib.swig.viewmodel.callbacks.LiveCaptionsResultSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    LiveCaptionsResultSignalCallbackImplSWIGJNI.delete_LiveCaptionsResultSignalCallbackImpl(j);
                }
                this.swigCPtr = 0L;
            }
            super.delete();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.teamviewer.pilotsessionlib.swig.viewmodel.callbacks.LiveCaptionsResultSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public void finalize() {
        delete();
    }

    public void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        LiveCaptionsResultSignalCallbackImplSWIGJNI.LiveCaptionsResultSignalCallbackImpl_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        LiveCaptionsResultSignalCallbackImplSWIGJNI.LiveCaptionsResultSignalCallbackImpl_change_ownership(this, this.swigCPtr, true);
    }

    public LiveCaptionsResultSignalCallbackImpl(long j, boolean z) {
        super(LiveCaptionsResultSignalCallbackImplSWIGJNI.LiveCaptionsResultSignalCallbackImpl_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }
}
