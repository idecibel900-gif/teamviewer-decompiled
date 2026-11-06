package o;

/* JADX INFO: loaded from: classes2.dex */
public final class r32 implements nw3 {
    public static final r32 a = new r32();
    public static final ls5 b = new ls5("kotlin.Double", is5.g);

    @Override // o.nw3
    public final void a(bb7 bb7Var, Object obj) {
        bb7Var.e(((Number) obj).doubleValue());
    }

    @Override // o.nw3
    public final Object b(aj1 aj1Var) {
        return Double.valueOf(aj1Var.B());
    }

    @Override // o.nw3
    public final fq6 d() {
        return b;
    }
}
