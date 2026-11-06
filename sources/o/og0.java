package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class og0 {
    public static final pd5 a;
    public static final pd5 b;
    public static final float c;

    static {
        float f = uf0.T;
        float f2 = uf0.U;
        a = new pd5(f, 8.0f, f2, 8.0f);
        if (!(f2 >= 0.0f)) {
            ii3.a("Padding must be non-negative");
        }
        b = new pd5(12.0f, 8.0f, 12.0f, 8.0f);
        if (!((8.0f >= 0.0f) & (8.0f >= 0.0f))) {
            ii3.a("Padding must be non-negative");
        }
        c = 58.0f;
    }

    public static ng0 a(ux2 ux2Var) {
        return c(((rn4) ux2Var.j(un4.a)).a);
    }

    public static ng0 b(long j, long j2, long j3, long j4, ux2 ux2Var) {
        return c(((rn4) ux2Var.j(un4.a)).a).a(j, j2, j3, j4);
    }

    public static ng0 c(zv0 zv0Var) {
        ng0 ng0Var = zv0Var.W;
        if (ng0Var != null) {
            return ng0Var;
        }
        ng0 ng0Var2 = new ng0(bw0.b(zv0Var, iq8.A), bw0.b(zv0Var, iq8.G), rv0.b(iq8.C, bw0.b(zv0Var, iq8.B)), rv0.b(iq8.E, bw0.b(zv0Var, iq8.D)));
        zv0Var.W = ng0Var2;
        return ng0Var2;
    }

    public static ng0 d(zv0 zv0Var) {
        ng0 ng0Var = zv0Var.Y;
        if (ng0Var != null) {
            return ng0Var;
        }
        long j = rv0.g;
        ng0 ng0Var2 = new ng0(j, bw0.b(zv0Var, aw0.y), j, rv0.b(au8.T0, bw0.b(zv0Var, au8.S0)));
        zv0Var.Y = ng0Var2;
        return ng0Var2;
    }

    public static d90 e(int i, ux2 ux2Var, boolean z) {
        long jB;
        aw0 aw0Var = iq8.L;
        if ((i & 1) != 0) {
            z = true;
        }
        float f = j51.c;
        if (z) {
            ux2Var.W(-112362814);
            jB = bw0.c(aw0Var, ux2Var);
            ux2Var.p(false);
        } else {
            ux2Var.W(-112275208);
            jB = rv0.b(0.1f, bw0.c(aw0Var, ux2Var));
            ux2Var.p(false);
        }
        return new d90(f, new t57(jB));
    }

    public static ng0 f(long j, ux2 ux2Var) {
        long j2 = rv0.h;
        return d(((rn4) ux2Var.j(un4.a)).a).a(j2, j, j2, j2);
    }
}
