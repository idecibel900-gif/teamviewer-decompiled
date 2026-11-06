package io.sentry.protocol;

import io.sentry.g1;
import io.sentry.t2;
import io.sentry.x3;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c implements t2 {
    public Long m;
    public Double n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Long f225o;
    public Double p;
    public Long q;
    public Double r;
    public Long s;
    public Long t;
    public Long u;
    public Long v;
    public Long w;
    public ConcurrentHashMap x;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (io.sentry.util.b.j(this.m, cVar.m) && io.sentry.util.b.j(this.n, cVar.n) && io.sentry.util.b.j(this.f225o, cVar.f225o) && io.sentry.util.b.j(this.p, cVar.p) && io.sentry.util.b.j(this.q, cVar.q) && io.sentry.util.b.j(this.r, cVar.r) && io.sentry.util.b.j(this.s, cVar.s) && io.sentry.util.b.j(this.t, cVar.t) && io.sentry.util.b.j(this.u, cVar.u) && io.sentry.util.b.j(this.v, cVar.v) && io.sentry.util.b.j(this.w, cVar.w)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.m, this.n, this.f225o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w});
    }

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        if (this.m != null) {
            cVar.r("gc.total_count");
            cVar.z(this.m);
        }
        if (this.n != null) {
            cVar.r("gc.total_time");
            cVar.z(this.n);
        }
        if (this.f225o != null) {
            cVar.r("gc.blocking_count");
            cVar.z(this.f225o);
        }
        if (this.p != null) {
            cVar.r("gc.blocking_time");
            cVar.z(this.p);
        }
        if (this.q != null) {
            cVar.r("gc.pre_oome_count");
            cVar.z(this.q);
        }
        if (this.r != null) {
            cVar.r("gc.waiting_time");
            cVar.z(this.r);
        }
        if (this.s != null) {
            cVar.r("memory.free");
            cVar.z(this.s);
        }
        if (this.t != null) {
            cVar.r("memory.free_until_gc");
            cVar.z(this.t);
        }
        if (this.u != null) {
            cVar.r("memory.free_until_oome");
            cVar.z(this.u);
        }
        if (this.v != null) {
            cVar.r("memory.total");
            cVar.z(this.v);
        }
        if (this.w != null) {
            cVar.r("memory.max");
            cVar.z(this.w);
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
