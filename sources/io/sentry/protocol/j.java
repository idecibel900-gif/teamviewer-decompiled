package io.sentry.protocol;

import io.sentry.g1;
import io.sentry.t2;
import io.sentry.x3;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class j implements t2 {
    public final List m;
    public ConcurrentHashMap n;

    public j(List list) {
        this.m = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        return io.sentry.util.b.j(this.m, ((j) obj).m);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.m});
    }

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        cVar.r("values");
        cVar.x(g1Var, this.m);
        ConcurrentHashMap concurrentHashMap = this.n;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.f.b(this.n, str, cVar, str, g1Var);
            }
        }
        cVar.m();
    }
}
