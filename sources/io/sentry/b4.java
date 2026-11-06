package io.sentry;

import java.io.File;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b4 {
    public final io.sentry.protocol.w a;
    public final io.sentry.protocol.w b;
    public final ConcurrentHashMap c;
    public final File d;
    public final double e;
    public String f;

    public b4(io.sentry.protocol.w wVar, io.sentry.protocol.w wVar2, HashMap map, File file, l5 l5Var) {
        this.a = wVar;
        this.b = wVar2;
        this.c = new ConcurrentHashMap(map);
        this.d = file;
        this.e = l5Var.d() / 1.0E9d;
    }
}
