package io.sentry.profilemeasurements;

import io.sentry.f;
import io.sentry.g1;
import io.sentry.internal.debugmeta.c;
import io.sentry.t2;
import io.sentry.x3;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a implements t2 {
    public ConcurrentHashMap m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Collection f221o;

    public a(String str, AbstractCollection abstractCollection) {
        this.n = str;
        this.f221o = abstractCollection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return io.sentry.util.b.j(this.m, aVar.m) && this.n.equals(aVar.n) && new ArrayList(this.f221o).equals(new ArrayList(aVar.f221o));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.m, this.n, this.f221o});
    }

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        c cVar = (c) x3Var;
        cVar.k();
        cVar.r("unit");
        cVar.x(g1Var, this.n);
        cVar.r("values");
        cVar.x(g1Var, this.f221o);
        ConcurrentHashMap concurrentHashMap = this.m;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                f.b(this.m, str, cVar, str, g1Var);
            }
        }
        cVar.m();
    }
}
