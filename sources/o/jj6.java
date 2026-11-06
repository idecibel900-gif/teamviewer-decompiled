package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jj6 implements qy2 {
    public static final jj6 a;
    private static final fq6 descriptor;

    static {
        jj6 jj6Var = new jj6();
        a = jj6Var;
        an5 an5Var = new an5("o.lj6", jj6Var, 3);
        an5Var.j("connection", false);
        an5Var.j("developerConnection", false);
        an5Var.j("url", false);
        descriptor = an5Var;
    }

    @Override // o.nw3
    public final void a(bb7 bb7Var, Object obj) {
        lj6 lj6Var = (lj6) obj;
        lj6Var.getClass();
        fq6 fq6Var = descriptor;
        bb7 bb7VarA = bb7Var.a(fq6Var);
        gb7 gb7Var = gb7.a;
        bb7VarA.m(fq6Var, 0, gb7Var, lj6Var.a);
        bb7VarA.m(fq6Var, 1, gb7Var, lj6Var.b);
        bb7VarA.m(fq6Var, 2, gb7Var, lj6Var.c);
        bb7VarA.s(fq6Var);
    }

    @Override // o.nw3
    public final Object b(aj1 aj1Var) {
        fq6 fq6Var = descriptor;
        k01 k01VarU = aj1Var.u(fq6Var);
        String str = null;
        boolean z = true;
        int i = 0;
        String str2 = null;
        String str3 = null;
        while (z) {
            int iL = k01VarU.l(fq6Var);
            if (iL == -1) {
                z = false;
            } else if (iL == 0) {
                str = (String) k01VarU.v(fq6Var, 0, gb7.a, str);
                i |= 1;
            } else if (iL == 1) {
                str2 = (String) k01VarU.v(fq6Var, 1, gb7.a, str2);
                i |= 2;
            } else {
                if (iL != 2) {
                    throw new h88(iL);
                }
                str3 = (String) k01VarU.v(fq6Var, 2, gb7.a, str3);
                i |= 4;
            }
        }
        k01VarU.i(fq6Var);
        return new lj6(i, str, str2, str3);
    }

    @Override // o.qy2
    public final nw3[] c() {
        gb7 gb7Var = gb7.a;
        return new nw3[]{db8.A(gb7Var), db8.A(gb7Var), db8.A(gb7Var)};
    }

    @Override // o.nw3
    public final fq6 d() {
        return descriptor;
    }
}
