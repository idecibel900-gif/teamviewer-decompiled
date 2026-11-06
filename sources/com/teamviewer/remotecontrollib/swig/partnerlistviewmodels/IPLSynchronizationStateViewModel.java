package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

/* JADX INFO: loaded from: classes.dex */
public final class IPLSynchronizationStateViewModel {
    public transient long a;
    public transient boolean b;

    public final synchronized void a() {
        try {
            long j = this.a;
            if (j != 0) {
                if (this.b) {
                    this.b = false;
                    IPLSynchronizationStateViewModelSWIGJNI.delete_IPLSynchronizationStateViewModel(j);
                }
                this.a = 0L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void finalize() {
        a();
    }
}
