package io.sentry;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l4 implements t2 {
    public Integer m;
    public List n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public HashMap f210o;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l4.class == obj.getClass()) {
            l4 l4Var = (l4) obj;
            if (io.sentry.util.b.j(this.m, l4Var.m) && io.sentry.util.b.j(this.n, l4Var.n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.m, this.n});
    }

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        io.sentry.vendor.gson.stream.c cVar2 = (io.sentry.vendor.gson.stream.c) cVar.n;
        if (this.m != null) {
            cVar.r("segment_id");
            cVar.z(this.m);
        }
        HashMap map = this.f210o;
        if (map != null) {
            for (String str : map.keySet()) {
                f.a(this.f210o, str, cVar, str, g1Var);
            }
        }
        cVar.m();
        cVar2.r = true;
        if (this.m != null) {
            cVar2.G();
            cVar2.e();
            cVar2.m.append((CharSequence) "\n");
        }
        List list = this.n;
        if (list != null) {
            cVar.x(g1Var, list);
        }
        cVar2.r = false;
    }
}
