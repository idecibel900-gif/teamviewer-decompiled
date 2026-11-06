package o;

/* JADX INFO: loaded from: classes2.dex */
public final class q80 implements nw3 {
    public static final q80 a = new q80();
    public static final ls5 b = new ls5("kotlin.Boolean", is5.d);

    @Override // o.nw3
    public final void a(bb7 bb7Var, Object obj) {
        bb7Var.b(((Boolean) obj).booleanValue());
    }

    @Override // o.nw3
    public final Object b(aj1 aj1Var) {
        return Boolean.valueOf(aj1Var.b());
    }

    @Override // o.nw3
    public final fq6 d() {
        return b;
    }
}
