package com.teamviewer.commonresourcelib.swig;

/* JADX INFO: loaded from: classes.dex */
public class IIPCMessagesViewModel {
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IIPCMessagesViewModel(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IIPCMessagesViewModel iIPCMessagesViewModel) {
        if (iIPCMessagesViewModel == null) {
            return 0L;
        }
        return iIPCMessagesViewModel.swigCPtr;
    }

    public void SetAppVisibilityBackground() {
        IIPCMessagesViewModelSWIGJNI.IIPCMessagesViewModel_SetAppVisibilityBackground(this.swigCPtr, this);
    }

    public void SetAppVisibilityForeground() {
        IIPCMessagesViewModelSWIGJNI.IIPCMessagesViewModel_SetAppVisibilityForeground(this.swigCPtr, this);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IIPCMessagesViewModelSWIGJNI.delete_IIPCMessagesViewModel(j);
                }
                this.swigCPtr = 0L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void finalize() {
        delete();
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }
}
