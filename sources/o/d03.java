package o;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d03 implements i62, k30, sa1 {
    public final boolean a;
    public final mg4 b;
    public final mg4 c;
    public final Path d;
    public final wz3 e;
    public final RectF f;
    public final ArrayList g;
    public final int h;
    public final zz2 i;
    public final uv0 j;
    public final zz2 k;
    public final zz2 l;
    public final ei4 m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final uv0 f574o;
    public float p;

    public d03(ei4 ei4Var, qh4 qh4Var, p30 p30Var, c03 c03Var) {
        Object obj = null;
        this.b = new mg4(obj);
        this.c = new mg4(obj);
        Path path = new Path();
        this.d = path;
        this.e = new wz3(1, (byte) 0);
        this.f = new RectF();
        this.g = new ArrayList();
        this.p = 0.0f;
        this.a = c03Var.g;
        this.m = ei4Var;
        this.h = c03Var.a;
        path.setFillType(c03Var.b);
        this.n = (int) (qh4Var.b() / 32.0f);
        o30 o30VarD = c03Var.c.d();
        this.i = (zz2) o30VarD;
        o30VarD.a(this);
        p30Var.d(o30VarD);
        o30 o30VarD2 = c03Var.d.d();
        this.j = (uv0) o30VarD2;
        o30VarD2.a(this);
        p30Var.d(o30VarD2);
        o30 o30VarD3 = c03Var.e.d();
        this.k = (zz2) o30VarD3;
        o30VarD3.a(this);
        p30Var.d(o30VarD3);
        o30 o30VarD4 = c03Var.f.d();
        this.l = (zz2) o30VarD4;
        o30VarD4.a(this);
        p30Var.d(o30VarD4);
        if (p30Var.j() != null) {
            uv0 uv0VarD = ((mm) p30Var.j().n).d();
            this.f574o = uv0VarD;
            uv0VarD.a(this);
            p30Var.d(uv0VarD);
        }
    }

    @Override // o.k30
    public final void a() {
        this.m.invalidateSelf();
    }

    @Override // o.sa1
    public final void b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            sa1 sa1Var = (sa1) list2.get(i);
            if (sa1Var instanceof zg5) {
                this.g.add((zg5) sa1Var);
            }
        }
    }

    @Override // o.i62
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.d;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((zg5) arrayList.get(i)).e(), matrix);
                i++;
            }
        }
    }

    public final int d() {
        float f = this.k.d;
        float f2 = this.n;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.l.d * f2);
        int iRound3 = Math.round(this.i.d * f2);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    @Override // o.i62
    public final void f(Canvas canvas, Matrix matrix, int i, r62 r62Var) {
        float[] fArr;
        int[] iArr;
        Shader linearGradient;
        int[] iArr2;
        if (this.a) {
            return;
        }
        Path path = this.d;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i2 >= arrayList.size()) {
                break;
            }
            path.addPath(((zg5) arrayList.get(i2)).e(), matrix);
            i2++;
        }
        path.computeBounds(this.f, false);
        int i3 = this.h;
        zz2 zz2Var = this.i;
        zz2 zz2Var2 = this.l;
        zz2 zz2Var3 = this.k;
        if (i3 == 1) {
            long jD = d();
            mg4 mg4Var = this.b;
            linearGradient = (LinearGradient) mg4Var.b(jD);
            if (linearGradient == null) {
                PointF pointF = (PointF) zz2Var3.d();
                PointF pointF2 = (PointF) zz2Var2.d();
                yz2 yz2Var = (yz2) zz2Var.d();
                int[] iArr3 = yz2Var.b;
                float[] fArr2 = yz2Var.a;
                if (iArr3.length < 2) {
                    fArr2 = new float[]{0.0f, 1.0f};
                    iArr2 = new int[]{iArr3[0], iArr3[0]};
                } else {
                    iArr2 = iArr3;
                }
                linearGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, iArr2, fArr2, Shader.TileMode.CLAMP);
                mg4Var.e(jD, linearGradient);
            }
        } else {
            long jD2 = d();
            mg4 mg4Var2 = this.c;
            RadialGradient radialGradient = (RadialGradient) mg4Var2.b(jD2);
            if (radialGradient != null) {
                linearGradient = radialGradient;
            } else {
                PointF pointF3 = (PointF) zz2Var3.d();
                PointF pointF4 = (PointF) zz2Var2.d();
                yz2 yz2Var2 = (yz2) zz2Var.d();
                int[] iArr4 = yz2Var2.b;
                float[] fArr3 = yz2Var2.a;
                if (iArr4.length < 2) {
                    iArr = new int[]{iArr4[0], iArr4[0]};
                    fArr = new float[]{0.0f, 1.0f};
                } else {
                    fArr = fArr3;
                    iArr = iArr4;
                }
                float f = pointF3.x;
                float f2 = pointF3.y;
                float fHypot = (float) Math.hypot(pointF4.x - f, pointF4.y - f2);
                if (fHypot <= 0.0f) {
                    fHypot = 0.001f;
                }
                RadialGradient radialGradient2 = new RadialGradient(f, f2, fHypot, iArr, fArr, Shader.TileMode.CLAMP);
                mg4Var2.e(jD2, radialGradient2);
                linearGradient = radialGradient2;
            }
        }
        linearGradient.setLocalMatrix(matrix);
        wz3 wz3Var = this.e;
        wz3Var.setShader(linearGradient);
        uv0 uv0Var = this.f574o;
        if (uv0Var != null) {
            float fFloatValue = ((Float) uv0Var.d()).floatValue();
            if (fFloatValue == 0.0f) {
                wz3Var.setMaskFilter(null);
            } else if (fFloatValue != this.p) {
                wz3Var.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.p = fFloatValue;
        }
        float fIntValue = ((Integer) this.j.d()).intValue() / 100.0f;
        wz3Var.setAlpha(lr4.c((int) (i * fIntValue)));
        if (r62Var != null) {
            r62Var.a((int) (fIntValue * 255.0f), wz3Var);
        }
        canvas.drawPath(path, wz3Var);
    }
}
