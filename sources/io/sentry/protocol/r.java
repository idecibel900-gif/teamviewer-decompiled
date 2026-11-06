package io.sentry.protocol;

import io.sentry.g1;
import io.sentry.t2;
import io.sentry.x3;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class r implements t2 {
    public String m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f245o;
    public Object p;
    public String q;
    public ConcurrentHashMap r;
    public ConcurrentHashMap s;
    public Long t;
    public ConcurrentHashMap u;
    public String v;
    public String w;
    public ConcurrentHashMap x;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        return io.sentry.util.b.j(this.m, rVar.m) && io.sentry.util.b.j(this.n, rVar.n) && io.sentry.util.b.j(this.f245o, rVar.f245o) && io.sentry.util.b.j(this.q, rVar.q) && io.sentry.util.b.j(this.r, rVar.r) && io.sentry.util.b.j(this.s, rVar.s) && io.sentry.util.b.j(this.t, rVar.t) && io.sentry.util.b.j(this.v, rVar.v) && io.sentry.util.b.j(this.w, rVar.w);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.m, this.n, this.f245o, this.q, this.r, this.s, this.t, this.v, this.w});
    }

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        if (this.m != null) {
            cVar.r("url");
            cVar.A(this.m);
        }
        if (this.n != null) {
            cVar.r("method");
            cVar.A(this.n);
        }
        if (this.f245o != null) {
            cVar.r("query_string");
            cVar.A(this.f245o);
        }
        if (this.p != null) {
            cVar.r("data");
            cVar.x(g1Var, this.p);
        }
        if (this.q != null) {
            cVar.r("cookies");
            cVar.A(this.q);
        }
        if (this.r != null) {
            cVar.r("headers");
            cVar.x(g1Var, this.r);
        }
        if (this.s != null) {
            cVar.r("env");
            cVar.x(g1Var, this.s);
        }
        if (this.u != null) {
            cVar.r("other");
            cVar.x(g1Var, this.u);
        }
        if (this.v != null) {
            cVar.r("fragment");
            cVar.x(g1Var, this.v);
        }
        if (this.t != null) {
            cVar.r("body_size");
            cVar.x(g1Var, this.t);
        }
        if (this.w != null) {
            cVar.r("api_target");
            cVar.x(g1Var, this.w);
        }
        ConcurrentHashMap concurrentHashMap = this.x;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.f.b(this.x, str, cVar, str, g1Var);
            }
        }
        cVar.m();
    }
}
