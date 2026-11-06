package o;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class xi1 {
    public static final String[] b = {"CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    public static final String[] c = {"CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    public static final String[] d = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};
    public static final String[] e = {"FLG(n)", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};
    public static final String[] f = {"CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};
    public static final Charset g = StandardCharsets.ISO_8859_1;
    public f10 a;

    public static int b(boolean[] zArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 <<= 1;
            if (zArr[i4]) {
                i3 |= 1;
            }
        }
        return i3;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0176  */
    /* JADX WARN: Code duplicated, block: B:76:0x017e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0180  */
    public final cj1 a(f10 f10Var) throws at2 {
        int i;
        int i2;
        xy2 xy2Var;
        String str;
        int i3;
        int i4;
        int i5;
        char c2;
        boolean z;
        this.a = f10Var;
        k70 k70Var = (k70) f10Var.e;
        boolean z2 = f10Var.b;
        int i6 = f10Var.c;
        int i7 = (i6 * 4) + (z2 ? 11 : 14);
        int[] iArr = new int[i7];
        int i8 = ((i6 * 16) + (z2 ? 88 : 112)) * i6;
        boolean[] zArr = new boolean[i8];
        int i9 = 2;
        int i10 = 1;
        if (z2) {
            for (int i11 = 0; i11 < i7; i11++) {
                iArr[i11] = i11;
            }
        } else {
            int i12 = i7 / 2;
            int i13 = ((((i12 - 1) / 15) * 2) + (i7 + 1)) / 2;
            for (int i14 = 0; i14 < i12; i14++) {
                int i15 = (i14 / 15) + i14;
                iArr[(i12 - i14) - 1] = (i13 - i15) - 1;
                iArr[i12 + i14] = i15 + i13 + 1;
            }
        }
        int i16 = 0;
        int i17 = 0;
        while (true) {
            i = 12;
            i2 = 4;
            if (i16 >= i6) {
                break;
            }
            int i18 = ((i6 - i16) * 4) + (z2 ? 9 : 12);
            int i19 = i16 * 2;
            int i20 = (i7 - 1) - i19;
            int i21 = 0;
            while (i21 < i18) {
                int i22 = i21 * 2;
                int i23 = 0;
                while (i23 < i9) {
                    int i24 = i19 + i23;
                    int i25 = i10;
                    int i26 = i19 + i21;
                    zArr[i17 + i22 + i23] = k70Var.b(iArr[i24], iArr[i26]);
                    int i27 = i20 - i23;
                    zArr[(i18 * 2) + i17 + i22 + i23] = k70Var.b(iArr[i26], iArr[i27]);
                    int i28 = i20 - i21;
                    zArr[(i18 * 4) + i17 + i22 + i23] = k70Var.b(iArr[i27], iArr[i28]);
                    zArr[(i18 * 6) + i17 + i22 + i23] = k70Var.b(iArr[i28], iArr[i24]);
                    i23++;
                    i10 = i25;
                    i6 = i6;
                    i9 = 2;
                }
                i21++;
                i9 = 2;
            }
            i17 += i18 * 8;
            i16++;
            i9 = 2;
        }
        int i29 = i10;
        f10 f10Var2 = this.a;
        int i30 = f10Var2.c;
        int i31 = 6;
        int i32 = 8;
        if (i30 <= 2) {
            xy2Var = xy2.j;
            i = 6;
        } else if (i30 <= 8) {
            xy2Var = xy2.n;
            i = 8;
        } else if (i30 <= 22) {
            xy2Var = xy2.i;
            i = 10;
        } else {
            xy2Var = xy2.h;
        }
        int i33 = f10Var2.a;
        int i34 = i8 / i;
        if (i34 < i33) {
            throw at2.a();
        }
        int i35 = i8 % i;
        int[] iArr2 = new int[i34];
        int i36 = 0;
        while (i36 < i34) {
            iArr2[i36] = b(zArr, i35, i);
            i36++;
            i35 += i;
        }
        try {
            g95 g95Var = new g95(xy2Var);
            int i37 = i34 - i33;
            int iX = g95Var.x(iArr2, i37);
            int i38 = i29 << i;
            int i39 = i38 - 1;
            int i40 = 0;
            int i41 = 0;
            while (i40 < i33) {
                int i42 = iArr2[i40];
                if (i42 == 0 || i42 == i39) {
                    throw at2.a();
                }
                if (i42 == i29 || i42 == i38 - 2) {
                    i41++;
                }
                i40++;
                i29 = 1;
            }
            int i43 = (i33 * i) - i41;
            boolean[] zArr2 = new boolean[i43];
            int i44 = 0;
            int i45 = 0;
            while (i44 < i33) {
                int i46 = iArr2[i44];
                if (i46 != 1) {
                    int i47 = 1;
                    if (i46 == i38 - 2) {
                        int i48 = (i45 + i) - 1;
                        if (i46 > 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        Arrays.fill(zArr2, i45, i48, z);
                        i45 = (i - 1) + i45;
                    } else {
                        int i49 = i - 1;
                        while (i49 >= 0) {
                            int i50 = i45 + 1;
                            zArr2[i45] = (i46 & (i47 << i49)) != 0;
                            i49--;
                            i45 = i50;
                            i47 = 1;
                        }
                    }
                } else {
                    int i410 = (i45 + i) - 1;
                    if (i46 > 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Arrays.fill(zArr2, i45, i410, z);
                    i45 = (i - 1) + i45;
                }
                i44++;
                i2 = i2;
            }
            int i51 = i2;
            int i52 = (i37 * 100) / i34;
            int i53 = (i43 + 7) / 8;
            byte[] bArr = new byte[i53];
            for (int i54 = 0; i54 < i53; i54++) {
                int i55 = i54 * 8;
                int i56 = i43 - i55;
                bArr[i54] = (byte) (i56 >= 8 ? b(zArr2, i55, 8) : b(zArr2, i55, i56) << (8 - i56));
            }
            StringBuilder sb = new StringBuilder((i43 - 5) / 4);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Charset charsetForName = g;
            int i57 = 1;
            int i58 = 0;
            int i59 = 1;
            while (i58 < i43) {
                if (i59 != i31) {
                    int i60 = i59 == i51 ? 4 : 5;
                    if (i43 - i58 < i60) {
                        break;
                    }
                    int iB = b(zArr2, i58, i60);
                    i58 += i60;
                    int iB2 = ua5.B(i59);
                    if (iB2 == 0) {
                        str = b[iB];
                    } else if (iB2 == 1) {
                        str = c[iB];
                    } else if (iB2 == 2) {
                        str = d[iB];
                    } else if (iB2 == 3) {
                        str = f[iB];
                    } else {
                        if (iB2 != 4) {
                            hk0.l("Bad table");
                            return null;
                        }
                        str = e[iB];
                    }
                    if (!"FLG(n)".equals(str)) {
                        i3 = 4;
                        if (str.startsWith("CTRL_")) {
                            char cCharAt = str.charAt(5);
                            if (cCharAt != 'B') {
                                if (cCharAt == 'D') {
                                    i5 = 4;
                                } else if (cCharAt == 'P') {
                                    i4 = 6;
                                    i5 = 5;
                                } else if (cCharAt == 'L') {
                                    i5 = 2;
                                } else if (cCharAt != 'M') {
                                    i4 = 6;
                                    i5 = 1;
                                } else {
                                    i4 = 6;
                                    i5 = 3;
                                }
                                i4 = 6;
                            } else {
                                i4 = 6;
                                i5 = 6;
                            }
                            if (str.charAt(i4) == 'L') {
                                i57 = i5;
                                i59 = i57;
                            } else {
                                i57 = i59;
                                i59 = i5;
                            }
                        } else {
                            i4 = 6;
                            byte[] bytes = str.getBytes(StandardCharsets.US_ASCII);
                            byteArrayOutputStream.write(bytes, 0, bytes.length);
                        }
                        i31 = i4;
                        i51 = i3;
                        i32 = 8;
                    } else {
                        if (i43 - i58 < 3) {
                            break;
                        }
                        int iB3 = b(zArr2, i58, 3);
                        i58 += 3;
                        try {
                            sb.append(byteArrayOutputStream.toString(charsetForName.name()));
                            byteArrayOutputStream.reset();
                            if (iB3 == 0) {
                                c2 = 11;
                                i3 = 4;
                                sb.append((char) 29);
                            } else {
                                if (iB3 == 7) {
                                    throw at2.a();
                                }
                                if (i43 - i58 < iB3 * 4) {
                                    c2 = 11;
                                    i3 = 4;
                                } else {
                                    int i61 = 0;
                                    while (true) {
                                        int i62 = iB3 - 1;
                                        if (iB3 <= 0) {
                                            c2 = 11;
                                            i3 = 4;
                                            un0 un0VarA = un0.a(i61);
                                            if (un0VarA == null) {
                                                throw at2.a();
                                            }
                                            charsetForName = Charset.forName(un0VarA.name());
                                            break;
                                        }
                                        int iB4 = b(zArr2, i58, 4);
                                        i58 += 4;
                                        if (iB4 < 2 || iB4 > 11) {
                                            throw at2.a();
                                        }
                                        i61 = (i61 * 10) + (iB4 - 2);
                                        iB3 = i62;
                                    }
                                }
                            }
                            i4 = 6;
                        } catch (UnsupportedEncodingException e2) {
                            throw new IllegalStateException(e2);
                        }
                    }
                    i59 = i57;
                    i31 = i4;
                    i51 = i3;
                    i32 = 8;
                } else {
                    if (i43 - i58 < 5) {
                        break;
                    }
                    int iB5 = b(zArr2, i58, 5);
                    int i63 = i58 + 5;
                    if (iB5 == 0) {
                        if (i43 - i63 < 11) {
                            break;
                        }
                        iB5 = b(zArr2, i63, 11) + 31;
                        i63 = i58 + 16;
                    }
                    int i64 = 0;
                    while (true) {
                        if (i64 >= iB5) {
                            i58 = i63;
                            break;
                        }
                        if (i43 - i63 < i32) {
                            i58 = i43;
                            break;
                        }
                        byteArrayOutputStream.write((byte) b(zArr2, i63, i32));
                        i63 += 8;
                        i64++;
                    }
                    i59 = i57;
                }
            }
            try {
                sb.append(byteArrayOutputStream.toString(charsetForName.name()));
                cj1 cj1Var = new cj1(bArr, sb.toString(), String.format("%d%%", Integer.valueOf(i52)));
                cj1Var.e = Integer.valueOf(iX);
                return cj1Var;
            } catch (UnsupportedEncodingException e3) {
                throw new IllegalStateException(e3);
            }
        } catch (f76 e4) {
            at2 at2Var = at2.f359o;
            if (p36.m) {
                throw new at2(e4);
            }
            throw at2.f359o;
        }
    }
}
