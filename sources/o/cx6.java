package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cx6 extends p30 {
    public final ya1 B;
    public final t01 C;
    public final t62 D;

    public cx6(ei4 ei4Var, c04 c04Var, t01 t01Var, qh4 qh4Var) {
        super(ei4Var, c04Var);
        this.C = t01Var;
        ya1 ya1Var = new ya1(ei4Var, this, new yw6("__container", c04Var.a, false), qh4Var);
        this.B = ya1Var;
        List list = Collections.EMPTY_LIST;
        ya1Var.b(list, list);
        yc4 yc4Var = this.p.x;
        if (yc4Var != null) {
            this.D = new t62(this, this, yc4Var);
        }
    }

    @Override // o.p30, o.i62
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        this.B.c(rectF, this.n, z);
    }

    @Override // o.p30
    public final void i(Canvas canvas, Matrix matrix, int i, r62 r62Var) {
        t62 t62Var = this.D;
        if (t62Var != null) {
            r62Var = t62Var.b(matrix, i);
        }
        this.B.f(canvas, matrix, i, r62Var);
    }

    @Override // o.p30
    public final df6 j() {
        df6 df6Var = this.p.w;
        return df6Var != null ? df6Var : this.C.p.w;
    }
}
