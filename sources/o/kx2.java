package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kx2 implements qy2 {
    public static final kx2 a;
    private static final fq6 descriptor;

    static {
        kx2 kx2Var = new kx2();
        a = kx2Var;
        an5 an5Var = new an5("o.mx2", kx2Var, 2);
        an5Var.j("platform", false);
        an5Var.j("url", false);
        descriptor = an5Var;
    }

    @Override // o.nw3
    public final void a(bb7 bb7Var, Object obj) {
        mx2 mx2Var = (mx2) obj;
        mx2Var.getClass();
        fq6 fq6Var = descriptor;
        bb7 bb7VarA = bb7Var.a(fq6Var);
        bb7VarA.r(fq6Var, 0, mx2Var.a);
        bb7VarA.r(fq6Var, 1, mx2Var.b);
        bb7VarA.s(fq6Var);
    }

    @Override // o.nw3
    public final Object b(aj1 aj1Var) {
        fq6 fq6Var = descriptor;
        k01 k01VarU = aj1Var.u(fq6Var);
        String strT = null;
        boolean z = true;
        int i = 0;
        String strT2 = null;
        while (z) {
            int iL = k01VarU.l(fq6Var);
            if (iL == -1) {
                z = false;
            } else if (iL == 0) {
                strT = k01VarU.t(fq6Var, 0);
                i |= 1;
            } else {
                if (iL != 1) {
                    throw new h88(iL);
                }
                strT2 = k01VarU.t(fq6Var, 1);
                i |= 2;
            }
        }
        k01VarU.i(fq6Var);
        return new mx2(i, strT, strT2);
    }

    @Override // o.qy2
    public final nw3[] c() {
        gb7 gb7Var = gb7.a;
        return new nw3[]{gb7Var, gb7Var};
    }

    @Override // o.nw3
    public final fq6 d() {
        return descriptor;
    }
}
