package o;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class qu0 extends a95 {
    public static final char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '-', '.', ' ', '$', '/', '+', '%', 'a', 'b', 'c', 'd', '*'};
    public static final int[] d;
    public static final int e;
    public final StringBuilder a = new StringBuilder(20);
    public final int[] b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        d = iArr;
        e = iArr[47];
    }

    public static void g(CharSequence charSequence, int i, int i2) throws lq0 {
        int iIndexOf = 0;
        int i3 = 1;
        for (int i4 = i - 1; i4 >= 0; i4--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i4)) * i3;
            i3++;
            if (i3 > i2) {
                i3 = 1;
            }
        }
        if (charSequence.charAt(i) != c[iIndexOf % 47]) {
            throw lq0.a();
        }
    }

    public static int h(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int iRound = Math.round((iArr[i4] * 9.0f) / i);
            if (iRound < 1 || iRound > 4) {
                return -1;
            }
            if ((i4 & 1) == 0) {
                for (int i5 = 0; i5 < iRound; i5++) {
                    i3 = (i3 << 1) | 1;
                }
            } else {
                i3 <<= iRound;
            }
        }
        return i3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:42:0x00d2  */
    @Override // o.a95
    public final uc6 b(int i, i70 i70Var, Map map) throws at2, d55, lq0 {
        int i2;
        char c2;
        int i3 = i70Var.n;
        int iB = i70Var.b(0);
        int[] iArr = this.b;
        Arrays.fill(iArr, 0);
        int length = iArr.length;
        boolean z = false;
        int i4 = 0;
        int i5 = iB;
        while (iB < i3) {
            if (i70Var.a(iB) != z) {
                iArr[i4] = iArr[i4] + 1;
            } else {
                if (i4 != length - 1) {
                    i4++;
                } else if (h(iArr) == e) {
                    int[] iArr2 = {i5, iB};
                    int iB2 = i70Var.b(iArr2[1]);
                    Arrays.fill(iArr, 0);
                    StringBuilder sb = this.a;
                    sb.setLength(0);
                    while (true) {
                        a95.e(iB2, i70Var, iArr);
                        int iH = h(iArr);
                        if (iH < 0) {
                            throw d55.a();
                        }
                        int i6 = 0;
                        while (true) {
                            if (i6 >= 48) {
                                throw d55.a();
                            }
                            if (d[i6] == iH) {
                                break;
                            }
                            i6++;
                        }
                        char c3 = c[i6];
                        sb.append(c3);
                        int i7 = iB2;
                        for (int i8 : iArr) {
                            i7 += i8;
                        }
                        int iB3 = i70Var.b(i7);
                        if (c3 == '*') {
                            sb.deleteCharAt(sb.length() - 1);
                            int i9 = 0;
                            for (int i10 : iArr) {
                                i9 += i10;
                            }
                            if (iB3 == i3 || !i70Var.a(iB3)) {
                                throw d55.a();
                            }
                            if (sb.length() < 2) {
                                throw d55.a();
                            }
                            int length2 = sb.length();
                            g(sb, length2 - 2, 20);
                            g(sb, length2 - 1, 15);
                            sb.setLength(sb.length() - 2);
                            int length3 = sb.length();
                            StringBuilder sb2 = new StringBuilder(length3);
                            int i11 = 0;
                            while (i11 < length3) {
                                char cCharAt = sb.charAt(i11);
                                if (cCharAt >= 'a' && cCharAt <= 'd') {
                                    if (i11 >= length3 - 1) {
                                        throw at2.a();
                                    }
                                    i11++;
                                    char cCharAt2 = sb.charAt(i11);
                                    switch (cCharAt) {
                                        case 'a':
                                            if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                                                throw at2.a();
                                            }
                                            i2 = cCharAt2 - '@';
                                            c2 = (char) i2;
                                            sb2.append(c2);
                                            break;
                                            break;
                                        case 'b':
                                            if (cCharAt2 >= 'A' && cCharAt2 <= 'E') {
                                                i2 = cCharAt2 - '&';
                                            } else if (cCharAt2 >= 'F' && cCharAt2 <= 'J') {
                                                i2 = cCharAt2 - 11;
                                            } else if (cCharAt2 < 'K' || cCharAt2 > 'O') {
                                                if (cCharAt2 >= 'P' && cCharAt2 <= 'T') {
                                                    i2 = cCharAt2 + '+';
                                                } else if (cCharAt2 == 'U') {
                                                    c2 = 0;
                                                } else if (cCharAt2 == 'V') {
                                                    c2 = '@';
                                                } else if (cCharAt2 == 'W') {
                                                    c2 = '`';
                                                } else {
                                                    if (cCharAt2 < 'X' || cCharAt2 > 'Z') {
                                                        throw at2.a();
                                                    }
                                                    c2 = 127;
                                                }
                                                sb2.append(c2);
                                            } else {
                                                i2 = cCharAt2 + 16;
                                            }
                                            c2 = (char) i2;
                                            sb2.append(c2);
                                            break;
                                        case 'c':
                                            if (cCharAt2 >= 'A' && cCharAt2 <= 'O') {
                                                i2 = cCharAt2 - ' ';
                                                c2 = (char) i2;
                                            } else {
                                                if (cCharAt2 != 'Z') {
                                                    throw at2.a();
                                                }
                                                c2 = ':';
                                            }
                                            sb2.append(c2);
                                            break;
                                        case 'd':
                                            if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                                                throw at2.a();
                                            }
                                            i2 = cCharAt2 + ' ';
                                            c2 = (char) i2;
                                            sb2.append(c2);
                                            break;
                                            break;
                                        default:
                                            c2 = 0;
                                            sb2.append(c2);
                                            break;
                                    }
                                } else {
                                    sb2.append(cCharAt);
                                }
                                i11++;
                            }
                            float f = i;
                            uc6 uc6Var = new uc6(sb2.toString(), null, new wc6[]{new wc6((iArr2[1] + iArr2[0]) / 2.0f, f), new wc6((i9 / 2.0f) + iB2, f)}, v20.p);
                            uc6Var.b(vc6.y, "]G0");
                            return uc6Var;
                        }
                        iB2 = iB3;
                    }
                } else {
                    i5 += iArr[0] + iArr[1];
                    int i12 = i4 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i12);
                    iArr[i12] = 0;
                    iArr[i4] = 0;
                    i4--;
                }
                iArr[i4] = 1;
                z = !z;
            }
            iB++;
        }
        throw d55.a();
    }
}
