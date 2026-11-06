package o;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class rj {
    public final Path a;
    public RectF b;
    public float[] c;
    public Matrix d;

    public rj(Path path) {
        this.a = path;
    }

    public static void a(rj rjVar, rj rjVar2) {
        Path path = rjVar.a;
        if (rjVar2 instanceof rj) {
            path.addPath(rjVar2.a, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
        } else {
            yq4.r("Unable to obtain android.graphics.Path");
        }
    }

    public static void b(rj rjVar, v56 v56Var) {
        i(v56Var);
        RectF rectF = rjVar.b;
        if (rectF == null) {
            rectF = new RectF();
            rjVar.b = rectF;
        }
        rectF.set(v56Var.a, v56Var.b, v56Var.c, v56Var.d);
        Path path = rjVar.a;
        RectF rectF2 = rjVar.b;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
    }

    public static void c(rj rjVar, lf6 lf6Var) {
        RectF rectF = rjVar.b;
        if (rectF == null) {
            rectF = new RectF();
            rjVar.b = rectF;
        }
        float f = lf6Var.a;
        long j = lf6Var.h;
        long j2 = lf6Var.g;
        long j3 = lf6Var.f;
        long j4 = lf6Var.e;
        rectF.set(f, lf6Var.b, lf6Var.c, lf6Var.d);
        float[] fArr = rjVar.c;
        if (fArr == null) {
            fArr = new float[8];
            rjVar.c = fArr;
        }
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = rjVar.a;
        RectF rectF2 = rjVar.b;
        rectF2.getClass();
        float[] fArr2 = rjVar.c;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public static void i(v56 v56Var) {
        if (Float.isNaN(v56Var.a) || Float.isNaN(v56Var.b) || Float.isNaN(v56Var.c) || Float.isNaN(v56Var.d)) {
            tj.b("Invalid rectangle, make sure no value is NaN");
        }
    }

    public final v56 d() {
        RectF rectF = this.b;
        if (rectF == null) {
            rectF = new RectF();
            this.b = rectF;
        }
        this.a.computeBounds(rectF, true);
        return new v56(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void e(float f, float f2) {
        this.a.lineTo(f, f2);
    }

    public final boolean f(rj rjVar, rj rjVar2, int i) {
        Path.Op op;
        if (i == 0) {
            op = Path.Op.DIFFERENCE;
        } else if (i == 1) {
            op = Path.Op.INTERSECT;
        } else if (i == 4) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = i == 2 ? Path.Op.UNION : Path.Op.XOR;
        }
        if (!(rjVar instanceof rj)) {
            yq4.r("Unable to obtain android.graphics.Path");
            return false;
        }
        Path path = rjVar.a;
        if (rjVar2 instanceof rj) {
            return this.a.op(path, rjVar2.a, op);
        }
        yq4.r("Unable to obtain android.graphics.Path");
        return false;
    }

    public final void g() {
        this.a.reset();
    }

    public final void h(long j) {
        Matrix matrix = this.d;
        if (matrix == null) {
            this.d = new Matrix();
        } else {
            matrix.reset();
        }
        Matrix matrix2 = this.d;
        matrix2.getClass();
        matrix2.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        Matrix matrix3 = this.d;
        matrix3.getClass();
        this.a.transform(matrix3);
    }
}
