package io.sentry.protocol;

import io.sentry.g1;
import io.sentry.t2;
import io.sentry.x3;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class i implements t2 {
    public final String m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ConcurrentHashMap f231o;

    public i(String str, boolean z) {
        this.m = str;
        this.n = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (io.sentry.util.b.j(this.m, iVar.m) && io.sentry.util.b.j(Boolean.valueOf(this.n), Boolean.valueOf(iVar.n))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.m, Boolean.valueOf(this.n)});
    }

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        cVar.r("flag");
        cVar.A(this.m);
        cVar.r("result");
        cVar.B(this.n);
        ConcurrentHashMap concurrentHashMap = this.f231o;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.f.b(this.f231o, str, cVar, str, g1Var);
            }
        }
        cVar.m();
    }
}
