package o;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z74 implements qy2 {
    public static final z74 a;
    private static final fq6 descriptor;

    static {
        z74 z74Var = new z74();
        a = z74Var;
        an5 an5Var = new an5("o.b84", z74Var, 2);
        an5Var.j("libraries", false);
        an5Var.j("licenses", false);
        descriptor = an5Var;
    }

    @Override // o.nw3
    public final void a(bb7 bb7Var, Object obj) {
        b84 b84Var = (b84) obj;
        b84Var.getClass();
        fq6 fq6Var = descriptor;
        bb7 bb7VarA = bb7Var.a(fq6Var);
        u14[] u14VarArr = b84.c;
        bb7VarA.n(fq6Var, 0, (nw3) u14VarArr[0].getValue(), b84Var.a);
        bb7VarA.n(fq6Var, 1, (nw3) u14VarArr[1].getValue(), b84Var.b);
        bb7VarA.s(fq6Var);
    }

    @Override // o.nw3
    public final Object b(aj1 aj1Var) {
        fq6 fq6Var = descriptor;
        k01 k01VarU = aj1Var.u(fq6Var);
        u14[] u14VarArr = b84.c;
        List list = null;
        boolean z = true;
        int i = 0;
        Set set = null;
        while (z) {
            int iL = k01VarU.l(fq6Var);
            if (iL == -1) {
                z = false;
            } else if (iL == 0) {
                list = (List) k01VarU.C(fq6Var, 0, (nw3) u14VarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (iL != 1) {
                    throw new h88(iL);
                }
                set = (Set) k01VarU.C(fq6Var, 1, (nw3) u14VarArr[1].getValue(), set);
                i |= 2;
            }
        }
        k01VarU.i(fq6Var);
        return new b84(i, list, set);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.qy2
    public final nw3[] c() {
        u14[] u14VarArr = b84.c;
        return new nw3[]{u14VarArr[0].getValue(), u14VarArr[1].getValue()};
    }

    @Override // o.nw3
    public final fq6 d() {
        return descriptor;
    }
}
