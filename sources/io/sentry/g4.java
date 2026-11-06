package io.sentry;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g4 implements t2 {
    public String m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f195o;
    public Long p;
    public Long q;
    public Long r;
    public Long s;
    public ConcurrentHashMap t;

    public g4(x1 x1Var, Long l, Long l2) {
        this.m = x1Var.r().a();
        this.n = x1Var.v().m.a();
        this.f195o = x1Var.getName().isEmpty() ? "unknown" : x1Var.getName();
        this.p = l;
        this.r = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g4.class != obj.getClass()) {
            return false;
        }
        g4 g4Var = (g4) obj;
        return this.m.equals(g4Var.m) && this.n.equals(g4Var.n) && this.f195o.equals(g4Var.f195o) && this.p.equals(g4Var.p) && this.r.equals(g4Var.r) && io.sentry.util.b.j(this.s, g4Var.s) && io.sentry.util.b.j(this.q, g4Var.q) && io.sentry.util.b.j(this.t, g4Var.t);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.m, this.n, this.f195o, this.p, this.q, this.r, this.s, this.t});
    }

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        cVar.r("id");
        cVar.x(g1Var, this.m);
        cVar.r("trace_id");
        cVar.x(g1Var, this.n);
        cVar.r("name");
        cVar.x(g1Var, this.f195o);
        cVar.r("relative_start_ns");
        cVar.x(g1Var, this.p);
        cVar.r("relative_end_ns");
        cVar.x(g1Var, this.q);
        cVar.r("relative_cpu_start_ms");
        cVar.x(g1Var, this.r);
        cVar.r("relative_cpu_end_ms");
        cVar.x(g1Var, this.s);
        ConcurrentHashMap concurrentHashMap = this.t;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                f.b(this.t, str, cVar, str, g1Var);
            }
        }
        cVar.m();
    }
}
