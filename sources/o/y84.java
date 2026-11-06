package o;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes.dex */
public final class y84 implements gb6, DefaultLifecycleObserver {
    public final x84 m;
    public final bp3 n;

    public y84(x84 x84Var, bp3 bp3Var) {
        this.m = x84Var;
        this.n = bp3Var;
    }

    @Override // o.gb6
    public final Object b(h46 h46Var) {
        return vs1.j(this.m, h46Var);
    }

    @Override // o.gb6
    public final void c() {
        this.m.f(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        this.n.j(null);
    }

    @Override // o.gb6
    public final void start() {
        this.m.a(this);
    }
}
