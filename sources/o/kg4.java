package o;

/* JADX INFO: loaded from: classes2.dex */
public final class kg4 implements nw3 {
    public static final kg4 a = new kg4();
    public static final ls5 b = new ls5("kotlin.Long", is5.j);

    @Override // o.nw3
    public final void a(bb7 bb7Var, Object obj) {
        bb7Var.k(((Number) obj).longValue());
    }

    @Override // o.nw3
    public final Object b(aj1 aj1Var) {
        return Long.valueOf(aj1Var.p());
    }

    @Override // o.nw3
    public final fq6 d() {
        return b;
    }
}
