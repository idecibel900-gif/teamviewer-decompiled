package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.d8;
import io.sentry.e5;
import io.sentry.f6;
import io.sentry.g7;
import io.sentry.h4;
import io.sentry.p7;
import io.sentry.y5;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public final class SentryPerformanceProvider extends c1 {
    public static final long q = SystemClock.uptimeMillis();
    public static final /* synthetic */ int r = 0;
    public Application n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final io.sentry.g1 f94o;
    public final q0 p;

    public SentryPerformanceProvider() {
        x xVar = new x((byte) 3);
        this.f94o = xVar;
        this.p = new q0(xVar);
    }

    public final void a(Context context, e5 e5Var, io.sentry.android.core.performance.f fVar) {
        boolean z = e5Var.u;
        io.sentry.g1 g1Var = this.f94o;
        if (!z) {
            g1Var.g(f6.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
            return;
        }
        i iVar = new i(this.p, new io.sentry.android.core.internal.util.t(context.getApplicationContext(), g1Var, this.p), this.f94o, e5Var.q, e5Var.t, new p7(new y5(), (byte) 6));
        fVar.u = null;
        fVar.v = iVar;
        g1Var.g(f6.DEBUG, "App start continuous profiling started.", new Object[0]);
        g7 g7VarEmpty = g7.empty();
        g7VarEmpty.setProfileSessionSampleRate(Double.valueOf(e5Var.u ? 1.0d : 0.0d));
        iVar.d(e5Var.y, new d8(g7VarEmpty));
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        if (SentryPerformanceProvider.class.getName().equals(providerInfo.authority)) {
            hk0.l("An applicationId is required to fulfill the manifest placeholder.");
        } else {
            super.attachInfo(context, providerInfo);
        }
    }

    public final void b(Context context, e5 e5Var, io.sentry.android.core.performance.f fVar) {
        boolean z = e5Var.f191o;
        h4 h4Var = new h4(Boolean.valueOf(z), e5Var.p, (Double) null, Boolean.valueOf(e5Var.m), e5Var.n);
        fVar.w = h4Var;
        boolean zBooleanValue = ((Boolean) h4Var.d).booleanValue();
        io.sentry.g1 g1Var = this.f94o;
        if (!zBooleanValue || !z) {
            g1Var.g(f6.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
            return;
        }
        y5 y5Var = new y5();
        q0 q0Var = this.p;
        y yVar = new y(context, q0Var, new io.sentry.android.core.internal.util.t(context, g1Var, q0Var), this.f94o, e5Var.q, e5Var.r, e5Var.t, new p7(y5Var, (byte) 6));
        fVar.v = null;
        fVar.u = yVar;
        g1Var.g(f6.DEBUG, "App start profiling started.", new Object[0]);
        yVar.start();
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.Reader] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.BufferedReader, java.io.Reader] */
    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        ?? CanRead;
        e5 e5VarB;
        io.sentry.android.core.performance.f.e(this);
        io.sentry.android.core.performance.f fVarC = io.sentry.android.core.performance.f.c();
        Context context = getContext();
        fVarC.q.f(q);
        this.p.getClass();
        fVarC.p.f(Process.getStartUptimeMillis());
        if (context instanceof Application) {
            this.n = (Application) context;
        }
        Application application = this.n;
        if (application != null) {
            fVarC.h(application);
        }
        Context context2 = getContext();
        io.sentry.g1 g1Var = this.f94o;
        if (context2 == null) {
            g1Var.g(f6.FATAL, "App. Context from ContentProvider is null", new Object[0]);
        } else {
            File file = new File(new File(context2.getCacheDir(), "sentry"), "app_start_profiling_config");
            if (file.exists() && (CanRead = file.canRead()) != 0) {
                try {
                    try {
                        CanRead = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                        try {
                            io.sentry.r2 r2Var = new io.sentry.r2(CanRead);
                            try {
                                e5VarB = io.sentry.g.b(r2Var, g1Var);
                                r2Var.close();
                                if (e5VarB == null) {
                                    g1Var.g(f6.WARNING, "Unable to deserialize the SentryAppStartProfilingOptions. App start profiling will not start.", new Object[0]);
                                } else if (Build.VERSION.SDK_INT >= 35) {
                                    g1Var.g(f6.DEBUG, "Device is API 35+. Skipping legacy app-start profiling — Perfetto ProfilingManager will be initialized after Sentry.init().", new Object[0]);
                                } else if (!e5VarB.x) {
                                    g1Var.g(f6.WARNING, "enableLegacyProfiling is disabled and device is below API 35. App start profiling will not start.", new Object[0]);
                                } else if (e5VarB.s && e5VarB.w) {
                                    a(context2, e5VarB, fVarC);
                                } else if (!e5VarB.r) {
                                    g1Var.g(f6.INFO, "Profiling is not enabled. App start profiling will not start.", new Object[0]);
                                } else if (e5VarB.v) {
                                    b(context2, e5VarB, fVarC);
                                }
                                CanRead.close();
                            } catch (Throwable th) {
                                try {
                                    r2Var.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Exception e) {
                            g1Var.d(f6.ERROR, "Error when deserializing", e);
                            e5VarB = null;
                        }
                    } catch (Throwable th3) {
                        try {
                            CanRead.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (FileNotFoundException e2) {
                    g1Var.d(f6.ERROR, "App start profiling config file not found. ", e2);
                } catch (Throwable th5) {
                    g1Var.d(f6.ERROR, "Error reading app start profiling config file. ", th5);
                }
            }
        }
        io.sentry.android.core.performance.f.f(this);
        return true;
    }

    @Override // android.content.ContentProvider
    public final void shutdown() {
        io.sentry.util.a aVar = io.sentry.android.core.performance.f.M;
        aVar.e();
        try {
            y yVar = io.sentry.android.core.performance.f.c().u;
            if (yVar != null) {
                yVar.close();
            }
            i iVar = io.sentry.android.core.performance.f.c().v;
            if (iVar != null) {
                iVar.a(true);
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

    public SentryPerformanceProvider(io.sentry.g1 g1Var, q0 q0Var) {
        this.f94o = g1Var;
        this.p = q0Var;
    }
}
