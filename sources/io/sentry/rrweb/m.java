package io.sentry.rrweb;

import io.sentry.g1;
import io.sentry.t2;
import io.sentry.x3;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class m extends b implements t2 {
    public int A;
    public HashMap B;
    public ConcurrentHashMap C;
    public ConcurrentHashMap D;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f261o;
    public int p;
    public long q;
    public long r;
    public String s;
    public String t;
    public int u;
    public int v;
    public int w;
    public String x;
    public int y;
    public int z;

    public m() {
        super(c.Custom);
        this.s = "h264";
        this.t = "mp4";
        this.x = "constant";
        this.f261o = "video";
    }

    @Override // io.sentry.rrweb.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        m mVar = (m) obj;
        return this.p == mVar.p && this.q == mVar.q && this.r == mVar.r && this.u == mVar.u && this.v == mVar.v && this.w == mVar.w && this.y == mVar.y && this.z == mVar.z && this.A == mVar.A && io.sentry.util.b.j(this.f261o, mVar.f261o) && io.sentry.util.b.j(this.s, mVar.s) && io.sentry.util.b.j(this.t, mVar.t) && io.sentry.util.b.j(this.x, mVar.x);
    }

    @Override // io.sentry.rrweb.b
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.f261o, Integer.valueOf(this.p), Long.valueOf(this.q), Long.valueOf(this.r), this.s, this.t, Integer.valueOf(this.u), Integer.valueOf(this.v), Integer.valueOf(this.w), this.x, Integer.valueOf(this.y), Integer.valueOf(this.z), Integer.valueOf(this.A)});
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
        cVar.A(this.f261o);
        cVar.r("payload");
        cVar.k();
        cVar.r("segmentId");
        cVar.w(this.p);
        cVar.r("size");
        cVar.w(this.q);
        cVar.r("duration");
        cVar.w(this.r);
        cVar.r("encoding");
        cVar.A(this.s);
        cVar.r("container");
        cVar.A(this.t);
        cVar.r("height");
        cVar.w(this.u);
        cVar.r("width");
        cVar.w(this.v);
        cVar.r("frameCount");
        cVar.w(this.w);
        cVar.r("frameRate");
        cVar.w(this.y);
        cVar.r("frameRateType");
        cVar.A(this.x);
        cVar.r("left");
        cVar.w(this.z);
        cVar.r("top");
        cVar.w(this.A);
        ConcurrentHashMap concurrentHashMap = this.C;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.f.b(this.C, str, cVar, str, g1Var);
            }
        }
        cVar.m();
        ConcurrentHashMap concurrentHashMap2 = this.D;
        if (concurrentHashMap2 != null) {
            for (String str2 : concurrentHashMap2.keySet()) {
                io.sentry.f.b(this.D, str2, cVar, str2, g1Var);
            }
        }
        cVar.m();
        HashMap map = this.B;
        if (map != null) {
            for (String str3 : map.keySet()) {
                io.sentry.f.a(this.B, str3, cVar, str3, g1Var);
            }
        }
        cVar.m();
    }
}
