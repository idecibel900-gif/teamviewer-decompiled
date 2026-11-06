package io.sentry;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class h5 {
    public AbstractMap A;
    public io.sentry.protocol.w m;
    public final io.sentry.protocol.e n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public io.sentry.protocol.u f198o;
    public io.sentry.protocol.r p;
    public AbstractMap q;
    public String r;
    public String s;
    public String t;
    public io.sentry.protocol.i0 u;
    public transient Exception v;
    public String w;
    public String x;
    public List y;
    public io.sentry.protocol.f z;

    public h5(io.sentry.protocol.w wVar) {
        this.n = new io.sentry.protocol.e();
        this.m = wVar;
    }

    public final Throwable a() {
        Exception exc = this.v;
        return exc instanceof io.sentry.exception.a ? ((io.sentry.exception.a) exc).n : exc;
    }

    public final void b(String str, String str2) {
        AbstractMap map = this.q;
        if (map == null) {
            map = new HashMap();
            this.q = map;
        }
        if (str == null) {
            return;
        }
        if (str2 == null) {
            map.remove(str);
        } else {
            map.put(str, str2);
        }
    }

    public final void c(Map map) {
        this.q = map != null ? new HashMap(map) : null;
    }

    public h5() {
        this(new io.sentry.protocol.w());
    }
}
