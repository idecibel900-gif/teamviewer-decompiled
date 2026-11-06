package io.sentry.transport;

import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.c0;
import io.sentry.f6;
import io.sentry.g1;
import io.sentry.g8;
import io.sentry.l5;
import io.sentry.m5;
import io.sentry.n5;
import io.sentry.p0;
import io.sentry.s0;
import io.sentry.t5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class c implements g {
    public final n m;
    public final io.sentry.cache.d n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final SentryAndroidOptions f264o;
    public final p p;
    public final h q;
    public final e r;
    public volatile b s;

    /* JADX WARN: Type inference failed for: r3v0, types: [io.sentry.transport.a] */
    public c(SentryAndroidOptions sentryAndroidOptions, p pVar, h hVar, io.sentry.internal.debugmeta.c cVar) {
        int maxQueueSize = sentryAndroidOptions.getMaxQueueSize();
        final io.sentry.cache.d envelopeDiskCache = sentryAndroidOptions.getEnvelopeDiskCache();
        final g1 logger = sentryAndroidOptions.getLogger();
        m5 dateProvider = sentryAndroidOptions.getDateProvider();
        n nVar = new n(maxQueueSize, new s0((byte) 4), new RejectedExecutionHandler() { // from class: io.sentry.transport.a
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                if (runnable instanceof b) {
                    b bVar = (b) runnable;
                    p0 p0Var = bVar.n;
                    if (!io.sentry.util.b.l(p0Var, io.sentry.hints.d.class)) {
                        envelopeDiskCache.F(bVar.m, p0Var);
                    }
                    Object objB = p0Var.b("sentry:typeCheckHint");
                    if (io.sentry.hints.k.class.isInstance(p0Var.b("sentry:typeCheckHint")) && objB != null) {
                        ((io.sentry.hints.k) objB).b(false);
                    }
                    Object objB2 = p0Var.b("sentry:typeCheckHint");
                    if (io.sentry.hints.h.class.isInstance(p0Var.b("sentry:typeCheckHint")) && objB2 != null) {
                        ((io.sentry.hints.h) objB2).c(true);
                    }
                    logger.g(f6.WARNING, "Envelope rejected", new Object[0]);
                }
            }
        }, logger, dateProvider);
        e eVar = new e(sentryAndroidOptions, cVar, pVar);
        this.s = null;
        this.m = nVar;
        io.sentry.cache.d envelopeDiskCache2 = sentryAndroidOptions.getEnvelopeDiskCache();
        io.sentry.util.b.v(envelopeDiskCache2, "envelopeCache is required");
        this.n = envelopeDiskCache2;
        this.f264o = sentryAndroidOptions;
        this.p = pVar;
        io.sentry.util.b.v(hVar, "transportGate is required");
        this.q = hVar;
        this.r = eVar;
    }

    @Override // io.sentry.transport.g
    public final void a(boolean z) {
        this.p.close();
        this.m.shutdown();
        this.f264o.getLogger().g(f6.DEBUG, "Shutting down", new Object[0]);
        if (z) {
            return;
        }
        try {
            long flushTimeoutMillis = this.f264o.getFlushTimeoutMillis();
            if (this.m.awaitTermination(flushTimeoutMillis, TimeUnit.MILLISECONDS)) {
                return;
            }
            this.f264o.getLogger().g(f6.WARNING, "Failed to shutdown the async connection async sender  within " + flushTimeoutMillis + " ms. Trying to force it now.", new Object[0]);
            this.m.shutdownNow();
            if (this.s != null) {
                this.m.getRejectedExecutionHandler().rejectedExecution(this.s, this.m);
            }
        } catch (InterruptedException unused) {
            this.f264o.getLogger().g(f6.DEBUG, "Thread interrupted while closing the connection.", new Object[0]);
            Thread.currentThread().interrupt();
        }
    }

    @Override // io.sentry.transport.g
    public final void b(long j) {
        n nVar = this.m;
        try {
            ((q) nVar.q.n).tryAcquireSharedNanos(1, TimeUnit.MILLISECONDS.toNanos(j));
        } catch (InterruptedException e) {
            nVar.f265o.d(f6.ERROR, "Failed to wait till idle", e);
            Thread.currentThread().interrupt();
        }
    }

    @Override // io.sentry.transport.g
    public final p c() {
        return this.p;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(false);
    }

    @Override // io.sentry.transport.g
    public final boolean d() {
        boolean z;
        Iterator it = this.p.f266o.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (!((io.sentry.time.a) it.next()).b()) {
                z = true;
                break;
            }
        }
        n nVar = this.m;
        l5 l5Var = nVar.n;
        return (z || (l5Var != null && (nVar.p.a().b(l5Var) > 2000000000L ? 1 : (nVar.p.a().b(l5Var) == 2000000000L ? 0 : -1)) < 0)) ? false : true;
    }

    @Override // io.sentry.transport.g
    public final void n0(io.sentry.internal.debugmeta.c cVar, p0 p0Var) {
        io.sentry.cache.d dVar;
        boolean z;
        io.sentry.internal.debugmeta.c cVarJ;
        List listSingletonList;
        Iterable<t5> iterable = (Iterable) cVar.f205o;
        boolean zL = io.sentry.util.b.l(p0Var, io.sentry.hints.d.class);
        SentryAndroidOptions sentryAndroidOptions = this.f264o;
        io.sentry.cache.d dVar2 = this.n;
        if (zL) {
            sentryAndroidOptions.getLogger().g(f6.DEBUG, "Captured Envelope is already cached", new Object[0]);
            dVar = i.m;
            z = true;
        } else {
            dVar = dVar2;
            z = false;
        }
        p pVar = this.p;
        SentryAndroidOptions sentryAndroidOptions2 = pVar.n;
        ArrayList arrayList = null;
        for (t5 t5Var : iterable) {
            String itemType = t5Var.a.q.getItemType();
            itemType.getClass();
            switch (itemType) {
                case "attachment":
                    listSingletonList = Collections.singletonList(io.sentry.q.Attachment);
                    break;
                case "replay_video":
                    listSingletonList = Collections.singletonList(io.sentry.q.Replay);
                    break;
                case "profile_chunk":
                    listSingletonList = Arrays.asList(io.sentry.q.ProfileChunkUi, io.sentry.q.ProfileChunk);
                    break;
                case "profile":
                    listSingletonList = Collections.singletonList(io.sentry.q.Profile);
                    break;
                case "feedback":
                    listSingletonList = Collections.singletonList(io.sentry.q.Feedback);
                    break;
                case "log":
                    listSingletonList = Arrays.asList(io.sentry.q.LogItem, io.sentry.q.LogByte);
                    break;
                case "span":
                    listSingletonList = Collections.singletonList(io.sentry.q.Span);
                    break;
                case "event":
                    listSingletonList = Collections.singletonList(io.sentry.q.Error);
                    break;
                case "trace_metric":
                    listSingletonList = Arrays.asList(io.sentry.q.TraceMetric, io.sentry.q.TraceMetricByte);
                    break;
                case "check_in":
                    listSingletonList = Collections.singletonList(io.sentry.q.Monitor);
                    break;
                case "session":
                    listSingletonList = Collections.singletonList(io.sentry.q.Session);
                    break;
                case "transaction":
                    listSingletonList = Collections.singletonList(io.sentry.q.Transaction);
                    break;
                default:
                    listSingletonList = Collections.singletonList(io.sentry.q.Unknown);
                    break;
            }
            Iterator it = listSingletonList.iterator();
            while (it.hasNext()) {
                if (pVar.j((io.sentry.q) it.next())) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(t5Var);
                    sentryAndroidOptions2.getClientReportRecorder().h(io.sentry.clientreport.d.RATELIMIT_BACKOFF, t5Var);
                    break;
                }
            }
        }
        if (arrayList != null) {
            sentryAndroidOptions2.getLogger().g(f6.WARNING, "%d envelope items will be dropped due rate limiting.", Integer.valueOf(arrayList.size()));
            ArrayList arrayList2 = new ArrayList();
            for (t5 t5Var2 : iterable) {
                if (!arrayList.contains(t5Var2)) {
                    arrayList2.add(t5Var2);
                }
            }
            if (arrayList2.isEmpty()) {
                sentryAndroidOptions2.getLogger().g(f6.WARNING, "Envelope discarded due all items rate limited.", new Object[0]);
                Object objB = p0Var.b("sentry:typeCheckHint");
                if (io.sentry.hints.k.class.isInstance(p0Var.b("sentry:typeCheckHint")) && objB != null) {
                    ((io.sentry.hints.k) objB).b(false);
                }
                Object objB2 = p0Var.b("sentry:typeCheckHint");
                if (io.sentry.hints.h.class.isInstance(p0Var.b("sentry:typeCheckHint")) && objB2 != null) {
                    ((io.sentry.hints.h) objB2).c(false);
                }
                Object objB3 = p0Var.b("sentry:typeCheckHint");
                if (io.sentry.hints.c.class.isInstance(p0Var.b("sentry:typeCheckHint")) && objB3 != null) {
                    ((io.sentry.hints.c) objB3).m.countDown();
                    sentryAndroidOptions2.getLogger().g(f6.DEBUG, "Disk flush envelope fired due to rate limit", new Object[0]);
                }
                cVarJ = null;
            } else {
                cVarJ = new io.sentry.internal.debugmeta.c((n5) cVar.n, arrayList2);
            }
        } else {
            cVarJ = cVar;
        }
        if (cVarJ == null) {
            if (z) {
                dVar2.x0(cVar);
                return;
            }
            return;
        }
        if (g8.class.isInstance(p0Var.b("sentry:typeCheckHint"))) {
            cVarJ = sentryAndroidOptions.getClientReportRecorder().j(cVarJ);
        }
        Future futureSubmit = this.m.submit(new b(this, cVarJ, p0Var, dVar));
        if (futureSubmit != null && futureSubmit.isCancelled()) {
            sentryAndroidOptions.getClientReportRecorder().c(io.sentry.clientreport.d.QUEUE_OVERFLOW, cVarJ);
            return;
        }
        Object objB4 = p0Var.b("sentry:typeCheckHint");
        if (!c0.class.isInstance(p0Var.b("sentry:typeCheckHint")) || objB4 == null) {
            return;
        }
        c0 c0Var = (c0) objB4;
        c0Var.s.add(c0Var.r);
        sentryAndroidOptions.getLogger().g(f6.DEBUG, "Envelope enqueued", new Object[0]);
    }
}
