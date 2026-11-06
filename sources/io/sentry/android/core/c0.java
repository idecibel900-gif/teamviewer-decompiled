package io.sentry.android.core;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends io.sentry.hints.c implements io.sentry.hints.b, io.sentry.hints.a {
    public final long p;
    public final boolean q;
    public final boolean r;

    public c0(long j, io.sentry.g1 g1Var, long j2, boolean z, boolean z2) {
        super(j, g1Var);
        this.p = j2;
        this.q = z;
        this.r = z2;
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
        return this.r ? "anr_background" : "anr_foreground";
    }
}
