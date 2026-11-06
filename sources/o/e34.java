package o;

/* JADX INFO: loaded from: classes.dex */
public final class e34 extends es4 implements r04 {
    public static final c34 D = new c34();
    public g44 A;
    public eb0 B;
    public gb5 C;

    public final boolean U0(a34 a34Var, int i) {
        if (i != 5 && i != 6) {
            if (i == 3 || i == 4) {
                if (this.C != gb5.m) {
                }
            } else if (i != 1 && i != 2) {
                hk0.l("Lazy list does not support beyond bounds layout for the specified direction");
                return false;
            }
            if (V0(i) ? a34Var.a > 0 : a34Var.b < this.A.a.j().f1627o - 1) {
                return true;
            }
        } else if (this.C != gb5.n) {
            if (V0(i)) {
            }
        }
        return false;
    }

    public final boolean V0(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 5) {
            return false;
        }
        if (i == 6) {
            return true;
        }
        if (i == 3) {
            int iOrdinal = vn4.p0(this).M.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 1) {
                return true;
            }
            gk0.s();
            return false;
        }
        if (i != 4) {
            hk0.l("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        int iOrdinal2 = vn4.p0(this).M.ordinal();
        if (iOrdinal2 == 0) {
            return true;
        }
        if (iOrdinal2 == 1) {
            return false;
        }
        gk0.s();
        return false;
    }

    @Override // o.r04
    public final eo4 a(fo4 fo4Var, zn4 zn4Var, long j) {
        jl5 jl5VarC = zn4Var.C(j);
        return fo4Var.u(jl5VarC.m, jl5VarC.n, fa2.m, new v0(jl5VarC, (byte) 8));
    }
}
