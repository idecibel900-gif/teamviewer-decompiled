package o;

/* JADX INFO: loaded from: classes.dex */
public final class jc8 implements gc8 {
    public final jw4 m;
    public final kw4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final short f1149o;
    public final p72 p;
    public int[] q = fc8.a;
    public float[] r;
    public qo s;
    public qo t;
    public qo u;
    public qo v;
    public float[] w;
    public float[] x;
    public df6 y;

    /* JADX WARN: Multi-variable type inference failed */
    public jc8(jw4 jw4Var, kw4 kw4Var, int i, p72 p72Var) {
        this.m = jw4Var;
        this.n = kw4Var;
        this.f1149o = i;
        this.p = p72Var;
        float[] fArr = fc8.b;
        this.r = fArr;
        this.w = fArr;
        this.x = fArr;
        this.y = fc8.c;
    }

    public final int c(int i) {
        int i2;
        jw4 jw4Var = this.m;
        int i3 = jw4Var.b;
        int i4 = 0;
        if (i3 <= 0) {
            hk0.r("");
            return 0;
        }
        int i5 = i3 - 1;
        while (true) {
            if (i4 <= i5) {
                i2 = (i4 + i5) >>> 1;
                int i6 = jw4Var.a[i2];
                if (i6 >= i) {
                    if (i6 <= i) {
                        break;
                    }
                    i5 = i2 - 1;
                } else {
                    i4 = i2 + 1;
                }
            } else {
                i2 = -(i4 + 1);
                break;
            }
        }
        return i2 < -1 ? -(i2 + 2) : i2;
    }

    public final float d(int i, int i2, boolean z) {
        p72 p72Var;
        float f;
        jw4 jw4Var = this.m;
        if (i >= jw4Var.b - 1) {
            f = i2;
        } else {
            int iC = jw4Var.c(i);
            int iC2 = jw4Var.c(i + 1);
            if (i2 != iC) {
                int i3 = iC2 - iC;
                ic8 ic8Var = (ic8) this.n.b(iC);
                if (ic8Var == null || (p72Var = ic8Var.b) == null) {
                    p72Var = this.p;
                }
                float f2 = i3;
                float fB = p72Var.b((i2 - iC) / f2);
                return z ? fB : ((f2 * fB) + iC) / 1000.0f;
            }
            f = iC;
        }
        return f / 1000.0f;
    }

