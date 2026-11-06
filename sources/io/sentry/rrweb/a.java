package io.sentry.rrweb;

import io.sentry.f6;
import io.sentry.g1;
import io.sentry.t2;
import io.sentry.x3;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b implements t2 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f255o;
    public double p;
    public String q;
    public String r;
    public String s;
    public f6 t;
    public ConcurrentHashMap u;
    public HashMap v;
    public ConcurrentHashMap w;
    public ConcurrentHashMap x;

    public a() {
        super(c.Custom);
        this.f255o = "breadcrumb";
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
        cVar.A(this.f255o);
        cVar.r("payload");
        cVar.k();
        if (this.q != null) {
            cVar.r("type");
            cVar.A(this.q);
        }
        cVar.r("timestamp");
        cVar.x(g1Var, BigDecimal.valueOf(this.p));
        if (this.r != null) {
            cVar.r("category");
            cVar.A(this.r);
        }
        if (this.s != null) {
            cVar.r("message");
            cVar.A(this.s);
        }
        if (this.t != null) {
            cVar.r("level");
            cVar.x(g1Var, this.t);
        }
        if (this.u != null) {
            cVar.r("data");
            cVar.x(g1Var, this.u);
        }
        ConcurrentHashMap concurrentHashMap = this.w;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.f.b(this.w, str, cVar, str, g1Var);
            }
        }
        cVar.m();
        ConcurrentHashMap concurrentHashMap2 = this.x;
        if (concurrentHashMap2 != null) {
            for (String str2 : concurrentHashMap2.keySet()) {
                io.sentry.f.b(this.x, str2, cVar, str2, g1Var);
            }
        }
        cVar.m();
        HashMap map = this.v;
        if (map != null) {
            for (String str3 : map.keySet()) {
                io.sentry.f.a(this.v, str3, cVar, str3, g1Var);
            }
        }
        cVar.m();
    }
}
