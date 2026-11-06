package io.sentry;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class d4 implements t2 {
    public io.sentry.protocol.w m;
    public ConcurrentHashMap n;

    public d4(io.sentry.protocol.w wVar) {
        this.m = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d4) {
            return this.m.equals(((d4) obj).m);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.m});
    }

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        cVar.r("profiler_id");
        cVar.x(g1Var, this.m);
        ConcurrentHashMap concurrentHashMap = this.n;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                f.b(this.n, str, cVar, str, g1Var);
            }
        }
        cVar.m();
    }
}
