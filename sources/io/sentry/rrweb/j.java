package io.sentry.rrweb;

import io.sentry.g1;
import io.sentry.t2;
import io.sentry.x3;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class j extends b implements t2 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f258o;
    public int p;
    public int q;
    public HashMap r;

    public j() {
        super(c.Meta);
        this.f258o = "";
    }

    @Override // io.sentry.rrweb.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        j jVar = (j) obj;
        return this.p == jVar.p && this.q == jVar.q && io.sentry.util.b.j(this.f258o, jVar.f258o);
    }

    @Override // io.sentry.rrweb.b
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.f258o, Integer.valueOf(this.p), Integer.valueOf(this.q)});
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
        cVar.r("href");
        cVar.A(this.f258o);
        cVar.r("height");
        cVar.w(this.p);
        cVar.r("width");
        cVar.w(this.q);
        HashMap map = this.r;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.f.a(this.r, str, cVar, str, g1Var);
            }
        }
        cVar.m();
        cVar.m();
    }
}
