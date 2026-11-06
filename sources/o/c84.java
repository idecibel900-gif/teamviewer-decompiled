package o;

import org.chromium.support_lib_boundary.ProcessGlobalConfigConstants;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c84 implements qy2 {
    public static final c84 a;
    private static final fq6 descriptor;

    static {
        c84 c84Var = new c84();
        a = c84Var;
        an5 an5Var = new an5("o.e84", c84Var, 6);
        an5Var.j("name", false);
        an5Var.j("url", false);
        an5Var.j("year", true);
        an5Var.j("spdxId", true);
        an5Var.j("licenseContent", true);
        an5Var.j("hash", false);
        descriptor = an5Var;
    }

    @Override // o.nw3
    public final void a(bb7 bb7Var, Object obj) {
        e84 e84Var = (e84) obj;
        e84Var.getClass();
        fq6 fq6Var = descriptor;
        bb7 bb7VarA = bb7Var.a(fq6Var);
        String str = e84Var.a;
        String str2 = e84Var.e;
        String str3 = e84Var.d;
        String str4 = e84Var.c;
        bb7VarA.r(fq6Var, 0, str);
        gb7 gb7Var = gb7.a;
        bb7VarA.m(fq6Var, 1, gb7Var, e84Var.b);
        if (bb7VarA.t(fq6Var) || str4 != null) {
            bb7VarA.m(fq6Var, 2, gb7Var, str4);
        }
        if (bb7VarA.t(fq6Var) || str3 != null) {
            bb7VarA.m(fq6Var, 3, gb7Var, str3);
        }
        if (bb7VarA.t(fq6Var) || str2 != null) {
            bb7VarA.m(fq6Var, 4, gb7Var, str2);
        }
        bb7VarA.r(fq6Var, 5, e84Var.f);
        bb7VarA.s(fq6Var);
    }

    @Override // o.nw3
    public final Object b(aj1 aj1Var) {
        fq6 fq6Var = descriptor;
        k01 k01VarU = aj1Var.u(fq6Var);
        int i = 0;
        String strT = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String strT2 = null;
        boolean z = true;
        while (z) {
            int iL = k01VarU.l(fq6Var);
            switch (iL) {
                case ProcessGlobalConfigConstants.UI_THREAD_STARTUP_MODE_DEFAULT /* -1 */:
                    z = false;
                    break;
                case 0:
                    strT = k01VarU.t(fq6Var, 0);
                    i |= 1;
                    break;
                case 1:
                    str = (String) k01VarU.v(fq6Var, 1, gb7.a, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) k01VarU.v(fq6Var, 2, gb7.a, str2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) k01VarU.v(fq6Var, 3, gb7.a, str3);
                    i |= 8;
                    break;
                case 4:
                    str4 = (String) k01VarU.v(fq6Var, 4, gb7.a, str4);
                    i |= 16;
                    break;
                case 5:
                    strT2 = k01VarU.t(fq6Var, 5);
                    i |= 32;
                    break;
                default:
                    throw new h88(iL);
            }
        }
        k01VarU.i(fq6Var);
        return new e84(i, strT, str, str2, str3, str4, strT2);
    }

    @Override // o.qy2
    public final nw3[] c() {
        gb7 gb7Var = gb7.a;
        return new nw3[]{gb7Var, db8.A(gb7Var), db8.A(gb7Var), db8.A(gb7Var), db8.A(gb7Var), gb7Var};
    }

    @Override // o.nw3
    public final fq6 d() {
        return descriptor;
    }
}
