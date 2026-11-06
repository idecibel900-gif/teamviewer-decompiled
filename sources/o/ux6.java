package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class ux6 {
    static {
        new m54(new jv6((byte) 2));
    }

    public static final pw6 a(tx6 tx6Var, ax6 ax6Var) {
        switch (ax6Var.ordinal()) {
            case 0:
                return tx6Var.h;
            case 1:
                return tx6Var.e;
            case 2:
                return tx6Var.g;
            case 3:
                return c(tx6Var.e);
            case 4:
                return tx6Var.a;
            case 5:
                return c(tx6Var.a);
            case 6:
                return sf6.a;
            case 7:
                return tx6Var.d;
            case 8:
                qf6 qf6Var = tx6Var.d;
                x32 x32Var = vw6.i;
                return qf6.c(qf6Var, x32Var, null, null, x32Var, 6);
            case ep1.b /* 9 */:
                return tx6Var.f;
            case ep1.c /* 10 */:
                qf6 qf6Var2 = tx6Var.d;
                x32 x32Var2 = vw6.i;
                return qf6.c(qf6Var2, null, x32Var2, x32Var2, null, 9);
            case 11:
                return c(tx6Var.d);
            case ep1.d /* 12 */:
                return tx6Var.c;
            case 13:
                return kh.V;
            case 14:
                return tx6Var.b;
            default:
                gk0.s();
                return null;
        }
    }

    public static final pw6 b(ax6 ax6Var, ux2 ux2Var) {
        return a(((rn4) ux2Var.j(un4.a)).c, ax6Var);
    }

    public static qf6 c(qf6 qf6Var) {
        x32 x32Var = vw6.i;
        return qf6.c(qf6Var, null, null, x32Var, x32Var, 3);
    }
}
