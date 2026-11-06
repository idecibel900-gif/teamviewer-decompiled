package o;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class q92 extends nv1 {
    public final p92 e;

    public q92(TextView textView) {
        this.e = new p92(textView);
    }

    @Override // o.nv1
    public final boolean D() {
        return this.e.g;
    }

    @Override // o.nv1
    public final void K(boolean z) {
        if (a92.d()) {
            this.e.K(z);
        }
    }

    @Override // o.nv1
    public final void L(boolean z) {
        boolean zD = a92.d();
        p92 p92Var = this.e;
        if (zD) {
            p92Var.L(z);
        } else {
            p92Var.g = z;
        }
    }

    @Override // o.nv1
    public final TransformationMethod O(TransformationMethod transformationMethod) {
        return !a92.d() ? transformationMethod : this.e.O(transformationMethod);
    }

    @Override // o.nv1
    public final InputFilter[] y(InputFilter[] inputFilterArr) {
        return !a92.d() ? inputFilterArr : this.e.y(inputFilterArr);
    }
}
