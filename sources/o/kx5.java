package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kx5 {
    public static final ai0 a;

    static {
        ai0 ai0Var = ai0.p;
        a = ju.s("xn--");
    }

    public static int a(int i, int i2, boolean z) {
        int i3 = z ? i / 700 : i / 2;
        int i4 = (i3 / i2) + i3;
        int i5 = 0;
        while (i4 > 455) {
            i4 /= 35;
            i5 += 36;
        }
        return ((i4 * 36) / (i4 + 38)) + i5;
    }

    public static int b(int i) {
        if (i < 26) {
            return i + 97;
        }
        if (i < 36) {
            return i + 22;
        }
        an4.e(i, "unexpected digit: ");
        return 0;
    }
}
