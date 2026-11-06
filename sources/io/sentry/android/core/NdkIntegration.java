package io.sentry.android.core;

import io.sentry.f6;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class NdkIntegration implements io.sentry.d2, Closeable {
    public final Class m;
    public SentryAndroidOptions n;

    public NdkIntegration(Class cls) {
        this.m = cls;
    }

    public static void e(SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.setEnableNdk(false);
        sentryAndroidOptions.setEnableScopeSync(false);
    }

    @Override // io.sentry.d2
    public final void Y(SentryAndroidOptions sentryAndroidOptions) {
        Class cls;
        this.n = sentryAndroidOptions;
        boolean zIsEnableNdk = sentryAndroidOptions.isEnableNdk();
        io.sentry.g1 logger = this.n.getLogger();
        f6 f6Var = f6.DEBUG;
        logger.g(f6Var, "NdkIntegration enabled: %s", Boolean.valueOf(zIsEnableNdk));
        if (!zIsEnableNdk || (cls = this.m) == null) {
            e(this.n);
            return;
        }
        if (this.n.getCacheDirPath() == null) {
            this.n.getLogger().g(f6.ERROR, "No cache dir path is defined in options.", new Object[0]);
            e(this.n);
            return;
        }
        try {
            cls.getMethod("init", SentryAndroidOptions.class).invoke(null, this.n);
            this.n.getLogger().g(f6Var, "NdkIntegration installed.", new Object[0]);
            io.sentry.util.b.a("Ndk");
        } catch (NoSuchMethodException e) {
            e(this.n);
            this.n.getLogger().d(f6.ERROR, "Failed to invoke the SentryNdk.init method.", e);
        } catch (Throwable th) {
            e(this.n);
            this.n.getLogger().d(f6.ERROR, "Failed to initialize SentryNdk.", th);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions sentryAndroidOptions = this.n;
        if (sentryAndroidOptions == null || !sentryAndroidOptions.isEnableNdk()) {
            return;
        }
        Class cls = this.m;
        try {
            if (cls != null) {
                cls.getMethod("close", null).invoke(null, null);
                this.n.getLogger().g(f6.DEBUG, "NdkIntegration removed.", new Object[0]);
            }
        } catch (NoSuchMethodException e) {
            this.n.getLogger().d(f6.ERROR, "Failed to invoke the SentryNdk.close method.", e);
        } catch (Throwable th) {
            this.n.getLogger().d(f6.ERROR, "Failed to close SentryNdk.", th);
        } finally {
            e(this.n);
        }
    }
}
