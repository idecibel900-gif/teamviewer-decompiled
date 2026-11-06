package o;

import org.chromium.support_lib_boundary.ProcessGlobalConfigConstants;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fu implements qy2 {
    public static final fu a;
    private static final fq6 descriptor;

    static {
        fu fuVar = new fu();
        a = fuVar;
        an5 an5Var = new an5("o.hu", fuVar, 6);
        an5Var.j("icon", true);
        an5Var.j("mimeType", true);
        an5Var.j("headlineText", true);
        an5Var.j("descriptionText", true);
        an5Var.j("analyticsEventID", true);
        an5Var.j("androidPackageName", true);
        descriptor = an5Var;
    }

    @Override // o.nw3
    public final void a(bb7 bb7Var, Object obj) {
        hu huVar = (hu) obj;
        huVar.getClass();
        String str = huVar.f;
        String str2 = huVar.e;
        String str3 = huVar.d;
        String str4 = huVar.c;
        String str5 = huVar.b;
        String str6 = huVar.a;
        fq6 fq6Var = descriptor;
        bb7 bb7VarA = bb7Var.a(fq6Var);
        if (bb7VarA.t(fq6Var) || str6 != null) {
            bb7VarA.m(fq6Var, 0, gb7.a, str6);
        }
        if (bb7VarA.t(fq6Var) || str5 != null) {
            bb7VarA.m(fq6Var, 1, gb7.a, str5);
        }
        if (bb7VarA.t(fq6Var) || str4 != null) {
            bb7VarA.m(fq6Var, 2, gb7.a, str4);
        }
        if (bb7VarA.t(fq6Var) || str3 != null) {
            bb7VarA.m(fq6Var, 3, gb7.a, str3);
        }
        if (bb7VarA.t(fq6Var) || str2 != null) {
            bb7VarA.m(fq6Var, 4, gb7.a, str2);
        }
        if (bb7VarA.t(fq6Var) || str != null) {
            bb7VarA.m(fq6Var, 5, gb7.a, str);
        }
        bb7VarA.s(fq6Var);
    }

    @Override // o.nw3
    public final Object b(aj1 aj1Var) {
        fq6 fq6Var = descriptor;
        k01 k01VarU = aj1Var.u(fq6Var);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (z) {
            int iL = k01VarU.l(fq6Var);
            switch (iL) {
                case ProcessGlobalConfigConstants.UI_THREAD_STARTUP_MODE_DEFAULT /* -1 */:
                    z = false;
                    break;
                case 0:
                    str = (String) k01VarU.v(fq6Var, 0, gb7.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) k01VarU.v(fq6Var, 1, gb7.a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) k01VarU.v(fq6Var, 2, gb7.a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) k01VarU.v(fq6Var, 3, gb7.a, str4);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) k01VarU.v(fq6Var, 4, gb7.a, str5);
                    i |= 16;
                    break;
                case 5:
                    str6 = (String) k01VarU.v(fq6Var, 5, gb7.a, str6);
                    i |= 32;
                    break;
                default:
                    throw new h88(iL);
            }
        }
        k01VarU.i(fq6Var);
        hu huVar = new hu();
        if ((i & 1) == 0) {
            huVar.a = null;
        } else {
            huVar.a = str;
        }
        if ((i & 2) == 0) {
            huVar.b = null;
        } else {
            huVar.b = str2;
        }
        if ((i & 4) == 0) {
            huVar.c = null;
        } else {
            huVar.c = str3;
        }
        if ((i & 8) == 0) {
            huVar.d = null;
        } else {
            huVar.d = str4;
        }
        if ((i & 16) == 0) {
            huVar.e = null;
        } else {
            huVar.e = str5;
        }
        if ((i & 32) == 0) {
            huVar.f = null;
            return huVar;
        }
        huVar.f = str6;
        return huVar;
    }

    @Override // o.qy2
    public final nw3[] c() {
        gb7 gb7Var = gb7.a;
        return new nw3[]{db8.A(gb7Var), db8.A(gb7Var), db8.A(gb7Var), db8.A(gb7Var), db8.A(gb7Var), db8.A(gb7Var)};
    }

    @Override // o.nw3
    public final fq6 d() {
        return descriptor;
    }
}
