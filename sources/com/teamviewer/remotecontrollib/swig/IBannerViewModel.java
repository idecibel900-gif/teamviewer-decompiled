package com.teamviewer.remotecontrollib.swig;

import o.hk0;
import o.p93;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public final class IBannerViewModel {
    public transient long a;
    public transient boolean b;

    public final p93 a() {
        int iIBannerViewModel_GetBannerState = IBannerViewModelSWIGJNI.IBannerViewModel_GetBannerState(this.a, this);
        p93[] p93VarArr = (p93[]) p93.class.getEnumConstants();
        if (iIBannerViewModel_GetBannerState < p93VarArr.length && iIBannerViewModel_GetBannerState >= 0) {
            p93 p93Var = p93VarArr[iIBannerViewModel_GetBannerState];
            if (p93Var.m == iIBannerViewModel_GetBannerState) {
                return p93Var;
            }
        }
        for (p93 p93Var2 : p93VarArr) {
            if (p93Var2.m == iIBannerViewModel_GetBannerState) {
                return p93Var2;
            }
        }
        hk0.g(ua5.k(iIBannerViewModel_GetBannerState, p93.class, "No enum ", " with value "));
        return null;
    }

    public final synchronized void b() {
        try {
            long j = this.a;
            if (j != 0) {
                if (this.b) {
                    this.b = false;
                    IBannerViewModelSWIGJNI.delete_IBannerViewModel(j);
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
