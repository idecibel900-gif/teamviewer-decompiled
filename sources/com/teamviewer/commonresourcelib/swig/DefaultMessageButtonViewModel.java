package com.teamviewer.commonresourcelib.swig;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class DefaultMessageButtonViewModel {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DefaultMessageButtonViewModel(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DefaultMessageButtonViewModel defaultMessageButtonViewModel) {
        if (defaultMessageButtonViewModel == null) {
            return 0L;
        }
        return defaultMessageButtonViewModel.swigCPtr;
    }

    public static long swigRelease(DefaultMessageButtonViewModel defaultMessageButtonViewModel) {
        if (defaultMessageButtonViewModel != null) {
            if (defaultMessageButtonViewModel.swigCMemOwn) {
                long j = defaultMessageButtonViewModel.swigCPtr;
                defaultMessageButtonViewModel.swigCMemOwn = false;
                defaultMessageButtonViewModel.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public boolean Active() {
        return DefaultMessageButtonViewModelSWIGJNI.DefaultMessageButtonViewModel_Active(this.swigCPtr, this);
    }

    public void Execute() {
        DefaultMessageButtonViewModelSWIGJNI.DefaultMessageButtonViewModel_Execute(this.swigCPtr, this);
    }

    public long GetIndex() {
        return DefaultMessageButtonViewModelSWIGJNI.DefaultMessageButtonViewModel_GetIndex(this.swigCPtr, this);
    }

    public String GetText() {
        return DefaultMessageButtonViewModelSWIGJNI.DefaultMessageButtonViewModel_GetText(this.swigCPtr, this);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    DefaultMessageButtonViewModelSWIGJNI.delete_DefaultMessageButtonViewModel(j);
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
}
