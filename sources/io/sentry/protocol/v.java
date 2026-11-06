package io.sentry.protocol;

import io.sentry.g1;
import io.sentry.t2;
import io.sentry.x3;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class v implements t2 {
    public String m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f249o;
    public Long p;
    public c0 q;
    public o r;
    public HashMap s;

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        if (this.m != null) {
            cVar.r("type");
            cVar.A(this.m);
        }
        if (this.n != null) {
            cVar.r("value");
            cVar.A(this.n);
        }
        if (this.f249o != null) {
            cVar.r("module");
            cVar.A(this.f249o);
        }
        if (this.p != null) {
            cVar.r("thread_id");
            cVar.z(this.p);
        }
        if (this.q != null) {
            cVar.r("stacktrace");
            cVar.x(g1Var, this.q);
        }
        if (this.r != null) {
            cVar.r("mechanism");
            cVar.x(g1Var, this.r);
        }
        HashMap map = this.s;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.f.a(this.s, str, cVar, str, g1Var);
            }
        }
        cVar.m();
    }
}
