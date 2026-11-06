package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class rp5 {
    static {
        new h72(new ti4((byte) 4), (byte) 1);
    }

    public static final void a(yy0 yy0Var, ux2 ux2Var, int i) {
        ux2Var.Y(442516910);
        if (ux2Var.N(i & 1, (i & 3) != 2)) {
            ux2Var.W(1766838549);
            ux2Var.p(false);
            ux2Var.W(1767392772);
            yy0Var.invoke(ux2Var, 6);
            ux2Var.p(false);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new np2(yy0Var, i, (byte) 4);
        }
    }
}
