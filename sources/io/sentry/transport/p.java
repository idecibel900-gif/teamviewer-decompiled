package io.sentry.transport;

import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.b5;
import io.sentry.f6;
import io.sentry.h2;
import io.sentry.r1;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Closeable {
    public final io.sentry.time.c m;
    public final SentryAndroidOptions n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ConcurrentHashMap f266o = new ConcurrentHashMap();
    public final CopyOnWriteArrayList p = new CopyOnWriteArrayList();
    public final ArrayList q = new ArrayList();
    public final io.sentry.util.a r = new io.sentry.util.a();

    public p(io.sentry.time.c cVar, SentryAndroidOptions sentryAndroidOptions) {
        this.m = cVar;
        this.n = sentryAndroidOptions;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = this.q;
        io.sentry.util.a aVar = this.r;
        aVar.e();
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(false);
            }
            arrayList.clear();
            aVar.close();
            this.p.clear();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void e(io.sentry.q qVar, io.sentry.time.a aVar) {
        long j = aVar.b;
        io.sentry.time.c cVar = aVar.a;
        SentryAndroidOptions sentryAndroidOptions = this.n;
        ArrayList arrayList = this.q;
        ConcurrentHashMap concurrentHashMap = this.f266o;
        io.sentry.time.a aVar2 = (io.sentry.time.a) concurrentHashMap.get(qVar);
        long j2 = 0;
        if (aVar2 != null) {
            io.sentry.time.c cVar2 = aVar2.a;
            if (cVar != cVar2) {
                h2.j("Cannot compare deadlines from different tickers: ", cVar.getClass().getName(), " and ", cVar2.getClass().getName());
                return;
            } else if (j - aVar2.b <= 0) {
                return;
            }
        }
        concurrentHashMap.put(qVar, aVar);
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            ((o) it.next()).J(this);
        }
        io.sentry.util.a aVar3 = this.r;
        aVar3.e();
        try {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (((Future) it2.next()).isDone()) {
                    it2.remove();
                }
            }
            try {
                r1 timerExecutorService = sentryAndroidOptions.getTimerExecutorService();
                b5 b5Var = new b5((Object) this, (byte) 19);
                long jA = j - cVar.a();
                if (jA > 0) {
                    long j3 = jA / 1000000;
                    j2 = jA % 1000000 == 0 ? j3 : j3 + 1;
                }
                arrayList.add(timerExecutorService.b(b5Var, j2));
            } catch (RejectedExecutionException e) {
                sentryAndroidOptions.getLogger().d(f6.WARNING, "Failed to schedule rate limit lifted notification.", e);
            }
            aVar3.close();
        } catch (Throwable th) {
            try {
                aVar3.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean j(io.sentry.q qVar) {
        io.sentry.time.a aVar;
        io.sentry.q qVar2 = io.sentry.q.All;
        ConcurrentHashMap concurrentHashMap = this.f266o;
        io.sentry.time.a aVar2 = (io.sentry.time.a) concurrentHashMap.get(qVar2);
        if (aVar2 == null || aVar2.b()) {
            return (io.sentry.q.Unknown.equals(qVar) || (aVar = (io.sentry.time.a) concurrentHashMap.get(qVar)) == null || aVar.b()) ? false : true;
        }
        return true;
    }
}
