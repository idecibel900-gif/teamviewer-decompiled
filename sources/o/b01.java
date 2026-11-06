package o;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class b01 implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ c01 m;

    public b01(c01 c01Var) {
        this.m = c01Var;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.m.f(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        c01 c01Var = this.m;
        c01Var.g.a.clear();
        yb6 yb6Var = c01Var.h;
        synchronized (yb6Var) {
            yb6Var.a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        c01 c01Var = this.m;
        c01Var.g.a.clear();
        yb6 yb6Var = c01Var.h;
        synchronized (yb6Var) {
            yb6Var.a.c();
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        this.m.t.c.setValue(Boolean.valueOf(z));
    }
}
