package io.sentry;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class w7 implements t2 {
    public final io.sentry.protocol.w A;
    public final io.sentry.protocol.w m;
    public final y7 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final y7 f274o;
    public transient h4 p;
    public String q;
    public String r;
    public a8 s;
    public ConcurrentHashMap t;
    public String u;
    public Map v;
    public ConcurrentHashMap w;
    public c2 x;
    public d y;
    public final m7 z;

    public w7(io.sentry.protocol.w wVar, y7 y7Var, y7 y7Var2, String str, String str2, h4 h4Var, a8 a8Var, String str3) {
        this.t = new ConcurrentHashMap();
        this.u = "manual";
        this.v = new ConcurrentHashMap();
        this.x = c2.SENTRY;
        this.z = new m7((byte) 7);
        this.A = io.sentry.protocol.w.n;
        io.sentry.util.b.v(wVar, "traceId is required");
        this.m = wVar;
        io.sentry.util.b.v(y7Var, "spanId is required");
        this.n = y7Var;
        io.sentry.util.b.v(str, "operation is required");
        this.q = str;
        this.f274o = y7Var2;
        this.r = str2;
        this.s = a8Var;
        this.u = str3;
        a(h4Var);
        io.sentry.util.thread.a threadChecker = d5.c().l().getThreadChecker();
        this.v.put("thread.id", String.valueOf(threadChecker.b()));
        this.v.put("thread.name", threadChecker.a());
    }

    public final void a(h4 h4Var) {
        this.p = h4Var;
        d dVar = this.y;
        if (dVar == null || h4Var == null) {
            return;
        }
        Boolean bool = (Boolean) h4Var.a;
        Charset charset = io.sentry.util.r.a;
        dVar.d("sentry-sampled", bool == null ? null : bool.toString());
        Double d = (Double) h4Var.c;
        if (d != null && dVar.f) {
            dVar.d = d;
        }
        Double d2 = (Double) h4Var.b;
        if (d2 != null) {
            dVar.c = d2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7)) {
            return false;
        }
        w7 w7Var = (w7) obj;
        return this.m.equals(w7Var.m) && this.n.equals(w7Var.n) && io.sentry.util.b.j(this.f274o, w7Var.f274o) && this.q.equals(w7Var.q) && io.sentry.util.b.j(this.r, w7Var.r) && this.s == w7Var.s;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.m, this.n, this.f274o, this.q, this.r, this.s});
    }

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        cVar.r("trace_id");
        this.m.serialize(cVar, g1Var);
        cVar.r("span_id");
        this.n.serialize(cVar, g1Var);
        y7 y7Var = this.f274o;
        if (y7Var != null) {
            cVar.r("parent_span_id");
            y7Var.serialize(cVar, g1Var);
        }
        cVar.r("op");
        cVar.A(this.q);
        if (this.r != null) {
            cVar.r("description");
            cVar.A(this.r);
        }
        if (this.s != null) {
            cVar.r("status");
            cVar.x(g1Var, this.s);
        }
        if (this.u != null) {
            cVar.r("origin");
            cVar.x(g1Var, this.u);
        }
        if (!this.t.isEmpty()) {
            cVar.r("tags");
            cVar.x(g1Var, this.t);
        }
        if (!this.v.isEmpty()) {
            cVar.r("data");
            cVar.x(g1Var, this.v);
        }
        ConcurrentHashMap concurrentHashMap = this.w;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                f.b(this.w, str, cVar, str, g1Var);
            }
        }
        cVar.m();
    }

    public w7(io.sentry.protocol.w wVar, y7 y7Var, String str, y7 y7Var2) {
        this(wVar, y7Var, y7Var2, str, null, null, null, "manual");
    }

    public w7(w7 w7Var) {
        this.t = new ConcurrentHashMap();
        this.u = "manual";
        this.v = new ConcurrentHashMap();
        this.x = c2.SENTRY;
        this.z = new m7((byte) 7);
        this.A = io.sentry.protocol.w.n;
        this.m = w7Var.m;
        this.n = w7Var.n;
        this.f274o = w7Var.f274o;
        a(w7Var.p);
        this.q = w7Var.q;
        this.r = w7Var.r;
        this.s = w7Var.s;
        ConcurrentHashMap concurrentHashMapR = io.sentry.util.b.r(w7Var.t);
        if (concurrentHashMapR != null) {
            this.t = concurrentHashMapR;
        }
        ConcurrentHashMap concurrentHashMapR2 = io.sentry.util.b.r(w7Var.w);
        if (concurrentHashMapR2 != null) {
            this.w = concurrentHashMapR2;
        }
        this.y = w7Var.y;
        ConcurrentHashMap concurrentHashMapR3 = io.sentry.util.b.r(w7Var.v);
        if (concurrentHashMapR3 != null) {
            this.v = concurrentHashMapR3;
        }
    }
}
