package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ld8 extends zi8 {
    public tn1 k;
    public g40 l;

    @Override // o.pn1
    public final void a(pn1 pn1Var) {
        float f;
        float f2;
        float f3;
        int i;
        if (ua5.B(this.j) == 3) {
            n61 n61Var = this.b;
            l(n61Var.I, n61Var.K, 1);
            return;
        }
        k12 k12Var = this.e;
        if (k12Var.c && !k12Var.j && this.d == 3) {
            n61 n61Var2 = this.b;
            int i2 = n61Var2.s;
            if (i2 == 2) {
                o61 o61Var = n61Var2.S;
                if (o61Var != null) {
                    k12 k12Var2 = o61Var.e.e;
                    if (k12Var2.j) {
                        k12Var.d((int) ((k12Var2.g * n61Var2.z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                k12 k12Var3 = n61Var2.d.e;
                if (k12Var3.j) {
                    int i3 = n61Var2.W;
                    if (i3 != -1) {
                        if (i3 == 0) {
                            f3 = k12Var3.g * n61Var2.V;
                            i = (int) (f3 + 0.5f);
                        } else if (i3 != 1) {
                            i = 0;
                        } else {
                            f = k12Var3.g;
                            f2 = n61Var2.V;
                        }
                        k12Var.d(i);
                    } else {
                        f = k12Var3.g;
                        f2 = n61Var2.V;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    k12Var.d(i);
                }
            }
        }
        tn1 tn1Var = this.h;
        boolean z = tn1Var.c;
        ArrayList arrayList = tn1Var.l;
        if (z) {
            tn1 tn1Var2 = this.i;
            boolean z2 = tn1Var2.c;
            ArrayList arrayList2 = tn1Var2.l;
            if (z2) {
                if (tn1Var.j && tn1Var2.j && k12Var.j) {
                    return;
                }
                if (!k12Var.j && this.d == 3) {
                    n61 n61Var3 = this.b;
                    if (n61Var3.r == 0 && !n61Var3.w()) {
                        tn1 tn1Var3 = (tn1) arrayList.get(0);
                        tn1 tn1Var4 = (tn1) arrayList2.get(0);
                        int i4 = tn1Var3.g + tn1Var.f;
                        int i5 = tn1Var4.g + tn1Var2.f;
                        tn1Var.d(i4);
                        tn1Var2.d(i5);
                        k12Var.d(i5 - i4);
                        return;
                    }
                }
                if (!k12Var.j && this.d == 3 && this.a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    tn1 tn1Var5 = (tn1) arrayList.get(0);
                    int i6 = (((tn1) arrayList2.get(0)).g + tn1Var2.f) - (tn1Var5.g + tn1Var.f);
                    int i7 = k12Var.m;
                    if (i6 < i7) {
                        k12Var.d(i6);
                    } else {
                        k12Var.d(i7);
                    }
                }
                if (k12Var.j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    tn1 tn1Var6 = (tn1) arrayList.get(0);
                    tn1 tn1Var7 = (tn1) arrayList2.get(0);
                    int i8 = tn1Var6.g;
                    int i9 = tn1Var.f + i8;
                    int i10 = tn1Var7.g;
                    int i11 = tn1Var2.f + i10;
                    float f4 = this.b.d0;
                    if (tn1Var6 == tn1Var7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    tn1Var.d((int) ((((i10 - i8) - k12Var.g) * f4) + i8 + 0.5f));
                    tn1Var2.d(tn1Var.g + k12Var.g);
                }
            }
        }
    }

    @Override // o.zi8
    public final void d() {
        n61 n61Var;
        o61 o61Var;
        o61 o61Var2;
        o61 o61Var3;
        tn1 tn1Var = this.k;
        n61 n61Var2 = this.b;
        boolean z = n61Var2.a;
        k12 k12Var = this.e;
        if (z) {
            k12Var.d(n61Var2.i());
        }
        boolean z2 = k12Var.j;
        ArrayList arrayList = k12Var.k;
        ArrayList arrayList2 = k12Var.l;
        tn1 tn1Var2 = this.i;
        tn1 tn1Var3 = this.h;
        if (!z2) {
            n61 n61Var3 = this.b;
            this.d = n61Var3.o0[1];
            if (n61Var3.E) {
                this.l = new g40(this);
            }
            int i = this.d;
            if (i != 3) {
                if (i == 4 && (o61Var3 = this.b.S) != null && o61Var3.o0[1] == 1) {
                    int i2 = (o61Var3.i() - this.b.I.d()) - this.b.K.d();
                    zi8.b(tn1Var3, o61Var3.e.h, this.b.I.d());
                    zi8.b(tn1Var2, o61Var3.e.i, -this.b.K.d());
                    k12Var.d(i2);
                    return;
                }
                if (i == 1) {
                    k12Var.d(this.b.i());
                }
            }
        } else if (this.d == 4 && (o61Var = (n61Var = this.b).S) != null && o61Var.o0[1] == 1) {
            zi8.b(tn1Var3, o61Var.e.h, n61Var.I.d());
            zi8.b(tn1Var2, o61Var.e.i, -this.b.K.d());
            return;
        }
        boolean z3 = k12Var.j;
        if (z3) {
            n61 n61Var4 = this.b;
            if (n61Var4.a) {
                w51[] w51VarArr = n61Var4.P;
                w51 w51Var = w51VarArr[2];
                w51 w51Var2 = w51Var.f;
                if (w51Var2 != null && w51VarArr[3].f != null) {
                    boolean zW = n61Var4.w();
                    n61 n61Var5 = this.b;
                    if (zW) {
                        tn1Var3.f = n61Var5.P[2].d();
                        tn1Var2.f = -this.b.P[3].d();
                    } else {
                        tn1 tn1VarH = zi8.h(n61Var5.P[2]);
                        if (tn1VarH != null) {
                            zi8.b(tn1Var3, tn1VarH, this.b.P[2].d());
                        }
                        tn1 tn1VarH2 = zi8.h(this.b.P[3]);
                        if (tn1VarH2 != null) {
                            zi8.b(tn1Var2, tn1VarH2, -this.b.P[3].d());
                        }
                        tn1Var3.b = true;
                        tn1Var2.b = true;
                    }
                    n61 n61Var6 = this.b;
                    if (n61Var6.E) {
                        zi8.b(tn1Var, tn1Var3, n61Var6.Z);
                        return;
                    }
                    return;
                }
                if (w51Var2 != null) {
                    tn1 tn1VarH3 = zi8.h(w51Var);
                    if (tn1VarH3 != null) {
                        zi8.b(tn1Var3, tn1VarH3, this.b.P[2].d());
                        zi8.b(tn1Var2, tn1Var3, k12Var.g);
                        n61 n61Var7 = this.b;
                        if (n61Var7.E) {
                            zi8.b(tn1Var, tn1Var3, n61Var7.Z);
                            return;
                        }
                        return;
                    }
                    return;
                }
                w51 w51Var3 = w51VarArr[3];
                if (w51Var3.f != null) {
                    tn1 tn1VarH4 = zi8.h(w51Var3);
                    if (tn1VarH4 != null) {
                        zi8.b(tn1Var2, tn1VarH4, -this.b.P[3].d());
                        zi8.b(tn1Var3, tn1Var2, -k12Var.g);
                    }
                    n61 n61Var8 = this.b;
                    if (n61Var8.E) {
                        zi8.b(tn1Var, tn1Var3, n61Var8.Z);
                        return;
                    }
                    return;
                }
                w51 w51Var4 = w51VarArr[4];
                if (w51Var4.f != null) {
                    tn1 tn1VarH5 = zi8.h(w51Var4);
                    if (tn1VarH5 != null) {
                        zi8.b(tn1Var, tn1VarH5, 0);
                        zi8.b(tn1Var3, tn1Var, -this.b.Z);
                        zi8.b(tn1Var2, tn1Var3, k12Var.g);
                        return;
                    }
                    return;
                }
                if ((n61Var4 instanceof a30) || n61Var4.S == null || n61Var4.g(7).f != null) {
                    return;
                }
                n61 n61Var9 = this.b;
                zi8.b(tn1Var3, n61Var9.S.e.h, n61Var9.q());
                zi8.b(tn1Var2, tn1Var3, k12Var.g);
                n61 n61Var10 = this.b;
                if (n61Var10.E) {
                    zi8.b(tn1Var, tn1Var3, n61Var10.Z);
                    return;
                }
                return;
            }
        }
        if (z3 || this.d != 3) {
            k12Var.b(this);
        } else {
            n61 n61Var11 = this.b;
            int i3 = n61Var11.s;
            if (i3 == 2) {
                o61 o61Var4 = n61Var11.S;
                if (o61Var4 != null) {
                    k12 k12Var2 = o61Var4.e.e;
                    arrayList2.add(k12Var2);
                    k12Var2.k.add(k12Var);
                    k12Var.b = true;
                    arrayList.add(tn1Var3);
                    arrayList.add(tn1Var2);
                }
            } else if (i3 == 3 && !n61Var11.w()) {
                n61 n61Var12 = this.b;
                if (n61Var12.r != 3) {
                    k12 k12Var3 = n61Var12.d.e;
                    arrayList2.add(k12Var3);
                    k12Var3.k.add(k12Var);
                    k12Var.b = true;
                    arrayList.add(tn1Var3);
                    arrayList.add(tn1Var2);
                }
            }
        }
        n61 n61Var13 = this.b;
        w51[] w51VarArr2 = n61Var13.P;
        w51 w51Var5 = w51VarArr2[2];
        w51 w51Var6 = w51Var5.f;
        if (w51Var6 != null && w51VarArr2[3].f != null) {
            boolean zW2 = n61Var13.w();
            n61 n61Var14 = this.b;
            if (zW2) {
                tn1Var3.f = n61Var14.P[2].d();
                tn1Var2.f = -this.b.P[3].d();
            } else {
                tn1 tn1VarH6 = zi8.h(n61Var14.P[2]);
                tn1 tn1VarH7 = zi8.h(this.b.P[3]);
                if (tn1VarH6 != null) {
                    tn1VarH6.b(this);
                }
                if (tn1VarH7 != null) {
                    tn1VarH7.b(this);
                }
                this.j = 4;
            }
            if (this.b.E) {
                c(tn1Var, tn1Var3, 1, this.l);
            }
        } else if (w51Var6 != null) {
            tn1 tn1VarH8 = zi8.h(w51Var5);
            if (tn1VarH8 != null) {
                zi8.b(tn1Var3, tn1VarH8, this.b.P[2].d());
                c(tn1Var2, tn1Var3, 1, k12Var);
                if (this.b.E) {
                    c(tn1Var, tn1Var3, 1, this.l);
                }
                if (this.d == 3) {
                    n61 n61Var15 = this.b;
                    if (n61Var15.V > 0.0f) {
                        g63 g63Var = n61Var15.d;
                        if (g63Var.d == 3) {
                            g63Var.e.k.add(k12Var);
                            arrayList2.add(this.b.d.e);
                            k12Var.a = this;
                        }
                    }
                }
            }
        } else {
            w51 w51Var7 = w51VarArr2[3];
            if (w51Var7.f != null) {
                tn1 tn1VarH9 = zi8.h(w51Var7);
                if (tn1VarH9 != null) {
                    zi8.b(tn1Var2, tn1VarH9, -this.b.P[3].d());
                    c(tn1Var3, tn1Var2, -1, k12Var);
                    if (this.b.E) {
                        c(tn1Var, tn1Var3, 1, this.l);
                    }
                }
            } else {
                w51 w51Var8 = w51VarArr2[4];
                if (w51Var8.f != null) {
                    tn1 tn1VarH10 = zi8.h(w51Var8);
                    if (tn1VarH10 != null) {
                        zi8.b(tn1Var, tn1VarH10, 0);
                        c(tn1Var3, tn1Var, -1, this.l);
                        c(tn1Var2, tn1Var3, 1, k12Var);
                    }
                } else if (!(n61Var13 instanceof a30) && (o61Var2 = n61Var13.S) != null) {
                    zi8.b(tn1Var3, o61Var2.e.h, n61Var13.q());
                    c(tn1Var2, tn1Var3, 1, k12Var);
                    if (this.b.E) {
                        c(tn1Var, tn1Var3, 1, this.l);
                    }
                    if (this.d == 3) {
                        n61 n61Var16 = this.b;
                        if (n61Var16.V > 0.0f) {
                            g63 g63Var2 = n61Var16.d;
                            if (g63Var2.d == 3) {
                                g63Var2.e.k.add(k12Var);
                                arrayList2.add(this.b.d.e);
                                k12Var.a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            k12Var.c = true;
        }
    }

    @Override // o.zi8
    public final void e() {
        tn1 tn1Var = this.h;
        if (tn1Var.j) {
            this.b.Y = tn1Var.g;
        }
    }

    @Override // o.zi8
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // o.zi8
    public final boolean k() {
        return this.d != 3 || this.b.s == 0;
    }

    public final void m() {
        this.g = false;
        tn1 tn1Var = this.h;
        tn1Var.c();
        tn1Var.j = false;
        tn1 tn1Var2 = this.i;
        tn1Var2.c();
        tn1Var2.j = false;
        tn1 tn1Var3 = this.k;
        tn1Var3.c();
        tn1Var3.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.g0;
    }
}
