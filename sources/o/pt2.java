package o;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class pt2 extends lv1 {
    public final /* synthetic */ ut2 s;

    public pt2(ut2 ut2Var) {
        this.s = ut2Var;
    }

    @Override // o.lv1
    public final View R(int i) {
        ut2 ut2Var = this.s;
        View view = ut2Var.U;
        if (view != null) {
            return view.findViewById(i);
        }
        hk0.l(e41.i("Fragment ", ut2Var, " does not have a view"));
        return null;
    }

    @Override // o.lv1
    public final boolean S() {
        return this.s.U != null;
    }
}
