package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class q51 {
    public static final kw4 a;

    static {
        td6 td6Var = ew0.e;
        int i = td6Var.c;
        n51 n51Var = new n51(td6Var, td6Var, 1);
        int i2 = td6Var.c;
        e75 e75Var = ew0.x;
        int i3 = (e75Var.c << 6) | i2;
        p51 p51Var = new p51(td6Var, e75Var, 0);
        int i4 = (i2 << 6) | e75Var.c;
        p51 p51Var2 = new p51(e75Var, td6Var, 0);
        kw4 kw4Var = uk3.a;
        kw4 kw4Var2 = new kw4();
        kw4Var2.i(i | (i << 6), n51Var);
        kw4Var2.i(i3, p51Var);
        kw4Var2.i(i4, p51Var2);
        a = kw4Var2;
    }
}
