package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

/* JADX INFO: loaded from: classes.dex */
public final class ComputerDetailsViewModel {
    public transient long a;
    public transient boolean b = true;

    public ComputerDetailsViewModel(long j) {
        this.a = j;
    }

    public final IAlertViewModelWrapperVector a() {
        return new IAlertViewModelWrapperVector(ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_GetAlertsList(this.a, this));
    }

    public final synchronized void b() {
        try {
            long j = this.a;
            if (j != 0) {
                if (this.b) {
                    this.b = false;
                    ComputerDetailsViewModelSWIGJNI.delete_ComputerDetailsViewModel(j);
                }
                this.a = 0L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void finalize() {
        b();
    }
}
