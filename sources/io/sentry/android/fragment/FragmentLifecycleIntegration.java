package io.sentry.android.fragment;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.d2;
import io.sentry.d6;
import io.sentry.f6;
import io.sentry.n1;
import io.sentry.w4;
import java.io.Closeable;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import o.ep1;
import o.gu2;
import o.im3;
import o.la2;
import o.su2;
import o.xt2;
import o.yt2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\rB!\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/sentry/android/fragment/FragmentLifecycleIntegration;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Lio/sentry/d2;", "Ljava/io/Closeable;", "Landroid/app/Application;", "application", "", "Lio/sentry/android/fragment/b;", "filterFragmentLifecycleBreadcrumbs", "", "enableAutoFragmentLifecycleTracing", "<init>", "(Landroid/app/Application;Ljava/util/Set;Z)V", "(Landroid/app/Application;)V", "enableFragmentLifecycleBreadcrumbs", "(Landroid/app/Application;ZZ)V", "sentry-android-fragment_release"}, k = 1, mv = {1, ep1.b, 0}, xi = 48)
public final class FragmentLifecycleIntegration implements Application.ActivityLifecycleCallbacks, d2, Closeable {
    public final Application m;
    public final Set n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f135o;
    public n1 p;
    public SentryAndroidOptions q;

    static {
        d6.d().b("maven:io.sentry:sentry-android-fragment", "8.58.0");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentLifecycleIntegration(Application application, boolean z, boolean z2) {
        application.getClass();
        b.Companion.getClass();
        Set set = z ? b.states : null;
        this(application, (Set<? extends b>) (set == null ? la2.m : set), z2);
    }

    @Override // io.sentry.d2
    public final void Y(SentryAndroidOptions sentryAndroidOptions) {
        this.p = w4.a;
        this.q = sentryAndroidOptions;
        this.m.registerActivityLifecycleCallbacks(this);
        sentryAndroidOptions.getLogger().g(f6.DEBUG, "FragmentLifecycleIntegration installed.", new Object[0]);
        io.sentry.util.b.a("FragmentLifecycle");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.m.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.q;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().g(f6.DEBUG, "FragmentLifecycleIntegration removed.", new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        xt2 xt2Var = activity instanceof xt2 ? (xt2) activity : null;
        if (xt2Var != null) {
            su2 su2VarD = xt2Var.D();
            n1 n1Var = this.p;
            if (n1Var == null) {
                im3.e0("scopes");
                throw null;
            }
            d dVar = new d(n1Var, this.n, this.f135o);
            yt2 yt2Var = su2VarD.p;
            yt2Var.getClass();
            ((CopyOnWriteArrayList) yt2Var.f2642o).add(new gu2(dVar, true));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentLifecycleIntegration(Application application) {
        this(application, (Set<? extends b>) b.states, false);
        application.getClass();
        b.Companion.getClass();
    }

    public FragmentLifecycleIntegration(Application application, Set<? extends b> set, boolean z) {
        application.getClass();
        set.getClass();
        this.m = application;
        this.n = set;
        this.f135o = z;
    }
}
