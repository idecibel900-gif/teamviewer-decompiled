package com.teamviewer.remotecontrollib.swig;

/* JADX INFO: loaded from: classes.dex */
public final class AutoLoginViewModel {
    public transient long a;
    public transient boolean b;

    public final void finalize() {
        synchronized (this) {
            try {
                long j = this.a;
                if (j != 0) {
                    if (this.b) {
                        this.b = false;
                        AutoLoginViewModelSWIGJNI.delete_AutoLoginViewModel(j);
                    }
                    this.a = 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
