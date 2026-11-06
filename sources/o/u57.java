package o;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class u57 extends p30 {
    public final RectF B;
    public final wz3 C;
    public final float[] D;
    public final Path E;
    public final c04 F;

    public u57(ei4 ei4Var, c04 c04Var) {
        super(ei4Var, c04Var);
        this.B = new RectF();
        wz3 wz3Var = new wz3();
        this.C = wz3Var;
        this.D = new float[8];
        this.E = new Path();
        this.F = c04Var;
        wz3Var.setAlpha(0);
        wz3Var.setStyle(Paint.Style.FILL);
        wz3Var.setColor(c04Var.l);
    }

    @Override // o.p30, o.i62
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        c04 c04Var = this.F;
        float f = c04Var.j;
        float f2 = c04Var.k;
        RectF rectF2 = this.B;
        rectF2.set(0.0f, 0.0f, f, f2);
        this.n.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // o.p30
    public final void i(Canvas canvas, Matrix matrix, int i, r62 r62Var) {
        c04 c04Var = this.F;
        int iAlpha = Color.alpha(c04Var.l);
        if (iAlpha == 0) {
            return;
        }
        int i2 = c04Var.l;
        wz3 wz3Var = this.C;
        wz3Var.setColor(i2);
        uv0 uv0Var = this.w.p;
        int iIntValue = (int) ((((iAlpha / 255.0f) * (uv0Var == null ? 100 : ((Integer) uv0Var.d()).intValue())) / 100.0f) * (i / 255.0f) * 255.0f);
        wz3Var.setAlpha(iIntValue);
        if (r62Var == null || Color.alpha(r62Var.d) <= 0) {
            wz3Var.clearShadowLayer();
        } else {
            wz3Var.setShadowLayer(Math.max(r62Var.a, Float.MIN_VALUE), r62Var.b, r62Var.c, r62Var.d);
        }
        if (iIntValue > 0) {
            float[] fArr = this.D;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f = c04Var.j;
            fArr[2] = f;
            fArr[3] = 0.0f;
            fArr[4] = f;
            float f2 = c04Var.k;
            fArr[5] = f2;
            fArr[6] = 0.0f;
            fArr[7] = f2;
            matrix.mapPoints(fArr);
            Path path = this.E;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, wz3Var);
        }
    }
}
