package o;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class yk implements Application.ActivityLifecycleCallbacks {
    public final double m;
    public final /* synthetic */ ll2 n;

    public yk(ll2 ll2Var, i46 i46Var) {
        this.n = ll2Var;
        f46 f46Var = i46Var.a;
        f4 f4Var = fe3.a;
        Object obj = f46Var.b.n.a.get(fe3.d);
        this.m = ((Number) (obj == null ? Double.valueOf(1.0d) : obj)).doubleValue();
    }

    public final void a(Context context) {
        long j;
        double d = this.m;
        if (d == 1.0d) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
        ll2 ll2Var = this.n;
        i46 i46Var = (i46) ((WeakReference) ll2Var.n).get();
        if (i46Var == null) {
            ll2Var.o();
            return;
        }
        m46 m46VarD = i46Var.d();
        if (m46VarD != null) {
            synchronized (m46VarD.c) {
                j = m46VarD.a.b;
            }
            m46VarD.a((long) (d * j));
        }
    }

    public final void b(Context context) {
        long j;
        if (this.m == 1.0d) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
        ll2 ll2Var = this.n;
        i46 i46Var = (i46) ((WeakReference) ll2Var.n).get();
        if (i46Var == null) {
            ll2Var.o();
            return;
        }
        m46 m46VarD = i46Var.d();
        if (m46VarD != null) {
            synchronized (m46VarD.c) {
                j = m46VarD.a.b;
            }
            m46VarD.a(j);
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
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
