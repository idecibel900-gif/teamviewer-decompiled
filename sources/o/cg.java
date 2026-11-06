package o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;

/* JADX INFO: loaded from: classes.dex */
public final class cg implements ll0 {
    public Canvas a = dg.a;
    public Rect b;
    public Rect c;

    @Override // o.ll0
    public final void a(float f, long j, gy8 gy8Var) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, (Paint) gy8Var.c);
    }

    @Override // o.ll0
    public final void b(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // o.ll0
    public final void c(float f) {
        this.a.rotate(f);
    }

    @Override // o.ll0
    public final void d(rj rjVar, int i) {
        Canvas canvas = this.a;
        if (rjVar instanceof rj) {
            canvas.clipPath(rjVar.a, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
        } else {
            yq4.r("Unable to obtain android.graphics.Path");
        }
    }

    @Override // o.ll0
    public final void f(vi viVar, long j, long j2, long j3, gy8 gy8Var) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        Bitmap bitmapF = mo8.f(viVar);
        Rect rect = this.b;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.c;
        rect2.getClass();
        rect2.left = 0;
        rect2.top = 0;
        rect2.right = (int) (j3 >> 32);
        rect2.bottom = (int) (j3 & 4294967295L);
        canvas.drawBitmap(bitmapF, rect, rect2, (Paint) gy8Var.c);
    }

    @Override // o.ll0
    public final void g() {
        this.a.save();
    }

    @Override // o.ll0
    public final void h() {
        e8.m(this.a, false);
    }

    @Override // o.ll0
    public final void i(float[] fArr) {
        if (ct1.L(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        kh.A(matrix, fArr);
        this.a.concat(matrix);
    }

    @Override // o.ll0
    public final void j(float f, float f2, float f3, float f4, float f5, float f6, gy8 gy8Var) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, false, (Paint) gy8Var.c);
    }

    @Override // o.ll0
    public final void k(vi viVar, long j, gy8 gy8Var) {
        this.a.drawBitmap(mo8.f(viVar), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), (Paint) gy8Var.c);
    }

    @Override // o.ll0
    public final void l(long j, long j2, gy8 gy8Var) {
        this.a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), (Paint) gy8Var.c);
    }

    @Override // o.ll0
    public final void m(rj rjVar, gy8 gy8Var) {
        Canvas canvas = this.a;
        if (rjVar instanceof rj) {
            canvas.drawPath(rjVar.a, ka0.u(gy8Var));
        } else {
            yq4.r("Unable to obtain android.graphics.Path");
        }
    }

    @Override // o.ll0
    public final void n(float f, float f2, float f3, float f4, int i) {
        this.a.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // o.ll0
    public final void o(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // o.ll0
    public final void p() {
        this.a.restore();
    }

    @Override // o.ll0
    public final void q(float f, float f2, float f3, float f4, gy8 gy8Var) {
        this.a.drawRect(f, f2, f3, f4, ka0.u(gy8Var));
    }

    @Override // o.ll0
    public final void r(float f, float f2, float f3, float f4, float f5, float f6, gy8 gy8Var) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, (Paint) gy8Var.c);
    }

    @Override // o.ll0
    public final void s(v56 v56Var, gy8 gy8Var) {
        this.a.saveLayer(v56Var.a, v56Var.b, v56Var.c, v56Var.d, (Paint) gy8Var.c, 31);
    }

    @Override // o.ll0
    public final void t() {
        e8.m(this.a, true);
    }
}
