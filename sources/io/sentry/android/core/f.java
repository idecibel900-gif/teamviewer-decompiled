package io.sentry.android.core;

import io.sentry.r4;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements r4 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ String n;

    public /* synthetic */ f(String str, byte b) {
        this.m = b;
        this.n = str;
    }

    @Override // io.sentry.r4
    public final void i(io.sentry.l1 l1Var) {
        byte b = this.m;
        String str = this.n;
        switch (b) {
            case 0:
                l1Var.x(str);
                break;
            default:
                l1Var.getClass();
                l1Var.x(str);
                break;
        }
    }
}
