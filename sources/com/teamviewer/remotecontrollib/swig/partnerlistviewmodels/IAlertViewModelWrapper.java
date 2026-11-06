package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

/* JADX INFO: loaded from: classes.dex */
public final class IAlertViewModelWrapper {
    public transient long a;
    public transient boolean b = true;

    public IAlertViewModelWrapper(long j) {
        this.a = j;
    }

    public final synchronized void a() {
        try {
            long j = this.a;
            if (j != 0) {
                if (this.b) {
                    this.b = false;
                    IAlertViewModelWrapperSWIGJNI.delete_IAlertViewModelWrapper(j);
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
