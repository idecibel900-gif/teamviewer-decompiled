package o;

/* JADX INFO: loaded from: classes.dex */
public final class cb1 extends es4 implements v01, go4 {
    public gb5 A;
    public final yk6 B;
    public boolean C;
    public nb0 D;
    public final rk6 E;
    public boolean G;
    public boolean I;
    public final eb0 F = new eb0((byte) 0);
    public long H = -1;

    public cb1(gb5 gb5Var, yk6 yk6Var, boolean z, nb0 nb0Var, rk6 rk6Var) {
        this.A = gb5Var;
        this.B = yk6Var;
        this.C = z;
        this.D = nb0Var;
        this.E = rk6Var;
    }

    public static boolean W0(cb1 cb1Var, v56 v56Var, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = cb1Var.V0();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long jY0 = cb1Var.Y0(v56Var, j3, j2);
        return Math.abs(Float.intBitsToFloat((int) (jY0 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jY0 & 4294967295L))) <= 0.5f;
    }

    @Override // o.es4
    public final boolean J0() {
        return false;
    }

    public final float U0(nb0 nb0Var, long j) {
        float f;
        v56 v56Var;
        int iCompare;
        long j2 = this.H;
        xx4 xx4Var = this.F.a;
        int i = xx4Var.f2559o - 1;
        Object[] objArr = xx4Var.m;
        if (i < objArr.length) {
            v56Var = null;
            while (true) {
                if (i < 0) {
                    f = 0.0f;
                    break;
                }
                v56 v56Var2 = (v56) ((za1) objArr[i]).a.a();
                if (v56Var2 != null) {
                    long jC = v56Var2.c();
                    long jA0 = xs1.a0(V0());
                    f = 0.0f;
                    int iOrdinal = this.A.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jC & 4294967295L)), Float.intBitsToFloat((int) (jA0 & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            gk0.s();
                            return 0.0f;
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jC >> 32)), Float.intBitsToFloat((int) (jA0 >> 32)));
                    }
                    if (iCompare > 0) {
                        if (v56Var != null) {
                            break;
                        }
                        v56Var = v56Var2;
                        break;
                    }
                    v56Var = v56Var2;
                }
                i--;
            }
        } else {
            f = 0.0f;
            v56Var = null;
        }
        if (v56Var == null) {
            v56 v56Var3 = this.G ? (v56) this.E.a() : null;
            if (v56Var3 == null) {
                return f;
            }
            v56Var = v56Var3;
        }
        long jA1 = xs1.a0(j2);
        int iOrdinal2 = this.A.ordinal();
        if (iOrdinal2 == 0) {
            float f2 = v56Var.b;
            return nb0Var.a(f2 - ((int) (j & 4294967295L)), v56Var.d - f2, Float.intBitsToFloat((int) (jA1 & 4294967295L)));
        }
        if (iOrdinal2 == 1) {
            float f3 = v56Var.a;
            return nb0Var.a(f3 - ((int) (j >> 32)), v56Var.c - f3, Float.intBitsToFloat((int) (jA1 >> 32)));
        }
        gk0.s();
        return f;
    }

    public final long V0() {
        long j = this.H;
        if (dl3.b(j, -1L)) {
            return 0L;
        }
        return j;
    }

    public final void X0(long j) {
        nb0 nb0Var = this.D;
        if (nb0Var == null) {
            nb0Var = (nb0) xk0.q(this, pb0.a);
        }
        nb0 nb0Var2 = nb0Var;
        if (this.I) {
            ni3.c("launchAnimation called when previous animation was running");
        }
        nb0 nb0Var3 = this.D;
        if (nb0Var3 == null) {
            nb0Var3 = (nb0) xk0.q(this, pb0.a);
        }
        nb0Var3.getClass();
        nb0.a.getClass();
        o98 o98Var = new o98(mb0.b);
        im3.R(I0(), null, pe1.p, new bb1(this, o98Var, nb0Var2, j, null), 1);
    }

    public final long Y0(v56 v56Var, long j, long j2) {
        long jA0 = xs1.a0(j);
        int iOrdinal = this.A.ordinal();
        if (iOrdinal == 0) {
            nb0 nb0Var = this.D;
            if (nb0Var == null) {
                nb0Var = (nb0) xk0.q(this, pb0.a);
            }
            float f = v56Var.b;
            return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(nb0Var.a(f - ((int) (j2 & 4294967295L)), v56Var.d - f, Float.intBitsToFloat((int) (jA0 & 4294967295L))))) & 4294967295L);
        }
        if (iOrdinal != 1) {
            gk0.s();
            return 0L;
        }
        nb0 nb0Var2 = this.D;
        if (nb0Var2 == null) {
            nb0Var2 = (nb0) xk0.q(this, pb0.a);
        }
        float f2 = v56Var.a;
        return (((long) Float.floatToRawIntBits(nb0Var2.a(f2 - ((int) (j2 >> 32)), v56Var.c - f2, Float.intBitsToFloat((int) (jA0 >> 32))))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
    }

    @Override // o.go4
    public final void b(long j) {
        int iT;
        long j2;
        long jV0 = V0();
        this.H = j;
        int iOrdinal = this.A.ordinal();
        if (iOrdinal == 0) {
            iT = im3.t((int) (j & 4294967295L), (int) (jV0 & 4294967295L));
        } else {
            if (iOrdinal != 1) {
                gk0.s();
                return;
            }
            iT = im3.t((int) (j >> 32), (int) (jV0 >> 32));
        }
        if (iT >= 0) {
            return;
        }
        if (this.C) {
            j2 = 0;
        } else {
            j2 = this.A == gb5.m ? ((long) (((int) (jV0 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L : ((long) (((int) (jV0 >> 32)) - ((int) (j >> 32)))) << 32;
        }
        long j3 = j2;
        v56 v56Var = (v56) this.E.a();
        if (v56Var == null || this.I || this.G || !W0(this, v56Var, jV0, 0L, 2) || W0(this, v56Var, 0L, j3, 1)) {
            return;
        }
        this.G = true;
        X0(j3);
    }
}
