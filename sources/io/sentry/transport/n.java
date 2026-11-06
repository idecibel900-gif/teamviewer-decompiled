package io.sentry.transport;

import io.sentry.f6;
import io.sentry.g1;
import io.sentry.l5;
import io.sentry.m5;
import io.sentry.m7;
import io.sentry.s0;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class n extends ThreadPoolExecutor implements AutoCloseable {
    public final int m;
    public l5 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final g1 f265o;
    public final m5 p;
    public final m7 q;

    public n(int i, s0 s0Var, a aVar, g1 g1Var, m5 m5Var) {
        super(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), s0Var, aVar);
        this.n = null;
        this.q = new m7((byte) 8);
        this.m = i;
        this.f265o = g1Var;
        this.p = m5Var;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th) {
        q qVar = (q) this.q.n;
        try {
            super.afterExecute(runnable, th);
        } finally {
            int i = q.m;
            qVar.releaseShared(1);
        }
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        q qVar = (q) this.q.n;
        int i = q.m;
        int iA = qVar.a();
        int i2 = this.m;
        g1 g1Var = this.f265o;
        m5 m5Var = this.p;
        if (iA >= i2) {
            this.n = m5Var.a();
            g1Var.g(f6.WARNING, "Submit cancelled", new Object[0]);
            return new m();
        }
        qVar.b();
        try {
            return super.submit(runnable);
        } catch (RejectedExecutionException e) {
            qVar.releaseShared(1);
            this.n = m5Var.a();
            g1Var.d(f6.WARNING, "Submit rejected by thread pool executor", e);
            return new m();
        }
    }
}
