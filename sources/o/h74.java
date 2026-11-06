package o;

import java.util.List;
import java.util.Set;
import org.chromium.support_lib_boundary.ProcessGlobalConfigConstants;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h74 implements qy2 {
    public static final h74 a;
    private static final fq6 descriptor;

    static {
        h74 h74Var = new h74();
        a = h74Var;
        an5 an5Var = new an5("o.j74", h74Var, 12);
        an5Var.j("uniqueId", false);
        an5Var.j("artifactVersion", false);
        an5Var.j("name", false);
        an5Var.j("description", false);
        an5Var.j("website", false);
        an5Var.j("developers", false);
        an5Var.j("organization", false);
        an5Var.j("scm", false);
        an5Var.j("licenses", true);
        an5Var.j("funding", true);
        an5Var.j("tag", true);
        an5Var.j("targets", true);
        descriptor = an5Var;
    }

    @Override // o.nw3
    public final void a(bb7 bb7Var, Object obj) {
        j74 j74Var = (j74) obj;
        j74Var.getClass();
        fq6 fq6Var = descriptor;
        bb7 bb7VarA = bb7Var.a(fq6Var);
        u14[] u14VarArr = j74.m;
        String str = j74Var.a;
        Set set = j74Var.l;
        String str2 = j74Var.k;
        Set set2 = j74Var.j;
        Set set3 = j74Var.i;
        bb7VarA.r(fq6Var, 0, str);
        gb7 gb7Var = gb7.a;
        bb7VarA.m(fq6Var, 1, gb7Var, j74Var.b);
        bb7VarA.r(fq6Var, 2, j74Var.c);
        bb7VarA.m(fq6Var, 3, gb7Var, j74Var.d);
        bb7VarA.m(fq6Var, 4, gb7Var, j74Var.e);
        bb7VarA.n(fq6Var, 5, (nw3) u14VarArr[5].getValue(), j74Var.f);
        bb7VarA.m(fq6Var, 6, db5.a, j74Var.g);
        bb7VarA.m(fq6Var, 7, jj6.a, j74Var.h);
        boolean zT = bb7VarA.t(fq6Var);
        la2 la2Var = la2.m;
        if (zT || !im3.n(set3, la2Var)) {
            bb7VarA.n(fq6Var, 8, (nw3) u14VarArr[8].getValue(), set3);
        }
        if (bb7VarA.t(fq6Var) || !im3.n(set2, la2Var)) {
            bb7VarA.n(fq6Var, 9, (nw3) u14VarArr[9].getValue(), set2);
        }
        if (bb7VarA.t(fq6Var) || str2 != null) {
            bb7VarA.m(fq6Var, 10, gb7Var, str2);
        }
        if (bb7VarA.t(fq6Var) || !im3.n(set, la2Var)) {
            bb7VarA.n(fq6Var, 11, (nw3) u14VarArr[11].getValue(), set);
        }
        bb7VarA.s(fq6Var);
    }

    @Override // o.nw3
    public final Object b(aj1 aj1Var) {
        fq6 fq6Var = descriptor;
        k01 k01VarU = aj1Var.u(fq6Var);
        u14[] u14VarArr = j74.m;
        Set set = null;
        Set set2 = null;
        Set set3 = null;
        String str = null;
        String strT = null;
        String str2 = null;
        String strT2 = null;
        String str3 = null;
        String str4 = null;
        List list = null;
        fb5 fb5Var = null;
        lj6 lj6Var = null;
        int i = 0;
        boolean z = true;
        while (z) {
            u14VarArr = u14VarArr;
            int iL = k01VarU.l(fq6Var);
            switch (iL) {
                case ProcessGlobalConfigConstants.UI_THREAD_STARTUP_MODE_DEFAULT /* -1 */:
                    z = false;
                    break;
                case 0:
                    i |= 1;
                    strT = k01VarU.t(fq6Var, 0);
                    break;
                case 1:
                    str2 = (String) k01VarU.v(fq6Var, 1, gb7.a, str2);
                    i |= 2;
                    strT = strT;
                    break;
                case 2:
                    strT2 = k01VarU.t(fq6Var, 2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) k01VarU.v(fq6Var, 3, gb7.a, str3);
                    i |= 8;
                    strT = strT;
                    break;
                case 4:
                    str4 = (String) k01VarU.v(fq6Var, 4, gb7.a, str4);
                    i |= 16;
                    strT = strT;
                    break;
                case 5:
                    list = (List) k01VarU.C(fq6Var, 5, (nw3) u14VarArr[5].getValue(), list);
                    i |= 32;
                    strT = strT;
                    break;
                case 6:
                    fb5Var = (fb5) k01VarU.v(fq6Var, 6, db5.a, fb5Var);
                    i |= 64;
                    strT = strT;
                    break;
                case 7:
                    lj6Var = (lj6) k01VarU.v(fq6Var, 7, jj6.a, lj6Var);
                    i |= 128;
                    strT = strT;
                    break;
                case 8:
                    set = (Set) k01VarU.C(fq6Var, 8, (nw3) u14VarArr[8].getValue(), set);
                    i |= 256;
                    strT = strT;
                    break;
                case ep1.b /* 9 */:
                    set3 = (Set) k01VarU.C(fq6Var, 9, (nw3) u14VarArr[9].getValue(), set3);
                    i |= 512;
                    strT = strT;
                    break;
                case ep1.c /* 10 */:
                    str = (String) k01VarU.v(fq6Var, 10, gb7.a, str);
                    i |= 1024;
                    strT = strT;
                    break;
                case 11:
                    set2 = (Set) k01VarU.C(fq6Var, 11, (nw3) u14VarArr[11].getValue(), set2);
                    i |= 2048;
                    strT = strT;
                    break;
                default:
                    throw new h88(iL);
            }
        }
        k01VarU.i(fq6Var);
        return new j74(i, strT, str2, strT2, str3, str4, list, fb5Var, lj6Var, set, set3, str, set2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.qy2
    public final nw3[] c() {
        u14[] u14VarArr = j74.m;
        gb7 gb7Var = gb7.a;
        return new nw3[]{gb7Var, db8.A(gb7Var), gb7Var, db8.A(gb7Var), db8.A(gb7Var), u14VarArr[5].getValue(), db8.A(db5.a), db8.A(jj6.a), u14VarArr[8].getValue(), u14VarArr[9].getValue(), db8.A(gb7Var), u14VarArr[11].getValue()};
    }

    @Override // o.nw3
    public final fq6 d() {
        return descriptor;
    }
}
