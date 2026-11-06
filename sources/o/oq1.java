package o;

/* JADX INFO: loaded from: classes.dex */
public final class oq1 {
    public static final int[] g = {3808, 476, 2107, 1799};
    public final k70 a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;

    public oq1(k70 k70Var) {
        this.a = k70Var;
    }

    public static wc6[] b(wc6[] wc6VarArr, int i, int i2) {
        float f = i2 / (i * 2.0f);
        wc6 wc6Var = wc6VarArr[0];
        float f2 = wc6Var.a;
        wc6 wc6Var2 = wc6VarArr[2];
        float f3 = wc6Var2.a;
        float f4 = f2 - f3;
        float f5 = wc6Var.b;
        float f6 = wc6Var2.b;
        float f7 = f5 - f6;
        float f8 = (f2 + f3) / 2.0f;
        float f9 = (f5 + f6) / 2.0f;
        float f10 = f4 * f;
        float f11 = f7 * f;
        wc6 wc6Var3 = new wc6(f8 + f10, f9 + f11);
        wc6 wc6Var4 = new wc6(f8 - f10, f9 - f11);
        wc6 wc6Var5 = wc6VarArr[1];
        float f12 = wc6Var5.a;
        wc6 wc6Var6 = wc6VarArr[3];
        float f13 = wc6Var6.a;
        float f14 = f12 - f13;
        float f15 = wc6Var5.b;
        float f16 = wc6Var6.b;
        float f17 = f15 - f16;
        float f18 = (f12 + f13) / 2.0f;
        float f19 = (f15 + f16) / 2.0f;
        float f20 = f14 * f;
        float f21 = f * f17;
        return new wc6[]{wc6Var3, new wc6(f18 + f20, f19 + f21), wc6Var4, new wc6(f18 - f20, f19 - f21)};
    }

