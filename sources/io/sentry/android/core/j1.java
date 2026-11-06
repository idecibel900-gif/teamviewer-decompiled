package io.sentry.android.core;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import io.sentry.a6;
import io.sentry.d6;
import io.sentry.e4;
import io.sentry.f6;
import io.sentry.k7;
import io.sentry.x4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import o.fx3;

/* JADX INFO: loaded from: classes.dex */
public abstract class j1 {
    public static final HashMap a;

    static {
        HashMap map = new HashMap();
        map.put("io.sentry.dsn", "");
        map.put("io.sentry.gradle-plugin-integrations", "AppStartInstrumentation,ComposeInstrumentation,DatabaseInstrumentation,FileIOInstrumentation,LogcatInstrumentation,OkHttpInstrumentation,SourceContext");
        a = map;
    }

    public static void a(Context context, q0 q0Var, SentryAndroidOptions sentryAndroidOptions) {
        List listH;
        List listH2;
        List listH3;
        List listH4;
        try {
            sentryAndroidOptions.getLogger();
            Cloneable cloneable = a;
            if (cloneable == null) {
                ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? (ApplicationInfo) v0.d.a(context) : (ApplicationInfo) v0.e.a(context);
                cloneable = applicationInfo != null ? applicationInfo.metaData : null;
            }
            io.sentry.g1 logger = sentryAndroidOptions.getLogger();
            if (cloneable != null) {
                sentryAndroidOptions.setDebug(d(cloneable, logger, "io.sentry.debug", sentryAndroidOptions.isDebug()));
                if (sentryAndroidOptions.isDebug()) {
                    String strName = sentryAndroidOptions.getDiagnosticLevel().name();
                    Locale locale = Locale.ROOT;
                    String strJ = j(cloneable, logger, "io.sentry.debug.level", strName.toLowerCase(locale));
                    if (strJ != null) {
                        sentryAndroidOptions.setDiagnosticLevel(f6.valueOf(strJ.toUpperCase(locale)));
                    }
                }
                sentryAndroidOptions.setAnrEnabled(d(cloneable, logger, "io.sentry.anr.enable", sentryAndroidOptions.isAnrEnabled()));
                sentryAndroidOptions.setTombstoneEnabled(d(cloneable, logger, "io.sentry.tombstone.enable", sentryAndroidOptions.isTombstoneEnabled()));
                sentryAndroidOptions.setAttachRawTombstone(d(cloneable, logger, "io.sentry.tombstone.attach-raw", sentryAndroidOptions.isAttachRawTombstone()));
                sentryAndroidOptions.setReportHistoricalTombstones(d(cloneable, logger, "io.sentry.tombstone.report-historical", sentryAndroidOptions.isReportHistoricalTombstones()));
                sentryAndroidOptions.setMemoryLimiterEnabled(d(cloneable, logger, "io.sentry.memory-limiter.enable", sentryAndroidOptions.isMemoryLimiterEnabled()));
                sentryAndroidOptions.setReportHistoricalMemoryLimiterExits(d(cloneable, logger, "io.sentry.memory-limiter.report-historical", sentryAndroidOptions.isReportHistoricalMemoryLimiterExits()));
                sentryAndroidOptions.setEnableAutoSessionTracking(d(cloneable, logger, "io.sentry.auto-session-tracking.enable", sentryAndroidOptions.isEnableAutoSessionTracking()));
                if (sentryAndroidOptions.getSampleRate() == null) {
                    double dF = f(cloneable, logger, "io.sentry.sample-rate");
                    if (dF != -1.0d) {
                        sentryAndroidOptions.setSampleRate(Double.valueOf(dF));
                    }
                }
                sentryAndroidOptions.setAnrReportInDebug(d(cloneable, logger, "io.sentry.anr.report-debug", sentryAndroidOptions.isAnrReportInDebug()));
                sentryAndroidOptions.setAnrTimeoutIntervalMillis(i(cloneable, logger, "io.sentry.anr.timeout-interval-millis", sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                sentryAndroidOptions.setAttachAnrThreadDump(d(cloneable, logger, "io.sentry.anr.attach-thread-dumps", sentryAndroidOptions.isAttachAnrThreadDump()));
                sentryAndroidOptions.setReportHistoricalAnrs(d(cloneable, logger, "io.sentry.anr.report-historical", sentryAndroidOptions.isReportHistoricalAnrs()));
                sentryAndroidOptions.setEnableNdkAppHangTracking(d(cloneable, logger, "io.sentry.ndk.app-hang.enable", sentryAndroidOptions.isEnableNdkAppHangTracking()));
                sentryAndroidOptions.setNdkAppHangTimeoutIntervalMillis(i(cloneable, logger, "io.sentry.ndk.app-hang.timeout-interval-millis", sentryAndroidOptions.getNdkAppHangTimeoutIntervalMillis()));
                String strJ2 = j(cloneable, logger, "io.sentry.dsn", sentryAndroidOptions.getDsn());
                boolean zD = d(cloneable, logger, "io.sentry.enabled", sentryAndroidOptions.isEnabled());
                if (!zD || (strJ2 != null && strJ2.isEmpty())) {
                    sentryAndroidOptions.getLogger().g(f6.DEBUG, "Sentry enabled flag set to false or DSN is empty: disabling sentry-android", new Object[0]);
                } else if (strJ2 == null) {
                    sentryAndroidOptions.getLogger().g(f6.FATAL, "DSN is required. Use empty string to disable SDK.", new Object[0]);
                }
                sentryAndroidOptions.setEnabled(zD);
                sentryAndroidOptions.setDsn(strJ2);
                sentryAndroidOptions.setEnableNdk(d(cloneable, logger, "io.sentry.ndk.enable", sentryAndroidOptions.isEnableNdk()));
                sentryAndroidOptions.setEnableScopeSync(d(cloneable, logger, "io.sentry.ndk.scope-sync.enable", sentryAndroidOptions.isEnableScopeSync()));
                String strJ3 = j(cloneable, logger, "io.sentry.ndk.sdk-name", sentryAndroidOptions.getNativeSdkName());
                if (strJ3 != null) {
                    sentryAndroidOptions.setNativeSdkName(strJ3);
                }
                sentryAndroidOptions.setRelease(j(cloneable, logger, "io.sentry.release", sentryAndroidOptions.getRelease()));
                sentryAndroidOptions.setDist(j(cloneable, logger, "io.sentry.dist", sentryAndroidOptions.getDist()));
                sentryAndroidOptions.setEnvironment(j(cloneable, logger, "io.sentry.environment", sentryAndroidOptions.getEnvironment()));
                sentryAndroidOptions.setSessionTrackingIntervalMillis(i(cloneable, logger, "io.sentry.session-tracking.timeout-interval-millis", sentryAndroidOptions.getSessionTrackingIntervalMillis()));
                sentryAndroidOptions.setMaxBreadcrumbs((int) i(cloneable, logger, "io.sentry.max-breadcrumbs", sentryAndroidOptions.getMaxBreadcrumbs()));
                sentryAndroidOptions.setEnableActivityLifecycleBreadcrumbs(d(cloneable, logger, "io.sentry.breadcrumbs.activity-lifecycle", sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs()));
                sentryAndroidOptions.setEnableAppLifecycleBreadcrumbs(d(cloneable, logger, "io.sentry.breadcrumbs.app-lifecycle", sentryAndroidOptions.isEnableAppLifecycleBreadcrumbs()));
                sentryAndroidOptions.setEnableSystemEventBreadcrumbs(d(cloneable, logger, "io.sentry.breadcrumbs.system-events", sentryAndroidOptions.isEnableSystemEventBreadcrumbs()));
                sentryAndroidOptions.setEnableAppComponentBreadcrumbs(d(cloneable, logger, "io.sentry.breadcrumbs.app-components", sentryAndroidOptions.isEnableAppComponentBreadcrumbs()));
                sentryAndroidOptions.setEnableUserInteractionBreadcrumbs(d(cloneable, logger, "io.sentry.breadcrumbs.user-interaction", sentryAndroidOptions.isEnableUserInteractionBreadcrumbs()));
                sentryAndroidOptions.setEnableNetworkEventBreadcrumbs(d(cloneable, logger, "io.sentry.breadcrumbs.network-events", sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
                sentryAndroidOptions.setEnableUncaughtExceptionHandler(d(cloneable, logger, "io.sentry.uncaught-exception-handler.enable", sentryAndroidOptions.isEnableUncaughtExceptionHandler()));
                sentryAndroidOptions.setAttachThreads(d(cloneable, logger, "io.sentry.attach-threads", sentryAndroidOptions.isAttachThreads()));
                sentryAndroidOptions.setAttachScreenshot(d(cloneable, logger, "io.sentry.attach-screenshot", sentryAndroidOptions.isAttachScreenshot()));
                sentryAndroidOptions.setAttachViewHierarchy(d(cloneable, logger, "io.sentry.attach-view-hierarchy", sentryAndroidOptions.isAttachViewHierarchy()));
                sentryAndroidOptions.setSendClientReports(d(cloneable, logger, "io.sentry.send-client-reports", sentryAndroidOptions.isSendClientReports()));
                if (d(cloneable, logger, "io.sentry.auto-init", true)) {
                    sentryAndroidOptions.setInitPriority(io.sentry.b2.LOW);
                }
                sentryAndroidOptions.setForceInit(d(cloneable, logger, "io.sentry.force-init", sentryAndroidOptions.isForceInit()));
                sentryAndroidOptions.setCollectAdditionalContext(d(cloneable, logger, "io.sentry.additional-context", sentryAndroidOptions.isCollectAdditionalContext()));
                sentryAndroidOptions.setCollectExternalStorageContext(d(cloneable, logger, "io.sentry.external-storage-context", sentryAndroidOptions.isCollectExternalStorageContext()));
                if (sentryAndroidOptions.getTracesSampleRate() == null) {
                    double dF2 = f(cloneable, logger, "io.sentry.traces.sample-rate");
                    if (dF2 != -1.0d) {
                        sentryAndroidOptions.setTracesSampleRate(Double.valueOf(dF2));
                    }
                }
                sentryAndroidOptions.setTraceSampling(d(cloneable, logger, "io.sentry.traces.trace-sampling", sentryAndroidOptions.isTraceSampling()));
                sentryAndroidOptions.setEnableAutoActivityLifecycleTracing(d(cloneable, logger, "io.sentry.traces.activity.enable", sentryAndroidOptions.isEnableAutoActivityLifecycleTracing()));
                sentryAndroidOptions.setEnableActivityLifecycleTracingAutoFinish(d(cloneable, logger, "io.sentry.traces.activity.auto-finish.enable", sentryAndroidOptions.isEnableActivityLifecycleTracingAutoFinish()));
                if (sentryAndroidOptions.getProfilesSampleRate() == null) {
                    double dF3 = f(cloneable, logger, "io.sentry.traces.profiling.sample-rate");
                    if (dF3 != -1.0d) {
                        sentryAndroidOptions.setProfilesSampleRate(Double.valueOf(dF3));
                    }
                }
                if (sentryAndroidOptions.getProfileSessionSampleRate() == null) {
                    double dF4 = f(cloneable, logger, "io.sentry.traces.profiling.session-sample-rate");
                    if (dF4 != -1.0d) {
                        sentryAndroidOptions.setProfileSessionSampleRate(Double.valueOf(dF4));
                    }
                }
                String strName2 = sentryAndroidOptions.getProfileLifecycle().name();
                Locale locale2 = Locale.ROOT;
                String strJ4 = j(cloneable, logger, "io.sentry.traces.profiling.lifecycle", strName2.toLowerCase(locale2));
                if (strJ4 != null) {
                    sentryAndroidOptions.setProfileLifecycle(e4.valueOf(strJ4.toUpperCase(locale2)));
                }
                sentryAndroidOptions.setStartProfilerOnAppStart(d(cloneable, logger, "io.sentry.traces.profiling.start-on-app-start", sentryAndroidOptions.isStartProfilerOnAppStart()));
                sentryAndroidOptions.setEnableUserInteractionTracing(d(cloneable, logger, "io.sentry.traces.user-interaction.enable", sentryAndroidOptions.isEnableUserInteractionTracing()));
                sentryAndroidOptions.setEnableTimeToFullDisplayTracing(d(cloneable, logger, "io.sentry.traces.time-to-full-display.enable", sentryAndroidOptions.isEnableTimeToFullDisplayTracing()));
                long jI = i(cloneable, logger, "io.sentry.traces.idle-timeout", -1L);
                if (jI != -1) {
                    sentryAndroidOptions.setIdleTimeout(Long.valueOf(jI));
                }
                List<String> listH5 = h(cloneable, logger, "io.sentry.traces.trace-propagation-targets");
                if (b(cloneable, "io.sentry.traces.trace-propagation-targets") && listH5 == null) {
                    sentryAndroidOptions.setTracePropagationTargets(Collections.EMPTY_LIST);
                } else if (listH5 != null) {
                    sentryAndroidOptions.setTracePropagationTargets(listH5);
                }
                sentryAndroidOptions.setEnableFramesTracking(d(cloneable, logger, "io.sentry.traces.frames-tracking", true));
                sentryAndroidOptions.setProguardUuid(j(cloneable, logger, "io.sentry.proguard-uuid", sentryAndroidOptions.getProguardUuid()));
                io.sentry.protocol.u sdkVersion = sentryAndroidOptions.getSdkVersion();
                if (sdkVersion == null) {
                    sdkVersion = new io.sentry.protocol.u("", "");
                }
                String strK = k(cloneable, logger, "io.sentry.sdk.name", sdkVersion.m);
                io.sentry.util.b.v(strK, "name is required.");
                sdkVersion.m = strK;
                String strK2 = k(cloneable, logger, "io.sentry.sdk.version", sdkVersion.n);
                io.sentry.util.b.v(strK2, "version is required.");
                sdkVersion.n = strK2;
                sentryAndroidOptions.setSdkVersion(sdkVersion);
                sentryAndroidOptions.setSendDefaultPii(d(cloneable, logger, "io.sentry.send-default-pii", sentryAndroidOptions.isSendDefaultPii()));
                List listH6 = h(cloneable, logger, "io.sentry.gradle-plugin-integrations");
                if (listH6 != null) {
                    Iterator it = listH6.iterator();
                    while (it.hasNext()) {
                        d6.d().a((String) it.next());
                    }
                }
                sentryAndroidOptions.setEnableRootCheck(d(cloneable, logger, "io.sentry.enable-root-check", sentryAndroidOptions.isEnableRootCheck()));
                sentryAndroidOptions.setSendModules(d(cloneable, logger, "io.sentry.send-modules", sentryAndroidOptions.isSendModules()));
                sentryAndroidOptions.setEnablePerformanceV2(d(cloneable, logger, "io.sentry.performance-v2.enable", sentryAndroidOptions.isEnablePerformanceV2()));
                sentryAndroidOptions.setEnableStandaloneAppStartTracing(d(cloneable, logger, "io.sentry.standalone-app-start-tracing.enable", sentryAndroidOptions.isEnableStandaloneAppStartTracing()));
                sentryAndroidOptions.setEnableAppStartProfiling(d(cloneable, logger, "io.sentry.profiling.enable-app-start", sentryAndroidOptions.isEnableAppStartProfiling()));
                sentryAndroidOptions.setEnableLegacyProfiling(d(cloneable, logger, "io.sentry.profiling.enable-legacy-profiling", sentryAndroidOptions.isEnableLegacyProfiling()));
                sentryAndroidOptions.setEnableScopePersistence(d(cloneable, logger, "io.sentry.enable-scope-persistence", sentryAndroidOptions.isEnableScopePersistence()));
                sentryAndroidOptions.setEnableAutoTraceIdGeneration(d(cloneable, logger, "io.sentry.traces.enable-auto-id-generation", sentryAndroidOptions.isEnableAutoTraceIdGeneration()));
                sentryAndroidOptions.setDeadlineTimeout(i(cloneable, logger, "io.sentry.traces.deadline-timeout", sentryAndroidOptions.getDeadlineTimeout()));
                if (sentryAndroidOptions.getSessionReplay().d == null) {
                    double dF5 = f(cloneable, logger, "io.sentry.session-replay.session-sample-rate");
                    if (dF5 != -1.0d) {
                        sentryAndroidOptions.getSessionReplay().I(Double.valueOf(dF5));
                    }
                }
                if (sentryAndroidOptions.getSessionReplay().e == null) {
                    double dF6 = f(cloneable, logger, "io.sentry.session-replay.on-error-sample-rate");
                    if (dF6 != -1.0d) {
                        sentryAndroidOptions.getSessionReplay().H(Double.valueOf(dF6));
                    }
                }
                sentryAndroidOptions.getSessionReplay().w(d(cloneable, logger, "io.sentry.session-replay.mask-all-text", true));
                sentryAndroidOptions.getSessionReplay().v(d(cloneable, logger, "io.sentry.session-replay.mask-all-images", true));
                sentryAndroidOptions.getSessionReplay().m = d(cloneable, logger, "io.sentry.session-replay.debug", false);
                String strJ5 = j(cloneable, logger, "io.sentry.session-replay.screenshot-strategy", null);
                if (strJ5 != null) {
                    if ("canvas".equals(strJ5.toLowerCase(Locale.ROOT))) {
                        sentryAndroidOptions.getSessionReplay().n = x4.CANVAS;
                    } else {
                        sentryAndroidOptions.getSessionReplay().n = x4.PIXEL_COPY;
                    }
                }
                sentryAndroidOptions.getSessionReplay().f208o = d(cloneable, logger, "io.sentry.session-replay.capture-surface-views", sentryAndroidOptions.getSessionReplay().f208o);
                if (sentryAndroidOptions.getSessionReplay().p.isEmpty() && (listH4 = h(cloneable, logger, "io.sentry.session-replay.network-detail-allow-urls")) != null && !listH4.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = listH4.iterator();
                    while (it2.hasNext()) {
                        String strTrim = ((String) it2.next()).trim();
                        if (!strTrim.isEmpty()) {
                            arrayList.add(strTrim);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        sentryAndroidOptions.getSessionReplay().D(arrayList);
                    }
                }
                if (sentryAndroidOptions.getSessionReplay().q.isEmpty() && (listH3 = h(cloneable, logger, "io.sentry.session-replay.network-detail-deny-urls")) != null && !listH3.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = listH3.iterator();
                    while (it3.hasNext()) {
                        String strTrim2 = ((String) it3.next()).trim();
                        if (!strTrim2.isEmpty()) {
                            arrayList2.add(strTrim2);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        sentryAndroidOptions.getSessionReplay().E(arrayList2);
                    }
                }
                sentryAndroidOptions.getSessionReplay().r = d(cloneable, logger, "io.sentry.session-replay.network-capture-bodies", sentryAndroidOptions.getSessionReplay().r);
                if (sentryAndroidOptions.getSessionReplay().s.size() == k7.u.size() && (listH2 = h(cloneable, logger, "io.sentry.session-replay.network-request-headers")) != null) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it4 = listH2.iterator();
                    while (it4.hasNext()) {
                        String strTrim3 = ((String) it4.next()).trim();
                        if (!strTrim3.isEmpty()) {
                            arrayList3.add(strTrim3);
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        sentryAndroidOptions.getSessionReplay().F(arrayList3);
                    }
                }
                if (sentryAndroidOptions.getSessionReplay().t.size() == k7.u.size() && (listH = h(cloneable, logger, "io.sentry.session-replay.network-response-headers")) != null && !listH.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it5 = listH.iterator();
                    while (it5.hasNext()) {
                        String strTrim4 = ((String) it5.next()).trim();
                        if (!strTrim4.isEmpty()) {
                            arrayList4.add(strTrim4);
                        }
                    }
                    if (!arrayList4.isEmpty()) {
                        sentryAndroidOptions.getSessionReplay().G(arrayList4);
                    }
                }
                sentryAndroidOptions.setIgnoredErrors(h(cloneable, logger, "io.sentry.ignored-errors"));
                List listH7 = h(cloneable, logger, "io.sentry.in-app-includes");
                if (listH7 != null && !listH7.isEmpty()) {
                    Iterator it6 = listH7.iterator();
                    while (it6.hasNext()) {
                        sentryAndroidOptions.addInAppInclude((String) it6.next());
                    }
                }
                List listH8 = h(cloneable, logger, "io.sentry.in-app-excludes");
                if (listH8 != null && !listH8.isEmpty()) {
                    Iterator it7 = listH8.iterator();
                    while (it7.hasNext()) {
                        sentryAndroidOptions.addInAppExclude((String) it7.next());
                    }
                }
                sentryAndroidOptions.getLogs().a = d(cloneable, logger, "io.sentry.logs.enabled", sentryAndroidOptions.getLogs().a);
                sentryAndroidOptions.getMetrics().a = d(cloneable, logger, "io.sentry.metrics.enabled", sentryAndroidOptions.getMetrics().a);
                a6 feedbackOptions = sentryAndroidOptions.getFeedbackOptions();
                feedbackOptions.a = d(cloneable, logger, "io.sentry.feedback.is-name-required", feedbackOptions.a);
                feedbackOptions.b = d(cloneable, logger, "io.sentry.feedback.show-name", feedbackOptions.b);
                feedbackOptions.c = d(cloneable, logger, "io.sentry.feedback.is-email-required", feedbackOptions.c);
                feedbackOptions.d = d(cloneable, logger, "io.sentry.feedback.show-email", feedbackOptions.d);
                feedbackOptions.e = d(cloneable, logger, "io.sentry.feedback.use-sentry-user", feedbackOptions.e);
                feedbackOptions.f = d(cloneable, logger, "io.sentry.feedback.show-branding", feedbackOptions.f);
                feedbackOptions.g = d(cloneable, logger, "io.sentry.feedback.use-shake-gesture", feedbackOptions.g);
                feedbackOptions.h = d(cloneable, logger, "io.sentry.feedback.enable-attach-screenshot", feedbackOptions.h);
                sentryAndroidOptions.setStrictTraceContinuation(d(cloneable, logger, "io.sentry.strict-trace-continuation.enabled", sentryAndroidOptions.isStrictTraceContinuation()));
                String strJ6 = j(cloneable, logger, "io.sentry.org-id", null);
                if (strJ6 != null) {
                    sentryAndroidOptions.setOrgId(strJ6);
                }
                sentryAndroidOptions.setEnableSpotlight(d(cloneable, logger, "io.sentry.spotlight.enable", sentryAndroidOptions.isEnableSpotlight()));
                String strJ7 = j(cloneable, logger, "io.sentry.spotlight.url", null);
                if (strJ7 != null) {
                    sentryAndroidOptions.setSpotlightConnectionUrl(strJ7);
                }
                sentryAndroidOptions.getScreenshot().w(d(cloneable, logger, "io.sentry.screenshot.mask-all-text", false));
                sentryAndroidOptions.getScreenshot().v(d(cloneable, logger, "io.sentry.screenshot.mask-all-images", false));
                if (sentryAndroidOptions.getAnrProfilingSampleRate() == null) {
                    double dF7 = f(cloneable, logger, "io.sentry.anr.profiling.sample-rate");
                    if (dF7 != -1.0d) {
                        sentryAndroidOptions.setAnrProfilingSampleRate(Double.valueOf(dF7));
                    }
                }
                sentryAndroidOptions.setEnableAnrFingerprinting(d(cloneable, logger, "io.sentry.anr.enable-fingerprinting", sentryAndroidOptions.isEnableAnrFingerprinting()));
                io.sentry.r rVarE = e(cloneable, logger, sentryAndroidOptions.getDataCollection());
                if (rVarE != null) {
                    c(sentryAndroidOptions.getDataCollection(), rVarE);
                }
            }
            sentryAndroidOptions.getLogger().g(f6.INFO, "Retrieving configuration from AndroidManifest.xml", new Object[0]);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().d(f6.ERROR, "Failed to read configuration from android manifest metadata.", th);
        }
    }

    public static boolean b(Cloneable cloneable, String str) {
        return cloneable instanceof Bundle ? ((Bundle) cloneable).containsKey(str) : ((Map) cloneable).containsKey(str);
    }

    public static void c(io.sentry.r rVar, io.sentry.r rVar2) {
        Boolean bool = rVar2.a;
        if (bool != null) {
            rVar.a = bool;
        }
        Set set = rVar2.d;
        if (set != null) {
            rVar.b(set);
        }
        io.sentry.w2 w2Var = rVar2.b;
        if (w2Var != null) {
            rVar.b = w2Var;
        }
        io.sentry.internal.debugmeta.c cVar = rVar2.g;
        io.sentry.w2 w2Var2 = (io.sentry.w2) cVar.n;
        if (w2Var2 != null) {
            rVar.g.n = w2Var2;
        }
        io.sentry.w2 w2Var3 = (io.sentry.w2) cVar.f205o;
        if (w2Var3 != null) {
            rVar.g.f205o = w2Var3;
        }
        io.sentry.w2 w2Var4 = rVar2.c;
        if (w2Var4 != null) {
            rVar.c = w2Var4;
        }
        io.sentry.internal.debugmeta.c cVar2 = rVar2.h;
        Boolean bool2 = (Boolean) cVar2.n;
        if (bool2 != null) {
            rVar.h.n = bool2;
        }
        Boolean bool3 = (Boolean) cVar2.f205o;
        if (bool3 != null) {
            rVar.h.f205o = bool3;
        }
        Boolean bool4 = rVar2.e;
        if (bool4 != null) {
            rVar.e = bool4;
        }
        Boolean bool5 = rVar2.f;
        if (bool5 != null) {
            rVar.f = bool5;
        }
    }

    public static boolean d(Cloneable cloneable, io.sentry.g1 g1Var, String str, boolean z) {
        boolean z2;
        if (cloneable instanceof Bundle) {
            z2 = ((Bundle) cloneable).getBoolean(str, z);
        } else {
            Object obj = ((Map) cloneable).get(str);
            if (obj instanceof Boolean) {
                z = ((Boolean) obj).booleanValue();
            }
            z2 = z;
        }
        f6 f6Var = f6.DEBUG;
        if (g1Var.i(f6Var)) {
            g1Var.g(f6Var, str + " read: " + z2, new Object[0]);
        }
        return z2;
    }

    public static io.sentry.r e(Cloneable cloneable, io.sentry.g1 g1Var, io.sentry.r rVar) {
        Set setNoneOf;
        io.sentry.r rVar2 = new io.sentry.r();
        if (b(cloneable, "io.sentry.data-collection.user-info")) {
            rVar2.a = Boolean.valueOf(d(cloneable, g1Var, "io.sentry.data-collection.user-info", false));
        }
        if (b(cloneable, "io.sentry.data-collection.http-bodies")) {
            List listH = h(cloneable, g1Var, "io.sentry.data-collection.http-bodies");
            if (listH == null || (listH.size() == 1 && ((String) listH.get(0)).isEmpty())) {
                setNoneOf = Collections.EMPTY_SET;
            } else {
                setNoneOf = EnumSet.noneOf(io.sentry.u0.class);
                Iterator it = listH.iterator();
                while (it.hasNext()) {
                    setNoneOf.add(io.sentry.u0.valueOf(((String) it.next()).toUpperCase(Locale.ROOT)));
                }
            }
            rVar2.b(setNoneOf);
        }
        io.sentry.w2 w2Var = rVar.b;
        io.sentry.internal.debugmeta.c cVar = rVar.g;
        io.sentry.w2 w2VarG = g(cloneable, g1Var, "io.sentry.data-collection.cookies", w2Var);
        if (w2VarG != null) {
            rVar2.b = w2VarG;
        }
        io.sentry.w2 w2VarG2 = g(cloneable, g1Var, "io.sentry.data-collection.http-headers.request", (io.sentry.w2) cVar.n);
        io.sentry.internal.debugmeta.c cVar2 = rVar2.g;
        if (w2VarG2 != null) {
            cVar2.n = w2VarG2;
        }
        io.sentry.w2 w2VarG3 = g(cloneable, g1Var, "io.sentry.data-collection.http-headers.response", (io.sentry.w2) cVar.f205o);
        if (w2VarG3 != null) {
            cVar2.f205o = w2VarG3;
        }
        io.sentry.w2 w2VarG4 = g(cloneable, g1Var, "io.sentry.data-collection.url-query-params", rVar.c);
        if (w2VarG4 != null) {
            rVar2.c = w2VarG4;
        }
        boolean zB = b(cloneable, "io.sentry.data-collection.graphql.document");
        io.sentry.internal.debugmeta.c cVar3 = rVar2.h;
        if (zB) {
            cVar3.n = Boolean.valueOf(d(cloneable, g1Var, "io.sentry.data-collection.graphql.document", false));
        }
        if (b(cloneable, "io.sentry.data-collection.graphql.variables")) {
            cVar3.f205o = Boolean.valueOf(d(cloneable, g1Var, "io.sentry.data-collection.graphql.variables", false));
        }
        if (b(cloneable, "io.sentry.data-collection.database-query-data")) {
            rVar2.e = Boolean.valueOf(d(cloneable, g1Var, "io.sentry.data-collection.database-query-data", false));
        }
        if (b(cloneable, "io.sentry.data-collection.file-paths")) {
            rVar2.f = Boolean.valueOf(d(cloneable, g1Var, "io.sentry.data-collection.file-paths", false));
        }
        if (rVar2.a()) {
            return rVar2;
        }
        return null;
    }

    public static double f(Cloneable cloneable, io.sentry.g1 g1Var, String str) {
        double dDoubleValue;
        double dDoubleValue2 = -1.0d;
        if (cloneable instanceof Bundle) {
            Bundle bundle = (Bundle) cloneable;
            dDoubleValue = Float.valueOf(bundle.getFloat(str, -1.0f)).doubleValue();
            if (dDoubleValue == -1.0d) {
                dDoubleValue = Integer.valueOf(bundle.getInt(str, -1)).doubleValue();
            }
        } else {
            Object obj = ((Map) cloneable).get(str);
            if (obj instanceof Float) {
                dDoubleValue2 = ((Float) obj).doubleValue();
            } else if (obj instanceof Integer) {
                dDoubleValue2 = ((Integer) obj).doubleValue();
            }
            dDoubleValue = dDoubleValue2;
        }
        f6 f6Var = f6.DEBUG;
        if (g1Var.i(f6Var)) {
            g1Var.g(f6Var, str + " read: " + dDoubleValue, new Object[0]);
        }
        return dDoubleValue;
    }

    public static io.sentry.w2 g(Cloneable cloneable, io.sentry.g1 g1Var, String str, io.sentry.w2 w2Var) {
        String strJ;
        String strConcat = str.concat(".mode");
        String strConcat2 = str.concat(".terms");
        if (!b(cloneable, strConcat) && !b(cloneable, strConcat2)) {
            return null;
        }
        io.sentry.w2 w2Var2 = new io.sentry.w2();
        if (w2Var != null) {
            w2Var2.a = w2Var.a;
            w2Var2.b = Collections.unmodifiableList(new ArrayList(w2Var.b));
        }
        if (b(cloneable, strConcat) && (strJ = j(cloneable, g1Var, strConcat, null)) != null) {
            w2Var2.a = io.sentry.v2.valueOf(strJ.toUpperCase(Locale.ROOT));
        }
        if (b(cloneable, strConcat2)) {
            List listH = h(cloneable, g1Var, strConcat2);
            if (listH == null) {
                listH = Collections.EMPTY_LIST;
            }
            w2Var2.b = Collections.unmodifiableList(new ArrayList(listH));
        }
        return w2Var2;
    }

    public static List h(Cloneable cloneable, io.sentry.g1 g1Var, String str) {
        String string;
        if (cloneable instanceof Bundle) {
            string = ((Bundle) cloneable).getString(str);
        } else {
            Object obj = ((Map) cloneable).get(str);
            string = obj instanceof String ? (String) obj : null;
        }
        f6 f6Var = f6.DEBUG;
        if (g1Var.i(f6Var)) {
            g1Var.g(f6Var, fx3.g(str, " read: ", string), new Object[0]);
        }
        if (string != null) {
            return Arrays.asList(string.split(",", -1));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    /* JADX WARN: Instruction removed from duplicated block: B:11:0x0026, please report this as an issue */
    public static long i(Cloneable cloneable, io.sentry.g1 g1Var, String str, long j) {
        int iIntValue;
        f6 f6Var;
        if (!(cloneable instanceof Bundle)) {
            Object obj = ((Map) cloneable).get(str);
            if (obj instanceof Integer) {
                iIntValue = ((Integer) obj).intValue();
            }
            f6Var = f6.DEBUG;
            if (g1Var.i(f6Var)) {
                g1Var.g(f6Var, str + " read: " + j, new Object[0]);
            }
            return j;
        }
        iIntValue = ((Bundle) cloneable).getInt(str, (int) j);
        j = iIntValue;
        f6Var = f6.DEBUG;
        if (g1Var.i(f6Var)) {
            g1Var.g(f6Var, str + " read: " + j, new Object[0]);
        }
        return j;
    }

    public static String j(Cloneable cloneable, io.sentry.g1 g1Var, String str, String str2) {
        String string;
        if (cloneable instanceof Bundle) {
            string = ((Bundle) cloneable).getString(str, str2);
        } else {
            Object obj = ((Map) cloneable).get(str);
            if (obj instanceof String) {
                str2 = (String) obj;
            }
            string = str2;
        }
        f6 f6Var = f6.DEBUG;
        if (g1Var.i(f6Var)) {
            g1Var.g(f6Var, fx3.g(str, " read: ", string), new Object[0]);
        }
        return string;
    }

    public static String k(Cloneable cloneable, io.sentry.g1 g1Var, String str, String str2) {
        String string;
        if (cloneable instanceof Bundle) {
            string = ((Bundle) cloneable).getString(str, str2);
        } else {
            Object obj = ((Map) cloneable).get(str);
            if (obj instanceof String) {
                str2 = (String) obj;
            }
            string = str2;
        }
        f6 f6Var = f6.DEBUG;
        if (g1Var.i(f6Var)) {
            g1Var.g(f6Var, fx3.g(str, " read: ", string), new Object[0]);
        }
        return string;
    }
}
