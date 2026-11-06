package o;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class u02 extends lv1 {
    public final /* synthetic */ pt2 s;
    public final /* synthetic */ v02 t;

    public u02(v02 v02Var, pt2 pt2Var) {
        this.t = v02Var;
        this.s = pt2Var;
    }

    @Override // o.lv1
    public final View R(int i) {
        pt2 pt2Var = this.s;
        if (pt2Var.S()) {
            return pt2Var.R(i);
        }
        Dialog dialog = this.t.A0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // o.lv1
    public final boolean S() {
        return this.s.S() || this.t.E0;
    }
}
