package com.teamviewer.commonresourcelib.swig;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class FeedbackViewModelFactory {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public FeedbackViewModelFactory() {
        this(FeedbackViewModelFactorySWIGJNI.new_FeedbackViewModelFactory(), true);
    }

    public static IFeedbackViewModel GetFeedbackViewModel(String str, String str2) {
        long jFeedbackViewModelFactory_GetFeedbackViewModel = FeedbackViewModelFactorySWIGJNI.FeedbackViewModelFactory_GetFeedbackViewModel(str, str2);
        if (jFeedbackViewModelFactory_GetFeedbackViewModel == 0) {
            return null;
        }
        return new IFeedbackViewModel(jFeedbackViewModelFactory_GetFeedbackViewModel, true);
    }

    public static long getCPtr(FeedbackViewModelFactory feedbackViewModelFactory) {
        if (feedbackViewModelFactory == null) {
            return 0L;
        }
        return feedbackViewModelFactory.swigCPtr;
    }

    public static long swigRelease(FeedbackViewModelFactory feedbackViewModelFactory) {
        if (feedbackViewModelFactory != null) {
            if (feedbackViewModelFactory.swigCMemOwn) {
                long j = feedbackViewModelFactory.swigCPtr;
                feedbackViewModelFactory.swigCMemOwn = false;
                feedbackViewModelFactory.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    FeedbackViewModelFactorySWIGJNI.delete_FeedbackViewModelFactory(j);
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

    public FeedbackViewModelFactory(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
