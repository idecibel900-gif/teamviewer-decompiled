package io.sentry.android.fragment;

import io.sentry.android.replay.ReplayIntegration;
import io.sentry.l1;
import io.sentry.r4;
import java.util.ArrayList;
import o.k76;
import o.ub7;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements r4 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ k76 n;

    public /* synthetic */ c(k76 k76Var, byte b) {
        this.m = b;
        this.n = k76Var;
    }

    @Override // io.sentry.r4
    public final void i(l1 l1Var) {
        byte b = this.m;
        k76 k76Var = this.n;
        switch (b) {
            case 0:
                l1Var.getClass();
                k76Var.m = l1Var.m();
                break;
            case 1:
                int i = ReplayIntegration.B;
                l1Var.getClass();
                String strG = l1Var.G();
                k76Var.m = strG != null ? ub7.q0('.', strG, strG) : null;
                break;
            default:
                l1Var.getClass();
                k76Var.m = new ArrayList(l1Var.t());
                break;
        }
    }
}
