package io.sentry.android.core;

import android.content.Context;
import android.os.SystemClock;
import android.os.Trace;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.c5;
import io.sentry.d5;
import io.sentry.f6;
import io.sentry.p7;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class e2 {
    public static final long a = SystemClock.uptimeMillis();
    public static final io.sentry.util.a b = new io.sentry.util.a();

    public static void a(SentryAndroidOptions sentryAndroidOptions, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (io.sentry.d2 d2Var : sentryAndroidOptions.getIntegrations()) {
            if (z && (d2Var instanceof FragmentLifecycleIntegration)) {
                arrayList2.add(d2Var);
            }
            if (z2 && (d2Var instanceof SentryTimberIntegration)) {
                arrayList.add(d2Var);
            }
            if (d2Var instanceof SystemEventsBreadcrumbsIntegration) {
                arrayList3.add(d2Var);
            }
        }
        if (arrayList2.size() > 1) {
            for (int i = 0; i < arrayList2.size() - 1; i++) {
                sentryAndroidOptions.getIntegrations().remove((io.sentry.d2) arrayList2.get(i));
            }
        }
        if (arrayList.size() > 1) {
            for (int i2 = 0; i2 < arrayList.size() - 1; i2++) {
                sentryAndroidOptions.getIntegrations().remove((io.sentry.d2) arrayList.get(i2));
            }
        }
        if (arrayList3.size() > 1) {
            for (int i3 = 0; i3 < arrayList3.size() - 1; i3++) {
                sentryAndroidOptions.getIntegrations().remove((io.sentry.d2) arrayList3.get(i3));
            }
        }
    }

    public static void b(Context context, x xVar, c5 c5Var) {
        Trace.beginSection("SentryAndroid.init");
        try {
            try {
                try {
                    io.sentry.util.a aVar = b;
                    aVar.e();
                    try {
                        d5.d(new x((byte) 6), new e(xVar, context, c5Var));
                        io.sentry.n1 n1VarC = d5.c();
                        if (v0.i()) {
                            if (n1VarC.l().isEnableAutoSessionTracking()) {
                                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                                n1VarC.r(new p7(atomicBoolean, (byte) 5));
                                if (!atomicBoolean.get()) {
                                    n1VarC.o();
                                }
                            }
                            n1VarC.l().getReplayController().q(true);
                        }
                        aVar.close();
                        Trace.endSection();
                    } catch (Throwable th) {
                        try {
                            aVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IllegalAccessException e) {
                    xVar.d(f6.FATAL, "Fatal error during SentryAndroid.init(...)", e);
                    throw new RuntimeException("Failed to initialize Sentry's SDK", e);
                } catch (InstantiationException e2) {
                    xVar.d(f6.FATAL, "Fatal error during SentryAndroid.init(...)", e2);
                    throw new RuntimeException("Failed to initialize Sentry's SDK", e2);
                }
            } catch (NoSuchMethodException e3) {
                xVar.d(f6.FATAL, "Fatal error during SentryAndroid.init(...)", e3);
                throw new RuntimeException("Failed to initialize Sentry's SDK", e3);
            } catch (InvocationTargetException e4) {
                xVar.d(f6.FATAL, "Fatal error during SentryAndroid.init(...)", e4);
                throw new RuntimeException("Failed to initialize Sentry's SDK", e4);
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}
