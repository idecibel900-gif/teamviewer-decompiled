package o;

/* JADX INFO: loaded from: classes.dex */
public final class aj4 extends nc1 {
    public zi4 v;

    @Override // o.a1, o.na3
    public final void g() {
        super.g();
        oa3 oa3Var = this.a;
        float fMax = this.d / ((Math.max(100, oa3Var.c()) * 1.6f) * ((Number) ((vd5) oa3Var.a().getValue()).n).floatValue());
        this.c = Math.min(this.c, fMax);
        this.b = Math.min(this.b, fMax);
    }

    @Override // o.a1
    public final float k(float f) {
        zi4 zi4Var;
        float fK = super.k(f);
        if (fK >= this.c && v() && (zi4Var = this.v) != null) {
            zi4Var.g();
        }
        return fK;
    }

    @Override // o.nc1, o.a1
    public final void m() {
        l97 l97Var;
        Object value;
        do {
            l97Var = this.e;
            value = l97Var.getValue();
        } while (!l97Var.j(value, ((v97) value).c(0.0f)));
        r();
    }

    public final boolean t() {
        i12 i12Var;
        j97 j97Var;
        i12 i12Var2;
        j97 j97Var2 = this.g;
        if (j97Var2 == null || (i12Var = (i12) j97Var2.getValue()) == null || (j97Var = this.h) == null || (i12Var2 = (i12) j97Var.getValue()) == null) {
            return false;
        }
        int i = i12Var.a;
        int i2 = i12Var.b;
        int i3 = i12Var2.a;
        int i4 = i12Var2.b;
        return i > 0 && i2 > 0 && i3 > 0 && i4 > 0 && ((float) i4) / ((float) i2) > ((float) i3) / ((float) i) && ((v97) this.e.getValue()).a <= this.k;
    }

    public final boolean u() {
        i12 i12Var;
        j97 j97Var;
        i12 i12Var2;
        j97 j97Var2 = this.g;
        if (j97Var2 == null || (i12Var = (i12) j97Var2.getValue()) == null || (j97Var = this.h) == null || (i12Var2 = (i12) j97Var.getValue()) == null) {
            return false;
        }
        int i = i12Var.a;
        int i2 = i12Var.b;
        int i3 = i12Var2.a;
        int i4 = i12Var2.b;
        return i > 0 && i2 > 0 && i3 > 0 && i4 > 0 && ((float) i3) / ((float) i) > ((float) i4) / ((float) i2) && ((v97) this.e.getValue()).a <= this.k;
    }

    public final boolean v() {
        i12 i12Var;
        float f;
        oa3 oa3Var = this.a;
        j22 j22VarB = oa3Var.b();
        float fC = (oa3Var.c() * 160) / 100.0f;
        j97 j97Var = this.h;
        if (j97Var == null || (i12Var = (i12) j97Var.getValue()) == null) {
            return false;
        }
        int i = i12Var.a;
        int i2 = i12Var.b;
        float f2 = this.d;
        float f3 = (i * 160) / f2;
        float f4 = (i2 * 160) / f2;
        int i3 = j22VarB.m;
        int i4 = j22VarB.n;
        if (fC == 0.0f) {
            f = i3 * 160;
            fC = 160.0f;
        } else {
            f = i3 * 160;
        }
        return (f / fC) / f3 >= 1.15f || (((float) (i4 * 160)) / fC) / f4 >= 1.15f;
    }
}
