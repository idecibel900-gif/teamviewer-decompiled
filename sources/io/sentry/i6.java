package io.sentry;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class i6 implements t2 {
    public final /* synthetic */ byte m;
    public final Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AbstractMap f203o;

    public /* synthetic */ i6(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
                cVar.k();
                cVar.r("items");
                cVar.x(g1Var, (List) obj);
                HashMap map = (HashMap) this.f203o;
                if (map != null) {
                    for (String str : map.keySet()) {
                        f.a((HashMap) this.f203o, str, cVar, str, g1Var);
                    }
                }
                cVar.m();
                break;
            default:
                io.sentry.internal.debugmeta.c cVar2 = (io.sentry.internal.debugmeta.c) x3Var;
                cVar2.k();
                String str2 = (String) obj;
                if (str2 != null) {
                    cVar2.r("source");
                    cVar2.x(g1Var, str2);
                }
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f203o;
                if (concurrentHashMap != null) {
                    for (String str3 : concurrentHashMap.keySet()) {
                        f.b((ConcurrentHashMap) this.f203o, str3, cVar2, str3, g1Var);
                    }
                }
                cVar2.m();
                break;
        }
    }
}
