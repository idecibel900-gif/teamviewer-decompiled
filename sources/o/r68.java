package o;

/* JADX INFO: loaded from: classes2.dex */
public final class r68 extends hl3 {
    public final /* synthetic */ byte b = 0;

    public r68(byte b) {
        super(Byte.valueOf(b));
    }

    @Override // o.u51
    public final oz3 a(ps4 ps4Var) {
        g07 g07VarW;
        g07 g07VarW2;
        g07 g07VarW3;
        g07 g07VarW4;
        byte b = this.b;
        gd2 gd2Var = gd2.L;
        ps4Var.getClass();
        switch (b) {
            case 0:
                ns4 ns4VarQ = vs1.q(ps4Var, s87.S);
                return (ns4VarQ == null || (g07VarW = ns4VarQ.W()) == null) ? hd2.c(gd2Var, "UByte") : g07VarW;
            case 1:
                ns4 ns4VarQ2 = vs1.q(ps4Var, s87.U);
                return (ns4VarQ2 == null || (g07VarW2 = ns4VarQ2.W()) == null) ? hd2.c(gd2Var, "UInt") : g07VarW2;
            case 2:
                ns4 ns4VarQ3 = vs1.q(ps4Var, s87.V);
                return (ns4VarQ3 == null || (g07VarW3 = ns4VarQ3.W()) == null) ? hd2.c(gd2Var, "ULong") : g07VarW3;
            default:
                ns4 ns4VarQ4 = vs1.q(ps4Var, s87.T);
                return (ns4VarQ4 == null || (g07VarW4 = ns4VarQ4.W()) == null) ? hd2.c(gd2Var, "UShort") : g07VarW4;
        }
    }

    @Override // o.u51
    public final String toString() {
        byte b = this.b;
        Object obj = this.a;
        switch (b) {
            case 0:
                return ((Number) obj).intValue() + ".toUByte()";
            case 1:
                return ((Number) obj).intValue() + ".toUInt()";
            case 2:
                return ((Number) obj).longValue() + ".toULong()";
            default:
                return ((Number) obj).intValue() + ".toUShort()";
        }
    }

    public r68(short s) {
        super(Short.valueOf(s));
    }

    public r68(int i) {
        super(Integer.valueOf(i));
    }

    public r68(long j) {
        super(Long.valueOf(j));
    }
}
