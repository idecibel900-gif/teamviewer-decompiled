package o;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class nk8 extends mk8 {
    public static final sk8 x = sk8.g(WindowInsets.CONSUMED, null);

    public nk8(sk8 sk8Var, WindowInsets windowInsets) {
        super(sk8Var, windowInsets);
    }

    @Override // o.lk8, o.hk8, o.pk8
    public nj3 i(int i) {
        return nj3.c(this.c.getInsets(rk8.a(i)));
    }

    @Override // o.lk8, o.hk8, o.pk8
    public nj3 j(int i) {
        return nj3.c(this.c.getInsetsIgnoringVisibility(rk8.a(i)));
    }

    @Override // o.hk8, o.pk8
    public void p(View view) {
    }

    @Override // o.lk8, o.hk8, o.pk8
    public boolean u(int i) {
        return this.c.isVisible(rk8.a(i));
    }

    public nk8(sk8 sk8Var, nk8 nk8Var) {
        super(sk8Var, nk8Var);
    }
}
