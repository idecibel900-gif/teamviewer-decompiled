package com.teamviewer.commonresourcelib.swig;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class DefaultMessageViewModel {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DefaultMessageViewModel(DefaultMessageViewModel defaultMessageViewModel) {
        this(DefaultMessageViewModelSWIGJNI.new_DefaultMessageViewModel(getCPtr(defaultMessageViewModel), defaultMessageViewModel), true);
    }

    public static long getCPtr(DefaultMessageViewModel defaultMessageViewModel) {
        if (defaultMessageViewModel == null) {
            return 0L;
        }
        return defaultMessageViewModel.swigCPtr;
    }

    public static long swigRelease(DefaultMessageViewModel defaultMessageViewModel) {
        if (defaultMessageViewModel != null) {
            if (defaultMessageViewModel.swigCMemOwn) {
                long j = defaultMessageViewModel.swigCPtr;
                defaultMessageViewModel.swigCMemOwn = false;
                defaultMessageViewModel.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public IDefaultMessageButtonVector GetButtons() {
        return new IDefaultMessageButtonVector(DefaultMessageViewModelSWIGJNI.DefaultMessageViewModel_GetButtons(this.swigCPtr, this), true);
    }

    public String GetText() {
        return DefaultMessageViewModelSWIGJNI.DefaultMessageViewModel_GetText(this.swigCPtr, this);
    }

    public String GetTitle() {
        return DefaultMessageViewModelSWIGJNI.DefaultMessageViewModel_GetTitle(this.swigCPtr, this);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    DefaultMessageViewModelSWIGJNI.delete_DefaultMessageViewModel(j);
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

    public DefaultMessageViewModel(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
