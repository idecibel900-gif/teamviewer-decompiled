package com.teamviewer.chatviewmodel.swig;

import o.hk0;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
public abstract class ListChangeSignalCallbackImpl extends ListChangeSignalCallback {
    private transient long swigCPtr;

    public ListChangeSignalCallbackImpl() {
        this(ListChangeSignalCallbackImplSWIGJNI.new_ListChangeSignalCallbackImpl(), true);
        ListChangeSignalCallbackImplSWIGJNI.ListChangeSignalCallbackImpl_director_connect(this, this.swigCPtr, true, true);
    }

    public static long getCPtr(ListChangeSignalCallbackImpl listChangeSignalCallbackImpl) {
        if (listChangeSignalCallbackImpl == null) {
            return 0L;
        }
        return listChangeSignalCallbackImpl.swigCPtr;
    }

    public static long swigRelease(ListChangeSignalCallbackImpl listChangeSignalCallbackImpl) {
        if (listChangeSignalCallbackImpl != null) {
            if (listChangeSignalCallbackImpl.swigCMemOwn) {
                long j = listChangeSignalCallbackImpl.swigCPtr;
                listChangeSignalCallbackImpl.swigCMemOwn = false;
                listChangeSignalCallbackImpl.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public void PerformCallback(ListChangeArgs listChangeArgs) {
        try {
            OnCallback(listChangeArgs);
        } catch (Throwable th) {
            ye4.d(getClass().getSimpleName(), th);
            throw th;
        }
    }

    @Override // com.teamviewer.chatviewmodel.swig.ListChangeSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ListChangeSignalCallbackImplSWIGJNI.delete_ListChangeSignalCallbackImpl(j);
                }
                this.swigCPtr = 0L;
            }
            super.delete();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.teamviewer.chatviewmodel.swig.ListChangeSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public void finalize() {
        delete();
    }

    public void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        ListChangeSignalCallbackImplSWIGJNI.ListChangeSignalCallbackImpl_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        ListChangeSignalCallbackImplSWIGJNI.ListChangeSignalCallbackImpl_change_ownership(this, this.swigCPtr, true);
    }

    public ListChangeSignalCallbackImpl(long j, boolean z) {
        super(ListChangeSignalCallbackImplSWIGJNI.ListChangeSignalCallbackImpl_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }
}
