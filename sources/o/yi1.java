package o;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class yi1 {
    public final g95 a;

    public yi1(byte b) {
        switch (b) {
            case 1:
                this.a = new g95(xy2.f2562o);
                break;
            case 2:
                this.a = new g95(xy2.l);
                break;
            default:
                this.a = new g95(xy2.m);
                break;
        }
    }

    public int a(byte[] bArr, int i, int i2, int i3, int i4) throws lq0 {
        int i5 = i2 + i3;
        int i6 = i4 == 0 ? 1 : 2;
        int[] iArr = new int[i5 / i6];
        for (int i7 = 0; i7 < i5; i7++) {
            if (i4 == 0 || i7 % 2 == i4 - 1) {
                iArr[i7 / i6] = bArr[i7 + i] & 255;
            }
        }
        try {
            int iX = this.a.x(iArr, i3 / i6);
            for (int i8 = 0; i8 < i2; i8++) {
                if (i4 == 0 || i8 % 2 == i4 - 1) {
                    bArr[i8 + i] = (byte) iArr[i8 / i6];
                }
            }
            return iX;
        } catch (f76 unused) {
            throw lq0.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:215:0x0393 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:216:0x0395  */
    /* JADX WARN: Code duplicated, block: B:217:0x0397 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:218:0x0399  */
    /* JADX WARN: Code duplicated, block: B:219:0x039c  */
    /* JADX WARN: Code duplicated, block: B:220:0x039e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:221:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:222:0x03a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:223:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:224:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:227:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:229:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:231:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:233:0x03be  */
    /* JADX WARN: Code duplicated, block: B:235:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:237:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:239:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:240:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:241:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:242:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:245:0x03dd A[LOOP:21: B:252:0x022a->B:245:0x03dd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:293:0x0391 A[SYNTHETIC] */
    public cj1 b(io.sentry.z7 z7Var, Map map) throws at2, lq0 {
        int iC;
        bs4 bs4Var;
        int i;
        int i2;
        un0 un0Var;
        int i3;
        ArrayList arrayList;
        String str;
        int iC2;
        xc8 xc8VarI = z7Var.i();
        int i4 = z7Var.g().a;
        bt2 bt2VarG = z7Var.g();
        xc8 xc8VarI2 = z7Var.i();
        int i5 = ua5.E(8)[bt2VarG.b];
        k70 k70Var = (k70) z7Var.b;
        int i6 = k70Var.n;
        int i7 = 0;
        for (int i8 = 0; i8 < i6; i8++) {
            for (int i9 = 0; i9 < i6; i9++) {
                if (e41.a(i5, i8, i9)) {
                    k70Var.a(i9, i8);
                }
            }
        }
        int i10 = xc8VarI2.a * 4;
        int i11 = i10 + 17;
        int i12 = xc8VarI2.d;
        k70 k70Var2 = new k70(i11, i11);
        k70Var2.j(0, 0, 9, 9);
        int i13 = i10 + 9;
        k70Var2.j(i13, 0, 8, 9);
        k70Var2.j(0, i13, 9, 8);
        int[] iArr = xc8VarI2.b;
        int length = iArr.length;
        int i14 = 0;
        while (i14 < length) {
            int i15 = iArr[i14] - 2;
            for (int i16 = i7; i16 < length; i16++) {
                if ((i14 != 0 || (i16 != 0 && i16 != length - 1)) && (i14 != length - 1 || i16 != 0)) {
                    k70Var2.j(iArr[i16] - 2, i15, 5, 5);
                }
            }
            i14++;
            i7 = 0;
        }
        int i17 = 2;
        int i18 = 6;
        int i19 = 1;
        k70Var2.j(6, 9, 1, i10);
        k70Var2.j(9, 6, i10, 1);
        if (xc8VarI2.a > 6) {
            int i20 = i10 + 6;
            k70Var2.j(i20, 0, 3, 6);
            k70Var2.j(0, i20, 6, 3);
        }
        byte[] bArr = new byte[i12];
        int i21 = i6 - 1;
        int i22 = i21;
        boolean z = true;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        while (i22 > 0) {
            if (i22 == i18) {
                i22--;
            }
            int i26 = 0;
            while (i26 < i6) {
                int i27 = z ? i21 - i26 : i26;
                int i28 = i19;
                int i29 = 0;
                for (int i30 = i17; i29 < i30; i30 = 2) {
                    int i31 = i22 - i29;
                    if (!k70Var2.b(i31, i27)) {
                        i24++;
                        i25 <<= 1;
                        if (k70Var.b(i31, i27)) {
                            i25 |= 1;
                        }
                        if (i24 == 8) {
                            bArr[i23] = (byte) i25;
                            i23++;
                            i24 = 0;
                            i25 = 0;
                        }
                    }
                    i29++;
                }
                i26++;
                i19 = i28;
                i17 = 2;
            }
            z = !z;
            i22 -= 2;
            i18 = 6;
            i17 = 2;
        }
        int i32 = i19;
        if (i23 != i12) {
            throw at2.a();
        }
        int i33 = xc8VarI.d;
        byte b = xc8VarI.a;
        if (i12 != i33) {
            yq4.f();
            return null;
        }
        ls8 ls8Var = xc8VarI.c[ua5.B(i4)];
        uc8[] uc8VarArr = (uc8[]) ls8Var.b;
        byte b2 = ls8Var.a;
        int i34 = 0;
        for (uc8 uc8Var : uc8VarArr) {
            i34 += uc8Var.a;
        }
        ls8[] ls8VarArr = new ls8[i34];
        int i35 = 0;
        for (uc8 uc8Var2 : uc8VarArr) {
            int i36 = 0;
            while (i36 < uc8Var2.a) {
                byte b3 = uc8Var2.b;
                ls8VarArr[i35] = new ls8(b3, new byte[b2 + b3]);
                i36++;
                i35++;
            }
        }
        int length2 = ((byte[]) ls8VarArr[0].b).length;
        int i37 = i34 - 1;
        while (i37 >= 0 && ((byte[]) ls8VarArr[i37].b).length != length2) {
            i37--;
        }
        int i38 = i37 + 1;
        int i39 = length2 - b2;
        int i40 = 0;
        for (int i41 = 0; i41 < i39; i41++) {
            int i42 = 0;
            while (i42 < i35) {
                ((byte[]) ls8VarArr[i42].b)[i41] = bArr[i40];
                i42++;
                i40++;
            }
        }
        int i43 = i38;
        while (i43 < i35) {
            ((byte[]) ls8VarArr[i43].b)[i39] = bArr[i40];
            i43++;
            i40++;
        }
        int length3 = ((byte[]) ls8VarArr[0].b).length;
        while (i39 < length3) {
            int i44 = i40;
            int i45 = 0;
            while (i45 < i35) {
                ((byte[]) ls8VarArr[i45].b)[i45 < i38 ? i39 : i39 + 1] = bArr[i44];
                i45++;
                i44++;
            }
            i39++;
            i40 = i44;
        }
        int i46 = 0;
        for (int i47 = 0; i47 < i34; i47++) {
            i46 += ls8VarArr[i47].a;
        }
        byte[] bArr2 = new byte[i46];
        int i48 = 0;
        int i49 = 0;
        for (int i50 = 0; i50 < i34; i50++) {
            ls8 ls8Var2 = ls8VarArr[i50];
            byte[] bArr3 = (byte[]) ls8Var2.b;
            byte b4 = ls8Var2.a;
            int length4 = bArr3.length;
            int[] iArr2 = new int[length4];
            for (int i51 = 0; i51 < length4; i51++) {
                iArr2[i51] = bArr3[i51] & 255;
            }
            try {
                int iX = this.a.x(iArr2, bArr3.length - b4);
                for (int i52 = 0; i52 < b4; i52++) {
                    bArr3[i52] = (byte) iArr2[i52];
                }
                i48 += iX;
                int i53 = 0;
                while (i53 < b4) {
                    bArr2[i49] = bArr3[i53];
                    i53++;
                    i49++;
                }
            } catch (f76 unused) {
                throw lq0.a();
            }
        }
        l70 l70Var = new l70(bArr2, (byte) 0);
        StringBuilder sb = new StringBuilder(50);
        ArrayList arrayList2 = new ArrayList(i32);
        int i54 = -1;
        int iC3 = -1;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        un0 un0Var2 = null;
        while (true) {
            try {
                int iA = l70Var.a();
                bs4 bs4Var2 = bs4.n;
                if (iA < 4 || (iC = l70Var.c(4)) == 0) {
                    bs4Var = bs4Var2;
                } else if (iC == 1) {
                    bs4Var = bs4.f450o;
                } else if (iC == 2) {
                    bs4Var = bs4.p;
                } else if (iC == 3) {
                    bs4Var = bs4.q;
                } else if (iC == 4) {
                    bs4Var = bs4.r;
                } else if (iC == 5) {
                    bs4Var = bs4.u;
                } else if (iC == 7) {
                    bs4Var = bs4.s;
                } else if (iC == 8) {
                    bs4Var = bs4.t;
                } else if (iC == 9) {
                    bs4Var = bs4.v;
                } else {
                    if (iC != 13) {
                        throw new IllegalArgumentException();
                    }
                    bs4Var = bs4.w;
                }
                int[] iArr3 = bs4Var.m;
                int i55 = i48;
                int iOrdinal = bs4Var.ordinal();
                if (iOrdinal != 0) {
                    i = i54;
                    if (iOrdinal == 3) {
                        bs4Var = bs4Var;
                        i2 = 6;
                        if (l70Var.a() < 16) {
                            throw at2.a();
                        }
                        int iC4 = l70Var.c(8);
                        iC3 = l70Var.c(8);
                        un0 un0Var3 = un0Var2;
                        i = iC4;
                        un0Var = un0Var3;
                    } else if (iOrdinal == 5) {
                        i2 = 6;
                        int iC5 = l70Var.c(8);
                        if ((iC5 & 128) == 0) {
                            iC2 = iC5 & 127;
                        } else if ((iC5 & 192) == 128) {
                            iC2 = ((iC5 & 63) << 8) | l70Var.c(8);
                        } else {
                            if ((iC5 & 224) != 192) {
                                throw at2.a();
                            }
                            iC2 = ((iC5 & 31) << 16) | l70Var.c(16);
                        }
                        un0 un0VarA = un0.a(iC2);
                        if (un0VarA == null) {
                            throw at2.a();
                        }
                        un0Var = un0VarA;
                    } else if (iOrdinal == 7) {
                        i2 = 6;
                        un0Var = un0Var2;
                        z2 = true;
                        z3 = true;
                    } else if (iOrdinal == 8) {
                        bs4Var = bs4Var;
                        i2 = 6;
                        un0Var = un0Var2;
                        i = i;
                        z2 = true;
                        z4 = true;
                    } else if (iOrdinal != 9) {
                        int iC6 = l70Var.c(iArr3[b <= 9 ? (char) 0 : b <= 26 ? (char) 1 : (char) 2]);
                        int iOrdinal2 = bs4Var.ordinal();
                        if (iOrdinal2 == 1) {
                            bs4Var = bs4Var;
                            i2 = 6;
                            im3.z(l70Var, sb, iC6);
                        } else if (iOrdinal2 == 2) {
                            bs4Var = bs4Var;
                            i2 = 6;
                            im3.v(l70Var, sb, iC6, z2);
                        } else if (iOrdinal2 == 4) {
                            bs4Var = bs4Var;
                            i2 = 6;
                            im3.w(l70Var, sb, iC6, un0Var2, arrayList2, map);
                        } else {
                            if (iOrdinal2 != 6) {
                                throw at2.a();
                            }
                            im3.y(l70Var, sb, iC6);
                            bs4Var = bs4Var;
                            i2 = 6;
                        }
                    } else {
                        bs4Var = bs4Var;
                        i2 = 6;
                        int iC7 = l70Var.c(4);
                        int iC8 = l70Var.c(iArr3[b <= 9 ? (char) 0 : b <= 26 ? (char) 1 : (char) 2]);
                        if (iC7 == 1) {
                            im3.x(l70Var, sb, iC8);
                        }
                    }
                    if (bs4Var == bs4Var2) {
                        if (un0Var != null) {
                            if (z3) {
                                i3 = 4;
                            } else if (z4) {
                                i3 = i2;
                            } else {
                                i3 = 2;
                            }
                        } else if (z3) {
                            i3 = 3;
                        } else if (z4) {
                            i3 = 5;
                        } else {
                            i3 = 1;
                        }
                        String string = sb.toString();
                        if (arrayList2.isEmpty()) {
                            arrayList = null;
                        } else {
                            arrayList = arrayList2;
                        }
                        if (i4 != 1) {
                            str = "L";
                        } else if (i4 != 2) {
                            str = "M";
                        } else if (i4 != 3) {
                            str = "Q";
                        } else {
                            if (i4 == 4) {
                                throw null;
                            }
                            str = "H";
                        }
                        cj1 cj1Var = new cj1(bArr2, string, arrayList, str, i, iC3, i3);
                        cj1Var.e = Integer.valueOf(i55);
                        return cj1Var;
                    }
                    int i56 = i;
                    un0Var2 = un0Var;
                    i54 = i56;
                    i48 = i55;
                } else {
                    i = i54;
                    bs4Var = bs4Var;
                    i2 = 6;
                }
                un0Var = un0Var2;
                i = i;
                if (bs4Var == bs4Var2) {
                    if (un0Var != null) {
                        if (z3) {
                            i3 = 4;
                        } else if (z4) {
                            i3 = i2;
                        } else {
                            i3 = 2;
                        }
                    } else if (z3) {
                        i3 = 3;
                    } else if (z4) {
                        i3 = 5;
                    } else {
                        i3 = 1;
                    }
                    String string2 = sb.toString();
                    if (arrayList2.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = arrayList2;
                    }
                    if (i4 != 1) {
                        str = "L";
                    } else if (i4 != 2) {
                        str = "M";
                    } else if (i4 != 3) {
                        str = "Q";
                    } else {
                        if (i4 == 4) {
                            throw null;
                        }
                        str = "H";
                    }
                    cj1 cj1Var2 = new cj1(bArr2, string2, arrayList, str, i, iC3, i3);
                    cj1Var2.e = Integer.valueOf(i55);
                    return cj1Var2;
                }
                int i57 = i;
                un0Var2 = un0Var;
                i54 = i57;
                i48 = i55;
            } catch (IllegalArgumentException unused2) {
                throw at2.a();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:241:0x040c A[LOOP:15: B:203:0x036e->B:241:0x040c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:270:0x048d  */
    /* JADX WARN: Code duplicated, block: B:272:0x0494  */
    /* JADX WARN: Code duplicated, block: B:274:0x049c A[LOOP:16: B:271:0x0492->B:274:0x049c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:529:0x04ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:530:0x04b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:549:0x040a A[SYNTHETIC] */
    public cj1 c(k70 k70Var) throws at2, lq0 {
        byte[] bArr;
        byte[] bArr2;
        int i;
        int iC;
        char c;
        char c2;
        int iC2;
        int i2;
        int iC3;
        int i3;
        int i4;
        byte[] bArr3;
        int i5;
        int i6;
        byte[] bArr4;
        int i7;
        iu iuVar = new iu(k70Var);
        wc8 wc8Var = (wc8) iuVar.n;
        k70 k70Var2 = (k70) iuVar.p;
        int i8 = wc8Var.g;
        byte[] bArr5 = new byte[i8];
        k70 k70Var3 = (k70) iuVar.f1103o;
        int i9 = k70Var3.n;
        int i10 = k70Var3.m;
        int i11 = 0;
        int i12 = 0;
        boolean z = false;
        int i13 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i14 = 4;
        while (true) {
            if (i14 == i9 && i12 == 0 && !z) {
                int i15 = i13 + 1;
                int i16 = i9 - 1;
                int i17 = (iuVar.L(i16, i11, i9, i10) ? 1 : 0) << 1;
                if (iuVar.L(i16, 1, i9, i10)) {
                    i17 |= 1;
                }
                int i18 = i17 << 1;
                if (iuVar.L(i16, 2, i9, i10)) {
                    i18 |= 1;
                }
                int i19 = i18 << 1;
                bArr = bArr5;
                if (iuVar.L(0, i10 - 2, i9, i10)) {
                    i19 |= 1;
                }
                int i20 = i19 << 1;
                int i21 = i10 - 1;
                if (iuVar.L(0, i21, i9, i10)) {
                    i20 |= 1;
                }
                int i22 = i20 << 1;
                if (iuVar.L(1, i21, i9, i10)) {
                    i22 |= 1;
                }
                int i23 = i22 << 1;
                if (iuVar.L(2, i21, i9, i10)) {
                    i23 |= 1;
                }
                int i24 = i23 << 1;
                if (iuVar.L(3, i21, i9, i10)) {
                    i24 |= 1;
                }
                bArr[i13] = (byte) i24;
                i14 -= 2;
                i12 += 2;
                i13 = i15;
                z = true;
            } else {
                bArr = bArr5;
                int i25 = i9 - 2;
                if (i14 == i25 && i12 == 0 && (i10 & 3) != 0 && !z2) {
                    int i26 = i13 + 1;
                    int i27 = (iuVar.L(i9 + (-3), 0, i9, i10) ? 1 : 0) << 1;
                    if (iuVar.L(i25, 0, i9, i10)) {
                        i27 |= 1;
                    }
                    int i28 = i27 << 1;
                    if (iuVar.L(i9 - 1, 0, i9, i10)) {
                        i28 |= 1;
                    }
                    int i29 = i28 << 1;
                    if (iuVar.L(0, i10 - 4, i9, i10)) {
                        i29 |= 1;
                    }
                    int i30 = i29 << 1;
                    if (iuVar.L(0, i10 - 3, i9, i10)) {
                        i30 |= 1;
                    }
                    int i31 = i30 << 1;
                    if (iuVar.L(0, i10 - 2, i9, i10)) {
                        i31 |= 1;
                    }
                    int i32 = i31 << 1;
                    int i33 = i10 - 1;
                    if (iuVar.L(0, i33, i9, i10)) {
                        i32 |= 1;
                    }
                    int i34 = i32 << 1;
                    if (iuVar.L(1, i33, i9, i10)) {
                        i34 |= 1;
                    }
                    bArr[i13] = (byte) i34;
                    i14 -= 2;
                    i12 += 2;
                    i13 = i26;
                    z2 = true;
                } else if (i14 == i9 + 4 && i12 == 2 && (i10 & 7) == 0 && !z3) {
                    int i35 = i13 + 1;
                    int i36 = i9 - 1;
                    int i37 = (iuVar.L(i36, 0, i9, i10) ? 1 : 0) << 1;
                    int i38 = i10 - 1;
                    if (iuVar.L(i36, i38, i9, i10)) {
                        i37 |= 1;
                    }
                    int i39 = i37 << 1;
                    int i40 = i10 - 3;
                    if (iuVar.L(0, i40, i9, i10)) {
                        i39 |= 1;
                    }
                    int i41 = i39 << 1;
                    int i42 = i10 - 2;
                    if (iuVar.L(0, i42, i9, i10)) {
                        i41 |= 1;
                    }
                    int i43 = i41 << 1;
                    if (iuVar.L(0, i38, i9, i10)) {
                        i43 |= 1;
                    }
                    int i44 = i43 << 1;
                    int i45 = (iuVar.L(1, i40, i9, i10) ? i44 | 1 : i44) << 1;
                    if (iuVar.L(1, i42, i9, i10)) {
                        i45 |= 1;
                    }
                    int i46 = i45 << 1;
                    if (iuVar.L(1, i38, i9, i10)) {
                        i46 |= 1;
                    }
                    bArr[i13] = (byte) i46;
                    i14 -= 2;
                    i12 += 2;
                    i13 = i35;
                    z3 = true;
                } else if (i14 == i25 && i12 == 0 && (i10 & 7) == 4 && !z4) {
                    int i47 = i13 + 1;
                    int i48 = (iuVar.L(i9 + (-3), 0, i9, i10) ? 1 : 0) << 1;
                    if (iuVar.L(i25, 0, i9, i10)) {
                        i48 |= 1;
                    }
                    int i49 = i48 << 1;
                    if (iuVar.L(i9 - 1, 0, i9, i10)) {
                        i49 |= 1;
                    }
                    int i50 = i49 << 1;
                    if (iuVar.L(0, i10 - 2, i9, i10)) {
                        i50 |= 1;
                    }
                    int i51 = i50 << 1;
                    int i52 = i10 - 1;
                    if (iuVar.L(0, i52, i9, i10)) {
                        i51 |= 1;
                    }
                    int i53 = i51 << 1;
                    if (iuVar.L(1, i52, i9, i10)) {
                        i53 |= 1;
                    }
                    int i54 = i53 << 1;
                    if (iuVar.L(2, i52, i9, i10)) {
                        i54 |= 1;
                    }
                    int i55 = i54 << 1;
                    if (iuVar.L(3, i52, i9, i10)) {
                        i55 |= 1;
                    }
                    bArr[i13] = (byte) i55;
                    i14 -= 2;
                    i12 += 2;
                    i13 = i47;
                    z4 = true;
                } else {
                    while (true) {
                        if (i14 < i9 && i12 >= 0 && !k70Var2.b(i12, i14)) {
                            bArr[i13] = (byte) iuVar.M(i14, i12, i9, i10);
                            i13++;
                        }
                        int i56 = i14 - 2;
                        int i57 = i12 + 2;
                        if (i56 < 0 || i57 >= i10) {
                            break;
                        }
                        i14 = i56;
                        i12 = i57;
                    }
                    int i58 = i14 - 1;
                    int i59 = i12 + 5;
                    while (true) {
                        if (i58 >= 0 && i59 < i10 && !k70Var2.b(i59, i58)) {
                            bArr[i13] = (byte) iuVar.M(i58, i59, i9, i10);
                            i13++;
                        }
                        int i60 = i58 + 2;
                        int i61 = i59 - 2;
                        if (i60 >= i9 || i61 < 0) {
                            break;
                        }
                        i58 = i60;
                        i59 = i61;
                    }
                    i14 = i58 + 5;
                    i12 = i59 - 1;
                }
            }
            if (i14 >= i9 && i12 >= i10) {
                break;
            }
            i11 = 0;
            bArr5 = bArr;
        }
        if (i13 != i8) {
            throw at2.a();
        }
        ls8 ls8Var = wc8Var.f;
        vc8[] vc8VarArr = (vc8[]) ls8Var.b;
        byte b = ls8Var.a;
        int i62 = 0;
        for (vc8 vc8Var : vc8VarArr) {
            i62 += vc8Var.a;
        }
        rg1[] rg1VarArr = new rg1[i62];
        int i63 = 0;
        for (vc8 vc8Var2 : vc8VarArr) {
            int i64 = 0;
            while (i64 < vc8Var2.a) {
                short s = vc8Var2.b;
                rg1VarArr[i63] = new rg1(new byte[b + s], s);
                i64++;
                i63++;
            }
        }
        int length = rg1VarArr[0].b.length - b;
        int i65 = length - 1;
        int i66 = 0;
        for (int i67 = 0; i67 < i65; i67++) {
            int i68 = 0;
            while (i68 < i63) {
                rg1VarArr[i68].b[i67] = bArr[i66];
                i68++;
                i66++;
            }
        }
        boolean z5 = wc8Var.a == 24;
        int i69 = 8;
        int i70 = z5 ? 8 : i63;
        int i71 = 0;
        while (i71 < i70) {
            rg1VarArr[i71].b[i65] = bArr[i66];
            i71++;
            i66++;
        }
        int length2 = rg1VarArr[0].b.length;
        while (length < length2) {
            int i72 = 0;
            while (i72 < i63) {
                int i73 = z5 ? (i72 + 8) % i63 : i72;
                rg1VarArr[i73].b[(!z5 || i73 <= 7) ? length : length - 1] = bArr[i66];
                i72++;
                i66++;
            }
            length++;
        }
        if (i66 != i8) {
            yq4.f();
            return null;
        }
        int i74 = 0;
        for (int i75 = 0; i75 < i62; i75++) {
            i74 += rg1VarArr[i75].a;
        }
        byte[] bArr6 = new byte[i74];
        int i76 = 0;
        for (int i77 = 0; i77 < i62; i77++) {
            rg1 rg1Var = rg1VarArr[i77];
            byte[] bArr7 = rg1Var.b;
            short s2 = rg1Var.a;
            int length3 = bArr7.length;
            int[] iArr = new int[length3];
            for (int i78 = 0; i78 < length3; i78++) {
                iArr[i78] = bArr7[i78] & 255;
            }
            try {
                int iX = this.a.x(iArr, bArr7.length - s2);
                for (int i79 = 0; i79 < s2; i79++) {
                    bArr7[i79] = (byte) iArr[i79];
                }
                i76 += iX;
                for (int i80 = 0; i80 < s2; i80++) {
                    bArr6[(i80 * i62) + i77] = bArr7[i80];
                }
            } catch (f76 unused) {
                throw lq0.a();
            }
        }
        l70 l70Var = new l70(bArr6, (byte) 0);
        iu iuVar2 = new iu(100);
        StringBuilder sb = new StringBuilder(0);
        ArrayList arrayList = new ArrayList(1);
        HashSet hashSet = new HashSet();
        int i81 = 2;
        boolean z6 = false;
        while (true) {
            int i82 = 254;
            if (i81 == 2) {
                boolean z7 = false;
                while (true) {
                    int iC4 = l70Var.c(i69);
                    if (iC4 == 0) {
                        throw at2.a();
                    }
                    if (iC4 <= 128) {
                        if (z7) {
                            iC4 += 128;
                        }
                        iuVar2.d((char) (iC4 - 1));
                        i81 = 2;
                    } else if (iC4 == 129) {
                        i81 = 1;
                    } else {
                        if (iC4 > 229) {
                            switch (iC4) {
                                case 230:
                                    i81 = 3;
                                    break;
                                case 231:
                                    i81 = 7;
                                    break;
                                case 232:
                                    hashSet.add(Integer.valueOf(iuVar2.toString().length()));
                                    iuVar2.d((char) 29);
                                    z7 = z7;
                                    if (l70Var.a() <= 0) {
                                        i81 = 2;
                                    } else {
                                        i82 = 254;
                                        i69 = 8;
                                    }
                                    break;
                                case 233:
                                case 234:
                                    break;
                                case 235:
                                    z7 = true;
                                    if (l70Var.a() <= 0) {
                                        i81 = 2;
                                    } else {
                                        i82 = 254;
                                        i69 = 8;
                                    }
                                    break;
                                case 236:
                                    ((StringBuilder) iuVar2.f1103o).append("[)>\u001e05\u001d");
                                    sb.insert(0, "\u001e\u0004");
                                    z7 = z7;
                                    if (l70Var.a() <= 0) {
                                        i81 = 2;
                                    } else {
                                        i82 = 254;
                                        i69 = 8;
                                    }
                                    break;
                                case 237:
                                    ((StringBuilder) iuVar2.f1103o).append("[)>\u001e06\u001d");
                                    sb.insert(0, "\u001e\u0004");
                                    z7 = z7;
                                    if (l70Var.a() <= 0) {
                                        i81 = 2;
                                    } else {
                                        i82 = 254;
                                        i69 = 8;
                                    }
                                    break;
                                case 238:
                                    i81 = 5;
                                    break;
                                case 239:
                                    i81 = 4;
                                    break;
                                case 240:
                                    i81 = 6;
                                    break;
                                case 241:
                                    i81 = 8;
                                    break;
                                default:
                                    if (iC4 != i82 || l70Var.a() != 0) {
                                        throw at2.a();
                                    }
                                    break;
                            }
                        } else {
                            int i83 = iC4 - 130;
                            if (i83 < 10) {
                                iuVar2.d('0');
                            }
                            ((StringBuilder) iuVar2.f1103o).append(String.valueOf(i83));
                        }
                        z7 = z7;
                        if (l70Var.a() <= 0) {
                            i81 = 2;
                        } else {
                            i82 = 254;
                            i69 = 8;
                        }
                    }
                }
                bArr2 = bArr6;
                i76 = i76;
                i = 6;
            } else {
                switch (ua5.B(i81)) {
                    case 2:
                        bArr2 = bArr6;
                        i76 = i76;
                        i = 6;
                        int[] iArr2 = new int[3];
                        boolean z8 = false;
                        int i84 = 0;
                        while (l70Var.a() != 8 && (iC = l70Var.c(8)) != 254) {
                            vn4.k0(iC, l70Var.c(8), iArr2);
                            for (int i85 = 0; i85 < 3; i85++) {
                                int i86 = iArr2[i85];
                                if (i84 != 0) {
                                    if (i84 != 1) {
                                        if (i84 == 2) {
                                            char[] cArr = vn4.q;
                                            if (i86 < 27) {
                                                char c3 = cArr[i86];
                                                if (z8) {
                                                    iuVar2.d((char) (c3 + 128));
                                                    z8 = false;
                                                } else {
                                                    iuVar2.d(c3);
                                                }
                                                c = 30;
                                            } else if (i86 != 27) {
                                                c = 30;
                                                if (i86 != 30) {
                                                    throw at2.a();
                                                }
                                                z8 = true;
                                            } else {
                                                c = 30;
                                                hashSet.add(Integer.valueOf(iuVar2.toString().length()));
                                                c2 = 29;
                                                iuVar2.d((char) 29);
                                            }
                                            c2 = 29;
                                        } else {
                                            if (i84 != 3) {
                                                throw at2.a();
                                            }
                                            if (z8) {
                                                iuVar2.d((char) (i86 + 224));
                                                z8 = false;
                                            } else {
                                                iuVar2.d((char) (i86 + 96));
                                            }
                                            i84 = 0;
                                        }
                                    } else if (z8) {
                                        iuVar2.d((char) (i86 + 128));
                                        z8 = false;
                                    } else {
                                        iuVar2.d((char) i86);
                                    }
                                    i84 = 0;
                                } else if (i86 < 3) {
                                    i84 = i86 + 1;
                                } else {
                                    char[] cArr2 = vn4.p;
                                    if (i86 >= 40) {
                                        throw at2.a();
                                    }
                                    char c4 = cArr2[i86];
                                    if (z8) {
                                        iuVar2.d((char) (c4 + 128));
                                        z8 = false;
                                    } else {
                                        iuVar2.d(c4);
                                    }
                                }
                            }
                            if (l70Var.a() <= 0) {
                                i81 = 2;
                                break;
                            }
                        }
                        i81 = 2;
                        break;
                    case 3:
                        bArr2 = bArr6;
                        i = 6;
                        int[] iArr3 = new int[3];
                        boolean z9 = false;
                        int i87 = 0;
                        while (true) {
                            if (l70Var.a() == 8 || (iC2 = l70Var.c(8)) == 254) {
                                i76 = i76;
                            } else {
                                i76 = i76;
                                vn4.k0(iC2, l70Var.c(8), iArr3);
                                int i88 = 0;
                                while (i88 < 3) {
                                    int i89 = iArr3[i88];
                                    if (i87 != 0) {
                                        if (i87 == 1) {
                                            if (z9) {
                                                iuVar2.d((char) (i89 + 128));
                                                z9 = false;
                                            } else {
                                                iuVar2.d((char) i89);
                                            }
                                            i2 = i88;
                                            i87 = 0;
                                        } else if (i87 == 2) {
                                            char[] cArr3 = vn4.s;
                                            if (i89 < 27) {
                                                char c5 = cArr3[i89];
                                                if (z9) {
                                                    iuVar2.d((char) (c5 + 128));
                                                    z9 = false;
                                                } else {
                                                    iuVar2.d(c5);
                                                }
                                            } else if (i89 == 27) {
                                                hashSet.add(Integer.valueOf(iuVar2.toString().length()));
                                                iuVar2.d((char) 29);
                                            } else {
                                                if (i89 != 30) {
                                                    throw at2.a();
                                                }
                                                z9 = true;
                                            }
                                            i2 = i88;
                                            i87 = 0;
                                        } else {
                                            if (i87 != 3) {
                                                throw at2.a();
                                            }
                                            char[] cArr4 = vn4.t;
                                            if (i89 >= 32) {
                                                throw at2.a();
                                            }
                                            char c6 = cArr4[i89];
                                            if (z9) {
                                                iuVar2.d((char) (c6 + 128));
                                                z9 = false;
                                            } else {
                                                iuVar2.d(c6);
                                            }
                                            i2 = i88;
                                            i87 = 0;
                                        }
                                    } else if (i89 < 3) {
                                        i2 = i88;
                                        i87 = i89 + 1;
                                    } else {
                                        char[] cArr5 = vn4.r;
                                        i2 = i88;
                                        if (i89 >= 40) {
                                            throw at2.a();
                                        }
                                        char c7 = cArr5[i89];
                                        if (z9) {
                                            iuVar2.d((char) (c7 + 128));
                                            z9 = false;
                                        } else {
                                            iuVar2.d(c7);
                                        }
                                    }
                                    i88 = i2 + 1;
                                }
                                if (l70Var.a() > 0) {
                                    i76 = i76;
                                }
                            }
                        }
                        i81 = 2;
                        break;
                    case 4:
                        bArr2 = bArr6;
                        int i90 = 3;
                        int[] iArr4 = new int[3];
                        while (l70Var.a() != 8 && (iC3 = l70Var.c(8)) != 254) {
                            vn4.k0(iC3, l70Var.c(8), iArr4);
                            int i91 = 0;
                            while (i91 < i90) {
                                int i92 = iArr4[i91];
                                if (i92 == 0) {
                                    iuVar2.d('\r');
                                } else if (i92 == 1) {
                                    iuVar2.d('*');
                                } else if (i92 == 2) {
                                    iuVar2.d('>');
                                } else if (i92 == i90) {
                                    iuVar2.d(' ');
                                } else if (i92 < 14) {
                                    iuVar2.d((char) (i92 + 44));
                                } else {
                                    if (i92 >= 40) {
                                        throw at2.a();
                                    }
                                    iuVar2.d((char) (i92 + 51));
                                }
                                i91++;
                                i90 = 3;
                            }
                            if (l70Var.a() <= 0) {
                                i = 6;
                                i81 = 2;
                            } else {
                                i90 = 3;
                            }
                            break;
                        }
                        i = 6;
                        i81 = 2;
                        break;
                    case 5:
                        bArr2 = bArr6;
                        do {
                            if (l70Var.a() <= 16) {
                                i3 = 6;
                            } else {
                                int i93 = 0;
                                while (true) {
                                    if (i93 < 4) {
                                        i3 = 6;
                                        int iC5 = l70Var.c(6);
                                        if (iC5 == 31) {
                                            int i94 = 8 - l70Var.c;
                                            if (i94 != 8) {
                                                l70Var.c(i94);
                                            }
                                        } else {
                                            if ((iC5 & 32) == 0) {
                                                iC5 |= 64;
                                            }
                                            iuVar2.d((char) iC5);
                                            i93++;
                                        }
                                    } else {
                                        i3 = 6;
                                    }
                                }
                            }
                            i76 = i76;
                            i = i3;
                            i81 = 2;
                            break;
                        } while (l70Var.a() > 0);
                        i76 = i76;
                        i = i3;
                        i81 = 2;
                        break;
                    case 6:
                        int i95 = l70Var.b;
                        int i96 = i95 + 2;
                        int iY0 = vn4.y0(l70Var.c(8), i95 + 1);
                        if (iY0 != 0) {
                            if (iY0 >= 250) {
                                i4 = 8;
                                iY0 = ((iY0 - 249) * 250) + vn4.y0(l70Var.c(8), i96);
                                i96 = i95 + 3;
                            }
                            if (iY0 >= 0) {
                                throw at2.a();
                            }
                            bArr3 = new byte[iY0];
                            i5 = i96;
                            i6 = 0;
                            while (i6 < iY0) {
                                bArr4 = bArr6;
                                if (l70Var.a() >= i4) {
                                    throw at2.a();
                                }
                                int iC6 = l70Var.c(i4);
                                int i97 = i5;
                                i5 = i97 + 1;
                                bArr3[i6] = (byte) vn4.y0(iC6, i97);
                                i6++;
                                bArr6 = bArr4;
                                i4 = 8;
                            }
                            bArr2 = bArr6;
                            arrayList.add(bArr3);
                            ((StringBuilder) iuVar2.f1103o).append(new String(bArr3, StandardCharsets.ISO_8859_1));
                            i = 6;
                            i81 = 2;
                        } else {
                            iY0 = l70Var.a() / 8;
                        }
                        i4 = 8;
                        if (iY0 >= 0) {
                            throw at2.a();
                        }
                        bArr3 = new byte[iY0];
                        i5 = i96;
                        i6 = 0;
                        while (i6 < iY0) {
                            bArr4 = bArr6;
                            if (l70Var.a() >= i4) {
                                throw at2.a();
                            }
                            int iC7 = l70Var.c(i4);
                            int i98 = i5;
                            i5 = i98 + 1;
                            bArr3[i6] = (byte) vn4.y0(iC7, i98);
                            i6++;
                            bArr6 = bArr4;
                            i4 = 8;
                        }
                        bArr2 = bArr6;
                        arrayList.add(bArr3);
                        ((StringBuilder) iuVar2.f1103o).append(new String(bArr3, StandardCharsets.ISO_8859_1));
                        i = 6;
                        i81 = 2;
                        break;
                        break;
                    case 7:
                        if (l70Var.a() < 8) {
                            throw at2.a();
                        }
                        int iC8 = l70Var.c(8);
                        if (iC8 <= 127) {
                            iuVar2.e(iC8 - 1);
                        }
                        bArr2 = bArr6;
                        z6 = true;
                        i = 6;
                        i81 = 2;
                        break;
                        break;
                    default:
                        throw at2.a();
                }
            }
            if (i81 == 1 || l70Var.a() <= 0) {
                if (sb.length() > 0) {
                    iuVar2.p();
                    ((StringBuilder) iuVar2.p).append((CharSequence) sb);
                }
                if (z6) {
                    i7 = (hashSet.contains(0) || hashSet.contains(4)) ? 5 : (hashSet.contains(1) || hashSet.contains(5)) ? i : 4;
                } else if (hashSet.contains(0) || hashSet.contains(4)) {
                    i7 = 2;
                } else {
                    i7 = (hashSet.contains(1) || hashSet.contains(5)) ? 3 : 1;
                }
                cj1 cj1Var = new cj1(bArr2, iuVar2.toString(), arrayList.isEmpty() ? null : arrayList, null, -1, -1, i7);
                cj1Var.e = Integer.valueOf(i76);
                return cj1Var;
            }
            bArr6 = bArr2;
            i76 = i76;
            i69 = 8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036 A[Catch: at2 | lq0 -> 0x005e, TryCatch #1 {at2 | lq0 -> 0x005e, blocks: (B:13:0x001e, B:14:0x0032, B:16:0x0036, B:17:0x0039, B:19:0x003d, B:21:0x0047, B:22:0x004d, B:24:0x0052), top: B:31:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:19:0x003d A[Catch: at2 | lq0 -> 0x005e, TryCatch #1 {at2 | lq0 -> 0x005e, blocks: (B:13:0x001e, B:14:0x0032, B:16:0x0036, B:17:0x0039, B:19:0x003d, B:21:0x0047, B:22:0x004d, B:24:0x0052), top: B:31:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0047 A[Catch: at2 | lq0 -> 0x005e, TryCatch #1 {at2 | lq0 -> 0x005e, blocks: (B:13:0x001e, B:14:0x0032, B:16:0x0036, B:17:0x0039, B:19:0x003d, B:21:0x0047, B:22:0x004d, B:24:0x0052), top: B:31:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:38:0x004d A[SYNTHETIC] */
    public cj1 d(k70 k70Var, Map map) throws at2, lq0 {
        lq0 lq0Var;
        at2 e;
        k70 k70Var2;
        int i;
        int i2;
        io.sentry.z7 z7Var = new io.sentry.z7();
        int i3 = k70Var.n;
        if (i3 < 21 || (i3 & 3) != 1) {
            throw at2.a();
        }
        z7Var.b = k70Var;
        try {
            return b(z7Var, map);
        } catch (at2 e2) {
            e = e2;
            lq0Var = null;
            try {
                z7Var.j();
                z7Var.c = null;
                z7Var.d = null;
                z7Var.a = true;
                z7Var.i();
                z7Var.g();
                k70Var2 = (k70) z7Var.b;
                i = 0;
                while (i < k70Var2.m) {
                    int i4 = i + 1;
                    for (i2 = i4; i2 < k70Var2.n; i2++) {
                        if (k70Var2.b(i, i2) != k70Var2.b(i2, i)) {
                            k70Var2.a(i2, i);
                            k70Var2.a(i, i2);
                        }
                    }
                    i = i4;
                }
                cj1 cj1VarB = b(z7Var, map);
                cj1VarB.g = new ux5();
                return cj1VarB;
            } catch (at2 | lq0 unused) {
                if (e != null) {
                    throw e;
                }
                throw lq0Var;
            }
        } catch (lq0 e3) {
            lq0Var = e3;
            e = null;
            z7Var.j();
            z7Var.c = null;
            z7Var.d = null;
            z7Var.a = true;
            z7Var.i();
            z7Var.g();
            k70Var2 = (k70) z7Var.b;
            i = 0;
            while (i < k70Var2.m) {
                int i5 = i + 1;
                while (i2 < k70Var2.n) {
                    if (k70Var2.b(i, i2) != k70Var2.b(i2, i)) {
                        k70Var2.a(i2, i);
                        k70Var2.a(i, i2);
                    }
                }
                i = i5;
            }
            cj1 cj1VarB2 = b(z7Var, map);
            cj1VarB2.g = new ux5();
            return cj1VarB2;
        }
    }
}
