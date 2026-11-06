package io.sentry.android.core;

/* JADX INFO: loaded from: classes.dex */
public final class k1 extends io.sentry.hints.c implements io.sentry.hints.b, io.sentry.hints.a {
    public final long p;
    public final boolean q;

    public k1(long j, io.sentry.g1 g1Var, long j2, boolean z) {
        super(j, g1Var);
        this.p = j2;
        this.q = z;
    }

    @Override // io.sentry.hints.b
    public final boolean a() {
        return this.q;
    }

    @Override // io.sentry.hints.a
    public final Long b() {
        return Long.valueOf(this.p);
    }

    @Override // io.sentry.hints.a
    public final boolean c() {
        return false;
    }

    @Override // io.sentry.hints.a
    public final String e() {
        return "memory_limiter";
    }

    @Override // io.sentry.hints.c
    public final boolean f(io.sentry.protocol.w wVar) {
        return true;
    }

    @Override // io.sentry.hints.c
    public final void g(io.sentry.protocol.w wVar) {
    }
}
