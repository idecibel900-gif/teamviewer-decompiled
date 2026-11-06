package o;

/* JADX INFO: loaded from: classes.dex */
public final class wc8 {
    public static final wc8[] h = {new wc8(1, 10, 10, 8, 8, new ls8(5, new vc8(1, 3))), new wc8(2, 12, 12, 10, 10, new ls8(7, new vc8(1, 5))), new wc8(3, 14, 14, 12, 12, new ls8(10, new vc8(1, 8))), new wc8(4, 16, 16, 14, 14, new ls8(12, new vc8(1, 12))), new wc8(5, 18, 18, 16, 16, new ls8(14, new vc8(1, 18))), new wc8(6, 20, 20, 18, 18, new ls8(18, new vc8(1, 22))), new wc8(7, 22, 22, 20, 20, new ls8(20, new vc8(1, 30))), new wc8(8, 24, 24, 22, 22, new ls8(24, new vc8(1, 36))), new wc8(9, 26, 26, 24, 24, new ls8(28, new vc8(1, 44))), new wc8(10, 32, 32, 14, 14, new ls8(36, new vc8(1, 62))), new wc8(11, 36, 36, 16, 16, new ls8(42, new vc8(1, 86))), new wc8(12, 40, 40, 18, 18, new ls8(48, new vc8(1, 114))), new wc8(13, 44, 44, 20, 20, new ls8(56, new vc8(1, 144))), new wc8(14, 48, 48, 22, 22, new ls8(68, new vc8(1, 174))), new wc8(15, 52, 52, 24, 24, new ls8(42, new vc8(2, 102))), new wc8(16, 64, 64, 14, 14, new ls8(56, new vc8(2, 140))), new wc8(17, 72, 72, 16, 16, new ls8(36, new vc8(4, 92))), new wc8(18, 80, 80, 18, 18, new ls8(48, new vc8(4, 114))), new wc8(19, 88, 88, 20, 20, new ls8(56, new vc8(4, 144))), new wc8(20, 96, 96, 22, 22, new ls8(68, new vc8(4, 174))), new wc8(21, 104, 104, 24, 24, new ls8(56, new vc8(6, 136))), new wc8(22, 120, 120, 18, 18, new ls8(68, new vc8(6, 175))), new wc8(23, 132, 132, 20, 20, new ls8(62, new vc8(8, 163))), new wc8(24, 144, 144, 22, 22, new ls8(new vc8(8, 156), new vc8(2, 155))), new wc8(25, 8, 18, 6, 16, new ls8(7, new vc8(1, 5))), new wc8(26, 8, 32, 6, 14, new ls8(11, new vc8(1, 10))), new wc8(27, 12, 26, 10, 24, new ls8(14, new vc8(1, 16))), new wc8(28, 12, 36, 10, 16, new ls8(18, new vc8(1, 22))), new wc8(29, 16, 36, 14, 16, new ls8(24, new vc8(1, 32))), new wc8(30, 16, 48, 14, 22, new ls8(28, new vc8(1, 49))), new wc8(31, 8, 48, 6, 22, new ls8(15, new vc8(1, 18))), new wc8(32, 8, 64, 6, 14, new ls8(18, new vc8(1, 24))), new wc8(33, 8, 80, 6, 18, new ls8(22, new vc8(1, 32))), new wc8(34, 8, 96, 6, 22, new ls8(28, new vc8(1, 38))), new wc8(35, 8, 120, 6, 18, new ls8(32, new vc8(1, 49))), new wc8(36, 8, 144, 6, 22, new ls8(36, new vc8(1, 63))), new wc8(37, 12, 64, 10, 14, new ls8(27, new vc8(1, 43))), new wc8(38, 12, 88, 10, 20, new ls8(36, new vc8(1, 64))), new wc8(39, 16, 64, 14, 14, new ls8(36, new vc8(1, 62))), new wc8(40, 20, 36, 18, 16, new ls8(28, new vc8(1, 44))), new wc8(41, 20, 44, 18, 20, new ls8(34, new vc8(1, 56))), new wc8(42, 20, 64, 18, 14, new ls8(42, new vc8(1, 84))), new wc8(43, 22, 48, 20, 22, new ls8(38, new vc8(1, 72))), new wc8(44, 24, 48, 22, 22, new ls8(41, new vc8(1, 80))), new wc8(45, 24, 64, 22, 14, new ls8(46, new vc8(1, 108))), new wc8(46, 26, 40, 24, 18, new ls8(38, new vc8(1, 70))), new wc8(47, 26, 48, 24, 22, new ls8(42, new vc8(1, 90))), new wc8(48, 26, 64, 24, 14, new ls8(50, new vc8(1, 118)))};
    public final byte a;
    public final short b;
    public final short c;
    public final byte d;
    public final byte e;
    public final ls8 f;
    public final int g;

    /* JADX WARN: Multi-variable type inference failed */
    public wc8(int i, int i2, int i3, int i4, int i5, ls8 ls8Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = ls8Var;
        byte b = ls8Var.a;
        int i6 = 0;
        for (vc8 vc8Var : (vc8[]) ls8Var.b) {
            i6 += (vc8Var.b + b) * vc8Var.a;
        }
        this.g = i6;
    }

    public final String toString() {
        return String.valueOf((int) this.a);
    }
}
