package o;

/* JADX INFO: loaded from: classes2.dex */
public final class kn2 implements nw3 {
    public static final kn2 a = new kn2();
    public static final ls5 b = new ls5("kotlin.Float", is5.h);

    @Override // o.nw3
    public final void a(bb7 bb7Var, Object obj) {
        bb7Var.g(((Number) obj).floatValue());
    }

    @Override // o.nw3
    public final Object b(aj1 aj1Var) {
        return Float.valueOf(aj1Var.z());
    }

    @Override // o.nw3
    public final fq6 d() {
        return b;
    }
}
