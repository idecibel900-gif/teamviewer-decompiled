package o;

/* JADX INFO: loaded from: classes2.dex */
public final class gz6 extends hl3 {
    public gz6(short s) {
        super(Short.valueOf(s));
    }

    @Override // o.u51
    public final oz3 a(ps4 ps4Var) {
        ps4Var.getClass();
        wy3 wy3VarH = ps4Var.h();
        wy3VarH.getClass();
        return wy3VarH.s(ps5.SHORT);
    }

    @Override // o.u51
    public final String toString() {
        return ((Number) this.a).intValue() + ".toShort()";
    }
}
