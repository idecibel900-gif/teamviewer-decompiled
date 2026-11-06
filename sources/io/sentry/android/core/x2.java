package io.sentry.android.core;

/* JADX INFO: loaded from: classes.dex */
public final class x2 extends io.sentry.hints.c implements io.sentry.hints.b, io.sentry.hints.g {
    public final long p;
    public final boolean q;

    public x2(long j, io.sentry.g1 g1Var, long j2, boolean z) {
        super(j, g1Var);
        this.p = j2;
        this.q = z;
    }

    @Override // io.sentry.hints.b
    public final boolean a() {
        return this.q;
    }

    @Override // io.sentry.hints.c
    public final boolean f(io.sentry.protocol.w wVar) {
        return true;
    }

    @Override // io.sentry.hints.c
    public final void g(io.sentry.protocol.w wVar) {
    }
}
