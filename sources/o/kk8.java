package o;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class kk8 extends jk8 {
    public nj3 t;
    public nj3 u;
    public nj3 v;

    public kk8(sk8 sk8Var, WindowInsets windowInsets) {
        super(sk8Var, windowInsets);
        this.t = null;
        this.u = null;
        this.v = null;
    }

    @Override // o.pk8
    public nj3 k() {
        nj3 nj3Var = this.u;
        if (nj3Var != null) {
            return nj3Var;
        }
        nj3 nj3VarC = nj3.c(this.c.getMandatorySystemGestureInsets());
        this.u = nj3VarC;
        return nj3VarC;
    }

    @Override // o.pk8
    public nj3 m() {
        nj3 nj3Var = this.t;
        if (nj3Var != null) {
            return nj3Var;
        }
        nj3 nj3VarC = nj3.c(this.c.getSystemGestureInsets());
        this.t = nj3VarC;
        return nj3VarC;
    }

    @Override // o.pk8
    public nj3 o() {
        nj3 nj3Var = this.v;
        if (nj3Var != null) {
            return nj3Var;
        }
        nj3 nj3VarC = nj3.c(this.c.getTappableElementInsets());
        this.v = nj3VarC;
        return nj3VarC;
    }

    @Override // o.hk8, o.pk8
    public sk8 r(int i, int i2, int i3, int i4) {
        return sk8.g(this.c.inset(i, i2, i3, i4), null);
    }

    @Override // o.ik8, o.pk8
    public void z(nj3 nj3Var) {
    }

    public kk8(sk8 sk8Var, kk8 kk8Var) {
        super(sk8Var, kk8Var);
        this.t = null;
        this.u = null;
        this.v = null;
    }
}
