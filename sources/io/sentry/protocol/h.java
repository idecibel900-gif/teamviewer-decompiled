package io.sentry.protocol;

import io.sentry.g1;
import io.sentry.t2;
import io.sentry.x3;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h implements t2 {
    public Long A;
    public Boolean B;
    public Long C;
    public Long D;
    public Long E;
    public Long F;
    public Integer G;
    public Integer H;
    public Float I;
    public Integer J;
    public Date K;
    public TimeZone L;
    public String M;
    public String N;
    public String O;
    public Float P;
    public Integer Q;
    public Double R;
    public String S;
    public String T;
    public ConcurrentHashMap U;
    public String m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f230o;
    public String p;
    public String q;
    public String r;
    public String[] s;
    public Float t;
    public Boolean u;
    public Boolean v;
    public g w;
    public Boolean x;
    public Long y;
    public Long z;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (io.sentry.util.b.j(this.m, hVar.m) && io.sentry.util.b.j(this.n, hVar.n) && io.sentry.util.b.j(this.f230o, hVar.f230o) && io.sentry.util.b.j(this.p, hVar.p) && io.sentry.util.b.j(this.q, hVar.q) && io.sentry.util.b.j(this.r, hVar.r) && Arrays.equals(this.s, hVar.s) && io.sentry.util.b.j(this.t, hVar.t) && io.sentry.util.b.j(this.u, hVar.u) && io.sentry.util.b.j(this.v, hVar.v) && this.w == hVar.w && io.sentry.util.b.j(this.x, hVar.x) && io.sentry.util.b.j(this.y, hVar.y) && io.sentry.util.b.j(this.z, hVar.z) && io.sentry.util.b.j(this.A, hVar.A) && io.sentry.util.b.j(this.B, hVar.B) && io.sentry.util.b.j(this.C, hVar.C) && io.sentry.util.b.j(this.D, hVar.D) && io.sentry.util.b.j(this.E, hVar.E) && io.sentry.util.b.j(this.F, hVar.F) && io.sentry.util.b.j(this.G, hVar.G) && io.sentry.util.b.j(this.H, hVar.H) && io.sentry.util.b.j(this.I, hVar.I) && io.sentry.util.b.j(this.J, hVar.J) && io.sentry.util.b.j(this.K, hVar.K) && io.sentry.util.b.j(this.M, hVar.M) && io.sentry.util.b.j(this.N, hVar.N) && io.sentry.util.b.j(this.O, hVar.O) && io.sentry.util.b.j(this.P, hVar.P) && io.sentry.util.b.j(this.Q, hVar.Q) && io.sentry.util.b.j(this.R, hVar.R) && io.sentry.util.b.j(this.S, hVar.S) && io.sentry.util.b.j(this.T, hVar.T)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(new Object[]{this.m, this.n, this.f230o, this.p, this.q, this.r, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T}) * 31) + Arrays.hashCode(this.s);
    }

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        if (this.m != null) {
            cVar.r("name");
            cVar.A(this.m);
        }
        if (this.n != null) {
            cVar.r("manufacturer");
            cVar.A(this.n);
        }
        if (this.f230o != null) {
            cVar.r("brand");
            cVar.A(this.f230o);
        }
        if (this.p != null) {
            cVar.r("family");
            cVar.A(this.p);
        }
        if (this.q != null) {
            cVar.r("model");
            cVar.A(this.q);
        }
        if (this.r != null) {
            cVar.r("model_id");
            cVar.A(this.r);
        }
        if (this.s != null) {
            cVar.r("archs");
            cVar.x(g1Var, this.s);
        }
        if (this.t != null) {
            cVar.r("battery_level");
            cVar.z(this.t);
        }
        if (this.u != null) {
            cVar.r("charging");
            cVar.y(this.u);
        }
        if (this.v != null) {
            cVar.r("online");
            cVar.y(this.v);
        }
        if (this.w != null) {
            cVar.r("orientation");
            cVar.x(g1Var, this.w);
        }
        if (this.x != null) {
            cVar.r("simulator");
            cVar.y(this.x);
        }
        if (this.y != null) {
            cVar.r("memory_size");
            cVar.z(this.y);
        }
        if (this.z != null) {
            cVar.r("free_memory");
            cVar.z(this.z);
        }
        if (this.A != null) {
            cVar.r("usable_memory");
            cVar.z(this.A);
        }
        if (this.B != null) {
            cVar.r("low_memory");
            cVar.y(this.B);
        }
        if (this.C != null) {
            cVar.r("storage_size");
            cVar.z(this.C);
        }
        if (this.D != null) {
            cVar.r("free_storage");
            cVar.z(this.D);
        }
        if (this.E != null) {
            cVar.r("external_storage_size");
            cVar.z(this.E);
        }
        if (this.F != null) {
            cVar.r("external_free_storage");
            cVar.z(this.F);
        }
        if (this.G != null) {
            cVar.r("screen_width_pixels");
            cVar.z(this.G);
        }
        if (this.H != null) {
            cVar.r("screen_height_pixels");
            cVar.z(this.H);
        }
        if (this.I != null) {
            cVar.r("screen_density");
            cVar.z(this.I);
        }
        if (this.J != null) {
            cVar.r("screen_dpi");
            cVar.z(this.J);
        }
        if (this.K != null) {
            cVar.r("boot_time");
            cVar.x(g1Var, this.K);
        }
        if (this.L != null) {
            cVar.r("timezone");
            cVar.x(g1Var, this.L);
        }
        if (this.M != null) {
            cVar.r("id");
            cVar.A(this.M);
        }
        if (this.O != null) {
            cVar.r("connection_type");
            cVar.A(this.O);
        }
        if (this.P != null) {
            cVar.r("battery_temperature");
            cVar.z(this.P);
        }
        if (this.N != null) {
            cVar.r("locale");
            cVar.A(this.N);
        }
        if (this.Q != null) {
            cVar.r("processor_count");
            cVar.z(this.Q);
        }
        if (this.R != null) {
            cVar.r("processor_frequency");
            cVar.z(this.R);
        }
        if (this.S != null) {
            cVar.r("cpu_description");
            cVar.A(this.S);
        }
        if (this.T != null) {
            cVar.r("chipset");
            cVar.A(this.T);
        }
        ConcurrentHashMap concurrentHashMap = this.U;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.f.b(this.U, str, cVar, str, g1Var);
            }
        }
        cVar.m();
    }
}
