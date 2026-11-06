package io.sentry;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class m6 implements t2 {
    public io.sentry.protocol.w m;
    public y7 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Double f213o;
    public String p;
    public String q;
    public String r;
    public Double s;
    public Map t;
    public HashMap u;

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        cVar.r("timestamp");
        cVar.x(g1Var, io.sentry.config.a.j(this.f213o.doubleValue()));
        cVar.r("type");
        cVar.A(this.r);
        cVar.r("name");
        cVar.A(this.p);
        cVar.r("value");
        cVar.z(this.s);
        cVar.r("trace_id");
        cVar.x(g1Var, this.m);
        if (this.n != null) {
            cVar.r("span_id");
            cVar.x(g1Var, this.n);
        }
        if (this.q != null) {
            cVar.r("unit");
            cVar.x(g1Var, this.q);
        }
        if (this.t != null) {
            cVar.r("attributes");
            cVar.x(g1Var, this.t);
        }
        HashMap map = this.u;
        if (map != null) {
            for (String str : map.keySet()) {
                f.a(this.u, str, cVar, str, g1Var);
            }
        }
        cVar.m();
    }
}
