package io.sentry;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class p4 implements l1 {
    public x1 a;
    public final WeakReference b;
    public io.sentry.protocol.i0 c;
    public String d;
    public io.sentry.protocol.r e;
    public final ArrayList f;
    public volatile Queue g;
    public final ConcurrentHashMap h;
    public final ConcurrentHashMap i;
    public final ConcurrentHashMap j;
    public final CopyOnWriteArrayList k;
    public volatile g7 l;
    public volatile u7 m;
    public final io.sentry.util.a n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final io.sentry.util.a f220o;
    public final io.sentry.util.a p;
    public final io.sentry.protocol.e q;
    public final CopyOnWriteArrayList r;
    public h4 s;
    public io.sentry.protocol.w t;
    public q1 u;
    public final Map v;
    public final io.sentry.featureflags.b w;

    public p4(p4 p4Var) {
        io.sentry.protocol.i0 i0Var;
        io.sentry.protocol.r rVar;
        this.b = new WeakReference(null);
        this.f = new ArrayList();
        this.h = new ConcurrentHashMap();
        this.i = new ConcurrentHashMap();
        this.j = new ConcurrentHashMap();
        this.k = new CopyOnWriteArrayList();
        this.n = new io.sentry.util.a();
        this.f220o = new io.sentry.util.a();
        this.p = new io.sentry.util.a();
        this.q = new io.sentry.protocol.e();
        this.r = new CopyOnWriteArrayList();
        this.t = io.sentry.protocol.w.n;
        this.u = n3.a;
        this.v = Collections.synchronizedMap(new WeakHashMap());
        this.a = p4Var.a;
        this.b = p4Var.b;
        this.m = p4Var.m;
        this.l = p4Var.l;
        this.u = p4Var.u;
        io.sentry.protocol.i0 i0Var2 = p4Var.c;
        if (i0Var2 != null) {
            i0Var = new io.sentry.protocol.i0();
            i0Var.m = i0Var2.m;
            i0Var.f232o = i0Var2.f232o;
            i0Var.n = i0Var2.n;
            i0Var.p = i0Var2.p;
            i0Var.q = i0Var2.q;
            i0Var.r = i0Var2.r;
            i0Var.s = io.sentry.util.b.r(i0Var2.s);
            i0Var.t = io.sentry.util.b.r(i0Var2.t);
        } else {
            i0Var = null;
        }
        this.c = i0Var;
        this.d = p4Var.d;
        this.t = p4Var.t;
        io.sentry.protocol.r rVar2 = p4Var.e;
        if (rVar2 != null) {
            rVar = new io.sentry.protocol.r();
            rVar.m = rVar2.m;
            rVar.q = rVar2.q;
            rVar.n = rVar2.n;
            rVar.f245o = rVar2.f245o;
            rVar.r = io.sentry.util.b.r(rVar2.r);
            rVar.s = io.sentry.util.b.r(rVar2.s);
            rVar.u = io.sentry.util.b.r(rVar2.u);
            rVar.x = io.sentry.util.b.r(rVar2.x);
            rVar.p = rVar2.p;
            rVar.v = rVar2.v;
            rVar.t = rVar2.t;
            rVar.w = rVar2.w;
        } else {
            rVar = null;
        }
        this.e = rVar;
        this.f = new ArrayList(p4Var.f);
        this.k = new CopyOnWriteArrayList(p4Var.k);
        h[] hVarArr = (h[]) p4Var.g.toArray(new h[0]);
        Queue queueA = a(p4Var.l.getMaxBreadcrumbs());
        for (h hVar : hVarArr) {
            queueA.add(new h(hVar));
        }
        this.g = queueA;
        ConcurrentHashMap concurrentHashMap = p4Var.h;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (entry != null) {
                concurrentHashMap2.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        this.h = concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3 = p4Var.i;
        ConcurrentHashMap concurrentHashMap4 = new ConcurrentHashMap();
        for (Map.Entry entry2 : concurrentHashMap3.entrySet()) {
            if (entry2 != null) {
                String str = (String) entry2.getKey();
                if (entry2.getValue() != null) {
                    h2.f();
                    throw null;
                }
                concurrentHashMap4.put(str, null);
            }
        }
        this.i = concurrentHashMap4;
        ConcurrentHashMap concurrentHashMap5 = p4Var.j;
        ConcurrentHashMap concurrentHashMap6 = new ConcurrentHashMap();
        for (Map.Entry entry3 : concurrentHashMap5.entrySet()) {
            if (entry3 != null) {
                concurrentHashMap6.put((String) entry3.getKey(), entry3.getValue());
            }
        }
        this.j = concurrentHashMap6;
        this.q = new io.sentry.protocol.e(p4Var.q);
        this.r = new CopyOnWriteArrayList(p4Var.r);
        this.w = p4Var.w.m23clone();
        this.s = new h4(p4Var.s);
    }

    public static Queue a(int i) {
        return i > 0 ? new b8(new k(i)) : new f0();
    }

    @Override // io.sentry.l1
    public final List A() {
        return this.k;
    }

    @Override // io.sentry.l1
    public final List B() {
        return new CopyOnWriteArrayList(this.r);
    }

    @Override // io.sentry.l1
    public final void C(v5 v5Var) {
        v1 v1Var;
        if (!this.l.isTracingEnabled() || v5Var.a() == null) {
            return;
        }
        Map map = this.v;
        Throwable thA = v5Var.a();
        io.sentry.util.b.v(thA, "throwable cannot be null");
        while (thA.getCause() != null && thA.getCause() != thA) {
            thA = thA.getCause();
        }
        io.sentry.util.k kVar = (io.sentry.util.k) map.get(thA);
        if (kVar != null) {
            WeakReference weakReference = kVar.a;
            if (v5Var.n.j() == null && (v1Var = (v1) weakReference.get()) != null) {
                v5Var.n.x(v1Var.v());
            }
            String str = (String) kVar.b;
            if (v5Var.H == null) {
                v5Var.H = str;
            }
        }
    }

    @Override // io.sentry.l1
    public final io.sentry.protocol.e D() {
        return this.q;
    }

    @Override // io.sentry.l1
    public final h4 F(m4 m4Var) {
        io.sentry.util.a aVar = this.p;
        aVar.e();
        try {
            m4Var.b(this.s);
            h4 h4Var = new h4(this.s);
            aVar.close();
            return h4Var;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.l1
    public final String G() {
        return this.d;
    }

    @Override // io.sentry.l1
    public final void H(o4 o4Var) {
        io.sentry.util.a aVar = this.f220o;
        aVar.e();
        try {
            o4Var.e(this.a);
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

    @Override // io.sentry.l1
    public final void I(io.sentry.protocol.w wVar) {
    }

    @Override // io.sentry.l1
    public final void J(x1 x1Var) {
        io.sentry.util.a aVar = this.f220o;
        aVar.e();
        try {
            this.a = x1Var;
            for (m1 m1Var : this.l.getScopeObservers()) {
                if (x1Var != null) {
                    m1Var.p(x1Var.getName());
                    m1Var.n(x1Var.v(), this);
                } else {
                    m1Var.p(null);
                    m1Var.n(null, this);
                }
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

    @Override // io.sentry.l1
    public final List K() {
        return this.f;
    }

    @Override // io.sentry.l1
    public final io.sentry.protocol.i0 L() {
        return this.c;
    }

    @Override // io.sentry.l1
    public final List M() {
        return io.sentry.util.b.C(this.k);
    }

    @Override // io.sentry.l1
    public final String N() {
        x1 x1Var = this.a;
        if (x1Var != null) {
            return x1Var.getName();
        }
        return null;
    }

    @Override // io.sentry.l1
    public final void O(h4 h4Var) {
        this.s = h4Var;
        w7 w7Var = new w7((io.sentry.protocol.w) h4Var.b, (y7) h4Var.c, "default", null);
        w7Var.u = "auto";
        Iterator<m1> it = this.l.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().n(w7Var, this);
        }
    }

    @Override // io.sentry.l1
    public final void clear() {
        this.c = null;
        this.e = null;
        this.d = null;
        this.f.clear();
        this.g.clear();
        Iterator<m1> it = this.l.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().l(this.g);
        }
        this.h.clear();
        this.i.clear();
        this.j.clear();
        this.q.a();
        this.k.clear();
        q();
        this.r.clear();
        Iterator<m1> it2 = this.l.getScopeObservers().iterator();
        while (it2.hasNext()) {
            it2.next().m();
        }
        this.w.clear();
        Iterator<m1> it3 = this.l.getScopeObservers().iterator();
        while (it3.hasNext()) {
            it3.next().o(this.q);
        }
    }

    @Override // io.sentry.l1
    public final l1 clone() {
        return new p4(this);
    }

    @Override // io.sentry.l1
    public final void e(Throwable th, v7 v7Var, String str) {
        io.sentry.util.b.v(th, "throwable is required");
        io.sentry.util.b.v(str, "transactionName is required");
        while (th.getCause() != null && th.getCause() != th) {
            th = th.getCause();
        }
        Map map = this.v;
        if (map.containsKey(th)) {
            return;
        }
        map.put(th, new io.sentry.util.k(new WeakReference(v7Var), str));
    }

    @Override // io.sentry.l1
    public final void f(h hVar, p0 p0Var) {
        if (hVar == null || (this.g instanceof f0) || io.sentry.util.o.a()) {
            return;
        }
        r6 beforeBreadcrumb = this.l.getBeforeBreadcrumb();
        if (beforeBreadcrumb != null) {
            if (p0Var == null) {
                p0Var = new p0();
            }
            try {
                ThreadLocal threadLocal = io.sentry.util.o.a;
                Integer num = (Integer) threadLocal.get();
                int iIntValue = 1;
                if (num != null) {
                    iIntValue = 1 + num.intValue();
                }
                threadLocal.set(Integer.valueOf(iIntValue));
                io.sentry.util.n nVar = io.sentry.util.o.b;
                try {
                    hVar = ((io.sentry.internal.debugmeta.c) beforeBreadcrumb).n(hVar, p0Var);
                    if (nVar != null) {
                        nVar.close();
                    }
                } catch (Throwable th) {
                    if (nVar != null) {
                        try {
                            nVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                this.l.getLogger().d(f6.ERROR, "The BeforeBreadcrumbCallback callback threw an exception. Exception details will be added to the breadcrumb.", th3);
                if (th3.getMessage() != null) {
                    hVar.d(th3.getMessage(), "sentry:message");
                }
            }
        }
        if (hVar == null) {
            this.l.getLogger().g(f6.INFO, "Breadcrumb was dropped by beforeBreadcrumb", new Object[0]);
            return;
        }
        this.g.add(hVar);
        for (m1 m1Var : this.l.getScopeObservers()) {
            m1Var.j(hVar);
            m1Var.l(this.g);
        }
    }

    @Override // io.sentry.l1
    public final v1 g() {
        v1 v1VarO;
        v1 v1Var = (v1) this.b.get();
        if (v1Var != null) {
            return v1Var;
        }
        x1 x1Var = this.a;
        return (x1Var == null || (v1VarO = x1Var.o()) == null) ? x1Var : v1VarO;
    }

    @Override // io.sentry.l1
    public final Map getAttributes() {
        return io.sentry.util.b.r(this.i);
    }

    @Override // io.sentry.l1
    public final Map getExtras() {
        return this.j;
    }

    @Override // io.sentry.l1
    public final io.sentry.protocol.j h() {
        return this.w.h();
    }

    @Override // io.sentry.l1
    public final io.sentry.protocol.w j() {
        return this.t;
    }

    @Override // io.sentry.l1
    public final void k(io.sentry.protocol.w wVar) {
        this.t = wVar;
        Iterator<m1> it = this.l.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().k(wVar);
        }
    }

    @Override // io.sentry.l1
    public final g7 l() {
        return this.l;
    }

    @Override // io.sentry.l1
    public final x1 m() {
        return this.a;
    }

    @Override // io.sentry.l1
    public final u7 n() {
        io.sentry.util.a aVar = this.n;
        aVar.e();
        try {
            u7 u7Var = null;
            if (this.m != null) {
                u7 u7Var2 = this.m;
                u7Var2.getClass();
                u7Var2.b(new Date());
                this.l.getContinuousProfiler().e();
                u7 u7VarClone = this.m.clone();
                this.m = null;
                u7Var = u7VarClone;
            }
            aVar.close();
            return u7Var;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.l1
    public final io.sentry.internal.debugmeta.c o() {
        io.sentry.util.a aVar = this.n;
        aVar.e();
        try {
            if (this.m != null) {
                u7 u7Var = this.m;
                u7Var.getClass();
                u7Var.b(new Date());
                this.l.getContinuousProfiler().e();
            }
            u7 u7Var2 = this.m;
            io.sentry.internal.debugmeta.c cVar = null;
            if (this.l.getRelease() != null) {
                String distinctId = this.l.getDistinctId();
                io.sentry.protocol.i0 i0Var = this.c;
                this.m = new u7(t7.Ok, new Date(), new Date(), 0, distinctId, io.sentry.config.a.n(), Boolean.TRUE, null, null, i0Var != null ? i0Var.p : null, null, this.l.getEnvironment(), this.l.getRelease(), null);
                cVar = new io.sentry.internal.debugmeta.c((Object) this.m.clone(), (Object) (u7Var2 != null ? u7Var2.clone() : null), (byte) 6);
            } else {
                this.l.getLogger().g(f6.WARNING, "Release is not set on SentryOptions. Session could not be started", new Object[0]);
            }
            aVar.close();
            return cVar;
        } catch (Throwable th) {
            try {
                aVar.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // io.sentry.l1
    public final io.sentry.protocol.r p() {
        return this.e;
    }

    @Override // io.sentry.l1
    public final void q() {
        io.sentry.util.a aVar = this.f220o;
        aVar.e();
        try {
            this.a = null;
            aVar.close();
            for (m1 m1Var : this.l.getScopeObservers()) {
                m1Var.p(null);
                m1Var.n(null, this);
            }
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.l1
    public final io.sentry.featureflags.b r() {
        return this.w;
    }

    @Override // io.sentry.l1
    public final u7 s() {
        return this.m;
    }

    @Override // io.sentry.l1
    public final Queue t() {
        return this.g;
    }

    @Override // io.sentry.l1
    public final f6 u() {
        return null;
    }

    @Override // io.sentry.l1
    public final h4 v() {
        return this.s;
    }

    @Override // io.sentry.l1
    public final u7 w(n4 n4Var) {
        io.sentry.util.a aVar = this.n;
        aVar.e();
        try {
            n4Var.a(this.m);
            u7 u7VarClone = this.m != null ? this.m.clone() : null;
            aVar.close();
            return u7VarClone;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.l1
    public final void x(String str) {
        this.d = str;
        io.sentry.protocol.e eVar = this.q;
        io.sentry.protocol.a aVarE = eVar.e();
        if (aVarE == null) {
            aVarE = new io.sentry.protocol.a();
            eVar.o(aVarE);
        }
        if (str == null) {
            aVarE.u = null;
        } else {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            aVarE.u = arrayList;
        }
        Iterator<m1> it = this.l.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().o(eVar);
        }
    }

    @Override // io.sentry.l1
    public final q1 y() {
        return this.u;
    }

    @Override // io.sentry.l1
    public final Map z() {
        return io.sentry.util.b.r(this.h);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final Object m29clone() {
        return new p4(this);
    }

    public p4(g7 g7Var) {
        io.sentry.featureflags.b aVar;
        this.b = new WeakReference(null);
        this.f = new ArrayList();
        this.h = new ConcurrentHashMap();
        this.i = new ConcurrentHashMap();
        this.j = new ConcurrentHashMap();
        this.k = new CopyOnWriteArrayList();
        this.n = new io.sentry.util.a();
        this.f220o = new io.sentry.util.a();
        this.p = new io.sentry.util.a();
        this.q = new io.sentry.protocol.e();
        this.r = new CopyOnWriteArrayList();
        this.t = io.sentry.protocol.w.n;
        this.u = n3.a;
        this.v = Collections.synchronizedMap(new WeakHashMap());
        io.sentry.util.b.v(g7Var, "SentryOptions is required.");
        this.l = g7Var;
        this.g = a(this.l.getMaxBreadcrumbs());
        int maxFeatureFlags = g7Var.getMaxFeatureFlags();
        if (maxFeatureFlags > 0) {
            aVar = new io.sentry.featureflags.a(maxFeatureFlags, Collections.EMPTY_LIST);
        } else {
            aVar = io.sentry.featureflags.c.m;
        }
        this.w = aVar;
        this.s = new h4();
    }
}
