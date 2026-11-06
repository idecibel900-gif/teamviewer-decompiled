package o;

import android.os.Build;
import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class rj3 extends uu0 implements Runnable, f75, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final wk8 f1926o;
    public boolean p;
    public boolean q;
    public sk8 r;

    public rj3(wk8 wk8Var) {
        super(!wk8Var.t ? 1 : 0);
        this.f1926o = wk8Var;
    }

    @Override // o.uu0
    public final void f(xj8 xj8Var) {
        this.p = false;
        this.q = false;
        sk8 sk8Var = this.r;
        if (xj8Var.a.b() > 0 && sk8Var != null) {
            pk8 pk8Var = sk8Var.a;
            wk8 wk8Var = this.f1926o;
            wk8Var.s.f(m77.C(pk8Var.i(8)));
            wk8Var.r.f(m77.C(pk8Var.i(8)));
            wk8.b(wk8Var, sk8Var);
        }
        this.r = null;
    }

    @Override // o.uu0
    public final void g(xj8 xj8Var) {
        this.p = true;
        this.q = true;
    }

    @Override // o.uu0
    public final sk8 h(sk8 sk8Var, List list) {
        wk8 wk8Var = this.f1926o;
        wk8.b(wk8Var, sk8Var);
        return wk8Var.t ? sk8.b : sk8Var;
    }

    @Override // o.uu0
    public final lh7 i(xj8 xj8Var, lh7 lh7Var) {
        this.p = false;
        return lh7Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.p) {
            this.p = false;
            this.q = false;
            sk8 sk8Var = this.r;
            if (sk8Var != null) {
                wk8 wk8Var = this.f1926o;
                wk8Var.s.f(m77.C(sk8Var.a.i(8)));
                wk8.b(wk8Var, sk8Var);
                this.r = null;
            }
        }
    }

    @Override // o.f75
    public final sk8 t(View view, sk8 sk8Var) {
        this.r = sk8Var;
        wk8 wk8Var = this.f1926o;
        mb8 mb8Var = wk8Var.r;
        pk8 pk8Var = sk8Var.a;
        mb8Var.f(m77.C(pk8Var.i(8)));
        if (this.p) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.q) {
            wk8Var.s.f(m77.C(pk8Var.i(8)));
            wk8.b(wk8Var, sk8Var);
        }
        return wk8Var.t ? sk8.b : sk8Var;
    }
}
