package o;

/* JADX INFO: loaded from: classes2.dex */
public final class yr3 extends wy3 {
    public static final /* synthetic */ fw3[] h;
    public wr3 f;
    public final vd4 g;

    static {
        x86 x86Var = w86.a;
        h = new fw3[]{x86Var.g(new gu5(x86Var.b(yr3.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};
    }

    public yr3(xd4 xd4Var) {
        super(xd4Var);
        this.g = new vd4(xd4Var, new e3((Object) this, (Object) xd4Var, (byte) 11));
    }

    public final bs3 J() {
        return (bs3) i67.s(this.g, h[0]);
    }

    @Override // o.wy3
    public final cc d() {
        return J();
    }

    @Override // o.wy3
    public final Iterable l() {
        Iterable iterableL = super.l();
        qs4 qs4VarK = k();
        qs4VarK.getClass();
        return lv0.z0(iterableL, new vr3(this.d, qs4VarK));
    }

    @Override // o.wy3
    public final rl5 p() {
        return J();
    }
}
