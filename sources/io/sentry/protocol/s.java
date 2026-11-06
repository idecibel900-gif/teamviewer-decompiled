package io.sentry.protocol;

import io.sentry.g1;
import io.sentry.t2;
import io.sentry.x3;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class s implements t2 {
    public String m;
    public ConcurrentHashMap n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Integer f246o;
    public Long p;
    public Object q;
    public ConcurrentHashMap r;

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        if (this.m != null) {
            cVar.r("cookies");
            cVar.A(this.m);
        }
        if (this.n != null) {
            cVar.r("headers");
            cVar.x(g1Var, this.n);
        }
        if (this.f246o != null) {
            cVar.r("status_code");
            cVar.x(g1Var, this.f246o);
        }
        if (this.p != null) {
            cVar.r("body_size");
            cVar.x(g1Var, this.p);
        }
        if (this.q != null) {
            cVar.r("data");
            cVar.x(g1Var, this.q);
        }
        ConcurrentHashMap concurrentHashMap = this.r;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.f.b(this.r, str, cVar, str, g1Var);
            }
        }
        cVar.m();
    }
}
