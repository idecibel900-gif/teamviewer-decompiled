package o;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class y30 implements f75, b40, c40 {
    public final /* synthetic */ f40 m;

    public /* synthetic */ y30(f40 f40Var) {
        this.m = f40Var;
    }

    public void a(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        this.m.a(0);
    }

    @Override // o.f75
    public sk8 t(View view, sk8 sk8Var) {
        int iA = sk8Var.a();
        f40 f40Var = this.m;
        f40Var.h = iA;
        f40Var.i = sk8Var.b();
        f40Var.j = sk8Var.c();
        f40Var.e();
        return sk8Var;
    }
}
