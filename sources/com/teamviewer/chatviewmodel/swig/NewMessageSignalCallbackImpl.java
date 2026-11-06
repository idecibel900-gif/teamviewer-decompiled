package com.teamviewer.chatviewmodel.swig;

import o.hk0;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
public abstract class NewMessageSignalCallbackImpl extends NewMessageSignalCallback {
    private transient long swigCPtr;

    public NewMessageSignalCallbackImpl() {
        this(NewMessageSignalCallbackImplSWIGJNI.new_NewMessageSignalCallbackImpl(), true);
        NewMessageSignalCallbackImplSWIGJNI.NewMessageSignalCallbackImpl_director_connect(this, this.swigCPtr, true, true);
    }

    public static long getCPtr(NewMessageSignalCallbackImpl newMessageSignalCallbackImpl) {
        if (newMessageSignalCallbackImpl == null) {
            return 0L;
        }
        return newMessageSignalCallbackImpl.swigCPtr;
    }

    public static long swigRelease(NewMessageSignalCallbackImpl newMessageSignalCallbackImpl) {
        if (newMessageSignalCallbackImpl != null) {
            if (newMessageSignalCallbackImpl.swigCMemOwn) {
                long j = newMessageSignalCallbackImpl.swigCPtr;
                newMessageSignalCallbackImpl.swigCMemOwn = false;
                newMessageSignalCallbackImpl.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public void PerformCallback(MessageData messageData) {
        try {
            OnCallback(messageData);
        } catch (Throwable th) {
            ye4.d(getClass().getSimpleName(), th);
            throw th;
        }
    }

    @Override // com.teamviewer.chatviewmodel.swig.NewMessageSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    NewMessageSignalCallbackImplSWIGJNI.delete_NewMessageSignalCallbackImpl(j);
                }
                this.swigCPtr = 0L;
            }
            super.delete();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.teamviewer.chatviewmodel.swig.NewMessageSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public void finalize() {
        delete();
    }

    public void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        NewMessageSignalCallbackImplSWIGJNI.NewMessageSignalCallbackImpl_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        NewMessageSignalCallbackImplSWIGJNI.NewMessageSignalCallbackImpl_change_ownership(this, this.swigCPtr, true);
    }

    public NewMessageSignalCallbackImpl(long j, boolean z) {
        super(NewMessageSignalCallbackImplSWIGJNI.NewMessageSignalCallbackImpl_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }
}
