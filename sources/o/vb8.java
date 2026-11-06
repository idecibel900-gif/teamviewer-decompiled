package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class vb8 {
    public static final k74 a = new k74();

    static {
        ot7 ot7Var = ot7.d;
    }

    public static zl1 a(pd5 pd5Var, pd5 pd5Var2, int i) {
        if ((i & 1) != 0) {
            pd5Var = new pd5(20.0f, 14.0f, 20.0f, 14.0f);
        }
        pd5 pd5Var3 = pd5Var;
        if ((i & 2) != 0) {
            pd5Var2 = new pd5(20.0f, 10.0f, 20.0f, 10.0f);
        }
        return new zl1(pd5Var3, pd5Var2, new pd5(20.0f, 20.0f, 20.0f, 18.0f), new pd5(22.0f, 20.0f, 22.0f, 28.0f), new pd5(10.0f, 5.0f, 10.0f, 5.0f), new pd5(12.0f, 6.0f, 12.0f, 6.0f), new pd5(30.0f, 10.0f, 16.0f, 14.0f), new pd5(20.0f, 8.0f, 20.0f, 8.0f), new pd5(8.0f, 8.0f, 8.0f, 8.0f));
    }

    public static am1 b(qf6 qf6Var, int i) {
        qf6 qf6VarA = sf6.a(0.0f);
        if ((i & 2) != 0) {
            qf6Var = sf6.a(22.0f);
        }
        qf6 qf6Var2 = qf6Var;
        ri5 ri5Var = new ri5(50.0f);
        qf6 qf6Var3 = new qf6(ri5Var, ri5Var, ri5Var, ri5Var);
        qf6 qf6Var4 = new qf6(new x32(28.0f), new x32(28.0f), new x32(0.0f), new x32(0.0f));
        qf6 qf6VarA2 = sf6.a(8.0f);
        ri5 ri5Var2 = new ri5(50.0f);
        qf6 qf6Var5 = new qf6(ri5Var2, ri5Var2, ri5Var2, ri5Var2);
        ri5 ri5Var3 = new ri5(50.0f);
        return new am1(qf6VarA, qf6Var2, qf6Var3, qf6Var4, qf6VarA2, qf6Var5, new qf6(ri5Var3, ri5Var3, ri5Var3, ri5Var3), sf6.a(16.0f));
    }
}
