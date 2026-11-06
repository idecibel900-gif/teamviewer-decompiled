package o;

/* JADX INFO: loaded from: classes.dex */
public final class xc8 {
    public static final int[] e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};
    public static final xc8[] f = a();
    public final byte a;
    public final int[] b;
    public final ls8[] c;
    public final int d;

    /* JADX WARN: Multi-variable type inference failed */
    public xc8(int i, int[] iArr, ls8... ls8VarArr) {
        this.a = i;
        this.b = iArr;
        this.c = ls8VarArr;
        ls8 ls8Var = ls8VarArr[0];
        byte b = ls8Var.a;
        int i2 = 0;
        for (uc8 uc8Var : (uc8[]) ls8Var.b) {
            i2 += (uc8Var.b + b) * uc8Var.a;
        }
        this.d = i2;
    }

    public static xc8[] a() {
        return new xc8[]{new xc8(1, new int[0], new ls8(7, new uc8[]{new uc8(1, 19)}), new ls8(10, new uc8[]{new uc8(1, 16)}), new ls8(13, new uc8[]{new uc8(1, 13)}), new ls8(17, new uc8[]{new uc8(1, 9)})), new xc8(2, new int[]{6, 18}, new ls8(10, new uc8[]{new uc8(1, 34)}), new ls8(16, new uc8[]{new uc8(1, 28)}), new ls8(22, new uc8[]{new uc8(1, 22)}), new ls8(28, new uc8[]{new uc8(1, 16)})), new xc8(3, new int[]{6, 22}, new ls8(15, new uc8[]{new uc8(1, 55)}), new ls8(26, new uc8[]{new uc8(1, 44)}), new ls8(18, new uc8[]{new uc8(2, 17)}), new ls8(22, new uc8[]{new uc8(2, 13)})), new xc8(4, new int[]{6, 26}, new ls8(20, new uc8[]{new uc8(1, 80)}), new ls8(18, new uc8[]{new uc8(2, 32)}), new ls8(26, new uc8[]{new uc8(2, 24)}), new ls8(16, new uc8[]{new uc8(4, 9)})), new xc8(5, new int[]{6, 30}, new ls8(26, new uc8[]{new uc8(1, 108)}), new ls8(24, new uc8[]{new uc8(2, 43)}), new ls8(18, new uc8[]{new uc8(2, 15), new uc8(2, 16)}), new ls8(22, new uc8[]{new uc8(2, 11), new uc8(2, 12)})), new xc8(6, new int[]{6, 34}, new ls8(18, new uc8[]{new uc8(2, 68)}), new ls8(16, new uc8[]{new uc8(4, 27)}), new ls8(24, new uc8[]{new uc8(4, 19)}), new ls8(28, new uc8[]{new uc8(4, 15)})), new xc8(7, new int[]{6, 22, 38}, new ls8(20, new uc8[]{new uc8(2, 78)}), new ls8(18, new uc8[]{new uc8(4, 31)}), new ls8(18, new uc8[]{new uc8(2, 14), new uc8(4, 15)}), new ls8(26, new uc8[]{new uc8(4, 13), new uc8(1, 14)})), new xc8(8, new int[]{6, 24, 42}, new ls8(24, new uc8[]{new uc8(2, 97)}), new ls8(22, new uc8[]{new uc8(2, 38), new uc8(2, 39)}), new ls8(22, new uc8[]{new uc8(4, 18), new uc8(2, 19)}), new ls8(26, new uc8[]{new uc8(4, 14), new uc8(2, 15)})), new xc8(9, new int[]{6, 26, 46}, new ls8(30, new uc8[]{new uc8(2, 116)}), new ls8(22, new uc8[]{new uc8(3, 36), new uc8(2, 37)}), new ls8(20, new uc8[]{new uc8(4, 16), new uc8(4, 17)}), new ls8(24, new uc8[]{new uc8(4, 12), new uc8(4, 13)})), new xc8(10, new int[]{6, 28, 50}, new ls8(18, new uc8[]{new uc8(2, 68), new uc8(2, 69)}), new ls8(26, new uc8[]{new uc8(4, 43), new uc8(1, 44)}), new ls8(24, new uc8[]{new uc8(6, 19), new uc8(2, 20)}), new ls8(28, new uc8[]{new uc8(6, 15), new uc8(2, 16)})), new xc8(11, new int[]{6, 30, 54}, new ls8(20, new uc8[]{new uc8(4, 81)}), new ls8(30, new uc8[]{new uc8(1, 50), new uc8(4, 51)}), new ls8(28, new uc8[]{new uc8(4, 22), new uc8(4, 23)}), new ls8(24, new uc8[]{new uc8(3, 12), new uc8(8, 13)})), new xc8(12, new int[]{6, 32, 58}, new ls8(24, new uc8[]{new uc8(2, 92), new uc8(2, 93)}), new ls8(22, new uc8[]{new uc8(6, 36), new uc8(2, 37)}), new ls8(26, new uc8[]{new uc8(4, 20), new uc8(6, 21)}), new ls8(28, new uc8[]{new uc8(7, 14), new uc8(4, 15)})), new xc8(13, new int[]{6, 34, 62}, new ls8(26, new uc8[]{new uc8(4, 107)}), new ls8(22, new uc8[]{new uc8(8, 37), new uc8(1, 38)}), new ls8(24, new uc8[]{new uc8(8, 20), new uc8(4, 21)}), new ls8(22, new uc8[]{new uc8(12, 11), new uc8(4, 12)})), new xc8(14, new int[]{6, 26, 46, 66}, new ls8(30, new uc8[]{new uc8(3, 115), new uc8(1, 116)}), new ls8(24, new uc8[]{new uc8(4, 40), new uc8(5, 41)}), new ls8(20, new uc8[]{new uc8(11, 16), new uc8(5, 17)}), new ls8(24, new uc8[]{new uc8(11, 12), new uc8(5, 13)})), new xc8(15, new int[]{6, 26, 48, 70}, new ls8(22, new uc8[]{new uc8(5, 87), new uc8(1, 88)}), new ls8(24, new uc8[]{new uc8(5, 41), new uc8(5, 42)}), new ls8(30, new uc8[]{new uc8(5, 24), new uc8(7, 25)}), new ls8(24, new uc8[]{new uc8(11, 12), new uc8(7, 13)})), new xc8(16, new int[]{6, 26, 50, 74}, new ls8(24, new uc8[]{new uc8(5, 98), new uc8(1, 99)}), new ls8(28, new uc8[]{new uc8(7, 45), new uc8(3, 46)}), new ls8(24, new uc8[]{new uc8(15, 19), new uc8(2, 20)}), new ls8(30, new uc8[]{new uc8(3, 15), new uc8(13, 16)})), new xc8(17, new int[]{6, 30, 54, 78}, new ls8(28, new uc8[]{new uc8(1, 107), new uc8(5, 108)}), new ls8(28, new uc8[]{new uc8(10, 46), new uc8(1, 47)}), new ls8(28, new uc8[]{new uc8(1, 22), new uc8(15, 23)}), new ls8(28, new uc8[]{new uc8(2, 14), new uc8(17, 15)})), new xc8(18, new int[]{6, 30, 56, 82}, new ls8(30, new uc8[]{new uc8(5, 120), new uc8(1, 121)}), new ls8(26, new uc8[]{new uc8(9, 43), new uc8(4, 44)}), new ls8(28, new uc8[]{new uc8(17, 22), new uc8(1, 23)}), new ls8(28, new uc8[]{new uc8(2, 14), new uc8(19, 15)})), new xc8(19, new int[]{6, 30, 58, 86}, new ls8(28, new uc8[]{new uc8(3, 113), new uc8(4, 114)}), new ls8(26, new uc8[]{new uc8(3, 44), new uc8(11, 45)}), new ls8(26, new uc8[]{new uc8(17, 21), new uc8(4, 22)}), new ls8(26, new uc8[]{new uc8(9, 13), new uc8(16, 14)})), new xc8(20, new int[]{6, 34, 62, 90}, new ls8(28, new uc8[]{new uc8(3, 107), new uc8(5, 108)}), new ls8(26, new uc8[]{new uc8(3, 41), new uc8(13, 42)}), new ls8(30, new uc8[]{new uc8(15, 24), new uc8(5, 25)}), new ls8(28, new uc8[]{new uc8(15, 15), new uc8(10, 16)})), new xc8(21, new int[]{6, 28, 50, 72, 94}, new ls8(28, new uc8[]{new uc8(4, 116), new uc8(4, 117)}), new ls8(26, new uc8[]{new uc8(17, 42)}), new ls8(28, new uc8[]{new uc8(17, 22), new uc8(6, 23)}), new ls8(30, new uc8[]{new uc8(19, 16), new uc8(6, 17)})), new xc8(22, new int[]{6, 26, 50, 74, 98}, new ls8(28, new uc8[]{new uc8(2, 111), new uc8(7, 112)}), new ls8(28, new uc8[]{new uc8(17, 46)}), new ls8(30, new uc8[]{new uc8(7, 24), new uc8(16, 25)}), new ls8(24, new uc8[]{new uc8(34, 13)})), new xc8(23, new int[]{6, 30, 54, 78, 102}, new ls8(30, new uc8[]{new uc8(4, 121), new uc8(5, 122)}), new ls8(28, new uc8[]{new uc8(4, 47), new uc8(14, 48)}), new ls8(30, new uc8[]{new uc8(11, 24), new uc8(14, 25)}), new ls8(30, new uc8[]{new uc8(16, 15), new uc8(14, 16)})), new xc8(24, new int[]{6, 28, 54, 80, 106}, new ls8(30, new uc8[]{new uc8(6, 117), new uc8(4, 118)}), new ls8(28, new uc8[]{new uc8(6, 45), new uc8(14, 46)}), new ls8(30, new uc8[]{new uc8(11, 24), new uc8(16, 25)}), new ls8(30, new uc8[]{new uc8(30, 16), new uc8(2, 17)})), new xc8(25, new int[]{6, 32, 58, 84, 110}, new ls8(26, new uc8[]{new uc8(8, 106), new uc8(4, 107)}), new ls8(28, new uc8[]{new uc8(8, 47), new uc8(13, 48)}), new ls8(30, new uc8[]{new uc8(7, 24), new uc8(22, 25)}), new ls8(30, new uc8[]{new uc8(22, 15), new uc8(13, 16)})), new xc8(26, new int[]{6, 30, 58, 86, 114}, new ls8(28, new uc8[]{new uc8(10, 114), new uc8(2, 115)}), new ls8(28, new uc8[]{new uc8(19, 46), new uc8(4, 47)}), new ls8(28, new uc8[]{new uc8(28, 22), new uc8(6, 23)}), new ls8(30, new uc8[]{new uc8(33, 16), new uc8(4, 17)})), new xc8(27, new int[]{6, 34, 62, 90, 118}, new ls8(30, new uc8[]{new uc8(8, 122), new uc8(4, 123)}), new ls8(28, new uc8[]{new uc8(22, 45), new uc8(3, 46)}), new ls8(30, new uc8[]{new uc8(8, 23), new uc8(26, 24)}), new ls8(30, new uc8[]{new uc8(12, 15), new uc8(28, 16)})), new xc8(28, new int[]{6, 26, 50, 74, 98, 122}, new ls8(30, new uc8[]{new uc8(3, 117), new uc8(10, 118)}), new ls8(28, new uc8[]{new uc8(3, 45), new uc8(23, 46)}), new ls8(30, new uc8[]{new uc8(4, 24), new uc8(31, 25)}), new ls8(30, new uc8[]{new uc8(11, 15), new uc8(31, 16)})), new xc8(29, new int[]{6, 30, 54, 78, 102, 126}, new ls8(30, new uc8[]{new uc8(7, 116), new uc8(7, 117)}), new ls8(28, new uc8[]{new uc8(21, 45), new uc8(7, 46)}), new ls8(30, new uc8[]{new uc8(1, 23), new uc8(37, 24)}), new ls8(30, new uc8[]{new uc8(19, 15), new uc8(26, 16)})), new xc8(30, new int[]{6, 26, 52, 78, 104, 130}, new ls8(30, new uc8[]{new uc8(5, 115), new uc8(10, 116)}), new ls8(28, new uc8[]{new uc8(19, 47), new uc8(10, 48)}), new ls8(30, new uc8[]{new uc8(15, 24), new uc8(25, 25)}), new ls8(30, new uc8[]{new uc8(23, 15), new uc8(25, 16)})), new xc8(31, new int[]{6, 30, 56, 82, 108, 134}, new ls8(30, new uc8[]{new uc8(13, 115), new uc8(3, 116)}), new ls8(28, new uc8[]{new uc8(2, 46), new uc8(29, 47)}), new ls8(30, new uc8[]{new uc8(42, 24), new uc8(1, 25)}), new ls8(30, new uc8[]{new uc8(23, 15), new uc8(28, 16)})), new xc8(32, new int[]{6, 34, 60, 86, 112, 138}, new ls8(30, new uc8[]{new uc8(17, 115)}), new ls8(28, new uc8[]{new uc8(10, 46), new uc8(23, 47)}), new ls8(30, new uc8[]{new uc8(10, 24), new uc8(35, 25)}), new ls8(30, new uc8[]{new uc8(19, 15), new uc8(35, 16)})), new xc8(33, new int[]{6, 30, 58, 86, 114, 142}, new ls8(30, new uc8[]{new uc8(17, 115), new uc8(1, 116)}), new ls8(28, new uc8[]{new uc8(14, 46), new uc8(21, 47)}), new ls8(30, new uc8[]{new uc8(29, 24), new uc8(19, 25)}), new ls8(30, new uc8[]{new uc8(11, 15), new uc8(46, 16)})), new xc8(34, new int[]{6, 34, 62, 90, 118, 146}, new ls8(30, new uc8[]{new uc8(13, 115), new uc8(6, 116)}), new ls8(28, new uc8[]{new uc8(14, 46), new uc8(23, 47)}), new ls8(30, new uc8[]{new uc8(44, 24), new uc8(7, 25)}), new ls8(30, new uc8[]{new uc8(59, 16), new uc8(1, 17)})), new xc8(35, new int[]{6, 30, 54, 78, 102, 126, 150}, new ls8(30, new uc8[]{new uc8(12, 121), new uc8(7, 122)}), new ls8(28, new uc8[]{new uc8(12, 47), new uc8(26, 48)}), new ls8(30, new uc8[]{new uc8(39, 24), new uc8(14, 25)}), new ls8(30, new uc8[]{new uc8(22, 15), new uc8(41, 16)})), new xc8(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new ls8(30, new uc8[]{new uc8(6, 121), new uc8(14, 122)}), new ls8(28, new uc8[]{new uc8(6, 47), new uc8(34, 48)}), new ls8(30, new uc8[]{new uc8(46, 24), new uc8(10, 25)}), new ls8(30, new uc8[]{new uc8(2, 15), new uc8(64, 16)})), new xc8(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new ls8(30, new uc8[]{new uc8(17, 122), new uc8(4, 123)}), new ls8(28, new uc8[]{new uc8(29, 46), new uc8(14, 47)}), new ls8(30, new uc8[]{new uc8(49, 24), new uc8(10, 25)}), new ls8(30, new uc8[]{new uc8(24, 15), new uc8(46, 16)})), new xc8(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new ls8(30, new uc8[]{new uc8(4, 122), new uc8(18, 123)}), new ls8(28, new uc8[]{new uc8(13, 46), new uc8(32, 47)}), new ls8(30, new uc8[]{new uc8(48, 24), new uc8(14, 25)}), new ls8(30, new uc8[]{new uc8(42, 15), new uc8(32, 16)})), new xc8(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new ls8(30, new uc8[]{new uc8(20, 117), new uc8(4, 118)}), new ls8(28, new uc8[]{new uc8(40, 47), new uc8(7, 48)}), new ls8(30, new uc8[]{new uc8(43, 24), new uc8(22, 25)}), new ls8(30, new uc8[]{new uc8(10, 15), new uc8(67, 16)})), new xc8(40, new int[]{6, 30, 58, 86, 114, 142, 170}, new ls8(30, new uc8[]{new uc8(19, 118), new uc8(6, 119)}), new ls8(28, new uc8[]{new uc8(18, 47), new uc8(31, 48)}), new ls8(30, new uc8[]{new uc8(34, 24), new uc8(34, 25)}), new ls8(30, new uc8[]{new uc8(20, 15), new uc8(61, 16)}))};
    }

    public static xc8 b(int i) {
        int i2 = Integer.MAX_VALUE;
        int i3 = 0;
        for (int i4 = 0; i4 < 34; i4++) {
            int i5 = e[i4];
            if (i5 == i) {
                return c(i4 + 7);
            }
            int iBitCount = Integer.bitCount(i5 ^ i);
            if (iBitCount < i2) {
                i3 = i4 + 7;
                i2 = iBitCount;
            }
        }
        if (i2 <= 3) {
            return c(i3);
        }
        return null;
    }

    public static xc8 c(int i) {
        if (i >= 1 && i <= 40) {
            return f[i - 1];
        }
        yq4.f();
        return null;
    }

    public final String toString() {
        return String.valueOf((int) this.a);
    }
}
