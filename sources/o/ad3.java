package o;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ad3 extends a95 {
    public static final int[] b = {6, 8, 10, 12, 14};
    public static final int[] c = {1, 1, 1, 1};
    public static final int[][] d = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};
    public static final int[][] e = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};
    public int a = -1;

    public static int g(int[] iArr) throws d55 {
        float f = 0.38f;
        int i = 0;
        int i2 = -1;
        while (i < 20) {
            float fD = a95.d(iArr, e[i], i <= 9 ? 0.5f : 0.75f);
            if (fD < f) {
                i2 = i;
                f = fD;
            } else if (fD == f) {
                i2 = -1;
            }
            i++;
        }
        if (i2 >= 0) {
            return i2 % 10;
        }
        throw d55.a();
    }

    public static int[] h(int i, i70 i70Var, int[] iArr) throws d55 {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int i2 = i70Var.n;
        int i3 = i;
        boolean z = false;
        int i4 = 0;
        while (i < i2) {
            if (i70Var.a(i) != z) {
                iArr2[i4] = iArr2[i4] + 1;
            } else {
                if (i4 != length - 1) {
                    i4++;
                } else {
                    if (a95.d(iArr2, iArr, 0.5f) < 0.38f) {
                        return new int[]{i3, i};
                    }
                    i3 += iArr2[0] + iArr2[1];
                    int i5 = i4 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i5);
                    iArr2[i5] = 0;
                    iArr2[i4] = 0;
                    i4--;
                }
                iArr2[i4] = 1;
                z = !z;
            }
            i++;
        }
        throw d55.a();
    }

    @Override // o.a95
    public final uc6 b(int i, i70 i70Var, Map map) throws at2, d55 {
        int[] iArrH;
        int[] iArr;
        int length;
        int length2;
        int i2;
        int i3;
        boolean z;
        int i4 = i70Var.n;
        int iB = i70Var.b(0);
        if (iB == i4) {
            throw d55.a();
        }
        int[] iArrH2 = h(iB, i70Var, c);
        int i5 = iArrH2[1];
        int i6 = iArrH2[0];
        this.a = (i5 - i6) / 4;
        i(i70Var, i6);
        int[][] iArr2 = d;
        i70Var.e();
        try {
            int iB2 = i70Var.b(0);
            if (iB2 == i4) {
                throw d55.a();
            }
            try {
                iArrH = h(iB2, i70Var, iArr2[0]);
                while (true) {
                    if (i2 >= length2) {
                        z = false;
                        break;
                    }
                    int i7 = iArr[i2];
                    if (length == i7) {
                        z = true;
                        break;
                    }
                    if (i7 > i3) {
                        i3 = i7;
                    }
                    i2++;
                }
            } catch (d55 unused) {
                iArrH = h(iB2, i70Var, iArr2[1]);
            }
            i(i70Var, iArrH[0]);
            int i8 = iArrH[0];
            iArrH[0] = i4 - iArrH[1];
            iArrH[1] = i4 - i8;
            i70Var.e();
            StringBuilder sb = new StringBuilder(20);
            int i9 = iArrH2[1];
            int i10 = iArrH[0];
            int[] iArr3 = new int[10];
            int[] iArr4 = new int[5];
            int[] iArr5 = new int[5];
            while (i9 < i10) {
                a95.e(i9, i70Var, iArr3);
                for (int i11 = 0; i11 < 5; i11++) {
                    int i12 = i11 * 2;
                    iArr4[i11] = iArr3[i12];
                    iArr5[i11] = iArr3[i12 + 1];
                }
                sb.append((char) (g(iArr4) + 48));
                sb.append((char) (g(iArr5) + 48));
                for (int i13 = 0; i13 < 10; i13++) {
                    i9 += iArr3[i13];
                }
            }
            String string = sb.toString();
            iArr = map != null ? (int[]) map.get(pi1.ALLOWED_LENGTHS) : null;
            if (iArr == null) {
                iArr = b;
            }
            length = string.length();
            length2 = iArr.length;
            i2 = 0;
            i3 = 0;
            if (!z && length > i3) {
                z = true;
            }
            if (!z) {
                throw at2.a();
            }
            float f = i;
            uc6 uc6Var = new uc6(string, null, new wc6[]{new wc6(iArrH2[1], f), new wc6(iArrH[0], f)}, v20.u);
            uc6Var.b(vc6.y, "]I0");
            return uc6Var;
        } catch (Throwable th) {
            i70Var.e();
            throw th;
        }
    }

    public final void i(i70 i70Var, int i) throws d55 {
        int iMin = Math.min(this.a * 10, i);
        for (int i2 = i - 1; iMin > 0 && i2 >= 0 && !i70Var.a(i2); i2--) {
            iMin--;
        }
        if (iMin != 0) {
            throw d55.a();
        }
    }
}
