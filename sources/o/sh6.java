package o;

import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes.dex */
public final class sh6 implements s84, AutoCloseable {
    public final String m;
    public final rh6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2023o;

    public sh6(String str, rh6 rh6Var) {
        this.m = str;
        this.n = rh6Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    @Override // o.s84
    public final void e(LifecycleOwner lifecycleOwner, l84 l84Var) {
        if (l84Var == l84.ON_DESTROY) {
            this.f2023o = false;
            lifecycleOwner.getR().f(this);
        }
    }

    public final void j(a65 a65Var, x84 x84Var) {
        a65Var.getClass();
        x84Var.getClass();
        if (this.f2023o) {
            hk0.l("Already attached to lifecycleOwner");
            return;
        }
        this.f2023o = true;
        x84Var.a(this);
        a65Var.Q0(this.m, (fy0) this.n.a.q);
    }
}
