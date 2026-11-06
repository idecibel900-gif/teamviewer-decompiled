package com.teamviewer.pilotsessionlib.swig.viewmodel.sessionwindow;

import o.oe8;

/* JADX INFO: loaded from: classes.dex */
public final class LeaveSessionViewModelNative extends oe8 {
    public transient long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public transient boolean f63o;

    @Override // o.oe8
    public final void U0() {
        V0();
    }

    public final synchronized void V0() {
        try {
            long j = this.n;
            if (j != 0) {
                if (this.f63o) {
                    this.f63o = false;
                    ILeaveSessionViewModelSWIGJNI.delete_LeaveSessionViewModelNative(j);
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
