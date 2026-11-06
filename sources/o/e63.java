package o;

/* JADX INFO: loaded from: classes.dex */
public final class e63 {
    public final hw2 a;
    public final /* synthetic */ byte b;

    public e63(hw2 hw2Var, byte b) {
        this.b = b;
        this.a = hw2Var;
    }

    public final float a(float f, i04 i04Var, i04 i04Var2) {
        switch (this.b) {
            case 0:
                return Float.intBitsToFloat((int) (i04Var2.K(i04Var, (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(((int) (i04Var.j() >> 32)) / 2.0f) << 32)) & 4294967295L));
            default:
                return Float.intBitsToFloat((int) (i04Var2.K(i04Var, (((long) Float.floatToRawIntBits(((int) (i04Var.j() & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)) >> 32));
        }
    }
}
