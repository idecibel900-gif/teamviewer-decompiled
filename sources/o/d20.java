package o;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class d20 implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final d20 q = new d20();
    public final AtomicBoolean m = new AtomicBoolean();
    public final AtomicBoolean n = new AtomicBoolean();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f580o = new ArrayList();
    public boolean p = false;

    public static void b(Application application) {
        d20 d20Var = q;
        synchronized (d20Var) {
            try {
                if (!d20Var.p) {
                    application.registerActivityLifecycleCallbacks(d20Var);
                    application.registerComponentCallbacks(d20Var);
                    d20Var.p = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(c20 c20Var) {
        synchronized (q) {
            this.f580o.add(c20Var);
        }
    }

    public final void c(boolean z) {
        synchronized (q) {
            try {
                Iterator it = this.f580o.iterator();
                while (it.hasNext()) {
                    ((c20) it.next()).onBackgroundStateChanged(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean zCompareAndSet = this.m.compareAndSet(true, false);
        this.n.set(true);
        if (zCompareAndSet) {
            c(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean zCompareAndSet = this.m.compareAndSet(true, false);
        this.n.set(true);
        if (zCompareAndSet) {
            c(false);
        }
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

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.m.compareAndSet(false, true)) {
            this.n.set(true);
            c(true);
        }
    }
}
