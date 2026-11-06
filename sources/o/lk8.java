package o;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class lk8 extends kk8 {
    public static final sk8 w = sk8.g(WindowInsets.CONSUMED, null);

    public lk8(sk8 sk8Var, WindowInsets windowInsets) {
        super(sk8Var, windowInsets);
    }

    @Override // o.hk8, o.pk8
    public final void d(View view) {
    }

    @Override // o.hk8, o.pk8
    public nj3 i(int i) {
        return nj3.c(this.c.getInsets(qk8.a(i)));
    }

    @Override // o.hk8, o.pk8
    public nj3 j(int i) {
        return nj3.c(this.c.getInsetsIgnoringVisibility(qk8.a(i)));
    }

    @Override // o.hk8, o.pk8
    public boolean u(int i) {
        return this.c.isVisible(qk8.a(i));
    }

    public lk8(sk8 sk8Var, lk8 lk8Var) {
        super(sk8Var, lk8Var);
    }
}
