package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class vo6 {
    public static final no a = new no(Float.NaN, Float.NaN);
    public static final yn1 b = new yn1(new fk6((byte) 7), new fk6((byte) 8));
    public static final long c;
    public static final e87 d;

    static {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.01f)) << 32) | (((long) Float.floatToRawIntBits(0.01f)) & 4294967295L);
        c = jFloatToRawIntBits;
        d = new e87(new t65(jFloatToRawIntBits));
    }
}
