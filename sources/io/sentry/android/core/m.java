package io.sentry.android.core;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ h0 n;

    public /* synthetic */ m(h0 h0Var, byte b) {
        this.m = b;
        this.n = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        h0 h0Var = this.n;
        switch (b) {
            case 0:
                ((n) h0Var).b(5000L);
                break;
            default:
                ((p) h0Var).b(5000L);
                break;
        }
    }
}