    public final f10 a(boolean z) throws d55 {
        wc6 wc6VarB;
        wc6 wc6Var;
        wc6 wc6Var2;
        wc6 wc6Var3;
        int iV;
        int iV2;
        char c;
        wc6 wc6VarB2;
        wc6 wc6VarB3;
        wc6 wc6Var4;
        wc6 wc6Var5;
        lf1 lf1Var;
        boolean z2;
        lf1 lf1Var2;
        lf1 lf1Var3;
        lf1 lf1Var4;
        int i;
        int i2;
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        int i7;
        k70 k70Var = this.a;
        char c3 = 3;
        int i8 = -1;
        byte b = 1;
        try {
            try {
                wc6[] wc6VarArrB = new xi8(k70Var).b();
                wc6Var2 = wc6VarArrB[0];
                wc6Var3 = wc6VarArrB[1];
                wc6Var = wc6VarArrB[2];
                wc6VarB = wc6VarArrB[3];
                while (true) {
                    i = lf1Var4.c;
                    i2 = lf1Var4.b;
                    c2 = c3;
                    i3 = lf1Var.c;
                    char c4 = c;
                    i4 = lf1Var.b;
                    if (this.e >= 9) {
                        break;
                    }
                    lf1 lf1VarE = e(lf1Var, z2, b, i8);
                    int i9 = lf1VarE.c;
                    int i10 = lf1VarE.b;
                    lf1 lf1VarE2 = e(lf1Var2, z2, b, b);
                    lf1 lf1VarE3 = e(lf1Var3, z2, i8, b);
                    lf1 lf1VarE4 = e(lf1Var4, z2, i8, i8);
                    int i11 = lf1VarE4.c;
                    byte b2 = b;
                    int i12 = lf1VarE4.b;
                    boolean z3 = z2;
                    if (this.e > 2) {
                        double dC = (xs1.C(i12, i11, i10, i9) * this.e) / (xs1.C(i2, i, i4, i3) * (this.e + 2));
                        if (dC < 0.75d || dC > 1.25d) {
                            break;
                        }
                        lf1 lf1Var5 = new lf1(Math.max(0, i10 - 3), Math.min(k70Var.n - 1, i9 + 3), b2);
                        lf1 lf1Var6 = new lf1(Math.max(0, lf1VarE2.b - 3), Math.max(0, lf1VarE2.c - 3), (byte) 1);
                        lf1 lf1Var7 = new lf1(Math.min(k70Var.m - 1, lf1VarE3.b + 3), Math.max(0, Math.min(k70Var.n - 1, lf1VarE3.c - 3)), (byte) 1);
                        lf1 lf1Var8 = new lf1(Math.min(k70Var.m - 1, i12 + 3), Math.min(k70Var.n - 1, i11 + 3), (byte) 1);
                        int iC = c(lf1Var8, lf1Var5);
                        if (iC == 0 || c(lf1Var5, lf1Var6) != iC || c(lf1Var6, lf1Var7) != iC || c(lf1Var7, lf1Var8) != iC) {
                            break;
                        }
                    }
                    z2 = !z3;
                    this.e++;
                    c3 = c2;
                    c = c4;
                    lf1Var = lf1VarE;
                    lf1Var4 = lf1VarE4;
                    lf1Var2 = lf1VarE2;
                    lf1Var3 = lf1VarE3;
                    i8 = -1;
                    b = 1;
                }
            } catch (d55 unused) {
                int i13 = k70Var.m / 2;
                int i14 = k70Var.n / 2;
                int i15 = i13 + 7;
                int i16 = i14 - 7;
                wc6 wc6VarB4 = e(new lf1(i15, i16, (byte) 1), false, 1, -1).b();
                int i17 = i14 + 7;
                wc6 wc6VarB5 = e(new lf1(i15, i17, (byte) 1), false, 1, 1).b();
                int i18 = i13 - 7;
                wc6 wc6VarB6 = e(new lf1(i18, i17, (byte) 1), false, -1, 1).b();
                wc6VarB = e(new lf1(i18, i16, (byte) 1), false, -1, -1).b();
                wc6Var = wc6VarB6;
                wc6Var2 = wc6VarB4;
                wc6Var3 = wc6VarB5;
            }
            wc6[] wc6VarArrB2 = new xi8(k70Var, 15, iV, iV2).b();
            wc6Var5 = wc6VarArrB2[0];
            wc6Var4 = wc6VarArrB2[1];
            wc6VarB2 = wc6VarArrB2[2];
            wc6VarB3 = wc6VarArrB2[3];
        } catch (d55 unused2) {
            int i19 = iV + 7;
            int i20 = iV2 - 7;
            wc6 wc6VarB7 = e(new lf1(i19, i20, (byte) 1), false, 1, -1).b();
            int i21 = iV2 + 7;
            wc6 wc6VarB8 = e(new lf1(i19, i21, (byte) 1), false, 1, 1).b();
            int i22 = iV - 7;
            wc6VarB2 = e(new lf1(i22, i21, (byte) 1), false, -1, 1).b();
            wc6VarB3 = e(new lf1(i22, i20, (byte) 1), false, -1, -1).b();
            wc6Var4 = wc6VarB8;
            wc6Var5 = wc6VarB7;
        }
        iV = xs1.V((((wc6Var2.a + wc6VarB.a) + wc6Var3.a) + wc6Var.a) / 4.0f);
        iV2 = xs1.V((((wc6Var2.b + wc6VarB.b) + wc6Var3.b) + wc6Var.b) / 4.0f);
        c = 15;
        lf1Var = new lf1(xs1.V((((wc6Var5.a + wc6VarB3.a) + wc6Var4.a) + wc6VarB2.a) / 4.0f), xs1.V((((wc6Var5.b + wc6VarB3.b) + wc6Var4.b) + wc6VarB2.b) / 4.0f), (byte) 1);
        this.e = 1;
        z2 = true;
        lf1Var2 = lf1Var;
        lf1Var3 = lf1Var2;
        lf1Var4 = lf1Var3;
        int i23 = this.e;
        if (i23 != 5 && i23 != 7) {
            throw d55.a();
        }
        this.b = i23 == 5;
        int i24 = i23 * 2;
        wc6[] wc6VarArrB3 = b(new wc6[]{new wc6(i4 + 0.5f, i3 - 0.5f), new wc6(lf1Var2.b + 0.5f, lf1Var2.c + 0.5f), new wc6(lf1Var3.b - 0.5f, lf1Var3.c + 0.5f), new wc6(i2 - 0.5f, i - 0.5f)}, i24 - 3, i24);
        if (z) {
            wc6 wc6Var6 = wc6VarArrB3[0];
            wc6VarArrB3[0] = wc6VarArrB3[2];
            wc6VarArrB3[2] = wc6Var6;
        }
        if (!g(wc6VarArrB3[0]) || !g(wc6VarArrB3[1]) || !g(wc6VarArrB3[2]) || !g(wc6VarArrB3[c2])) {
            throw d55.a();
        }
        int i25 = this.e * 2;
        int[] iArr = {h(wc6VarArrB3[0], wc6VarArrB3[1], i25), h(wc6VarArrB3[1], wc6VarArrB3[2], i25), h(wc6VarArrB3[2], wc6VarArrB3[c2], i25), h(wc6VarArrB3[c2], wc6VarArrB3[0], i25)};
        int i26 = 0;
        for (int i27 = 0; i27 < 4; i27++) {
            int i28 = iArr[i27];
            i26 = (i26 << 3) + ((i28 >> (i25 - 2)) << 1) + (i28 & 1);
        }
        int i29 = ((i26 & 1) << 11) + (i26 >> 1);
        for (int i30 = 0; i30 < 4; i30++) {
            if (Integer.bitCount(g[i30] ^ i29) <= 2) {
                this.f = i30;
                long j2 = 0;
                int i31 = 0;
                while (true) {
                    i5 = 10;
                    if (i31 >= 4) {
                        break;
                    }
                    int i32 = iArr[(this.f + i31) % 4];
                    if (this.b) {
                        j = j2 << 7;
                        i7 = (i32 >> 1) & 127;
                    } else {
                        j = j2 << 10;
                        i7 = ((i32 >> 2) & 992) + ((i32 >> 1) & 31);
                    }
                    j2 = j + ((long) i7);
                    i31++;
                }
                if (this.b) {
                    i5 = 7;
                    i6 = 2;
                } else {
                    i6 = 4;
                }
                int i33 = i5 - i6;
                int[] iArr2 = new int[i5];
                for (int i34 = i5 - 1; i34 >= 0; i34--) {
                    iArr2[i34] = ((int) j2) & 15;
                    j2 >>= 4;
                }
                try {
                    int iX = new g95(xy2.k).x(iArr2, i33);
                    int i35 = 0;
                    for (int i36 = 0; i36 < i6; i36++) {
                        i35 = (i35 << 4) + iArr2[i36];
                    }
                    if (this.b) {
                        this.c = (i35 >> 6) + 1;
                        this.d = (i35 & 63) + 1;
                    } else {
                        this.c = (i35 >> 11) + 1;
                        this.d = (i35 & 2047) + 1;
                    }
                    int i37 = this.f;
                    wc6 wc6Var7 = wc6VarArrB3[i37 % 4];
                    wc6 wc6Var8 = wc6VarArrB3[(i37 + 1) % 4];
                    wc6 wc6Var9 = wc6VarArrB3[(i37 + 2) % 4];
                    wc6 wc6Var10 = wc6VarArrB3[(i37 + 3) % 4];
                    int iD = d();
                    float f = iD / 2.0f;
                    float f2 = this.e;
                    float f3 = f - f2;
                    float f4 = f + f2;
                    return new f10(ck3.k0(k70Var, iD, iD, nk5.a(f3, f3, f4, f3, f4, f4, f3, f4, wc6Var7.a, wc6Var7.b, wc6Var8.a, wc6Var8.b, wc6Var9.a, wc6Var9.b, wc6Var10.a, wc6Var10.b)), b(wc6VarArrB3, this.e * 2, d()), this.b, this.d, this.c, iX);
                } catch (f76 unused3) {
                    throw d55.a();
                }
            }
        }
        throw d55.a();
    }

