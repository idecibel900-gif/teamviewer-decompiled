package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class nj1 {
    public static final nj1 a = new nj1();

    public final void a(j93 j93Var, ux2 ux2Var, int i) {
        ux2Var.Y(1565826668);
        int i2 = (ux2Var.f(j93Var) ? 4 : 2) | i;
        if (ux2Var.N(i2 & 1, (i2 & 3) != 2)) {
            g68.c((Function0) j93Var.n, (a12) j93Var.p, au8.O(1163527043, new t0(j93Var, (byte) 13), ux2Var), ux2Var, 384);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new c9((byte) 14, i, (Object) this, (Object) j93Var);
        }
    }
}
