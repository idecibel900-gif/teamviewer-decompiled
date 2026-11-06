package io.sentry.android.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks;
import io.sentry.a8;
import io.sentry.android.core.f;
import io.sentry.f6;
import io.sentry.h;
import io.sentry.n1;
import io.sentry.p0;
import io.sentry.v1;
import java.util.Set;
import java.util.WeakHashMap;
import o.k76;
import o.su2;
import o.ut2;

/* JADX INFO: loaded from: classes.dex */
public final class d extends FragmentManager$FragmentLifecycleCallbacks {
    public final n1 a;
    public final Set b;
    public final boolean c;
    public final WeakHashMap d;

    public d(n1 n1Var, Set set, boolean z) {
        n1Var.getClass();
        set.getClass();
        this.a = n1Var;
        this.b = set;
        this.c = z;
        this.d = new WeakHashMap();
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void a(su2 su2Var, ut2 ut2Var, Context context) {
        l(ut2Var, b.ATTACHED);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void b(su2 su2Var, ut2 ut2Var) {
        l(ut2Var, b.CREATED);
        m(ut2Var);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void c(su2 su2Var, ut2 ut2Var) {
        l(ut2Var, b.DESTROYED);
        n(ut2Var);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void d(su2 su2Var, ut2 ut2Var) {
        l(ut2Var, b.DETACHED);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void e(su2 su2Var, ut2 ut2Var) {
        l(ut2Var, b.PAUSED);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void f(su2 su2Var, ut2 ut2Var) {
        l(ut2Var, b.RESUMED);
        n(ut2Var);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void g(su2 su2Var, ut2 ut2Var, Bundle bundle) {
        l(ut2Var, b.SAVE_INSTANCE_STATE);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void h(su2 su2Var, ut2 ut2Var) {
        l(ut2Var, b.STARTED);
        n(ut2Var);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void i(su2 su2Var, ut2 ut2Var) {
        l(ut2Var, b.STOPPED);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void j(su2 su2Var, ut2 ut2Var, View view) {
        view.getClass();
        l(ut2Var, b.VIEW_CREATED);
        m(ut2Var);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void k(su2 su2Var, ut2 ut2Var) {
        l(ut2Var, b.VIEW_DESTROYED);
        n(ut2Var);
    }

    public final void l(ut2 ut2Var, b bVar) {
        if (this.b.contains(bVar)) {
            h hVar = new h();
            hVar.q = "navigation";
            hVar.d(bVar.getBreadcrumbName$sentry_android_fragment_release(), "state");
            String canonicalName = ut2Var.getClass().getCanonicalName();
            if (canonicalName == null) {
                canonicalName = ut2Var.getClass().getSimpleName();
            }
            hVar.d(canonicalName, "screen");
            hVar.s = "ui.fragment.lifecycle";
            hVar.u = f6.INFO;
            p0 p0Var = new p0();
            p0Var.d(ut2Var, "android:fragment");
            this.a.f(hVar, p0Var);
        }
    }

    public final void m(ut2 ut2Var) {
        if (ut2Var.O()) {
            String canonicalName = ut2Var.getClass().getCanonicalName();
            if (canonicalName == null) {
                canonicalName = ut2Var.getClass().getSimpleName();
            }
            n1 n1Var = this.a;
            if (n1Var.l().isEnableScreenTracking()) {
                n1Var.r(new f(canonicalName, (byte) 1));
            }
            if (n1Var.l().isTracingEnabled() && this.c) {
                WeakHashMap weakHashMap = this.d;
                if (weakHashMap.containsKey(ut2Var)) {
                    return;
                }
                k76 k76Var = new k76();
                n1Var.r(new c(k76Var, (byte) 0));
                v1 v1Var = (v1) k76Var.m;
                v1 v1VarY = v1Var != null ? v1Var.y("ui.load", canonicalName) : null;
                if (v1VarY != null) {
                    weakHashMap.put(ut2Var, v1VarY);
                    v1VarY.v().u = "auto.ui.fragment";
                }
            }
        }
    }

    public final void n(ut2 ut2Var) {
        v1 v1Var;
        if (this.a.l().isTracingEnabled() && this.c) {
            WeakHashMap weakHashMap = this.d;
            if (weakHashMap.containsKey(ut2Var) && (v1Var = (v1) weakHashMap.get(ut2Var)) != null) {
                a8 status = v1Var.getStatus();
                if (status == null) {
                    status = a8.OK;
                }
                v1Var.h(status);
            }
        }
    }
}
