package o;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class pu0 extends a95 {
    public static final int[] d = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, 196, 168, 162, 138, 42};
    public final boolean a;
    public final StringBuilder b = new StringBuilder(20);
    public final int[] c = new int[9];

    public pu0(boolean z) {
        this.a = z;
    }

    public static int g(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        while (true) {
            int i2 = Integer.MAX_VALUE;
            for (int i3 : iArr) {
                if (i3 < i2 && i3 > i) {
                    i2 = i3;
                }
            }
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = iArr[i7];
                if (i8 > i2) {
                    i5 |= 1 << ((length - 1) - i7);
                    i4++;
                    i6 += i8;
                }
            }
            if (i4 == 3) {
                for (int i9 = 0; i9 < length && i4 > 0; i9++) {
                    int i10 = iArr[i9];
                    if (i10 > i2) {
                        i4--;
                        if (i10 * 2 >= i6) {
                            return -1;
                        }
                    }
                }
                return i5;
            }
            if (i4 <= 3) {
                return -1;
            }
            i = i2;
        }
    }

    @Override // o.a95
    public final uc6 b(int i, i70 i70Var, Map map) throws d55, lq0 {
        int i2;
        char c;
        char cCharAt;
        int[] iArr = this.c;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.b;
        sb.setLength(0);
        int i3 = i70Var.n;
        int iB = i70Var.b(0);
        int length = iArr.length;
        boolean z = false;
        int i4 = 0;
        int i5 = iB;
        while (iB < i3) {
            char c2 = 1;
            if (i70Var.a(iB) != z) {
                iArr[i4] = iArr[i4] + 1;
            } else {
                if (i4 == length - 1) {
                    int i6 = 148;
                    if (g(iArr) == 148 && i70Var.d(Math.max(0, i5 - ((iB - i5) / 2)), i5)) {
                        int[] iArr2 = {i5, iB};
                        int iB2 = i70Var.b(iArr2[1]);
                        while (true) {
                            a95.e(iB2, i70Var, iArr);
                            int iG = g(iArr);
                            if (iG < 0) {
                                throw d55.a();
                            }
                            int i7 = 0;
                            while (true) {
                                if (i7 >= 43) {
                                    c = c2;
                                    if (iG != i6) {
                                        throw d55.a();
                                    }
                                    cCharAt = '*';
                                    break;
                                }
                                c = c2;
                                if (d[i7] == iG) {
                                    cCharAt = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i7);
                                    break;
                                }
                                i7++;
                                c2 = c;
                            }
                            sb.append(cCharAt);
                            int i8 = iB2;
                            for (int i9 : iArr) {
                                i8 += i9;
                            }
                            int iB3 = i70Var.b(i8);
                            if (cCharAt == '*') {
                                sb.setLength(sb.length() - 1);
                                int i10 = 0;
                                for (int i11 : iArr) {
                                    i10 += i11;
                                }
                                int i12 = (iB3 - iB2) - i10;
                                if (iB3 != i3 && i12 * 2 < i10) {
                                    throw d55.a();
                                }
                                if (this.a) {
                                    int length2 = sb.length() - 1;
                                    int iIndexOf = 0;
                                    for (int i13 = 0; i13 < length2; i13++) {
                                        iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(sb.charAt(i13));
                                    }
                                    if (sb.charAt(length2) != "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(iIndexOf % 43)) {
                                        throw lq0.a();
                                    }
                                    sb.setLength(length2);
                                }
                                if (sb.length() == 0) {
                                    throw d55.a();
                                }
                                float f = i;
                                uc6 uc6Var = new uc6(sb.toString(), null, new wc6[]{new wc6((iArr2[c] + iArr2[0]) / 2.0f, f), new wc6((i10 / 2.0f) + iB2, f)}, v20.f2267o);
                                uc6Var.b(vc6.y, "]A0");
                                return uc6Var;
                            }
                            c2 = c;
                            iB2 = iB3;
                            i6 = 148;
                        }
                    } else {
                        i2 = 1;
                        i5 += iArr[0] + iArr[1];
                        int i14 = i4 - 1;
                        System.arraycopy(iArr, 2, iArr, 0, i14);
                        iArr[i14] = 0;
                        iArr[i4] = 0;
                        i4--;
                    }
                } else {
                    i2 = 1;
                    i4++;
                }
                iArr[i4] = i2;
                z = !z;
            }
            iB++;
        }
        throw d55.a();
    }
}
