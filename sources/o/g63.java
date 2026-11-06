package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class g63 extends zi8 {
    public static final int[] k = new int[2];

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0268  */
    /* JADX WARN: Code duplicated, block: B:118:0x0278  */
    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    @Override // o.pn1
    public final void a(pn1 pn1Var) {
        float f;
        int iG;
        int i;
        int iG2;
        float f2;
        float f3;
        float f4;
        int i2;
        if (ua5.B(this.j) == 3) {
            n61 n61Var = this.b;
            l(n61Var.H, n61Var.J, 0);
            return;
        }
        k12 k12Var = this.e;
        boolean z = k12Var.j;
        tn1 tn1Var = this.h;
        tn1 tn1Var2 = this.i;
        if (z || this.d != 3) {
            f = 0.5f;
        } else {
            n61 n61Var2 = this.b;
            int i3 = n61Var2.r;
            if (i3 == 2) {
                f = 0.5f;
                o61 o61Var = n61Var2.S;
                if (o61Var != null) {
                    k12 k12Var2 = o61Var.d.e;
                    if (k12Var2.j) {
                        k12Var.d((int) ((k12Var2.g * n61Var2.w) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = n61Var2.s;
                if (i4 == 0 || i4 == 3) {
                    ld8 ld8Var = n61Var2.e;
                    tn1 tn1Var3 = ld8Var.h;
                    tn1 tn1Var4 = ld8Var.i;
                    boolean z2 = n61Var2.H.f != null;
                    boolean z3 = n61Var2.I.f != null;
                    boolean z4 = n61Var2.J.f != null;
                    boolean z5 = n61Var2.K.f != null;
                    f = 0.5f;
                    int i5 = n61Var2.W;
                    if (z2 && z3 && z4 && z5) {
                        float f5 = n61Var2.V;
                        boolean z6 = tn1Var3.j;
                        ArrayList arrayList = tn1Var3.l;
                        int[] iArr = k;
                        if (z6 && tn1Var4.j) {
                            if (tn1Var.c && tn1Var2.c) {
                                m(iArr, ((tn1) tn1Var.l.get(0)).g + tn1Var.f, ((tn1) tn1Var2.l.get(0)).g - tn1Var2.f, tn1Var3.g + tn1Var3.f, tn1Var4.g - tn1Var4.f, f5, i5);
                                k12Var.d(iArr[0]);
                                this.b.e.e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (tn1Var.j && tn1Var2.j) {
                            if (!tn1Var3.c || !tn1Var4.c) {
                                return;
                            }
                            m(iArr, tn1Var.g + tn1Var.f, tn1Var2.g - tn1Var2.f, ((tn1) arrayList.get(0)).g + tn1Var3.f, ((tn1) tn1Var4.l.get(0)).g - tn1Var4.f, f5, i5);
                            k12Var.d(iArr[0]);
                            this.b.e.e.d(iArr[1]);
                        }
                        if (!tn1Var.c || !tn1Var2.c || !tn1Var3.c || !tn1Var4.c) {
                            return;
                        }
                        m(iArr, ((tn1) tn1Var.l.get(0)).g + tn1Var.f, ((tn1) tn1Var2.l.get(0)).g - tn1Var2.f, ((tn1) arrayList.get(0)).g + tn1Var3.f, ((tn1) tn1Var4.l.get(0)).g - tn1Var4.f, f5, i5);
                        k12Var.d(iArr[0]);
                        this.b.e.e.d(iArr[1]);
                    } else if (z2 && z4) {
                        if (!tn1Var.c || !tn1Var2.c) {
                            return;
                        }
                        float f6 = n61Var2.V;
                        int i6 = ((tn1) tn1Var.l.get(0)).g + tn1Var.f;
                        int i7 = ((tn1) tn1Var2.l.get(0)).g - tn1Var2.f;
                        if (i5 == -1 || i5 == 0) {
                            int iG3 = g(i7 - i6, 0);
                            int i8 = (int) ((iG3 * f6) + 0.5f);
                            int iG4 = g(i8, 1);
                            if (i8 != iG4) {
                                iG3 = (int) ((iG4 / f6) + 0.5f);
                            }
                            k12Var.d(iG3);
                            this.b.e.e.d(iG4);
                        } else if (i5 == 1) {
                            int iG5 = g(i7 - i6, 0);
                            int i9 = (int) ((iG5 / f6) + 0.5f);
                            int iG6 = g(i9, 1);
                            if (i9 != iG6) {
                                iG5 = (int) ((iG6 * f6) + 0.5f);
                            }
                            k12Var.d(iG5);
                            this.b.e.e.d(iG6);
                        }
                    } else if (z3 && z5) {
                        if (!tn1Var3.c || !tn1Var4.c) {
                            return;
                        }
                        float f7 = n61Var2.V;
                        int i10 = ((tn1) tn1Var3.l.get(0)).g + tn1Var3.f;
                        int i11 = ((tn1) tn1Var4.l.get(0)).g - tn1Var4.f;
                        if (i5 == -1) {
                            iG = g(i11 - i10, 1);
                            i = (int) ((iG / f7) + 0.5f);
                            iG2 = g(i, 0);
                            if (i != iG2) {
                                iG = (int) ((iG2 * f7) + 0.5f);
                            }
                            k12Var.d(iG2);
                            this.b.e.e.d(iG);
                        } else if (i5 == 0) {
                            int iG7 = g(i11 - i10, 1);
                            int i12 = (int) ((iG7 * f7) + 0.5f);
                            int iG8 = g(i12, 0);
                            if (i12 != iG8) {
                                iG7 = (int) ((iG8 / f7) + 0.5f);
                            }
                            k12Var.d(iG8);
                            this.b.e.e.d(iG7);
                        } else if (i5 == 1) {
                            iG = g(i11 - i10, 1);
                            i = (int) ((iG / f7) + 0.5f);
                            iG2 = g(i, 0);
                            if (i != iG2) {
                                iG = (int) ((iG2 * f7) + 0.5f);
                            }
                            k12Var.d(iG2);
                            this.b.e.e.d(iG);
                        }
                    }
                } else {
                    int i13 = n61Var2.W;
                    if (i13 != -1) {
                        if (i13 == 0) {
                            f4 = n61Var2.e.e.g / n61Var2.V;
                            i2 = (int) (f4 + 0.5f);
                        } else if (i13 != 1) {
                            i2 = 0;
                        } else {
                            f2 = n61Var2.e.e.g;
                            f3 = n61Var2.V;
                        }
                        k12Var.d(i2);
                        f = 0.5f;
                    } else {
                        f2 = n61Var2.e.e.g;
                        f3 = n61Var2.V;
                    }
                    f4 = f2 * f3;
                    i2 = (int) (f4 + 0.5f);
                    k12Var.d(i2);
                    f = 0.5f;
                }
            } else {
                f = 0.5f;
            }
        }
        boolean z7 = tn1Var.c;
        ArrayList arrayList2 = tn1Var.l;
        if (z7) {
            boolean z8 = tn1Var2.c;
            ArrayList arrayList3 = tn1Var2.l;
            if (z8) {
                if (tn1Var.j && tn1Var2.j && k12Var.j) {
                    return;
                }
                if (!k12Var.j && this.d == 3) {
                    n61 n61Var3 = this.b;
                    if (n61Var3.r == 0 && !n61Var3.v()) {
                        tn1 tn1Var5 = (tn1) arrayList2.get(0);
                        tn1 tn1Var6 = (tn1) arrayList3.get(0);
                        int i14 = tn1Var5.g + tn1Var.f;
                        int i15 = tn1Var6.g + tn1Var2.f;
                        tn1Var.d(i14);
                        tn1Var2.d(i15);
                        k12Var.d(i15 - i14);
                        return;
                    }
                }
                if (!k12Var.j && this.d == 3 && this.a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int iMin = Math.min((((tn1) arrayList3.get(0)).g + tn1Var2.f) - (((tn1) arrayList2.get(0)).g + tn1Var.f), k12Var.m);
                    n61 n61Var4 = this.b;
                    int i16 = n61Var4.v;
                    int iMax = Math.max(n61Var4.u, iMin);
                    if (i16 > 0) {
                        iMax = Math.min(i16, iMax);
                    }
                    k12Var.d(iMax);
                }
                if (k12Var.j) {
                    tn1 tn1Var7 = (tn1) arrayList2.get(0);
                    tn1 tn1Var8 = (tn1) arrayList3.get(0);
                    int i17 = tn1Var7.g;
                    int i18 = tn1Var.f + i17;
                    int i19 = tn1Var8.g;
                    int i20 = tn1Var2.f + i19;
                    float f8 = this.b.c0;
                    if (tn1Var7 == tn1Var8) {
                        f8 = f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    tn1Var.d((int) ((((i19 - i17) - k12Var.g) * f8) + i17 + f));
                    tn1Var2.d(tn1Var.g + k12Var.g);
                }
            }
        }
    }

    @Override // o.zi8
    public final void e() {
        tn1 tn1Var = this.h;
        if (tn1Var.j) {
            this.b.X = tn1Var.g;
        }
    }

    @Override // o.zi8
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // o.zi8
    public final boolean k() {
        return this.d != 3 || this.b.r == 0;
    }

    public final void n() {
        this.g = false;
        tn1 tn1Var = this.h;
        tn1Var.c();
        tn1Var.j = false;
        tn1 tn1Var2 = this.i;
        tn1Var2.c();
        tn1Var2.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.g0;
    }
}
