package o;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class we4 implements gc8 {
    public static final Object n = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static volatile we4 f2403o;
    public final byte m;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ we4(int i) {
        this.m = i;
    }

    public static we4 f() {
        we4 we4Var;
        synchronized (n) {
            try {
                if (f2403o == null) {
                    f2403o = new we4(3);
                }
                we4Var = f2403o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return we4Var;
    }

    public static String i(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public void c(String str, String str2) {
        if (this.m <= 3) {
            Log.d(str, str2);
        }
    }

    public void d(String str, String str2) {
        if (this.m <= 6) {
            io.sentry.android.core.v0.c(str, str2);
        }
    }

    public void e(String str, String str2, Throwable th) {
        if (this.m <= 6) {
            io.sentry.android.core.v0.d(str, str2, th);
        }
    }

    public void g(String str, String str2) {
        if (this.m <= 4) {
            Log.i(str, str2);
        }
    }

    @Override // o.ec8
    public qo h(long j, qo qoVar, qo qoVar2, qo qoVar3) {
        return qoVar3;
    }

    public void j(String str, String str2) {
        if (this.m <= 5) {
            io.sentry.android.core.v0.j(str, str2);
        }
    }

    public void k(String str, String str2, Exception exc) {
        if (this.m <= 5) {
            io.sentry.android.core.v0.l(str, str2, exc);
        }
    }

    @Override // o.gc8
    public int n() {
        return this.m;
    }

    @Override // o.ec8
    public qo u(long j, qo qoVar, qo qoVar2, qo qoVar3) {
        return j < ((long) this.m) * 1000000 ? qoVar : qoVar2;
    }

    @Override // o.gc8
    public int v() {
        return 0;
    }
}
