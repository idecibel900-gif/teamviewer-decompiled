package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

/* JADX INFO: loaded from: classes.dex */
public final class GroupListElementViewModel extends IComparable {
    public transient long c;
    public transient boolean d;

    public final void finalize() {
        synchronized (this) {
            try {
                long j = this.c;
                if (j != 0) {
                    if (this.d) {
                        this.d = false;
                        GroupListElementViewModelSWIGJNI.delete_GroupListElementViewModel(j);
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
