package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class uc5 {
    public static final xk1 a = new xk1((byte) 15);

    /* JADX WARN: Code duplicated, block: B:79:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:87:0x0105  */
    /* JADX WARN: Code duplicated, block: B:88:0x010a  */
    /* JADX WARN: Code duplicated, block: B:89:0x010f  */
    public static la0 a(nq1 nq1Var) {
        la0 la0Var;
        int[] iArr;
        int i;
        wc6 wc6Var;
        wc6 wc6Var2;
        wc6 wc6Var3;
        wc6 wc6Var4;
        wc6 wc6Var5;
        int i2;
        int i3;
        wc6 wc6Var6;
        if (nq1Var == null) {
            return null;
        }
        boolean z = nq1Var.p;
        la0 la0Var2 = (la0) nq1Var.n;
        wc6 wc6Var7 = la0Var2.e;
        wc6 wc6Var8 = la0Var2.c;
        wc6 wc6Var9 = la0Var2.d;
        wc6 wc6Var10 = la0Var2.b;
        w20[] w20VarArr = (w20[]) nq1Var.f2420o;
        w20 w20VarL = nq1Var.L();
        int iMax = -1;
        if (w20VarL == null) {
            iArr = null;
            la0Var = null;
        } else {
            int i4 = w20VarL.f;
            int iT = nq1Var.t((int) (z ? wc6Var8 : wc6Var7).b);
            int i5 = -1;
            for (int iT2 = nq1Var.t((int) (z ? wc6Var10 : wc6Var9).b); iT2 < iT; iT2++) {
                w20 w20Var = w20VarArr[iT2];
                if (w20Var != null) {
                    w20Var.c();
                    int i6 = w20Var.f;
                    int i7 = i6 - i5;
                    if (i7 != 0) {
                        if (i7 != 1 && i6 >= i4) {
                            w20VarArr[iT2] = null;
                        } else {
                            i5 = i6;
                        }
                    }
                }
            }
            la0Var = null;
            iArr = new int[i4];
            for (w20 w20Var2 : w20VarArr) {
                if (w20Var2 != null && (i = w20Var2.f) < i4) {
                    iArr[i] = iArr[i] + 1;
                }
            }
        }
        if (iArr == null) {
            return la0Var;
        }
        for (int i8 : iArr) {
            iMax = Math.max(iMax, i8);
        }
        int i9 = 0;
        for (int i10 : iArr) {
            i9 += iMax - i10;
            if (i10 > 0) {
                break;
            }
        }
        for (int i11 = 0; i9 > 0 && w20VarArr[i11] == null; i11++) {
            i9--;
        }
        int i12 = 0;
        for (int length = iArr.length - 1; length >= 0; length--) {
            int i13 = iArr[length];
            i12 += iMax - i13;
            if (i13 > 0) {
                break;
            }
        }
        for (int length2 = w20VarArr.length - 1; i12 > 0 && w20VarArr[length2] == null; length2--) {
            i12--;
        }
        if (i9 > 0) {
            wc6 wc6Var11 = z ? wc6Var10 : wc6Var9;
            int i14 = ((int) wc6Var11.b) - i9;
            wc6 wc6Var12 = new wc6(wc6Var11.a, i14 >= 0 ? i14 : 0);
            if (z) {
                wc6Var2 = wc6Var12;
                wc6Var = wc6Var9;
            } else {
                wc6Var = wc6Var12;
            }
            if (i12 > 0) {
                if (z) {
                    wc6Var5 = wc6Var8;
                } else {
                    wc6Var5 = wc6Var7;
                }
                i2 = ((int) wc6Var5.b) + i12;
                i3 = la0Var2.a.n;
                if (i2 >= i3) {
                    i2 = i3 - 1;
                }
                wc6Var6 = new wc6(wc6Var5.a, i2);
                if (z) {
                    wc6Var3 = wc6Var7;
                    wc6Var4 = wc6Var6;
                } else {
                    wc6Var4 = wc6Var8;
                    wc6Var3 = wc6Var6;
                }
            } else {
                wc6Var3 = wc6Var7;
                wc6Var4 = wc6Var8;
            }
            return new la0(la0Var2.a, wc6Var2, wc6Var4, wc6Var, wc6Var3);
        }
        wc6Var = wc6Var9;
        wc6Var2 = wc6Var10;
        if (i12 > 0) {
            if (z) {
                wc6Var5 = wc6Var8;
            } else {
                wc6Var5 = wc6Var7;
            }
            i2 = ((int) wc6Var5.b) + i12;
            i3 = la0Var2.a.n;
            if (i2 >= i3) {
                i2 = i3 - 1;
            }
            wc6Var6 = new wc6(wc6Var5.a, i2);
            if (z) {
                wc6Var3 = wc6Var7;
                wc6Var4 = wc6Var6;
            } else {
                wc6Var4 = wc6Var8;
                wc6Var3 = wc6Var6;
            }
        } else {
            wc6Var3 = wc6Var7;
            wc6Var4 = wc6Var8;
        }
        return new la0(la0Var2.a, wc6Var2, wc6Var4, wc6Var, wc6Var3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:246:0x045d  */
    /* JADX WARN: Code duplicated, block: B:258:0x0484  */
    public static cj1 b(int[] iArr, int i, int[] iArr2) throws at2, lq0 {
        int[] iArr3;
        byte[] bArr;
        int[] iArr4;
        int i2;
        int i3;
        us4 us4Var;
        yt2 yt2Var;
        yt2 yt2Var2;
        tc5 tc5Var;
        StringBuilder sb;
        boolean z;
        int i4;
        tc5 tc5Var2;
        int i5;
        int i6;
        int iA;
        int i7;
        if (iArr.length == 0) {
            throw at2.a();
        }
        int i8 = 1;
        int i9 = 1 << (i + 1);
        if (iArr2.length > (i9 / 2) + 3 || i9 < 0 || i9 > 512) {
            throw lq0.a();
        }
        us4 us4Var2 = (us4) a.n;
        if (iArr.length == 0) {
            yq4.f();
            return null;
        }
        int length = iArr.length;
        int i10 = 0;
        if (length <= 1 || iArr[0] != 0) {
            iArr3 = iArr;
        } else {
            int i11 = 1;
            while (i11 < length && iArr[i11] == 0) {
                i11++;
            }
            if (i11 == length) {
                iArr3 = new int[]{0};
            } else {
                int i12 = length - i11;
                int[] iArr5 = new int[i12];
                System.arraycopy(iArr, i11, iArr5, 0, i12);
                iArr3 = iArr5;
            }
        }
        int[] iArr6 = new int[i9];
        boolean z2 = false;
        for (int i13 = i9; i13 > 0; i13--) {
            int i14 = us4Var2.a[i13];
            if (i14 == 0) {
                i7 = iArr3[iArr3.length - 1];
            } else {
                if (i14 == 1) {
                    iA = 0;
                    for (int i15 : iArr3) {
                        iA = us4Var2.a(iA, i15);
                    }
                } else {
                    iA = iArr3[0];
                    int length2 = iArr3.length;
                    for (int i16 = 1; i16 < length2; i16++) {
                        iA = us4Var2.a(us4Var2.c(i14, iA), iArr3[i16]);
                    }
                }
                i7 = iA;
            }
            iArr6[i9 - i13] = i7;
            if (i7 != 0) {
                z2 = true;
            }
        }
        if (z2) {
            yt2 yt2VarL = us4Var2.d;
            yt2 yt2Var3 = us4Var2.c;
            for (int i17 : iArr2) {
                yt2VarL = yt2VarL.L(new yt2(us4Var2, new int[]{(929 - us4Var2.a[(iArr.length - 1) - i17]) % 929, 1}));
            }
            yt2 yt2Var4 = new yt2(us4Var2, iArr6);
            if (i9 < 0) {
                yq4.f();
                return null;
            }
            int[] iArr7 = new int[i9 + 1];
            iArr7[0] = 1;
            yt2 yt2Var5 = new yt2(us4Var2, iArr7);
            if (yt2Var5.B() >= yt2Var4.B()) {
                yt2Var5 = yt2Var4;
                yt2Var4 = yt2Var5;
            }
            yt2 yt2VarN = yt2Var4;
            yt2 yt2Var6 = yt2Var5;
            yt2 yt2Var7 = us4Var2.d;
            yt2 yt2Var8 = yt2Var3;
            while (yt2Var6.B() >= i9 / 2) {
                if (yt2Var6.J()) {
                    throw lq0.a();
                }
                int iB = us4Var2.b(yt2Var6.A(yt2Var6.B()));
                yt2 yt2VarD = yt2Var3;
                while (yt2VarN.B() >= yt2Var6.B() && !yt2VarN.J()) {
                    int iB2 = yt2VarN.B() - yt2Var6.B();
                    int iC = us4Var2.c(yt2VarN.A(yt2VarN.B()), iB);
                    if (iB2 < 0) {
                        yq4.f();
                        return null;
                    }
                    if (iC == 0) {
                        yt2Var = yt2Var3;
                    } else {
                        int[] iArr8 = new int[iB2 + 1];
                        iArr8[i10] = iC;
                        yt2Var = new yt2(us4Var2, iArr8);
                    }
                    yt2VarD = yt2VarD.d(yt2Var);
                    int[] iArr9 = (int[]) yt2Var6.f2642o;
                    us4 us4Var3 = (us4) yt2Var6.n;
                    if (iB2 < 0) {
                        yq4.f();
                        return null;
                    }
                    if (iC == 0) {
                        yt2Var2 = us4Var3.c;
                    } else {
                        int length3 = iArr9.length;
                        int[] iArr10 = new int[iB2 + length3];
                        int i18 = 0;
                        while (i18 < length3) {
                            int i19 = i18;
                            iArr10[i19] = us4Var3.c(iArr9[i19], iC);
                            i18 = i19 + 1;
                        }
                        yt2Var2 = new yt2(us4Var3, iArr10);
                    }
                    yt2VarN = yt2VarN.N(yt2Var2);
                    i8 = i8;
                    i10 = 0;
                }
                int i20 = i8;
                yt2 yt2VarN2 = yt2VarD.L(yt2Var7).N(yt2Var8);
                int[] iArr11 = (int[]) yt2VarN2.f2642o;
                int length4 = iArr11.length;
                int[] iArr12 = new int[length4];
                int i21 = 0;
                while (true) {
                    us4Var = (us4) yt2VarN2.n;
                    if (i21 < length4) {
                        int i22 = iArr11[i21];
                        us4Var.getClass();
                        iArr12[i21] = (929 - i22) % 929;
                        i21++;
                    }
                }
                yt2 yt2Var9 = new yt2(us4Var, iArr12);
                yt2 yt2Var10 = yt2VarN;
                yt2VarN = yt2Var6;
                yt2Var6 = yt2Var10;
                yt2Var8 = yt2Var7;
                i10 = 0;
                yt2Var7 = yt2Var9;
                i8 = i20;
            }
            int i23 = i8;
            int i24 = i10;
            bArr = null;
            int iA2 = yt2Var7.A(i24);
            if (iA2 == 0) {
                throw lq0.a();
            }
            int iB3 = us4Var2.b(iA2);
            yt2[] yt2VarArr = {yt2Var7.M(iB3), yt2Var6.M(iB3)};
            yt2 yt2Var11 = yt2VarArr[i24];
            yt2 yt2Var12 = yt2VarArr[i23];
            int iB4 = yt2Var11.B();
            int[] iArr13 = new int[iB4];
            int i25 = 0;
            for (int i26 = i23; i26 < 929 && i25 < iB4; i26++) {
                if (yt2Var11.y(i26) == 0) {
                    iArr13[i25] = us4Var2.b(i26);
                    i25++;
                }
            }
            if (i25 != iB4) {
                throw lq0.a();
            }
            int iB5 = yt2Var11.B();
            if (iB5 < i23) {
                iArr4 = new int[0];
            } else {
                int[] iArr14 = new int[iB5];
                for (int i27 = 1; i27 <= iB5; i27++) {
                    iArr14[iB5 - i27] = us4Var2.c(i27, yt2Var11.A(i27));
                }
                if (iB5 == 0) {
                    yq4.f();
                    return null;
                }
                if (iB5 > 1 && iArr14[0] == 0) {
                    int i28 = 1;
                    while (i28 < iB5 && iArr14[i28] == 0) {
                        i28++;
                    }
                    if (i28 == iB5) {
                        iArr14 = new int[]{0};
                    } else {
                        int i29 = iB5 - i28;
                        int[] iArr15 = new int[i29];
                        System.arraycopy(iArr14, i28, iArr15, 0, i29);
                        iArr14 = iArr15;
                    }
                }
                int[] iArr16 = new int[iB4];
                for (int i30 = 0; i30 < iB4; i30++) {
                    int iB6 = us4Var2.b(iArr13[i30]);
                    int iY = (929 - yt2Var12.y(iB6)) % 929;
                    if (iB6 == 0) {
                        i2 = iArr14[iArr14.length - 1];
                    } else if (iB6 == 1) {
                        int iA3 = 0;
                        for (int i31 : iArr14) {
                            iA3 = us4Var2.a(iA3, i31);
                        }
                        i2 = iA3;
                    } else {
                        int iA4 = iArr14[0];
                        int length5 = iArr14.length;
                        for (int i32 = 1; i32 < length5; i32++) {
                            iA4 = us4Var2.a(us4Var2.c(iB6, iA4), iArr14[i32]);
                        }
                        i2 = iA4;
                    }
                    iArr16[i30] = us4Var2.c(iY, us4Var2.b(i2));
                }
                iArr4 = iArr16;
            }
            for (int i33 = 0; i33 < iB4; i33++) {
                int length6 = iArr.length - 1;
                int i34 = iArr13[i33];
                if (i34 == 0) {
                    yq4.f();
                    return null;
                }
                int i35 = length6 - us4Var2.b[i34];
                if (i35 < 0) {
                    throw lq0.a();
                }
                iArr[i35] = ((929 + iArr[i35]) - iArr4[i33]) % 929;
            }
            i3 = iB4;
        } else {
            i3 = 0;
            bArr = null;
        }
        if (iArr.length < 4) {
            throw at2.a();
        }
        int i36 = iArr[0];
        if (i36 > iArr.length) {
            throw at2.a();
        }
        if (i36 == 0) {
            if (i9 >= iArr.length) {
                throw at2.a();
            }
            iArr[0] = iArr.length - i9;
        }
        String strValueOf = String.valueOf(i);
        char[] cArr = ri1.a;
        int i37 = 2;
        iu iuVar = new iu(iArr.length * 2);
        int iD = ri1.d(iArr, 1, iuVar);
        tc5 tc5Var3 = new tc5();
        char c = 0;
        while (true) {
            int i38 = iArr[c];
            if (iD >= i38) {
                tc5 tc5Var4 = tc5Var3;
                if (((StringBuilder) iuVar.f1103o).length() == 0 && ((sb = (StringBuilder) iuVar.p) == null || sb.length() == 0)) {
                    tc5Var = tc5Var4;
                    if (tc5Var.a == null) {
                        throw at2.a();
                    }
                } else {
                    tc5Var = tc5Var4;
                }
                cj1 cj1Var = new cj1(bArr, iuVar.toString(), strValueOf);
                cj1Var.g = tc5Var;
                cj1Var.e = Integer.valueOf(i3);
                cj1Var.f = Integer.valueOf(iArr2.length);
                return cj1Var;
            }
            int iC2 = iD + 1;
            int i39 = iArr[iD];
            if (i39 != 913) {
                switch (i39) {
                    case 900:
                        tc5Var3 = tc5Var3;
                        c = 0;
                        iD = ri1.d(iArr, iC2, iuVar);
                        break;
                    case 901:
                        z = false;
                        c = 0;
                        while (iC2 < iArr[c] && !z) {
                            while (true) {
                                i4 = iArr[c];
                                if (iC2 >= i4 && iArr[iC2] == 927) {
                                    iuVar.e(iArr[iC2 + 1]);
                                    iC2 += 2;
                                    c = 0;
                                }
                            }
                            if (iC2 < i4 || iArr[iC2] >= 900) {
                                tc5Var2 = tc5Var3;
                                c = 0;
                                z = true;
                            } else {
                                long j = 0;
                                int i40 = 0;
                                while (true) {
                                    i5 = iC2 + 1;
                                    tc5Var2 = tc5Var3;
                                    j = (j * 900) + ((long) iArr[iC2]);
                                    i40++;
                                    if (i40 < 5 && i5 < iArr[0] && iArr[i5] < 900) {
                                        iC2 = i5;
                                        tc5Var3 = tc5Var2;
                                    }
                                }
                                if (i40 != 5 || (i39 != 924 && (i5 >= iArr[0] || iArr[i5] >= 900))) {
                                    i5 -= i40;
                                    boolean z3 = z;
                                    c = 0;
                                    while (i5 < iArr[0] && !z3) {
                                        int i41 = i5 + 1;
                                        int i42 = iArr[i5];
                                        if (i42 < 900) {
                                            ((StringBuilder) iuVar.f1103o).append((char) (((byte) i42) & 255));
                                            i5 = i41;
                                        } else if (i42 == 927) {
                                            i5 += 2;
                                            iuVar.e(iArr[i41]);
                                        } else {
                                            z3 = true;
                                        }
                                    }
                                    z = z3;
                                } else {
                                    for (int i43 = 0; i43 < 6; i43++) {
                                        ((StringBuilder) iuVar.f1103o).append((char) (((byte) (j >> ((5 - i43) * 8))) & 255));
                                    }
                                    c = 0;
                                }
                                iC2 = i5;
                            }
                            tc5Var3 = tc5Var2;
                        }
                        tc5Var3 = tc5Var3;
                        iD = iC2;
                        break;
                    case 902:
                        iD = ri1.c(iArr, iC2, iuVar);
                        c = 0;
                        break;
                    default:
                        switch (i39) {
                            case 922:
                            case 923:
                                throw at2.a();
                            case 924:
                                z = false;
                                c = 0;
                                while (iC2 < iArr[c]) {
                                    while (true) {
                                        i4 = iArr[c];
                                        if (iC2 >= i4) {
                                        }
                                        if (iC2 < i4) {
                                            tc5Var2 = tc5Var3;
                                            c = 0;
                                            z = true;
                                        } else {
                                            tc5Var2 = tc5Var3;
                                            c = 0;
                                            z = true;
                                        }
                                        tc5Var3 = tc5Var2;
                                        iuVar.e(iArr[iC2 + 1]);
                                        iC2 += 2;
                                        c = 0;
                                    }
                                }
                                tc5Var3 = tc5Var3;
                                iD = iC2;
                                break;
                            case 925:
                                iD += 2;
                                c = 0;
                                break;
                            case 926:
                                iD += 3;
                                c = 0;
                                break;
                            case 927:
                                iD += 2;
                                iuVar.e(iArr[iC2]);
                                c = 0;
                                break;
                            case 928:
                                if (iD + 3 > i38) {
                                    throw at2.a();
                                }
                                int[] iArr17 = new int[i37];
                                int i44 = 0;
                                while (i44 < i37) {
                                    iArr17[i44] = iArr[iC2];
                                    i44++;
                                    iC2++;
                                }
                                String strA = ri1.a(iArr17, i37);
                                if (!strA.isEmpty()) {
                                    try {
                                        Integer.parseInt(strA);
                                    } catch (NumberFormatException unused) {
                                        throw at2.a();
                                    }
                                }
                                StringBuilder sb2 = new StringBuilder();
                                while (iC2 < iArr[0] && iC2 < iArr.length && (i6 = iArr[iC2]) != 922 && i6 != 923) {
                                    sb2.append(String.format("%03d", Integer.valueOf(i6)));
                                    iC2++;
                                }
                                if (sb2.length() == 0) {
                                    throw at2.a();
                                }
                                tc5Var3.a = sb2.toString();
                                int i45 = iArr[iC2] == 923 ? iC2 + 1 : -1;
                                while (iC2 < iArr[0]) {
                                    int i46 = iArr[iC2];
                                    if (i46 == 922) {
                                        iC2++;
                                        tc5Var3.b = true;
                                    } else {
                                        if (i46 != 923) {
                                            throw at2.a();
                                        }
                                        switch (iArr[iC2 + 1]) {
                                            case 0:
                                                iu iuVar2 = new iu((byte) 22);
                                                iC2 = ri1.d(iArr, iC2 + 2, iuVar2);
                                                iuVar2.toString();
                                                break;
                                            case 1:
                                                iu iuVar3 = new iu((byte) 22);
                                                iC2 = ri1.c(iArr, iC2 + 2, iuVar3);
                                                try {
                                                    Integer.parseInt(iuVar3.toString());
                                                } catch (NumberFormatException unused2) {
                                                    throw at2.a();
                                                }
                                                break;
                                            case 2:
                                                iu iuVar4 = new iu((byte) 22);
                                                iC2 = ri1.c(iArr, iC2 + 2, iuVar4);
                                                try {
                                                    Long.parseLong(iuVar4.toString());
                                                } catch (NumberFormatException unused3) {
                                                    throw at2.a();
                                                }
                                                break;
                                            case 3:
                                                iu iuVar5 = new iu((byte) 22);
                                                iC2 = ri1.d(iArr, iC2 + 2, iuVar5);
                                                iuVar5.toString();
                                                break;
                                            case 4:
                                                iu iuVar6 = new iu((byte) 22);
                                                iC2 = ri1.d(iArr, iC2 + 2, iuVar6);
                                                iuVar6.toString();
                                                break;
                                            case 5:
                                                iu iuVar7 = new iu((byte) 22);
                                                iC2 = ri1.c(iArr, iC2 + 2, iuVar7);
                                                try {
                                                    Long.parseLong(iuVar7.toString());
                                                } catch (NumberFormatException unused4) {
                                                    throw at2.a();
                                                }
                                                break;
                                            case 6:
                                                iu iuVar8 = new iu((byte) 22);
                                                iC2 = ri1.c(iArr, iC2 + 2, iuVar8);
                                                try {
                                                    Integer.parseInt(iuVar8.toString());
                                                } catch (NumberFormatException unused5) {
                                                    throw at2.a();
                                                }
                                                break;
                                            default:
                                                throw at2.a();
                                        }
                                    }
                                }
                                if (i45 != -1) {
                                    int i47 = iC2 - i45;
                                    if (tc5Var3.b) {
                                        i47--;
                                    }
                                    if (i47 > 0) {
                                        Arrays.copyOfRange(iArr, i45, i47 + i45);
                                    }
                                }
                                iD = iC2;
                                c = 0;
                                break;
                                break;
                            default:
                                iD = ri1.d(iArr, iD, iuVar);
                                c = 0;
                                break;
                        }
                        break;
                }
            } else {
                tc5Var3 = tc5Var3;
                c = 0;
                iD += 2;
                iuVar.d((char) iArr[iC2]);
            }
            tc5Var3 = tc5Var3;
            i37 = 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0030 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0035 A[EDGE_INSN: B:122:0x0035->B:19:0x0035 BREAK  A[LOOP:1: B:9:0x001b->B:18:0x0033], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x004f A[EDGE_INSN: B:125:0x004f->B:28:0x004f BREAK  A[LOOP:2: B:25:0x004a->B:34:0x0064], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:18:0x0033 A[LOOP:1: B:9:0x001b->B:18:0x0033, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    public static w20 c(k70 k70Var, int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        char c;
        int i7;
        int i8 = i;
        int[] iArr = kh.U;
        int[] iArr2 = kh.T;
        int i9 = z ? -1 : 1;
        boolean z2 = z;
        int i10 = i3;
        int i11 = 0;
        loop0: while (true) {
            c = 2;
            if (i11 >= 2) {
                break;
            }
            while (true) {
                if (!z2) {
                    if (i10 >= i2) {
                        break;
                    }
                    if (z2 == k70Var.b(i10, i4)) {
                        break;
                        break;
                    }
                    if (Math.abs(i3 - i10) > 2) {
                        i10 = i3;
                        break loop0;
                    }
                    i10 += i9;
                } else {
                    if (i10 < i8) {
                        break;
                    }
                    if (z2 == k70Var.b(i10, i4)) {
                        break;
                    }
                    if (Math.abs(i3 - i10) > 2) {
                        i10 = i3;
                        break loop0;
                    }
                    i10 += i9;
                }
            }
            i9 = -i9;
            z2 = !z2;
            i11++;
        }
        int[] iArr3 = new int[8];
        int i12 = z ? 1 : -1;
        boolean z3 = z;
        int i13 = i10;
        int i14 = 0;
        while (true) {
            if (!z) {
                if (i13 < i8) {
                    break;
                }
                if (i14 < 8) {
                    break;
                    break;
                }
                char c2 = c;
                if (k70Var.b(i13, i4) == z3) {
                    iArr3[i14] = iArr3[i14] + 1;
                    i13 += i12;
                } else {
                    i14++;
                    z3 = !z3;
                }
                c = c2;
            } else {
                if (i13 >= i2) {
                    break;
                }
                if (i14 < 8) {
                    break;
                }
                char c3 = c;
                if (k70Var.b(i13, i4) == z3) {
                    iArr3[i14] = iArr3[i14] + 1;
                    i13 += i12;
                } else {
                    i14++;
                    z3 = !z3;
                }
                c = c3;
            }
        }
        char c4 = c;
        if (i14 != 8) {
            if (z) {
                i8 = i2;
            }
            if (i13 != i8 || i14 != 7) {
                iArr3 = null;
            }
        }
        if (iArr3 != null) {
            int iX = xs1.X(iArr3);
            if (z) {
                i7 = i10 + iX;
            } else {
                for (int i15 = 0; i15 < iArr3.length / 2; i15++) {
                    int i16 = iArr3[i15];
                    iArr3[i15] = iArr3[(iArr3.length - 1) - i15];
                    iArr3[(iArr3.length - 1) - i15] = i16;
                }
                int i17 = i10;
                i10 -= iX;
                i7 = i17;
            }
            if (i5 - 2 <= iX && iX <= i6 + 2) {
                float[][] fArr = rc5.a;
                float fX = xs1.X(iArr3);
                int[] iArr4 = new int[8];
                int i18 = 0;
                int i19 = 0;
                for (int i20 = 0; i20 < 17; i20++) {
                    float f = ((i20 * fX) / 17.0f) + (fX / 34.0f);
                    int i21 = iArr3[i19] + i18;
                    if (i21 <= f) {
                        i19++;
                        i18 = i21;
                    }
                    iArr4[i19] = iArr4[i19] + 1;
                }
                long j = 0;
                for (int i22 = 0; i22 < 8; i22++) {
                    for (int i23 = 0; i23 < iArr4[i22]; i23++) {
                        j = (j << 1) | ((long) (i22 % 2 == 0 ? 1 : 0));
                    }
                }
                int i24 = (int) j;
                int iBinarySearch = Arrays.binarySearch(iArr2, i24 & 262143);
                if ((iBinarySearch < 0 ? -1 : (iArr[iBinarySearch] - 1) % 929) == -1) {
                    i24 = -1;
                }
                if (i24 == -1) {
                    int iX2 = xs1.X(iArr3);
                    float[] fArr2 = new float[8];
                    if (iX2 > 1) {
                        for (int i25 = 0; i25 < 8; i25++) {
                            fArr2[i25] = iArr3[i25] / iX2;
                        }
                    }
                    float f2 = Float.MAX_VALUE;
                    i24 = -1;
                    int i26 = 0;
                    while (true) {
                        float[][] fArr3 = rc5.a;
                        if (i26 >= fArr3.length) {
                            break;
                        }
                        float[] fArr4 = fArr3[i26];
                        float f3 = 0.0f;
                        for (int i27 = 0; i27 < 8; i27++) {
                            float f4 = fArr4[i27] - fArr2[i27];
                            f3 += f4 * f4;
                            if (f3 >= f2) {
                                break;
                            }
                        }
                        if (f3 < f2) {
                            i24 = iArr2[i26];
                            f2 = f3;
                        }
                        i26++;
                    }
                }
                int iBinarySearch2 = Arrays.binarySearch(iArr2, 262143 & i24);
                int i28 = iBinarySearch2 < 0 ? -1 : (iArr[iBinarySearch2] - 1) % 929;
                if (i28 == -1) {
                    return null;
                }
                int[] iArr5 = new int[8];
                int i29 = 0;
                int i30 = 7;
                while (true) {
                    int i31 = i24 & 1;
                    if (i31 != i29) {
                        i30--;
                        if (i30 < 0) {
                            return new w20(i10, i7, ((((iArr5[0] - iArr5[c4]) + iArr5[4]) - iArr5[6]) + 9) % 9, i28, (byte) 1);
                        }
                        i29 = i31;
                    }
                    iArr5[i30] = iArr5[i30] + 1;
                    i24 >>= 1;
                    w20 w20Var = w20Var;
                    i28 = i28;
                }
            }
        }
        return null;
    }

    public static nq1 d(k70 k70Var, la0 la0Var, wc6 wc6Var, boolean z, int i, int i2) {
        nq1 nq1Var = new nq1(la0Var, z);
        int i3 = 0;
        while (i3 < 2) {
            int i4 = i3 == 0 ? 1 : -1;
            int i5 = (int) wc6Var.a;
            int i6 = (int) wc6Var.b;
            while (i6 <= la0Var.i && i6 >= la0Var.h) {
                w20 w20VarC = c(k70Var, 0, k70Var.m, z, i5, i6, i, i2);
                if (w20VarC != null) {
                    ((w20[]) nq1Var.f2420o)[nq1Var.t(i6)] = w20VarC;
                    i5 = z ? w20VarC.b : w20VarC.c;
                }
                i6 += i4;
                z = z;
            }
            i3++;
        }
        return nq1Var;
    }
}
