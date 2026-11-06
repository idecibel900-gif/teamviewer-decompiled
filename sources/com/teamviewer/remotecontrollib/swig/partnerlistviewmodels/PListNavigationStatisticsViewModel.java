package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

/* JADX INFO: loaded from: classes.dex */
public final class PListNavigationStatisticsViewModel {
    public transient long a;
    public transient boolean b;

    public PListNavigationStatisticsViewModel() {
        long jNew_PListNavigationStatisticsViewModel = PListNavigationStatisticsViewModelSWIGJNI.new_PListNavigationStatisticsViewModel();
        this.b = true;
        this.a = jNew_PListNavigationStatisticsViewModel;
    }

    public final void finalize() {
        synchronized (this) {
            try {
                long j = this.a;
                if (j != 0) {
                    if (this.b) {
                        this.b = false;
                        PListNavigationStatisticsViewModelSWIGJNI.delete_PListNavigationStatisticsViewModel(j);
                    }
                    this.a = 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
