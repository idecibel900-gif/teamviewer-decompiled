package io.sentry.android.core.internal.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import io.sentry.a1;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.h0;
import io.sentry.android.core.k0;
import io.sentry.android.core.q0;
import io.sentry.android.core.v0;
import io.sentry.f6;
import io.sentry.g1;
import io.sentry.y0;
import io.sentry.z0;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class c implements a1, h0 {
    public static volatile ConnectivityManager y;
    public final Context m;
    public final SentryAndroidOptions n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final q0 f112o;
    public final io.sentry.time.c p;
    public final ArrayList q;
    public volatile b s;
    public volatile NetworkCapabilities t;
    public volatile Network u;
    public volatile io.sentry.time.a v;
    public static final io.sentry.util.a x = new io.sentry.util.a();
    public static final io.sentry.util.a z = new io.sentry.util.a();
    public static final ArrayList A = new ArrayList();
    public static final int[] B = {1, 0, 3, 2};
    public static final int[] C = new int[2];
    public final io.sentry.util.a r = new io.sentry.util.a();
    public final AtomicBoolean w = new AtomicBoolean(false);

    public c(Context context, SentryAndroidOptions sentryAndroidOptions, q0 q0Var, io.sentry.time.c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.m = applicationContext != null ? applicationContext : context;
        this.n = sentryAndroidOptions;
        this.f112o = q0Var;
        this.p = cVar;
        this.v = new io.sentry.time.a(cVar, cVar.a());
        this.q = new ArrayList();
        int[] iArr = C;
        iArr[0] = 12;
        iArr[1] = 16;
        J(new a(this, (byte) 0));
        k0.q.e(this);
    }

    public static ConnectivityManager G(Context context, g1 g1Var) {
        if (y != null) {
            return y;
        }
        io.sentry.util.a aVar = x;
        aVar.e();
        try {
            if (y != null) {
                ConnectivityManager connectivityManager = y;
                aVar.close();
                return connectivityManager;
            }
            y = (ConnectivityManager) context.getSystemService("connectivity");
            if (y == null) {
                g1Var.g(f6.INFO, "ConnectivityManager is null and cannot check network status", new Object[0]);
            }
            ConnectivityManager connectivityManager2 = y;
            aVar.close();
            return connectivityManager2;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String z(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities.hasTransport(3)) {
            return "ethernet";
        }
        if (networkCapabilities.hasTransport(1)) {
            return "wifi";
        }
        if (networkCapabilities.hasTransport(0)) {
            return "cellular";
        }
        return null;
    }

    public final String F() {
        NetworkCapabilities networkCapabilities = this.t;
        if (networkCapabilities != null) {
            return z(networkCapabilities);
        }
        Context context = this.m;
        g1 logger = this.n.getLogger();
        q0 q0Var = this.f112o;
        ConnectivityManager connectivityManagerG = G(context, logger);
        if (connectivityManagerG != null) {
            if (!io.sentry.config.a.w(context)) {
                logger.g(f6.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                return null;
            }
            try {
                q0Var.getClass();
                Network activeNetwork = connectivityManagerG.getActiveNetwork();
                if (activeNetwork == null) {
                    logger.g(f6.INFO, "Network is null and cannot check network status", new Object[0]);
                    return null;
                }
                NetworkCapabilities networkCapabilities2 = connectivityManagerG.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities2 == null) {
                    logger.g(f6.INFO, "NetworkCapabilities is null and cannot check network type", new Object[0]);
                    return null;
                }
                boolean zHasTransport = networkCapabilities2.hasTransport(3);
                boolean zHasTransport2 = networkCapabilities2.hasTransport(1);
                boolean zHasTransport3 = networkCapabilities2.hasTransport(0);
                if (zHasTransport) {
                    return "ethernet";
                }
                if (zHasTransport2) {
                    return "wifi";
                }
                if (zHasTransport3) {
                    return "cellular";
                }
            } catch (Throwable th) {
                logger.d(f6.ERROR, "Failed to retrieve network info", th);
                return null;
            }
        }
        return null;
    }

    public final void J(Runnable runnable) {
        SentryAndroidOptions sentryAndroidOptions = this.n;
        try {
            sentryAndroidOptions.getExecutorService().submit(runnable);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().d(f6.ERROR, "AndroidConnectionStatusProvider submit failed", th);
        }
    }

    public final void Y(boolean z2) {
        io.sentry.util.a aVar = this.r;
        aVar.e();
        if (z2) {
            try {
                this.q.clear();
            } catch (Throwable th) {
                try {
                    aVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        b bVar = this.s;
        this.s = null;
        if (bVar != null) {
            Context context = this.m;
            g1 logger = this.n.getLogger();
            ConnectivityManager connectivityManagerG = G(context, logger);
            if (connectivityManagerG != null) {
                try {
                    connectivityManagerG.unregisterNetworkCallback(bVar);
                } catch (Throwable th3) {
                    logger.d(f6.WARNING, "unregisterNetworkCallback failed", th3);
                }
            }
        }
        this.t = null;
        this.u = null;
        io.sentry.time.c cVar = this.p;
        this.v = new io.sentry.time.a(cVar, cVar.a());
        aVar.close();
        this.n.getLogger().g(f6.DEBUG, "Network callback unregistered", new Object[0]);
    }

    public final void b0(NetworkCapabilities networkCapabilities) {
        io.sentry.util.a aVar = this.r;
        aVar.e();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        try {
            if (networkCapabilities != null) {
                this.t = networkCapabilities;
            } else {
                if (!io.sentry.config.a.w(this.m)) {
                    this.n.getLogger().g(f6.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                    this.t = null;
                    this.v = io.sentry.time.a.a(this.p, 2L, timeUnit);
                    aVar.close();
                    return;
                }
                this.f112o.getClass();
                ConnectivityManager connectivityManagerG = G(this.m, this.n.getLogger());
                if (connectivityManagerG != null) {
                    Network activeNetwork = connectivityManagerG.getActiveNetwork();
                    this.t = activeNetwork != null ? connectivityManagerG.getNetworkCapabilities(activeNetwork) : null;
                } else {
                    this.t = null;
                }
            }
            this.v = io.sentry.time.a.a(this.p, 2L, timeUnit);
            this.n.getLogger().g(f6.DEBUG, "Cache updated - Status: " + u() + ", Type: " + F(), new Object[0]);
        } catch (Throwable th) {
            try {
                this.n.getLogger().d(f6.WARNING, "Failed to update connection status cache", th);
                this.t = null;
                this.v = io.sentry.time.a.a(this.p, 2L, timeUnit);
            } catch (Throwable th2) {
                try {
                    aVar.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        aVar.close();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        J(new a(this, (byte) 1));
    }

    @Override // io.sentry.android.core.h0
    public final void e() {
        if (this.s != null) {
            return;
        }
        J(new a(this, (byte) 3));
    }

    @Override // io.sentry.a1
    public final String g() {
        if (this.v.b()) {
            b0(null);
        }
        return F();
    }

    @Override // io.sentry.a1
    public final y0 g0() {
        if (this.v.b()) {
            b0(null);
        }
        return u();
    }

    @Override // io.sentry.android.core.h0
    public final void j() {
        if (this.s == null) {
            return;
        }
        J(new a(this, (byte) 2));
    }

    @Override // io.sentry.a1
    public final boolean j0(z0 z0Var) {
        io.sentry.util.a aVar = this.r;
        aVar.e();
        try {
            this.q.add(z0Var);
            aVar.close();
            q();
            return this.s != null;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void q() {
        if (v0.i() && this.s == null) {
            io.sentry.util.a aVar = this.r;
            aVar.e();
            try {
                if (this.s != null) {
                    aVar.close();
                    return;
                }
                b bVar = new b(this, (byte) 0);
                Context context = this.m;
                g1 logger = this.n.getLogger();
                this.f112o.getClass();
                ConnectivityManager connectivityManagerG = G(context, logger);
                if (connectivityManagerG != null) {
                    if (io.sentry.config.a.w(context)) {
                        try {
                            connectivityManagerG.registerDefaultNetworkCallback(bVar);
                            this.s = bVar;
                            this.n.getLogger().g(f6.DEBUG, "Network callback registered successfully", new Object[0]);
                        } catch (Throwable th) {
                            logger.d(f6.WARNING, "registerDefaultNetworkCallback failed", th);
                            this.n.getLogger().g(f6.WARNING, "Failed to register network callback", new Object[0]);
                        }
                        aVar.close();
                    }
                    logger.g(f6.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                }
                this.n.getLogger().g(f6.WARNING, "Failed to register network callback", new Object[0]);
                aVar.close();
            } catch (Throwable th2) {
                try {
                    aVar.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public final y0 u() {
        if (this.t != null) {
            NetworkCapabilities networkCapabilities = this.t;
            if (networkCapabilities != null) {
                boolean zHasCapability = networkCapabilities.hasCapability(12);
                this.f112o.getClass();
                if (zHasCapability && networkCapabilities.hasCapability(16)) {
                    for (int i : B) {
                        if (networkCapabilities.hasTransport(i)) {
                            return y0.CONNECTED;
                        }
                    }
                }
            }
            return y0.DISCONNECTED;
        }
        ConnectivityManager connectivityManagerG = G(this.m, this.n.getLogger());
        if (connectivityManagerG == null) {
            return y0.UNKNOWN;
        }
        Context context = this.m;
        g1 logger = this.n.getLogger();
        if (!io.sentry.config.a.w(context)) {
            logger.g(f6.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return y0.NO_PERMISSION;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManagerG.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected() ? y0.CONNECTED : y0.DISCONNECTED;
            }
            logger.g(f6.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
            return y0.DISCONNECTED;
        } catch (Throwable th) {
            logger.d(f6.WARNING, "Could not retrieve Connection Status", th);
            return y0.UNKNOWN;
        }
    }

    @Override // io.sentry.a1
    public final void w0(z0 z0Var) {
        io.sentry.util.a aVar = this.r;
        aVar.e();
        try {
            this.q.remove(z0Var);
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
}
