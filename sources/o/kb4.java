package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class kb4 {
    public static final /* synthetic */ int a = 0;

    static {
        float f = pb4.a;
        float f2 = pb4.b;
        bg5 bg5Var = qp5.a;
        if (!((f >= 0.0f) & ((((Boolean) bg5Var.getValue()).booleanValue() ? 12.0f : ga0.Y) >= 0.0f) & (f2 >= 0.0f)) || !((((Boolean) bg5Var.getValue()).booleanValue() ? 12.0f : ga0.v) >= 0.0f)) {
            ii3.a("Padding must be non-negative");
        }
    }

    public static jb4 a(long j, ux2 ux2Var) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8 = rv0.h;
        jb4 jb4VarB = b(((rn4) ux2Var.j(un4.a)).a);
        long j9 = jb4VarB.g;
        long j10 = jb4VarB.k;
        long j11 = jb4VarB.l;
        long j12 = jb4VarB.m;
        long j13 = jb4VarB.n;
        long j14 = jb4VarB.f1144o;
        long j15 = jb4VarB.p;
        long j16 = jb4VarB.q;
        long j17 = jb4VarB.r;
        long j18 = jb4VarB.s;
        long j19 = jb4VarB.t;
        long j20 = jb4VarB.u;
        long j21 = jb4VarB.v;
        long j22 = jb4VarB.w;
        long j23 = jb4VarB.x;
        long j24 = j != 16 ? j : jb4VarB.a;
        long j25 = j8 != 16 ? j8 : jb4VarB.b;
        long j26 = j8 != 16 ? j8 : jb4VarB.c;
        long j27 = j8 != 16 ? j8 : jb4VarB.d;
        long j28 = j8 != 16 ? j8 : jb4VarB.e;
        long j29 = j8 != 16 ? j8 : jb4VarB.f;
        long j30 = j8 != 16 ? j8 : jb4VarB.h;
        long j31 = j8 != 16 ? j8 : jb4VarB.i;
        if (j8 != 16) {
            long j32 = j25;
            long j33 = j26;
            j7 = j31;
            j2 = j8;
            j5 = j27;
            j6 = j28;
            j3 = j32;
            j4 = j33;
        } else {
            long j34 = j31;
            j2 = jb4VarB.j;
            j3 = j25;
            j4 = j26;
            j5 = j27;
            j6 = j28;
            j7 = j34;
        }
        return new jb4(j24, j3, j4, j5, j6, j29, j9, j30, j7, j2, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23);
    }

    public static jb4 b(zv0 zv0Var) {
        jb4 jb4Var = zv0Var.d0;
        if (jb4Var != null) {
            return jb4Var;
        }
        aw0 aw0Var = ga0.w;
        long jB = bw0.b(zv0Var, aw0Var);
        long jB2 = bw0.b(zv0Var, ga0.I);
        long jB3 = bw0.b(zv0Var, ga0.K);
        long jB4 = bw0.b(zv0Var, ga0.Z);
        long jB5 = bw0.b(zv0Var, ga0.O);
        long jB6 = bw0.b(zv0Var, ga0.V);
        long jB7 = bw0.b(zv0Var, ga0.P);
        long jB8 = bw0.b(zv0Var, ga0.Q);
        long jB9 = bw0.b(zv0Var, ga0.R);
        long jB10 = bw0.b(zv0Var, ga0.U);
        long jB11 = bw0.b(zv0Var, ga0.S);
        long jB12 = bw0.b(zv0Var, ga0.T);
        jb4 jb4Var2 = new jb4(jB, jB2, jB3, jB4, jB5, jB6, bw0.b(zv0Var, aw0Var), rv0.b(ga0.z, bw0.b(zv0Var, ga0.y)), rv0.b(ga0.B, bw0.b(zv0Var, ga0.A)), rv0.b(ga0.H, bw0.b(zv0Var, ga0.G)), rv0.b(ga0.D, bw0.b(zv0Var, ga0.C)), rv0.b(ga0.F, bw0.b(zv0Var, ga0.E)), jB7, jB8, jB9, jB10, jB11, jB12, bw0.b(zv0Var, ga0.g0), bw0.b(zv0Var, ga0.h0), bw0.b(zv0Var, ga0.i0), bw0.b(zv0Var, ga0.l0), bw0.b(zv0Var, ga0.j0), bw0.b(zv0Var, ga0.k0));
        zv0Var.d0 = jb4Var2;
        return jb4Var2;
    }
}
