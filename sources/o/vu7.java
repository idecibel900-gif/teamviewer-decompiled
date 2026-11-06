package o;

/* JADX INFO: loaded from: classes.dex */
public final class vu7 {
    public ru7 a;
    public vx4 e;
    public final se5 b = new se5();
    public final se5 c = new se5();
    public final se5 d = new se5();
    public final vc f = new vc(new uu7(this, (byte) 0), new uu7(this, (byte) 1));
    public long g = 0;
    public final byte h = 3;

    public final se5 a(int i) {
        return b(c(i));
    }

    public final se5 b(yu7 yu7Var) {
        int iOrdinal = yu7Var.ordinal();
        if (iOrdinal == 0) {
            return this.b;
        }
        if (iOrdinal == 1) {
            return this.c;
        }
        if (iOrdinal == 2) {
            return this.d;
        }
        gk0.s();
        return null;
    }

    public final yu7 c(int i) {
        ru7 ru7Var = this.a;
        if (ru7Var == null) {
            im3.e0("ltrOrder");
            throw null;
        }
        if (i == 0) {
            return ru7Var.a;
        }
        if (i == 1) {
            return yu7.m;
        }
        if (i == 2) {
            return ru7Var.b;
        }
        hk0.r(fx3.e(i, "Invalid pane index "));
        return null;
    }
}
