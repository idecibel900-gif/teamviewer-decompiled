package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class ex6 extends jx6 {
    public final gx6 b;

    public ex6(gx6 gx6Var) {
        this.b = gx6Var;
    }

    @Override // o.jx6
    public final void a(Matrix matrix, nw6 nw6Var, int i, Canvas canvas) {
        RectF rectF = gx6.h;
        gx6 gx6Var = this.b;
        float f = gx6Var.f;
        float f2 = gx6Var.g;
        RectF rectF2 = new RectF(gx6Var.b, gx6Var.c, gx6Var.d, gx6Var.e);
        Paint paint = nw6Var.b;
        boolean z = f2 < 0.0f;
        Path path = nw6Var.g;
        int[] iArr = nw6.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = nw6Var.f;
            iArr[2] = nw6Var.e;
            iArr[3] = nw6Var.d;
        } else {
            path.rewind();
            path.moveTo(rectF2.centerX(), rectF2.centerY());
            path.arcTo(rectF2, f, f2);
            path.close();
            float f3 = -i;
            rectF2.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = nw6Var.d;
            iArr[2] = nw6Var.e;
            iArr[3] = nw6Var.f;
        }
        float fWidth = rectF2.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = nw6.l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        paint.setShader(new RadialGradient(rectF2.centerX(), rectF2.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF2.height() / rectF2.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, nw6Var.h);
        }
        canvas.drawArc(rectF2, f, f2, true, paint);
        canvas.restore();
    }
}
