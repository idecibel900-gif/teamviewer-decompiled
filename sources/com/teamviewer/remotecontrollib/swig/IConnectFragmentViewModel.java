package com.teamviewer.remotecontrollib.swig;

/* JADX INFO: loaded from: classes.dex */
public final class IConnectFragmentViewModel {
    public transient long a;
    public transient boolean b;

    public final synchronized void a() {
        try {
            long j = this.a;
            if (j != 0) {
                if (this.b) {
                    this.b = false;
                    IConnectFragmentViewModelSWIGJNI.delete_IConnectFragmentViewModel(j);
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
