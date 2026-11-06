package o;

/* JADX INFO: loaded from: classes.dex */
public final class pe5 {
    public final zn4 a;
    public final byte b;
    public final yu7 c;
    public final ce5 d;
    public int e;
    public int f;
    public final ir g;
    public final boolean h;
    public float i;
    public zk3 j;

    /* JADX WARN: Multi-variable type inference failed */
    public pe5(zn4 zn4Var, int i, yu7 yu7Var, ce5 ce5Var, int i2, int i3, in1 in1Var, long j) {
        this.a = zn4Var;
        this.b = i;
        this.c = yu7Var;
        this.d = ce5Var;
        Object objE = zn4Var.E();
        ze5 ze5Var = objE instanceof ze5 ? (ze5) objE : null;
        ze5Var = ze5Var == null ? new ze5() : ze5Var;
        pr5 pr5Var = ze5Var.b;
        ze5Var.a.getClass();
        if (!Float.isNaN(Float.NaN)) {
            i2 = in1Var.q0(Float.NaN);
        } else if (Math.abs(Float.NaN) <= Float.MAX_VALUE) {
            i2 = (int) (((int) (j >> 32)) * Float.NaN);
        }
        this.e = i2;
        pr5Var.getClass();
        if (!Float.isNaN(Float.NaN)) {
            i3 = in1Var.q0(Float.NaN);
        } else if (Math.abs(Float.NaN) <= Float.MAX_VALUE) {
            i3 = (int) (((int) (4294967295L & j)) * Float.NaN);
        }
        this.f = i3;
        this.g = ze5Var.c;
        this.h = ze5Var.d;
        this.i = 0.0f;
    }

    public final void a(il5 il5Var, zk3 zk3Var) {
        zk3 zk3Var2 = this.j;
        if (zk3Var2 != null) {
            int i = zk3Var2.a;
            this.g.getClass();
            zk3 zk3Var3 = new zk3(i, zk3Var2.b, zk3Var2.c, zk3Var2.d);
            this.j = zk3Var3;
            zk3Var2 = zk3Var3;
        }
        int iMax = Math.max(zk3Var2 != null ? zk3Var2.f() : 0, 0);
        zk3 zk3Var4 = this.j;
        int iMax2 = Math.max(zk3Var4 != null ? zk3Var4.c() : 0, 0);
        if (!((iMax2 >= 0) & (iMax >= 0))) {
            mi3.a("width and height must be >= 0");
        }
        jl5 jl5VarC = this.a.C(t61.h(iMax, iMax, iMax2, iMax2));
        zk3 zk3Var5 = this.j;
        il5Var.g(jl5VarC, zk3Var5 != null ? zk3Var5.a : 0, zk3Var5 != null ? zk3Var5.b : 0, this.i);
    }
}
