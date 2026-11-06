package o;

import org.chromium.support_lib_boundary.ProcessGlobalConfigConstants;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bd8 implements qy2 {
    public static final bd8 a;
    private static final fq6 descriptor;

    static {
        bd8 bd8Var = new bd8();
        a = bd8Var;
        an5 an5Var = new an5("o.dd8", bd8Var, 6);
        an5Var.j("tvwebsite", true);
        an5Var.j("playStore", true);
        an5Var.j("huawei", true);
        an5Var.j("oppo", true);
        an5Var.j("vivo", true);
        an5Var.j("xiaomi", true);
        descriptor = an5Var;
    }

    @Override // o.nw3
    public final void a(bb7 bb7Var, Object obj) {
        dd8 dd8Var = (dd8) obj;
        dd8Var.getClass();
        hv hvVar = dd8Var.r;
        hv hvVar2 = dd8Var.q;
        hv hvVar3 = dd8Var.p;
        hv hvVar4 = dd8Var.f612o;
        hv hvVar5 = dd8Var.n;
        hv hvVar6 = dd8Var.m;
        fq6 fq6Var = descriptor;
        bb7 bb7VarA = bb7Var.a(fq6Var);
        if (bb7VarA.t(fq6Var) || hvVar6 != null) {
            bb7VarA.m(fq6Var, 0, fv.a, hvVar6);
        }
        if (bb7VarA.t(fq6Var) || hvVar5 != null) {
            bb7VarA.m(fq6Var, 1, fv.a, hvVar5);
        }
        if (bb7VarA.t(fq6Var) || hvVar4 != null) {
            bb7VarA.m(fq6Var, 2, fv.a, hvVar4);
        }
        if (bb7VarA.t(fq6Var) || hvVar3 != null) {
            bb7VarA.m(fq6Var, 3, fv.a, hvVar3);
        }
        if (bb7VarA.t(fq6Var) || hvVar2 != null) {
            bb7VarA.m(fq6Var, 4, fv.a, hvVar2);
        }
        if (bb7VarA.t(fq6Var) || hvVar != null) {
            bb7VarA.m(fq6Var, 5, fv.a, hvVar);
        }
        bb7VarA.s(fq6Var);
    }

    @Override // o.nw3
    public final Object b(aj1 aj1Var) {
        fq6 fq6Var = descriptor;
        k01 k01VarU = aj1Var.u(fq6Var);
        int i = 0;
        hv hvVar = null;
        hv hvVar2 = null;
        hv hvVar3 = null;
        hv hvVar4 = null;
        hv hvVar5 = null;
        hv hvVar6 = null;
        boolean z = true;
        while (z) {
            int iL = k01VarU.l(fq6Var);
            switch (iL) {
                case ProcessGlobalConfigConstants.UI_THREAD_STARTUP_MODE_DEFAULT /* -1 */:
                    z = false;
                    break;
                case 0:
                    hvVar = (hv) k01VarU.v(fq6Var, 0, fv.a, hvVar);
                    i |= 1;
                    break;
                case 1:
                    hvVar2 = (hv) k01VarU.v(fq6Var, 1, fv.a, hvVar2);
                    i |= 2;
                    break;
                case 2:
                    hvVar3 = (hv) k01VarU.v(fq6Var, 2, fv.a, hvVar3);
                    i |= 4;
                    break;
                case 3:
                    hvVar4 = (hv) k01VarU.v(fq6Var, 3, fv.a, hvVar4);
                    i |= 8;
                    break;
                case 4:
                    hvVar5 = (hv) k01VarU.v(fq6Var, 4, fv.a, hvVar5);
                    i |= 16;
                    break;
                case 5:
                    hvVar6 = (hv) k01VarU.v(fq6Var, 5, fv.a, hvVar6);
                    i |= 32;
                    break;
                default:
                    throw new h88(iL);
            }
        }
        k01VarU.i(fq6Var);
        return new dd8(i, hvVar, hvVar2, hvVar3, hvVar4, hvVar5, hvVar6);
    }

    @Override // o.qy2
    public final nw3[] c() {
        fv fvVar = fv.a;
        return new nw3[]{db8.A(fvVar), db8.A(fvVar), db8.A(fvVar), db8.A(fvVar), db8.A(fvVar), db8.A(fvVar)};
    }

    @Override // o.nw3
    public final fq6 d() {
        return descriptor;
    }
}
