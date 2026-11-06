package o;

import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class n08 {
    public static final pd5 a = new pd5(0.0f, 0.0f, 0.0f, 0.0f);
    public static final float b = 64.0f;

    public static h94 a(ux2 ux2Var) {
        WeakHashMap weakHashMap = wk8.w;
        return new h94(new c88(b77.g(ux2Var).g, b77.g(ux2Var).b), g77.e | 16);
    }

    public static m08 b(long j, long j2, long j3, long j4, ux2 ux2Var, int i) {
        long j5 = rv0.h;
        long j6 = (i & 16) != 0 ? j5 : j4;
        zv0 zv0Var = ((rn4) ux2Var.j(un4.a)).a;
        m08 m08Var = zv0Var.a0;
        if (m08Var == null) {
            m08 m08Var2 = new m08(bw0.b(zv0Var, g68.a), bw0.b(zv0Var, g68.c), bw0.b(zv0Var, g68.b), bw0.b(zv0Var, g68.e), bw0.b(zv0Var, g68.f), bw0.b(zv0Var, g68.d));
            zv0Var.a0 = m08Var2;
            m08Var = m08Var2;
        }
        long j7 = j != 16 ? j : m08Var.a;
        long j8 = j5 != 16 ? j5 : m08Var.b;
        long j9 = j2 != 16 ? j2 : m08Var.c;
        long j10 = j3 != 16 ? j3 : m08Var.d;
        if (j6 == 16) {
            j6 = m08Var.e;
        }
        long j11 = j6;
        if (j5 == 16) {
            j5 = m08Var.f;
        }
        return new m08(j7, j8, j9, j10, j11, j5);
    }
}
