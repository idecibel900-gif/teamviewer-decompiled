package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import androidx.lifecycle.LifecycleOwner;
import io.sentry.a8;
import io.sentry.f6;
import io.sentry.w4;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o.m84;

/* JADX INFO: loaded from: classes.dex */
public final class UserInteractionIntegration implements io.sentry.d2, Closeable, Application.ActivityLifecycleCallbacks {
    public final Application m;
    public io.sentry.n1 n;
    public final WeakHashMap q = new WeakHashMap();
    public final Object r = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SentryAndroidOptions f96o;
    public final boolean p = io.sentry.util.i.b(this.f96o, "o.x84");

    public UserInteractionIntegration(Application application) {
        this.m = application;
    }

    @Override // io.sentry.d2
    public final void Y(SentryAndroidOptions sentryAndroidOptions) {
        this.f96o = sentryAndroidOptions;
        this.n = w4.a;
        boolean z = sentryAndroidOptions.isEnableUserInteractionBreadcrumbs() || this.f96o.isEnableUserInteractionTracing();
        io.sentry.g1 logger = this.f96o.getLogger();
        f6 f6Var = f6.DEBUG;
        logger.g(f6Var, "UserInteractionIntegration enabled: %s", Boolean.valueOf(z));
        if (z) {
            this.m.registerActivityLifecycleCallbacks(this);
            this.f96o.getLogger().g(f6Var, "UserInteractionIntegration installed.", new Object[0]);
            io.sentry.util.b.a("UserInteraction");
            if (this.p) {
                WeakReference weakReference = (WeakReference) w0.b.a;
                Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
                if ((activity instanceof LifecycleOwner) && ((LifecycleOwner) activity).getR().i == m84.q) {
                    e(activity);
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList<Window> arrayList;
        this.m.unregisterActivityLifecycleCallbacks(this);
        synchronized (this.r) {
            arrayList = new ArrayList(this.q.keySet());
        }
        for (Window window : arrayList) {
            if (window != null) {
                j(window);
            }
        }
        synchronized (this.r) {
            this.q.clear();
        }
        SentryAndroidOptions sentryAndroidOptions = this.f96o;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().g(f6.DEBUG, "UserInteractionIntegration removed.", new Object[0]);
        }
    }

    public final void e(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f96o;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().g(f6.INFO, "Window was null in startTracking", new Object[0]);
                return;
            }
            return;
        }
        if (this.n == null || this.f96o == null) {
            return;
        }
        synchronized (this.r) {
            try {
                WeakReference weakReference = (WeakReference) this.q.get(window);
                if (weakReference == null || weakReference.get() == null) {
                    Window.Callback callback = window.getCallback();
                    if (callback == null) {
                        callback = new io.sentry.android.core.internal.gestures.b();
                    }
                    io.sentry.android.core.internal.gestures.h hVar = new io.sentry.android.core.internal.gestures.h(callback, activity, new io.sentry.android.core.internal.gestures.g(activity, this.n, this.f96o), this.f96o);
                    window.setCallback(hVar);
                    synchronized (this.r) {
                        this.q.put(window, new WeakReference(hVar));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(Window window) {
        io.sentry.android.core.internal.gestures.h hVar;
        Window.Callback callback = window.getCallback();
        if (callback instanceof io.sentry.android.core.internal.gestures.h) {
            io.sentry.android.core.internal.gestures.h hVar2 = (io.sentry.android.core.internal.gestures.h) callback;
            hVar2.r = true;
            hVar2.f109o.d(a8.CANCELLED);
            hVar2.p.a();
            Window.Callback callback2 = hVar2.n;
            if (callback2 instanceof io.sentry.android.core.internal.gestures.b) {
                window.setCallback(null);
            } else {
                window.setCallback(callback2);
            }
            synchronized (this.r) {
                this.q.remove(window);
            }
            return;
        }
        synchronized (this.r) {
            try {
                WeakReference weakReference = (WeakReference) this.q.remove(window);
                hVar = weakReference != null ? (io.sentry.android.core.internal.gestures.h) weakReference.get() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (hVar != null) {
            hVar.r = true;
            hVar.f109o.d(a8.CANCELLED);
            hVar.p.a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Window window = activity.getWindow();
        if (window != null) {
            j(window);
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = this.f96o;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().g(f6.INFO, "Window was null in stopTracking", new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        e(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
