package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class ud5 {
    public gy8 m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public tv0 f2202o;
    public float p = 1.0f;
    public j04 q = j04.m;

    public boolean d(float f) {
        return false;
    }

    public boolean e(tv0 tv0Var) {
        return false;
    }

    public void f(j04 j04Var) {
    }

    public final void g(u52 u52Var, long j, float f, tv0 tv0Var) {
        if (this.p != f) {
            if (!d(f)) {
                gy8 gy8VarK = this.m;
                if (f == 1.0f) {
                    if (gy8VarK != null) {
                        gy8VarK.j(f);
                    }
                    this.n = false;
                } else {
                    if (gy8VarK == null) {
                        gy8VarK = ka0.k();
                        this.m = gy8VarK;
                    }
                    gy8VarK.j(f);
                    this.n = true;
                }
            }
            this.p = f;
        }
        if (!im3.n(this.f2202o, tv0Var)) {
            if (!e(tv0Var)) {
                gy8 gy8VarK2 = this.m;
                if (tv0Var == null) {
                    if (gy8VarK2 != null) {
                        gy8VarK2.m(null);
                    }
                    this.n = false;
                } else {
                    if (gy8VarK2 == null) {
                        gy8VarK2 = ka0.k();
                        this.m = gy8VarK2;
                    }
                    gy8VarK2.m(tv0Var);
                    this.n = true;
                }
            }
            this.f2202o = tv0Var;
        }
        j04 layoutDirection = u52Var.getLayoutDirection();
        if (this.q != layoutDirection) {
            f(layoutDirection);
            this.q = layoutDirection;
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (u52Var.d() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (u52Var.d() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((xc0) u52Var.h0().f1103o).O(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    if (this.n) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i);
                        v56 v56VarV = qs1.v(0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32));
                        ll0 ll0VarX = u52Var.h0().x();
                        gy8 gy8VarK3 = this.m;
                        if (gy8VarK3 == null) {
                            gy8VarK3 = ka0.k();
                            this.m = gy8VarK3;
                        }
                        try {
                            ll0VarX.s(v56VarV, gy8VarK3);
                            j(u52Var);
                            ll0VarX.p();
                        } catch (Throwable th) {
                            ll0VarX.p();
                            throw th;
                        }
                    } else {
                        j(u52Var);
                    }
                }
            } catch (Throwable th2) {
                ((xc0) u52Var.h0().f1103o).O(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
                throw th2;
            }
        }
        ((xc0) u52Var.h0().f1103o).O(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
    }

    public long i() {
        return 9205357640488583168L;
    }

    public abstract void j(u52 u52Var);
}
