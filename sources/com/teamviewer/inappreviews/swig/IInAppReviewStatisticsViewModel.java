package com.teamviewer.inappreviews.swig;

/* JADX INFO: loaded from: classes.dex */
public final class IInAppReviewStatisticsViewModel {
    public transient long a;
    public transient boolean b;

    public final void finalize() {
        synchronized (this) {
            try {
                long j = this.a;
                if (j != 0) {
                    if (this.b) {
                        this.b = false;
                        IInAppReviewStatisticsViewModelSWIGJNI.delete_IInAppReviewStatisticsViewModel(j);
                    }
                    this.a = 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
