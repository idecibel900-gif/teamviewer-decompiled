package io.sentry.protocol;

import io.sentry.a8;
import io.sentry.g1;
import io.sentry.l5;
import io.sentry.t2;
import io.sentry.v7;
import io.sentry.w7;
import io.sentry.x3;
import io.sentry.y7;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class z implements t2 {
    public final Double m;
    public final Double n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final w f252o;
    public final y7 p;
    public final y7 q;
    public final String r;
    public final String s;
    public final a8 t;
    public final String u;
    public final Map v;
    public Map w;
    public final Map x;
    public ConcurrentHashMap y;

    public z(v7 v7Var) {
        ConcurrentHashMap concurrentHashMap = v7Var.k;
        w7 w7Var = v7Var.c;
        this.s = w7Var.r;
        this.r = w7Var.q;
        this.p = w7Var.n;
        this.q = w7Var.f274o;
        this.f252o = w7Var.m;
        this.t = w7Var.s;
        this.u = w7Var.u;
        ConcurrentHashMap concurrentHashMapR = io.sentry.util.b.r(w7Var.t);
        this.v = concurrentHashMapR == null ? new ConcurrentHashMap() : concurrentHashMapR;
        ConcurrentHashMap concurrentHashMapR2 = io.sentry.util.b.r(v7Var.l);
        this.x = concurrentHashMapR2 == null ? new ConcurrentHashMap() : concurrentHashMapR2;
        l5 l5Var = v7Var.b;
        this.n = l5Var == null ? null : Double.valueOf(v7Var.a.c(l5Var) / 1.0E9d);
        this.m = Double.valueOf(v7Var.a.d() / 1.0E9d);
        this.w = concurrentHashMap;
        w7Var.z.h();
    }

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        cVar.r("start_timestamp");
        cVar.x(g1Var, io.sentry.config.a.j(this.m.doubleValue()));
        Double d = this.n;
        if (d != null) {
            cVar.r("timestamp");
            cVar.x(g1Var, io.sentry.config.a.j(d.doubleValue()));
        }
        cVar.r("trace_id");
        cVar.x(g1Var, this.f252o);
        cVar.r("span_id");
        cVar.x(g1Var, this.p);
        y7 y7Var = this.q;
        if (y7Var != null) {
            cVar.r("parent_span_id");
            cVar.x(g1Var, y7Var);
        }
        cVar.r("op");
        cVar.A(this.r);
        String str = this.s;
        if (str != null) {
            cVar.r("description");
            cVar.A(str);
        }
        a8 a8Var = this.t;
        if (a8Var != null) {
            cVar.r("status");
            cVar.x(g1Var, a8Var);
        }
        String str2 = this.u;
        if (str2 != null) {
            cVar.r("origin");
            cVar.x(g1Var, str2);
        }
        Map map = this.v;
        if (!map.isEmpty()) {
            cVar.r("tags");
            cVar.x(g1Var, map);
        }
        if (this.w != null) {
            cVar.r("data");
            cVar.x(g1Var, this.w);
        }
        Map map2 = this.x;
        if (!map2.isEmpty()) {
            cVar.r("measurements");
            cVar.x(g1Var, map2);
        }
        ConcurrentHashMap concurrentHashMap = this.y;
        if (concurrentHashMap != null) {
            for (String str3 : concurrentHashMap.keySet()) {
                io.sentry.f.b(this.y, str3, cVar, str3, g1Var);
            }
        }
        cVar.m();
    }

    public z(Double d, Double d2, w wVar, y7 y7Var, y7 y7Var2, String str, String str2, a8 a8Var, String str3, Map map, Map map2, Map map3) {
        this.m = d;
        this.n = d2;
        this.f252o = wVar;
        this.p = y7Var;
        this.q = y7Var2;
        this.r = str;
        this.s = str2;
        this.t = a8Var;
        this.u = str3;
        this.v = map;
        this.x = map2;
        this.w = map3;
    }
}