    public final void e(qo qoVar, qo qoVar2, qo qoVar3) {
        float[] fArr;
        boolean z = this.y != fc8.c;
        qo qoVar4 = this.s;
        kw4 kw4Var = this.n;
        jw4 jw4Var = this.m;
        if (qoVar4 == null) {
            this.s = qoVar.c();
            this.t = qoVar3.c();
            int i = jw4Var.b;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = jw4Var.c(i2) / 1000.0f;
            }
            this.r = fArr2;
            int i3 = jw4Var.b;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = 0;
            }
            this.q = iArr;
        }
        if (z) {
            if (this.y != fc8.c && im3.n(this.u, qoVar) && im3.n(this.v, qoVar2)) {
                return;
            }
            this.u = qoVar;
            this.v = qoVar2;
            int iB = qoVar.b() + (qoVar.b() % 2);
            this.w = new float[iB];
            this.x = new float[iB];
            int i5 = jw4Var.b;
            float[][] fArr3 = new float[i5][];
            for (int i6 = 0; i6 < i5; i6++) {
                int iC = jw4Var.c(i6);
                ic8 ic8Var = (ic8) kw4Var.b(iC);
                if (iC == 0 && ic8Var == null) {
                    fArr = new float[iB];
                    for (int i7 = 0; i7 < iB; i7++) {
                        fArr[i7] = qoVar.a(i7);
                    }
                } else if (iC == this.f1149o && ic8Var == null) {
                    fArr = new float[iB];
                    for (int i8 = 0; i8 < iB; i8++) {
                        fArr[i8] = qoVar2.a(i8);
                    }
                } else {
                    ic8Var.getClass();
                    qo qoVar5 = ic8Var.a;
                    float[] fArr4 = new float[iB];
                    for (int i9 = 0; i9 < iB; i9++) {
                        fArr4[i9] = qoVar5.a(i9);
                    }
                    fArr = fArr4;
                }
                fArr3[i6] = fArr;
            }
            this.y = new df6(this.q, this.r, fArr3);
        }
    }

    @Override // o.ec8
    public final qo h(long j, qo qoVar, qo qoVar2, qo qoVar3) {
        long j2 = j / 1000000;
        int[] iArr = fc8.a;
        long j3 = this.f1149o;
        if (j2 < 0) {
            j2 = 0;
        }
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 < 0) {
            return qoVar3;
        }
        e(qoVar, qoVar2, qoVar3);
        qo qoVar4 = this.t;
        qoVar4.getClass();
        int i = 0;
        if (this.y != fc8.c) {
            int i2 = (int) j4;
            float fD = d(c(i2), i2, false);
            float[] fArr = this.x;
            wv[][] wvVarArr = (wv[][]) this.y.n;
            float f = wvVarArr[0][0].a;
            float f2 = wvVarArr[wvVarArr.length - 1][0].b;
            if (fD < f) {
                fD = f;
            }
            if (fD <= f2) {
                f2 = fD;
            }
            int length = fArr.length;
            boolean z = false;
            for (wv[] wvVarArr2 : wvVarArr) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < length - 1) {
                    wv wvVar = wvVarArr2[i4];
                    if (f2 <= wvVar.b) {
                        if (wvVar.p) {
                            fArr[i3] = wvVar.q;
                            fArr[i3 + 1] = wvVar.r;
                        } else {
                            wvVar.c(f2);
                            fArr[i3] = wvVar.a();
                            fArr[i3 + 1] = wvVar.b();
                        }
                        z = true;
                    }
                    i3 += 2;
                    i4++;
                }
                if (z) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i < length2) {
                qoVar4.e(i, fArr[i]);
                i++;
            }
        } else {
            qo qoVarU = u((j4 - 1) * 1000000, qoVar, qoVar2, qoVar3);
            qo qoVarU2 = u(j4 * 1000000, qoVar, qoVar2, qoVar3);
            int iB = qoVarU.b();
            while (i < iB) {
                qoVar4.e(i, (qoVarU.a(i) - qoVarU2.a(i)) * 1000.0f);
                i++;
            }
        }
        return qoVar4;
    }

    @Override // o.gc8
    public final int n() {
        return 0;
    }

    @Override // o.ec8
    public final qo u(long j, qo qoVar, qo qoVar2, qo qoVar3) {
        qo qoVar4;
        qo qoVar5;
        qo qoVar6 = qoVar;
        long j2 = j / 1000000;
        int[] iArr = fc8.a;
        short s = this.f1149o;
        long j3 = s;
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 <= j3) {
            j3 = j2;
        }
        int i = (int) j3;
        kw4 kw4Var = this.n;
        ic8 ic8Var = (ic8) kw4Var.b(i);
        if (ic8Var != null) {
            return ic8Var.a;
        }
        if (i >= s) {
            return qoVar2;
        }
        if (i <= 0) {
            return qoVar6;
        }
        e(qoVar6, qoVar2, qoVar3);
        qo qoVar7 = this.s;
        qoVar7.getClass();
        int i2 = 0;
        if (this.y != fc8.c) {
            float fD = d(c(i), i, false);
            float[] fArr = this.w;
            wv[][] wvVarArr = (wv[][]) this.y.n;
            int length = wvVarArr.length - 1;
            float f = wvVarArr[0][0].a;
            float f2 = wvVarArr[length][0].b;
            int length2 = fArr.length;
            if (fD < f || fD > f2) {
                if (fD > f2) {
                    f = f2;
                } else {
                    length = 0;
                }
                float f3 = fD - f;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length2 - 1) {
                    wv wvVar = wvVarArr[length][i4];
                    boolean z = wvVar.p;
                    float f4 = wvVar.r;
                    float f5 = wvVar.q;
                    if (z) {
                        float f6 = wvVar.a;
                        float f7 = wvVar.k;
                        float f8 = wvVar.c;
                        fArr[i3] = (f5 * f3) + ua5.c(wvVar.e, f8, (f - f6) * f7, f8);
                        float f9 = (f - f6) * f7;
                        float f10 = wvVar.d;
                        fArr[i3 + 1] = (f4 * f3) + ua5.c(wvVar.f, f10, f9, f10);
                    } else {
                        wvVar.c(f);
                        fArr[i3] = (wvVar.a() * f3) + (wvVar.n * wvVar.h) + f5;
                        fArr[i3 + 1] = (wvVar.b() * f3) + (wvVar.f2447o * wvVar.i) + f4;
                    }
                    i3 += 2;
                    i4++;
                    wvVarArr = wvVarArr;
                }
            } else {
                int length3 = wvVarArr.length;
                int i5 = 0;
                boolean z2 = false;
                while (i5 < length3) {
                    int i6 = i2;
                    int i7 = i6;
                    while (i6 < length2 - 1) {
                        wv wvVar2 = wvVarArr[i5][i7];
                        if (fD <= wvVar2.b) {
                            if (wvVar2.p) {
                                float f11 = wvVar2.a;
                                float f12 = wvVar2.k;
                                float f13 = wvVar2.c;
                                fArr[i6] = ua5.c(wvVar2.e, f13, (fD - f11) * f12, f13);
                                float f14 = wvVar2.d;
                                fArr[i6 + 1] = ua5.c(wvVar2.f, f14, (fD - f11) * f12, f14);
                            } else {
                                wvVar2.c(fD);
                                fArr[i6] = (wvVar2.n * wvVar2.h) + wvVar2.q;
                                fArr[i6 + 1] = (wvVar2.f2447o * wvVar2.i) + wvVar2.r;
                            }
                            z2 = true;
                        }
                        i6 += 2;
                        i7++;
                    }
                    if (z2) {
                        break;
                    }
                    i5++;
                    i2 = 0;
                }
            }
            int length4 = fArr.length;
            for (int i8 = 0; i8 < length4; i8++) {
                qoVar7.e(i8, fArr[i8]);
            }
        } else {
            int iC = c(i);
            float fD2 = d(iC, i, true);
            jw4 jw4Var = this.m;
            ic8 ic8Var2 = (ic8) kw4Var.b(jw4Var.c(iC));
            if (ic8Var2 != null && (qoVar5 = ic8Var2.a) != null) {
                qoVar6 = qoVar5;
            }
            ic8 ic8Var3 = (ic8) kw4Var.b(jw4Var.c(iC + 1));
            if (ic8Var3 == null || (qoVar4 = ic8Var3.a) == null) {
                qoVar4 = qoVar2;
            }
            int iB = qoVar7.b();
            for (int i9 = 0; i9 < iB; i9++) {
                qoVar7.e(i9, (qoVar4.a(i9) * fD2) + ((1.0f - fD2) * qoVar6.a(i9)));
            }
        }
        return qoVar7;
    }

    @Override // o.gc8
    public final int v() {
        return this.f1149o;
    }
}
