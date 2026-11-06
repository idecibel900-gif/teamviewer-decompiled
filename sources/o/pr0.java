package o;

/* JADX INFO: loaded from: classes.dex */
public final class pr0 implements pw6 {
    public static final pr0 b = new pr0(0);
    public static final pr0 c = new pr0(1);
    public static final pr0 d = new pr0(2);
    public final /* synthetic */ byte a;

    public /* synthetic */ pr0(byte b2) {
        this.a = b2;
    }

    @Override // o.pw6
    public final vs1 a(long j, j04 j04Var, in1 in1Var) {
        switch (this.a) {
            case 0:
                float fB = y07.b(j) / 2.0f;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fB)) << 32) | (((long) Float.floatToRawIntBits(fB)) & 4294967295L);
                v56 v56VarV = qs1.v(0L, j);
                return new pb5(new lf6(v56VarV.a, v56VarV.b, v56VarV.c, v56VarV.d, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits));
            case 1:
                float fQ0 = in1Var.q0(30.0f);
                return new ob5(new v56(0.0f, -fQ0, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + fQ0));
            case 2:
                float fQ1 = in1Var.q0(30.0f);
                return new ob5(new v56(-fQ1, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + fQ1, Float.intBitsToFloat((int) (j & 4294967295L))));
            default:
                return new ob5(qs1.v(0L, j));
        }
    }

    public String toString() {
        switch (this.a) {
            case 3:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}
