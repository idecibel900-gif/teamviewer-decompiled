package o;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public abstract class c1 {
    public final ma3 a;
    public final l97 b = im3.k(new r97(new PointF(0.5f, 0.5f), new PointF(0.0f, 0.0f), true));
    public na3 c;
    public j97 d;
    public j97 e;
    public final fc1 f;
    public n87 g;
    public n87 h;
    public ub3 i;

    public c1(ma3 ma3Var) {
        this.a = ma3Var;
        fc1 fc1VarE = hm3.e();
        this.f = fc1VarE;
        im3.R(fc1VarE, null, null, new y0(this, null, (byte) 1), 3);
        i(true);
    }

    public final void a() {
        this.a.destroy();
        this.d = null;
        this.e = null;
        g(null);
        ub3 ub3Var = this.i;
        if (ub3Var != null) {
            ub3Var.destroy();
        }
        this.i = null;
        hm3.f(this.f, null);
    }

    public final v97 b() {
        l97 l97Var;
        na3 na3Var = this.c;
        if (na3Var == null || (l97Var = ((a1) na3Var).e) == null) {
            return null;
        }
        return (v97) l97Var.getValue();
    }

    public void c(PointF pointF) {
        v97 v97VarB;
        Object value;
        float f;
        float f2;
        Object value2;
        pointF.getClass();
        j97 j97Var = this.e;
        if (j97Var == null || (v97VarB = b()) == null) {
            return;
        }
        i12 i12Var = (i12) j97Var.getValue();
        float f3 = v97VarB.a;
        int i = i12Var.a;
        int i2 = i12Var.b;
        float f4 = v97VarB.d;
        float f5 = v97VarB.e;
        float f6 = pointF.x;
        float f7 = f6 * f3;
        float f8 = pointF.y;
        float f9 = f8 * f3;
        float f10 = f7 - f4;
        float f11 = f9 - f5;
        l97 l97Var = this.b;
        if (i == 0 || i2 == 0 || Float.compare(f3, 0.0f) == 0) {
            do {
                value = l97Var.getValue();
            } while (!l97Var.j(value, ((r97) value).b(f6, f8)));
            return;
        }
        if (f7 <= f4) {
            f = f4 / f3;
            f10 = 0.0f;
        } else {
            if (i > 0) {
                float f12 = i;
                float f13 = f4 + f12;
                if (f7 >= f13) {
                    f6 = f13 / f3;
                    f10 = f12;
                }
            }
            f = f6;
        }
        if (f9 <= f5) {
            f2 = f5 / f3;
            f11 = 0.0f;
        } else {
            if (i2 > 0) {
                float f14 = i2;
                float f15 = f5 + f14;
                if (f9 >= f15) {
                    f8 = f15 / f3;
                    f11 = f14;
                }
            }
            f2 = f8;
        }
        do {
            value2 = l97Var.getValue();
        } while (!l97Var.j(value2, ((r97) value2).b(f, f2).c(f10, f11)));
    }

    public final void d(int i) {
        ub3 ub3Var = this.i;
        if (ub3Var != null) {
            ub3Var.c(i);
        }
    }

    public final void e(int i) {
        ub3 ub3Var = this.i;
        if (ub3Var != null) {
            ub3Var.b(i);
        }
    }

    public boolean f() {
        return false;
    }

    public final void g(na3 na3Var) {
        l97 l97Var;
        n87 n87Var = this.g;
        n87 n87VarR = null;
        if (n87Var != null) {
            n87Var.j(null);
        }
        this.c = na3Var;
        if (na3Var != null && (l97Var = ((a1) na3Var).e) != null) {
            n87VarR = im3.R(this.f, null, null, new h0((Object) l97Var, (Object) this, (hc1) n87VarR, (byte) 2), 3);
        }
        this.g = n87VarR;
    }

    public final void h(j97 j97Var) {
        j97Var.getClass();
        n87 n87Var = this.h;
        hc1 hc1Var = null;
        if (n87Var != null) {
            n87Var.j(null);
        }
        this.e = j97Var;
        this.h = im3.R(this.f, null, null, new h0((Object) j97Var, (Object) this, hc1Var, (byte) 3), 3);
    }

    public final void i(boolean z) {
        l97 l97Var;
        Object value;
        r97 r97Var;
        do {
            l97Var = this.b;
            value = l97Var.getValue();
            r97Var = (r97) value;
            r97Var.getClass();
        } while (!l97Var.j(value, r97.a(r97Var, null, null, z, 3)));
    }

    public void j(int i, int i2, int i3, int i4, int i5) {
        throw new UnsupportedOperationException();
    }

    public abstract void k();

    /* JADX WARN: Code duplicated, block: B:10:0x002c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:16:0x003a  */
    /* JADX WARN: Code duplicated, block: B:24:0x004b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    public void l(float f, float f2) {
        float f3;
        float f4;
        l97 l97Var;
        Object value;
        v97 v97VarB = b();
        j97 j97Var = this.d;
        if (v97VarB == null || j97Var == null) {
            return;
        }
        i12 i12Var = (i12) j97Var.getValue();
        float f5 = v97VarB.a;
        float f6 = v97VarB.d;
        float f7 = v97VarB.e;
        int i = i12Var.a;
        int i2 = i12Var.b;
        float f8 = i * f5;
        float f9 = i2 * f5;
        if (f6 < 0.0f) {
            float f10 = -f6;
            if (f < f10) {
                f = f10;
            } else if (f6 < 0.0f) {
                f3 = f8 - f6;
                if (f > f3) {
                    f = f3;
                } else if (f6 >= 0.0f && f > f8) {
                    f = f8 - 1.0f;
                }
            } else if (f6 >= 0.0f) {
                f = f8 - 1.0f;
            }
        } else if (f6 < 0.0f) {
            f3 = f8 - f6;
            if (f > f3) {
                f = f3;
            } else if (f6 >= 0.0f) {
                f = f8 - 1.0f;
            }
        } else if (f6 >= 0.0f) {
            f = f8 - 1.0f;
        }
        if (f7 < 0.0f) {
            float f11 = -f7;
            if (f2 < f11) {
                f2 = f11;
            } else if (f7 < 0.0f) {
                f4 = f9 - f7;
                if (f2 > f4) {
                    f2 = f4;
                } else if (f7 >= 0.0f && f2 > f9) {
                    f2 = f9 - 1.0f;
                }
            } else if (f7 >= 0.0f) {
                f2 = f9 - 1.0f;
            }
        } else if (f7 < 0.0f) {
            f4 = f9 - f7;
            if (f2 > f4) {
                f2 = f4;
            } else if (f7 >= 0.0f) {
                f2 = f9 - 1.0f;
            }
        } else if (f7 >= 0.0f) {
            f2 = f9 - 1.0f;
        }
        float f12 = (f6 + f) / f5;
        float f13 = (f7 + f2) / f5;
        float f14 = i - 1;
        if (f12 > f14) {
            f12 = f14;
        }
        float f15 = i2 - 1;
        if (f13 > f15) {
            f13 = f15;
        }
        do {
            l97Var = this.b;
            value = l97Var.getValue();
        } while (!l97Var.j(value, ((r97) value).b(f12, f13).c(f, f2)));
    }
}
