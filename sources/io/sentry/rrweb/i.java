package io.sentry.rrweb;

import io.sentry.g1;
import io.sentry.t2;
import io.sentry.x3;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i extends e implements t2 {
    public int p;
    public List q;
    public HashMap r;
    public HashMap s;

    public i() {
        super(d.TouchMove);
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
        List list = this.q;
        if (list != null && !list.isEmpty()) {
            cVar.r("positions");
            cVar.x(g1Var, this.q);
        }
        cVar.r("pointerId");
        cVar.w(this.p);
        HashMap map = this.s;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.f.a(this.s, str, cVar, str, g1Var);
            }
        }
        cVar.m();
        HashMap map2 = this.r;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                io.sentry.f.a(this.r, str2, cVar, str2, g1Var);
            }
        }
        cVar.m();
    }
}
