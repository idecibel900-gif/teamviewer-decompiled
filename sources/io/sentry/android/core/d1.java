package io.sentry.android.core;

import io.sentry.f6;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class d1 implements io.sentry.hints.d, io.sentry.hints.h, io.sentry.hints.k, io.sentry.hints.f {
    public final long p;
    public final io.sentry.g1 q;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CountDownLatch f101o = new CountDownLatch(1);
    public boolean m = false;
    public boolean n = false;

    public d1(long j, io.sentry.g1 g1Var) {
        this.p = j;
        io.sentry.util.b.v(g1Var, "ILogger is required.");
        this.q = g1Var;
    }

    @Override // io.sentry.hints.h
    public final boolean a() {
        return this.m;
    }

    @Override // io.sentry.hints.k
    public final void b(boolean z) {
        this.n = z;
        this.f101o.countDown();
    }

    @Override // io.sentry.hints.h
    public final void c(boolean z) {
        this.m = z;
    }

    @Override // io.sentry.hints.f
    public final boolean d() {
        try {
            return this.f101o.await(this.p, TimeUnit.MILLISECONDS);
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
