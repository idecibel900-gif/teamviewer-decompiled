package io.sentry.metrics;

import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.b5;
import io.sentry.f6;
import io.sentry.j5;
import io.sentry.m6;
import io.sentry.m7;
import io.sentry.n6;
import io.sentry.transport.q;
import io.sentry.y5;
import io.sentry.z2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class c implements a {
    public final SentryAndroidOptions m;
    public final j5 n;
    public final y5 p;
    public final AtomicBoolean q = new AtomicBoolean(false);
    public final m7 r = new m7((byte) 8);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ConcurrentLinkedQueue f214o = new ConcurrentLinkedQueue();

    public c(SentryAndroidOptions sentryAndroidOptions, j5 j5Var) {
        this.m = sentryAndroidOptions;
        this.n = j5Var;
        this.p = new y5(sentryAndroidOptions);
    }

    @Override // io.sentry.metrics.a
    public void a(boolean z) {
        y5 y5Var = this.p;
        if (z) {
            d(true);
            y5Var.submit(new b5((Object) this, (byte) 18));
        } else {
            y5Var.a(this.m.getShutdownTimeoutMillis());
            while (!this.f214o.isEmpty()) {
                c();
            }
        }
    }

    @Override // io.sentry.metrics.a
    public final void b(long j) {
        d(true);
        try {
            ((q) this.r.n).tryAcquireSharedNanos(1, TimeUnit.MILLISECONDS.toNanos(j));
        } catch (InterruptedException e) {
            this.m.getLogger().d(f6.ERROR, "Failed to flush metrics events", e);
            Thread.currentThread().interrupt();
        }
    }

    public final void c() {
        ArrayList arrayList = new ArrayList(1000);
        do {
            ConcurrentLinkedQueue concurrentLinkedQueue = this.f214o;
            m6 m6Var = (m6) concurrentLinkedQueue.poll();
            if (m6Var != null) {
                arrayList.add(m6Var);
            }
            if (concurrentLinkedQueue.isEmpty()) {
                break;
            }
        } while (arrayList.size() < 1000);
        if (arrayList.isEmpty()) {
            return;
        }
        j5 j5Var = this.n;
        try {
            j5Var.x(j5Var.p(new n6(arrayList)), null);
        } catch (IOException e) {
            j5Var.b.getLogger().b(f6.WARNING, e, "Capturing metrics failed.", new Object[0]);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            q qVar = (q) this.r.n;
            int i2 = q.m;
            qVar.releaseShared(1);
        }
    }

    public final void d(boolean z) {
        AtomicBoolean atomicBoolean = this.q;
        if (z) {
            atomicBoolean.set(true);
        } else if (!atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        try {
            this.p.b(new z2(this, (byte) 9), z ? 0 : 5000);
        } catch (RejectedExecutionException e) {
            atomicBoolean.set(false);
            this.m.getLogger().d(f6.WARNING, "Metrics batch processor flush task rejected", e);
        }
    }
}
