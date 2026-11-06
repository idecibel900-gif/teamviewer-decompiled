package io.sentry.hints;

import io.sentry.f6;
import io.sentry.g1;
import io.sentry.protocol.w;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements f {
    public final CountDownLatch m = new CountDownLatch(1);
    public final long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final g1 f201o;

    public c(long j, g1 g1Var) {
        this.n = j;
        this.f201o = g1Var;
    }

    @Override // io.sentry.hints.f
    public final boolean d() {
        try {
            return this.m.await(this.n, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.f201o.d(f6.ERROR, "Exception while awaiting for flush in BlockingFlushHint", e);
            return false;
        }
    }

    public boolean f(w wVar) {
        return true;
    }

    public void g(w wVar) {
    }
}
