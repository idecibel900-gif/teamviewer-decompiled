package io.sentry.rrweb;

import io.sentry.g1;
import io.sentry.t2;
import io.sentry.x3;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g extends e implements t2 {
    public f p;
    public int q;
    public float r;
    public float s;
    public int t;
    public int u;
    public HashMap v;
    public HashMap w;

    public g() {
        super(d.MouseInteraction);
        this.t = 2;
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
        cVar.r("source");
        cVar.x(g1Var, this.f256o);
        cVar.r("type");
        cVar.x(g1Var, this.p);
        cVar.r("id");
        cVar.w(this.q);
        cVar.r("x");
        cVar.v(this.r);
        cVar.r("y");
        cVar.v(this.s);
        cVar.r("pointerType");
        cVar.w(this.t);
        cVar.r("pointerId");
        cVar.w(this.u);
        HashMap map = this.w;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.f.a(this.w, str, cVar, str, g1Var);
            }
        }
        cVar.m();
        HashMap map2 = this.v;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                io.sentry.f.a(this.v, str2, cVar, str2, g1Var);
            }
        }
        cVar.m();
    }
}