    public final int c(lf1 lf1Var, lf1 lf1Var2) {
        int i = lf1Var.b;
        int i2 = lf1Var.c;
        int i3 = lf1Var2.b;
        int i4 = lf1Var2.c;
        float fC = xs1.C(i, i2, i3, i4);
        if (fC != 0.0f) {
            float f = (i3 - i) / fC;
            float f2 = (i4 - i2) / fC;
            float f3 = i;
            float f4 = i2;
            k70 k70Var = this.a;
            boolean zB = k70Var.b(i, i2);
            int iFloor = (int) Math.floor(fC);
            int i5 = 0;
            for (int i6 = 0; i6 < iFloor; i6++) {
                if (k70Var.b(xs1.V(f3), xs1.V(f4)) != zB) {
                    i5++;
                }
                f3 += f;
                f4 += f2;
            }
            float f5 = i5 / fC;
            if (f5 <= 0.1f || f5 >= 0.9f) {
                return (f5 <= 0.1f) == zB ? 1 : -1;
            }
        }
        return 0;
    }

    public final int d() {
        boolean z = this.b;
        int i = this.c;
        if (z) {
            return (i * 4) + 11;
        }
        return ((((i * 2) + 6) / 15) * 2) + (i * 4) + 15;
    }

    public final lf1 e(lf1 lf1Var, boolean z, int i, int i2) {
        k70 k70Var;
        int i3 = lf1Var.b + i;
        int i4 = lf1Var.c;
        while (true) {
            i4 += i2;
            boolean zF = f(i3, i4);
            k70Var = this.a;
            if (!zF || k70Var.b(i3, i4) != z) {
                break;
            }
            i3 += i;
        }
        int i5 = i3 - i;
        int i6 = i4 - i2;
        while (f(i5, i6) && k70Var.b(i5, i6) == z) {
            i5 += i;
        }
        int i7 = i5 - i;
        while (f(i7, i6) && k70Var.b(i7, i6) == z) {
            i6 += i2;
        }
        return new lf1(i7, i6 - i2, (byte) 1);
    }

    public final boolean f(int i, int i2) {
        if (i < 0) {
            return false;
        }
        k70 k70Var = this.a;
        return i < k70Var.m && i2 >= 0 && i2 < k70Var.n;
    }

    public final boolean g(wc6 wc6Var) {
        return f(xs1.V(wc6Var.a), xs1.V(wc6Var.b));
    }

    public final int h(wc6 wc6Var, wc6 wc6Var2, int i) {
        float f = wc6Var.a;
        float f2 = wc6Var.b;
        float f3 = wc6Var2.a;
        float f4 = wc6Var2.b;
        float fB = xs1.B(f, f2, f3, f4);
        float f5 = fB / i;
        float f6 = wc6Var.a;
        float f7 = ((wc6Var2.a - f6) * f5) / fB;
        float f8 = ((f4 - f2) * f5) / fB;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f9 = i3;
            if (this.a.b(xs1.V((f9 * f7) + f6), xs1.V((f9 * f8) + f2))) {
                i2 |= 1 << ((i - i3) - 1);
            }
        }
        return i2;
    }
}
