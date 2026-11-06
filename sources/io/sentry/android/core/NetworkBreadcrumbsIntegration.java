package io.sentry.android.core;

import android.content.Context;
import io.sentry.f6;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class NetworkBreadcrumbsIntegration implements io.sentry.d2, Closeable {
    public final Context m;
    public final q0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final io.sentry.util.a f92o = new io.sentry.util.a();
    public volatile r1 p;

    public NetworkBreadcrumbsIntegration(Context context, q0 q0Var) {
        Context applicationContext = context.getApplicationContext();
        this.m = applicationContext != null ? applicationContext : context;
        this.n = q0Var;
    }

    @Override // io.sentry.d2
    public final void Y(SentryAndroidOptions sentryAndroidOptions) {
        boolean z;
        io.sentry.g1 logger = sentryAndroidOptions.getLogger();
        f6 f6Var = f6.DEBUG;
        logger.g(f6Var, "NetworkBreadcrumbsIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
        if (sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()) {
            io.sentry.util.a aVar = this.f92o;
            aVar.e();
            try {
                this.p = new r1(this.n, sentryAndroidOptions.getDateProvider());
                Context context = this.m;
                io.sentry.g1 logger2 = sentryAndroidOptions.getLogger();
                r1 r1Var = this.p;
                io.sentry.util.a aVar2 = io.sentry.android.core.internal.util.c.x;
                if (io.sentry.config.a.w(context)) {
                    io.sentry.util.a aVar3 = io.sentry.android.core.internal.util.c.z;
                    aVar3.e();
                    try {
                        io.sentry.android.core.internal.util.c.A.add(r1Var);
                        aVar3.close();
                        z = true;
                    } catch (Throwable th) {
                        try {
                            aVar3.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else {
                    logger2.g(f6.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                    z = false;
                }
                if (z) {
                    sentryAndroidOptions.getLogger().g(f6Var, "NetworkBreadcrumbsIntegration installed.", new Object[0]);
                    io.sentry.util.b.a("NetworkBreadcrumbs");
                } else {
                    sentryAndroidOptions.getLogger().g(f6Var, "NetworkBreadcrumbsIntegration not installed.", new Object[0]);
                }
                aVar.close();
            } catch (Throwable th3) {
                try {
                    aVar.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.util.a aVar = this.f92o;
        aVar.e();
        try {
            r1 r1Var = this.p;
            this.p = null;
            aVar.close();
            if (r1Var != null) {
                io.sentry.util.a aVar2 = io.sentry.android.core.internal.util.c.z;
                aVar2.e();
                try {
                    io.sentry.android.core.internal.util.c.A.remove(r1Var);
                    aVar2.close();
                } catch (Throwable th) {
                    try {
                        aVar2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            try {
                aVar.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
