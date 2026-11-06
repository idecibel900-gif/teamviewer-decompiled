package com.teamviewer.remotecontrolviewmodellib.swig;

import o.oe8;

/* JADX INFO: loaded from: classes.dex */
public final class ITakePictureClientViewModel extends oe8 {
    public transient long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public transient boolean f77o;

    @Override // o.oe8
    public final void U0() {
        V0();
    }

    public final synchronized void V0() {
        try {
            long j = this.n;
            if (j != 0) {
                if (this.f77o) {
                    this.f77o = false;
                    ITakePictureClientViewModelSWIGJNI.delete_ITakePictureClientViewModel(j);
                }
                this.n = 0L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void finalize() {
        V0();
    }
}
