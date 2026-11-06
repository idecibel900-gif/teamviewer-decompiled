package o;

/* JADX INFO: loaded from: classes2.dex */
public final class jv3 extends lu3 {
    public static final /* synthetic */ fw3[] g;
    public final u86 c;
    public final u86 d;
    public final u14 e;
    public final u14 f;

    static {
        x86 x86Var = w86.a;
        g = new fw3[]{x86Var.g(new gu5(x86Var.b(jv3.class), "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;")), x86Var.g(new gu5(x86Var.b(jv3.class), "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), x86Var.g(new gu5(x86Var.b(jv3.class), "members", "getMembers()Ljava/util/Collection;"))};
    }

    public jv3(lv3 lv3Var) {
        super(lv3Var);
        byte b = 1;
        this.c = et1.F(null, new gv3(lv3Var, b));
        this.d = et1.F(null, new hv3(this, (byte) 0));
        iv3 iv3Var = new iv3(this, lv3Var);
        l54 l54Var = l54.m;
        this.e = ds1.X(l54Var, iv3Var);
        this.f = ds1.X(l54Var, new hv3(this, b));
        et1.F(null, new iv3(lv3Var, this));
    }
}
