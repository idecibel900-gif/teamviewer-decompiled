package io.sentry.android.core;

import android.os.Bundle;
import android.os.ProfilingResult;
import android.os.SystemClock;
import io.sentry.b4;
import io.sentry.b5;
import io.sentry.d5;
import io.sentry.d8;
import io.sentry.e4;
import io.sentry.f6;
import io.sentry.g7;
import io.sentry.k3;
import io.sentry.l5;
import io.sentry.o6;
import io.sentry.z3;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import o.xv;

/* JADX INFO: loaded from: classes.dex */
public final class w1 implements io.sentry.b1, io.sentry.transport.o {
    public boolean A;
    public boolean B;
    public int C;
    public final io.sentry.util.a D;
    public final ArrayDeque E;
    public final io.sentry.util.a F;
    public final io.sentry.g1 m;
    public final q n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final r f131o;
    public final v1 q;
    public io.sentry.n1 s;
    public io.sentry.p t;
    public Future u;
    public io.sentry.protocol.w v;
    public io.sentry.protocol.w w;
    public final AtomicBoolean x;
    public l5 y;
    public boolean z;
    public a2 p = null;
    public boolean r = false;

    public w1(io.sentry.g1 g1Var, io.sentry.android.core.internal.util.t tVar, q qVar, r rVar) {
        io.sentry.protocol.w wVar = io.sentry.protocol.w.n;
        this.v = wVar;
        this.w = wVar;
        this.x = new AtomicBoolean(false);
        this.y = new o6();
        this.z = true;
        this.A = false;
        this.B = false;
        this.C = 0;
        this.D = new io.sentry.util.a();
        this.E = new ArrayDeque(10);
        this.F = new io.sentry.util.a();
        this.m = g1Var;
        this.q = new v1(tVar);
        this.n = qVar;
        this.f131o = rVar;
    }

