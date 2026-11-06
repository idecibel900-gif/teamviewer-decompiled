package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class ac1 {
    public final j57 a = new j57();

    public static void b(ac1 ac1Var, hw2 hw2Var, yy0 yy0Var, Function0 function0, int i) {
        if ((i & 8) != 0) {
            yy0Var = null;
        }
        ac1Var.a.add(new yy0(-1789283891, true, new q34(hw2Var, ac1Var, yy0Var, function0)));
    }

    public final void a(zb1 zb1Var, ux2 ux2Var, int i) {
        ux2Var.Y(-798501095);
        int i2 = (ux2Var.f(zb1Var) ? 4 : 2) | i | (ux2Var.f(this) ? 32 : 16);
        if (ux2Var.N(i2 & 1, (i2 & 19) != 18)) {
            j57 j57Var = this.a;
            int size = j57Var.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((iw2) j57Var.get(i3)).d(zb1Var, ux2Var, Integer.valueOf(i2 & 14));
            }
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new c9((byte) 11, i, (Object) this, (Object) zb1Var);
        }
    }
}
