package o;

/* JADX INFO: loaded from: classes2.dex */
public final class qh0 implements nw3 {
    public static final qh0 a = new qh0();
    public static final ls5 b = new ls5("kotlin.Byte", is5.e);

    @Override // o.nw3
    public final void a(bb7 bb7Var, Object obj) {
        bb7Var.c(((Number) obj).byteValue());
    }

    @Override // o.nw3
    public final Object b(aj1 aj1Var) {
        return Byte.valueOf(aj1Var.x());
    }

    @Override // o.nw3
    public final fq6 d() {
        return b;
    }
}
