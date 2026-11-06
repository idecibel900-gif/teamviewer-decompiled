package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.util.Log;
import io.sentry.d5;
import io.sentry.f6;
import io.sentry.j6;
import o.fx3;

/* JADX INFO: loaded from: classes.dex */
public abstract class v0 {
    public static final io.sentry.android.core.util.a a = new io.sentry.android.core.util.a(new io.sentry.h2(11));
    public static final io.sentry.android.core.util.a b = new io.sentry.android.core.util.a(new io.sentry.h2(12));
    public static final io.sentry.android.core.util.a c = new io.sentry.android.core.util.a(new io.sentry.h2(13));
    public static final io.sentry.android.core.util.a d = new io.sentry.android.core.util.a(new io.sentry.h2(14));
    public static final io.sentry.android.core.util.a e = new io.sentry.android.core.util.a(new io.sentry.h2(15));

    public static void a(String str, f6 f6Var, String str2, Throwable th) {
        io.sentry.h hVar = new io.sentry.h();
        hVar.s = "Logcat";
        hVar.p = str2;
        hVar.u = f6Var;
        if (str != null) {
            hVar.d(str, "tag");
        }
        if (th != null && th.getMessage() != null) {
            hVar.d(th.getMessage(), "throwable");
        }
        d5.c().j(hVar);
    }

    public static void b(j6 j6Var, String str, Throwable th) {
        if (d5.c().l().getLogs().a) {
            String message = th != null ? th.getMessage() : null;
            io.sentry.e eVar = new io.sentry.e();
            eVar.a = "auto.log.logcat";
            if (th == null || message == null) {
                d5.c().s().e(j6Var, eVar, str, new Object[0]);
                return;
            }
            io.sentry.logger.a aVarS = d5.c().s();
            if (str != null) {
                message = fx3.g(str, "\n", message);
            }
            aVarS.e(j6Var, eVar, message, new Object[0]);
        }
    }

    public static int c(String str, String str2) {
        a(str, f6.ERROR, str2, null);
        b(j6.ERROR, str2, null);
        return Log.e(str, str2);
    }

    public static int d(String str, String str2, Throwable th) {
        a(str, f6.ERROR, str2, th);
        b(j6.ERROR, str2, th);
        return Log.e(str, str2, th);
    }

    public static String e(io.sentry.g1 g1Var) {
        try {
            return Build.MODEL.split(" ", -1)[0];
        } catch (Throwable th) {
            g1Var.d(f6.ERROR, "Error getting device family.", th);
            return null;
        }
    }

    public static ActivityManager.MemoryInfo f(Context context, io.sentry.g1 g1Var) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo;
            }
            g1Var.g(f6.INFO, "Error getting MemoryInfo.", new Object[0]);
            return null;
        } catch (Throwable th) {
            g1Var.d(f6.ERROR, "Error getting MemoryInfo.", th);
            return null;
        }
    }

    public static PackageInfo g(Context context, q0 q0Var) {
        q0Var.getClass();
        return Build.VERSION.SDK_INT >= 33 ? (PackageInfo) a.a(context) : (PackageInfo) b.a(context);
    }

    public static String h(PackageInfo packageInfo, q0 q0Var) {
        q0Var.getClass();
        return Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
    }

    public static boolean i() {
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            return runningAppProcessInfo.importance == 100;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int j(String str, String str2) {
        a(str, f6.WARNING, str2, null);
        b(j6.WARN, str2, null);
        return Log.w(str, str2);
    }

    public static void k(String str, Exception exc) {
        a(str, f6.WARNING, null, exc);
        b(j6.WARN, null, exc);
        Log.w(str, exc);
    }

    public static void l(String str, String str2, Throwable th) {
        a(str, f6.WARNING, str2, th);
        b(j6.WARN, str2, th);
        Log.w(str, str2, th);
    }

    public static void m(String str, String str2, Exception exc) {
        a(str, f6.ERROR, str2, exc);
        b(j6.FATAL, str2, exc);
        Log.wtf(str, str2, exc);
    }
}
