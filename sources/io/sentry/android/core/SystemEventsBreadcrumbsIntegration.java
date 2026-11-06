package io.sentry.android.core;

import android.content.Context;
import android.content.IntentFilter;
import android.os.HandlerThread;
import io.sentry.b5;
import io.sentry.f6;
import io.sentry.w4;
import java.io.Closeable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class SystemEventsBreadcrumbsIntegration implements io.sentry.d2, Closeable, h0 {
    public final Context m;
    public volatile w2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SentryAndroidOptions f95o;
    public io.sentry.n1 p;
    public final String[] q;
    public volatile boolean r = false;
    public volatile boolean s = false;
    public volatile IntentFilter t = null;
    public volatile HandlerThread u = null;
    public final AtomicBoolean v = new AtomicBoolean(false);
    public final io.sentry.util.a w = new io.sentry.util.a();
    public v2 x;

    public SystemEventsBreadcrumbsIntegration(Context context) {
        String[] strArr = {"android.intent.action.ACTION_SHUTDOWN", "android.intent.action.AIRPLANE_MODE", "android.intent.action.BATTERY_CHANGED", "android.intent.action.CAMERA_BUTTON", "android.intent.action.CONFIGURATION_CHANGED", "android.intent.action.DATE_CHANGED", "android.intent.action.DEVICE_STORAGE_LOW", "android.intent.action.DEVICE_STORAGE_OK", "android.intent.action.DOCK_EVENT", "android.intent.action.DREAMING_STARTED", "android.intent.action.DREAMING_STOPPED", "android.intent.action.INPUT_METHOD_CHANGED", "android.intent.action.LOCALE_CHANGED", "android.intent.action.SCREEN_OFF", "android.intent.action.SCREEN_ON", "android.intent.action.TIMEZONE_CHANGED", "android.intent.action.TIME_SET", "android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.POWER_SAVE_MODE_CHANGED"};
        Context applicationContext = context.getApplicationContext();
        this.m = applicationContext == null ? context : applicationContext;
        this.q = strArr;
    }

    @Override // io.sentry.d2
    public final void Y(SentryAndroidOptions sentryAndroidOptions) {
        this.f95o = sentryAndroidOptions;
        this.p = w4.a;
        sentryAndroidOptions.getLogger().g(f6.DEBUG, "SystemEventsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f95o.isEnableSystemEventBreadcrumbs()));
        if (this.f95o.isEnableSystemEventBreadcrumbs()) {
            k0.q.e(this);
            if (v0.i()) {
                q(this.p, this.f95o);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.util.a aVar = this.w;
        aVar.e();
        try {
            this.r = true;
            this.t = null;
            if (this.u != null) {
                this.u.quit();
            }
            this.u = null;
            aVar.close();
            k0.q.u(this);
            SentryAndroidOptions sentryAndroidOptions = this.f95o;
            if (sentryAndroidOptions != null) {
                try {
                    sentryAndroidOptions.getExecutorService().submit(new b5(this, (byte) 10));
                } catch (RejectedExecutionException unused) {
                    u(this.f95o);
                }
            }
            SentryAndroidOptions sentryAndroidOptions2 = this.f95o;
            if (sentryAndroidOptions2 != null) {
                sentryAndroidOptions2.getLogger().g(f6.DEBUG, "SystemEventsBreadcrumbsIntegration removed.", new Object[0]);
            }
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.android.core.h0
    public final void e() {
        if (this.p == null || this.f95o == null) {
            return;
        }
        this.s = false;
        q(this.p, this.f95o);
    }

    @Override // io.sentry.android.core.h0
    public final void j() {
        SentryAndroidOptions sentryAndroidOptions = this.f95o;
        if (sentryAndroidOptions == null) {
            return;
        }
        try {
            sentryAndroidOptions.getExecutorService().submit(new b5(this, (byte) 10));
        } catch (RejectedExecutionException unused) {
            u(this.f95o);
        }
    }

    public final void q(io.sentry.n1 n1Var, SentryAndroidOptions sentryAndroidOptions) {
        if (sentryAndroidOptions.isEnableSystemEventBreadcrumbs() && !this.r && !this.s && this.n == null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(new d2(this, n1Var, sentryAndroidOptions));
            } catch (Throwable unused) {
                sentryAndroidOptions.getLogger().g(f6.WARNING, "Failed to start SystemEventsBreadcrumbsIntegration on executor thread.", new Object[0]);
            }
        }
    }

    public final void u(SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.util.a aVar = this.w;
        aVar.e();
        try {
            this.s = true;
            w2 w2Var = this.n;
            this.n = null;
            aVar.close();
            if (w2Var != null) {
                try {
                    this.m.unregisterReceiver(w2Var);
                } catch (Throwable th) {
                    sentryAndroidOptions.getLogger().b(f6.ERROR, th, "Failed to unregister SystemEventsBroadcastReceiver", new Object[0]);
                }
            }
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
