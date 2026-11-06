package io.sentry;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n6 implements t2 {
    public final List m;
    public HashMap n;

    public n6(List list) {
        this.m = list;
    }

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        cVar.r("items");
        cVar.x(g1Var, this.m);
        HashMap map = this.n;
        if (map != null) {
            for (String str : map.keySet()) {
                f.a(this.n, str, cVar, str, g1Var);
            }
        }
        cVar.m();
    }
}
