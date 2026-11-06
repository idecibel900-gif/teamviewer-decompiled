package io.sentry.protocol.profiling;

import io.sentry.f;
import io.sentry.g1;
import io.sentry.t2;
import io.sentry.x3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a implements t2 {
    public List m = new ArrayList();
    public List n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f241o = new ArrayList();
    public Map p = new HashMap();
    public ConcurrentHashMap q;

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        cVar.r("samples");
        cVar.x(g1Var, this.m);
        cVar.r("stacks");
        cVar.x(g1Var, this.n);
        cVar.r("frames");
        cVar.x(g1Var, this.f241o);
        cVar.r("thread_metadata");
        cVar.x(g1Var, this.p);
        ConcurrentHashMap concurrentHashMap = this.q;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                f.b(this.q, str, cVar, str, g1Var);
            }
        }
        cVar.m();
    }
}
