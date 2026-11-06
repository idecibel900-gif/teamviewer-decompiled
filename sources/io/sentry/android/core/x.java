package io.sentry.android.core;

import android.net.TrafficStats;
import android.util.Log;
import io.sentry.f6;
import io.sentry.j5;

/* JADX INFO: loaded from: classes.dex */
public final class x implements io.sentry.u1, g1, io.sentry.g1, io.sentry.logger.c, io.sentry.metrics.b {
    public static final x n = new x(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final x f132o = new x(1);
    public final /* synthetic */ byte m;

    public /* synthetic */ x(byte b) {
        this.m = b;
    }

    @Override // io.sentry.u1
    public void a() {
        TrafficStats.clearThreadStatsTag();
    }

    @Override // io.sentry.g1
    public void b(f6 f6Var, Throwable th, String str, Object... objArr) {
        switch (this.m) {
            case 2:
                if (objArr.length != 0) {
                    d(f6Var, String.format(str, objArr), th);
                } else {
                    d(f6Var, str, th);
                }
                break;
            default:
                if (objArr.length != 0) {
                    d(f6Var, String.format(str, objArr), th);
                } else {
                    d(f6Var, str, th);
                }
                break;
        }
    }

    @Override // io.sentry.logger.c
    public io.sentry.logger.b c(SentryAndroidOptions sentryAndroidOptions, j5 j5Var) {
        n nVar = new n(sentryAndroidOptions, j5Var);
        k0.q.e(nVar);
        return nVar;
    }

    @Override // io.sentry.g1
    public void d(f6 f6Var, String str, Throwable th) {
        switch (this.m) {
            case 2:
                Log.wtf("Sentry", str, th);
                break;
            default:
                int i = l.a[f6Var.ordinal()];
                if (i == 1) {
                    Log.i("Sentry", str, th);
                } else if (i == 2) {
                    Log.w("Sentry", str, th);
                } else if (i == 3) {
                    Log.e("Sentry", str, th);
                } else if (i == 4) {
                    Log.wtf("Sentry", str, th);
                } else {
                    Log.d("Sentry", str, th);
                }
                break;
        }
    }

    @Override // io.sentry.u1
    public void e() {
        TrafficStats.setThreadStatsTag(61441);
    }

    @Override // io.sentry.g1
    public void g(f6 f6Var, String str, Object... objArr) {
        int i = 7;
        switch (this.m) {
            case 2:
                if (objArr.length != 0) {
                    Log.println(7, "Sentry", String.format(str, objArr));
                } else {
                    Log.println(7, "Sentry", str);
                }
                break;
            default:
                if (objArr.length != 0) {
                    int i2 = l.a[f6Var.ordinal()];
                    if (i2 == 1) {
                        i = 4;
                    } else if (i2 == 2) {
                        i = 5;
                    } else if (i2 != 4) {
                        i = 3;
                    }
                    Log.println(i, "Sentry", String.format(str, objArr));
                } else {
                    int i3 = l.a[f6Var.ordinal()];
                    if (i3 == 1) {
                        i = 4;
                    } else if (i3 == 2) {
                        i = 5;
                    } else if (i3 != 4) {
                        i = 3;
                    }
                    Log.println(i, "Sentry", str);
                }
                break;
        }
    }

    @Override // io.sentry.g1
    public boolean i(f6 f6Var) {
        switch (this.m) {
        }
        return true;
    }

    @Override // io.sentry.metrics.b
    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public io.sentry.metrics.a mo21c(SentryAndroidOptions sentryAndroidOptions, j5 j5Var) {
        p pVar = new p(sentryAndroidOptions, j5Var);
        k0.q.e(pVar);
        return pVar;
    }
}
