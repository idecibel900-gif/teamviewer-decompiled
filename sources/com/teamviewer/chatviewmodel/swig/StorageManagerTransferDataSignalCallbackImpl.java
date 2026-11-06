package com.teamviewer.chatviewmodel.swig;

import o.hk0;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
public abstract class StorageManagerTransferDataSignalCallbackImpl extends StorageManagerTransferDataSignalCallback {
    private transient long swigCPtr;

    public StorageManagerTransferDataSignalCallbackImpl() {
        this(StorageManagerTransferDataSignalCallbackImplSWIGJNI.new_StorageManagerTransferDataSignalCallbackImpl(), true);
        StorageManagerTransferDataSignalCallbackImplSWIGJNI.StorageManagerTransferDataSignalCallbackImpl_director_connect(this, this.swigCPtr, true, true);
    }

    public static long getCPtr(StorageManagerTransferDataSignalCallbackImpl storageManagerTransferDataSignalCallbackImpl) {
        if (storageManagerTransferDataSignalCallbackImpl == null) {
            return 0L;
        }
        return storageManagerTransferDataSignalCallbackImpl.swigCPtr;
    }

    public static long swigRelease(StorageManagerTransferDataSignalCallbackImpl storageManagerTransferDataSignalCallbackImpl) {
        if (storageManagerTransferDataSignalCallbackImpl != null) {
            if (storageManagerTransferDataSignalCallbackImpl.swigCMemOwn) {
                long j = storageManagerTransferDataSignalCallbackImpl.swigCPtr;
                storageManagerTransferDataSignalCallbackImpl.swigCMemOwn = false;
                storageManagerTransferDataSignalCallbackImpl.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public void PerformCallback(StorageManagerTransferData storageManagerTransferData) {
        try {
            OnCallback(storageManagerTransferData);
        } catch (Throwable th) {
            ye4.d(getClass().getSimpleName(), th);
            throw th;
        }
    }

    @Override // com.teamviewer.chatviewmodel.swig.StorageManagerTransferDataSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    StorageManagerTransferDataSignalCallbackImplSWIGJNI.delete_StorageManagerTransferDataSignalCallbackImpl(j);
                }
                this.swigCPtr = 0L;
            }
            super.delete();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.teamviewer.chatviewmodel.swig.StorageManagerTransferDataSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public void finalize() {
        delete();
    }

    public void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        StorageManagerTransferDataSignalCallbackImplSWIGJNI.StorageManagerTransferDataSignalCallbackImpl_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        StorageManagerTransferDataSignalCallbackImplSWIGJNI.StorageManagerTransferDataSignalCallbackImpl_change_ownership(this, this.swigCPtr, true);
    }

    public StorageManagerTransferDataSignalCallbackImpl(long j, boolean z) {
        super(StorageManagerTransferDataSignalCallbackImplSWIGJNI.StorageManagerTransferDataSignalCallbackImpl_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }
}
