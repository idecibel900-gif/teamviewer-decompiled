package com.teamviewer.commonresourcelib.swig;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class RatingViewModelFactory {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public RatingViewModelFactory(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static IRatingViewModel GetRatingViewModel() {
        long jRatingViewModelFactory_GetRatingViewModel = RatingViewModelFactorySWIGJNI.RatingViewModelFactory_GetRatingViewModel();
        if (jRatingViewModelFactory_GetRatingViewModel == 0) {
            return null;
        }
        return new IRatingViewModel(jRatingViewModelFactory_GetRatingViewModel, true);
    }

    public static long getCPtr(RatingViewModelFactory ratingViewModelFactory) {
        if (ratingViewModelFactory == null) {
            return 0L;
        }
        return ratingViewModelFactory.swigCPtr;
    }

    public static long swigRelease(RatingViewModelFactory ratingViewModelFactory) {
        if (ratingViewModelFactory != null) {
            if (ratingViewModelFactory.swigCMemOwn) {
                long j = ratingViewModelFactory.swigCPtr;
                ratingViewModelFactory.swigCMemOwn = false;
                ratingViewModelFactory.delete();
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
                    RatingViewModelFactorySWIGJNI.delete_RatingViewModelFactory(j);
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
