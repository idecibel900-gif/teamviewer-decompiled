package io.sentry.protocol;

import io.sentry.g1;
import io.sentry.t2;
import io.sentry.x3;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a implements t2 {
    public String m;
    public Date n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f223o;
    public String p;
    public String q;
    public String r;
    public String s;
    public AbstractMap t;
    public List u;
    public String v;
    public Boolean w;
    public Boolean x;
    public List y;
    public ConcurrentHashMap z;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return io.sentry.util.b.j(this.m, aVar.m) && io.sentry.util.b.j(this.n, aVar.n) && io.sentry.util.b.j(this.f223o, aVar.f223o) && io.sentry.util.b.j(this.p, aVar.p) && io.sentry.util.b.j(this.q, aVar.q) && io.sentry.util.b.j(this.r, aVar.r) && io.sentry.util.b.j(this.s, aVar.s) && io.sentry.util.b.j(this.t, aVar.t) && io.sentry.util.b.j(this.w, aVar.w) && io.sentry.util.b.j(this.u, aVar.u) && io.sentry.util.b.j(this.v, aVar.v) && io.sentry.util.b.j(this.x, aVar.x) && io.sentry.util.b.j(this.y, aVar.y);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.m, this.n, this.f223o, this.p, this.q, this.r, this.s, this.t, this.w, this.u, this.v, this.x, this.y});
    }

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        if (this.m != null) {
            cVar.r("app_identifier");
            cVar.A(this.m);
        }
        if (this.n != null) {
            cVar.r("app_start_time");
            cVar.x(g1Var, this.n);
        }
        if (this.f223o != null) {
            cVar.r("device_app_hash");
            cVar.A(this.f223o);
        }
        if (this.p != null) {
            cVar.r("build_type");
            cVar.A(this.p);
        }
        if (this.q != null) {
            cVar.r("app_name");
            cVar.A(this.q);
        }
        if (this.r != null) {
            cVar.r("app_version");
            cVar.A(this.r);
        }
        if (this.s != null) {
            cVar.r("app_build");
            cVar.A(this.s);
        }
        AbstractMap abstractMap = this.t;
        if (abstractMap != null && !abstractMap.isEmpty()) {
            cVar.r("permissions");
            cVar.x(g1Var, this.t);
        }
        if (this.w != null) {
            cVar.r("in_foreground");
            cVar.y(this.w);
        }
        if (this.u != null) {
            cVar.r("view_names");
            cVar.x(g1Var, this.u);
        }
        if (this.v != null) {
            cVar.r("start_type");
            cVar.A(this.v);
        }
        if (this.x != null) {
            cVar.r("is_split_apks");
            cVar.y(this.x);
        }
        List list = this.y;
        if (list != null && !list.isEmpty()) {
            cVar.r("split_names");
            cVar.x(g1Var, this.y);
        }
        ConcurrentHashMap concurrentHashMap = this.z;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.f.b(this.z, str, cVar, str, g1Var);
            }
        }
        cVar.m();
    }
}
