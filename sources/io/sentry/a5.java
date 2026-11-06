package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a5 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ SentryAndroidOptions n;

    public /* synthetic */ a5(SentryAndroidOptions sentryAndroidOptions, byte b) {
        this.m = b;
        this.n = sentryAndroidOptions;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        SentryAndroidOptions sentryAndroidOptions = this.n;
        switch (b) {
            case 0:
                sentryAndroidOptions.loadLazyFields();
                return;
            case 1:
                String cacheDirPathWithoutDsn = sentryAndroidOptions.getCacheDirPathWithoutDsn();
                if (cacheDirPathWithoutDsn != null) {
                    File file = new File(cacheDirPathWithoutDsn);
                    File file2 = new File(file, "app_start_profiling_config");
                    try {
                        io.sentry.util.b.h(file2);
                        if (sentryAndroidOptions.isEnableAppStartProfiling() || sentryAndroidOptions.isStartProfilerOnAppStart()) {
                            if (!sentryAndroidOptions.isStartProfilerOnAppStart() && !sentryAndroidOptions.isTracingEnabled()) {
                                sentryAndroidOptions.getLogger().g(f6.INFO, "Tracing is disabled and app start profiling will not start.", new Object[0]);
                                return;
                            }
                            if (!io.sentry.util.b.f(file)) {
                                sentryAndroidOptions.getLogger().g(f6.ERROR, "Failed to create cache dir %s", cacheDirPathWithoutDsn);
                                return;
                            }
                            if (file2.createNewFile()) {
                                e5 e5Var = new e5(sentryAndroidOptions, sentryAndroidOptions.isEnableAppStartProfiling() ? sentryAndroidOptions.getInternalTracesSampler().a(new o(new e8("app.launch", io.sentry.protocol.h0.CUSTOM, "profile", null), Double.valueOf(io.sentry.util.p.a().c()))) : new h4(Boolean.FALSE, (Double) null));
                                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                try {
                                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, d5.e));
                                    try {
                                        sentryAndroidOptions.getSerializer().a(e5Var, bufferedWriter);
                                        bufferedWriter.close();
                                        fileOutputStream.close();
                                        return;
                                    } catch (Throwable th) {
                                        try {
                                            bufferedWriter.close();
                                            break;
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    try {
                                        fileOutputStream.close();
                                        break;
                                    } catch (Throwable th4) {
                                        th3.addSuppressed(th4);
                                    }
                                    throw th3;
                                }
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th5) {
                        sentryAndroidOptions.getLogger().d(f6.ERROR, "Unable to create app start profiling config file. ", th5);
                        return;
                    }
                }
                return;
            case 2:
                for (h1 h1Var : sentryAndroidOptions.getOptionsObservers()) {
                    h1Var.g(sentryAndroidOptions.getRelease());
                    h1Var.f(sentryAndroidOptions.getProguardUuid());
                    h1Var.b(sentryAndroidOptions.getSdkVersion());
                    h1Var.c(sentryAndroidOptions.getDist());
                    h1Var.e(sentryAndroidOptions.getEnvironment());
                    h1Var.a(sentryAndroidOptions.getTags());
                    h1Var.d(sentryAndroidOptions.getSessionReplay().e);
                }
                io.sentry.cache.g gVarFindPersistingScopeObserver = sentryAndroidOptions.findPersistingScopeObserver();
                if (gVarFindPersistingScopeObserver != null) {
                    try {
                        io.sentry.cache.tape.g gVar = (io.sentry.cache.tape.g) gVarFindPersistingScopeObserver.b.a();
                        gVar.clear();
                        gVar.H0();
                        break;
                    } catch (IOException e) {
                        gVarFindPersistingScopeObserver.a.getLogger().d(f6.ERROR, "Failed to clear breadcrumbs from file queue", e);
                    }
                    gVarFindPersistingScopeObserver.a("user.json");
                    gVarFindPersistingScopeObserver.a("level.json");
                    gVarFindPersistingScopeObserver.a("request.json");
                    gVarFindPersistingScopeObserver.a("fingerprint.json");
                    gVarFindPersistingScopeObserver.a("contexts.json");
                    gVarFindPersistingScopeObserver.a("extras.json");
                    gVarFindPersistingScopeObserver.a("tags.json");
                    gVarFindPersistingScopeObserver.a("trace.json");
                    gVarFindPersistingScopeObserver.a("transaction.json");
                    return;
                }
                return;
            default:
                d5.c().b(sentryAndroidOptions.getFlushTimeoutMillis());
                return;
        }
    }
}
