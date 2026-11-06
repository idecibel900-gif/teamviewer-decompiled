package io.sentry.rrweb;

import io.sentry.g1;
import io.sentry.t2;
import io.sentry.x3;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class k extends b implements t2 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f259o;
    public HashMap p;

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
        cVar.r("tag");
        cVar.A(this.f259o);
        cVar.r("payload");
        cVar.k();
        HashMap map = this.p;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                cVar.r(str);
                cVar.x(g1Var, obj);
            }
        }
        cVar.m();
        cVar.m();
        cVar.m();
    }
}
