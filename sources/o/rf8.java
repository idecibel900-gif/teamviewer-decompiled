package o;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class rf8 extends qf8 {
    @Override // o.b77
    public final float i(View view) {
        return view.getTransitionAlpha();
    }

    @Override // o.b77
    public final void n(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // o.qf8
    public final void r(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // o.qf8
    public final void s(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // o.qf8
    public final void t(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // o.qf8
    public final void u(ViewGroup viewGroup, Matrix matrix) {
        viewGroup.transformMatrixToLocal(matrix);
    }
}
