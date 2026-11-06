package o;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class nl0 implements u52 {
    public final ml0 m;
    public final iu n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public gy8 f1576o;
    public gy8 p;

    public nl0() {
        ln1 ln1Var = xk0.n;
        ml0 ml0Var = new ml0();
        ml0Var.a = ln1Var;
        ml0Var.b = j04.m;
        ml0Var.c = y92.a;
        ml0Var.d = 0L;
        this.m = ml0Var;
        this.n = new iu(this);
    }

    public static gy8 a(nl0 nl0Var, long j, v52 v52Var, float f, int i) {
        gy8 gy8VarC = nl0Var.c(v52Var);
        if (f != 1.0f) {
            j = rv0.b(rv0.c(j) * f, j);
        }
        long jE = gy8VarC.e();
        int i2 = rv0.i;
        if (!z68.a(jE, j)) {
            gy8VarC.l(j);
        }
        if (((Shader) gy8VarC.d) != null) {
            gy8VarC.o(null);
        }
        if (!im3.n((tv0) gy8VarC.e, null)) {
            gy8VarC.m(null);
        }
        if (gy8VarC.b != i) {
            gy8VarC.k(i);
        }
        if (((Paint) gy8VarC.c).isFilterBitmap()) {
            return gy8VarC;
        }
        gy8VarC.n(1);
        return gy8VarC;
    }

    @Override // o.u52
    public final void B(long j, long j2, long j3, float f, int i) {
        ll0 ll0Var = this.m.c;
        gy8 gy8VarK = this.p;
        if (gy8VarK == null) {
            gy8VarK = ka0.k();
            gy8VarK.s(1);
            this.p = gy8VarK;
        }
        Paint paint = (Paint) gy8VarK.c;
        long jE = gy8VarK.e();
        int i2 = rv0.i;
        if (!z68.a(jE, j)) {
            gy8VarK.l(j);
        }
        if (((Shader) gy8VarK.d) != null) {
            gy8VarK.o(null);
        }
        if (!im3.n((tv0) gy8VarK.e, null)) {
            gy8VarK.m(null);
        }
        if (gy8VarK.b != 3) {
            gy8VarK.k(3);
        }
        if (paint.getStrokeWidth() != f) {
            gy8VarK.r(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (gy8VarK.g() != i) {
            gy8VarK.p(i);
        }
        if (gy8VarK.h() != 0) {
            gy8VarK.q(0);
        }
        if (!paint.isFilterBitmap()) {
            gy8VarK.n(1);
        }
        ll0Var.l(j2, j3, gy8VarK);
    }

    @Override // o.u52
    public final void B0(sb0 sb0Var, long j, long j2, float f, v52 v52Var, tv0 tv0Var, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.m.c.q(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j2)) + Float.intBitsToFloat(i3), b(sb0Var, v52Var, f, tv0Var, i, 1));
    }

    @Override // o.u52
    public final void E0(long j, long j2, long j3, float f, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.m.c.q(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j3)) + Float.intBitsToFloat(i3), a(this, j, zk2.a, f, i));
    }

    @Override // o.u52
    public final void G(rj rjVar, sb0 sb0Var, float f, v52 v52Var, tv0 tv0Var, int i) {
        this.m.c.m(rjVar, b(sb0Var, v52Var, f, tv0Var, i, 1));
    }

    @Override // o.u52
    public final void G0(long j, long j2, long j3, long j4, v52 v52Var) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.m.c.r(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), a(this, j, v52Var, 1.0f, 3));
    }

    @Override // o.in1
    public final float Z() {
        return this.m.a.Z();
    }

    public final gy8 b(sb0 sb0Var, v52 v52Var, float f, tv0 tv0Var, int i, int i2) {
        gy8 gy8VarC = c(v52Var);
        Paint paint = (Paint) gy8VarC.c;
        if (sb0Var != null) {
            sb0Var.a(f, d(), gy8VarC);
        } else {
            if (((Shader) gy8VarC.d) != null) {
                gy8VarC.o(null);
            }
            long jE = gy8VarC.e();
            long j = rv0.b;
            if (!z68.a(jE, j)) {
                gy8VarC.l(j);
            }
            if (paint.getAlpha() / 255.0f != f) {
                gy8VarC.j(f);
            }
        }
        if (!im3.n((tv0) gy8VarC.e, tv0Var)) {
            gy8VarC.m(tv0Var);
        }
        if (gy8VarC.b != i) {
            gy8VarC.k(i);
        }
        if (paint.isFilterBitmap() == i2) {
            return gy8VarC;
        }
        gy8VarC.n(i2);
        return gy8VarC;
    }

    public final gy8 c(v52 v52Var) {
        if (im3.n(v52Var, zk2.a)) {
            gy8 gy8Var = this.f1576o;
            if (gy8Var != null) {
                return gy8Var;
            }
            gy8 gy8VarK = ka0.k();
            gy8VarK.s(0);
            this.f1576o = gy8VarK;
            return gy8VarK;
        }
        if (!(v52Var instanceof cc7)) {
            gk0.s();
            return null;
        }
        gy8 gy8VarK2 = this.p;
        if (gy8VarK2 == null) {
            gy8VarK2 = ka0.k();
            gy8VarK2.s(1);
            this.p = gy8VarK2;
        }
        Paint paint = (Paint) gy8VarK2.c;
        float strokeWidth = paint.getStrokeWidth();
        cc7 cc7Var = (cc7) v52Var;
        float f = cc7Var.a;
        if (strokeWidth != f) {
            gy8VarK2.r(f);
        }
        int iG = gy8VarK2.g();
        int i = cc7Var.c;
        if (iG != i) {
            gy8VarK2.p(i);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f2 = cc7Var.b;
        if (strokeMiter != f2) {
            paint.setStrokeMiter(f2);
        }
        int iH = gy8VarK2.h();
        int i2 = cc7Var.d;
        if (iH == i2) {
            return gy8VarK2;
        }
        gy8VarK2.q(i2);
        return gy8VarK2;
    }

    @Override // o.in1
    public final float getDensity() {
        return this.m.a.getDensity();
    }

    @Override // o.u52
    public final j04 getLayoutDirection() {
        return this.m.b;
    }

    @Override // o.u52
    public final iu h0() {
        return this.n;
    }

    @Override // o.u52
    public final void i(long j, float f, float f2, long j2, long j3, v52 v52Var) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.m.c.j(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, a(this, j, v52Var, 1.0f, 3));
    }

    @Override // o.u52
    public final void i0(rj rjVar, long j, v52 v52Var) {
        this.m.c.m(rjVar, a(this, j, v52Var, 1.0f, 3));
    }

    @Override // o.u52
    public final void s0(vi viVar, long j, long j2, long j3, float f, tv0 tv0Var, int i) {
        this.m.c.f(viVar, j, j2, j3, b(null, zk2.a, f, tv0Var, 3, i));
    }

    @Override // o.u52
    public final void w(long j, float f, long j2, v52 v52Var) {
        this.m.c.a(f, j2, a(this, j, v52Var, 1.0f, 3));
    }

    @Override // o.u52
    public final void y(sb0 sb0Var, long j, long j2, long j3, float f, v52 v52Var, tv0 tv0Var, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.m.c.r(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), b(sb0Var, v52Var, f, tv0Var, i, 1));
    }

    @Override // o.u52
    public final void y0(vi viVar, long j, float f, tv0 tv0Var, int i) {
        this.m.c.k(viVar, j, b(null, zk2.a, f, tv0Var, i, 1));
    }
}
