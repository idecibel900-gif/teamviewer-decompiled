package o;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class ik8 extends hk8 {
    public nj3 s;

    public ik8(sk8 sk8Var, ik8 ik8Var) {
        super(sk8Var, ik8Var);
        this.s = null;
        this.s = ik8Var.s;
    }

    @Override // o.pk8
    public sk8 b() {
        return sk8.g(this.c.consumeStableInsets(), null);
    }

    @Override // o.pk8
    public sk8 c() {
        return sk8.g(this.c.consumeSystemWindowInsets(), null);
    }

    @Override // o.pk8
    public final nj3 l() {
        nj3 nj3Var = this.s;
        if (nj3Var != null) {
            return nj3Var;
        }
        WindowInsets windowInsets = this.c;
        nj3 nj3VarB = nj3.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        this.s = nj3VarB;
        return nj3VarB;
    }

    @Override // o.pk8
    public boolean s() {
        return this.c.isConsumed();
    }

    @Override // o.pk8
    public void z(nj3 nj3Var) {
        this.s = nj3Var;
    }

    public ik8(sk8 sk8Var, WindowInsets windowInsets) {
        super(sk8Var, windowInsets);
        this.s = null;
    }
}
