package io.sentry.protocol.profiling;

import io.sentry.f;
import io.sentry.g1;
import io.sentry.t2;
import io.sentry.x3;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c implements t2 {
    public String m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public HashMap f243o;

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        if (this.m != null) {
            cVar.r("name");
            cVar.x(g1Var, this.m);
        }
        cVar.r("priority");
        cVar.x(g1Var, Integer.valueOf(this.n));
        HashMap map = this.f243o;
        if (map != null) {
            for (String str : map.keySet()) {
                f.a(this.f243o, str, cVar, str, g1Var);
            }
        }
        cVar.m();
    }
}
