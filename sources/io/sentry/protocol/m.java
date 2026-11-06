package io.sentry.protocol;

import io.sentry.g1;
import io.sentry.t2;
import io.sentry.x3;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class m implements t2 {
    public String m;
    public Integer n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f237o;
    public String p;
    public Integer q;
    public String r;
    public Boolean s;
    public String t;
    public String u;
    public ConcurrentHashMap v;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (io.sentry.util.b.j(this.m, mVar.m) && io.sentry.util.b.j(this.n, mVar.n) && io.sentry.util.b.j(this.f237o, mVar.f237o) && io.sentry.util.b.j(this.p, mVar.p) && io.sentry.util.b.j(this.q, mVar.q) && io.sentry.util.b.j(this.r, mVar.r) && io.sentry.util.b.j(this.s, mVar.s) && io.sentry.util.b.j(this.t, mVar.t) && io.sentry.util.b.j(this.u, mVar.u)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.m, this.n, this.f237o, this.p, this.q, this.r, this.s, this.t, this.u});
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
            cVar.r("id");
            cVar.z(this.n);
        }
        if (this.f237o != null) {
            cVar.r("vendor_id");
            cVar.A(this.f237o);
        }
        if (this.p != null) {
            cVar.r("vendor_name");
            cVar.A(this.p);
        }
        if (this.q != null) {
            cVar.r("memory_size");
            cVar.z(this.q);
        }
        if (this.r != null) {
            cVar.r("api_type");
            cVar.A(this.r);
        }
        if (this.s != null) {
            cVar.r("multi_threaded_rendering");
            cVar.y(this.s);
        }
        if (this.t != null) {
            cVar.r("version");
            cVar.A(this.t);
        }
        if (this.u != null) {
            cVar.r("npot_support");
            cVar.A(this.u);
        }
        ConcurrentHashMap concurrentHashMap = this.v;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.f.b(this.v, str, cVar, str, g1Var);
            }
        }
        cVar.m();
    }
}
