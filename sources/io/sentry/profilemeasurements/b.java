package io.sentry.profilemeasurements;

import io.sentry.f;
import io.sentry.g1;
import io.sentry.internal.debugmeta.c;
import io.sentry.t2;
import io.sentry.x3;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b implements t2 {
    public ConcurrentHashMap m;
    public double n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f222o;
    public double p;

    public b(Long l, Number number, long j) {
        this.f222o = l.toString();
        this.p = number.doubleValue();
        this.n = j / 1.0E9d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return io.sentry.util.b.j(this.m, bVar.m) && this.f222o.equals(bVar.f222o) && this.p == bVar.p && this.n == bVar.n;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.m, this.f222o, Double.valueOf(this.p)});
    }

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        c cVar = (c) x3Var;
        cVar.k();
        cVar.r("value");
        cVar.x(g1Var, Double.valueOf(this.p));
        cVar.r("elapsed_since_start_ns");
        cVar.x(g1Var, this.f222o);
        cVar.r("timestamp");
        cVar.x(g1Var, io.sentry.config.a.j(this.n));
        ConcurrentHashMap concurrentHashMap = this.m;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                f.b(this.m, str, cVar, str, g1Var);
            }
        }
        cVar.m();
    }
}
