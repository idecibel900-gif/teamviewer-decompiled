package io.sentry;

import java.io.File;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c4 implements t2 {
    public ConcurrentHashMap A;
    public io.sentry.protocol.w n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public io.sentry.protocol.w f183o;
    public io.sentry.protocol.u p;
    public final AbstractMap q;
    public String r;
    public String s;
    public String t;
    public String u;
    public double v;
    public String w;
    public final File x;
    public io.sentry.protocol.profiling.a z;
    public String y = null;
    public io.sentry.protocol.f m = null;

    public c4(io.sentry.protocol.w wVar, io.sentry.protocol.w wVar2, File file, AbstractMap abstractMap, Double d, g7 g7Var) {
        this.n = wVar;
        this.f183o = wVar2;
        this.x = file;
        this.q = abstractMap;
        this.p = g7Var.getSdkVersion();
        this.s = g7Var.getRelease() != null ? g7Var.getRelease() : "";
        this.t = g7Var.getEnvironment();
        this.r = "android";
        this.u = "2";
        this.v = d.doubleValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4)) {
            return false;
        }
        c4 c4Var = (c4) obj;
        return this.m == c4Var.m && Objects.equals(this.n, c4Var.n) && Objects.equals(this.f183o, c4Var.f183o) && Objects.equals(this.p, c4Var.p) && this.q.equals(c4Var.q) && Objects.equals(this.r, c4Var.r) && Objects.equals(this.s, c4Var.s) && Objects.equals(this.t, c4Var.t) && Objects.equals(this.u, c4Var.u) && Objects.equals(this.y, c4Var.y) && Objects.equals(this.A, c4Var.A) && this.z == c4Var.z;
    }

    public final int hashCode() {
        return Objects.hash(this.m, this.n, this.f183o, this.p, this.q, this.r, this.s, this.t, this.u, this.y, this.z, this.A);
    }

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        if (this.m != null) {
            cVar.r("debug_meta");
            cVar.x(g1Var, this.m);
        }
        cVar.r("profiler_id");
        cVar.x(g1Var, this.n);
        cVar.r("chunk_id");
        cVar.x(g1Var, this.f183o);
        if (this.p != null) {
            cVar.r("client_sdk");
            cVar.x(g1Var, this.p);
        }
        AbstractMap abstractMap = this.q;
        if (!abstractMap.isEmpty()) {
            String str = ((io.sentry.vendor.gson.stream.c) cVar.n).p;
            cVar.u("");
            cVar.r("measurements");
            cVar.x(g1Var, abstractMap);
            cVar.u(str);
        }
        cVar.r("platform");
        cVar.x(g1Var, this.r);
        cVar.r("release");
        cVar.x(g1Var, this.s);
        if (this.t != null) {
            cVar.r("environment");
            cVar.x(g1Var, this.t);
        }
        cVar.r("version");
        cVar.x(g1Var, this.u);
        if (this.w != null) {
            cVar.r("content_type");
            cVar.x(g1Var, this.w);
        }
        if (this.y != null) {
            cVar.r("sampled_profile");
            cVar.x(g1Var, this.y);
        }
        cVar.r("timestamp");
        cVar.x(g1Var, io.sentry.config.a.j(this.v));
        if (this.z != null) {
            cVar.r("profile");
            cVar.x(g1Var, this.z);
        }
        ConcurrentHashMap concurrentHashMap = this.A;
        if (concurrentHashMap != null) {
            for (String str2 : concurrentHashMap.keySet()) {
                f.b(this.A, str2, cVar, str2, g1Var);
            }
        }
        cVar.m();
    }
}
