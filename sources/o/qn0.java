package o;

/* JADX INFO: loaded from: classes2.dex */
public final class qn0 implements nw3 {
    public static final qn0 a = new qn0();
    public static final ls5 b = new ls5("kotlin.Char", is5.f);

    @Override // o.nw3
    public final void a(bb7 bb7Var, Object obj) {
        bb7Var.d(((Character) obj).charValue());
    }

    @Override // o.nw3
    public final Object b(aj1 aj1Var) {
        return Character.valueOf(aj1Var.c());
    }

    @Override // o.nw3
    public final fq6 d() {
        return b;
    }
}
