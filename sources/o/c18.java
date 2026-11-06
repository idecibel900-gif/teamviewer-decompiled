package o;

import android.graphics.Matrix;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class c18 {
    public final Matrix b;
    public final Matrix c;
    public final Matrix d;
    public final float[] e;
    public final ey3 l;
    public final o30 m;
    public final zz2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final uv0 f477o;
    public final uv0 p;
    public final uv0 q;
    public final uv0 r;
    public final uv0 s;
    public final uv0 t;
    public final uv0 u;
    public final uv0 v;
    public final uv0 w;
    public final boolean x;
    public final Matrix a = new Matrix();
    public float f = Float.NaN;
    public float g = Float.NaN;
    public float h = Float.NaN;
    public float i = 1.0f;
    public float j = 1.0f;
    public boolean k = true;

    public c18(rm rmVar) {
        nm nmVar = rmVar.a;
        this.l = (ey3) (nmVar == null ? null : nmVar.d());
        tm tmVar = rmVar.b;
        this.m = tmVar == null ? null : tmVar.d();
        lm lmVar = rmVar.c;
        this.n = (zz2) (lmVar == null ? null : lmVar.d());
        mm mmVar = rmVar.d;
        this.f477o = mmVar == null ? null : mmVar.d();
        mm mmVar2 = rmVar.f;
        uv0 uv0VarD = mmVar2 == null ? null : mmVar2.d();
        this.q = uv0VarD;
        this.x = rmVar.m;
        mm mmVar3 = rmVar.h;
        this.s = mmVar3 == null ? null : mmVar3.d();
        mm mmVar4 = rmVar.i;
        this.t = mmVar4 == null ? null : mmVar4.d();
        mm mmVar5 = rmVar.j;
        this.u = mmVar5 == null ? null : mmVar5.d();
        if (uv0VarD != null) {
            this.b = new Matrix();
            this.c = new Matrix();
            this.d = new Matrix();
            this.e = new float[9];
        } else {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
        mm mmVar6 = rmVar.g;
        this.r = mmVar6 == null ? null : mmVar6.d();
        lm lmVar2 = rmVar.e;
        if (lmVar2 != null) {
            this.p = (uv0) lmVar2.d();
        }
        mm mmVar7 = rmVar.k;
        if (mmVar7 != null) {
            this.v = mmVar7.d();
        } else {
            this.v = null;
        }
        mm mmVar8 = rmVar.l;
        if (mmVar8 != null) {
            this.w = mmVar8.d();
        } else {
            this.w = null;
        }
    }

    public final void a(p30 p30Var) {
        p30Var.d(this.p);
        p30Var.d(this.v);
        p30Var.d(this.w);
        p30Var.d(this.l);
        p30Var.d(this.m);
        p30Var.d(this.n);
        p30Var.d(this.f477o);
        p30Var.d(this.q);
        p30Var.d(this.r);
        p30Var.d(this.s);
        p30Var.d(this.t);
        p30Var.d(this.u);
    }

    public final void b(k30 k30Var) {
        uv0 uv0Var = this.p;
        if (uv0Var != null) {
            uv0Var.a(k30Var);
        }
        uv0 uv0Var2 = this.v;
        if (uv0Var2 != null) {
            uv0Var2.a(k30Var);
        }
        uv0 uv0Var3 = this.w;
        if (uv0Var3 != null) {
            uv0Var3.a(k30Var);
        }
        ey3 ey3Var = this.l;
        if (ey3Var != null) {
            ey3Var.a(k30Var);
        }
        o30 o30Var = this.m;
        if (o30Var != null) {
            o30Var.a(k30Var);
        }
        zz2 zz2Var = this.n;
        if (zz2Var != null) {
            zz2Var.a(k30Var);
        }
        uv0 uv0Var4 = this.f477o;
        if (uv0Var4 != null) {
            uv0Var4.a(k30Var);
        }
        uv0 uv0Var5 = this.q;
        if (uv0Var5 != null) {
            uv0Var5.a(k30Var);
        }
        uv0 uv0Var6 = this.r;
        if (uv0Var6 != null) {
            uv0Var6.a(k30Var);
        }
        uv0 uv0Var7 = this.s;
        if (uv0Var7 != null) {
            uv0Var7.a(k30Var);
            uv0Var7.a(new b18(this, (byte) 0));
        }
        uv0 uv0Var8 = this.t;
        if (uv0Var8 != null) {
            uv0Var8.a(k30Var);
            uv0Var8.a(new b18(this, (byte) 1));
        }
        uv0 uv0Var9 = this.u;
        if (uv0Var9 != null) {
            uv0Var9.a(k30Var);
            uv0Var9.a(new b18(this, (byte) 2));
        }
    }

    public final void c() {
        for (int i = 0; i < 9; i++) {
            this.e[i] = 0.0f;
        }
    }

    public final Matrix d() {
        PointF pointF;
        ri6 ri6Var;
        PointF pointF2;
        Matrix matrix = this.a;
        matrix.reset();
        zz2 zz2Var = this.n;
        ey3 ey3Var = this.l;
        o30 o30Var = this.m;
        uv0 uv0Var = this.u;
        uv0 uv0Var2 = this.t;
        uv0 uv0Var3 = this.s;
        if ((uv0Var3 == null || uv0Var3.i() == 0.0f) && ((uv0Var2 == null || uv0Var2.i() == 0.0f) && (uv0Var == null || uv0Var.i() == 0.0f))) {
            if (o30Var != null && (pointF2 = (PointF) o30Var.d()) != null) {
                float f = pointF2.x;
                if (f != 0.0f || pointF2.y != 0.0f) {
                    matrix.preTranslate(f, pointF2.y);
                }
            }
            if (!this.x) {
                uv0 uv0Var4 = this.f477o;
                if (uv0Var4 != null) {
                    float fI = uv0Var4.i();
                    if (fI != 0.0f) {
                        matrix.preRotate(fI);
                    }
                }
            } else if (o30Var != null) {
                float f2 = o30Var.d;
                PointF pointF3 = (PointF) o30Var.d();
                float f3 = pointF3.x;
                float f4 = pointF3.y;
                o30Var.g(1.0E-4f + f2);
                PointF pointF4 = (PointF) o30Var.d();
                o30Var.g(f2);
                matrix.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f4, pointF4.x - f3)));
            }
            uv0 uv0Var5 = this.q;
            if (uv0Var5 != null) {
                uv0 uv0Var6 = this.r;
                float fCos = uv0Var6 == null ? 0.0f : (float) Math.cos(Math.toRadians((-uv0Var6.i()) + 90.0f));
                float fSin = uv0Var6 == null ? 1.0f : (float) Math.sin(Math.toRadians((-uv0Var6.i()) + 90.0f));
                float fTan = (float) Math.tan(Math.toRadians(uv0Var5.i()));
                c();
                float[] fArr = this.e;
                fArr[0] = fCos;
                fArr[1] = fSin;
                float f5 = -fSin;
                fArr[3] = f5;
                fArr[4] = fCos;
                fArr[8] = 1.0f;
                Matrix matrix2 = this.b;
                matrix2.setValues(fArr);
                c();
                fArr[0] = 1.0f;
                fArr[3] = fTan;
                fArr[4] = 1.0f;
                fArr[8] = 1.0f;
                Matrix matrix3 = this.c;
                matrix3.setValues(fArr);
                c();
                fArr[0] = fCos;
                fArr[1] = f5;
                fArr[3] = fSin;
                fArr[4] = fCos;
                fArr[8] = 1.0f;
                Matrix matrix4 = this.d;
                matrix4.setValues(fArr);
                matrix3.preConcat(matrix2);
                matrix4.preConcat(matrix3);
                matrix.preConcat(matrix4);
            }
            if (zz2Var != null && (ri6Var = (ri6) zz2Var.d()) != null) {
                float f6 = ri6Var.a;
                if (f6 != 1.0f || ri6Var.b != 1.0f) {
                    matrix.preScale(f6, ri6Var.b);
                }
            }
            if (ey3Var != null && (pointF = (PointF) ey3Var.d()) != null) {
                float f7 = pointF.x;
                if (f7 != 0.0f || pointF.y != 0.0f) {
                    matrix.preTranslate(-f7, -pointF.y);
                }
            }
        } else {
            float fI2 = uv0Var3 != null ? uv0Var3.i() : 0.0f;
            float fI3 = uv0Var2 != null ? uv0Var2.i() : 0.0f;
            float fI4 = uv0Var != null ? uv0Var.i() : 0.0f;
            if (this.k || fI2 != this.f || fI3 != this.g || fI4 != this.h) {
                this.f = fI2;
                this.g = fI3;
                this.h = fI4;
                if (fI2 != 0.0f) {
                    this.i = (float) Math.cos(Math.toRadians(fI2));
                } else {
                    this.i = 1.0f;
                }
                if (fI3 != 0.0f) {
                    this.j = (float) Math.cos(Math.toRadians(fI3));
                } else {
                    this.j = 1.0f;
                }
                this.k = false;
            }
            PointF pointF5 = ey3Var == null ? null : (PointF) ey3Var.d();
            PointF pointF6 = o30Var == null ? null : (PointF) o30Var.d();
            ri6 ri6Var2 = zz2Var != null ? (ri6) zz2Var.d() : null;
            float f8 = ri6Var2 != null ? ri6Var2.a : 1.0f;
            float f9 = ri6Var2 != null ? ri6Var2.b : 1.0f;
            float f10 = this.i;
            float f11 = this.j;
            matrix.reset();
            if (pointF6 != null) {
                float f12 = pointF6.x;
                if (f12 != 0.0f || pointF6.y != 0.0f) {
                    matrix.preTranslate(f12, pointF6.y);
                }
            }
            if (fI4 != 0.0f) {
                matrix.preRotate(fI4);
            }
            if (fI3 != 0.0f) {
                matrix.preScale(f11, 1.0f);
            }
            if (fI2 != 0.0f) {
                matrix.preScale(1.0f, f10);
            }
            if (f8 != 1.0f || f9 != 1.0f) {
                matrix.preScale(f8, f9);
            }
            if (pointF5 != null) {
                float f13 = pointF5.x;
                if (f13 != 0.0f || pointF5.y != 0.0f) {
                    matrix.preTranslate(-f13, -pointF5.y);
                    return matrix;
                }
            }
        }
        return matrix;
    }

    public final Matrix e(float f) {
        o30 o30Var = this.m;
        PointF pointF = o30Var == null ? null : (PointF) o30Var.d();
        zz2 zz2Var = this.n;
        ri6 ri6Var = zz2Var == null ? null : (ri6) zz2Var.d();
        ey3 ey3Var = this.l;
        PointF pointF2 = ey3Var != null ? (PointF) ey3Var.d() : null;
        Matrix matrix = this.a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f, pointF.y * f);
        }
        uv0 uv0Var = this.s;
        float fI = uv0Var != null ? uv0Var.i() * f : 0.0f;
        uv0 uv0Var2 = this.t;
        float fI2 = uv0Var2 != null ? uv0Var2.i() * f : 0.0f;
        uv0 uv0Var3 = this.u;
        float fI3 = uv0Var3 != null ? uv0Var3.i() * f : 0.0f;
        if (fI == 0.0f && fI2 == 0.0f && fI3 == 0.0f) {
            uv0 uv0Var4 = this.f477o;
            if (uv0Var4 != null) {
                matrix.preRotate(((Float) uv0Var4.d()).floatValue() * f, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
            }
        } else {
            float fCos = fI != 0.0f ? (float) Math.cos(Math.toRadians(fI)) : 1.0f;
            float fCos2 = fI2 != 0.0f ? (float) Math.cos(Math.toRadians(fI2)) : 1.0f;
            if (fI3 != 0.0f) {
                matrix.preRotate(fI3, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
            }
            if (fI2 != 0.0f) {
                matrix.preScale(fCos2, 1.0f);
            }
            if (fI != 0.0f) {
                matrix.preScale(1.0f, fCos);
            }
        }
        if (ri6Var != null) {
            double d = f;
            matrix.preScale((float) Math.pow(ri6Var.a, d), (float) Math.pow(ri6Var.b, d));
        }
        return matrix;
    }
}
