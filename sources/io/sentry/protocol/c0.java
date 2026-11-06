package io.sentry.protocol;

import io.sentry.g1;
import io.sentry.t2;
import io.sentry.x3;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements t2 {
    public List m;
    public AbstractMap n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Boolean f226o;
    public b0 p;
    public ConcurrentHashMap q;

    public c0(List list) {
        this.m = list;
    }

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        if (this.m != null) {
            cVar.r("frames");
            cVar.x(g1Var, this.m);
        }
        if (this.n != null) {
            cVar.r("registers");
            cVar.x(g1Var, this.n);
        }
        if (this.f226o != null) {
            cVar.r("snapshot");
            cVar.y(this.f226o);
        }
        if (this.p != null) {
            cVar.r("instruction_addr_adjustment");
            cVar.x(g1Var, this.p);
        }
        ConcurrentHashMap concurrentHashMap = this.q;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.f.b(this.q, str, cVar, str, g1Var);
            }
        }
        cVar.m();
    }
}
