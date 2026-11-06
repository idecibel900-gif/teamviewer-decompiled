package io.sentry.protocol;

import io.sentry.f5;
import io.sentry.g1;
import io.sentry.t2;
import io.sentry.x3;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class n implements t2 {
    public final /* synthetic */ byte m = 1;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f238o;
    public AbstractMap p;

    public n(Object obj, String str) {
        this.n = str;
        if (obj == null || !str.equals("string")) {
            this.f238o = obj;
        } else {
            this.f238o = obj.toString();
        }
    }

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        byte b = this.m;
        Object obj = this.f238o;
        String str = this.n;
        switch (b) {
            case 0:
                io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
                cVar.k();
                cVar.r("value");
                cVar.z((Number) obj);
                if (str != null) {
                    cVar.r("unit");
                    cVar.A(str);
                }
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.p;
                if (concurrentHashMap != null) {
                    for (String str2 : concurrentHashMap.keySet()) {
                        io.sentry.f.b((ConcurrentHashMap) this.p, str2, cVar, str2, g1Var);
                    }
                }
                cVar.m();
                break;
            default:
                io.sentry.internal.debugmeta.c cVar2 = (io.sentry.internal.debugmeta.c) x3Var;
                cVar2.k();
                cVar2.r("type");
                cVar2.x(g1Var, str);
                cVar2.r("value");
                cVar2.x(g1Var, obj);
                HashMap map = (HashMap) this.p;
                if (map != null) {
                    for (String str3 : map.keySet()) {
                        io.sentry.f.a((HashMap) this.p, str3, cVar2, str3, g1Var);
                    }
                }
                cVar2.m();
                break;
        }
    }

    public n(f5 f5Var, Object obj) {
        this(obj, f5Var.apiName());
    }

    public n(Number number, String str) {
        this.f238o = number;
        this.n = str;
    }
}
