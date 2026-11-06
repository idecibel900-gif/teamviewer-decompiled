package o;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class ak8 extends gk8 {
    public final WindowInsets.Builder e;

    public ak8(sk8 sk8Var) {
        super(sk8Var);
        WindowInsets windowInsetsF = sk8Var.f();
        this.e = windowInsetsF != null ? zj8.c(windowInsetsF) : gx5.f();
    }

    @Override // o.gk8
    public sk8 b() {
        a();
        sk8 sk8VarG = sk8.g(this.e.build(), null);
        nj3[] nj3VarArr = this.b;
        pk8 pk8Var = sk8VarG.a;
        pk8Var.w(nj3VarArr);
        pk8Var.v(null);
        pk8Var.B(this.c);
        pk8Var.C(this.d);
        return sk8VarG;
    }

    @Override // o.gk8
    public void e(nj3 nj3Var) {
        this.e.setMandatorySystemGestureInsets(nj3Var.d());
    }

    @Override // o.gk8
    public void f(nj3 nj3Var) {
        this.e.setStableInsets(nj3Var.d());
    }

    @Override // o.gk8
    public void g(nj3 nj3Var) {
        this.e.setSystemGestureInsets(nj3Var.d());
    }

    @Override // o.gk8
    public void h(nj3 nj3Var) {
        this.e.setSystemWindowInsets(nj3Var.d());
    }

    @Override // o.gk8
    public void i(nj3 nj3Var) {
        this.e.setTappableElementInsets(nj3Var.d());
    }

    public ak8() {
        this.e = gx5.f();
    }
}
