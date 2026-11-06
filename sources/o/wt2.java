package o;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class wt2 extends lv1 implements u75, we8, p75, n8, ai6, wu2 {
    public final Activity s;
    public final Context t;
    public final Handler u;
    public final su2 v;
    public final /* synthetic */ xt2 w;

    public wt2(xt2 xt2Var) {
        this.w = xt2Var;
        Handler handler = new Handler();
        this.s = xt2Var;
        this.t = xt2Var;
        this.u = handler;
        this.v = new su2();
    }

    @Override // o.lv1
    public final View R(int i) {
        return this.w.findViewById(i);
    }

    @Override // o.lv1
    public final boolean S() {
        Window window = this.w.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // o.wu2
    public final void a(ut2 ut2Var) {
        this.w.F(ut2Var);
    }

    @Override // o.p75
    public final o75 c() {
        return this.w.c();
    }

    @Override // o.n8
    public final ky0 g() {
        return this.w.u;
    }

    @Override // o.u75
    public final void j(c71 c71Var) {
        this.w.j(c71Var);
    }

    @Override // o.u75
    public final void m(c71 c71Var) {
        this.w.m(c71Var);
    }

    @Override // o.we8
    /* JADX INFO: renamed from: o */
    public final ve8 getG0() {
        return this.w.getG0();
    }

    @Override // o.ai6
    public final a65 r() {
        return (a65) this.w.p.f302o;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    /* JADX INFO: renamed from: z */
    public final x84 getR() {
        return this.w.I;
    }
}
