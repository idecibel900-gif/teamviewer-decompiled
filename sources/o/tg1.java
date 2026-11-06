package o;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class tg1 implements n36 {
    public static final wc6[] c = new wc6[0];
    public static final wc6[] d = new wc6[0];
    public static final wc6[] e = new wc6[0];
    public final /* synthetic */ byte a;
    public final Object b;

    public tg1(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new yi1((byte) 1);
                break;
            case 2:
                this.b = new yi1((byte) 2);
                break;
            default:
                this.b = new yi1((byte) 0);
                break;
        }
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }

    /* JADX WARN: Code duplicated, block: B:230:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:232:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:235:0x0510  */
    /* JADX WARN: Code duplicated, block: B:236:0x0520  */
    /* JADX WARN: Code duplicated, block: B:351:0x0740  */
    /* JADX WARN: Code duplicated, block: B:353:0x0750  */
    /* JADX WARN: Code duplicated, block: B:354:0x0762  */
    /* JADX WARN: Code duplicated, block: B:356:0x0767  */
    /* JADX WARN: Code duplicated, block: B:358:0x0773 A[LOOP:19: B:357:0x0771->B:358:0x0773, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:362:0x07c3  */
    /* JADX WARN: Code duplicated, block: B:363:0x07e4  */
    /* JADX WARN: Code duplicated, block: B:431:0x09ed  */
    /* JADX WARN: Instruction removed from duplicated block: B:362:0x07c3, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:363:0x07e4, please report this as an issue */
    @Override // o.n36
    public final uc6 a(cj3 cj3Var, Map map) throws at2, d55, lq0 {
        char c2;
        char c3;
        char c4;
        wc6 wc6Var;
        cj1 cj1VarC;
        wc6[] wc6VarArr;
        char c5;
        int[] iArr;
        int iA;
        byte[] bArr;
        StringBuilder sb;
        byte[][] bArr2;
        int i;
        String string;
        String str;
        String str2;
        int iN;
        int iN2;
        vc6 vc6Var;
        il2 il2Var;
        il2 il2Var2;
        il2 il2Var3;
        vc6 vc6Var2;
        float f;
        ne neVarO;
        float f2;
        float f3;
        float f4;
        float f5;
        int i2;
        wc6[] wc6VarArr2;
        cj1 cj1VarD;
        wc6[] wc6VarArr3;
        double d2;
        vc6 vc6Var3;
        int i3;
        int i4;
        int iAbs;
        int i5;
        byte b = this.a;
        vc6 vc6Var4 = vc6.y;
        vc6 vc6Var5 = vc6.n;
        pi1 pi1Var = pi1.PURE_BARCODE;
        vc6 vc6Var6 = vc6.p;
        vc6 vc6Var7 = vc6.f2300o;
        char c6 = 5;
        Object obj = this.b;
        switch (b) {
            case 0:
                yi1 yi1Var = (yi1) obj;
                if (map == null || !map.containsKey(pi1Var)) {
                    k70 k70VarD = cj3Var.D();
                    wk0 wk0Var = new wk0(k70VarD, (byte) 15);
                    wc6[] wc6VarArrB = ((xi8) wk0Var.f2420o).b();
                    wc6 wc6Var2 = wc6VarArrB[0];
                    wc6 wc6Var3 = wc6VarArrB[1];
                    wc6 wc6Var4 = wc6VarArrB[3];
                    wc6 wc6Var5 = wc6VarArrB[2];
                    int I = wk0Var.I(wc6Var2, wc6Var3);
                    int I2 = wk0Var.I(wc6Var3, wc6Var4);
                    int I3 = wk0Var.I(wc6Var4, wc6Var5);
                    int I4 = wk0Var.I(wc6Var5, wc6Var2);
                    wc6[] wc6VarArr4 = {wc6Var5, wc6Var2, wc6Var3, wc6Var4};
                    if (I > I2) {
                        wc6VarArr4[0] = wc6Var2;
                        wc6VarArr4[1] = wc6Var3;
                        wc6VarArr4[2] = wc6Var4;
                        wc6VarArr4[3] = wc6Var5;
                        I = I2;
                    }
                    if (I > I3) {
                        wc6VarArr4[0] = wc6Var3;
                        wc6VarArr4[1] = wc6Var4;
                        wc6VarArr4[2] = wc6Var5;
                        wc6VarArr4[3] = wc6Var2;
                    } else {
                        I3 = I;
                    }
                    if (I3 > I4) {
                        wc6VarArr4[0] = wc6Var4;
                        wc6VarArr4[1] = wc6Var5;
                        wc6VarArr4[2] = wc6Var2;
                        wc6VarArr4[3] = wc6Var3;
                    }
                    wc6 wc6Var6 = wc6VarArr4[0];
                    wc6 wc6Var7 = wc6VarArr4[1];
                    wc6 wc6Var8 = wc6VarArr4[2];
                    wc6 wc6Var9 = wc6VarArr4[3];
                    int I5 = (wk0Var.I(wc6Var6, wc6Var9) + 1) * 4;
                    if (wk0Var.I(wk0.F(wc6Var7, wc6Var8, I5), wc6Var6) < wk0Var.I(wk0.F(wc6Var8, wc6Var7, I5), wc6Var9)) {
                        c3 = 0;
                        wc6VarArr4[0] = wc6Var6;
                        wc6VarArr4[1] = wc6Var7;
                        c2 = 2;
                        wc6VarArr4[2] = wc6Var8;
                        c4 = 3;
                        wc6VarArr4[3] = wc6Var9;
                    } else {
                        c2 = 2;
                        c3 = 0;
                        c4 = 3;
                        wc6VarArr4[0] = wc6Var7;
                        wc6VarArr4[1] = wc6Var8;
                        wc6VarArr4[2] = wc6Var9;
                        wc6VarArr4[3] = wc6Var6;
                    }
                    wc6 wc6Var10 = wc6VarArr4[c3];
                    wc6 wc6Var11 = wc6VarArr4[1];
                    wc6 wc6Var12 = wc6VarArr4[c2];
                    wc6 wc6Var13 = wc6VarArr4[c4];
                    int I6 = wk0Var.I(wc6Var10, wc6Var13);
                    wc6 wc6VarF = wk0.F(wc6Var10, wc6Var11, (wk0Var.I(wc6Var11, wc6Var13) + 1) * 4);
                    wc6 wc6VarF2 = wk0.F(wc6Var12, wc6Var11, (I6 + 1) * 4);
                    int I7 = wk0Var.I(wc6VarF, wc6Var13);
                    int I8 = wk0Var.I(wc6VarF2, wc6Var13);
                    float f6 = wc6Var13.a;
                    float f7 = wc6Var12.a;
                    float f8 = wc6Var11.a;
                    float f9 = f7 - f8;
                    float f10 = I7 + 1;
                    float f11 = wc6Var13.b;
                    float f12 = wc6Var12.b;
                    float f13 = wc6Var11.b;
                    wc6 wc6Var14 = new wc6((f9 / f10) + f6, ((f12 - f13) / f10) + f11);
                    float f14 = I8 + 1;
                    wc6 wc6Var15 = new wc6(((wc6Var10.a - f8) / f14) + f6, ((wc6Var10.b - f13) / f14) + f11);
                    if (wk0Var.v(wc6Var14)) {
                        if (wk0Var.v(wc6Var15) && wk0Var.I(wc6VarF2, wc6Var14) + wk0Var.I(wc6VarF, wc6Var14) <= wk0Var.I(wc6VarF2, wc6Var15) + wk0Var.I(wc6VarF, wc6Var15)) {
                            wc6Var = wc6Var15;
                        } else {
                            wc6Var = wc6Var14;
                        }
                    } else if (wk0Var.v(wc6Var15)) {
                        wc6Var = wc6Var15;
                    } else {
                        wc6Var = null;
                    }
                    wc6VarArr4[3] = wc6Var;
                    if (wc6Var == null) {
                        throw d55.a();
                    }
                    wc6 wc6Var16 = wc6VarArr4[0];
                    wc6 wc6Var17 = wc6VarArr4[1];
                    wc6 wc6Var18 = wc6VarArr4[2];
                    int I9 = wk0Var.I(wc6Var16, wc6Var) + 1;
                    wc6 wc6VarF3 = wk0.F(wc6Var16, wc6Var17, (wk0Var.I(wc6Var18, wc6Var) + 1) * 4);
                    wc6 wc6VarF4 = wk0.F(wc6Var18, wc6Var17, I9 * 4);
                    int I10 = wk0Var.I(wc6VarF3, wc6Var);
                    int i6 = I10 + 1;
                    int I11 = wk0Var.I(wc6VarF4, wc6Var);
                    int i7 = I11 + 1;
                    if ((i6 & 1) == 1) {
                        i6 = I10 + 2;
                    }
                    if ((i7 & 1) == 1) {
                        i7 = I11 + 2;
                    }
                    float f15 = (((wc6Var16.a + wc6Var17.a) + wc6Var18.a) + wc6Var.a) / 4.0f;
                    float f16 = (((wc6Var16.b + wc6Var17.b) + wc6Var18.b) + wc6Var.b) / 4.0f;
                    wc6 wc6VarY = wk0.y(wc6Var16, f15, f16);
                    wc6 wc6VarY2 = wk0.y(wc6Var17, f15, f16);
                    wc6 wc6VarY3 = wk0.y(wc6Var18, f15, f16);
                    wc6 wc6VarY4 = wk0.y(wc6Var, f15, f16);
                    int i8 = i7 * 4;
                    int i9 = i6 * 4;
                    wc6[] wc6VarArr5 = {wk0.F(wk0.F(wc6VarY, wc6VarY2, i8), wc6VarY4, i9), wk0.F(wk0.F(wc6VarY2, wc6VarY, i8), wc6VarY3, i9), wk0.F(wk0.F(wc6VarY3, wc6VarY4, i8), wc6VarY2, i9), wk0.F(wk0.F(wc6VarY4, wc6VarY3, i8), wc6VarY, i9)};
                    wc6 wc6Var19 = wc6VarArr5[0];
                    wc6 wc6Var20 = wc6VarArr5[1];
                    wc6 wc6Var21 = wc6VarArr5[2];
                    wc6 wc6Var22 = wc6VarArr5[3];
                    int I12 = wk0Var.I(wc6Var19, wc6Var22);
                    int iMax = I12 + 1;
                    int I13 = wk0Var.I(wc6Var21, wc6Var22);
                    int i10 = I13 + 1;
                    if ((iMax & 1) == 1) {
                        iMax = I12 + 2;
                    }
                    if ((i10 & 1) == 1) {
                        i10 = I13 + 2;
                    }
                    if (iMax * 4 < i10 * 6 && i10 * 4 < iMax * 6) {
                        iMax = Math.max(iMax, i10);
                        i10 = iMax;
                    }
                    float f17 = iMax - 0.5f;
                    float f18 = i10 - 0.5f;
                    cj1VarC = yi1Var.c(ck3.k0(k70VarD, iMax, i10, nk5.a(0.5f, 0.5f, f17, 0.5f, f17, f18, 0.5f, f18, wc6Var19.a, wc6Var19.b, wc6Var22.a, wc6Var22.b, wc6Var21.a, wc6Var21.b, wc6Var20.a, wc6Var20.b)));
                    wc6VarArr = new wc6[]{wc6Var19, wc6Var20, wc6Var21, wc6Var22};
                } else {
                    k70 k70VarD2 = cj3Var.D();
                    int[] iArrE = k70VarD2.e();
                    int[] iArrC = k70VarD2.c();
                    if (iArrE == null || iArrC == null) {
                        throw d55.a();
                    }
                    int i11 = k70VarD2.m;
                    int i12 = iArrE[0];
                    int i13 = iArrE[1];
                    while (i12 < i11 && k70VarD2.b(i12, i13)) {
                        i12++;
                    }
                    if (i12 == i11) {
                        throw d55.a();
                    }
                    int i14 = iArrE[0];
                    int i15 = i12 - i14;
                    if (i15 == 0) {
                        throw d55.a();
                    }
                    int i16 = iArrE[1];
                    int i17 = iArrC[1];
                    int i18 = ((iArrC[0] - i14) + 1) / i15;
                    int i19 = ((i17 - i16) + 1) / i15;
                    if (i18 <= 0 || i19 <= 0) {
                        throw d55.a();
                    }
                    int i20 = i15 / 2;
                    int i21 = i16 + i20;
                    int i22 = i14 + i20;
                    k70 k70Var = new k70(i18, i19);
                    for (int i23 = 0; i23 < i19; i23++) {
                        int i24 = (i23 * i15) + i21;
                        for (int i25 = 0; i25 < i18; i25++) {
                            if (k70VarD2.b((i25 * i15) + i22, i24)) {
                                k70Var.i(i25, i23);
                            }
                        }
                    }
                    cj1VarC = yi1Var.c(k70Var);
                    wc6VarArr = c;
                }
                uc6 uc6Var = new uc6(cj1VarC.b, cj1VarC.a, wc6VarArr, v20.r);
                List list = cj1VarC.c;
                if (list != null) {
                    uc6Var.b(vc6Var5, list);
                }
                String str3 = cj1VarC.d;
                if (str3 != null) {
                    uc6Var.b(vc6Var7, str3);
                }
                uc6Var.b(vc6Var6, cj1VarC.e);
                uc6Var.b(vc6Var4, "]d" + cj1VarC.j);
                return uc6Var;
            case 1:
                k70 k70VarD3 = cj3Var.D();
                int i26 = k70VarD3.m;
                int i27 = k70VarD3.n;
                int i28 = -1;
                int i29 = -1;
                for (int i30 = 0; i30 < k70VarD3.n; i30++) {
                    int i31 = 0;
                    while (true) {
                        int i32 = k70VarD3.f1233o;
                        if (i31 < i32) {
                            int i33 = k70VarD3.p[(i32 * i30) + i31];
                            if (i33 != 0) {
                                if (i30 < i27) {
                                    i27 = i30;
                                }
                                if (i30 > i29) {
                                    i29 = i30;
                                }
                                int i34 = i31 * 32;
                                if (i34 < i26) {
                                    int i35 = 0;
                                    while ((i33 << (31 - i35)) == 0) {
                                        i35++;
                                    }
                                    int i36 = i35 + i34;
                                    if (i36 < i26) {
                                        i26 = i36;
                                    }
                                }
                                if (i34 + 31 > i28) {
                                    int i37 = 31;
                                    while ((i33 >>> i37) == 0) {
                                        i37--;
                                    }
                                    int i38 = i34 + i37;
                                    if (i38 > i28) {
                                        i28 = i38;
                                    }
                                }
                            }
                            i31++;
                        }
                    }
                }
                if (i28 < i26 || i29 < i27) {
                    c5 = 1;
                    iArr = null;
                } else {
                    c5 = 1;
                    iArr = new int[]{i26, i27, (i28 - i26) + 1, (i29 - i27) + 1};
                }
                if (iArr == null) {
                    throw d55.a();
                }
                int i39 = iArr[0];
                int i40 = iArr[c5];
                int i41 = iArr[2];
                int i42 = iArr[3];
                int[] iArr2 = new int[33];
                for (int i43 = 0; i43 < 33; i43++) {
                    int iMin = Math.min(((i42 / 2) + (i43 * i42)) / 33, i42 - 1) + i40;
                    for (int i44 = 0; i44 < 30; i44++) {
                        if (k70VarD3.b(Math.min(((((i43 & 1) * i41) / 2) + ((i41 / 2) + (i44 * i41))) / 30, i41 - 1) + i39, iMin)) {
                            int i45 = (i44 / 32) + i43;
                            iArr2[i45] = iArr2[i45] | (1 << (i44 & 31));
                        }
                    }
                }
                yi1 yi1Var2 = (yi1) obj;
                byte[] bArr3 = new byte[144];
                for (int i46 = 0; i46 < 33; i46++) {
                    int[] iArr3 = qf0.b[i46];
                    for (int i47 = 0; i47 < 30; i47++) {
                        int i48 = iArr3[i47];
                        if (i48 >= 0 && ((iArr2[(i47 / 32) + i46] >>> (i47 & 31)) & 1) != 0) {
                            int i49 = i48 / 6;
                            bArr3[i49] = (byte) (((byte) (1 << (5 - (i48 % 6)))) | bArr3[i49]);
                        }
                    }
                }
                int iA2 = yi1Var2.a(bArr3, 0, 10, 10, 0);
                int i50 = bArr3[0] & 15;
                if (i50 == 2 || i50 == 3 || i50 == 4) {
                    iA = iA2 + yi1Var2.a(bArr3, 20, 84, 40, 1) + yi1Var2.a(bArr3, 20, 84, 40, 2);
                    bArr = new byte[94];
                } else {
                    if (i50 != 5) {
                        throw at2.a();
                    }
                    iA = iA2 + yi1Var2.a(bArr3, 20, 68, 56, 1) + yi1Var2.a(bArr3, 20, 68, 56, 2);
                    bArr = new byte[78];
                }
                System.arraycopy(bArr3, 0, bArr, 0, 10);
                System.arraycopy(bArr3, 20, bArr, 10, bArr.length - 10);
                StringBuilder sb2 = new StringBuilder(144);
                int i51 = 2;
                if (i50 == 2) {
                    if (i50 == i51) {
                        iN = hm3.n(bArr, hm3.r);
                        iN2 = hm3.n(bArr, hm3.q);
                        if (iN2 <= 10) {
                            throw at2.a();
                        }
                        string = new DecimalFormat("0000000000".substring(0, iN2)).format(iN);
                    } else {
                        bArr2 = hm3.s;
                        sb = new StringBuilder(6);
                        for (i = 0; i < 6; i++) {
                            sb.append(hm3.t[0].charAt(hm3.n(bArr, bArr2[i])));
                        }
                        string = sb.toString();
                    }
                    DecimalFormat decimalFormat = new DecimalFormat("000");
                    str = decimalFormat.format(hm3.n(bArr, hm3.f987o));
                    str2 = decimalFormat.format(hm3.n(bArr, hm3.p));
                    sb2.append(hm3.q(bArr, 10, 84));
                    if (sb2.toString().startsWith("[)>\u001e01\u001d")) {
                        sb2.insert(9, string + (char) 29 + str + (char) 29 + str2 + (char) 29);
                    } else {
                        sb2.insert(0, string + (char) 29 + str + (char) 29 + str2 + (char) 29);
                    }
                } else if (i50 == 3) {
                    i51 = 2;
                    if (i50 == i51) {
                        iN = hm3.n(bArr, hm3.r);
                        iN2 = hm3.n(bArr, hm3.q);
                        if (iN2 <= 10) {
                            throw at2.a();
                        }
                        string = new DecimalFormat("0000000000".substring(0, iN2)).format(iN);
                    } else {
                        bArr2 = hm3.s;
                        sb = new StringBuilder(6);
                        while (i < 6) {
                            sb.append(hm3.t[0].charAt(hm3.n(bArr, bArr2[i])));
                        }
                        string = sb.toString();
                    }
                    DecimalFormat decimalFormat2 = new DecimalFormat("000");
                    str = decimalFormat2.format(hm3.n(bArr, hm3.f987o));
                    str2 = decimalFormat2.format(hm3.n(bArr, hm3.p));
                    sb2.append(hm3.q(bArr, 10, 84));
                    if (sb2.toString().startsWith("[)>\u001e01\u001d")) {
                        sb2.insert(9, string + (char) 29 + str + (char) 29 + str2 + (char) 29);
                    } else {
                        sb2.insert(0, string + (char) 29 + str + (char) 29 + str2 + (char) 29);
                    }
                } else if (i50 == 4) {
                    sb2.append(hm3.q(bArr, 1, 93));
                } else if (i50 == 5) {
                    sb2.append(hm3.q(bArr, 1, 77));
                }
                String string2 = sb2.toString();
                String strValueOf = String.valueOf(i50);
                Integer numValueOf = Integer.valueOf(iA);
                uc6 uc6Var2 = new uc6(string2, bArr, d, v20.v);
                uc6Var2.b(vc6Var6, numValueOf);
                if (strValueOf != null) {
                    uc6Var2.b(vc6Var7, strValueOf);
                }
                return uc6Var2;
            default:
                yi1 yi1Var3 = (yi1) obj;
                if (map != null && map.containsKey(pi1Var)) {
                    k70 k70VarD4 = cj3Var.D();
                    int[] iArrE2 = k70VarD4.e();
                    int[] iArrC2 = k70VarD4.c();
                    if (iArrE2 == null || iArrC2 == null) {
                        throw d55.a();
                    }
                    int i52 = k70VarD4.n;
                    int i53 = k70VarD4.m;
                    int i54 = iArrE2[0];
                    int i55 = 0;
                    boolean z = true;
                    for (int i56 = iArrE2[1]; i54 < i53 && i56 < i52; i56++) {
                        if (z != k70VarD4.b(i54, i56)) {
                            int i57 = i55 + 1;
                            if (i57 != 5) {
                                z = !z;
                                i55 = i57;
                            } else {
                                if (i54 != i53 || i56 == i52) {
                                    throw d55.a();
                                }
                                int i58 = iArrE2[0];
                                float f19 = (i54 - i58) / 7.0f;
                                int i59 = iArrE2[1];
                                int i60 = iArrC2[1];
                                int i61 = iArrC2[0];
                                if (i58 >= i61 || i59 >= i60) {
                                    throw d55.a();
                                }
                                int i62 = i60 - i59;
                                if (i62 != i61 - i58 && (i61 = i58 + i62) >= k70VarD4.m) {
                                    throw d55.a();
                                }
                                int iRound = Math.round(((i61 - i58) + 1) / f19);
                                int iRound2 = Math.round((i62 + 1) / f19);
                                if (iRound <= 0 || iRound2 <= 0) {
                                    throw d55.a();
                                }
                                if (iRound2 != iRound) {
                                    throw d55.a();
                                }
                                int i63 = (int) (f19 / 2.0f);
                                int i64 = i59 + i63;
                                int i65 = i58 + i63;
                                int i66 = (((int) ((iRound - 1) * f19)) + i65) - i61;
                                if (i66 > 0) {
                                    if (i66 > i63) {
                                        throw d55.a();
                                    }
                                    i65 -= i66;
                                }
                                int i67 = (((int) ((iRound2 - 1) * f19)) + i64) - i60;
                                if (i67 > 0) {
                                    if (i67 > i63) {
                                        throw d55.a();
                                    }
                                    i64 -= i67;
                                }
                                k70 k70Var2 = new k70(iRound, iRound2);
                                for (int i68 = 0; i68 < iRound2; i68++) {
                                    int i69 = ((int) (i68 * f19)) + i64;
                                    int i70 = 0;
                                    while (i70 < iRound) {
                                        int i71 = i65;
                                        if (k70VarD4.b(i71 + ((int) (i70 * f19)), i69)) {
                                            k70Var2.i(i70, i68);
                                        }
                                        i70++;
                                        i65 = i71;
                                    }
                                }
                                cj1VarD = yi1Var3.d(k70Var2, map);
                                wc6VarArr3 = e;
                                vc6Var = vc6Var4;
                                vc6Var2 = vc6Var6;
                                i2 = 3;
                            }
                        }
                        i54++;
                    }
                    if (i54 != i53) {
                    }
                    throw d55.a();
                }
                int i72 = 0;
                int i73 = 1;
                k70 k70VarD5 = cj3Var.D();
                wk0 wk0Var2 = new wk0(k70VarD5, (byte) 16);
                xc6 xc6Var = map == null ? null : (xc6) map.get(pi1.NEED_RESULT_POINT_CALLBACK);
                wk0Var2.f2420o = xc6Var;
                ll2 ll2Var = new ll2();
                ll2Var.n = k70VarD5;
                ll2Var.f1375o = new ArrayList();
                ll2Var.p = new int[5];
                ll2Var.q = xc6Var;
                ArrayList arrayList = (ArrayList) ll2Var.f1375o;
                boolean z2 = map != null && map.containsKey(pi1.TRY_HARDER);
                int i74 = k70VarD5.n;
                int i75 = k70VarD5.m;
                int i76 = (i74 * 3) / 388;
                if (i76 < 3 || z2) {
                    i76 = 3;
                }
                int[] iArr4 = new int[5];
                int i77 = i76 - 1;
                boolean zL = false;
                while (i77 < i74 && !zL) {
                    char c7 = c6;
                    Arrays.fill(iArr4, i72);
                    int i78 = i74;
                    int i79 = 0;
                    int i80 = 0;
                    while (i80 < i75) {
                        if (k70VarD5.b(i80, i77)) {
                            int i81 = i76;
                            vc6Var3 = vc6Var4;
                            int i82 = i73;
                            if ((i79 & 1) == i82) {
                                i79++;
                            }
                            iArr4[i79] = iArr4[i79] + i82;
                            i76 = i81;
                        } else {
                            vc6Var3 = vc6Var4;
                            int i83 = i76;
                            if ((i79 & 1) != 0) {
                                iArr4[i79] = iArr4[i79] + 1;
                            } else if (i79 == 4) {
                                if (!ll2.j(iArr4)) {
                                    iArr4[0] = iArr4[2];
                                    iArr4[1] = iArr4[3];
                                    iArr4[2] = iArr4[4];
                                    iArr4[3] = 1;
                                    iArr4[4] = 0;
                                    i76 = i83;
                                    i79 = 3;
                                } else if (ll2Var.k(i77, i80, iArr4)) {
                                    if (ll2Var.m) {
                                        zL = ll2Var.l();
                                        i4 = 2;
                                    } else {
                                        if (arrayList.size() <= 1) {
                                            i3 = i80;
                                            iAbs = 0;
                                            i4 = 2;
                                        } else {
                                            Iterator it = arrayList.iterator();
                                            il2 il2Var4 = null;
                                            while (true) {
                                                if (it.hasNext()) {
                                                    il2 il2Var5 = (il2) it.next();
                                                    Iterator it2 = it;
                                                    i3 = i80;
                                                    if (il2Var5.d >= 2) {
                                                        if (il2Var4 == null) {
                                                            il2Var4 = il2Var5;
                                                        } else {
                                                            ll2Var.m = true;
                                                            i4 = 2;
                                                            iAbs = ((int) (Math.abs(il2Var4.a - il2Var5.a) - Math.abs(il2Var4.b - il2Var5.b))) / 2;
                                                        }
                                                    }
                                                    it = it2;
                                                    i80 = i3;
                                                } else {
                                                    i3 = i80;
                                                    i4 = 2;
                                                    iAbs = 0;
                                                }
                                            }
                                        }
                                        int i84 = iArr4[i4];
                                        if (iAbs > i84) {
                                            i77 += (iAbs - i84) - 2;
                                            i80 = i75 - 1;
                                        } else {
                                            i80 = i3;
                                        }
                                    }
                                    Arrays.fill(iArr4, 0);
                                    i79 = 0;
                                    i76 = i4;
                                } else {
                                    iArr4[0] = iArr4[2];
                                    iArr4[1] = iArr4[3];
                                    iArr4[2] = iArr4[4];
                                    iArr4[3] = 1;
                                    iArr4[4] = 0;
                                    i79 = 3;
                                }
                                i80++;
                                vc6Var4 = vc6Var3;
                                i73 = 1;
                            } else {
                                i79++;
                                iArr4[i79] = iArr4[i79] + 1;
                            }
                            i76 = i83;
                            i80++;
                            vc6Var4 = vc6Var3;
                            i73 = 1;
                        }
                        i80++;
                        vc6Var4 = vc6Var3;
                        i73 = 1;
                    }
                    vc6 vc6Var8 = vc6Var4;
                    int i85 = i76;
                    if (ll2.j(iArr4) && ll2Var.k(i77, i75, iArr4)) {
                        int i86 = iArr4[0];
                        if (ll2Var.m) {
                            i76 = i86;
                            zL = ll2Var.l();
                        } else {
                            i76 = i86;
                        }
                    } else {
                        i76 = i85;
                    }
                    i77 += i76;
                    c6 = c7;
                    i74 = i78;
                    vc6Var4 = vc6Var8;
                    i73 = 1;
                    i72 = 0;
                }
                vc6Var = vc6Var4;
                if (arrayList.size() < 3) {
                    throw d55.a();
                }
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (((il2) it3.next()).d < 2) {
                        it3.remove();
                    }
                }
                Collections.sort(arrayList, ll2.r);
                il2[] il2VarArr = new il2[3];
                int i87 = 0;
                double d3 = Double.MAX_VALUE;
                for (int i88 = 2; i87 < arrayList.size() - i88; i88 = 2) {
                    il2 il2Var6 = (il2) arrayList.get(i87);
                    float f20 = il2Var6.c;
                    i87++;
                    int i89 = i87;
                    while (i89 < arrayList.size() - 1) {
                        il2 il2Var7 = (il2) arrayList.get(i89);
                        double dP = ll2.p(il2Var6, il2Var7);
                        i89++;
                        int i90 = i89;
                        while (i90 < arrayList.size()) {
                            il2 il2Var8 = (il2) arrayList.get(i90);
                            int i91 = i87;
                            if (il2Var8.c <= 1.4f * f20) {
                                double dP2 = ll2.p(il2Var7, il2Var8);
                                double dP3 = ll2.p(il2Var6, il2Var8);
                                if (dP < dP2) {
                                    if (dP2 <= dP3) {
                                        dP3 = dP2;
                                        dP2 = dP3;
                                    } else if (dP >= dP3) {
                                        d2 = dP3;
                                        dP3 = dP;
                                    }
                                    d2 = dP;
                                } else {
                                    if (dP2 >= dP3) {
                                        d2 = dP3;
                                        dP3 = dP2;
                                    } else if (dP < dP3) {
                                        d2 = dP2;
                                        dP2 = dP3;
                                        dP3 = dP;
                                    } else {
                                        d2 = dP2;
                                    }
                                    dP2 = dP;
                                }
                                double dAbs = Math.abs(dP2 - (d2 * 2.0d)) + Math.abs(dP2 - (dP3 * 2.0d));
                                if (dAbs < d3) {
                                    il2VarArr[0] = il2Var6;
                                    il2VarArr[1] = il2Var7;
                                    il2VarArr[2] = il2Var8;
                                    d3 = dAbs;
                                }
                            }
                            i90++;
                            i87 = i91;
                        }
                    }
                }
                if (d3 == Double.MAX_VALUE) {
                    throw d55.a();
                }
                float fA = wc6.a(il2VarArr[0], il2VarArr[1]);
                float fA2 = wc6.a(il2VarArr[1], il2VarArr[2]);
                float fA3 = wc6.a(il2VarArr[0], il2VarArr[2]);
                if (fA2 >= fA && fA2 >= fA3) {
                    il2Var = il2VarArr[0];
                    il2Var2 = il2VarArr[1];
                    il2Var3 = il2VarArr[2];
                } else if (fA3 < fA2 || fA3 < fA) {
                    il2Var = il2VarArr[2];
                    il2Var2 = il2VarArr[0];
                    il2Var3 = il2VarArr[1];
                } else {
                    il2Var = il2VarArr[1];
                    il2Var2 = il2VarArr[0];
                    il2Var3 = il2VarArr[2];
                }
                float f21 = il2Var.a;
                float f22 = il2Var.b;
                if (((il2Var2.b - f22) * (il2Var3.a - f21)) - ((il2Var2.a - f21) * (il2Var3.b - f22)) < 0.0f) {
                    il2 il2Var9 = il2Var3;
                    il2Var3 = il2Var2;
                    il2Var2 = il2Var9;
                }
                il2VarArr[0] = il2Var2;
                il2VarArr[1] = il2Var;
                il2VarArr[2] = il2Var3;
                float fN = wk0Var2.n(il2Var, il2Var3);
                float f23 = il2Var.a;
                float f24 = il2Var3.b;
                float f25 = il2Var3.a;
                float fN2 = wk0Var2.n(il2Var, il2Var2);
                float f26 = il2Var2.b;
                float f27 = il2Var2.a;
                float f28 = (fN2 + fN) / 2.0f;
                if (f28 < 1.0f) {
                    throw d55.a();
                }
                int iV = (xs1.V(wc6.a(il2Var, il2Var2) / f28) + xs1.V(wc6.a(il2Var, il2Var3) / f28)) / 2;
                int i92 = iV + 7;
                int i93 = i92 & 3;
                if (i93 == 0) {
                    i92 = iV + 8;
                } else if (i93 == 2) {
                    i92 = iV + 6;
                } else if (i93 == 3) {
                    i92 = iV + 5;
                }
                int i94 = i92;
                int[] iArr5 = xc8.e;
                if (i94 % 4 != 1) {
                    throw at2.a();
                }
                try {
                    xc8 xc8VarC = xc8.c((i94 - 17) / 4);
                    int i95 = (xc8VarC.a * 4) + 10;
                    if (xc8VarC.b.length > 0) {
                        float f29 = (f25 - f23) + f27;
                        vc6Var2 = vc6Var6;
                        float f30 = (f24 - f22) + f26;
                        float f31 = 1.0f - (3.0f / i95);
                        int iC = (int) ua5.c(f29, f23, f31, f23);
                        int iC2 = (int) ua5.c(f30, f22, f31, f22);
                        f = f23;
                        int i96 = 4;
                        while (true) {
                            if (i96 <= 16) {
                                try {
                                    neVarO = wk0Var2.o(f28, i96, iC, iC2);
                                } catch (d55 unused) {
                                    i96 <<= 1;
                                }
                            }
                        }
                        f2 = i94 - 3.5f;
                        if (neVarO != null) {
                            f3 = neVarO.a;
                            f4 = neVarO.b;
                            f5 = f2 - 3.0f;
                        } else {
                            f3 = (f25 - f) + f27;
                            f4 = (f24 - f22) + f26;
                            f5 = f2;
                        }
                        k70 k70VarK0 = ck3.k0(k70VarD5, i94, i94, nk5.a(3.5f, 3.5f, f2, 3.5f, f5, f5, 3.5f, f2, il2Var.a, il2Var.b, il2Var3.a, il2Var3.b, f3, f4, il2Var2.a, il2Var2.b));
                        if (neVarO == null) {
                            i2 = 3;
                            wc6VarArr2 = new wc6[]{il2Var2, il2Var, il2Var3};
                        } else {
                            i2 = 3;
                            wc6VarArr2 = new wc6[]{il2Var2, il2Var, il2Var3, neVarO};
                        }
                        cj1VarD = yi1Var3.d(k70VarK0, map);
                        wc6VarArr3 = wc6VarArr2;
                    } else {
                        vc6Var2 = vc6Var6;
                        f = f23;
                    }
                    neVarO = null;
                    f2 = i94 - 3.5f;
                    if (neVarO != null) {
                        f3 = neVarO.a;
                        f4 = neVarO.b;
                        f5 = f2 - 3.0f;
                    } else {
                        f3 = (f25 - f) + f27;
                        f4 = (f24 - f22) + f26;
                        f5 = f2;
                    }
                    k70 k70VarK1 = ck3.k0(k70VarD5, i94, i94, nk5.a(3.5f, 3.5f, f2, 3.5f, f5, f5, 3.5f, f2, il2Var.a, il2Var.b, il2Var3.a, il2Var3.b, f3, f4, il2Var2.a, il2Var2.b));
                    if (neVarO == null) {
                        i2 = 3;
                        wc6VarArr2 = new wc6[]{il2Var2, il2Var, il2Var3};
                    } else {
                        i2 = 3;
                        wc6VarArr2 = new wc6[]{il2Var2, il2Var, il2Var3, neVarO};
                    }
                    cj1VarD = yi1Var3.d(k70VarK1, map);
                    wc6VarArr3 = wc6VarArr2;
                } catch (IllegalArgumentException unused2) {
                    throw at2.a();
                }
                int i97 = cj1VarD.h;
                if ((cj1VarD.g instanceof ux5) && wc6VarArr3.length >= i2) {
                    wc6 wc6Var23 = wc6VarArr3[0];
                    wc6VarArr3[0] = wc6VarArr3[2];
                    wc6VarArr3[2] = wc6Var23;
                }
                uc6 uc6Var3 = new uc6(cj1VarD.b, cj1VarD.a, wc6VarArr3, v20.x);
                List list2 = cj1VarD.c;
                if (list2 != null) {
                    uc6Var3.b(vc6Var5, list2);
                }
                String str4 = cj1VarD.d;
                if (str4 != null) {
                    uc6Var3.b(vc6Var7, str4);
                }
                if (i97 >= 0 && (i5 = cj1VarD.i) >= 0) {
                    uc6Var3.b(vc6.w, Integer.valueOf(i5));
                    uc6Var3.b(vc6.x, Integer.valueOf(i97));
                }
                uc6Var3.b(vc6Var2, cj1VarD.e);
                uc6Var3.b(vc6Var, "]Q" + cj1VarD.j);
                return uc6Var3;
        }
    }

    @Override // o.n36
    public final void reset() {
        byte b = this.a;
    }
}
