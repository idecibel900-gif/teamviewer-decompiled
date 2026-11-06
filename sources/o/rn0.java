package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class rn0 extends hl3 {
    @Override // o.u51
    public final oz3 a(ps4 ps4Var) {
        ps4Var.getClass();
        wy3 wy3VarH = ps4Var.h();
        wy3VarH.getClass();
        return wy3VarH.s(ps5.CHAR);
    }

    @Override // o.u51
    public final String toString() {
        String strValueOf;
        Object obj = this.a;
        Integer numValueOf = Integer.valueOf(((Character) obj).charValue());
        char cCharValue = ((Character) obj).charValue();
        switch (cCharValue) {
            case '\b':
                strValueOf = "\\b";
                break;
            case ep1.b /* 9 */:
                strValueOf = "\\t";
                break;
            case ep1.c /* 10 */:
                strValueOf = "\\n";
                break;
            case 11:
            default:
                byte type = (byte) Character.getType(cCharValue);
                strValueOf = (type != 0 && type != 13 && type != 14 && type != 15 && type != 16 && type != 18 && type != 19) ? String.valueOf(cCharValue) : "?";
                break;
            case ep1.d /* 12 */:
                strValueOf = "\\f";
                break;
            case '\r':
                strValueOf = "\\r";
                break;
        }
        return String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{numValueOf, strValueOf}, 2));
    }
}
