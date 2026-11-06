package o;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class fx6 extends jx6 {
    public final hx6 b;
    public final float c;
    public final float d;

    public fx6(hx6 hx6Var, float f, float f2) {
        this.b = hx6Var;
        this.c = f;
        this.d = f2;
    }

    @Override // o.jx6
    public final void a(Matrix matrix, nw6 nw6Var, int i, Canvas canvas) {
        hx6 hx6Var = this.b;
        float f = hx6Var.c;
        float f2 = this.d;
        float f3 = hx6Var.b;
        float f4 = this.c;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = new Matrix(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        nw6Var.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i2 = nw6Var.f;
        int[] iArr = nw6.i;
        iArr[0] = i2;
        iArr[1] = nw6Var.e;
        iArr[2] = nw6Var.d;
        Paint paint = nw6Var.c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, nw6.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        hx6 hx6Var = this.b;
        return (float) Math.toDegrees(Math.atan((hx6Var.c - this.d) / (hx6Var.b - this.c)));
    }
}
