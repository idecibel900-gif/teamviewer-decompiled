package io.sentry;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class u5 implements t2 {
    public final String m;
    public final Integer n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f268o;
    public final String p;
    public final e6 q;
    public final int r;
    public final Callable s;
    public final String t;
    public final Callable u;
    public HashMap v;

    public u5(e6 e6Var, int i, Callable callable, String str, String str2, String str3, String str4, Integer num, Callable callable2) {
        io.sentry.util.b.v(e6Var, "type is required");
        this.q = e6Var;
        this.m = str;
        this.r = i;
        this.f268o = str2;
        this.s = callable;
        this.t = str3;
        this.p = str4;
        this.n = num;
        this.u = callable2;
    }

    public final int a() {
        Callable callable = this.s;
        if (callable == null) {
            return this.r;
        }
        try {
            return ((Integer) callable.call()).intValue();
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        String str = this.m;
        if (str != null) {
            cVar.r("content_type");
            cVar.A(str);
        }
        String str2 = this.f268o;
        if (str2 != null) {
            cVar.r("filename");
            cVar.A(str2);
        }
        cVar.r("type");
        cVar.x(g1Var, this.q);
        String str3 = this.t;
        if (str3 != null) {
            cVar.r("attachment_type");
            cVar.A(str3);
        }
        String str4 = this.p;
        if (str4 != null) {
            cVar.r("platform");
            cVar.A(str4);
        }
        Integer num = this.n;
        if (num != null) {
            cVar.r("item_count");
            cVar.z(num);
        }
        cVar.r("length");
        cVar.w(a());
        Integer num2 = null;
        Callable callable = this.u;
        if (callable != null) {
            try {
                num2 = (Integer) callable.call();
            } catch (Throwable unused) {
            }
        }
        if (num2 != null) {
            cVar.r("meta_length");
            cVar.z(num2);
        }
        HashMap map = this.v;
        if (map != null) {
            for (String str5 : map.keySet()) {
                f.a(this.v, str5, cVar, str5, g1Var);
            }
        }
        cVar.m();
    }

    public u5(e6 e6Var, Callable callable, String str, String str2, String str3, String str4, Integer num) {
        this(e6Var, -1, callable, str, str2, str3, str4, num, null);
    }

    public u5(e6 e6Var, Callable callable, String str, String str2, String str3) {
        this(e6Var, callable, str, str2, str3, null, null);
    }
}
