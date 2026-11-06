package o;

/* JADX INFO: loaded from: classes.dex */
public final class bi0 extends hl3 {
    public bi0(byte b) {
        super(Byte.valueOf(b));
    }

    @Override // o.u51
    public final oz3 a(ps4 ps4Var) {
        ps4Var.getClass();
        wy3 wy3VarH = ps4Var.h();
        wy3VarH.getClass();
        return wy3VarH.s(ps5.BYTE);
    }

    @Override // o.u51
    public final String toString() {
        return ((Number) this.a).intValue() + ".toByte()";
    }
}
