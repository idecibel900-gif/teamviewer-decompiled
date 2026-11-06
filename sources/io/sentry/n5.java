package io.sentry;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class n5 implements t2 {
    public final io.sentry.protocol.w m;
    public final io.sentry.protocol.u n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c8 f215o;
    public Date p;
    public HashMap q;

    public n5(io.sentry.protocol.w wVar, io.sentry.protocol.u uVar, c8 c8Var) {
        this.m = wVar;
        this.n = uVar;
        this.f215o = c8Var;
    }

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        io.sentry.protocol.w wVar = this.m;
        if (wVar != null) {
            cVar.r("event_id");
            cVar.x(g1Var, wVar);
        }
        io.sentry.protocol.u uVar = this.n;
        if (uVar != null) {
            cVar.r("sdk");
            cVar.x(g1Var, uVar);
        }
        c8 c8Var = this.f215o;
        if (c8Var != null) {
            cVar.r("trace");
            cVar.x(g1Var, c8Var);
        }
        if (this.p != null) {
            cVar.r("sent_at");
            cVar.x(g1Var, io.sentry.vendor.a.f(this.p.getTime()));
        }
        HashMap map = this.q;
        if (map != null) {
            for (String str : map.keySet()) {
                f.a(this.q, str, cVar, str, g1Var);
            }
        }
        cVar.m();
    }
}
