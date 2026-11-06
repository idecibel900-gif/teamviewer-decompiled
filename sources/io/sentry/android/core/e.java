package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Process;
import io.sentry.a3;
import io.sentry.b3;
import io.sentry.c3;
import io.sentry.c5;
import io.sentry.compose.gestures.ComposeGestureTargetLocator;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import io.sentry.d3;
import io.sentry.f6;
import io.sentry.i3;
import io.sentry.o4;
import io.sentry.p6;
import io.sentry.p7;
import io.sentry.q3;
import io.sentry.t4;
import io.sentry.v3;
import java.io.File;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements o4, c5 {
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f103o;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3) {
        this.m = obj;
        this.n = obj2;
        this.f103o = obj3;
    }

    @Override // io.sentry.o4
    public void e(io.sentry.x1 x1Var) {
        ActivityLifecycleIntegration activityLifecycleIntegration = (ActivityLifecycleIntegration) this.m;
        io.sentry.l1 l1Var = (io.sentry.l1) this.n;
        io.sentry.x1 x1Var2 = (io.sentry.x1) this.f103o;
        if (x1Var == null) {
            l1Var.J(x1Var2);
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.p;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().g(f6.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", x1Var2.getName());
        }
    }

    @Override // io.sentry.c5
    public void k(SentryAndroidOptions sentryAndroidOptions) {
        boolean z;
        io.sentry.g1 g1Var = (x) this.m;
        Context context = (Context) this.n;
        c5 c5Var = (c5) this.f103o;
        boolean zB = io.sentry.util.i.b(sentryAndroidOptions, "timber.log.Timber");
        boolean z2 = io.sentry.util.i.b(sentryAndroidOptions, "androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks") && io.sentry.util.i.b(sentryAndroidOptions, "io.sentry.android.fragment.FragmentLifecycleIntegration");
        boolean z3 = zB && io.sentry.util.i.b(sentryAndroidOptions, "io.sentry.android.timber.SentryTimberIntegration");
        boolean zB2 = io.sentry.util.i.b(sentryAndroidOptions, "io.sentry.android.replay.ReplayIntegration");
        boolean zB3 = io.sentry.util.i.b(sentryAndroidOptions, "io.sentry.android.distribution.DistributionIntegration");
        q0 q0Var = new q0(g1Var);
        io.sentry.util.i iVar = new io.sentry.util.i();
        w0 w0Var = new w0();
        d dVar = new d();
        dVar.p = new ConcurrentHashMap();
        dVar.q = new WeakHashMap();
        dVar.s = new io.sentry.util.a();
        dVar.n = new io.sentry.util.h(new p7(iVar, sentryAndroidOptions.getLogger(), (byte) 15));
        dVar.m = new io.sentry.util.h(new io.sentry.h2((byte) 9));
        dVar.f100o = sentryAndroidOptions;
        dVar.r = w0Var;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        sentryAndroidOptions.setLogger(g1Var);
        sentryAndroidOptions.setFatalLogger(new x((byte) 2));
        sentryAndroidOptions.setDefaultScopeType(t4.CURRENT);
        sentryAndroidOptions.setOpenTelemetryMode(p6.OFF);
        sentryAndroidOptions.setDateProvider(new f2());
        sentryAndroidOptions.getLogs().b = new x((byte) 4);
        sentryAndroidOptions.getMetrics().b = new x((byte) 5);
        sentryAndroidOptions.setFlushTimeoutMillis(4000L);
        sentryAndroidOptions.setFrameMetricsCollector(new io.sentry.android.core.internal.util.t(applicationContext, g1Var, q0Var));
        j1.a(applicationContext, q0Var, sentryAndroidOptions);
        sentryAndroidOptions.setCacheDirPath(new File(applicationContext.getCacheDir(), "sentry").getAbsolutePath());
        io.sentry.android.core.anr.e.a.set(true);
        PackageInfo packageInfoG = v0.g(applicationContext, q0Var);
        if (packageInfoG != null) {
            if (sentryAndroidOptions.getRelease() == null) {
                sentryAndroidOptions.setRelease(packageInfoG.packageName + "@" + packageInfoG.versionName + "+" + v0.h(packageInfoG, q0Var));
            }
            String str = packageInfoG.packageName;
            if (str != null && !str.startsWith("android.")) {
                sentryAndroidOptions.addInAppInclude(str);
            }
        }
        if (sentryAndroidOptions.getDistinctId() == null) {
            try {
                sentryAndroidOptions.setDistinctId(h1.a(applicationContext));
            } catch (RuntimeException e) {
                sentryAndroidOptions.getLogger().d(f6.ERROR, "Could not generate distinct Id.", e);
            }
        }
        k0 k0Var = k0.q;
        if (k0Var.n == null) {
            io.sentry.util.a aVar = k0Var.m;
            aVar.e();
            try {
                k0Var.q(sentryAndroidOptions.getLogger());
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
        sentryAndroidOptions.activate();
        s.a(context, sentryAndroidOptions, q0Var, iVar, dVar, z2, z3, zB2, zB3);
        boolean z4 = z2;
        try {
            c5Var.k(sentryAndroidOptions);
        } catch (Throwable th3) {
            sentryAndroidOptions.getLogger().d(f6.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th3);
        }
        io.sentry.android.core.performance.f fVarC = io.sentry.android.core.performance.f.c();
        if (sentryAndroidOptions.isEnablePerformanceV2()) {
            io.sentry.android.core.performance.g gVar = fVarC.p;
            if (gVar.f123o == 0) {
                gVar.f(Process.getStartUptimeMillis());
            }
        }
        if (context.getApplicationContext() instanceof Application) {
            fVarC.h((Application) context.getApplicationContext());
        }
        io.sentry.android.core.performance.g gVar2 = fVarC.q;
        if (gVar2.f123o == 0) {
            gVar2.f(e2.a);
        }
        if (sentryAndroidOptions.getCacheDirPath() != null && (sentryAndroidOptions.getEnvelopeDiskCache() instanceof io.sentry.transport.i)) {
            sentryAndroidOptions.setEnvelopeDiskCache(new io.sentry.android.core.cache.b(sentryAndroidOptions));
        }
        if (sentryAndroidOptions.getConnectionStatusProvider() instanceof c3) {
            sentryAndroidOptions.setConnectionStatusProvider(new io.sentry.android.core.internal.util.c(context, sentryAndroidOptions, q0Var, sentryAndroidOptions.getMonotonicTicker()));
        }
        if (sentryAndroidOptions.getCacheDirPath() != null) {
            sentryAndroidOptions.addScopeObserver(new io.sentry.cache.g(sentryAndroidOptions));
            sentryAndroidOptions.addOptionsObserver(new io.sentry.cache.e(sentryAndroidOptions));
            PackageInfo packageInfoG2 = v0.g(context, q0Var);
            if (packageInfoG2 != null) {
                long j = packageInfoG2.lastUpdateTime;
                if (j > 0) {
                    sentryAndroidOptions.addOptionsObserver(new c2(sentryAndroidOptions, j));
                }
            }
        }
        sentryAndroidOptions.addEventProcessor(new io.sentry.t(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new y0(context, q0Var, sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new b2(sentryAndroidOptions, dVar));
        sentryAndroidOptions.addEventProcessor(new ScreenshotEventProcessor(sentryAndroidOptions, q0Var, zB2));
        sentryAndroidOptions.addEventProcessor(new ViewHierarchyEventProcessor(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new n0(context, q0Var, sentryAndroidOptions));
        if (sentryAndroidOptions.getTransportGate() instanceof io.sentry.transport.k) {
            sentryAndroidOptions.setTransportGate(new a0(sentryAndroidOptions, (byte) 0));
        }
        io.sentry.android.core.performance.f fVarC2 = io.sentry.android.core.performance.f.c();
        sentryAndroidOptions.setAppStartExtender(fVarC2.J);
        if (sentryAndroidOptions.getModulesLoader() instanceof io.sentry.internal.modules.e) {
            sentryAndroidOptions.setModulesLoader(new io.sentry.internal.modules.f(context, sentryAndroidOptions));
        }
        if (sentryAndroidOptions.getDebugMetaLoader() instanceof io.sentry.internal.debugmeta.b) {
            sentryAndroidOptions.setDebugMetaLoader(new io.sentry.internal.debugmeta.c(context, sentryAndroidOptions.getLogger()));
        }
        if (sentryAndroidOptions.getVersionDetector() instanceof v3) {
            sentryAndroidOptions.setVersionDetector(new io.sentry.a0(sentryAndroidOptions, (byte) 0));
        }
        io.sentry.util.h hVar = new io.sentry.util.h(new q(iVar, sentryAndroidOptions));
        boolean zB4 = io.sentry.util.i.b(sentryAndroidOptions, "androidx.compose.ui.node.Owner");
        if (sentryAndroidOptions.getGestureTargetLocators().isEmpty()) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new io.sentry.android.core.internal.gestures.a(hVar));
            if (zB4 && io.sentry.util.i.b(sentryAndroidOptions, "io.sentry.compose.gestures.ComposeGestureTargetLocator")) {
                arrayList.add(new ComposeGestureTargetLocator(sentryAndroidOptions.getLogger()));
            }
            sentryAndroidOptions.setGestureTargetLocators(arrayList);
        }
        if (sentryAndroidOptions.getViewHierarchyExporters().isEmpty() && zB4 && io.sentry.util.i.b(sentryAndroidOptions, "io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter")) {
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(new ComposeViewHierarchyExporter(sentryAndroidOptions.getLogger()));
            sentryAndroidOptions.setViewHierarchyExporters(arrayList2);
        }
        if (sentryAndroidOptions.getThreadChecker() instanceof io.sentry.util.thread.b) {
            sentryAndroidOptions.setThreadChecker(io.sentry.android.core.internal.util.g.a);
        }
        if (sentryAndroidOptions.getSocketTagger() instanceof q3) {
            sentryAndroidOptions.setSocketTagger(x.n);
        }
        if (sentryAndroidOptions.getPerformanceCollectors().isEmpty()) {
            sentryAndroidOptions.addPerformanceCollector(new o());
            io.sentry.g1 logger = sentryAndroidOptions.getLogger();
            j jVar = new j();
            jVar.a = 0L;
            jVar.b = 0L;
            jVar.c = 1L;
            jVar.d = false;
            io.sentry.util.b.v(logger, "Logger is required.");
            sentryAndroidOptions.addPerformanceCollector(jVar);
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                io.sentry.android.core.internal.util.t frameMetricsCollector = sentryAndroidOptions.getFrameMetricsCollector();
                io.sentry.util.b.v(frameMetricsCollector, "options.getFrameMetricsCollector is required");
                sentryAndroidOptions.addPerformanceCollector(new u2(sentryAndroidOptions, frameMetricsCollector));
            }
        }
        if (sentryAndroidOptions.getCompositePerformanceCollector() instanceof b3) {
            sentryAndroidOptions.setCompositePerformanceCollector(new io.sentry.x(sentryAndroidOptions));
        }
        if (zB2 && (sentryAndroidOptions.getReplayController().getY() instanceof i3)) {
            sentryAndroidOptions.getReplayController().G(new io.sentry.android.replay.d(sentryAndroidOptions));
        }
        io.sentry.util.a aVar2 = io.sentry.android.core.performance.f.M;
        aVar2.e();
        try {
            io.sentry.y1 y1Var = fVarC2.u;
            i iVar2 = fVarC2.v;
            fVarC2.u = null;
            fVarC2.v = null;
            aVar2.close();
            io.sentry.p compositePerformanceCollector = sentryAndroidOptions.getCompositePerformanceCollector();
            io.sentry.y1 y1Var2 = a3.q;
            if (sentryAndroidOptions.isProfilingEnabled() || sentryAndroidOptions.getProfilesSampleRate() != null) {
                sentryAndroidOptions.setContinuousProfiler(d3.m);
                if (sentryAndroidOptions.isEnableLegacyProfiling()) {
                    if (iVar2 != null) {
                        iVar2.a(true);
                    }
                    if (y1Var != null) {
                        sentryAndroidOptions.setTransactionProfiler(y1Var);
                    } else {
                        boolean z5 = z3;
                        io.sentry.android.core.internal.util.t frameMetricsCollector2 = sentryAndroidOptions.getFrameMetricsCollector();
                        io.sentry.util.b.v(frameMetricsCollector2, "options.getFrameMetricsCollector is required");
                        z = z5;
                        sentryAndroidOptions.setTransactionProfiler(new y(context, q0Var, frameMetricsCollector2, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.isProfilingEnabled(), sentryAndroidOptions.getProfilingTracesHz(), new q(sentryAndroidOptions, (byte) 4)));
                    }
                    e2.a(sentryAndroidOptions, z4, z);
                }
                sentryAndroidOptions.getLogger().g(f6.WARNING, "Transaction-based profiling (profilesSampleRate/profilesSampler) is disabled because enableLegacyProfiling is false. Transaction-based profiling always uses the legacy profiler and is not supported by Perfetto. No profiling data will be collected. Use profileSessionSampleRate for continuous profiling instead.", new Object[0]);
                sentryAndroidOptions.setTransactionProfiler(y1Var2);
                if (y1Var != null) {
                    y1Var.close();
                }
                if (iVar2 != null) {
                    iVar2.a(true);
                }
            } else {
                sentryAndroidOptions.setTransactionProfiler(y1Var2);
                if (y1Var != null) {
                    y1Var.close();
                }
                if (iVar2 != null) {
                    sentryAndroidOptions.setContinuousProfiler(iVar2);
                    io.sentry.protocol.w wVar = iVar2.A;
                    if (iVar2.u && !wVar.equals(io.sentry.protocol.w.n)) {
                        compositePerformanceCollector.a(wVar.a());
                    }
                } else {
                    io.sentry.android.core.internal.util.t frameMetricsCollector3 = sentryAndroidOptions.getFrameMetricsCollector();
                    io.sentry.util.b.v(frameMetricsCollector3, "options.getFrameMetricsCollector is required");
                    if (Build.VERSION.SDK_INT >= 35) {
                        Context applicationContext2 = context.getApplicationContext();
                        if (applicationContext2 == null) {
                            applicationContext2 = context;
                        }
                        sentryAndroidOptions.setContinuousProfiler(new w1(sentryAndroidOptions.getLogger(), frameMetricsCollector3, new q(sentryAndroidOptions, (byte) 0), new r(applicationContext2, sentryAndroidOptions)));
                        io.sentry.util.b.a("PerfettoContinuousProfiling");
                    } else if (sentryAndroidOptions.isEnableLegacyProfiling()) {
                        sentryAndroidOptions.setContinuousProfiler(new i(q0Var, frameMetricsCollector3, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.getProfilingTracesHz(), new q(sentryAndroidOptions, (byte) 1)));
                    } else {
                        sentryAndroidOptions.getLogger().g(f6.WARNING, "enableLegacyProfiling is disabled and device is below API 35. No profiling data will be collected.", new Object[0]);
                    }
                }
            }
            z = z3;
            e2.a(sentryAndroidOptions, z4, z);
        } catch (Throwable th4) {
            try {
                aVar2.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }
}