    @Override // io.sentry.transport.o
    public final void J(io.sentry.transport.p pVar) {
        if (pVar.j(io.sentry.q.All) || pVar.j(io.sentry.q.ProfileChunkUi)) {
            io.sentry.util.a aVar = this.D;
            aVar.e();
            try {
                this.m.g(f6.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
                j(false);
                aVar.close();
            } catch (Throwable th) {
                try {
                    aVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // io.sentry.b1
    public final void a(boolean z) {
        io.sentry.profiling.c cVar;
        io.sentry.util.a aVar = this.D;
        aVar.e();
        try {
            this.C = 0;
            this.A = true;
            if (z) {
                this.x.set(true);
                j(false);
                io.sentry.util.a aVar2 = this.F;
                aVar2.e();
                try {
                    io.sentry.android.core.internal.profiling.a aVar3 = (io.sentry.android.core.internal.profiling.a) this.E.peekLast();
                    if (aVar3 != null) {
                        synchronized (aVar3) {
                            cVar = aVar3.d;
                        }
                        if (cVar == io.sentry.profiling.c.UNKNOWN) {
                            aVar3.a(io.sentry.profiling.c.NOT_RECORDED);
                        }
                    }
                    aVar2.close();
                } catch (Throwable th) {
                    try {
                        aVar2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            aVar.close();
        } catch (Throwable th3) {
            try {
                aVar.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // io.sentry.b1
    public final io.sentry.profiling.c b(io.sentry.protocol.w wVar, l5 l5Var, l5 l5Var2) {
        io.sentry.profiling.c cVar;
        io.sentry.util.a aVar = this.F;
        aVar.e();
        try {
            boolean z = false;
            boolean z2 = false;
            for (io.sentry.android.core.internal.profiling.a aVar2 : this.E) {
                if (aVar2.a.equals(wVar)) {
                    if (!(l5Var2.b(aVar2.b) < 0)) {
                        l5 l5Var3 = aVar2.c;
                        if (l5Var3 != null) {
                            if (l5Var.b(l5Var3) > 0) {
                                continue;
                            }
                        }
                        synchronized (aVar2) {
                            cVar = aVar2.d;
                        }
                        io.sentry.profiling.c cVar2 = io.sentry.profiling.c.RECORDED;
                        if (cVar == cVar2) {
                            aVar.close();
                            return cVar2;
                        }
                        if (cVar == io.sentry.profiling.c.UNKNOWN) {
                            z = true;
                        } else {
                            z2 = true;
                        }
                    }
                }
            }
            if (z) {
                io.sentry.profiling.c cVar3 = io.sentry.profiling.c.UNKNOWN;
                aVar.close();
                return cVar3;
            }
            if (z2) {
                io.sentry.profiling.c cVar4 = io.sentry.profiling.c.NOT_RECORDED;
                aVar.close();
                return cVar4;
            }
            io.sentry.profiling.c cVar5 = io.sentry.profiling.c.UNKNOWN;
            aVar.close();
            return cVar5;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.b1
    public final void c(e4 e4Var) {
        io.sentry.util.a aVar = this.D;
        aVar.e();
        try {
            int i = u1.a[e4Var.ordinal()];
            if (i == 1) {
                int i2 = this.C - 1;
                this.C = i2;
                int iMax = Math.max(0, i2);
                this.C = iMax;
                if (iMax > 0) {
                    aVar.close();
                    return;
                }
                this.A = true;
            } else if (i == 2) {
                this.A = true;
            }
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.b1
    public final void d(e4 e4Var, d8 d8Var) {
        io.sentry.util.a aVar = this.D;
        aVar.e();
        try {
            if (this.z) {
                this.B = d8Var.b(io.sentry.util.p.a().c());
                this.z = false;
            }
            boolean z = this.B;
            io.sentry.g1 g1Var = this.m;
            if (!z) {
                g1Var.g(f6.DEBUG, "Profiler was not started due to sampling decision.", new Object[0]);
                aVar.close();
                return;
            }
            int i = u1.a[e4Var.ordinal()];
            if (i == 1) {
                this.C = Math.max(0, this.C) + 1;
            } else if (i == 2 && g()) {
                g1Var.g(f6.WARNING, "Unexpected call to startProfiler(MANUAL) while profiler already running. Skipping.", new Object[0]);
                aVar.close();
                return;
            }
            if (!g()) {
                g1Var.g(f6.DEBUG, "Started Profiler.", new Object[0]);
                this.A = false;
                i();
            }
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.b1
    public final void e() {
        io.sentry.util.a aVar = this.D;
        aVar.e();
        try {
            this.z = true;
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.w f() {
        io.sentry.util.a aVar = this.D;
        aVar.e();
        try {
            io.sentry.protocol.w wVar = this.v;
            aVar.close();
            return wVar;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean g() {
        io.sentry.util.a aVar = this.D;
        aVar.e();
        try {
            boolean z = this.r;
            aVar.close();
            return z;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final io.sentry.n1 h() {
        io.sentry.n1 n1Var = this.s;
        if (n1Var != null && n1Var != k3.b) {
            return n1Var;
        }
        io.sentry.n1 n1VarC = d5.c();
        if (n1VarC == k3.b) {
            this.m.g(f6.ERROR, "PerfettoContinuousProfiler: scopes not available. This is unexpected.", new Object[0]);
            return n1VarC;
        }
        this.s = n1VarC;
        this.t = n1VarC.l().getCompositePerformanceCollector();
        io.sentry.transport.p pVarC = n1VarC.c();
        if (pVarC != null) {
            pVarC.p.add(this);
        }
        return this.s;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [io.sentry.android.core.y1] */
    public final void i() {
        io.sentry.n1 n1VarH = h();
        io.sentry.transport.p pVarC = n1VarH.c();
        if (pVarC != null && (pVarC.j(io.sentry.q.All) || pVarC.j(io.sentry.q.ProfileChunkUi))) {
            this.m.g(f6.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
            j(false);
            return;
        }
        if (n1VarH.l().getConnectionStatusProvider().g0() == io.sentry.y0.DISCONNECTED) {
            this.m.g(f6.WARNING, "Device is offline. Stopping profiler.", new Object[0]);
            j(false);
            return;
        }
        this.y = n1VarH.l().getDateProvider().a();
        this.p = (a2) this.f131o.get();
        io.sentry.protocol.w wVar = io.sentry.protocol.w.n;
        if (wVar.equals(this.v)) {
            this.v = new io.sentry.protocol.w();
        }
        io.sentry.android.core.internal.profiling.a aVar = new io.sentry.android.core.internal.profiling.a(this.v, this.y);
        ArrayDeque arrayDeque = this.E;
        io.sentry.util.a aVar2 = this.F;
        aVar2.e();
        try {
            if (arrayDeque.size() == 10) {
                arrayDeque.removeFirst();
            }
            arrayDeque.addLast(aVar);
            aVar2.close();
            final a2 a2Var = this.p;
            if (a2Var.h) {
                a2Var.a.g(f6.WARNING, "PerfettoProfiler was already started.", new Object[0]);
            } else {
                byte b = 1;
                a2Var.h = true;
                if (a2Var.c == null) {
                    a2Var.a.g(f6.WARNING, "ProfilingManager is not available.", new Object[0]);
                } else {
                    a2Var.i = aVar;
                    Bundle bundle = new Bundle();
                    bundle.putInt("KEY_DURATION_MS", 60000);
                    bundle.putInt("KEY_FREQUENCY_HZ", 101);
                    try {
                        a2Var.c.requestProfiling(3, bundle, "sentry-profiling", a2Var.d, new xv((byte) 1), new Consumer() { // from class: io.sentry.android.core.y1
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                a2 a2Var2 = a2Var;
                                ProfilingResult profilingResult = (ProfilingResult) obj;
                                a2Var2.a.g(f6.DEBUG, "Perfetto ProfilingResult received: errorCode=%d, filePath=%s", Integer.valueOf(profilingResult.getErrorCode()), profilingResult.getResultFilePath());
                                io.sentry.android.core.internal.profiling.a aVar3 = a2Var2.i;
                                if (aVar3 != null && profilingResult.getErrorCode() != 0) {
                                    aVar3.a(io.sentry.profiling.c.NOT_RECORDED);
                                }
                                synchronized (a2Var2.e) {
                                    try {
                                        a2Var2.f = profilingResult;
                                        Consumer consumer = a2Var2.g;
                                        if (consumer != null) {
                                            consumer.accept(a2Var2.b(profilingResult));
                                            a2Var2.g = null;
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                        });
                        this.r = true;
                        if (this.w.equals(wVar)) {
                            this.w = new io.sentry.protocol.w();
                        }
                        v1 v1Var = this.q;
                        io.sentry.p pVar = this.t;
                        String strA = this.w.a();
                        v1Var.q = pVar;
                        v1Var.p = strA;
                        v1Var.m = SystemClock.elapsedRealtimeNanos();
                        ((ConcurrentLinkedDeque) v1Var.r).clear();
                        ((ConcurrentLinkedDeque) v1Var.s).clear();
                        ((ConcurrentLinkedDeque) v1Var.t).clear();
                        v1Var.f129o = ((io.sentry.android.core.internal.util.t) v1Var.n).a(new t(v1Var, b));
                        if (pVar != null) {
                            pVar.a(strA);
                        }
                        try {
                            this.u = this.n.n.getExecutorService().b(new b5((Object) this, (byte) 7), 60000L);
                            return;
                        } catch (RejectedExecutionException e) {
                            this.m.d(f6.ERROR, "Failed to schedule profiling chunk finish. Did you call Sentry.close()?", e);
                            this.A = true;
                            return;
                        }
                    } catch (Throwable th) {
                        a2Var.a.d(f6.ERROR, "Failed to request Profiling.", th);
                        a2Var.i = null;
                    }
                }
            }
            io.sentry.util.a aVar3 = this.F;
            aVar3.e();
            try {
                this.E.remove(aVar);
                aVar3.close();
                io.sentry.protocol.w wVar2 = io.sentry.protocol.w.n;
                this.v = wVar2;
                this.w = wVar2;
                this.m.g(f6.ERROR, "Failed to start Perfetto profiling.", new Object[0]);
            } catch (Throwable th2) {
                try {
                    aVar3.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            try {
                aVar2.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00ab  */
    public final void j(boolean z) {
        io.sentry.n1 n1Var;
        Object obj;
        final io.sentry.android.core.internal.profiling.a aVar;
        String str;
        a2 a2Var = this.p;
        Future future = this.u;
        if (future != null) {
            future.cancel(false);
        }
        if (a2Var == null || !this.r) {
            io.sentry.protocol.w wVar = io.sentry.protocol.w.n;
            this.v = wVar;
            this.w = wVar;
            return;
        }
        io.sentry.n1 n1VarH = h();
        final g7 g7VarL = n1VarH.l();
        v1 v1Var = this.q;
        final HashMap map = new HashMap();
        ((io.sentry.android.core.internal.util.t) v1Var.n).b((String) v1Var.f129o);
        v1Var.f129o = null;
        ConcurrentLinkedDeque concurrentLinkedDeque = (ConcurrentLinkedDeque) v1Var.t;
        ConcurrentLinkedDeque concurrentLinkedDeque2 = (ConcurrentLinkedDeque) v1Var.s;
        ConcurrentLinkedDeque concurrentLinkedDeque3 = (ConcurrentLinkedDeque) v1Var.r;
        if (!concurrentLinkedDeque3.isEmpty()) {
            map.put("slow_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", new ArrayList(concurrentLinkedDeque3)));
        }
        if (!concurrentLinkedDeque2.isEmpty()) {
            map.put("frozen_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", new ArrayList(concurrentLinkedDeque2)));
        }
        if (!concurrentLinkedDeque.isEmpty()) {
            map.put("screen_frame_rates", new io.sentry.profilemeasurements.a("hz", new ArrayList(concurrentLinkedDeque)));
        }
        io.sentry.p pVar = (io.sentry.p) v1Var.q;
        if (pVar == null || (str = (String) v1Var.p) == null) {
            n1Var = n1VarH;
            obj = null;
        } else {
            List listC = pVar.c(str);
            long nanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j = v1Var.m;
            if (listC != null) {
                ArrayList arrayList = (ArrayList) listC;
                if (arrayList.isEmpty()) {
                    n1Var = n1VarH;
                } else {
                    ArrayDeque arrayDeque = new ArrayDeque(arrayList.size());
                    ArrayDeque arrayDeque2 = new ArrayDeque(arrayList.size());
                    ArrayDeque arrayDeque3 = new ArrayDeque(arrayList.size());
                    synchronized (listC) {
                        try {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                z3 z3Var = (z3) it.next();
                                long j2 = jElapsedRealtimeNanos;
                                long j3 = z3Var.g;
                                long j4 = (j2 - (nanos - j3)) - j;
                                Iterator it2 = it;
                                if (z3Var.b) {
                                    arrayDeque.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(j4), Double.valueOf(z3Var.a), j3));
                                }
                                if (z3Var.d) {
                                    arrayDeque2.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(j4), Long.valueOf(z3Var.c), j3));
                                }
                                if (z3Var.f) {
                                    arrayDeque3.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(j4), Long.valueOf(z3Var.e), j3));
                                }
                                jElapsedRealtimeNanos = j2;
                                it = it2;
                                n1VarH = n1VarH;
                                j = j;
                            }
                            n1Var = n1VarH;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (!arrayDeque.isEmpty()) {
                        map.put("cpu_usage", new io.sentry.profilemeasurements.a("percent", arrayDeque));
                    }
                    if (!arrayDeque2.isEmpty()) {
                        map.put("memory_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque2));
                    }
                    if (!arrayDeque3.isEmpty()) {
                        map.put("memory_native_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque3));
                    }
                }
            } else {
                n1Var = n1VarH;
            }
            obj = null;
        }
        v1Var.q = obj;
        v1Var.p = obj;
        final io.sentry.protocol.w wVar2 = this.v;
        final io.sentry.protocol.w wVar3 = this.w;
        final l5 l5Var = this.y;
        l5 l5VarA = g7VarL.getDateProvider().a();
        io.sentry.util.a aVar2 = this.F;
        aVar2.e();
        try {
            io.sentry.android.core.internal.profiling.a aVar3 = (io.sentry.android.core.internal.profiling.a) this.E.peekLast();
            if (aVar3 == null || aVar3.c != null) {
                aVar2.close();
                aVar = null;
            } else {
                aVar3.c = l5VarA;
                aVar2.close();
                aVar = aVar3;
            }
            this.r = false;
            this.p = null;
            io.sentry.protocol.w wVar4 = io.sentry.protocol.w.n;
            this.w = wVar4;
            if (!z || this.A) {
                this.v = wVar4;
            }
            final boolean z2 = z && !this.A;
            final io.sentry.n1 n1Var2 = n1Var;
            Consumer consumer = new Consumer() { // from class: io.sentry.android.core.s1
                @Override // java.util.function.Consumer
                public final void accept(Object obj2) {
                    File file = (File) obj2;
                    w1 w1Var = this.a;
                    AtomicBoolean atomicBoolean = w1Var.x;
                    io.sentry.g1 g1Var = w1Var.m;
                    io.sentry.android.core.internal.profiling.a aVar4 = aVar;
                    if (aVar4 != null) {
                        aVar4.a((file == null || atomicBoolean.get()) ? io.sentry.profiling.c.NOT_RECORDED : io.sentry.profiling.c.RECORDED);
                    }
                    if (file == null) {
                        g1Var.g(f6.ERROR, "An error occurred while collecting a profile chunk, and it won't be sent.", new Object[0]);
                    } else {
                        b4 b4Var = new b4(wVar2, wVar3, map, file, l5Var);
                        b4Var.f = "application/x-perfetto-trace";
                        io.sentry.n1 n1Var3 = n1Var2;
                        g7 g7Var = g7VarL;
                        t1 t1Var = new t1(w1Var, n1Var3, b4Var, g7Var, (byte) 0);
                        try {
                            if (Thread.currentThread().getName().startsWith("SentryExecutorServiceThreadFactory")) {
                                t1Var.run();
                            } else {
                                w1Var.n.n.getExecutorService().submit(t1Var);
                            }
                        } catch (Throwable th2) {
                            g7Var.getLogger().d(f6.DEBUG, "Failed to send profile chunk.", th2);
                        }
                    }
                    if (!z2) {
                        g1Var.g(f6.DEBUG, "Profile chunk finished.", new Object[0]);
                        return;
                    }
                    io.sentry.util.a aVar5 = w1Var.D;
                    aVar5.e();
                    try {
                        if (w1Var.r || atomicBoolean.get() || w1Var.A) {
                            g1Var.g(f6.DEBUG, "Profile chunk finished, but profiler was already restarted, closed or stopped. Skipping.", new Object[0]);
                        } else {
                            g1Var.g(f6.DEBUG, "Profile chunk finished. Starting a new one.", new Object[0]);
                            w1Var.i();
                        }
                        aVar5.close();
                    } catch (Throwable th3) {
                        try {
                            aVar5.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                }
            };
            if (!a2Var.h) {
                a2Var.a.g(f6.WARNING, "PerfettoProfiler was never started", new Object[0]);
                consumer.accept(null);
                return;
            }
            a2Var.d.cancel();
            synchronized (a2Var.e) {
                try {
                    ProfilingResult profilingResult = a2Var.f;
                    if (profilingResult != null) {
                        consumer.accept(a2Var.b(profilingResult));
                        return;
                    }
                    a2Var.g = consumer;
                    try {
                        a2Var.b.b(new b5((Object) a2Var, (byte) 8), 5000L);
                    } catch (RejectedExecutionException e) {
                        a2Var.a.d(f6.DEBUG, "Failed to schedule profiling result timeout.", e);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                aVar2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }
}
