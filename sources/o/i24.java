package o;

/* JADX INFO: loaded from: classes2.dex */
public final class i24 extends bd5 {
    public static final /* synthetic */ fw3[] y;
    public final k86 s;
    public final yc4 t;
    public final vd4 u;
    public final ss3 v;
    public final qd4 w;
    public final up x;

    static {
        x86 x86Var = w86.a;
        y = new fw3[]{x86Var.g(new gu5(x86Var.b(i24.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), x86Var.g(new gu5(x86Var.b(i24.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i24(yc4 yc4Var, k86 k86Var) {
        io3 io3Var = (io3) yc4Var.m;
        super(io3Var.h, k86Var.a);
        this.s = k86Var;
        yc4 yc4VarK = pm8.k(yc4Var, this, null, 6);
        this.t = yc4VarK;
        ((jk0) io3Var.d.c().c).getClass();
        ps3 ps3Var = ps3.g;
        io3 io3Var2 = (io3) yc4VarK.m;
        xd4 xd4Var = io3Var2.a;
        this.u = new vd4(xd4Var, new h24(this, (byte) 0));
        this.v = new ss3(yc4VarK, k86Var, this);
        this.w = new qd4(xd4Var, new h24(this, (byte) 1));
        this.x = io3Var2.m.b ? yl7.p : ep1.D(yc4VarK, k86Var);
        xd4Var.a(new h24(this, (byte) 2));
    }

    @Override // o.ad5
    public final zo4 I() {
        return this.v;
    }

    @Override // o.bd5, o.ii1, o.hi1
    public final s67 c() {
        return new nx3((Object) this, (byte) 7);
    }

    @Override // o.g2, o.so
    public final up getAnnotations() {
        return this.x;
    }

    @Override // o.bd5, o.gi1
    public final String toString() {
        return "Lazy Java package fragment: " + this.q + " of module " + ((io3) this.t.m).h;
    }
}
