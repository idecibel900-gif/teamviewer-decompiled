package o;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class qc1 extends c1 {
    public final PointF j;

    public qc1(ma3 ma3Var) {
        super(ma3Var);
        this.j = new PointF();
    }

    @Override // o.c1
    public final void c(PointF pointF) {
        j97 j97Var;
        na3 na3Var;
        v97 v97VarB;
        Object value;
        float f;
        Object value2;
        pointF.getClass();
        j97 j97Var2 = this.d;
        if (j97Var2 == null || (j97Var = this.e) == null || (na3Var = this.c) == null || (v97VarB = b()) == null) {
            return;
        }
        i12 i12Var = (i12) j97Var2.getValue();
        i12 i12Var2 = (i12) j97Var.getValue();
        float f2 = v97VarB.a;
        int i = i12Var2.a;
        int i2 = i12Var2.b;
        float f3 = i;
        float f4 = f3 / 2.0f;
        float f5 = i2;
        float f6 = f5 / 2.0f;
        float f7 = i12Var.b * f2;
        float f8 = i12Var.a * f2;
        float f9 = pointF.x;
        float f10 = f9 * f2;
        float f11 = pointF.y;
        float f12 = f11 * f2;
        l97 l97Var = this.b;
        if (i != 0 && i2 != 0) {
            float f13 = 0.0f;
            if (Float.compare(f2, 0.0f) != 0) {
                if (f10 < f4) {
                    f = 0.0f;
                } else if (f10 > f8 - f4) {
                    f = f8 - f3;
                } else {
                    f = v97VarB.d;
                    if (f10 < f || f10 > f3 + f) {
                        f = f10 - f4;
                    } else {
                        f9 = (f4 + f) / f2;
                    }
                }
                float f14 = f9;
                if (f12 >= f6) {
                    if (f12 > f7 - f6) {
                        f13 = f7 - f5;
                    } else {
                        f13 = v97VarB.e;
                        if (f12 < f13 || f12 > f5 + f13) {
                            f13 = f12 - f6;
                        } else {
                            f11 = (f6 + f13) / f2;
                        }
                    }
                }
                float f15 = f13;
                float f16 = f11;
                na3Var.c(f, f15);
                do {
                    value2 = l97Var.getValue();
                } while (!l97Var.j(value2, m(((r97) value2).b(f14, f16))));
                return;
            }
        }
        do {
            value = l97Var.getValue();
        } while (!l97Var.j(value, ((r97) value).b(f9, f11)));
    }

    @Override // o.c1
    public final boolean f() {
        return true;
    }

    @Override // o.c1
    public final void k() {
        l(0.0f, 0.0f);
    }

    @Override // o.c1
    public final void l(float f, float f2) {
        l97 l97Var;
        Object value;
        r97 r97VarB;
        j97 j97Var = this.d;
        na3 na3Var = this.c;
        v97 v97VarB = b();
        if (j97Var == null || na3Var == null || v97VarB == null) {
            return;
        }
        float f3 = v97VarB.a;
        i12 i12Var = (i12) j97Var.getValue();
        int i = i12Var.a;
        int i2 = i12Var.b;
        if (i == 0 || i2 == 0) {
            return;
        }
        if (f3 == 0.0f) {
            ye4.c("ControlMouseRemoteControl", "zoom level is 0");
            return;
        }
        do {
            l97Var = this.b;
            value = l97Var.getValue();
            r97 r97Var = (r97) value;
            PointF pointF = r97Var.a;
            float f4 = (f / f3) + pointF.x;
            float f5 = (f2 / f3) + pointF.y;
            if (f4 < 0.0f) {
                f4 = 0.0f;
            } else {
                float f6 = i - 1;
                if (f4 > f6) {
                    f4 = f6;
                }
            }
            if (f5 < 0.0f) {
                f5 = 0.0f;
            } else {
                float f7 = i2 - 1;
                if (f5 > f7) {
                    f5 = f7;
                }
            }
            r97VarB = r97Var.b(f4, f5);
            PointF pointF2 = r97VarB.a;
            PointF pointF3 = this.j;
            na3Var.d(pointF3, f3, pointF2);
            na3Var.c(pointF3.x, pointF3.y);
        } while (!l97Var.j(value, m(r97VarB)));
    }

    public final r97 m(r97 r97Var) {
        float f;
        float f2;
        v97 v97VarB = b();
        if (v97VarB != null) {
            float f3 = v97VarB.a;
            PointF pointF = r97Var.a;
            f = (pointF.x * f3) - v97VarB.d;
            f2 = (pointF.y * f3) - v97VarB.e;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        return r97Var.c(f, f2);
    }
}
