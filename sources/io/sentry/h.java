package io.sentry;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public final class h implements t2, Comparable {
    public static final Map w = Collections.EMPTY_MAP;
    public final Long m;
    public Date n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Long f197o;
    public String p;
    public String q;
    public volatile Map r;
    public String s;
    public String t;
    public f6 u;
    public ConcurrentHashMap v;

    public h(h hVar) {
        ConcurrentHashMap concurrentHashMapR;
        this.r = w;
        this.f197o = hVar.f197o;
        this.n = hVar.n;
        this.m = hVar.m;
        this.p = hVar.p;
        this.q = hVar.q;
        this.s = hVar.s;
        this.t = hVar.t;
        if (!hVar.r.isEmpty() && (concurrentHashMapR = io.sentry.util.b.r(hVar.r)) != null) {
            this.r = concurrentHashMapR;
        }
        this.v = io.sentry.util.b.r(hVar.v);
        this.u = hVar.u;
    }

    public static boolean a(h hVar, h hVar2) {
        return hVar.c().getTime() == hVar2.c().getTime() && io.sentry.util.b.j(hVar.p, hVar2.p) && io.sentry.util.b.j(hVar.q, hVar2.q) && io.sentry.util.b.j(hVar.s, hVar2.s) && io.sentry.util.b.j(hVar.t, hVar2.t) && hVar.u == hVar2.u;
    }

    public final Map b() {
        Map concurrentHashMap;
        Map map = this.r;
        Map map2 = w;
        if (map != map2) {
            return map;
        }
        synchronized (this) {
            try {
                concurrentHashMap = this.r;
                if (concurrentHashMap == map2) {
                    concurrentHashMap = new ConcurrentHashMap();
                    this.r = concurrentHashMap;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return concurrentHashMap;
    }

    public final Date c() {
        Date date = this.n;
        if (date != null) {
            return date;
        }
        Long l = this.m;
        if (l == null) {
            hk0.l("No timestamp set for breadcrumb");
            return null;
        }
        Date date2 = new Date(l.longValue());
        this.n = date2;
        return date2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        int iCompareTo = c().compareTo(hVar.c());
        return iCompareTo != 0 ? iCompareTo : this.f197o.compareTo(hVar.f197o);
    }

    public final void d(Object obj, String str) {
        if (str == null) {
            return;
        }
        if (obj != null) {
            b().put(str, obj);
            return;
        }
        Map map = this.r;
        if (map != w) {
            map.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if ("http".equals(this.q)) {
            return a(this, hVar) && io.sentry.util.b.j(this.r.get("status_code"), hVar.r.get("status_code")) && io.sentry.util.b.j(this.r.get("url"), hVar.r.get("url")) && io.sentry.util.b.j(this.r.get("method"), hVar.r.get("method")) && io.sentry.util.b.j(this.r.get("http.fragment"), hVar.r.get("http.fragment")) && io.sentry.util.b.j(this.r.get("http.query"), hVar.r.get("http.query"));
        }
        return a(this, hVar);
    }

    public final int hashCode() {
        return "http".equals(this.q) ? Arrays.hashCode(new Object[]{Long.valueOf(c().getTime()), this.p, this.q, this.s, this.t, this.u, this.r.get("status_code"), this.r.get("url"), this.r.get("method"), this.r.get("http.fragment"), this.r.get("http.query")}) : Arrays.hashCode(new Object[]{Long.valueOf(c().getTime()), this.p, this.q, this.s, this.t, this.u});
    }

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        cVar.r("timestamp");
        Long l = this.m;
        cVar.A(l != null ? io.sentry.vendor.a.f(l.longValue()) : io.sentry.vendor.a.f(c().getTime()));
        if (this.p != null) {
            cVar.r("message");
            cVar.A(this.p);
        }
        if (this.q != null) {
            cVar.r("type");
            cVar.A(this.q);
        }
        cVar.r("data");
        cVar.x(g1Var, this.r);
        if (this.s != null) {
            cVar.r("category");
            cVar.A(this.s);
        }
        if (this.t != null) {
            cVar.r("origin");
            cVar.A(this.t);
        }
        if (this.u != null) {
            cVar.r("level");
            cVar.x(g1Var, this.u);
        }
        ConcurrentHashMap concurrentHashMap = this.v;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                f.b(this.v, str, cVar, str, g1Var);
            }
        }
        cVar.m();
    }

    public h(long j) {
        this.r = w;
        this.f197o = Long.valueOf(System.nanoTime());
        this.m = Long.valueOf(j);
        this.n = null;
    }

    public h(Date date) {
        this.r = w;
        this.f197o = Long.valueOf(System.nanoTime());
        this.n = date;
        this.m = null;
    }

    public h() {
        this(System.currentTimeMillis());
    }
}
