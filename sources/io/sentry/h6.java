package io.sentry;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class h6 implements t2 {
    public final io.sentry.protocol.w m;
    public y7 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Double f199o;
    public final String p;
    public final j6 q;
    public Integer r;
    public Map s;
    public HashMap t;

    public h6(io.sentry.protocol.w wVar, Double d, String str, j6 j6Var) {
        this.m = wVar;
        this.f199o = d;
        this.p = str;
        this.q = j6Var;
    }

    public final void a(String str, io.sentry.protocol.n nVar) {
        Map map = this.s;
        if (map == null) {
            map = new HashMap();
            this.s = map;
        }
        map.put(str, nVar);
    }

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        cVar.r("timestamp");
        cVar.x(g1Var, io.sentry.config.a.j(this.f199o.doubleValue()));
        cVar.r("trace_id");
        cVar.x(g1Var, this.m);
        if (this.n != null) {
            cVar.r("span_id");
            cVar.x(g1Var, this.n);
        }
        cVar.r("body");
        cVar.A(this.p);
        cVar.r("level");
        cVar.x(g1Var, this.q);
        if (this.r != null) {
            cVar.r("severity_number");
            cVar.x(g1Var, this.r);
        }
        if (this.s != null) {
            cVar.r("attributes");
            cVar.x(g1Var, this.s);
        }
        HashMap map = this.t;
        if (map != null) {
            for (String str : map.keySet()) {
                f.a(this.t, str, cVar, str, g1Var);
            }
        }
        cVar.m();
    }
}
