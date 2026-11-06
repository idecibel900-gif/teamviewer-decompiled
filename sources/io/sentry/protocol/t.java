package io.sentry.protocol;

import io.sentry.g1;
import io.sentry.t2;
import io.sentry.x3;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class t implements t2 {
    public String m;
    public Integer n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Integer f247o;
    public Integer p;
    public HashMap q;

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        if (this.m != null) {
            cVar.r("sdk_name");
            cVar.A(this.m);
        }
        if (this.n != null) {
            cVar.r("version_major");
            cVar.z(this.n);
        }
        if (this.f247o != null) {
            cVar.r("version_minor");
            cVar.z(this.f247o);
        }
        if (this.p != null) {
            cVar.r("version_patchlevel");
            cVar.z(this.p);
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
