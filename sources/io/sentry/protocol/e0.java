package io.sentry.protocol;

import io.sentry.g1;
import io.sentry.t2;
import io.sentry.x3;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements t2 {
    public Long m;
    public Integer n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f228o;
    public String p;
    public Boolean q;
    public Boolean r;
    public Boolean s;
    public Boolean t;
    public c0 u;
    public Map v;
    public ConcurrentHashMap w;

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        if (this.m != null) {
            cVar.r("id");
            cVar.z(this.m);
        }
        if (this.n != null) {
            cVar.r("priority");
            cVar.z(this.n);
        }
        if (this.f228o != null) {
            cVar.r("name");
            cVar.A(this.f228o);
        }
        if (this.p != null) {
            cVar.r("state");
            cVar.A(this.p);
        }
        if (this.q != null) {
            cVar.r("crashed");
            cVar.y(this.q);
        }
        if (this.r != null) {
            cVar.r("current");
            cVar.y(this.r);
        }
        if (this.s != null) {
            cVar.r("daemon");
            cVar.y(this.s);
        }
        if (this.t != null) {
            cVar.r("main");
            cVar.y(this.t);
        }
        if (this.u != null) {
            cVar.r("stacktrace");
            cVar.x(g1Var, this.u);
        }
        if (this.v != null) {
            cVar.r("held_locks");
            cVar.x(g1Var, this.v);
        }
        ConcurrentHashMap concurrentHashMap = this.w;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.f.b(this.w, str, cVar, str, g1Var);
            }
        }
        cVar.m();
    }
}
