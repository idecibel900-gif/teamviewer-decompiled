package io.sentry;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements io.sentry.hints.d, io.sentry.hints.h, io.sentry.hints.k, io.sentry.hints.f {
    public boolean m = false;
    public boolean n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CountDownLatch f182o = new CountDownLatch(1);
    public final long p;
    public final g1 q;
    public final String r;
    public final b8 s;

    public c0(long j, g1 g1Var, String str, b8 b8Var) {
        this.p = j;
        this.r = str;
        this.s = b8Var;
        this.q = g1Var;
    }

    @Override // io.sentry.hints.h
    public final boolean a() {
        return this.m;
    }

    @Override // io.sentry.hints.k
    public final void b(boolean z) {
        this.n = z;
        this.f182o.countDown();
    }

    @Override // io.sentry.hints.h
    public final void c(boolean z) {
        this.m = z;
    }

    @Override // io.sentry.hints.f
    public final boolean d() {
        try {
            return this.f182o.await(this.p, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.q.d(f6.ERROR, "Exception while awaiting on lock.", e);
            return false;
        }
    }

    @Override // io.sentry.hints.k
    public final boolean e() {
        return this.n;
    }
}
