package io.sentry.protocol;

import io.sentry.g1;
import io.sentry.t2;
import io.sentry.x3;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class l implements t2 {
    public String m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f236o;
    public ConcurrentHashMap p;

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        if (this.m != null) {
            cVar.r("city");
            cVar.A(this.m);
        }
        if (this.n != null) {
            cVar.r("country_code");
            cVar.A(this.n);
        }
        if (this.f236o != null) {
            cVar.r("region");
            cVar.A(this.f236o);
        }
        ConcurrentHashMap concurrentHashMap = this.p;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.f.b(this.p, str, cVar, str, g1Var);
            }
        }
        cVar.m();
    }
}
