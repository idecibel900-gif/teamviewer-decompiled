package io.sentry.android.replay;

import android.view.View;
import android.view.ViewTreeObserver;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.f6;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import o.gk0;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements ViewTreeObserver.OnDrawListener {
    public final SentryAndroidOptions m;
    public WeakReference n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AtomicBoolean f139o;
    public final AtomicBoolean p;
    public final io.sentry.android.replay.screenshot.l q;

    public b0(SentryAndroidOptions sentryAndroidOptions, ReplayIntegration replayIntegration, c0 c0Var, k0 k0Var) {
        io.sentry.android.replay.screenshot.l cVar;
        k0Var.getClass();
        this.m = sentryAndroidOptions;
        this.f139o = new AtomicBoolean(true);
        io.sentry.android.replay.util.b bVar = new io.sentry.android.replay.util.b();
        this.p = new AtomicBoolean(false);
        int i = z.a[sentryAndroidOptions.getSessionReplay().n.ordinal()];
        if (i == 1) {
            cVar = new io.sentry.android.replay.screenshot.c(sentryAndroidOptions, replayIntegration, c0Var, k0Var);
        } else {
            if (i != 2) {
                gk0.s();
                throw null;
            }
            cVar = new io.sentry.android.replay.screenshot.k(k0Var, replayIntegration, sentryAndroidOptions, c0Var, bVar, new a0(this, (byte) 0));
        }
        this.q = cVar;
    }

    public final void a(View view) {
        view.getClass();
        WeakReference weakReference = this.n;
        c(weakReference != null ? (View) weakReference.get() : null);
        WeakReference weakReference2 = this.n;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.n = new WeakReference(view);
        if (view.getViewTreeObserver() != null && view.getViewTreeObserver().isAlive()) {
            try {
                view.getViewTreeObserver().addOnDrawListener(this);
            } catch (IllegalStateException unused) {
            }
        }
        this.p.set(true);
        this.q.onContentChanged();
    }

    public final void b() {
        SentryAndroidOptions sentryAndroidOptions = this.m;
        boolean z = sentryAndroidOptions.getSessionReplay().m;
        AtomicBoolean atomicBoolean = this.f139o;
        if (z) {
            sentryAndroidOptions.getLogger().g(f6.DEBUG, "Capturing screenshot, isCapturing: %s", Boolean.valueOf(atomicBoolean.get()));
        }
        if (!atomicBoolean.get()) {
            if (sentryAndroidOptions.getSessionReplay().m) {
                sentryAndroidOptions.getLogger().g(f6.DEBUG, "ScreenshotRecorder is paused, not capturing screenshot", new Object[0]);
                return;
            }
            return;
        }
        boolean z2 = sentryAndroidOptions.getSessionReplay().m;
        io.sentry.android.replay.screenshot.l lVar = this.q;
        AtomicBoolean atomicBoolean2 = this.p;
        if (z2) {
            sentryAndroidOptions.getLogger().g(f6.DEBUG, "Capturing screenshot, contentChanged: %s, lastCaptureSuccessful: %s", Boolean.valueOf(atomicBoolean2.get()), Boolean.valueOf(lVar.a()));
        }
        if (!atomicBoolean2.get()) {
            lVar.c();
            return;
        }
        WeakReference weakReference = this.n;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
            sentryAndroidOptions.getLogger().g(f6.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        if (io.sentry.config.a.t(view) == null) {
            sentryAndroidOptions.getLogger().g(f6.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        try {
            atomicBoolean2.set(false);
            lVar.b(view);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().d(f6.WARNING, "Failed to capture replay recording", th);
        }
    }

    public final void c(View view) {
        this.m.getReplayController().getClass();
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().removeOnDrawListener(this);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        if (this.f139o.get()) {
            WeakReference weakReference = this.n;
            View view = weakReference != null ? (View) weakReference.get() : null;
            if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
                this.m.getLogger().g(f6.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            } else {
                this.p.set(true);
                this.q.onContentChanged();
            }
        }
    }
}
