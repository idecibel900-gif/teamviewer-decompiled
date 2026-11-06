package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.os.Bundle;
import io.sentry.f6;
import io.sentry.g3;
import io.sentry.p7;
import io.sentry.u4;
import io.sentry.z5;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class FeedbackShakeIntegration implements io.sentry.d2, Closeable, Application.ActivityLifecycleCallbacks, z5 {
    public final Application m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SentryAndroidOptions f91o;
    public volatile WeakReference q;
    public volatile boolean p = false;
    public final CopyOnWriteArrayList r = new CopyOnWriteArrayList();
    public final m2 n = new m2(g3.m);

    public FeedbackShakeIntegration(Application application) {
        this.m = application;
    }

    @Override // io.sentry.d2
    public final void Y(SentryAndroidOptions sentryAndroidOptions) {
        this.f91o = sentryAndroidOptions;
        sentryAndroidOptions.getFeedbackOptions().i = this;
        if (sentryAndroidOptions.getFeedbackOptions().g) {
            synchronized (this) {
                SentryAndroidOptions sentryAndroidOptions2 = this.f91o;
                if (!this.p && sentryAndroidOptions2 != null) {
                    this.p = true;
                    m2 m2Var = this.n;
                    synchronized (m2Var) {
                        m2Var.g = false;
                    }
                    try {
                        sentryAndroidOptions2.getExecutorService().submit(new u4((Object) this, (Object) sentryAndroidOptions2, (byte) 5));
                    } catch (Throwable th) {
                        sentryAndroidOptions2.getLogger().d(f6.WARNING, "Failed to submit shake detector initialization.", th);
                    }
                    io.sentry.util.b.a("FeedbackShake");
                    this.m.registerActivityLifecycleCallbacks(this);
                    sentryAndroidOptions2.getLogger().g(f6.DEBUG, "FeedbackShakeIntegration installed.", new Object[0]);
                    WeakReference weakReference = (WeakReference) w0.b.a;
                    Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
                    if (activity != null) {
                        this.q = new WeakReference(activity);
                        q(activity);
                    }
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.p) {
                this.p = false;
                this.m.unregisterActivityLifecycleCallbacks(this);
                this.n.a();
                this.q = null;
            }
        }
        this.r.clear();
    }

    public final boolean e(Activity activity) {
        for (f1 f1Var : this.r) {
            if (f1Var.b.get() != null && f1Var.a.get() == activity) {
                return true;
            }
        }
        return false;
    }

    public final void j(r2 r2Var) {
        boolean z;
        CopyOnWriteArrayList copyOnWriteArrayList = this.r;
        Iterator it = copyOnWriteArrayList.iterator();
        loop0: while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                f1 f1Var = (f1) it.next();
                Dialog dialog = (Dialog) f1Var.b.get();
                if (dialog == r2Var) {
                    if (copyOnWriteArrayList.remove(f1Var) || z) {
                        z = true;
                    }
                } else if (dialog == null) {
                    copyOnWriteArrayList.remove(f1Var);
                }
            }
        }
        if (z) {
            WeakReference weakReference = this.q;
            Activity activity = weakReference == null ? null : (Activity) weakReference.get();
            if (!this.p || activity == null) {
                return;
            }
            q(activity);
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
        WeakReference weakReference = this.q;
        if (activity == (weakReference != null ? (Activity) weakReference.get() : null)) {
            this.n.d();
            this.q = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.q = new WeakReference(activity);
        q(activity);
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

    public final void q(Activity activity) {
        if (this.f91o == null) {
            return;
        }
        m2 m2Var = this.n;
        m2Var.d();
        if (e(activity)) {
            return;
        }
        m2Var.c(activity, new p7(this, (byte) 3));
    }

    @Override // io.sentry.z5
    public final boolean u() {
        return this.p;
    }
}
