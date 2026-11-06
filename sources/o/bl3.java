package o;

/* JADX INFO: loaded from: classes2.dex */
public final class bl3 implements nw3 {
    public static final bl3 a = new bl3();
    public static final ls5 b = new ls5("kotlin.Int", is5.i);

    @Override // o.nw3
    public final void a(bb7 bb7Var, Object obj) {
        bb7Var.j(((Number) obj).intValue());
    }

    @Override // o.nw3
    public final Object b(aj1 aj1Var) {
        return Integer.valueOf(aj1Var.g());
    }

    @Override // o.nw3
    public final fq6 d() {
        return b;
    }
}
