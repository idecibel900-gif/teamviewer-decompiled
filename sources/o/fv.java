package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fv implements qy2 {
    public static final fv a;
    private static final fq6 descriptor;

    static {
        fv fvVar = new fv();
        a = fvVar;
        an5 an5Var = new an5("o.hv", fvVar, 4);
        an5Var.j("LatestVersion", false);
        an5Var.j("DownloadUrl", false);
        an5Var.j("StoreUrl", true);
        an5Var.j("MinRequiredVersion", false);
        descriptor = an5Var;
    }

    @Override // o.nw3
    public final void a(bb7 bb7Var, Object obj) {
        hv hvVar = (hv) obj;
        hvVar.getClass();
        fq6 fq6Var = descriptor;
        bb7 bb7VarA = bb7Var.a(fq6Var);
        gb7 gb7Var = gb7.a;
        String str = hvVar.m;
        String str2 = hvVar.f1011o;
        bb7VarA.m(fq6Var, 0, gb7Var, str);
        bb7VarA.m(fq6Var, 1, gb7Var, hvVar.n);
        if (bb7VarA.t(fq6Var) || str2 != null) {
            bb7VarA.m(fq6Var, 2, gb7Var, str2);
        }
        bb7VarA.m(fq6Var, 3, gb7Var, hvVar.p);
        bb7VarA.s(fq6Var);
    }

    @Override // o.nw3
    public final Object b(aj1 aj1Var) {
        fq6 fq6Var = descriptor;
        k01 k01VarU = aj1Var.u(fq6Var);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z = true;
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
            } else if (iL == 2) {
                str3 = (String) k01VarU.v(fq6Var, 2, gb7.a, str3);
                i |= 4;
            } else {
                if (iL != 3) {
                    throw new h88(iL);
                }
                str4 = (String) k01VarU.v(fq6Var, 3, gb7.a, str4);
                i |= 8;
            }
        }
        k01VarU.i(fq6Var);
        return new hv(str, str2, i, str3, str4);
    }

    @Override // o.qy2
    public final nw3[] c() {
        gb7 gb7Var = gb7.a;
        return new nw3[]{db8.A(gb7Var), db8.A(gb7Var), db8.A(gb7Var), db8.A(gb7Var)};
    }

    @Override // o.nw3
    public final fq6 d() {
        return descriptor;
    }
}
