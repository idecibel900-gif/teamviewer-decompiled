package io.sentry.protocol;

import io.sentry.g1;
import io.sentry.t2;
import io.sentry.x3;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j0 implements t2 {
    public final String m;
    public final List n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public HashMap f233o;

    public j0(String str, List list) {
        this.m = str;
        this.n = list;
    }

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        String str = this.m;
        if (str != null) {
            cVar.r("rendering_system");
            cVar.A(str);
        }
        List list = this.n;
        if (list != null) {
            cVar.r("windows");
            cVar.x(g1Var, list);
        }
        HashMap map = this.f233o;
        if (map != null) {
            for (String str2 : map.keySet()) {
                io.sentry.f.a(this.f233o, str2, cVar, str2, g1Var);
            }
        }
        cVar.m();
    }
}
