package com.teamviewer.commonresourcelib.swig;

import o.hk0;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
public abstract class MessageDataSignalCallbackImpl extends MessageDataSignalCallback {
    private transient long swigCPtr;

    public MessageDataSignalCallbackImpl() {
        this(MessageDataSignalCallbackImplSWIGJNI.new_MessageDataSignalCallbackImpl(), true);
        MessageDataSignalCallbackImplSWIGJNI.MessageDataSignalCallbackImpl_director_connect(this, this.swigCPtr, true, true);
    }

    public static long getCPtr(MessageDataSignalCallbackImpl messageDataSignalCallbackImpl) {
        if (messageDataSignalCallbackImpl == null) {
            return 0L;
        }
        return messageDataSignalCallbackImpl.swigCPtr;
    }

    public static long swigRelease(MessageDataSignalCallbackImpl messageDataSignalCallbackImpl) {
        if (messageDataSignalCallbackImpl != null) {
            if (messageDataSignalCallbackImpl.swigCMemOwn) {
                long j = messageDataSignalCallbackImpl.swigCPtr;
                messageDataSignalCallbackImpl.swigCMemOwn = false;
                messageDataSignalCallbackImpl.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public void PerformCallback(DefaultMessageViewModel defaultMessageViewModel) {
        try {
            OnCallback(defaultMessageViewModel);
        } catch (Throwable th) {
            ye4.d(getClass().getSimpleName(), th);
            throw th;
        }
    }

    @Override // com.teamviewer.commonresourcelib.swig.MessageDataSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    MessageDataSignalCallbackImplSWIGJNI.delete_MessageDataSignalCallbackImpl(j);
                }
                this.swigCPtr = 0L;
            }
            super.delete();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.teamviewer.commonresourcelib.swig.MessageDataSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public void finalize() {
        delete();
    }

    public void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        MessageDataSignalCallbackImplSWIGJNI.MessageDataSignalCallbackImpl_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        MessageDataSignalCallbackImplSWIGJNI.MessageDataSignalCallbackImpl_change_ownership(this, this.swigCPtr, true);
    }

    public MessageDataSignalCallbackImpl(long j, boolean z) {
        super(MessageDataSignalCallbackImplSWIGJNI.MessageDataSignalCallbackImpl_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }
}
