package io.sentry.android.core;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import io.sentry.d5;
import io.sentry.f6;
import io.sentry.v5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o.z3;

/* JADX INFO: loaded from: classes.dex */
public final class p0 implements Runnable {
    public final Context m;
    public final SentryAndroidOptions n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final o0 f121o;
    public final long p;

    public p0(Context context, SentryAndroidOptions sentryAndroidOptions, o0 o0Var) {
        Context applicationContext = context.getApplicationContext();
        this.m = applicationContext != null ? applicationContext : context;
        this.n = sentryAndroidOptions;
        this.f121o = o0Var;
        this.p = System.currentTimeMillis() - 7862400000L;
    }

    public final void a(ApplicationExitInfo applicationExitInfo, boolean z) {
        o0 o0Var = this.f121o;
        io.sentry.o oVarI = o0Var.i(applicationExitInfo, z);
        if (oVarI == null) {
            return;
        }
        io.sentry.p0 p0Var = (io.sentry.p0) oVarI.c;
        v5 v5Var = (v5) oVarI.b;
        boolean zEquals = d5.c().B(v5Var, p0Var).equals(io.sentry.protocol.w.n);
        SentryAndroidOptions sentryAndroidOptions = this.n;
        if (!zEquals) {
            if (((io.sentry.hints.c) oVarI.d).d()) {
                return;
            }
            sentryAndroidOptions.getLogger().g(f6.WARNING, "Timed out waiting to flush %s event to disk. Event: %s", o0Var.c(), v5Var.m);
        } else if (Boolean.TRUE.equals(p0Var.c(Boolean.class, "sentry:captureFailed"))) {
            sentryAndroidOptions.getLogger().g(f6.DEBUG, "Capturing the %s event failed, leaving the exit for the next app start.", o0Var.c());
        } else {
            sentryAndroidOptions.getLogger().g(f6.DEBUG, "%s event was dropped, marking the exit as reported.", o0Var.c());
            o0Var.E(applicationExitInfo.getTimestamp());
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ApplicationExitInfo applicationExitInfoD;
        ActivityManager activityManager = (ActivityManager) this.m.getSystemService("activity");
        SentryAndroidOptions sentryAndroidOptions = this.n;
        if (activityManager == null) {
            sentryAndroidOptions.getLogger().g(f6.ERROR, "Failed to retrieve ActivityManager.", new Object[0]);
            return;
        }
        List historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.isEmpty()) {
            sentryAndroidOptions.getLogger().g(f6.DEBUG, "No records in historical exit reasons.", new Object[0]);
            return;
        }
        io.sentry.cache.d envelopeDiskCache = sentryAndroidOptions.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof io.sentry.cache.c) && sentryAndroidOptions.isEnableAutoSessionTracking()) {
            io.sentry.cache.c cVar = (io.sentry.cache.c) envelopeDiskCache;
            if (!cVar.h()) {
                sentryAndroidOptions.getLogger().g(f6.WARNING, "Timed out waiting to flush previous session to its own file.", new Object[0]);
                cVar.q.countDown();
            }
        }
        ArrayList arrayList = new ArrayList(historicalProcessExitReasons.size());
        Iterator it = historicalProcessExitReasons.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoD2 = z3.d(it.next());
            if (applicationExitInfoD2 != null) {
                arrayList.add(applicationExitInfoD2);
            }
        }
        o0 o0Var = this.f121o;
        Long lB = o0Var.b();
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                applicationExitInfoD = null;
                break;
            }
            applicationExitInfoD = z3.d(it2.next());
            if (o0Var.a(applicationExitInfoD)) {
                it2.remove();
                break;
            }
        }
        if (applicationExitInfoD == null) {
            sentryAndroidOptions.getLogger().g(f6.DEBUG, "No %ss have been found in the historical exit reasons list.", o0Var.c());
            return;
        }
        long timestamp = applicationExitInfoD.getTimestamp();
        long j = this.p;
        if (timestamp < j) {
            sentryAndroidOptions.getLogger().g(f6.DEBUG, "Latest %s happened too long ago, returning early.", o0Var.c());
            return;
        }
        if (lB != null && applicationExitInfoD.getTimestamp() <= lB.longValue()) {
            sentryAndroidOptions.getLogger().g(f6.DEBUG, "Latest %s has already been reported, returning early.", o0Var.c());
            return;
        }
        if (o0Var.d()) {
            Collections.reverse(arrayList);
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ApplicationExitInfo applicationExitInfoD3 = z3.d(it3.next());
                if (o0Var.a(applicationExitInfoD3)) {
                    if (applicationExitInfoD3.getTimestamp() < j) {
                        sentryAndroidOptions.getLogger().g(f6.DEBUG, "%s happened too long ago %s.", o0Var.c(), applicationExitInfoD3);
                    } else if (lB == null || applicationExitInfoD3.getTimestamp() > lB.longValue()) {
                        a(applicationExitInfoD3, false);
                    } else {
                        sentryAndroidOptions.getLogger().g(f6.DEBUG, "%s has already been reported %s.", o0Var.c(), applicationExitInfoD3);
                    }
                }
            }
        }
        a(applicationExitInfoD, true);
    }
}
