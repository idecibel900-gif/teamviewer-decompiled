package io.sentry;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g6 implements t2 {
    public int m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f196o;
    public String p;
    public Long q;
    public ConcurrentHashMap r;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g6.class != obj.getClass()) {
            return false;
        }
        return io.sentry.util.b.j(this.n, ((g6) obj).n);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.n});
    }

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        cVar.r("type");
        cVar.w(this.m);
        if (this.n != null) {
            cVar.r("address");
            cVar.A(this.n);
        }
        if (this.f196o != null) {
            cVar.r("package_name");
            cVar.A(this.f196o);
        }
        if (this.p != null) {
            cVar.r("class_name");
            cVar.A(this.p);
        }
        if (this.q != null) {
            cVar.r("thread_id");
            cVar.z(this.q);
        }
        ConcurrentHashMap concurrentHashMap = this.r;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                f.b(this.r, str, cVar, str, g1Var);
            }
        }
        cVar.m();
    }
}
