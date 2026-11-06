package io.sentry;

import java.io.IOException;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class u7 implements t2 {
    public boolean A;
    public final io.sentry.util.a B = new io.sentry.util.a();
    public ConcurrentHashMap C;
    public final Date m;
    public Date n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AtomicInteger f269o;
    public final String p;
    public final String q;
    public Boolean r;
    public t7 s;
    public Long t;
    public Double u;
    public final String v;
    public String w;
    public final String x;
    public final String y;
    public String z;

    public u7(t7 t7Var, Date date, Date date2, int i, String str, String str2, Boolean bool, Long l, Double d, String str3, String str4, String str5, String str6, String str7) {
        this.s = t7Var;
        this.m = date;
        this.n = date2;
        this.f269o = new AtomicInteger(i);
        this.p = str;
        this.q = str2;
        this.r = bool;
        this.t = l;
        this.u = d;
        this.v = str3;
        this.w = str4;
        this.x = str5;
        this.y = str6;
        this.z = str7;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final u7 clone() {
        u7 u7Var = new u7(this.s, this.m, this.n, this.f269o.get(), this.p, this.q, this.r, this.t, this.u, this.v, this.w, this.x, this.y, this.z);
        u7Var.A = this.A;
        return u7Var;
    }

    public final void b(Date date) {
        io.sentry.util.a aVar = this.B;
        aVar.e();
        try {
            this.r = null;
            if (this.s == t7.Ok) {
                this.s = this.A ? t7.Unhandled : t7.Exited;
            }
            if (date != null) {
                this.n = date;
            } else {
                date = new Date();
                this.n = date;
            }
            this.u = Double.valueOf(Math.abs(date.getTime() - this.m.getTime()) / 1000.0d);
            long time = this.n.getTime();
            if (time < 0) {
                time = Math.abs(time);
            }
            this.t = Long.valueOf(time);
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean c(t7 t7Var, String str, boolean z, String str2) {
        io.sentry.util.a aVar = this.B;
        aVar.e();
        boolean z2 = true;
        boolean z3 = false;
        if (t7Var != null) {
            try {
                this.s = t7Var;
                if (t7Var != t7.Ok) {
                    this.A = false;
                }
                z3 = true;
            } catch (Throwable th) {
                try {
                    aVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (str != null) {
            this.w = str;
            z3 = true;
        }
        if (z) {
            this.f269o.addAndGet(1);
            z3 = true;
        }
        if (str2 != null) {
            this.z = str2;
        } else {
            z2 = z3;
        }
        if (z2) {
            this.r = null;
            Date date = new Date();
            this.n = date;
            long time = date.getTime();
            if (time < 0) {
                time = Math.abs(time);
            }
            this.t = Long.valueOf(time);
        }
        aVar.close();
        return z2;
    }

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        String str = this.q;
        if (str != null) {
            cVar.r("sid");
            cVar.A(str);
        }
        String str2 = this.p;
        if (str2 != null) {
            cVar.r("did");
            cVar.A(str2);
        }
        if (this.r != null) {
            cVar.r("init");
            cVar.y(this.r);
        }
        cVar.r("started");
        cVar.x(g1Var, this.m);
        cVar.r("status");
        cVar.x(g1Var, this.s.name().toLowerCase(Locale.ROOT));
        if (this.t != null) {
            cVar.r("seq");
            cVar.z(this.t);
        }
        cVar.r("errors");
        cVar.w(this.f269o.intValue());
        if (this.u != null) {
            cVar.r("duration");
            cVar.z(this.u);
        }
        if (this.n != null) {
            cVar.r("timestamp");
            cVar.x(g1Var, this.n);
        }
        if (this.z != null) {
            cVar.r("abnormal_mechanism");
            cVar.x(g1Var, this.z);
        }
        if (this.A) {
            cVar.r("non_terminating_unhandled_error");
            cVar.B(this.A);
        }
        cVar.r("attrs");
        cVar.k();
        cVar.r("release");
        cVar.x(g1Var, this.y);
        String str3 = this.x;
        if (str3 != null) {
            cVar.r("environment");
            cVar.x(g1Var, str3);
        }
        String str4 = this.v;
        if (str4 != null) {
            cVar.r("ip_address");
            cVar.x(g1Var, str4);
        }
        if (this.w != null) {
            cVar.r("user_agent");
            cVar.x(g1Var, this.w);
        }
        cVar.m();
        ConcurrentHashMap concurrentHashMap = this.C;
        if (concurrentHashMap != null) {
            for (String str5 : concurrentHashMap.keySet()) {
                f.b(this.C, str5, cVar, str5, g1Var);
            }
        }
        cVar.m();
    }
}
