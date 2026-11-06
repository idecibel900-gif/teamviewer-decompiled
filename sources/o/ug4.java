package o;

/* JADX INFO: loaded from: classes.dex */
public final class ug4 implements i04 {
    public final tg4 m;

    public ug4(tg4 tg4Var) {
        this.m = tg4Var;
    }

    @Override // o.i04
    public final long A(long j) {
        return this.m.G.A(t65.e(j, a()));
    }

    @Override // o.i04
    public final long D(long j) {
        return t65.e(this.m.G.D(j), a());
    }

    @Override // o.i04
    public final i04 F() {
        tg4 tg4VarY0;
        if (!m()) {
            ki3.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        e45 e45Var = this.m.G.G.getOuterCoordinator$ui().K;
        if (e45Var == null || (tg4VarY0 = e45Var.Y0()) == null) {
            return null;
        }
        return tg4VarY0.J;
    }

    @Override // o.i04
    public final long K(i04 i04Var, long j) {
        return z(i04Var, j);
    }

    @Override // o.i04
    public final long N(long j) {
        return t65.e(this.m.G.N(j), a());
    }

    @Override // o.i04
    public final long P(long j) {
        return this.m.G.P(t65.e(j, a()));
    }

    @Override // o.i04
    public final void T(i04 i04Var, float[] fArr) {
        this.m.G.T(i04Var, fArr);
    }

    public final long a() {
        tg4 tg4Var = this.m;
        tg4 tg4VarP = xs1.P(tg4Var);
        return t65.d(z(tg4VarP.J, 0L), tg4Var.G.z(tg4VarP.G, 0L));
    }

    @Override // o.i04
    public final v56 b(i04 i04Var, boolean z) {
        return this.m.G.b(i04Var, z);
    }

    @Override // o.i04
    public final long e(long j) {
        return this.m.G.e(t65.e(j, a()));
    }

    @Override // o.i04
    public final void h(float[] fArr) {
        this.m.G.h(fArr);
    }

    @Override // o.i04
    public final long j() {
        tg4 tg4Var = this.m;
        return (((long) tg4Var.m) << 32) | (((long) tg4Var.n) & 4294967295L);
    }

    @Override // o.i04
    public final boolean m() {
        return this.m.G.a1().z;
    }

    @Override // o.i04
    public final long z(i04 i04Var, long j) {
        boolean z = i04Var instanceof ug4;
        tg4 tg4Var = this.m;
        if (!z) {
            tg4 tg4VarP = xs1.P(tg4Var);
            e45 e45Var = tg4VarP.G;
            long jZ = z(tg4VarP.J, j);
            long j2 = tg4VarP.H;
            long jD = t65.d(jZ, (4294967295L & ((long) Float.floatToRawIntBits((int) (j2 & 4294967295L)))) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32));
            if (!e45Var.a1().z) {
                ki3.c("LayoutCoordinate operations are only valid when isAttached is true");
            }
            e45Var.k1();
            e45 e45Var2 = e45Var.K;
            if (e45Var2 != null) {
                e45Var = e45Var2;
            }
            return t65.e(jD, e45Var.z(i04Var, 0L));
        }
        tg4 tg4Var2 = ((ug4) i04Var).m;
        e45 e45Var3 = tg4Var2.G;
        e45Var3.k1();
        tg4 tg4VarY0 = tg4Var.G.W0(e45Var3).Y0();
        if (tg4VarY0 != null) {
            long jB = vk3.b(vk3.c(tg4Var2.S0(tg4VarY0, false), us1.O(j)), tg4Var.S0(tg4VarY0, false));
            return (((long) Float.floatToRawIntBits((int) (jB >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jB & 4294967295L))) & 4294967295L);
        }
        tg4 tg4VarP2 = xs1.P(tg4Var2);
        long jC = vk3.c(vk3.c(tg4Var2.S0(tg4VarP2, false), tg4VarP2.H), us1.O(j));
        tg4 tg4VarP3 = xs1.P(tg4Var);
        long jB2 = vk3.b(jC, vk3.c(tg4Var.S0(tg4VarP3, false), tg4VarP3.H));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jB2 >> 32));
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits((int) (jB2 & 4294967295L))) & 4294967295L;
        e45 e45Var4 = tg4VarP3.G.K;
        e45Var4.getClass();
        e45 e45Var5 = tg4VarP2.G.K;
        e45Var5.getClass();
        return e45Var4.z(e45Var5, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
    }
}
