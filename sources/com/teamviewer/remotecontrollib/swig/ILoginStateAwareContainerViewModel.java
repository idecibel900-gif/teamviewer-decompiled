package com.teamviewer.remotecontrollib.swig;

/* JADX INFO: loaded from: classes.dex */
public final class ILoginStateAwareContainerViewModel {
    public transient long a;
    public transient boolean b = true;

    public ILoginStateAwareContainerViewModel(long j) {
        this.a = j;
    }

    public final synchronized void a() {
        try {
            long j = this.a;
            if (j != 0) {
                if (this.b) {
                    this.b = false;
                    ILoginStateAwareContainerViewModelSWIGJNI.delete_ILoginStateAwareContainerViewModel(j);
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
