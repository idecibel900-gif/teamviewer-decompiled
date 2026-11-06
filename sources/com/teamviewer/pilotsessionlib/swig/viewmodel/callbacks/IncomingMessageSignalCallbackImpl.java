package com.teamviewer.pilotsessionlib.swig.viewmodel.callbacks;

import o.hk0;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
public abstract class IncomingMessageSignalCallbackImpl extends IncomingMessageSignalCallback {
    private transient long swigCPtr;

    public IncomingMessageSignalCallbackImpl() {
        this(IncomingMessageSignalCallbackImplSWIGJNI.new_IncomingMessageSignalCallbackImpl(), true);
        IncomingMessageSignalCallbackImplSWIGJNI.IncomingMessageSignalCallbackImpl_director_connect(this, this.swigCPtr, true, true);
    }

    public static long getCPtr(IncomingMessageSignalCallbackImpl incomingMessageSignalCallbackImpl) {
        if (incomingMessageSignalCallbackImpl == null) {
            return 0L;
        }
        return incomingMessageSignalCallbackImpl.swigCPtr;
    }

    public static long swigRelease(IncomingMessageSignalCallbackImpl incomingMessageSignalCallbackImpl) {
        if (incomingMessageSignalCallbackImpl != null) {
            if (incomingMessageSignalCallbackImpl.swigCMemOwn) {
                long j = incomingMessageSignalCallbackImpl.swigCPtr;
                incomingMessageSignalCallbackImpl.swigCMemOwn = false;
                incomingMessageSignalCallbackImpl.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public void PerformCallback(IncomingChatMessage incomingChatMessage) {
        try {
            OnCallback(incomingChatMessage);
        } catch (Throwable th) {
            ye4.d(getClass().getSimpleName(), th);
            throw th;
        }
    }

    @Override // com.teamviewer.pilotsessionlib.swig.viewmodel.callbacks.IncomingMessageSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IncomingMessageSignalCallbackImplSWIGJNI.delete_IncomingMessageSignalCallbackImpl(j);
                }
                this.swigCPtr = 0L;
            }
            super.delete();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.teamviewer.pilotsessionlib.swig.viewmodel.callbacks.IncomingMessageSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public void finalize() {
        delete();
    }

    public void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        IncomingMessageSignalCallbackImplSWIGJNI.IncomingMessageSignalCallbackImpl_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        IncomingMessageSignalCallbackImplSWIGJNI.IncomingMessageSignalCallbackImpl_change_ownership(this, this.swigCPtr, true);
    }

    public IncomingMessageSignalCallbackImpl(long j, boolean z) {
        super(IncomingMessageSignalCallbackImplSWIGJNI.IncomingMessageSignalCallbackImpl_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }
}
