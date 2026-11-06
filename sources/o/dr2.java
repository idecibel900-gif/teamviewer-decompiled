package o;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class dr2 extends es4 implements qq2 {
    @Override // o.qq2
    public final void v0(mq2 mq2Var) {
        View viewI = ds1.I(this);
        mq2Var.d(this.m.z && ds1.I(this).hasFocusable());
        View viewFindFocus = viewI.findFocus();
        if (viewFindFocus != null) {
            mq2Var.b(fq2.a(viewFindFocus, viewI));
        }
    }
}
