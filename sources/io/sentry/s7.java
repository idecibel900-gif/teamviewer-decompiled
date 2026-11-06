package io.sentry;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class s7 implements x1 {
    public final v7 b;
    public final v4 d;
    public final String e;
    public volatile Future g;
    public volatile Future h;
    public volatile boolean i;
    public final io.sentry.util.a j;
    public final io.sentry.util.a k;
    public final AtomicBoolean l;
    public final AtomicBoolean m;
    public final io.sentry.protocol.h0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c2 f262o;
    public final io.sentry.protocol.e p;
    public final p q;
    public final f8 r;
    public final io.sentry.protocol.w a = new io.sentry.protocol.w();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public r7 f = r7.c;

    public s7(e8 e8Var, v4 v4Var, f8 f8Var, p pVar) {
        this.i = false;
        io.sentry.util.a aVar = new io.sentry.util.a();
        this.j = aVar;
        this.k = new io.sentry.util.a();
        this.l = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.m = atomicBoolean;
        io.sentry.protocol.e eVar = new io.sentry.protocol.e();
        this.p = eVar;
        v7 v7Var = new v7(e8Var, this, v4Var, f8Var);
        this.b = v7Var;
        this.e = e8Var.B;
        this.f262o = e8Var.x;
        this.d = v4Var;
        Boolean bool = Boolean.TRUE;
        pVar = bool.equals(G()) ? pVar : null;
        this.q = pVar;
        this.n = e8Var.C;
        this.r = f8Var;
        H(v7Var);
        io.sentry.protocol.w wVarE = E();
        if (!wVarE.equals(io.sentry.protocol.w.n) && bool.equals(G())) {
            eVar.l(new d4(wVarE), "profile");
        }
        if (pVar != null) {
            pVar.e(this);
        }
        if (f8Var.g == null && f8Var.h == null) {
            return;
        }
        boolean z = true;
        this.i = true;
        Long l = f8Var.h;
        if (l != null) {
            aVar.e();
            try {
                if (this.i) {
                    A();
                    atomicBoolean.set(true);
                    try {
                        this.h = v4Var.l().getTimerExecutorService().b(new o7(this, (byte) 1), l.longValue());
                    } catch (Throwable th) {
                        this.d.l().getLogger().d(f6.WARNING, "Failed to schedule finish timer", th);
                        a8 status = getStatus();
                        if (status == null) {
                            status = a8.DEADLINE_EXCEEDED;
                        }
                        if (this.r.g == null) {
                            z = false;
                        }
                        e(status, z, null);
                        this.m.set(false);
                    }
                }
                aVar.close();
            } catch (Throwable th2) {
                try {
                    aVar.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        t();
    }

    public static boolean F(b1 b1Var, v7 v7Var, l5 l5Var) {
        Object obj = v7Var.k.get("profiler_id");
        if (!(obj instanceof String)) {
            return false;
        }
        try {
            io.sentry.protocol.w wVar = new io.sentry.protocol.w((String) obj);
            l5 l5Var2 = v7Var.b;
            l5 l5Var3 = v7Var.a;
            if (l5Var2 != null) {
                l5Var = l5Var2;
            }
            return b1Var.b(wVar, l5Var3, l5Var) == io.sentry.profiling.c.NOT_RECORDED;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public final void A() {
        io.sentry.util.a aVar = this.j;
        aVar.e();
        try {
            if (this.h != null) {
                this.h.cancel(false);
                this.m.set(false);
                this.h = null;
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

    public final void B() {
        io.sentry.util.a aVar = this.j;
        aVar.e();
        try {
            if (this.g != null) {
                this.g.cancel(false);
                this.l.set(false);
                this.g = null;
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

    public final v1 C(w7 w7Var, z7 z7Var) {
        boolean z = this.b.g;
        r3 r3Var = r3.a;
        if (!z && this.f262o.equals(w7Var.x)) {
            v4 v4Var = this.d;
            if (!io.sentry.util.q.a((String) z7Var.d, v4Var.l().getIgnoredSpanOrigins())) {
                y7 y7Var = w7Var.f274o;
                String str = w7Var.q;
                String str2 = w7Var.r;
                CopyOnWriteArrayList copyOnWriteArrayList = this.c;
                if (copyOnWriteArrayList.size() >= v4Var.l().getMaxSpans()) {
                    v4Var.l().getLogger().g(f6.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
                    return r3Var;
                }
                io.sentry.util.b.v(y7Var, "parentSpanId is required");
                io.sentry.util.b.v(str, "operation is required");
                B();
                v7 v7Var = new v7(this, this.d, w7Var, z7Var, new p7(this, (byte) 0));
                H(v7Var);
                copyOnWriteArrayList.add(v7Var);
                p pVar = this.q;
                if (pVar != null) {
                    pVar.d(v7Var);
                }
                return v7Var;
            }
        }
        return r3Var;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00af  */
    public final void D(a8 a8Var, l5 l5Var, boolean z, p0 p0Var) {
        f4 f4VarC;
        l5 l5Var2 = this.b.b;
        if (l5Var == null) {
            l5Var = l5Var2;
        }
        if (l5Var == null) {
            l5Var = this.d.l().getDateProvider().a();
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            z7 z7Var = ((v7) it.next()).i;
        }
        byte b = 1;
        this.f = new r7(true, a8Var);
        if (this.b.g) {
            return;
        }
        if (this.r.f) {
            ListIterator listIterator = this.c.listIterator();
            while (listIterator.hasNext()) {
                v7 v7Var = (v7) listIterator.next();
                if (!v7Var.g && v7Var.b == null) {
                    return;
                }
            }
        }
        AtomicReference atomicReference = new AtomicReference();
        v7 v7Var2 = this.b;
        v7Var2.j = new i5(this, v7Var2.j, atomicReference, b);
        v7Var2.x(this.f.b, l5Var);
        Boolean bool = Boolean.TRUE;
        if (bool.equals(G())) {
            h4 h4Var = this.b.c.p;
            if (bool.equals(h4Var == null ? null : (Boolean) h4Var.d)) {
                f4VarC = this.d.l().getTransactionProfiler().c(this, (List) atomicReference.get(), this.d.l());
            } else {
                f4VarC = null;
            }
        } else {
            f4VarC = null;
        }
        if (this.d.l().isContinuousProfilingEnabled()) {
            e4 profileLifecycle = this.d.l().getProfileLifecycle();
            e4 e4Var = e4.TRACE;
            if (profileLifecycle == e4Var && this.b.c.A.equals(io.sentry.protocol.w.n)) {
                this.d.l().getContinuousProfiler().c(e4Var);
            }
        }
        if (atomicReference.get() != null) {
            ((List) atomicReference.get()).clear();
        }
        v4 v4Var = this.d;
        byte b2 = 0;
        if (v4Var.isEnabled()) {
            try {
                l1 l1VarQ = v4Var.f.Q(null);
                l1VarQ.H(new q7(this, l1VarQ, b2));
            } catch (Throwable th) {
                v4Var.l().getLogger().d(f6.ERROR, "Error in the 'configureScope' callback.", th);
            }
        } else {
            v4Var.l().getLogger().g(f6.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
        }
        v7 v7Var3 = this.b;
        v4 v4Var2 = this.d;
        b1 continuousProfiler = v4Var2.l().getContinuousProfiler();
        if (!(continuousProfiler instanceof d3)) {
            if (F(continuousProfiler, v7Var3, l5Var)) {
                v7Var3.m(null, "profiler_id");
                this.p.n("profile");
                v4Var2.l().getLogger().g(f6.DEBUG, "No profile was recorded for transaction, dropping its profiler id.", new Object[0]);
            }
            for (v7 v7Var4 : this.c) {
                if (F(continuousProfiler, v7Var4, l5Var)) {
                    v7Var4.m(null, "profiler_id");
                }
            }
        }
        io.sentry.protocol.f0 f0Var = new io.sentry.protocol.f0(this);
        if (this.i) {
            io.sentry.util.a aVar = this.j;
            aVar.e();
            try {
                if (this.i) {
                    B();
                    A();
                    this.i = false;
                }
                aVar.close();
            } catch (Throwable th2) {
                try {
                    aVar.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (z && this.c.isEmpty() && this.r.g != null) {
            this.d.l().getLogger().g(f6.DEBUG, "Dropping idle transaction %s because it has no child spans", this.e);
        } else {
            f0Var.F.putAll(this.b.l);
            this.d.y(f0Var, b(), p0Var, f4VarC);
        }
    }

    public final io.sentry.protocol.w E() {
        v7 v7Var = this.b;
        return !v7Var.c.A.equals(io.sentry.protocol.w.n) ? v7Var.c.A : this.d.l().getContinuousProfiler().f();
    }

    public final Boolean G() {
        h4 h4Var = this.b.c.p;
        if (h4Var == null) {
            return null;
        }
        return (Boolean) h4Var.a;
    }

    public final void H(v7 v7Var) {
        io.sentry.util.thread.a threadChecker = this.d.l().getThreadChecker();
        io.sentry.protocol.w wVarE = E();
        if (!wVarE.equals(io.sentry.protocol.w.n)) {
            Boolean bool = Boolean.TRUE;
            h4 h4Var = v7Var.c.p;
            if (bool.equals(h4Var == null ? null : (Boolean) h4Var.a)) {
                v7Var.m(wVarE.a(), "profiler_id");
            }
        }
        v7Var.m(String.valueOf(threadChecker.b()), "thread.id");
        v7Var.m(threadChecker.a(), "thread.name");
    }

    public final void I(d dVar) {
        v7 v7Var = this.b;
        v4 v4Var = this.d;
        io.sentry.util.a aVar = this.k;
        aVar.e();
        try {
            if (dVar.f) {
                AtomicReference atomicReference = new AtomicReference();
                if (v4Var.isEnabled()) {
                    try {
                        atomicReference.set(v4Var.f.Q(null).j());
                    } catch (Throwable th) {
                        v4Var.l().getLogger().d(f6.ERROR, "Error in the 'configureScope' callback.", th);
                    }
                } else {
                    v4Var.l().getLogger().g(f6.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
                }
                dVar.e(v7Var.c.m, (io.sentry.protocol.w) atomicReference.get(), v4Var.l(), v7Var.c.p, this.e, this.n);
                dVar.f = false;
            }
            aVar.close();
        } catch (Throwable th2) {
            try {
                aVar.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    @Override // io.sentry.v1
    public final void a(a8 a8Var) {
        v7 v7Var = this.b;
        if (v7Var.g) {
            this.d.l().getLogger().g(f6.DEBUG, "The transaction is already finished. Status %s cannot be set", a8Var == null ? "null" : a8Var.name());
        } else {
            v7Var.c.s = a8Var;
        }
    }

    @Override // io.sentry.v1
    public final c8 b() {
        d dVar;
        if (!this.d.l().isTraceSampling() || (dVar = this.b.c.y) == null) {
            return null;
        }
        I(dVar);
        return dVar.f();
    }

    @Override // io.sentry.v1
    public final n7 c() {
        return this.b.c();
    }

    @Override // io.sentry.v1
    public final boolean d() {
        return this.b.g;
    }

    @Override // io.sentry.x1
    public final void e(a8 a8Var, boolean z, p0 p0Var) {
        if (this.b.g) {
            return;
        }
        l5 l5VarA = this.d.l().getDateProvider().a();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(this.c);
        ListIterator listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
        while (listIterator.hasPrevious()) {
            v7 v7Var = (v7) listIterator.previous();
            v7Var.j = null;
            v7Var.x(a8Var, l5VarA);
        }
        D(a8Var, l5VarA, z, p0Var);
    }

    @Override // io.sentry.v1
    public final void f(Number number, String str) {
        this.b.f(number, str);
    }

    @Override // io.sentry.v1
    public final void g(Throwable th) {
        v7 v7Var = this.b;
        if (v7Var.g) {
            this.d.l().getLogger().g(f6.DEBUG, "The transaction is already finished. Throwable cannot be set", new Object[0]);
        } else {
            v7Var.e = th;
        }
    }

    @Override // io.sentry.v1
    public final String getDescription() {
        return this.b.c.r;
    }

    @Override // io.sentry.x1
    public final String getName() {
        return this.e;
    }

    @Override // io.sentry.v1
    public final a8 getStatus() {
        return this.b.c.s;
    }

    @Override // io.sentry.v1
    public final void h(a8 a8Var) {
        x(a8Var, null);
    }

    @Override // io.sentry.v1
    public final boolean i() {
        return false;
    }

    @Override // io.sentry.v1
    public final e j(List list) {
        d dVar;
        if (!this.d.l().isTraceSampling() || (dVar = this.b.c.y) == null) {
            return null;
        }
        I(dVar);
        return e.a(dVar, list);
    }

    @Override // io.sentry.v1
    public final v1 k(String str, String str2, l5 l5Var, c2 c2Var) {
        return p(str, str2, l5Var, c2Var, new z7((byte) 0));
    }

    @Override // io.sentry.v1
    public final void l() {
        x(getStatus(), null);
    }

    @Override // io.sentry.v1
    public final void m(Object obj, String str) {
        v7 v7Var = this.b;
        if (v7Var.g) {
            this.d.l().getLogger().g(f6.DEBUG, "The transaction is already finished. Data %s cannot be set", str);
        } else {
            v7Var.m(obj, str);
        }
    }

    @Override // io.sentry.v1
    public final void n() {
        v4 v4Var = this.d;
        if (!v4Var.isEnabled()) {
            v4Var.l().getLogger().g(f6.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            v4Var.f.Q(null).J(this);
        } catch (Throwable th) {
            v4Var.l().getLogger().d(f6.ERROR, "Error in the 'configureScope' callback.", th);
        }
    }

    @Override // io.sentry.x1
    public final v1 o() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(this.c);
        ListIterator listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
        while (listIterator.hasPrevious()) {
            v7 v7Var = (v7) listIterator.previous();
            if (!v7Var.g) {
                return v7Var;
            }
        }
        return null;
    }

    @Override // io.sentry.v1
    public final v1 p(String str, String str2, l5 l5Var, c2 c2Var, z7 z7Var) {
        boolean z = this.b.g;
        r3 r3Var = r3.a;
        if (z || !this.f262o.equals(c2Var)) {
            return r3Var;
        }
        int size = this.c.size();
        v4 v4Var = this.d;
        if (size < v4Var.l().getMaxSpans()) {
            return this.b.p(str, str2, l5Var, c2Var, z7Var);
        }
        v4Var.l().getLogger().g(f6.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
        return r3Var;
    }

    @Override // io.sentry.v1
    public final void q(String str) {
        v7 v7Var = this.b;
        if (v7Var.g) {
            this.d.l().getLogger().g(f6.DEBUG, "The transaction is already finished. Description %s cannot be set", str);
        } else {
            v7Var.c.r = str;
        }
    }

    @Override // io.sentry.x1
    public final io.sentry.protocol.w r() {
        return this.a;
    }

    @Override // io.sentry.v1
    public final v1 s(String str) {
        return y(str, null);
    }

    @Override // io.sentry.x1
    public final void t() {
        Long l;
        io.sentry.util.a aVar = this.j;
        aVar.e();
        try {
            if (this.i && (l = this.r.g) != null) {
                B();
                this.l.set(true);
                try {
                    this.g = this.d.l().getTimerExecutorService().b(new o7(this, (byte) 0), l.longValue());
                } catch (Throwable th) {
                    this.d.l().getLogger().d(f6.WARNING, "Failed to schedule finish timer", th);
                    a8 status = getStatus();
                    if (status == null) {
                        status = a8.OK;
                    }
                    x(status, null);
                    this.l.set(false);
                }
            }
            aVar.close();
        } catch (Throwable th2) {
            try {
                aVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.v1
    public final void u(String str, Long l, y2 y2Var) {
        this.b.u(str, l, y2Var);
    }

    @Override // io.sentry.v1
    public final w7 v() {
        return this.b.c;
    }

    @Override // io.sentry.v1
    public final l5 w() {
        return this.b.b;
    }

    @Override // io.sentry.v1
    public final void x(a8 a8Var, l5 l5Var) {
        D(a8Var, l5Var, true, null);
    }

    @Override // io.sentry.v1
    public final v1 y(String str, String str2) {
        return p(str, str2, null, c2.SENTRY, new z7((byte) 0));
    }

    @Override // io.sentry.v1
    public final l5 z() {
        return this.b.a;
    }
}
