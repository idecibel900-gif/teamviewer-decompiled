package o;

/* JADX INFO: loaded from: classes.dex */
public interface nx2 extends go2 {
    static /* synthetic */ go2 d(nx2 nx2Var, q43 q43Var, int i, df0 df0Var, int i2) {
        de1 de1Var = q43Var;
        if ((i2 & 1) != 0) {
            de1Var = ba2.m;
        }
        if ((i2 & 2) != 0) {
            i = -3;
        }
        if ((i2 & 4) != 0) {
            df0Var = df0.m;
        }
        return nx2Var.a(de1Var, i, df0Var);
    }

    go2 a(de1 de1Var, int i, df0 df0Var);
}
