package io.sentry.rrweb;

import io.sentry.g1;
import io.sentry.t2;
import io.sentry.x3;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class l extends b implements t2 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f260o;
    public String p;
    public String q;
    public double r;
    public double s;
    public ConcurrentHashMap t;
    public HashMap u;
    public ConcurrentHashMap v;
    public ConcurrentHashMap w;

    public l() {
        super(c.Custom);
        this.f260o = "performanceSpan";
    }

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        cVar.r("type");
        cVar.x(g1Var, this.m);
        cVar.r("timestamp");
        cVar.w(this.n);
        cVar.r("data");
        cVar.k();
        cVar.r("tag");
        cVar.A(this.f260o);
        cVar.r("payload");
        cVar.k();
        if (this.p != null) {
            cVar.r("op");
            cVar.A(this.p);
        }
        if (this.q != null) {
            cVar.r("description");
            cVar.A(this.q);
        }
        cVar.r("startTimestamp");
        cVar.x(g1Var, BigDecimal.valueOf(this.r));
        cVar.r("endTimestamp");
        cVar.x(g1Var, BigDecimal.valueOf(this.s));
        if (this.t != null) {
            cVar.r("data");
            cVar.x(g1Var, this.t);
        }
        ConcurrentHashMap concurrentHashMap = this.v;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.f.b(this.v, str, cVar, str, g1Var);
            }
        }
        cVar.m();
        ConcurrentHashMap concurrentHashMap2 = this.w;
        if (concurrentHashMap2 != null) {
            for (String str2 : concurrentHashMap2.keySet()) {
                io.sentry.f.b(this.w, str2, cVar, str2, g1Var);
            }
        }
        cVar.m();
        HashMap map = this.u;
        if (map != null) {
            for (String str3 : map.keySet()) {
                io.sentry.f.a(this.u, str3, cVar, str3, g1Var);
            }
        }
        cVar.m();
    }
}
