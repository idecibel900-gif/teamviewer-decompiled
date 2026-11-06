package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class db5 implements qy2 {
    public static final db5 a;
    private static final fq6 descriptor;

    static {
        db5 db5Var = new db5();
        a = db5Var;
        an5 an5Var = new an5("o.fb5", db5Var, 2);
        an5Var.j("name", false);
        an5Var.j("url", false);
        descriptor = an5Var;
    }

    @Override // o.nw3
    public final void a(bb7 bb7Var, Object obj) {
        fb5 fb5Var = (fb5) obj;
        fb5Var.getClass();
        fq6 fq6Var = descriptor;
        bb7 bb7VarA = bb7Var.a(fq6Var);
        bb7VarA.r(fq6Var, 0, fb5Var.a);
        bb7VarA.m(fq6Var, 1, gb7.a, fb5Var.b);
        bb7VarA.s(fq6Var);
    }

    @Override // o.nw3
    public final Object b(aj1 aj1Var) {
        fq6 fq6Var = descriptor;
        k01 k01VarU = aj1Var.u(fq6Var);
        String strT = null;
        boolean z = true;
        int i = 0;
        String str = null;
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
                str = (String) k01VarU.v(fq6Var, 1, gb7.a, str);
                i |= 2;
            }
        }
        k01VarU.i(fq6Var);
        return new fb5(i, strT, str);
    }

    @Override // o.qy2
    public final nw3[] c() {
        gb7 gb7Var = gb7.a;
        return new nw3[]{gb7Var, db8.A(gb7Var)};
    }

    @Override // o.nw3
    public final fq6 d() {
        return descriptor;
    }
}
