package io.sentry.android.replay;

import android.graphics.Point;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.f6;
import io.sentry.m7;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import o.iq8;
import o.lv0;
import o.qv0;

/* JADX INFO: loaded from: classes.dex */
public final class k0 implements g, Closeable {
    public volatile Handler A;
    public final SentryAndroidOptions m;
    public final ReplayIntegration n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ReplayIntegration f159o;
    public final m7 p;
    public final ScheduledExecutorService q;
    public final AtomicBoolean r;
    public final ArrayList s;
    public final Point t;
    public final WeakHashMap u;
    public final io.sentry.util.a v;
    public final io.sentry.util.a w;
    public final io.sentry.util.a x;
    public volatile h0 y;
    public volatile HandlerThread z;

    public k0(SentryAndroidOptions sentryAndroidOptions, ReplayIntegration replayIntegration, ReplayIntegration replayIntegration2, m7 m7Var, io.sentry.android.replay.util.f fVar) {
        m7Var.getClass();
        fVar.getClass();
        this.m = sentryAndroidOptions;
        this.n = replayIntegration;
        this.f159o = replayIntegration2;
        this.p = m7Var;
        this.q = fVar;
        this.r = new AtomicBoolean(false);
        this.s = new ArrayList();
        this.t = new Point();
        this.u = new WeakHashMap();
        this.v = new io.sentry.util.a();
        this.w = new io.sentry.util.a();
        this.x = new io.sentry.util.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        reset();
        m7 m7Var = this.p;
        h0 h0Var = this.y;
        Handler handler = (Handler) m7Var.n;
        if (h0Var != null) {
            handler.removeCallbacks(h0Var);
        }
        io.sentry.util.a aVar = this.x;
        aVar.e();
        try {
            Handler handler2 = this.A;
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
            }
            HandlerThread handlerThread = this.z;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            iq8.l(aVar, null);
            z();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                iq8.l(aVar, th);
                throw th2;
            }
        }
    }

    @Override // io.sentry.android.replay.g
    public final void e(View view, boolean z) {
        b0 b0Var;
        b0 b0Var2;
        b0 b0Var3;
        view.getClass();
        io.sentry.util.a aVar = this.v;
        aVar.e();
        byte b = 0;
        try {
            if (!z) {
                View.OnLayoutChangeListener onLayoutChangeListener = (View.OnLayoutChangeListener) this.u.remove(view);
                if (onLayoutChangeListener != null) {
                    view.removeOnLayoutChangeListener(onLayoutChangeListener);
                }
                h0 h0Var = this.y;
                if (h0Var != null && (b0Var2 = h0Var.f154o) != null) {
                    b0Var2.c(view);
                }
                qv0.d0(this.s, new j0(view, b));
                WeakReference weakReference = (WeakReference) lv0.w0(this.s);
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && !view.equals(view2)) {
                    h0 h0Var2 = this.y;
                    if (h0Var2 != null && (b0Var = h0Var2.f154o) != null) {
                        b0Var.a(view2);
                    }
                    j(view2);
                    WeakHashMap weakHashMap = this.u;
                    if (!weakHashMap.containsKey(view2)) {
                        g0 g0Var = new g0(this, b);
                        weakHashMap.put(view2, g0Var);
                        view2.addOnLayoutChangeListener(g0Var);
                    }
                }
            } else {
                if (io.sentry.config.a.t(view) == null) {
                    this.m.getLogger().g(f6.WARNING, "Root view does not have a phone window, skipping.", new Object[0]);
                    iq8.l(aVar, null);
                    return;
                }
                this.s.add(new WeakReference(view));
                h0 h0Var3 = this.y;
                if (h0Var3 != null && (b0Var3 = h0Var3.f154o) != null) {
                    b0Var3.a(view);
                }
                j(view);
                WeakHashMap weakHashMap2 = this.u;
                if (!weakHashMap2.containsKey(view)) {
                    g0 g0Var2 = new g0(this, b);
                    weakHashMap2.put(view, g0Var2);
                    view.addOnLayoutChangeListener(g0Var2);
                }
            }
            iq8.l(aVar, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                iq8.l(aVar, th);
                throw th2;
            }
        }
    }

    public final void j(View view) {
        view.getClass();
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            i0 i0Var = new i0(this, view);
            if (view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
                return;
            }
            try {
                view.getViewTreeObserver().addOnPreDrawListener(i0Var);
                return;
            } catch (IllegalStateException unused) {
                return;
            }
        }
        int width = view.getWidth();
        Point point = this.t;
        if (width == point.x && view.getHeight() == point.y) {
            return;
        }
        point.set(view.getWidth(), view.getHeight());
        this.f159o.H0(view.getWidth(), view.getHeight());
    }

    public final Handler q() {
        if (this.A == null) {
            io.sentry.util.a aVar = this.x;
            aVar.e();
            try {
                if (this.A == null) {
                    this.z = new HandlerThread("SentryReplayBackgroundProcessing");
                    HandlerThread handlerThread = this.z;
                    if (handlerThread != null) {
                        handlerThread.start();
                    }
                    HandlerThread handlerThread2 = this.z;
                    handlerThread2.getClass();
                    this.A = new Handler(handlerThread2.getLooper());
                }
                iq8.l(aVar, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    iq8.l(aVar, th);
                    throw th2;
                }
            }
        }
        Handler handler = this.A;
        handler.getClass();
        return handler;
    }

    public final void reset() {
        b0 b0Var;
        this.t.set(0, 0);
        io.sentry.util.a aVar = this.v;
        aVar.e();
        try {
            Iterator it = this.s.iterator();
            while (it.hasNext()) {
                View view = (View) ((WeakReference) it.next()).get();
                if (view != null) {
                    View.OnLayoutChangeListener onLayoutChangeListener = (View.OnLayoutChangeListener) this.u.remove(view);
                    if (onLayoutChangeListener != null) {
                        view.removeOnLayoutChangeListener(onLayoutChangeListener);
                    }
                    h0 h0Var = this.y;
                    if (h0Var != null && (b0Var = h0Var.f154o) != null) {
                        b0Var.c(view);
                    }
                }
            }
            this.s.clear();
            iq8.l(aVar, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                iq8.l(aVar, th);
                throw th2;
            }
        }
    }

    public final void u() {
        h0 h0Var = this.y;
        if (h0Var != null) {
            b0 b0Var = h0Var.f154o;
            if (b0Var != null) {
                b0Var.f139o.set(false);
                WeakReference weakReference = b0Var.n;
                b0Var.c(weakReference != null ? (View) weakReference.get() : null);
            }
            h0Var.q.getAndSet(false);
        }
    }

    public final void z() {
        h0 h0Var = this.y;
        if (h0Var != null) {
            b0 b0Var = h0Var.f154o;
            if (b0Var != null) {
                b0Var.f139o.set(false);
                WeakReference weakReference = b0Var.n;
                b0Var.c(weakReference != null ? (View) weakReference.get() : null);
                WeakReference weakReference2 = b0Var.n;
                if (weakReference2 != null) {
                    weakReference2.clear();
                }
                b0Var.q.close();
            }
            h0Var.f154o = null;
            h0Var.q.getAndSet(false);
        }
        io.sentry.util.a aVar = this.w;
        aVar.e();
        try {
            this.y = null;
            iq8.l(aVar, null);
            this.r.set(false);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                iq8.l(aVar, th);
                throw th2;
            }
        }
    }
}
