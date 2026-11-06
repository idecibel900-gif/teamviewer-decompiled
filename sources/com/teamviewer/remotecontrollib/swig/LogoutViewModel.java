package com.teamviewer.remotecontrollib.swig;

/* JADX INFO: loaded from: classes.dex */
public final class LogoutViewModel extends AccountViewModelBase {
    public transient long c;
    public transient boolean d;

    @Override // com.teamviewer.remotecontrollib.swig.AccountViewModelBase
    public final synchronized void c() {
        try {
            long j = this.c;
            if (j != 0) {
                if (this.d) {
                    this.d = false;
                    LogoutViewModelSWIGJNI.delete_LogoutViewModel(j);
                }
                this.c = 0L;
            }
            super.c();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.teamviewer.remotecontrollib.swig.AccountViewModelBase
    public final void finalize() {
        c();
    }
}
