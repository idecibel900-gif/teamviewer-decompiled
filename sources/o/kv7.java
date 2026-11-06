package o;

/* JADX INFO: loaded from: classes.dex */
public final class kv7 extends es4 implements r04 {
    public mw4 A;
    public boolean B;
    public e87 C;
    public boolean D;
    public km E;
    public km F;
    public float G;
    public float H;

    @Override // o.es4
    public final boolean J0() {
        return false;
    }

    @Override // o.es4
    public final void M0() {
        im3.R(I0(), null, null, new ys7((Object) this, (hc1) null, (byte) 1), 3);
    }

    @Override // o.es4
    public final void O0() {
        this.E = null;
        this.F = null;
        this.H = Float.NaN;
        this.G = Float.NaN;
    }

    @Override // o.r04
    public final eo4 a(fo4 fo4Var, zn4 zn4Var, long j) {
        float f;
        float f2 = mo8.Q;
        byte b = 0;
        byte b2 = 1;
        boolean z = (zn4Var.a(r61.i(j)) == 0 || zn4Var.o(r61.h(j)) == 0) ? false : true;
        if (this.D) {
            f = mo8.J;
        } else {
            f = (z || this.B) ? hh7.a : hh7.b;
        }
        float fD0 = fo4Var.d0(f);
        km kmVar = this.F;
        int iFloatValue = (int) (kmVar != null ? ((Number) kmVar.d()).floatValue() : fD0);
        if (!((iFloatValue >= 0) & (iFloatValue >= 0))) {
            mi3.a("width and height must be >= 0");
        }
        jl5 jl5VarC = zn4Var.C(t61.h(iFloatValue, iFloatValue, iFloatValue, iFloatValue));
        float fD1 = fo4Var.d0((hh7.d - fo4Var.R(fD0)) / 2.0f);
        float fD2 = fo4Var.d0((hh7.c - hh7.a) - hh7.e);
        boolean z2 = this.D;
        if (z2 && this.B) {
            fD1 = fD2 - fo4Var.d0(f2);
        } else if (z2 && !this.B) {
            fD1 = fo4Var.d0(f2);
        } else if (this.B) {
            fD1 = fD2;
        }
        km kmVar2 = this.F;
        hc1 hc1Var = null;
        Float f3 = kmVar2 != null ? (Float) kmVar2.e.getValue() : null;
        if (f3 == null || f3.floatValue() != fD0) {
            im3.R(I0(), null, null, new jv7(this, fD0, hc1Var, b), 3);
        }
        km kmVar3 = this.E;
        Float f4 = kmVar3 != null ? (Float) kmVar3.e.getValue() : null;
        if (f4 == null || f4.floatValue() != fD1) {
            im3.R(I0(), null, null, new jv7(this, fD1, hc1Var, b2), 3);
        }
        if (Float.isNaN(this.H) && Float.isNaN(this.G)) {
            this.H = fD0;
            this.G = fD1;
        }
        return fo4Var.u(iFloatValue, iFloatValue, fa2.m, new xh(jl5VarC, this, fD1));
    }
}
