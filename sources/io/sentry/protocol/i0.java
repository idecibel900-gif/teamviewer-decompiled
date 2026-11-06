package io.sentry.protocol;

import io.sentry.g1;
import io.sentry.t2;
import io.sentry.x3;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class i0 implements t2 {
    public String m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f232o;
    public String p;
    public String q;
    public l r;
    public ConcurrentHashMap s;
    public ConcurrentHashMap t;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i0.class == obj.getClass()) {
            i0 i0Var = (i0) obj;
            if (io.sentry.util.b.j(this.m, i0Var.m) && io.sentry.util.b.j(this.n, i0Var.n) && io.sentry.util.b.j(this.f232o, i0Var.f232o) && io.sentry.util.b.j(this.p, i0Var.p)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.m, this.n, this.f232o, this.p});
    }

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        if (this.m != null) {
            cVar.r("email");
            cVar.A(this.m);
        }
        if (this.n != null) {
            cVar.r("id");
            cVar.A(this.n);
        }
        if (this.f232o != null) {
            cVar.r("username");
            cVar.A(this.f232o);
        }
        if (this.p != null) {
            cVar.r("ip_address");
            cVar.A(this.p);
        }
        if (this.q != null) {
            cVar.r("name");
            cVar.A(this.q);
        }
        if (this.r != null) {
            cVar.r("geo");
            this.r.serialize(cVar, g1Var);
        }
        if (this.s != null) {
            cVar.r("data");
            cVar.x(g1Var, this.s);
        }
        ConcurrentHashMap concurrentHashMap = this.t;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.f.b(this.t, str, cVar, str, g1Var);
            }
        }
        cVar.m();
    }
}
