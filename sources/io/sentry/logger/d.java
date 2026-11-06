package io.sentry.logger;

import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.b5;
import io.sentry.clientreport.f;
import io.sentry.f6;
import io.sentry.h6;
import io.sentry.i6;
import io.sentry.j5;
import io.sentry.m7;
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
public class d implements b {
    public final SentryAndroidOptions m;
    public final j5 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ConcurrentLinkedQueue f211o;
    public final y5 p;
    public final AtomicBoolean q;
    public volatile boolean r;
    public final m7 s;

    public d(SentryAndroidOptions sentryAndroidOptions, j5 j5Var) {
        y5 y5Var = new y5(sentryAndroidOptions);
        this.q = new AtomicBoolean(false);
        this.r = false;
        this.s = new m7((byte) 8);
        this.m = sentryAndroidOptions;
        this.n = j5Var;
        this.f211o = new ConcurrentLinkedQueue();
        this.p = y5Var;
    }

    @Override // io.sentry.logger.b
    public void a(boolean z) {
        this.r = true;
        if (z) {
            f(true);
            this.p.submit(new b5((Object) this, (byte) 17));
        } else {
            this.p.a(this.m.getShutdownTimeoutMillis());
            while (!this.f211o.isEmpty()) {
                c();
            }
        }
    }

    @Override // io.sentry.logger.b
    public final void b(long j) {
        f(true);
        try {
            ((q) this.s.n).tryAcquireSharedNanos(1, TimeUnit.MILLISECONDS.toNanos(j));
        } catch (InterruptedException e) {
            this.m.getLogger().d(f6.ERROR, "Failed to flush log events", e);
            Thread.currentThread().interrupt();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        ArrayList arrayList = new ArrayList(100);
        do {
            ConcurrentLinkedQueue concurrentLinkedQueue = this.f211o;
            h6 h6Var = (h6) concurrentLinkedQueue.poll();
            if (h6Var != null) {
                arrayList.add(h6Var);
            }
            if (concurrentLinkedQueue.isEmpty()) {
                break;
            }
        } while (arrayList.size() < 100);
        if (arrayList.isEmpty()) {
            return;
        }
        j5 j5Var = this.n;
        try {
            j5Var.x(j5Var.o(new i6(arrayList, 0 == true ? 1 : 0)), null);
        } catch (IOException e) {
            j5Var.b.getLogger().b(f6.WARNING, e, "Capturing logs failed.", new Object[0]);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            q qVar = (q) this.s.n;
            int i2 = q.m;
            qVar.releaseShared(1);
        }
    }

    @Override // io.sentry.logger.b
    public final void d(h6 h6Var) {
        if (this.r) {
            return;
        }
        q qVar = (q) this.s.n;
        int i = q.m;
        if (qVar.a() < 1000) {
            ((q) this.s.n).b();
            this.f211o.offer(h6Var);
            f(false);
        } else {
            f clientReportRecorder = this.m.getClientReportRecorder();
            io.sentry.clientreport.d dVar = io.sentry.clientreport.d.QUEUE_OVERFLOW;
            clientReportRecorder.a(dVar, io.sentry.q.LogItem);
            this.m.getClientReportRecorder().e(dVar, io.sentry.q.LogByte, io.sentry.util.f.a(this.m.getSerializer(), this.m.getLogger(), h6Var));
        }
    }

    public final void f(boolean z) {
        AtomicBoolean atomicBoolean = this.q;
        if (z) {
            atomicBoolean.set(true);
        } else if (!atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        try {
            this.p.b(new z2(this, (byte) 8), z ? 0 : 5000);
        } catch (RejectedExecutionException e) {
            atomicBoolean.set(false);
            this.m.getLogger().d(f6.WARNING, "Logs batch processor flush task rejected", e);
        }
    }
}
