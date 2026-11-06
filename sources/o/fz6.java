package o;

/* JADX INFO: loaded from: classes2.dex */
public final class fz6 implements nw3 {
    public static final fz6 a = new fz6();
    public static final ls5 b = new ls5("kotlin.Short", is5.k);

    @Override // o.nw3
    public final void a(bb7 bb7Var, Object obj) {
        bb7Var.p(((Number) obj).shortValue());
    }

    @Override // o.nw3
    public final Object b(aj1 aj1Var) {
        return Short.valueOf(aj1Var.y());
    }

    @Override // o.nw3
    public final fq6 d() {
        return b;
    }
}
