package io.sentry;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c8 implements t2 {
    public final io.sentry.protocol.w m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f184o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final String u;
    public final io.sentry.protocol.w v;
    public ConcurrentHashMap w;

    public c8(io.sentry.protocol.w wVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, io.sentry.protocol.w wVar2, String str8) {
        this.m = wVar;
        this.n = str;
        this.f184o = str2;
        this.p = str3;
        this.q = str4;
        this.r = str5;
        this.s = str6;
        this.u = str7;
        this.v = wVar2;
        this.t = str8;
    }

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        cVar.r("trace_id");
        cVar.x(g1Var, this.m);
        cVar.r("public_key");
        cVar.A(this.n);
        String str = this.f184o;
        if (str != null) {
            cVar.r("release");
            cVar.A(str);
        }
        String str2 = this.p;
        if (str2 != null) {
            cVar.r("environment");
            cVar.A(str2);
        }
        String str3 = this.q;
        if (str3 != null) {
            cVar.r("user_id");
            cVar.A(str3);
        }
        String str4 = this.r;
        if (str4 != null) {
            cVar.r("transaction");
            cVar.A(str4);
        }
        String str5 = this.s;
        if (str5 != null) {
            cVar.r("sample_rate");
            cVar.A(str5);
        }
        String str6 = this.t;
        if (str6 != null) {
            cVar.r("sample_rand");
            cVar.A(str6);
        }
        String str7 = this.u;
        if (str7 != null) {
            cVar.r("sampled");
            cVar.A(str7);
        }
        io.sentry.protocol.w wVar = this.v;
        if (wVar != null) {
            cVar.r("replay_id");
            cVar.x(g1Var, wVar);
        }
        ConcurrentHashMap concurrentHashMap = this.w;
        if (concurrentHashMap != null) {
            for (String str8 : concurrentHashMap.keySet()) {
                f.b(this.w, str8, cVar, str8, g1Var);
            }
        }
        cVar.m();
    }
}
