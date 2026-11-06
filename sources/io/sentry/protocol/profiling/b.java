package io.sentry.protocol.profiling;

import io.sentry.g1;
import io.sentry.t2;
import io.sentry.x3;
import java.io.IOException;
import java.util.AbstractMap;

/* JADX INFO: loaded from: classes.dex */
public final class b implements t2 {
    public double m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f242o;
    public AbstractMap p;

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        cVar.r("timestamp");
        cVar.x(g1Var, io.sentry.config.a.j(this.m));
        cVar.r("stack_id");
        cVar.x(g1Var, Integer.valueOf(this.n));
        if (this.f242o != null) {
            cVar.r("thread_id");
            cVar.x(g1Var, this.f242o);
        }
        AbstractMap abstractMap = this.p;
        if (abstractMap != null) {
            for (String str : abstractMap.keySet()) {
                Object obj = this.p.get(str);
                cVar.r(str);
                cVar.x(g1Var, obj);
            }
        }
        cVar.m();
    }
}
