package o;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class oc1 extends a1 {
    public final PointF p;

    public oc1(oa3 oa3Var) {
        super(oa3Var);
        this.p = new PointF();
    }

    @Override // o.na3
    public final void b() {
        l97 l97Var;
        Object value;
        v97 v97Var;
        float fC;
        if (this.f280o) {
            do {
                l97Var = this.e;
                value = l97Var.getValue();
                v97Var = (v97) value;
                fC = v97Var.a;
                float f = this.n;
                if (f >= 0.0f) {
                    float f2 = this.c;
                    float f3 = this.b;
                    fC = ua5.c(f2, f3, f, f3);
                    this.n = -1.0f;
                }
            } while (!l97Var.j(value, v97Var.c(k(fC))));
        }
    }

    @Override // o.na3
    public final void c(float f, float f2) {
        l97 l97Var = this.e;
        v97 v97VarB = ((v97) l97Var.getValue()).b(f, f2);
        l97Var.getClass();
        l97Var.l(null, v97VarB);
    }

    @Override // o.na3
    public final void d(PointF pointF, float f, PointF pointF2) {
        i12 i12Var;
        j97 j97Var;
        i12 i12Var2;
        float f2;
        pointF.getClass();
        j97 j97Var2 = this.h;
        if (j97Var2 == null || (i12Var = (i12) j97Var2.getValue()) == null || (j97Var = this.g) == null || (i12Var2 = (i12) j97Var.getValue()) == null) {
            return;
        }
        int i = i12Var.a;
        int i2 = i12Var.b;
        float f3 = i12Var2.b * f;
        float f4 = i12Var2.a * f;
        float f5 = pointF2.x * f;
        float f6 = pointF2.y * f;
        float f7 = i;
        float f8 = 0.0f;
        if (f4 >= f7) {
            float f9 = i / 2;
            if (f5 < f9) {
                f2 = 0.0f;
            } else {
                f2 = f5 > f4 - f9 ? f4 - f7 : f5 - f9;
            }
        } else {
            f2 = 0.0f - ((f7 - f4) / 2.0f);
        }
        float f10 = i2;
        if (f3 >= f10) {
            float f11 = i2 / 2;
            if (f6 >= f11) {
                f8 = f6 > f3 - f11 ? f3 - f10 : f6 - f11;
            }
        } else {
            f8 = 0.0f - ((f10 - f3) / 2.0f);
        }
        pointF.x = f2;
        pointF.y = f8;
    }

    @Override // o.a1, o.na3
    public final void e(PointF pointF, float f, PointF pointF2) {
        i12 i12Var;
        j97 j97Var;
        i12 i12Var2;
        pointF2.getClass();
        j97 j97Var2 = this.h;
        if (j97Var2 == null || (i12Var = (i12) j97Var2.getValue()) == null || (j97Var = this.g) == null || (i12Var2 = (i12) j97Var.getValue()) == null) {
            return;
        }
        int i = i12Var.a;
        int i2 = i12Var.b;
        float f2 = i12Var2.b * f;
        float f3 = i12Var2.a * f;
        float f4 = pointF2.x * f;
        float f5 = pointF2.y * f;
        float f6 = i2;
        if (f2 > f6) {
            float f7 = pointF.y;
            if (f7 == 0.0f) {
                int i3 = i2 / 2;
                if (f5 >= i3) {
                    f5 = i3 - 1;
                }
            } else if (f7 == f2 - f6) {
                float f8 = f2 - (i2 / 2);
                if (f5 <= f8) {
                    f5 = f8 + 1.0f;
                }
            } else {
                f5 = f7 + (i2 / 2);
            }
        }
        float f9 = i;
        if (f3 > f9) {
            float f10 = pointF.x;
            if (f10 == 0.0f) {
                int i4 = i / 2;
                if (f4 >= i4) {
                    f4 = i4 - 1;
                }
            } else if (f10 == f3 - f9) {
                float f11 = f3 - (i / 2);
                f4 = f4 > f11 ? f5 : f11 + 1.0f;
            } else {
                f4 = f10 + (i / 2);
            }
        }
        pointF2.x = f4 / f;
        pointF2.y = f5 / f;
    }

    @Override // o.na3
    public final void f(float f, float f2, float f3) {
        l97 l97Var;
        Object value;
        v97 v97Var;
        float fK;
        PointF pointF;
        r97 r97Var;
        if (this.f280o) {
            do {
                l97Var = this.e;
                value = l97Var.getValue();
                v97Var = (v97) value;
                fK = k(o(f, v97Var.a));
                l97 l97Var2 = this.f;
                pointF = this.p;
                if (l97Var2 != null && (r97Var = (r97) l97Var2.getValue()) != null) {
                    d(pointF, fK, r97Var.a);
                }
            } while (!l97Var.j(value, v97Var.b(pointF.x, pointF.y).c(fK)));
        }
    }

    @Override // o.a1
    public final void l() {
        g();
        b();
    }

    @Override // o.a1
    public final void m() {
        g();
        b();
    }

    @Override // o.a1
    public final void n() {
        g();
        b();
    }
}
