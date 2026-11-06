package o;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class bh5 extends ey3 {
    public final PointF h;
    public final float[] i;
    public final float[] j;
    public final PathMeasure k;
    public ah5 l;

    public bh5(ArrayList arrayList) {
        super(arrayList);
        this.h = new PointF();
        this.i = new float[2];
        this.j = new float[2];
        this.k = new PathMeasure();
    }

    @Override // o.o30
    public final Object e(dy3 dy3Var, float f) {
        ah5 ah5Var = (ah5) dy3Var;
        Path path = ah5Var.q;
        if (path == null) {
            return (PointF) dy3Var.b;
        }
        ah5 ah5Var2 = this.l;
        PathMeasure pathMeasure = this.k;
        if (ah5Var2 != ah5Var) {
            pathMeasure.setPath(path, false);
            this.l = ah5Var;
        }
        float length = pathMeasure.getLength();
        float f2 = f * length;
        float[] fArr = this.i;
        float[] fArr2 = this.j;
        pathMeasure.getPosTan(f2, fArr, fArr2);
        float f3 = fArr[0];
        float f4 = fArr[1];
        PointF pointF = this.h;
        pointF.set(f3, f4);
        if (f2 < 0.0f) {
            pointF.offset(fArr2[0] * f2, fArr2[1] * f2);
            return pointF;
        }
        if (f2 > length) {
            float f5 = f2 - length;
            pointF.offset(fArr2[0] * f5, fArr2[1] * f5);
        }
        return pointF;
    }
}
