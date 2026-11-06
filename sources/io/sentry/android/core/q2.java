package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.sentry.q7;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class q2 implements Application.ActivityLifecycleCallbacks {
    public final WeakReference m;
    public final /* synthetic */ r2 n;

    public q2(r2 r2Var, WeakReference weakReference) {
        this.n = r2Var;
        this.m = weakReference;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (activity == this.m.get()) {
            r2 r2Var = this.n;
            m2 m2Var = r2Var.q;
            if (m2Var != null) {
                m2Var.a();
                r2Var.q = null;
            }
            if (r2Var.r != null) {
                Activity activityA = r2.a(r2Var.getContext());
                if (activityA != null) {
                    activityA.getApplication().unregisterActivityLifecycleCallbacks(r2Var.r);
                }
                r2Var.r = null;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m2 m2Var;
        if (activity != this.m.get() || (m2Var = this.n.q) == null) {
            return;
        }
        m2Var.d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        r2 r2Var;
        m2 m2Var;
        WeakReference weakReference = this.m;
        if (activity != weakReference.get() || (m2Var = (r2Var = this.n).q) == null) {
            return;
        }
        m2Var.c(activity, new q7(r2Var, weakReference, (byte) 4));
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
