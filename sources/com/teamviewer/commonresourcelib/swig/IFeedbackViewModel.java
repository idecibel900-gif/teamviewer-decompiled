package com.teamviewer.commonresourcelib.swig;

import com.teamviewer.swigcallbacklib.BoolSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public class IFeedbackViewModel {
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IFeedbackViewModel(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IFeedbackViewModel iFeedbackViewModel) {
        if (iFeedbackViewModel == null) {
            return 0L;
        }
        return iFeedbackViewModel.swigCPtr;
    }

    public void SetCategory(String str) {
        IFeedbackViewModelSWIGJNI.IFeedbackViewModel_SetCategory(this.swigCPtr, this, str);
    }

    public void SetComment(String str) {
        IFeedbackViewModelSWIGJNI.IFeedbackViewModel_SetComment(this.swigCPtr, this, str);
    }

    public void SetEmail(String str) {
        IFeedbackViewModelSWIGJNI.IFeedbackViewModel_SetEmail(this.swigCPtr, this, str);
    }

    public void SetIsARSupported(boolean z) {
        IFeedbackViewModelSWIGJNI.IFeedbackViewModel_SetIsARSupported(this.swigCPtr, this, z);
    }

    public void SetLogFileAttached(boolean z) {
        IFeedbackViewModelSWIGJNI.IFeedbackViewModel_SetLogFileAttached(this.swigCPtr, this, z);
    }

    public void SetRating(int i) {
        IFeedbackViewModelSWIGJNI.IFeedbackViewModel_SetRating(this.swigCPtr, this, i);
    }

    public void SetSubcategory(String str) {
        IFeedbackViewModelSWIGJNI.IFeedbackViewModel_SetSubcategory(this.swigCPtr, this, str);
    }

    public void UploadFeedback(String str, BoolSignalCallback boolSignalCallback) {
        IFeedbackViewModelSWIGJNI.IFeedbackViewModel_UploadFeedback(this.swigCPtr, this, str, BoolSignalCallback.getCPtr(boolSignalCallback), boolSignalCallback);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IFeedbackViewModelSWIGJNI.delete_IFeedbackViewModel(j);
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
