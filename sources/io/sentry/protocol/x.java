package io.sentry.protocol;

import io.sentry.g1;
import io.sentry.t2;
import io.sentry.x3;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class x implements t2 {
    public final String m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public HashMap f250o;

    public x(String str, String str2) {
        this.m = str;
        this.n = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        x xVar = (x) obj;
        return this.m.equals(xVar.m) && this.n.equals(xVar.n);
    }

    public final int hashCode() {
        return Objects.hash(this.m, this.n);
    }

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        cVar.r("name");
        cVar.A(this.m);
        cVar.r("version");
        cVar.A(this.n);
        HashMap map = this.f250o;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.f.a(this.f250o, str, cVar, str, g1Var);
            }
        }
        cVar.m();
    }
}
