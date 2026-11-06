package o;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class x7 implements Application.ActivityLifecycleCallbacks {
    public Object m;
    public Activity n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f2485o;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;

    public x7(Activity activity) {
        this.n = activity;
        this.f2485o = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.n == activity) {
            this.n = null;
            this.q = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.q || this.r || this.p) {
            return;
        }
        Object obj = this.m;
        try {
            Object obj2 = y7.c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f2485o) {
                y7.g.postAtFrontOfQueue(new it8(y7.b.get(activity), obj2, (byte) 4));
                this.r = true;
                this.m = null;
            }
        } catch (Throwable th) {
            io.sentry.android.core.v0.d("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.n == activity) {
            this.p = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
