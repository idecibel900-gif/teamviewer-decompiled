package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ue1 implements qy2 {
    public static final ue1 a;
    private static final fq6 descriptor;

    static {
        ue1 ue1Var = new ue1();
        a = ue1Var;
        an5 an5Var = new an5("o.we1", ue1Var, 3);
        an5Var.j("url", false);
        an5Var.j("attachViewHierarchy", false);
        an5Var.j("attachScreenShot", false);
        descriptor = an5Var;
    }

    @Override // o.nw3
    public final void a(bb7 bb7Var, Object obj) {
        we1 we1Var = (we1) obj;
        we1Var.getClass();
        fq6 fq6Var = descriptor;
        bb7 bb7VarA = bb7Var.a(fq6Var);
        bb7VarA.r(fq6Var, 0, we1Var.a);
        boolean z = we1Var.b;
        bb7VarA.f(fq6Var, 1);
        bb7VarA.b(z);
        boolean z2 = we1Var.c;
        bb7VarA.f(fq6Var, 2);
        bb7VarA.b(z2);
        bb7VarA.s(fq6Var);
    }

    @Override // o.nw3
    public final Object b(aj1 aj1Var) {
        fq6 fq6Var = descriptor;
        k01 k01VarU = aj1Var.u(fq6Var);
        String strT = null;
        boolean z = true;
        int i = 0;
        boolean zA = false;
        boolean zA2 = false;
        while (z) {
            int iL = k01VarU.l(fq6Var);
            if (iL == -1) {
                z = false;
            } else if (iL == 0) {
                strT = k01VarU.t(fq6Var, 0);
                i |= 1;
            } else if (iL == 1) {
                zA = k01VarU.A(fq6Var, 1);
                i |= 2;
            } else {
                if (iL != 2) {
                    throw new h88(iL);
                }
                zA2 = k01VarU.A(fq6Var, 2);
                i |= 4;
            }
        }
        k01VarU.i(fq6Var);
        return new we1(i, strT, zA, zA2);
    }

    @Override // o.qy2
    public final nw3[] c() {
        q80 q80Var = q80.a;
        return new nw3[]{gb7.a, q80Var, q80Var};
    }

    @Override // o.nw3
    public final fq6 d() {
        return descriptor;
    }
}
