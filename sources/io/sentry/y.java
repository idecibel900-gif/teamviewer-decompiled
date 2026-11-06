package io.sentry;

/* JADX INFO: loaded from: classes.dex */
public final class y implements s1 {
    public final n1 m;

    public y(n1 n1Var) {
        this.m = n1Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        z.a.set(this.m);
    }
}
