package o;

/* JADX INFO: loaded from: classes.dex */
public final class xi8 {
    public final k70 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public xi8(k70 k70Var, int i, int i2, int i3) throws d55 {
        this.a = k70Var;
        int i4 = k70Var.n;
        this.b = i4;
        int i5 = k70Var.m;
        this.c = i5;
        int i6 = i / 2;
        int i7 = i2 - i6;
        this.d = i7;
        int i8 = i2 + i6;
        this.e = i8;
        int i9 = i3 - i6;
        this.g = i9;
        int i10 = i3 + i6;
        this.f = i10;
        if (i9 < 0 || i7 < 0 || i10 >= i4 || i8 >= i5) {
            throw d55.a();
        }
    }

    public final boolean a(int i, int i2, int i3, boolean z) {
        k70 k70Var = this.a;
        if (z) {
            while (i <= i2) {
                if (k70Var.b(i, i3)) {
                    return true;
                }
                i++;
            }
            return false;
        }
        while (i <= i2) {
            if (k70Var.b(i3, i)) {
                return true;
            }
            i++;
        }
        return false;
    }

    public final wc6[] b() throws d55 {
        int i;
        int i2;
        int i3 = this.d;
        int i4 = this.e;
        int i5 = this.g;
        int i6 = this.f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = true;
        while (true) {
            i = this.c;
            if (!z6) {
                break;
            }
            boolean z7 = false;
            boolean zA = true;
            while (true) {
                if ((!zA && z2) || i4 >= i) {
                    break;
                }
                zA = a(i5, i6, i4, false);
                if (zA) {
                    i4++;
                    z2 = true;
                    z7 = true;
                } else if (!z2) {
                    i4++;
                }
            }
            if (i4 < i) {
                boolean zA2 = true;
                while (true) {
                    i2 = this.b;
                    if ((!zA2 && z3) || i6 >= i2) {
                        break;
                    }
                    zA2 = a(i3, i4, i6, true);
                    if (zA2) {
                        i6++;
                        z3 = true;
                        z7 = true;
                    } else if (!z3) {
                        i6++;
                    }
                }
                if (i6 < i2) {
                    boolean zA3 = true;
                    while (true) {
                        if ((!zA3 && z4) || i3 < 0) {
                            break;
                        }
                        zA3 = a(i5, i6, i3, false);
                        if (zA3) {
                            i3--;
                            z4 = true;
                            z7 = true;
                        } else if (!z4) {
                            i3--;
                        }
                    }
                    if (i3 >= 0) {
                        z6 = z7;
                        boolean zA4 = true;
                        while (true) {
                            if ((!zA4 && z5) || i5 < 0) {
                                break;
                            }
                            zA4 = a(i3, i4, i5, true);
                            if (zA4) {
                                i5--;
                                z6 = true;
                                z5 = true;
                            } else if (!z5) {
                                i5--;
                            }
                        }
                        if (i5 < 0) {
                        }
                    }
                }
            }
            z = true;
            break;
        }
        if (z) {
            throw d55.a();
        }
        int i7 = i4 - i3;
        wc6 wc6VarC = null;
        wc6 wc6VarC2 = null;
        for (int i8 = 1; wc6VarC2 == null && i8 < i7; i8++) {
            wc6VarC2 = c(i3, i6 - i8, i3 + i8, i6);
        }
        if (wc6VarC2 == null) {
            throw d55.a();
        }
        wc6 wc6VarC3 = null;
        for (int i9 = 1; wc6VarC3 == null && i9 < i7; i9++) {
            wc6VarC3 = c(i3, i5 + i9, i3 + i9, i5);
        }
        if (wc6VarC3 == null) {
            throw d55.a();
        }
        wc6 wc6VarC4 = null;
        for (int i10 = 1; wc6VarC4 == null && i10 < i7; i10++) {
            wc6VarC4 = c(i4, i5 + i10, i4 - i10, i5);
        }
        if (wc6VarC4 == null) {
            throw d55.a();
        }
        for (int i11 = 1; wc6VarC == null && i11 < i7; i11++) {
            wc6VarC = c(i4, i6 - i11, i4 - i11, i6);
        }
        if (wc6VarC == null) {
            throw d55.a();
        }
        float f = wc6VarC.a;
        float f2 = wc6VarC.b;
        float f3 = wc6VarC2.a;
        float f4 = wc6VarC2.b;
        float f5 = wc6VarC4.a;
        float f6 = wc6VarC4.b;
        float f7 = wc6VarC3.a;
        float f8 = wc6VarC3.b;
        return f < ((float) i) / 2.0f ? new wc6[]{new wc6(f7 - 1.0f, f8 + 1.0f), new wc6(f3 + 1.0f, f4 + 1.0f), new wc6(f5 - 1.0f, f6 - 1.0f), new wc6(f + 1.0f, f2 - 1.0f)} : new wc6[]{new wc6(f7 + 1.0f, f8 + 1.0f), new wc6(f3 + 1.0f, f4 - 1.0f), new wc6(f5 - 1.0f, f6 + 1.0f), new wc6(f - 1.0f, f2 - 1.0f)};
    }

    public final wc6 c(float f, float f2, float f3, float f4) {
        int iV = xs1.V(xs1.B(f, f2, f3, f4));
        float f5 = iV;
        float f6 = (f3 - f) / f5;
        float f7 = (f4 - f2) / f5;
        for (int i = 0; i < iV; i++) {
            float f8 = i;
            int iV2 = xs1.V((f8 * f6) + f);
            int iV3 = xs1.V((f8 * f7) + f2);
            if (this.a.b(iV2, iV3)) {
                return new wc6(iV2, iV3);
            }
        }
        return null;
    }

    public xi8(k70 k70Var) {
        this(k70Var, 10, k70Var.m / 2, k70Var.n / 2);
    }
}
