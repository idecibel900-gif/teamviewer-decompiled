package io.sentry;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class f {
    public static void a(HashMap map, String str, io.sentry.internal.debugmeta.c cVar, String str2, g1 g1Var) {
        Object obj = map.get(str);
        cVar.r(str2);
        cVar.x(g1Var, obj);
    }

    public static void b(ConcurrentHashMap concurrentHashMap, String str, io.sentry.internal.debugmeta.c cVar, String str2, g1 g1Var) {
        Object obj = concurrentHashMap.get(str);
        cVar.r(str2);
        cVar.x(g1Var, obj);
    }
}
