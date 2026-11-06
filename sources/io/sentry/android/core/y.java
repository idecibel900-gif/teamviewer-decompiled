package io.sentry.android.core;

import android.content.Context;
import android.os.Build;
import io.sentry.d5;
import io.sentry.f4;
import io.sentry.f6;
import io.sentry.g4;
import io.sentry.g7;
import io.sentry.s7;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class y implements io.sentry.y1 {
    public Date A;
    public final Context m;
    public final io.sentry.g1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f133o;
    public final boolean p;
    public final int q;
    public final io.sentry.util.g r;
    public final q0 s;
    public final io.sentry.android.core.internal.util.t v;
    public volatile g4 w;
    public long y;
    public long z;
    public boolean t = false;
    public final AtomicBoolean u = new AtomicBoolean(false);
    public volatile w x = null;
    public final io.sentry.util.a B = new io.sentry.util.a();

    public y(Context context, q0 q0Var, io.sentry.android.core.internal.util.t tVar, io.sentry.g1 g1Var, String str, boolean z, int i, io.sentry.util.g gVar) {
        Context applicationContext = context.getApplicationContext();
        this.m = applicationContext != null ? applicationContext : context;
        io.sentry.util.b.v(g1Var, "ILogger is required");
        this.n = g1Var;
        this.v = tVar;
        io.sentry.util.b.v(q0Var, "The BuildInfoProvider is required.");
        this.s = q0Var;
        this.f133o = str;
        this.p = z;
        this.q = i;
        this.r = gVar;
        this.A = new Date();
    }

    @Override // io.sentry.y1
    public final void a(io.sentry.x1 x1Var) {
        if (this.u.get() && this.w == null) {
            io.sentry.util.a aVar = this.B;
            aVar.e();
            try {
                if (this.u.get() && this.w == null) {
                    this.w = new g4(x1Var, Long.valueOf(this.y), Long.valueOf(this.z));
                }
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
    }

    public final f4 b(String str, String str2, String str3, boolean z, List list, g7 g7Var) {
        Long l;
        this.s.getClass();
        int i = Build.VERSION.SDK_INT;
        if (this.x != null) {
            io.sentry.util.a aVar = this.B;
            aVar.e();
            try {
                g4 g4Var = this.w;
                if (g4Var == null || !g4Var.m.equals(str2)) {
                    this.n.g(f6.INFO, "Transaction %s (%s) finished, but was not currently being profiled. Skipping", str, str3);
                    aVar.close();
                    return null;
                }
                this.w = null;
                aVar.close();
                this.n.g(f6.DEBUG, "Transaction %s (%s) finished.", str, str3);
                u uVarA = this.x.a(list, false);
                this.u.set(false);
                if (uVarA != null) {
                    long j = uVarA.a - this.y;
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(g4Var);
                    long j2 = uVarA.a;
                    long j3 = this.y;
                    long j4 = uVarA.b;
                    long j5 = this.z;
                    if (g4Var.q == null) {
                        g4Var.q = Long.valueOf(j2 - j3);
                        g4Var.p = Long.valueOf(g4Var.p.longValue() - j3);
                        g4Var.s = Long.valueOf(j4 - j5);
                        g4Var.r = Long.valueOf(g4Var.r.longValue() - j5);
                    }
                    if (g7Var instanceof SentryAndroidOptions) {
                        l = ((SentryAndroidOptions) g7Var).getOrCreateDeviceInfoUtil(this.m).h;
                    } else {
                        l = null;
                    }
                    String string = l != null ? Long.toString(l.longValue()) : "0";
                    String[] strArr = Build.SUPPORTED_ABIS;
                    File file = uVarA.c;
                    Date date = this.A;
                    String string2 = Long.toString(j);
                    this.s.getClass();
                    String str4 = (strArr == null || strArr.length <= 0) ? "" : strArr[0];
                    io.sentry.q0 q0Var = new io.sentry.q0((byte) 2);
                    this.s.getClass();
                    String str5 = Build.MANUFACTURER;
                    this.s.getClass();
                    String str6 = Build.MODEL;
                    this.s.getClass();
                    return new f4(file, date, arrayList, str, str2, str3, string2, i, str4, q0Var, str5, str6, Build.VERSION.RELEASE, this.s.a(), string, g7Var.getProguardUuid(), g7Var.getRelease(), g7Var.getEnvironment(), (uVarA.e || z) ? "timeout" : "normal", uVarA.d);
                }
            } catch (Throwable th) {
                try {
                    aVar.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        return null;
    }

    @Override // io.sentry.y1
    public final f4 c(s7 s7Var, List list, g7 g7Var) {
        return b(s7Var.e, s7Var.a.a(), s7Var.b.c.m.a(), false, list, g7Var);
    }

    @Override // io.sentry.y1
    public final void close() {
        y yVar;
        g4 g4Var = this.w;
        if (g4Var != null) {
            yVar = this;
            yVar.b(g4Var.f195o, g4Var.m, g4Var.n, true, null, d5.c().l());
        } else {
            yVar = this;
        }
        yVar.u.set(false);
        if (yVar.x != null) {
            w wVar = yVar.x;
            io.sentry.util.a aVar = wVar.f130o;
            aVar.e();
            try {
                Future future = wVar.d;
                if (future != null) {
                    future.cancel(true);
                    wVar.d = null;
                }
                if (wVar.n) {
                    wVar.a(null, true);
                }
                aVar.close();
            } catch (Throwable th) {
                try {
                    aVar.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
    }

    @Override // io.sentry.y1
    public final boolean isRunning() {
        return this.u.get();
    }

    @Override // io.sentry.y1
    public final void start() {
        v vVarC;
        this.s.getClass();
        if (this.u.getAndSet(true)) {
            return;
        }
        if (!this.t) {
            this.t = true;
            if (this.p) {
                String str = this.f133o;
                if (str == null) {
                    this.n.g(f6.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
                } else {
                    int i = this.q;
                    if (i <= 0) {
                        this.n.g(f6.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i));
                    } else {
                        this.x = new w(str, 1000000 / i, this.v, this.r, this.n);
                    }
                }
            } else {
                this.n.g(f6.INFO, "Profiling is disabled in options.", new Object[0]);
            }
        }
        if (this.x != null && (vVarC = this.x.c()) != null) {
            this.y = vVarC.m;
            this.z = vVarC.n;
            this.A = (Date) vVarC.f128o;
            this.n.g(f6.DEBUG, "Profiler started.", new Object[0]);
            return;
        }
        if (this.x != null && this.x.n) {
            this.n.g(f6.WARNING, "A profile is already running. This profile will be ignored.", new Object[0]);
            return;
        }
        io.sentry.util.a aVar = this.B;
        aVar.e();
        try {
            this.w = null;
            aVar.close();
            this.u.set(false);
        } catch (Throwable th) {
            try {
                aVar.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
