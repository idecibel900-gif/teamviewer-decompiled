package o;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public abstract class a1 implements na3 {
    public final oa3 a;
    public final float d;
    public l97 f;
    public j97 g;
    public j97 h;
    public j97 i;
    public final fc1 j;
    public float k;
    public float l;
    public float m;
    public float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f280o;
    public float b = 0.2f;
    public float c = 2.0f;
    public final l97 e = im3.k(new v97());

    public a1(oa3 oa3Var) {
        this.a = oa3Var;
        this.d = oa3Var.g();
        fc1 fc1VarE = hm3.e();
        this.j = fc1VarE;
        im3.R(fc1VarE, null, null, new y0(this, null, (byte) 0), 3);
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = 48.0f;
        this.n = -1.0f;
    }

    @Override // o.na3
    public void a(j97 j97Var) {
        j97Var.getClass();
        if (this.h != null) {
            hk0.l("Check failed.");
            return;
        }
        this.h = j97Var;
        im3.R(this.j, null, null, new z0(j97Var, this, null, (byte) 2), 3);
    }

    @Override // o.na3
    public void e(PointF pointF, float f, PointF pointF2) {
        pointF2.getClass();
    }

    @Override // o.na3
    public void g() {
        i12 i12Var;
        j97 j97Var;
        i12 i12Var2;
        oa3 oa3Var = this.a;
        int iC = oa3Var.c();
        if (iC == 0) {
            iC = 100;
        }
        float fFloatValue = iC * ((Number) ((vd5) oa3Var.a().getValue()).n).floatValue();
        float f = this.d;
        this.c = f / fFloatValue;
        j97 j97Var2 = this.g;
        if (j97Var2 == null || (i12Var = (i12) j97Var2.getValue()) == null || (j97Var = this.h) == null || (i12Var2 = (i12) j97Var.getValue()) == null) {
            return;
        }
        int i = i12Var.a;
        int i2 = i12Var.b;
        int i3 = i12Var2.a;
        int i4 = i12Var2.b;
        if (i <= 0 || i2 <= 0 || i3 <= 0 || i4 <= 0) {
            this.f280o = false;
            this.b = 0.2f;
            this.c = 2.0f;
            this.k = 1.0f;
            this.m = 48.0f;
            return;
        }
        this.f280o = true;
        float f2 = i;
        float f3 = i3 / f2;
        float f4 = i4 / i2;
        float fMax = Math.max(f3, f4);
        this.b = Math.min(f3, f4);
        this.k = fMax;
        this.m = (f * 0.3f) / f2;
        if (fMax > this.c) {
            this.c = fMax;
        }
    }

    public final void h() {
        hm3.f(this.j, null);
        this.a.destroy();
    }

    public final void i(j97 j97Var) {
        j97Var.getClass();
        if (this.i != null) {
            hk0.l("Check failed.");
            return;
        }
        this.i = j97Var;
        im3.R(this.j, null, null, new z0(j97Var, this, null, (byte) 0), 3);
    }

    public final void j(j97 j97Var) {
        j97Var.getClass();
        if (this.g != null) {
            hk0.l("Check failed.");
            return;
        }
        this.g = j97Var;
        im3.R(this.j, null, null, new z0(j97Var, this, null, (byte) 1), 3);
    }

    public float k(float f) {
        float f2 = this.b;
        if (f < f2) {
            return f2;
        }
        float f3 = this.c;
        return f > f3 ? f3 : f;
    }

    public abstract void l();

    public abstract void m();

    public abstract void n();

    public final float o(float f, float f2) {
        float f3 = this.b;
        float f4 = this.k;
        float f5 = this.m;
        if (f3 > f4 - f5 && f3 < f4 + f5) {
            float f6 = f2 * f;
            this.l = f6;
            return f6;
        }
        float f7 = f2 == f4 ? this.l * f : f2 * f;
        if ((f4 > f2 && f2 > f4 - f5 && f4 > f7) || (f4 < f2 && f2 < f4 + f5 && f4 < f7)) {
            this.l = f7;
            return f7;
        }
        if (f7 <= f4 - f5 || f7 >= f5 + f4 || f7 <= f3 || f7 >= this.c) {
            this.l = f7;
            return f7;
        }
        this.l = f7;
        return f4;
    }
}
