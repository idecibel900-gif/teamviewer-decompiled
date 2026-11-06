package com.teamviewer.pilotsessionlib.swig.viewmodel.callbacks;

import o.hk0;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
public abstract class IncomingSystemMessageSignalCallbackImpl extends IncomingSystemMessageSignalCallback {
    private transient long swigCPtr;

    public IncomingSystemMessageSignalCallbackImpl() {
        this(IncomingSystemMessageSignalCallbackImplSWIGJNI.new_IncomingSystemMessageSignalCallbackImpl(), true);
        IncomingSystemMessageSignalCallbackImplSWIGJNI.IncomingSystemMessageSignalCallbackImpl_director_connect(this, this.swigCPtr, true, true);
    }

    public static long getCPtr(IncomingSystemMessageSignalCallbackImpl incomingSystemMessageSignalCallbackImpl) {
        if (incomingSystemMessageSignalCallbackImpl == null) {
            return 0L;
        }
        return incomingSystemMessageSignalCallbackImpl.swigCPtr;
    }

    public static long swigRelease(IncomingSystemMessageSignalCallbackImpl incomingSystemMessageSignalCallbackImpl) {
        if (incomingSystemMessageSignalCallbackImpl != null) {
            if (incomingSystemMessageSignalCallbackImpl.swigCMemOwn) {
                long j = incomingSystemMessageSignalCallbackImpl.swigCPtr;
                incomingSystemMessageSignalCallbackImpl.swigCMemOwn = false;
                incomingSystemMessageSignalCallbackImpl.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public void PerformCallback(IncomingSystemMessage incomingSystemMessage) {
        try {
            OnCallback(incomingSystemMessage);
        } catch (Throwable th) {
            ye4.d(getClass().getSimpleName(), th);
            throw th;
        }
    }

    @Override // com.teamviewer.pilotsessionlib.swig.viewmodel.callbacks.IncomingSystemMessageSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IncomingSystemMessageSignalCallbackImplSWIGJNI.delete_IncomingSystemMessageSignalCallbackImpl(j);
                }
                this.swigCPtr = 0L;
            }
            super.delete();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.teamviewer.pilotsessionlib.swig.viewmodel.callbacks.IncomingSystemMessageSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public void finalize() {
        delete();
    }

    public void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        IncomingSystemMessageSignalCallbackImplSWIGJNI.IncomingSystemMessageSignalCallbackImpl_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        IncomingSystemMessageSignalCallbackImplSWIGJNI.IncomingSystemMessageSignalCallbackImpl_change_ownership(this, this.swigCPtr, true);
    }

    public IncomingSystemMessageSignalCallbackImpl(long j, boolean z) {
        super(IncomingSystemMessageSignalCallbackImplSWIGJNI.IncomingSystemMessageSignalCallbackImpl_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }
}
