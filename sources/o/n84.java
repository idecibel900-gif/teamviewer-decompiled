package o;

import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes.dex */
public final class n84 implements s84, me1 {
    public final x84 m;
    public final de1 n;

    public n84(x84 x84Var, de1 de1Var) {
        de1Var.getClass();
        this.m = x84Var;
        this.n = de1Var;
        if (x84Var.i == m84.m) {
            ds1.A(de1Var, null);
        }
    }

    @Override // o.s84
    public final void e(LifecycleOwner lifecycleOwner, l84 l84Var) {
        x84 x84Var = this.m;
        if (x84Var.i.compareTo(m84.m) <= 0) {
            x84Var.f(this);
            ds1.A(this.n, null);
        }
    }

    @Override // o.me1
    public final de1 getCoroutineContext() {
        return this.n;
    }
}
