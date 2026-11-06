package io.sentry.protocol;

import io.sentry.g1;
import io.sentry.t2;
import io.sentry.x3;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k0 implements t2 {
    public String m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f235o;
    public String p;
    public Double q;
    public Double r;
    public Double s;
    public Double t;
    public String u;
    public Double v;
    public List w;
    public HashMap x;

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        if (this.m != null) {
            cVar.r("rendering_system");
            cVar.A(this.m);
        }
        if (this.n != null) {
            cVar.r("type");
            cVar.A(this.n);
        }
        if (this.f235o != null) {
            cVar.r("identifier");
            cVar.A(this.f235o);
        }
        if (this.p != null) {
            cVar.r("tag");
            cVar.A(this.p);
        }
        if (this.q != null) {
            cVar.r("width");
            cVar.z(this.q);
        }
        if (this.r != null) {
            cVar.r("height");
            cVar.z(this.r);
        }
        if (this.s != null) {
            cVar.r("x");
            cVar.z(this.s);
        }
        if (this.t != null) {
            cVar.r("y");
            cVar.z(this.t);
        }
        if (this.u != null) {
            cVar.r("visibility");
            cVar.A(this.u);
        }
        if (this.v != null) {
            cVar.r("alpha");
            cVar.z(this.v);
        }
        List list = this.w;
        if (list != null && !list.isEmpty()) {
            cVar.r("children");
            cVar.x(g1Var, this.w);
        }
        HashMap map = this.x;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.f.a(this.x, str, cVar, str, g1Var);
            }
        }
        cVar.m();
    }
}
