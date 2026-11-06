package o;

import coil3.compose.AsyncImagePainter;

/* JADX INFO: loaded from: classes.dex */
public abstract class w0 extends es4 implements t52, r04, dp6 {
    public he A;
    public sb1 B;
    public float C;
    public boolean D;
    public String E;
    public v61 F;

    public w0(he heVar, sb1 sb1Var, float f, boolean z, String str, v61 v61Var) {
        this.A = heVar;
        this.B = sb1Var;
        this.C = f;
        this.D = z;
        this.E = str;
        this.F = v61Var;
    }

    @Override // o.r04
    public final int H(rg4 rg4Var, zn4 zn4Var, int i) {
        long jB = t61.b(0, 0, 0, i, 7);
        v61 v61Var = this.F;
        if (v61Var != null) {
            v61Var.h(jB);
        }
        if (V0().i() == 9205357640488583168L) {
            return zn4Var.k(i);
        }
        long jW0 = W0(jB);
        return Math.max(r61.k(jW0), zn4Var.k(i));
    }

    @Override // o.es4
    public final boolean J0() {
        return false;
    }

    public final long U0(long j) {
        if (y07.c(j)) {
            return 0L;
        }
        long jI = V0().i();
        if (jI != 9205357640488583168L) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jI >> 32));
            if (Math.abs(fIntBitsToFloat) > Float.MAX_VALUE) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            }
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jI & 4294967295L));
            if (Math.abs(fIntBitsToFloat2) > Float.MAX_VALUE) {
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            }
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
            long jG = this.B.g(jFloatToRawIntBits, j);
            if (Math.abs(Float.intBitsToFloat((int) (jG >> 32))) <= Float.MAX_VALUE && Math.abs(Float.intBitsToFloat((int) (4294967295L & jG))) <= Float.MAX_VALUE) {
                return io1.h0(jFloatToRawIntBits, jG);
            }
        }
        return j;
    }

    public abstract ud5 V0();

    public final long W0(long j) {
        float fK;
        int iJ;
        float f;
        boolean zG = r61.g(j);
        boolean zF = r61.f(j);
        if (!zG || !zF) {
            ud5 ud5VarV0 = V0();
            boolean z = r61.e(j) && r61.d(j);
            long jI = ud5VarV0.i();
            if (jI != 9205357640488583168L) {
                if (!z || (!zG && !zF)) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jI >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jI & 4294967295L));
                    if (Math.abs(fIntBitsToFloat) <= Float.MAX_VALUE) {
                        int i = va8.b;
                        float fK2 = r61.k(j);
                        float fI = r61.i(j);
                        if (fIntBitsToFloat < fK2) {
                            fIntBitsToFloat = fK2;
                        }
                        if (fIntBitsToFloat <= fI) {
                            fI = fIntBitsToFloat;
                        }
                        fK = fI;
                    } else {
                        fK = r61.k(j);
                    }
                    if (Math.abs(fIntBitsToFloat2) <= Float.MAX_VALUE) {
                        int i2 = va8.b;
                        float fJ = r61.j(j);
                        float fH = r61.h(j);
                        if (fIntBitsToFloat2 < fJ) {
                            fIntBitsToFloat2 = fJ;
                        }
                        if (fIntBitsToFloat2 <= fH) {
                            fH = fIntBitsToFloat2;
                        }
                        f = fH;
                    } else {
                        iJ = r61.j(j);
                    }
                    long jU0 = U0((((long) Float.floatToRawIntBits(f)) & 4294967295L) | (((long) Float.floatToRawIntBits(fK)) << 32));
                    return r61.b(j, t61.g(vn4.s0(Float.intBitsToFloat((int) (jU0 >> 32))), j), 0, t61.f(vn4.s0(Float.intBitsToFloat((int) (jU0 & 4294967295L))), j), 0, 10);
                }
                fK = r61.i(j);
                iJ = r61.h(j);
                f = iJ;
                long jU1 = U0((((long) Float.floatToRawIntBits(f)) & 4294967295L) | (((long) Float.floatToRawIntBits(fK)) << 32));
                return r61.b(j, t61.g(vn4.s0(Float.intBitsToFloat((int) (jU1 >> 32))), j), 0, t61.f(vn4.s0(Float.intBitsToFloat((int) (jU1 & 4294967295L))), j), 0, 10);
            }
            if (z && (!(ud5VarV0 instanceof AsyncImagePainter) || ((sx) ((AsyncImagePainter) ud5VarV0).F.m.getValue()).a() != null)) {
                return r61.b(j, r61.i(j), 0, r61.h(j), 0, 10);
            }
        }
        return j;
    }

    @Override // o.r04
    public final eo4 a(fo4 fo4Var, zn4 zn4Var, long j) {
        v61 v61Var = this.F;
        if (v61Var != null) {
            v61Var.h(j);
        }
        jl5 jl5VarC = zn4Var.C(W0(j));
        return fo4Var.u(jl5VarC.m, jl5VarC.n, fa2.m, new v0(jl5VarC, (byte) 0));
    }

    @Override // o.r04
    public final int a0(rg4 rg4Var, zn4 zn4Var, int i) {
        long jB = t61.b(0, 0, 0, i, 7);
        v61 v61Var = this.F;
        if (v61Var != null) {
            v61Var.h(jB);
        }
        if (V0().i() == 9205357640488583168L) {
            return zn4Var.o(i);
        }
        long jW0 = W0(jB);
        return Math.max(r61.k(jW0), zn4Var.o(i));
    }

    @Override // o.r04
    public final int g(rg4 rg4Var, zn4 zn4Var, int i) {
        long jB = t61.b(0, i, 0, 0, 13);
        v61 v61Var = this.F;
        if (v61Var != null) {
            v61Var.h(jB);
        }
        if (V0().i() == 9205357640488583168L) {
            return zn4Var.a(i);
        }
        long jW0 = W0(jB);
        return Math.max(r61.j(jW0), zn4Var.a(i));
    }

    @Override // o.t52
    public final void j(d14 d14Var) {
        nl0 nl0Var = d14Var.m;
        long jU0 = U0(nl0Var.d());
        long jA = this.A.a(va8.e(jU0), va8.e(nl0Var.d()), d14Var.getLayoutDirection());
        int i = (int) (jA >> 32);
        int i2 = (int) (jA & 4294967295L);
        iu iuVar = nl0Var.n;
        long jD = iuVar.D();
        iuVar.x().g();
        try {
            xc0 xc0Var = (xc0) iuVar.f1103o;
            iu iuVar2 = (iu) xc0Var.n;
            if (this.D) {
                xc0Var.D(0.0f, 0.0f, Float.intBitsToFloat((int) (iuVar2.D() >> 32)), Float.intBitsToFloat((int) (4294967295L & iuVar2.D())), 1);
            }
            xc0Var.V(i, i2);
            V0().g(d14Var, jU0, this.C, null);
            iuVar.x().p();
            iuVar.S(jD);
            d14Var.a();
        } catch (Throwable th) {
            ua5.x(iuVar, jD);
            throw th;
        }
    }

    @Override // o.r04
    public final int r0(rg4 rg4Var, zn4 zn4Var, int i) {
        long jB = t61.b(0, i, 0, 0, 13);
        v61 v61Var = this.F;
        if (v61Var != null) {
            v61Var.h(jB);
        }
        if (V0().i() == 9205357640488583168L) {
            return zn4Var.V(i);
        }
        long jW0 = W0(jB);
        return Math.max(r61.j(jW0), zn4Var.V(i));
    }

    @Override // o.dp6
    public final void z(op6 op6Var) {
        String str = this.E;
        if (str != null) {
            lp6.d(op6Var, str);
            lp6.i(op6Var, 5);
        }
    }
}
