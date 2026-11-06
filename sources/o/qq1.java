package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qq1 implements qy2 {
    public static final qq1 a;
    private static final fq6 descriptor;

    static {
        qq1 qq1Var = new qq1();
        a = qq1Var;
        an5 an5Var = new an5("o.sq1", qq1Var, 2);
        an5Var.j("name", false);
        an5Var.j("organisationUrl", false);
        descriptor = an5Var;
    }

    @Override // o.nw3
    public final void a(bb7 bb7Var, Object obj) {
        sq1 sq1Var = (sq1) obj;
        sq1Var.getClass();
        fq6 fq6Var = descriptor;
        bb7 bb7VarA = bb7Var.a(fq6Var);
        gb7 gb7Var = gb7.a;
        bb7VarA.m(fq6Var, 0, gb7Var, sq1Var.a);
        bb7VarA.m(fq6Var, 1, gb7Var, sq1Var.b);
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
        while (z) {
            int iL = k01VarU.l(fq6Var);
            if (iL == -1) {
                z = false;
            } else if (iL == 0) {
                str = (String) k01VarU.v(fq6Var, 0, gb7.a, str);
                i |= 1;
            } else {
                if (iL != 1) {
                    throw new h88(iL);
                }
                str2 = (String) k01VarU.v(fq6Var, 1, gb7.a, str2);
                i |= 2;
            }
        }
        k01VarU.i(fq6Var);
        return new sq1(i, str, str2);
    }

    @Override // o.qy2
    public final nw3[] c() {
        gb7 gb7Var = gb7.a;
        return new nw3[]{db8.A(gb7Var), db8.A(gb7Var)};
    }

    @Override // o.nw3
    public final fq6 d() {
        return descriptor;
    }
}
