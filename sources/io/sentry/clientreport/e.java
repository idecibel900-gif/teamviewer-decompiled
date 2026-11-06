package io.sentry.clientreport;

import io.sentry.g1;
import io.sentry.t2;
import io.sentry.x3;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e implements t2 {
    public final String m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Long f190o;
    public HashMap p;

    public e(String str, String str2, Long l) {
        this.m = str;
        this.n = str2;
        this.f190o = l;
    }

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        cVar.r("reason");
        cVar.A(this.m);
        cVar.r("category");
        cVar.A(this.n);
        cVar.r("quantity");
        cVar.z(this.f190o);
        HashMap map = this.p;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.f.a(this.p, str, cVar, str, g1Var);
            }
        }
        cVar.m();
    }

    public final String toString() {
        return "DiscardedEvent{reason='" + this.m + "', category='" + this.n + "', quantity=" + this.f190o + '}';
    }
}
