package o;

/* JADX INFO: loaded from: classes.dex */
public final class zg4 implements yg4 {
    public w04 m;

    @Override // o.yg4
    public final i04 e(il5 il5Var) {
        w04 w04Var = this.m;
        w04Var.getClass();
        return (i04) w04Var.a();
    }

    @Override // o.yg4
    public final i04 h(i04 i04Var) {
        ug4 ug4Var;
        ug4 ug4Var2 = i04Var instanceof ug4 ? (ug4) i04Var : null;
        if (ug4Var2 != null) {
            return ug4Var2;
        }
        i04Var.getClass();
        e45 e45Var = (e45) i04Var;
        tg4 tg4VarY0 = e45Var.Y0();
        return (tg4VarY0 == null || (ug4Var = tg4VarY0.J) == null) ? e45Var : ug4Var;
    }
}
