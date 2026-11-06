package io.sentry.protocol;

import io.sentry.g1;
import io.sentry.t2;
import io.sentry.x3;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class o implements t2 {
    public String m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f239o;
    public Boolean p;
    public AbstractMap q;
    public AbstractMap r;
    public Boolean s;
    public Integer t;
    public Integer u;
    public Boolean v;
    public HashMap w;

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        if (this.m != null) {
            cVar.r("type");
            cVar.A(this.m);
        }
        if (this.n != null) {
            cVar.r("description");
            cVar.A(this.n);
        }
        if (this.f239o != null) {
            cVar.r("help_link");
            cVar.A(this.f239o);
        }
        if (this.p != null) {
            cVar.r("handled");
            cVar.y(this.p);
        }
        if (this.q != null) {
            cVar.r("meta");
            cVar.x(g1Var, this.q);
        }
        if (this.r != null) {
            cVar.r("data");
            cVar.x(g1Var, this.r);
        }
        if (this.s != null) {
            cVar.r("synthetic");
            cVar.y(this.s);
        }
        if (this.t != null) {
            cVar.r("exception_id");
            cVar.x(g1Var, this.t);
        }
        if (this.u != null) {
            cVar.r("parent_id");
            cVar.x(g1Var, this.u);
        }
        if (this.v != null) {
            cVar.r("is_exception_group");
            cVar.y(this.v);
        }
        HashMap map = this.w;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.f.a(this.w, str, cVar, str, g1Var);
            }
        }
        cVar.m();
    }
}
