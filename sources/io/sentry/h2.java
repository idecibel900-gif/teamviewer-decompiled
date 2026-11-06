package io.sentry;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.SystemClock;
import androidx.core.app.FrameMetricsAggregator;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.IOException;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import o.ep1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h2 implements j2, io.sentry.util.g, n4, io.sentry.transport.f, c5, r4 {
    public final /* synthetic */ byte m;

    public /* synthetic */ h2(byte b) {
        this.m = b;
    }

    public static /* synthetic */ void f() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void g(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void h(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void j(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void l(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void m(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    @Override // io.sentry.n4
    public void a(u7 u7Var) {
    }

    @Override // io.sentry.j2
    public Object b() {
        return null;
    }

    @Override // io.sentry.transport.f
    public long c() {
        return SystemClock.uptimeMillis();
    }

    public Object d(Context context) {
        String string = null;
        switch (this.m) {
            case 11:
                try {
                    return context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
                } catch (Throwable unused) {
                    return null;
                }
            case ep1.d /* 12 */:
                try {
                    return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                } catch (Throwable unused2) {
                    return null;
                }
            case 13:
                try {
                    ApplicationInfo applicationInfo = context.getApplicationInfo();
                    int i = applicationInfo.labelRes;
                    if (i == 0) {
                        CharSequence charSequence = applicationInfo.nonLocalizedLabel;
                        string = charSequence != null ? charSequence.toString() : context.getPackageManager().getApplicationLabel(applicationInfo).toString();
                    } else {
                        string = context.getString(i);
                    }
                    break;
                } catch (Throwable unused3) {
                }
                return string;
            case 14:
                try {
                    return context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L));
                } catch (Throwable unused4) {
                    return null;
                }
            default:
                try {
                    return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                } catch (Throwable unused5) {
                    return null;
                }
        }
    }

    @Override // io.sentry.util.g
    public Object e() {
        switch (this.m) {
            case 2:
                return g7.empty();
            case 3:
                return g7.empty();
            case 7:
                return new g5();
            case ep1.b /* 9 */:
                return new FrameMetricsAggregator();
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                try {
                    return Build.MODEL.split(" ", -1)[0];
                } catch (Throwable unused) {
                    f6 f6Var = f6.DEBUG;
                    return null;
                }
            default:
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                for (io.sentry.clientreport.d dVar : io.sentry.clientreport.d.values()) {
                    for (q qVar : q.values()) {
                        concurrentHashMap.put(new io.sentry.clientreport.c(dVar.getReason(), qVar.getCategory()), new AtomicLong(0L));
                    }
                }
                return Collections.unmodifiableMap(concurrentHashMap);
        }
    }

    @Override // io.sentry.r4
    public void i(l1 l1Var) {
        switch (this.m) {
            case 22:
                l1Var.getClass();
                l1Var.k(io.sentry.protocol.w.n);
                break;
            default:
                l1Var.F(new p7(l1Var, (byte) 16));
                break;
        }
    }

    @Override // io.sentry.c5
    public void k(SentryAndroidOptions sentryAndroidOptions) {
    }
}
