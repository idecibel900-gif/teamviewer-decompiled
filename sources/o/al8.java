package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class al8 {
    public static final kw4 a;
    public static final yk8[] b;

    static {
        kw4 kw4Var = new kw4(8);
        yk8.a.getClass();
        zk8 zk8Var = xk8.g;
        kw4Var.i(1, zk8Var);
        zk8 zk8Var2 = xk8.f;
        kw4Var.i(2, zk8Var2);
        zk8 zk8Var3 = xk8.b;
        kw4Var.i(4, zk8Var3);
        zk8 zk8Var4 = xk8.d;
        kw4Var.i(8, zk8Var4);
        zk8 zk8Var5 = xk8.h;
        kw4Var.i(16, zk8Var5);
        zk8 zk8Var6 = xk8.e;
        kw4Var.i(32, zk8Var6);
        zk8 zk8Var7 = xk8.i;
        kw4Var.i(64, zk8Var7);
        zk8 zk8Var8 = xk8.c;
        kw4Var.i(128, zk8Var8);
        a = kw4Var;
        b = new yk8[]{zk8Var, zk8Var2, zk8Var3, zk8Var7, zk8Var5, zk8Var6, zk8Var4, xk8.j, zk8Var8};
    }

    public static final void a(qg4 qg4Var, ui3 ui3Var, long j, int i, int i2) {
        if (o67.g(j, -1L)) {
            return;
        }
        qg4Var.b(ui3Var.b, (int) ((j >>> 48) & 65535));
        qg4Var.b(ui3Var.c, (int) ((j >>> 32) & 65535));
        qg4Var.b(ui3Var.d, i - ((int) ((j >>> 16) & 65535)));
        qg4Var.b(ui3Var.e, i2 - ((int) (j & 65535)));
    }
}
