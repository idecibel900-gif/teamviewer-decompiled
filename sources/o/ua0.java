package o;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: loaded from: classes.dex */
public abstract class ua0 {
    public static final jx4 a = b(true);
    public static final jx4 b = b(false);
    public static final ei c = ei.e;

    public static final void a(fs4 fs4Var, ux2 ux2Var, int i) {
        int i2;
        ux2Var.Y(-211209833);
        if ((i & 6) == 0) {
            i2 = (ux2Var.f(fs4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b2 = 0;
        if (ux2Var.N(i2 & 1, (i2 & 3) != 2)) {
            int iHashCode = Long.hashCode(ux2Var.T);
            fs4 fs4VarS = uf0.s(ux2Var, fs4Var);
            yj5 yj5VarL = ux2Var.l();
            yz0.c.getClass();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(c, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, d82.t, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ta0(fs4Var, i, b2);
        }
    }

    public static final jx4 b(boolean z) {
        jx4 jx4Var = new jx4(9);
        y50 y50Var = xz2.f2564o;
        jx4Var.m(y50Var, new wa0(y50Var, z));
        y50 y50Var2 = xz2.p;
        jx4Var.m(y50Var2, new wa0(y50Var2, z));
        y50 y50Var3 = xz2.q;
        jx4Var.m(y50Var3, new wa0(y50Var3, z));
        y50 y50Var4 = xz2.r;
        jx4Var.m(y50Var4, new wa0(y50Var4, z));
        y50 y50Var5 = xz2.s;
        jx4Var.m(y50Var5, new wa0(y50Var5, z));
        y50 y50Var6 = xz2.t;
        jx4Var.m(y50Var6, new wa0(y50Var6, z));
        y50 y50Var7 = xz2.u;
        jx4Var.m(y50Var7, new wa0(y50Var7, z));
        y50 y50Var8 = xz2.v;
        jx4Var.m(y50Var8, new wa0(y50Var8, z));
        y50 y50Var9 = xz2.w;
        jx4Var.m(y50Var9, new wa0(y50Var9, z));
        return jx4Var;
    }

    public static final do4 c(he heVar, boolean z) {
        do4 do4Var = (do4) (z ? a : b).g(heVar);
        return do4Var == null ? new wa0(heVar, z) : do4Var;
    }

    public static final void d(il5 il5Var, jl5 jl5Var, zn4 zn4Var, j04 j04Var, int i, int i2, he heVar) {
        y50 y50Var;
        Object objE = zn4Var.E();
        sa0 sa0Var = objE instanceof sa0 ? (sa0) objE : null;
        il5.j(il5Var, jl5Var, ((sa0Var == null || (y50Var = sa0Var.A) == null) ? heVar : y50Var).a((((long) jl5Var.m) << 32) | (((long) jl5Var.n) & 4294967295L), (((long) i) << 32) | (((long) i2) & 4294967295L), j04Var));
    }
}
