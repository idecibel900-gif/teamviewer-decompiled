package com.teamviewer.remotecontrollib.swig;

/* JADX INFO: loaded from: classes.dex */
public final class IQuickActionsViewModel {
    public transient long a;
    public transient boolean b = true;

    public IQuickActionsViewModel(long j) {
        this.a = j;
    }

    public final synchronized void a() {
        try {
            long j = this.a;
            if (j != 0) {
                if (this.b) {
                    this.b = false;
                    IQuickActionsViewModelSWIGJNI.delete_IQuickActionsViewModel(j);
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
