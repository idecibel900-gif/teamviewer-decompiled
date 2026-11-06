package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Looper;
import io.sentry.f5;
import io.sentry.f6;
import io.sentry.g7;
import io.sentry.h5;
import io.sentry.h6;
import io.sentry.i7;
import io.sentry.k6;
import io.sentry.o5;
import io.sentry.v5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public final class y0 implements io.sentry.j0 {
    public final Context a;
    public final q0 b;
    public final SentryAndroidOptions c;
    public final Future d;
    public final io.sentry.util.h e = new io.sentry.util.h(new io.sentry.h2((byte) 16));

    public y0(Context context, q0 q0Var, SentryAndroidOptions sentryAndroidOptions) {
        Future futureSubmit;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext != null ? applicationContext : context;
        this.b = q0Var;
        this.c = sentryAndroidOptions;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new x0());
        try {
            futureSubmit = executorServiceNewSingleThreadExecutor.submit(new o5(this, sentryAndroidOptions, (byte) 5));
        } catch (RejectedExecutionException e) {
            sentryAndroidOptions.getLogger().d(f6.WARNING, "Device info caching task rejected.", e);
            futureSubmit = null;
        }
        this.d = futureSubmit;
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    @Override // io.sentry.j0
    public final i7 a(i7 i7Var, io.sentry.p0 p0Var) {
        boolean zG = g(i7Var, p0Var);
        if (zG) {
            e(i7Var, p0Var);
        }
        f(i7Var, false, zG);
        return i7Var;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    @Override // io.sentry.j0
    public final v5 b(v5 v5Var, io.sentry.p0 p0Var) {
        io.sentry.protocol.c0 c0Var;
        List list;
        boolean z;
        boolean zG = g(v5Var, p0Var);
        if (zG) {
            e(v5Var, p0Var);
            if (v5Var.e() != null) {
                boolean zN = io.sentry.util.b.n(p0Var);
                for (io.sentry.protocol.e0 e0Var : v5Var.e()) {
                    io.sentry.android.core.internal.util.g.a.getClass();
                    Long l = e0Var.m;
                    if (l != null) {
                        long jLongValue = l.longValue();
                        Thread thread = Looper.getMainLooper().getThread();
                        if ((Build.VERSION.SDK_INT >= 36 ? thread.threadId() : thread.getId()) == jLongValue) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    if (e0Var.r == null) {
                        e0Var.r = Boolean.valueOf(z);
                    }
                    if (!zN && e0Var.t == null) {
                        e0Var.t = Boolean.valueOf(z);
                    }
                }
            }
        }
        f(v5Var, true, zG);
        ArrayList arrayListD = v5Var.d();
        if (arrayListD != null && arrayListD.size() > 1) {
            io.sentry.protocol.v vVar = (io.sentry.protocol.v) ua5.j(1, arrayListD);
            if ("java.lang".equals(vVar.f249o) && (c0Var = vVar.q) != null && (list = c0Var.m) != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if ("com.android.internal.os.RuntimeInit$MethodAndArgsCaller".equals(((io.sentry.protocol.a0) it.next()).r)) {
                        Collections.reverse(arrayListD);
                        break;
                    }
                }
            }
        }
        return v5Var;
    }

    @Override // io.sentry.j0
    public final io.sentry.protocol.f0 c(io.sentry.protocol.f0 f0Var, io.sentry.p0 p0Var) {
        boolean zG = g(f0Var, p0Var);
        if (zG) {
            e(f0Var, p0Var);
        }
        f(f0Var, false, zG);
        return f0Var;
    }

    @Override // io.sentry.j0
    public final h6 d(h6 h6Var) {
        SentryAndroidOptions sentryAndroidOptions = this.c;
        try {
            f5 f5Var = f5.STRING;
            h6Var.a("device.brand", new io.sentry.protocol.n(f5Var, (Object) Build.BRAND));
            h6Var.a("device.model", new io.sentry.protocol.n(Build.MODEL, f5Var.apiName()));
            h6Var.a("device.family", new io.sentry.protocol.n(this.e.a(), f5Var.apiName()));
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().d(f6.ERROR, "Failed to retrieve device info", th);
        }
        try {
            f5 f5Var2 = f5.STRING;
            h6Var.a("os.name", new io.sentry.protocol.n(f5Var2, (Object) "Android"));
            h6Var.a("os.version", new io.sentry.protocol.n(Build.VERSION.RELEASE, f5Var2.apiName()));
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().d(f6.ERROR, "Failed to retrieve os system", th2);
        }
        return h6Var;
    }

    public final void e(h5 h5Var, io.sentry.p0 p0Var) {
        PackageInfo packageInfo;
        Boolean bool;
        io.sentry.protocol.a aVarE = h5Var.n.e();
        if (aVarE == null) {
            aVarE = new io.sentry.protocol.a();
        }
        aVarE.q = (String) v0.c.a(this.a);
        io.sentry.android.core.performance.g gVarB = io.sentry.android.core.performance.f.c().b(this.c);
        b1 b1Var = null;
        if (gVarB.d()) {
            k6 k6VarB = gVarB.b();
            aVarE.n = k6VarB == null ? null : new Date((long) (k6VarB.m / 1000000.0d));
        }
        if (!io.sentry.util.b.n(p0Var) && aVarE.w == null && (bool = k0.q.p) != null) {
            aVarE.w = Boolean.valueOf(!bool.booleanValue());
        }
        Context context = this.a;
        SentryAndroidOptions sentryAndroidOptions = this.c;
        io.sentry.g1 logger = sentryAndroidOptions.getLogger();
        q0 q0Var = this.b;
        try {
            q0Var.getClass();
            packageInfo = Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(4096L)) : context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
        } catch (Throwable th) {
            logger.d(f6.ERROR, "Error getting package info.", th);
            packageInfo = null;
        }
        if (packageInfo != null) {
            String strH = v0.h(packageInfo, q0Var);
            if (h5Var.x == null) {
                h5Var.x = strH;
            }
            Future future = this.d;
            if (future != null) {
                try {
                    b1Var = (b1) future.get();
                } catch (Throwable th2) {
                    sentryAndroidOptions.getLogger().d(f6.ERROR, "Failed to retrieve device info", th2);
                }
            } else {
                sentryAndroidOptions.getLogger().g(f6.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            aVarE.m = packageInfo.packageName;
            aVarE.r = packageInfo.versionName;
            aVarE.s = v0.h(packageInfo, q0Var);
            HashMap map = new HashMap();
            String[] strArr = packageInfo.requestedPermissions;
            int[] iArr = packageInfo.requestedPermissionsFlags;
            if (strArr != null && strArr.length > 0 && iArr != null && iArr.length > 0) {
                for (int i = 0; i < strArr.length; i++) {
                    String str = strArr[i];
                    map.put(str.substring(str.lastIndexOf(46) + 1), (iArr[i] & 2) == 2 ? "granted" : "not_granted");
                }
            }
            aVarE.t = map;
            if (b1Var != null) {
                try {
                    u0 u0Var = b1Var.f;
                    if (u0Var != null) {
                        aVarE.x = Boolean.valueOf(u0Var.n);
                        String[] strArr2 = (String[]) u0Var.f127o;
                        if (strArr2 != null) {
                            aVarE.y = Arrays.asList(strArr2);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
        h5Var.n.o(aVarE);
    }

    public final void f(h5 h5Var, boolean z, boolean z2) {
        io.sentry.protocol.i0 i0Var = h5Var.u;
        if (i0Var == null) {
            i0Var = new io.sentry.protocol.i0();
            h5Var.u = i0Var;
        }
        if (i0Var.n == null) {
            i0Var.n = h1.a(this.a);
        }
        String str = i0Var.p;
        SentryAndroidOptions sentryAndroidOptions = this.c;
        if (str == null) {
            io.sentry.s dataCollectionResolver = sentryAndroidOptions.getDataCollectionResolver();
            g7 g7Var = dataCollectionResolver.a;
            Boolean bool = g7Var.getDataCollection().a;
            boolean zIsSendDefaultPii = g7Var.isSendDefaultPii();
            if (bool != null) {
                zIsSendDefaultPii = bool.booleanValue();
            } else if (dataCollectionResolver.b()) {
                zIsSendDefaultPii = true;
            }
            if (zIsSendDefaultPii) {
                i0Var.p = "{{auto}}";
            }
        }
        io.sentry.protocol.e eVar = h5Var.n;
        io.sentry.protocol.h hVarF = eVar.f();
        Future future = this.d;
        if (hVarF == null) {
            if (future != null) {
                try {
                    eVar.q(((b1) future.get()).a(z, z2));
                } catch (Throwable th) {
                    sentryAndroidOptions.getLogger().d(f6.ERROR, "Failed to retrieve device info", th);
                }
            } else {
                sentryAndroidOptions.getLogger().g(f6.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            io.sentry.protocol.q qVarH = eVar.h();
            if (future != null) {
                try {
                    eVar.t(((b1) future.get()).g);
                } catch (Throwable th2) {
                    sentryAndroidOptions.getLogger().d(f6.ERROR, "Failed to retrieve os system", th2);
                }
            } else {
                sentryAndroidOptions.getLogger().g(f6.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            if (qVarH != null) {
                String str2 = qVarH.m;
                eVar.l(qVarH, (str2 == null || str2.isEmpty()) ? "os_1" : "os_" + str2.trim().toLowerCase(Locale.ROOT));
            }
        }
        if (future == null) {
            sentryAndroidOptions.getLogger().g(f6.ERROR, "Failed to retrieve device info", new Object[0]);
            return;
        }
        try {
            t0 t0Var = ((b1) future.get()).e;
            if (t0Var != null) {
                HashMap map = new HashMap();
                map.put("isSideLoaded", String.valueOf(t0Var.a));
                String str3 = t0Var.b;
                if (str3 != null) {
                    map.put("installerStore", str3);
                }
                for (Map.Entry entry : map.entrySet()) {
                    h5Var.b((String) entry.getKey(), (String) entry.getValue());
                }
            }
        } catch (Throwable th3) {
            sentryAndroidOptions.getLogger().d(f6.ERROR, "Error getting side loaded info.", th3);
        }
    }

    public final boolean g(h5 h5Var, io.sentry.p0 p0Var) {
        if (io.sentry.util.b.x(p0Var)) {
            return true;
        }
        this.c.getLogger().g(f6.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", h5Var.m);
        return false;
    }
}
