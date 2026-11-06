package io.sentry.protocol;

import io.sentry.g1;
import io.sentry.g6;
import io.sentry.t2;
import io.sentry.x3;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements t2 {
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public ConcurrentHashMap F;
    public String G;
    public g6 H;
    public List m;
    public List n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Map f224o;
    public String p;
    public String q;
    public String r;
    public Integer s;
    public Integer t;
    public String u;
    public String v;
    public Boolean w;
    public String x;
    public Boolean y;
    public String z;

    public final boolean equals(Object obj) {
        if (obj == null || a0.class != obj.getClass()) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Objects.equals(this.m, a0Var.m) && Objects.equals(this.n, a0Var.n) && Objects.equals(this.f224o, a0Var.f224o) && Objects.equals(this.p, a0Var.p) && Objects.equals(this.q, a0Var.q) && Objects.equals(this.r, a0Var.r) && Objects.equals(this.s, a0Var.s) && Objects.equals(this.t, a0Var.t) && Objects.equals(this.u, a0Var.u) && Objects.equals(this.v, a0Var.v) && Objects.equals(this.w, a0Var.w) && Objects.equals(this.x, a0Var.x) && Objects.equals(this.y, a0Var.y) && Objects.equals(this.z, a0Var.z) && Objects.equals(this.A, a0Var.A) && Objects.equals(this.B, a0Var.B) && Objects.equals(this.C, a0Var.C) && Objects.equals(this.D, a0Var.D) && Objects.equals(this.E, a0Var.E) && Objects.equals(this.F, a0Var.F) && Objects.equals(this.G, a0Var.G) && Objects.equals(this.H, a0Var.H);
    }

    public final int hashCode() {
        return Objects.hash(this.m, this.n, this.f224o, null, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H);
    }

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        if (this.p != null) {
            cVar.r("filename");
            cVar.A(this.p);
        }
        if (this.q != null) {
            cVar.r("function");
            cVar.A(this.q);
        }
        if (this.r != null) {
            cVar.r("module");
            cVar.A(this.r);
        }
        if (this.s != null) {
            cVar.r("lineno");
            cVar.z(this.s);
        }
        if (this.t != null) {
            cVar.r("colno");
            cVar.z(this.t);
        }
        if (this.u != null) {
            cVar.r("abs_path");
            cVar.A(this.u);
        }
        if (this.v != null) {
            cVar.r("context_line");
            cVar.A(this.v);
        }
        if (this.w != null) {
            cVar.r("in_app");
            cVar.y(this.w);
        }
        if (this.x != null) {
            cVar.r("package");
            cVar.A(this.x);
        }
        if (this.y != null) {
            cVar.r("native");
            cVar.y(this.y);
        }
        if (this.z != null) {
            cVar.r("platform");
            cVar.A(this.z);
        }
        if (this.A != null) {
            cVar.r("image_addr");
            cVar.A(this.A);
        }
        if (this.B != null) {
            cVar.r("symbol_addr");
            cVar.A(this.B);
        }
        if (this.C != null) {
            cVar.r("instruction_addr");
            cVar.A(this.C);
        }
        if (this.D != null) {
            cVar.r("addr_mode");
            cVar.A(this.D);
        }
        if (this.G != null) {
            cVar.r("raw_function");
            cVar.A(this.G);
        }
        if (this.E != null) {
            cVar.r("symbol");
            cVar.A(this.E);
        }
        if (this.H != null) {
            cVar.r("lock");
            cVar.x(g1Var, this.H);
        }
        List list = this.m;
        if (list != null && !list.isEmpty()) {
            cVar.r("pre_context");
            cVar.x(g1Var, this.m);
        }
        List list2 = this.n;
        if (list2 != null && !list2.isEmpty()) {
            cVar.r("post_context");
            cVar.x(g1Var, this.n);
        }
        Map map = this.f224o;
        if (map != null && !map.isEmpty()) {
            cVar.r("vars");
            cVar.x(g1Var, this.f224o);
        }
        ConcurrentHashMap concurrentHashMap = this.F;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.f.b(this.F, str, cVar, str, g1Var);
            }
        }
        cVar.m();
    }
}
