package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public final class dc7 extends t30 {
    public final boolean p;
    public final uv0 q;

    /* JADX WARN: Illegal instructions before constructor call */
    public dc7(ei4 ei4Var, p30 p30Var, nx6 nx6Var) {
        int iB = ua5.B(nx6Var.f);
        Paint.Cap cap = iB != 0 ? iB != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iB2 = ua5.B(nx6Var.g);
        super(ei4Var, p30Var, cap, iB2 != 0 ? iB2 != 1 ? iB2 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, nx6Var.h, nx6Var.d, nx6Var.e, nx6Var.b, nx6Var.a);
        this.p = nx6Var.i;
        o30 o30VarD = nx6Var.c.d();
        this.q = (uv0) o30VarD;
        o30VarD.a(this);
        p30Var.d(o30VarD);
    }

    @Override // o.t30, o.i62
    public final void f(Canvas canvas, Matrix matrix, int i, r62 r62Var) {
        if (this.p) {
            return;
        }
        uv0 uv0Var = this.q;
        this.i.setColor(uv0Var.k(uv0Var.c.e(), uv0Var.b()));
        super.f(canvas, matrix, i, r62Var);
    }
}
