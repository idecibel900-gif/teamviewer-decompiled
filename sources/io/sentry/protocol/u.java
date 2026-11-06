package io.sentry.protocol;

import io.sentry.d6;
import io.sentry.g1;
import io.sentry.t2;
import io.sentry.x3;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class u implements t2 {
    public String m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CopyOnWriteArraySet f248o;
    public CopyOnWriteArraySet p;
    public HashMap q;

    public u(String str, String str2) {
        this.m = str;
        this.n = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            u uVar = (u) obj;
            if (this.m.equals(uVar.m) && this.n.equals(uVar.n)) {
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
        cVar.r("name");
        cVar.A(this.m);
        cVar.r("version");
        cVar.A(this.n);
        CopyOnWriteArraySet copyOnWriteArraySet = this.f248o;
        if (copyOnWriteArraySet == null) {
            copyOnWriteArraySet = d6.d().b;
        }
        CopyOnWriteArraySet copyOnWriteArraySet2 = this.p;
        if (copyOnWriteArraySet2 == null) {
            copyOnWriteArraySet2 = d6.d().a;
        }
        if (!copyOnWriteArraySet.isEmpty()) {
            cVar.r("packages");
            cVar.x(g1Var, copyOnWriteArraySet);
        }
        if (!copyOnWriteArraySet2.isEmpty()) {
            cVar.r("integrations");
            cVar.x(g1Var, copyOnWriteArraySet2);
        }
        HashMap map = this.q;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.f.a(this.q, str, cVar, str, g1Var);
            }
        }
        cVar.m();
    }
}
