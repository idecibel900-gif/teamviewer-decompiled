package io.sentry.okhttp;

import io.sentry.d5;
import io.sentry.h;
import io.sentry.l5;
import io.sentry.o;
import io.sentry.p0;
import io.sentry.util.l;
import io.sentry.v1;
import io.sentry.w4;
import io.sentry.w7;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;
import o.ab6;
import o.h93;
import o.lc6;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final ab6 a;
    public final ConcurrentHashMap b;
    public final h c;
    public final v1 d;
    public lc6 e;
    public lc6 f;
    public io.sentry.util.network.f g;
    public final AtomicBoolean h;
    public String i;
    public String j;

    public a(ab6 ab6Var) {
        ab6Var.getClass();
        this.a = ab6Var;
        this.b = new ConcurrentHashMap();
        this.h = new AtomicBoolean(false);
        String str = (String) io.sentry.util.b.s(ab6Var.a.i, d5.c().l().getDataCollectionResolver()).b;
        this.i = str == null ? "unknown" : str;
        this.j = ab6Var.b;
        v1 v1VarM = l.a ? d5.c().m() : d5.c().g();
        v1 v1VarS = v1VarM != null ? v1VarM.s("http.client") : null;
        this.d = v1VarS;
        w7 w7VarV = v1VarS != null ? v1VarS.v() : null;
        if (w7VarV != null) {
            w7VarV.u = "auto.http.okhttp";
        }
        h hVar = new h();
        hVar.q = "http";
        hVar.s = "http";
        hVar.d(Long.valueOf(System.currentTimeMillis()), "http.start_timestamp");
        this.c = hVar;
        e(ab6Var);
    }

    public final void a(c cVar) {
        if (this.h.getAndSet(true)) {
            return;
        }
        this.b.clear();
        p0 p0Var = new p0();
        p0Var.d(this.a, "okHttp:request");
        lc6 lc6Var = this.e;
        if (lc6Var != null) {
            p0Var.d(lc6Var, "okHttp:response");
        }
        io.sentry.util.network.f fVar = this.g;
        if (fVar != null) {
            p0Var.d(fVar, "sentry:replayNetworkDetails");
        }
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        h hVar = this.c;
        hVar.d(lValueOf, "http.end_timestamp");
        w4 w4Var = w4.a;
        w4Var.f(hVar, p0Var);
        v1 v1Var = this.d;
        if (v1Var != null && cVar != null) {
            cVar.invoke(v1Var);
        }
        lc6 lc6Var2 = this.f;
        if (lc6Var2 != null) {
            io.sentry.config.a.b(w4Var, lc6Var2.m, lc6Var2);
        }
        if (v1Var != null) {
            v1Var.l();
        }
    }

    public final void b(String str, Function1 function1) {
        v1 v1Var;
        l5 l5Var = (l5) this.b.remove(str);
        if (l5Var == null || (v1Var = this.d) == null) {
            return;
        }
        if (function1 != null) {
            function1.invoke(v1Var);
        }
        v1Var.m(Long.valueOf(d5.c().l().getDateProvider().a().b(l5Var) / 1000000), str);
    }

    public final void c(String str) {
        if (this.d == null) {
            return;
        }
        l5 l5VarA = d5.c().l().getDateProvider().a();
        l5VarA.getClass();
        this.b.put(str, l5VarA);
    }

    public final void d(String str) {
        if (str != null) {
            this.c.d(str, "error_message");
            v1 v1Var = this.d;
            if (v1Var != null) {
                v1Var.m(str, "error_message");
            }
        }
    }

    public final void e(ab6 ab6Var) {
        ab6Var.getClass();
        h93 h93Var = ab6Var.a;
        o oVarS = io.sentry.util.b.s(h93Var.i, d5.c().l().getDataCollectionResolver());
        String str = (String) oVarS.d;
        String str2 = (String) oVarS.c;
        String str3 = (String) oVarS.b;
        this.i = str3 == null ? "unknown" : str3;
        String str4 = h93Var.d;
        String strB = h93Var.b();
        this.j = ab6Var.b;
        v1 v1Var = this.d;
        if (v1Var != null) {
            v1Var.q(this.j + ' ' + this.i);
        }
        if (v1Var != null) {
            if (str2 != null) {
                v1Var.m(str2, "http.query");
            }
            if (str != null) {
                v1Var.m(str, "http.fragment");
            }
        }
        h hVar = this.c;
        hVar.d(str4, "host");
        hVar.d(strB, "path");
        if (str3 != null) {
            hVar.d(str3, "url");
        }
        String str5 = this.j;
        Locale locale = Locale.ROOT;
        String upperCase = str5.toUpperCase(locale);
        upperCase.getClass();
        hVar.d(upperCase, "method");
        if (str2 != null) {
            hVar.d(str2, "http.query");
        }
        if (str != null) {
            hVar.d(str, "http.fragment");
        }
        if (v1Var != null) {
            v1Var.m(this.i, "url");
        }
        if (v1Var != null) {
            v1Var.m(str4, "host");
        }
        if (v1Var != null) {
            v1Var.m(strB, "path");
        }
        if (v1Var != null) {
            String upperCase2 = this.j.toUpperCase(locale);
            upperCase2.getClass();
            v1Var.m(upperCase2, "http.request.method");
        }
    }
}
