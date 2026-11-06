package o;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public class nc1 extends a1 {
    public float p;
    public float q;
    public float r;
    public float s;
    public int t;
    public int u;

    @Override // o.a1, o.na3
    public final void a(j97 j97Var) {
        j97Var.getClass();
        super.a(j97Var);
        i12 i12Var = (i12) j97Var.getValue();
        this.t = i12Var.a;
        this.u = i12Var.b;
    }

    @Override // o.na3
    public final void b() {
        l97 l97Var = this.e;
        l97Var.k(p((v97) l97Var.getValue()));
    }

    @Override // o.na3
    public final void c(float f, float f2) {
        l97 l97Var;
        Object value;
        do {
            l97Var = this.e;
            value = l97Var.getValue();
        } while (!l97Var.j(value, q(((v97) value).b(f, f2))));
    }

    @Override // o.na3
    public final void d(PointF pointF, float f, PointF pointF2) {
        pointF.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // o.na3
    public final void f(float f, float f2, float f3) {
        l97 l97Var;
        Object value;
        v97 v97VarP;
        if (this.f280o) {
            do {
                l97Var = this.e;
                value = l97Var.getValue();
                v97 v97Var = (v97) value;
                float f4 = v97Var.a;
                v97VarP = p(v97Var.c(o(f, f4)));
                if (f4 != 0.0f) {
                    float f5 = v97VarP.a / f4;
                    v97VarP = v97VarP.b(((v97VarP.d + f2) * f5) - f2, ((v97VarP.e + f3) * f5) - f3);
                }
                s(v97VarP);
            } while (!l97Var.j(value, q(v97VarP)));
        }
    }

    @Override // o.a1
    public final void l() {
        r();
    }

    @Override // o.a1
    public void m() {
        r();
    }

    @Override // o.a1
    public final void n() {
        l97 l97Var;
        Object value;
        v97 v97Var;
        j97 j97Var = this.h;
        if (j97Var == null) {
            return;
        }
        i12 i12Var = (i12) j97Var.getValue();
        int i = i12Var.a;
        int i2 = i12Var.b;
        int i3 = (this.t - i) / 2;
        int i4 = (this.u - i2) / 2;
        this.t = i;
        this.u = i2;
        do {
            l97Var = this.e;
            value = l97Var.getValue();
            v97Var = (v97) value;
        } while (!l97Var.j(value, v97Var.b(v97Var.d + i3, v97Var.e + i4)));
        r();
    }

    public final v97 p(v97 v97Var) {
        if (!this.f280o) {
            return v97Var;
        }
        v97 v97VarC = v97Var.c(k(v97Var.a));
        s(v97VarC);
        return q(v97VarC);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a A[PHI: r2
      0x000a: PHI (r2v4 float) = (r2v0 float), (r2v1 float) binds: [B:3:0x0008, B:6:0x0010] A[DONT_GENERATE, DONT_INLINE]] */
    public final v97 q(v97 v97Var) {
        float f = v97Var.d;
        float f2 = v97Var.e;
        float f3 = this.p;
        if (f < f3) {
            f = f3;
        } else {
            f3 = this.q;
            if (f > f3) {
                f = f3;
            }
        }
        float f4 = this.r;
        if (f2 < f4) {
            f2 = f4;
        } else {
            float f5 = this.s;
            if (f2 > f5) {
                f2 = f5;
            }
        }
        return v97Var.b(f, f2);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0063  */
    /* JADX WARN: Code duplicated, block: B:27:0x0066 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0068  */
    public final void r() {
        l97 l97Var;
        Object value;
        v97 v97VarP;
        r97 r97Var;
        r97 r97Var2;
        i12 i12Var;
        int i;
        int i2;
        g();
        do {
            l97Var = this.e;
            value = l97Var.getValue();
            v97VarP = p((v97) value);
            l97 l97Var2 = this.f;
            if (l97Var2 == null || (r97Var = (r97) l97Var2.getValue()) == null || !r97Var.c) {
                v97VarP = q(v97VarP);
            } else {
                l97 l97Var3 = this.f;
                if (l97Var3 != null && (r97Var2 = (r97) l97Var3.getValue()) != null) {
                    PointF pointF = r97Var2.a;
                    j97 j97Var = this.h;
                    if (j97Var != null && (i12Var = (i12) j97Var.getValue()) != null) {
                        float f = v97VarP.d;
                        int i3 = (int) f;
                        int i4 = (int) (f + i12Var.a);
                        float f2 = v97VarP.e;
                        int i5 = (int) f2;
                        int i6 = (int) (f2 + i12Var.b);
                        float f3 = pointF.x;
                        float f4 = v97VarP.a;
                        int i7 = (int) (f3 * f4);
                        int i8 = (int) (pointF.y * f4);
                        if (i7 < i3) {
                            i = i7 - i3;
                        } else {
                            if (i4 < i7) {
                                i = (i7 - i4) + 2;
                            }
                            if (i8 < i5) {
                                i2 = i8 - i5;
                            } else {
                                if (i6 < i8) {
                                    i2 = (i8 - i6) + 2;
                                }
                                v97VarP = q(v97VarP.b(i3, i5));
                            }
                            i5 += i2;
                            v97VarP = q(v97VarP.b(i3, i5));
                        }
                        i3 += i;
                        if (i8 < i5) {
                            i2 = i8 - i5;
                        } else {
                            if (i6 < i8) {
                                i2 = (i8 - i6) + 2;
                            }
                            v97VarP = q(v97VarP.b(i3, i5));
                        }
                        i5 += i2;
                        v97VarP = q(v97VarP.b(i3, i5));
                    }
                }
            }
        } while (!l97Var.j(value, v97VarP));
    }

    public final void s(v97 v97Var) {
        i12 i12Var;
        j97 j97Var;
        i12 i12Var2;
        float f = v97Var.a;
        j97 j97Var2 = this.g;
        if (j97Var2 == null || (i12Var = (i12) j97Var2.getValue()) == null || (j97Var = this.h) == null || (i12Var2 = (i12) j97Var.getValue()) == null) {
            return;
        }
        float f2 = (i12Var.a * f) - i12Var2.a;
        float f3 = (i12Var.b * f) - i12Var2.b;
        float fMin = Math.min(0.0f, f2 / 2.0f);
        this.p = fMin;
        this.q = Math.max(fMin, f2);
        float fMin2 = Math.min(0.0f, f3 / 2.0f);
        this.r = fMin2;
        this.s = Math.max(fMin2, f3);
    }
}
