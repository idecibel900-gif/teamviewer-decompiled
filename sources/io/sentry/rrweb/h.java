package io.sentry.rrweb;

import io.sentry.g1;
import io.sentry.t2;
import io.sentry.x3;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h implements t2 {
    public int m;
    public float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f257o;
    public long p;
    public HashMap q;

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        cVar.r("id");
        cVar.w(this.m);
        cVar.r("x");
        cVar.v(this.n);
        cVar.r("y");
        cVar.v(this.f257o);
        cVar.r("timeOffset");
        cVar.w(this.p);
        HashMap map = this.q;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.f.a(this.q, str, cVar, str, g1Var);
            }
        }
        cVar.m();
    }
}
