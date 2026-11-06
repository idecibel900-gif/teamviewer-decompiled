package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

/* JADX INFO: loaded from: classes.dex */
public final class ManagedDeviceViewModel {
    public transient long a;
    public transient boolean b = true;

    public ManagedDeviceViewModel(long j) {
        this.a = j;
    }

    public final void finalize() {
        synchronized (this) {
            try {
                long j = this.a;
                if (j != 0) {
                    if (this.b) {
                        this.b = false;
                        ManagedDeviceViewModelSWIGJNI.delete_ManagedDeviceViewModel(j);
                    }
                    this.a = 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
