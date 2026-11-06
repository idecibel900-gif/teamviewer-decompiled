package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e5 implements t2 {
    public boolean m;
    public Double n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f191o;
    public Double p;
    public String q;
    public boolean r;
    public boolean s;
    public int t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public e4 y;
    public ConcurrentHashMap z;

    public e5(SentryAndroidOptions sentryAndroidOptions, h4 h4Var) {
        this.f191o = ((Boolean) h4Var.a).booleanValue();
        this.p = (Double) h4Var.b;
        this.m = ((Boolean) h4Var.d).booleanValue();
        this.n = (Double) h4Var.e;
        this.u = sentryAndroidOptions.getInternalTracesSampler().b(io.sentry.util.p.a().c());
        this.q = sentryAndroidOptions.getProfilingTracesDirPath();
        this.r = sentryAndroidOptions.isProfilingEnabled();
        this.s = sentryAndroidOptions.isContinuousProfilingEnabled();
        this.y = sentryAndroidOptions.getProfileLifecycle();
        this.t = sentryAndroidOptions.getProfilingTracesHz();
        this.v = sentryAndroidOptions.isEnableAppStartProfiling();
        this.w = sentryAndroidOptions.isStartProfilerOnAppStart();
        this.x = sentryAndroidOptions.isEnableLegacyProfiling();
    }

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        cVar.r("profile_sampled");
        cVar.x(g1Var, Boolean.valueOf(this.m));
        cVar.r("profile_sample_rate");
        cVar.x(g1Var, this.n);
        cVar.r("continuous_profile_sampled");
        cVar.x(g1Var, Boolean.valueOf(this.u));
        cVar.r("trace_sampled");
        cVar.x(g1Var, Boolean.valueOf(this.f191o));
        cVar.r("trace_sample_rate");
        cVar.x(g1Var, this.p);
        cVar.r("profiling_traces_dir_path");
        cVar.x(g1Var, this.q);
        cVar.r("is_profiling_enabled");
        cVar.x(g1Var, Boolean.valueOf(this.r));
        cVar.r("is_continuous_profiling_enabled");
        cVar.x(g1Var, Boolean.valueOf(this.s));
        cVar.r("profile_lifecycle");
        cVar.x(g1Var, this.y.name());
        cVar.r("profiling_traces_hz");
        cVar.x(g1Var, Integer.valueOf(this.t));
        cVar.r("is_enable_app_start_profiling");
        cVar.x(g1Var, Boolean.valueOf(this.v));
        cVar.r("is_start_profiler_on_app_start");
        cVar.x(g1Var, Boolean.valueOf(this.w));
        cVar.r("enable_legacy_profiling");
        cVar.x(g1Var, Boolean.valueOf(this.x));
        ConcurrentHashMap concurrentHashMap = this.z;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                f.b(this.z, str, cVar, str, g1Var);
            }
        }
        cVar.m();
    }
}
