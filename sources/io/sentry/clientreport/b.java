package io.sentry.clientreport;

import io.sentry.g1;
import io.sentry.t2;
import io.sentry.x3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b implements t2 {
    public final Date m;
    public final ArrayList n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public HashMap f189o;

    public b(Date date, ArrayList arrayList) {
        this.m = date;
        this.n = arrayList;
    }

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        cVar.r("timestamp");
        cVar.A(io.sentry.vendor.a.f(this.m.getTime()));
        cVar.r("discarded_events");
        cVar.x(g1Var, this.n);
        HashMap map = this.f189o;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.f.a(this.f189o, str, cVar, str, g1Var);
            }
        }
        cVar.m();
    }
}
