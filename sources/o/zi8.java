package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class zi8 implements pn1 {
    public int a;
    public n61 b;
    public ig6 c;
    public int d;
    public final k12 e = new k12(this);
    public int f = 0;
    public boolean g = false;
    public final tn1 h = new tn1(this);
    public final tn1 i = new tn1(this);
    public int j = 1;

    public zi8(n61 n61Var) {
        this.b = n61Var;
    }

    public static void b(tn1 tn1Var, tn1 tn1Var2, int i) {
        tn1Var.l.add(tn1Var2);
        tn1Var.f = i;
        tn1Var2.k.add(tn1Var);
    }

    public static tn1 h(w51 w51Var) {
        w51 w51Var2 = w51Var.f;
        if (w51Var2 == null) {
            return null;
        }
        n61 n61Var = w51Var2.d;
        int iB = ua5.B(w51Var2.e);
        if (iB == 1) {
            return n61Var.d.h;
        }
        if (iB == 2) {
            return n61Var.e.h;
        }
        if (iB == 3) {
            return n61Var.d.i;
        }
        if (iB == 4) {
            return n61Var.e.i;
        }
        if (iB != 5) {
            return null;
        }
        return n61Var.e.k;
    }

    public static tn1 i(w51 w51Var, int i) {
        w51 w51Var2 = w51Var.f;
        if (w51Var2 == null) {
            return null;
        }
        n61 n61Var = w51Var2.d;
        zi8 zi8Var = i == 0 ? n61Var.d : n61Var.e;
        int iB = ua5.B(w51Var2.e);
        if (iB == 1 || iB == 2) {
            return zi8Var.h;
        }
        if (iB == 3 || iB == 4) {
            return zi8Var.i;
        }
        return null;
    }

    public final void c(tn1 tn1Var, tn1 tn1Var2, int i, k12 k12Var) {
        tn1Var.l.add(tn1Var2);
        tn1Var.l.add(this.e);
        tn1Var.h = i;
        tn1Var.i = k12Var;
        tn1Var2.k.add(tn1Var);
        k12Var.k.add(tn1Var);
    }

    public void d() {
        n61 n61Var;
        o61 o61Var;
        int i;
        o61 o61Var2;
        o61 o61Var3;
        int i2;
        n61 n61Var2 = this.b;
        boolean z = n61Var2.a;
        k12 k12Var = this.e;
        if (z) {
            k12Var.d(n61Var2.o());
        }
        boolean z2 = k12Var.j;
        ArrayList arrayList = k12Var.k;
        ArrayList arrayList2 = k12Var.l;
        tn1 tn1Var = this.i;
        tn1 tn1Var2 = this.h;
        if (!z2) {
            n61 n61Var3 = this.b;
            int i3 = n61Var3.o0[0];
            this.d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (o61Var3 = n61Var3.S) != null && ((i2 = o61Var3.o0[0]) == 1 || i2 == 4)) {
                    int iO = (o61Var3.o() - this.b.H.d()) - this.b.J.d();
                    b(tn1Var2, o61Var3.d.h, this.b.H.d());
                    b(tn1Var, o61Var3.d.i, -this.b.J.d());
                    k12Var.d(iO);
                    return;
                }
                if (i3 == 1) {
                    k12Var.d(n61Var3.o());
                }
            }
        } else if (this.d == 4 && (o61Var = (n61Var = this.b).S) != null && ((i = o61Var.o0[0]) == 1 || i == 4)) {
            b(tn1Var2, o61Var.d.h, n61Var.H.d());
            b(tn1Var, o61Var.d.i, -this.b.J.d());
            return;
        }
        if (k12Var.j) {
            n61 n61Var4 = this.b;
            if (n61Var4.a) {
                w51[] w51VarArr = n61Var4.P;
                w51 w51Var = w51VarArr[0];
                w51 w51Var2 = w51Var.f;
                if (w51Var2 != null && w51VarArr[1].f != null) {
                    boolean zV = n61Var4.v();
                    n61 n61Var5 = this.b;
                    if (zV) {
                        tn1Var2.f = n61Var5.P[0].d();
                        tn1Var.f = -this.b.P[1].d();
                        return;
                    }
                    tn1 tn1VarH = h(n61Var5.P[0]);
                    if (tn1VarH != null) {
                        b(tn1Var2, tn1VarH, this.b.P[0].d());
                    }
                    tn1 tn1VarH2 = h(this.b.P[1]);
                    if (tn1VarH2 != null) {
                        b(tn1Var, tn1VarH2, -this.b.P[1].d());
                    }
                    tn1Var2.b = true;
                    tn1Var.b = true;
                    return;
                }
                if (w51Var2 != null) {
                    tn1 tn1VarH3 = h(w51Var);
                    if (tn1VarH3 != null) {
                        b(tn1Var2, tn1VarH3, this.b.P[0].d());
                        b(tn1Var, tn1Var2, k12Var.g);
                        return;
                    }
                    return;
                }
                w51 w51Var3 = w51VarArr[1];
                if (w51Var3.f != null) {
                    tn1 tn1VarH4 = h(w51Var3);
                    if (tn1VarH4 != null) {
                        b(tn1Var, tn1VarH4, -this.b.P[1].d());
                        b(tn1Var2, tn1Var, -k12Var.g);
                        return;
                    }
                    return;
                }
                if ((n61Var4 instanceof a30) || n61Var4.S == null || n61Var4.g(7).f != null) {
                    return;
                }
                n61 n61Var6 = this.b;
                b(tn1Var2, n61Var6.S.d.h, n61Var6.p());
                b(tn1Var, tn1Var2, k12Var.g);
                return;
            }
        }
        if (this.d == 3) {
            n61 n61Var7 = this.b;
            int i4 = n61Var7.r;
            if (i4 == 2) {
                o61 o61Var4 = n61Var7.S;
                if (o61Var4 != null) {
                    k12 k12Var2 = o61Var4.e.e;
                    arrayList2.add(k12Var2);
                    k12Var2.k.add(k12Var);
                    k12Var.b = true;
                    arrayList.add(tn1Var2);
                    arrayList.add(tn1Var);
                }
            } else if (i4 == 3) {
                if (n61Var7.s == 3) {
                    tn1Var2.a = this;
                    tn1Var.a = this;
                    ld8 ld8Var = n61Var7.e;
                    ld8Var.h.a = this;
                    ld8Var.i.a = this;
                    k12Var.a = this;
                    if (n61Var7.w()) {
                        arrayList2.add(this.b.e.e);
                        this.b.e.e.k.add(k12Var);
                        ld8 ld8Var2 = this.b.e;
                        ld8Var2.e.a = this;
                        arrayList2.add(ld8Var2.h);
                        arrayList2.add(this.b.e.i);
                        this.b.e.h.k.add(k12Var);
                        this.b.e.i.k.add(k12Var);
                    } else {
                        boolean zV2 = this.b.v();
                        n61 n61Var8 = this.b;
                        if (zV2) {
                            n61Var8.e.e.l.add(k12Var);
                            arrayList.add(this.b.e.e);
                        } else {
                            n61Var8.e.e.l.add(k12Var);
                        }
                    }
                } else {
                    k12 k12Var3 = n61Var7.e.e;
                    arrayList2.add(k12Var3);
                    k12Var3.k.add(k12Var);
                    this.b.e.h.k.add(k12Var);
                    this.b.e.i.k.add(k12Var);
                    k12Var.b = true;
                    arrayList.add(tn1Var2);
                    arrayList.add(tn1Var);
                    tn1Var2.l.add(k12Var);
                    tn1Var.l.add(k12Var);
                }
            }
        }
        n61 n61Var9 = this.b;
        w51[] w51VarArr2 = n61Var9.P;
        w51 w51Var4 = w51VarArr2[0];
        w51 w51Var5 = w51Var4.f;
        if (w51Var5 != null && w51VarArr2[1].f != null) {
            boolean zV3 = n61Var9.v();
            n61 n61Var10 = this.b;
            if (zV3) {
                tn1Var2.f = n61Var10.P[0].d();
                tn1Var.f = -this.b.P[1].d();
                return;
            }
            tn1 tn1VarH5 = h(n61Var10.P[0]);
            tn1 tn1VarH6 = h(this.b.P[1]);
            if (tn1VarH5 != null) {
                tn1VarH5.b(this);
            }
            if (tn1VarH6 != null) {
                tn1VarH6.b(this);
            }
            this.j = 4;
            return;
        }
        if (w51Var5 != null) {
            tn1 tn1VarH7 = h(w51Var4);
            if (tn1VarH7 != null) {
                b(tn1Var2, tn1VarH7, this.b.P[0].d());
                c(tn1Var, tn1Var2, 1, k12Var);
                return;
            }
            return;
        }
        w51 w51Var6 = w51VarArr2[1];
        if (w51Var6.f != null) {
            tn1 tn1VarH8 = h(w51Var6);
            if (tn1VarH8 != null) {
                b(tn1Var, tn1VarH8, -this.b.P[1].d());
                c(tn1Var2, tn1Var, -1, k12Var);
                return;
            }
            return;
        }
        if ((n61Var9 instanceof a30) || (o61Var2 = n61Var9.S) == null) {
            return;
        }
        b(tn1Var2, o61Var2.d.h, n61Var9.p());
        c(tn1Var, tn1Var2, 1, k12Var);
    }

    public void e() {
        n61 n61Var = this.b;
        int i = ((g43) n61Var).t0;
        tn1 tn1Var = this.h;
        if (i == 1) {
            n61Var.X = tn1Var.g;
        } else {
            n61Var.Y = tn1Var.g;
        }
    }

    public void f() {
        this.h.c();
    }

    public final int g(int i, int i2) {
        n61 n61Var = this.b;
        if (i2 == 0) {
            int i3 = n61Var.v;
            int iMax = Math.max(n61Var.u, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            int i4 = n61Var.y;
            int iMax2 = Math.max(n61Var.x, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    public long j() {
        k12 k12Var = this.e;
        if (k12Var.j) {
            return k12Var.g;
        }
        return 0L;
    }

    public boolean k() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    public final void l(w51 w51Var, w51 w51Var2, int i) {
        k12 k12Var;
        float f;
        int i2;
        int i3;
        tn1 tn1VarH = h(w51Var);
        tn1 tn1VarH2 = h(w51Var2);
        if (tn1VarH.j && tn1VarH2.j) {
            int iD = w51Var.d() + tn1VarH.g;
            int iD2 = tn1VarH2.g - w51Var2.d();
            int i4 = iD2 - iD;
            k12 k12Var2 = this.e;
            if (!k12Var2.j && this.d == 3) {
                int i5 = this.a;
                if (i5 == 0) {
                    k12Var2.d(g(i4, i));
                } else if (i5 == 1) {
                    k12Var2.d(Math.min(g(k12Var2.m, i), i4));
                } else if (i5 == 2) {
                    n61 n61Var = this.b;
                    o61 o61Var = n61Var.S;
                    if (o61Var != null) {
                        k12 k12Var3 = (i == 0 ? o61Var.d : o61Var.e).e;
                        if (k12Var3.j) {
                            k12Var2.d(g((int) ((k12Var3.g * (i == 0 ? n61Var.w : n61Var.z)) + 0.5f), i));
                        }
                    }
                } else if (i5 == 3) {
                    n61 n61Var2 = this.b;
                    zi8 zi8Var = n61Var2.d;
                    if (zi8Var.d == 3 && zi8Var.a == 3) {
                        ld8 ld8Var = n61Var2.e;
                        if (ld8Var.d != 3 || ld8Var.a != 3) {
                            if (i == 0) {
                                zi8Var = n61Var2.e;
                            }
                            k12Var = zi8Var.e;
                            if (k12Var.j) {
                                f = n61Var2.V;
                                i2 = k12Var.g;
                                if (i == 1) {
                                    i3 = (int) ((i2 / f) + 0.5f);
                                } else {
                                    i3 = (int) ((f * i2) + 0.5f);
                                }
                                k12Var2.d(i3);
                            }
                        }
                    } else {
                        if (i == 0) {
                            zi8Var = n61Var2.e;
                        }
                        k12Var = zi8Var.e;
                        if (k12Var.j) {
                            f = n61Var2.V;
                            i2 = k12Var.g;
                            if (i == 1) {
                                i3 = (int) ((i2 / f) + 0.5f);
                            } else {
                                i3 = (int) ((f * i2) + 0.5f);
                            }
                            k12Var2.d(i3);
                        }
                    }
                }
            }
            if (k12Var2.j) {
                int i6 = k12Var2.g;
                tn1 tn1Var = this.i;
                tn1 tn1Var2 = this.h;
                if (i6 == i4) {
                    tn1Var2.d(iD);
                    tn1Var.d(iD2);
                    return;
                }
                n61 n61Var3 = this.b;
                float f2 = i == 0 ? n61Var3.c0 : n61Var3.d0;
                if (tn1VarH == tn1VarH2) {
                    iD = tn1VarH.g;
                    iD2 = tn1VarH2.g;
                    f2 = 0.5f;
                }
                tn1Var2.d((int) ((((iD2 - iD) - i6) * f2) + iD + 0.5f));
                tn1Var.d(tn1Var2.g + k12Var2.g);
            }
        }
    }
}
