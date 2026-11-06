package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

/* JADX INFO: loaded from: classes.dex */
public final class ServiceCaseListElementViewModel extends IComparable {
    public transient long c;
    public transient boolean d;

    public final void finalize() {
        synchronized (this) {
            try {
                long j = this.c;
                if (j != 0) {
                    if (this.d) {
                        this.d = false;
                        ServiceCaseListElementViewModelSWIGJNI.delete_ServiceCaseListElementViewModel(j);
                    }
                    this.c = 0L;
                }
                super.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
