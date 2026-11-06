package o;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class nu0 extends a95 {
    public static final char[] d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-', '$', ':', '/', '.', '+', 'A', 'B', 'C', 'D'};
    public static final int[] e = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};
    public static final char[] f = {'A', 'B', 'C', 'D'};
    public final StringBuilder a = new StringBuilder(20);
    public int[] b = new int[80];
    public int c = 0;

    public static boolean g(char[] cArr, char c) {
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    @Override // o.a95
    public final uc6 b(int i, i70 i70Var, Map map) throws d55 {
        int i2;
        int[] iArr;
        int i3;
        Arrays.fill(this.b, 0);
        this.c = 0;
        int iC = i70Var.c(0);
        int i4 = i70Var.n;
        if (iC >= i4) {
            throw d55.a();
        }
        int i5 = 1;
        int i6 = 0;
        boolean z = true;
        while (iC < i4) {
            if (i70Var.a(iC) != z) {
                i6++;
            } else {
                int[] iArr2 = this.b;
                int i7 = this.c;
                iArr2[i7] = i6;
                int i8 = i7 + 1;
                this.c = i8;
                if (i8 >= iArr2.length) {
                    int[] iArr3 = new int[i8 * 2];
                    System.arraycopy(iArr2, 0, iArr3, 0, i8);
                    this.b = iArr3;
                }
                z = !z;
                i6 = 1;
            }
            iC++;
        }
        int[] iArr4 = this.b;
        int i9 = this.c;
        iArr4[i9] = i6;
        int i10 = i9 + 1;
        this.c = i10;
        if (i10 >= iArr4.length) {
            int[] iArr5 = new int[i10 * 2];
            System.arraycopy(iArr4, 0, iArr5, 0, i10);
            this.b = iArr5;
        }
        int i11 = 1;
        while (i11 < this.c) {
            int iH = h(i11);
            if (iH != -1) {
                char[] cArr = d;
                char c = cArr[iH];
                char[] cArr2 = f;
                if (g(cArr2, c)) {
                    int i12 = 0;
                    for (int i13 = i11; i13 < i11 + 7; i13++) {
                        i12 += this.b[i13];
                    }
                    if (i11 == i5 || this.b[i11 - 1] >= i12 / 2) {
                        StringBuilder sb = this.a;
                        sb.setLength(0);
                        int i14 = i11;
                        while (true) {
                            int iH2 = h(i14);
                            if (iH2 == -1) {
                                throw d55.a();
                            }
                            sb.append((char) iH2);
                            i2 = i14 + 8;
                            if ((sb.length() > i5 && g(cArr2, cArr[iH2])) || i2 >= this.c) {
                                break;
                            }
                            i14 = i2;
                            i5 = i5;
                        }
                        int i15 = i14 + 7;
                        int i16 = this.b[i15];
                        int i17 = 0;
                        for (int i18 = -8; i18 < -1; i18++) {
                            i17 += this.b[i2 + i18];
                        }
                        int i19 = 2;
                        if (i2 < this.c && i16 < i17 / 2) {
                            throw d55.a();
                        }
                        int[] iArr6 = new int[4];
                        iArr6[0] = 0;
                        iArr6[i5] = 0;
                        iArr6[2] = 0;
                        iArr6[3] = 0;
                        int[] iArr7 = new int[4];
                        iArr7[0] = 0;
                        iArr7[i5] = 0;
                        iArr7[2] = 0;
                        iArr7[3] = 0;
                        int length = sb.length() - i5;
                        int i20 = i11;
                        int i21 = 0;
                        while (true) {
                            int i22 = 6;
                            iArr = e;
                            if (i21 > length) {
                                break;
                            }
                            int i23 = iArr[sb.charAt(i21)];
                            while (i22 >= 0) {
                                int i24 = ((i23 & 1) * 2) + (i22 & 1);
                                iArr6[i24] = iArr6[i24] + this.b[i20 + i22];
                                iArr7[i24] = iArr7[i24] + 1;
                                i23 >>= 1;
                                i22--;
                                i5 = i5;
                            }
                            i20 += 8;
                            i21++;
                        }
                        float[] fArr = new float[4];
                        float[] fArr2 = new float[4];
                        int i25 = 0;
                        while (i25 < i19) {
                            fArr2[i25] = 0.0f;
                            int i26 = i25 + 2;
                            int i27 = i19;
                            float f2 = iArr6[i25] / iArr7[i25];
                            float f3 = iArr6[i26];
                            float f4 = iArr7[i26];
                            float f5 = ((f3 / f4) + f2) / 2.0f;
                            fArr2[i26] = f5;
                            fArr[i25] = f5;
                            fArr[i26] = ((f3 * 2.0f) + 1.5f) / f4;
                            i25++;
                            i19 = i27;
                        }
                        int i28 = i11;
                        for (int i29 = 0; i29 <= length; i29++) {
                            int i30 = iArr[sb.charAt(i29)];
                            for (int i31 = 6; i31 >= 0; i31--) {
                                int i32 = ((i30 & 1) * 2) + (i31 & 1);
                                float f6 = this.b[i28 + i31];
                                if (f6 < fArr2[i32] || f6 > fArr[i32]) {
                                    throw d55.a();
                                }
                                i30 >>= 1;
                            }
                            i28 += 8;
                        }
                        for (int i33 = 0; i33 < sb.length(); i33++) {
                            sb.setCharAt(i33, cArr[sb.charAt(i33)]);
                        }
                        if (!g(cArr2, sb.charAt(0))) {
                            throw d55.a();
                        }
                        if (!g(cArr2, sb.charAt(sb.length() - 1))) {
                            throw d55.a();
                        }
                        if (sb.length() <= 3) {
                            throw d55.a();
                        }
                        if (map == null || !map.containsKey(pi1.RETURN_CODABAR_START_END)) {
                            sb.deleteCharAt(sb.length() - 1);
                            i3 = 0;
                            sb.deleteCharAt(0);
                        } else {
                            i3 = 0;
                        }
                        int i34 = i3;
                        while (i3 < i11) {
                            i34 += this.b[i3];
                            i3++;
                        }
                        float f7 = i34;
                        while (i11 < i15) {
                            i34 += this.b[i11];
                            i11++;
                        }
                        float f8 = i;
                        uc6 uc6Var = new uc6(sb.toString(), null, new wc6[]{new wc6(f7, f8), new wc6(i34, f8)}, v20.n);
                        uc6Var.b(vc6.y, "]F0");
                        return uc6Var;
                    }
                }
            }
            i11 += 2;
            i5 = i5;
        }
        throw d55.a();
    }

    public final int h(int i) {
        int i2 = i + 7;
        if (i2 >= this.c) {
            return -1;
        }
        int[] iArr = this.b;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = 0;
        for (int i6 = i; i6 < i2; i6 += 2) {
            int i7 = iArr[i6];
            if (i7 < i4) {
                i4 = i7;
            }
            if (i7 > i5) {
                i5 = i7;
            }
        }
        int i8 = (i4 + i5) / 2;
        int i9 = 0;
        for (int i10 = i + 1; i10 < i2; i10 += 2) {
            int i11 = iArr[i10];
            if (i11 < i3) {
                i3 = i11;
            }
            if (i11 > i9) {
                i9 = i11;
            }
        }
        int i12 = (i3 + i9) / 2;
        int i13 = 128;
        int i14 = 0;
        for (int i15 = 0; i15 < 7; i15++) {
            i13 >>= 1;
            if (iArr[i + i15] > ((i15 & 1) == 0 ? i8 : i12)) {
                i14 |= i13;
            }
        }
        for (int i16 = 0; i16 < 20; i16++) {
            if (e[i16] == i14) {
                return i16;
            }
        }
        return -1;
    }
}
