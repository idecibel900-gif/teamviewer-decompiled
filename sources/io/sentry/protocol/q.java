package io.sentry.protocol;

import io.sentry.g1;
import io.sentry.t2;
import io.sentry.x3;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class q implements t2 {
    public String m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f244o;
    public String p;
    public String q;
    public Boolean r;
    public ConcurrentHashMap s;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (io.sentry.util.b.j(this.m, qVar.m) && io.sentry.util.b.j(this.n, qVar.n) && io.sentry.util.b.j(this.f244o, qVar.f244o) && io.sentry.util.b.j(this.p, qVar.p) && io.sentry.util.b.j(this.q, qVar.q) && io.sentry.util.b.j(this.r, qVar.r)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.m, this.n, this.f244o, this.p, this.q, this.r});
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
            cVar.r("version");
            cVar.A(this.n);
        }
        if (this.f244o != null) {
            cVar.r("raw_description");
            cVar.A(this.f244o);
        }
        if (this.p != null) {
            cVar.r("build");
            cVar.A(this.p);
        }
        if (this.q != null) {
            cVar.r("kernel_version");
            cVar.A(this.q);
        }
        if (this.r != null) {
            cVar.r("rooted");
            cVar.y(this.r);
        }
        ConcurrentHashMap concurrentHashMap = this.s;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.f.b(this.s, str, cVar, str, g1Var);
            }
        }
        cVar.m();
    }
}
