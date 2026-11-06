package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hg3 implements qy2 {
    public static final hg3 a;
    private static final fq6 descriptor;

    static {
        hg3 hg3Var = new hg3();
        a = hg3Var;
        an5 an5Var = new an5("o.jg3", hg3Var, 1);
        an5Var.j("appInfoData", true);
        descriptor = an5Var;
    }

    @Override // o.nw3
    public final void a(bb7 bb7Var, Object obj) {
        jg3 jg3Var = (jg3) obj;
        jg3Var.getClass();
        List list = jg3Var.a;
        fq6 fq6Var = descriptor;
        bb7 bb7VarA = bb7Var.a(fq6Var);
        u14[] u14VarArr = jg3.b;
        if (bb7VarA.t(fq6Var) || list != null) {
            bb7VarA.m(fq6Var, 0, (nw3) u14VarArr[0].getValue(), list);
        }
        bb7VarA.s(fq6Var);
    }

    @Override // o.nw3
    public final Object b(aj1 aj1Var) {
        fq6 fq6Var = descriptor;
        k01 k01VarU = aj1Var.u(fq6Var);
        u14[] u14VarArr = jg3.b;
        boolean z = true;
        boolean z2 = false;
        List list = null;
        while (z) {
            int iL = k01VarU.l(fq6Var);
            if (iL == -1) {
                z = false;
            } else {
                if (iL != 0) {
                    throw new h88(iL);
                }
                list = (List) k01VarU.v(fq6Var, 0, (nw3) u14VarArr[0].getValue(), list);
                z2 = true;
            }
        }
        k01VarU.i(fq6Var);
        jg3 jg3Var = new jg3();
        if (z2) {
            jg3Var.a = list;
            return jg3Var;
        }
        jg3Var.a = null;
        return jg3Var;
    }

    @Override // o.qy2
    public final nw3[] c() {
        return new nw3[]{db8.A((nw3) jg3.b[0].getValue())};
    }

    @Override // o.nw3
    public final fq6 d() {
        return descriptor;
    }
}
