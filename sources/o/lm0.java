package o;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class lm0 extends zi8 {
    public final ArrayList k;
    public int l;

    public lm0(n61 n61Var, int i) {
        n61 n61Var2;
        super(n61Var);
        ArrayList<zi8> arrayList = new ArrayList();
        this.k = arrayList;
        this.f = i;
        n61 n61Var3 = this.b;
        n61 n61VarK = n61Var3.k(i);
        while (true) {
            n61Var2 = n61Var3;
            n61Var3 = n61VarK;
            if (n61Var3 == null) {
                break;
            } else {
                n61VarK = n61Var3.k(this.f);
            }
        }
        this.b = n61Var2;
        int i2 = this.f;
        arrayList.add(i2 == 0 ? n61Var2.d : i2 == 1 ? n61Var2.e : null);
        n61 n61VarJ = n61Var2.j(this.f);
        while (n61VarJ != null) {
            int i3 = this.f;
            arrayList.add(i3 == 0 ? n61VarJ.d : i3 == 1 ? n61VarJ.e : null);
            n61VarJ = n61VarJ.j(this.f);
        }
        for (zi8 zi8Var : arrayList) {
            int i4 = this.f;
            if (i4 == 0) {
                zi8Var.b.b = this;
            } else if (i4 == 1) {
                zi8Var.b.c = this;
            }
        }
        if (this.f == 0 && this.b.S.u0 && arrayList.size() > 1) {
            this.b = ((zi8) ua5.j(1, arrayList)).b;
        }
        int i5 = this.f;
        n61 n61Var4 = this.b;
        this.l = i5 == 0 ? n61Var4.h0 : n61Var4.i0;
    }

    /* JADX WARN: Code duplicated, block: B:293:0x00e4 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00dc A[ADDED_TO_REGION] */
    @Override // o.pn1
    public final void a(pn1 pn1Var) {
        int i;
        int i2;
        boolean z;
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float f3;
        tn1 tn1Var = this.h;
        if (tn1Var.j) {
            tn1 tn1Var2 = this.i;
            if (tn1Var2.j) {
                o61 o61Var = this.b.S;
                boolean z2 = o61Var != null ? o61Var.u0 : false;
                int i13 = tn1Var2.g - tn1Var.g;
                ArrayList arrayList = this.k;
                int size = arrayList.size();
                int i14 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i14 >= size) {
                        i14 = -1;
                        break;
                    } else if (((zi8) arrayList.get(i14)).b.f0 != 8) {
                        break;
                    } else {
                        i14++;
                    }
                }
                int i15 = size - 1;
                for (int i16 = i15; i16 >= 0; i16--) {
                    if (((zi8) arrayList.get(i16)).b.f0 != 8) {
                        i = i16;
                        break;
                    }
                }
                int i17 = 0;
                while (true) {
                    if (i17 >= 2) {
                        z = z2;
                        f = 0.0f;
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                        break;
                    }
                    f = 0.0f;
                    int i18 = 0;
                    i5 = 0;
                    int i19 = 0;
                    int i20 = 0;
                    while (i18 < size) {
                        zi8 zi8Var = (zi8) arrayList.get(i18);
                        n61 n61Var = zi8Var.b;
                        boolean z3 = z2;
                        if (n61Var.f0 == i2) {
                            i11 = i17;
                        } else {
                            i20++;
                            if (i18 > 0 && i18 >= i14) {
                                i5 += zi8Var.h.f;
                            }
                            k12 k12Var = zi8Var.e;
                            int i21 = k12Var.g;
                            i11 = i17;
                            boolean z4 = zi8Var.d != 3;
                            if (z4) {
                                int i22 = this.f;
                                if (i22 == 0 && !n61Var.d.e.j) {
                                    return;
                                }
                                if (i22 == 1 && !n61Var.e.e.j) {
                                    return;
                                }
                            } else {
                                if (zi8Var.a == 1 && i11 == 0) {
                                    i12 = k12Var.m;
                                    i19++;
                                } else {
                                    if (k12Var.j) {
                                        i12 = i21;
                                    }
                                    if (z4) {
                                        i5 += i12;
                                    } else {
                                        i19++;
                                        f3 = n61Var.j0[this.f];
                                        if (f3 >= 0.0f) {
                                            f += f3;
                                        }
                                    }
                                    if (i18 >= i15 && i18 < i) {
                                        i5 += -zi8Var.i.f;
                                    }
                                }
                                z4 = true;
                                if (z4) {
                                    i19++;
                                    f3 = n61Var.j0[this.f];
                                    if (f3 >= 0.0f) {
                                        f += f3;
                                    }
                                } else {
                                    i5 += i12;
                                }
                                if (i18 >= i15) {
                                }
                            }
                            i12 = i21;
                            if (z4) {
                                i19++;
                                f3 = n61Var.j0[this.f];
                                if (f3 >= 0.0f) {
                                    f += f3;
                                }
                            } else {
                                i5 += i12;
                            }
                            if (i18 >= i15) {
                            }
                        }
                        i18++;
                        z2 = z3;
                        i17 = i11;
                        i2 = 8;
                    }
                    z = z2;
                    int i23 = i17;
                    if (i5 < i13 || i19 == 0) {
                        i3 = i19;
                        i4 = i20;
                        break;
                    } else {
                        i17 = i23 + 1;
                        z2 = z;
                        i2 = 8;
                    }
                }
                int i24 = tn1Var.g;
                if (z) {
                    i24 = tn1Var2.g;
                }
                float f4 = 0.5f;
                if (i5 > i13) {
                    i24 = z ? i24 + ((int) (((i5 - i13) / 2.0f) + 0.5f)) : i24 - ((int) (((i5 - i13) / 2.0f) + 0.5f));
                }
                if (i3 > 0) {
                    float f5 = i13 - i5;
                    int i25 = (int) ((f5 / i3) + 0.5f);
                    int i26 = 0;
                    int i27 = 0;
                    while (i26 < size) {
                        float f6 = f4;
                        zi8 zi8Var2 = (zi8) arrayList.get(i26);
                        int i28 = i24;
                        n61 n61Var2 = zi8Var2.b;
                        int i29 = i3;
                        k12 k12Var2 = zi8Var2.e;
                        float f7 = f5;
                        int i30 = i25;
                        if (n61Var2.f0 != 8 && zi8Var2.d == 3 && !k12Var2.j) {
                            int i31 = f > 0.0f ? (int) (((n61Var2.j0[this.f] * f7) / f) + f6) : i30;
                            if (this.f == 0) {
                                i9 = n61Var2.v;
                                i10 = n61Var2.u;
                            } else {
                                i9 = n61Var2.y;
                                i10 = n61Var2.x;
                            }
                            int iMax = Math.max(i10, zi8Var2.a == 1 ? Math.min(i31, k12Var2.m) : i31);
                            if (i9 > 0) {
                                iMax = Math.min(i9, iMax);
                            }
                            if (iMax != i31) {
                                i27++;
                                i31 = iMax;
                            }
                            k12Var2.d(i31);
                        }
                        i26++;
                        i24 = i28;
                        f4 = f6;
                        i3 = i29;
                        f5 = f7;
                        i25 = i30;
                    }
                    i6 = i24;
                    f2 = f4;
                    int i32 = i3;
                    if (i27 > 0) {
                        i3 = i32 - i27;
                        i5 = 0;
                        for (int i33 = 0; i33 < size; i33++) {
                            zi8 zi8Var3 = (zi8) arrayList.get(i33);
                            if (zi8Var3.b.f0 != 8) {
                                if (i33 > 0 && i33 >= i14) {
                                    i5 += zi8Var3.h.f;
                                }
                                i5 += zi8Var3.e.g;
                                if (i33 < i15 && i33 < i) {
                                    i5 += -zi8Var3.i.f;
                                }
                            }
                        }
                    } else {
                        i3 = i32;
                    }
                    i8 = 2;
                    if (this.l == 2 && i27 == 0) {
                        i7 = 0;
                        this.l = 0;
                    } else {
                        i7 = 0;
                    }
                } else {
                    i6 = i24;
                    f2 = 0.5f;
                    i7 = 0;
                    i8 = 2;
                }
                if (i5 > i13) {
                    this.l = i8;
                }
                if (i4 > 0 && i3 == 0 && i14 == i) {
                    this.l = i8;
                }
                int i34 = this.l;
                if (i34 == 1) {
                    int i35 = i4 > 1 ? (i13 - i5) / (i4 - 1) : i4 == 1 ? (i13 - i5) / 2 : i7;
                    if (i3 > 0) {
                        i35 = i7;
                    }
                    int i36 = i6;
                    for (int i37 = i7; i37 < size; i37++) {
                        zi8 zi8Var4 = (zi8) arrayList.get(z ? size - (i37 + 1) : i37);
                        n61 n61Var3 = zi8Var4.b;
                        tn1 tn1Var3 = zi8Var4.i;
                        tn1 tn1Var4 = zi8Var4.h;
                        if (n61Var3.f0 == 8) {
                            tn1Var4.d(i36);
                            tn1Var3.d(i36);
                        } else {
                            if (i37 > 0) {
                                i36 = z ? i36 - i35 : i36 + i35;
                            }
                            if (i37 > 0 && i37 >= i14) {
                                i36 = z ? i36 - tn1Var4.f : i36 + tn1Var4.f;
                            }
                            if (z) {
                                tn1Var3.d(i36);
                            } else {
                                tn1Var4.d(i36);
                            }
                            k12 k12Var3 = zi8Var4.e;
                            int i38 = k12Var3.g;
                            if (zi8Var4.d == 3 && zi8Var4.a == 1) {
                                i38 = k12Var3.m;
                            }
                            i36 = z ? i36 - i38 : i36 + i38;
                            if (z) {
                                tn1Var4.d(i36);
                            } else {
                                tn1Var3.d(i36);
                            }
                            zi8Var4.g = true;
                            if (i37 < i15 && i37 < i) {
                                i36 = z ? i36 - (-tn1Var3.f) : i36 + (-tn1Var3.f);
                            }
                        }
                    }
                    return;
                }
                if (i34 == 0) {
                    int i39 = (i13 - i5) / (i4 + 1);
                    if (i3 > 0) {
                        i39 = i7;
                    }
                    int i40 = i6;
                    for (int i41 = i7; i41 < size; i41++) {
                        zi8 zi8Var5 = (zi8) arrayList.get(z ? size - (i41 + 1) : i41);
                        n61 n61Var4 = zi8Var5.b;
                        tn1 tn1Var5 = zi8Var5.i;
                        tn1 tn1Var6 = zi8Var5.h;
                        if (n61Var4.f0 == 8) {
                            tn1Var6.d(i40);
                            tn1Var5.d(i40);
                        } else {
                            int i42 = z ? i40 - i39 : i40 + i39;
                            if (i41 > 0 && i41 >= i14) {
                                i42 = z ? i42 - tn1Var6.f : i42 + tn1Var6.f;
                            }
                            if (z) {
                                tn1Var5.d(i42);
                            } else {
                                tn1Var6.d(i42);
                            }
                            k12 k12Var4 = zi8Var5.e;
                            int iMin = k12Var4.g;
                            if (zi8Var5.d == 3 && zi8Var5.a == 1) {
                                iMin = Math.min(iMin, k12Var4.m);
                            }
                            i40 = z ? i42 - iMin : i42 + iMin;
                            if (z) {
                                tn1Var6.d(i40);
                            } else {
                                tn1Var5.d(i40);
                            }
                            if (i41 < i15 && i41 < i) {
                                i40 = z ? i40 - (-tn1Var5.f) : i40 + (-tn1Var5.f);
                            }
                        }
                    }
                    return;
                }
                if (i34 == 2) {
                    int i43 = this.f;
                    n61 n61Var5 = this.b;
                    float f8 = i43 == 0 ? n61Var5.c0 : n61Var5.d0;
                    if (z) {
                        f8 = 1.0f - f8;
                    }
                    int i44 = (int) (((i13 - i5) * f8) + f2);
                    if (i44 < 0 || i3 > 0) {
                        i44 = i7;
                    }
                    int i45 = z ? i6 - i44 : i6 + i44;
                    for (int i46 = i7; i46 < size; i46++) {
                        zi8 zi8Var6 = (zi8) arrayList.get(z ? size - (i46 + 1) : i46);
                        n61 n61Var6 = zi8Var6.b;
                        tn1 tn1Var7 = zi8Var6.i;
                        tn1 tn1Var8 = zi8Var6.h;
                        if (n61Var6.f0 == 8) {
                            tn1Var8.d(i45);
                            tn1Var7.d(i45);
                        } else {
                            if (i46 > 0 && i46 >= i14) {
                                i45 = z ? i45 - tn1Var8.f : i45 + tn1Var8.f;
                            }
                            if (z) {
                                tn1Var7.d(i45);
                            } else {
                                tn1Var8.d(i45);
                            }
                            k12 k12Var5 = zi8Var6.e;
                            int i47 = k12Var5.g;
                            if (zi8Var6.d == 3 && zi8Var6.a == 1) {
                                i47 = k12Var5.m;
                            }
                            i45 = z ? i45 - i47 : i45 + i47;
                            if (z) {
                                tn1Var8.d(i45);
                            } else {
                                tn1Var7.d(i45);
                            }
                            if (i46 < i15 && i46 < i) {
                                i45 = z ? i45 - (-tn1Var7.f) : i45 + (-tn1Var7.f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // o.zi8
    public final void d() {
        ArrayList arrayList = this.k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((zi8) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        n61 n61Var = ((zi8) arrayList.get(0)).b;
        n61 n61Var2 = ((zi8) arrayList.get(size - 1)).b;
        int i = this.f;
        tn1 tn1Var = this.i;
        tn1 tn1Var2 = this.h;
        if (i == 0) {
            w51 w51Var = n61Var.H;
            w51 w51Var2 = n61Var2.J;
            tn1 tn1VarI = zi8.i(w51Var, 0);
            int iD = w51Var.d();
            n61 n61VarM = m();
            if (n61VarM != null) {
                iD = n61VarM.H.d();
            }
            if (tn1VarI != null) {
                zi8.b(tn1Var2, tn1VarI, iD);
            }
            tn1 tn1VarI2 = zi8.i(w51Var2, 0);
            int iD2 = w51Var2.d();
            n61 n61VarN = n();
            if (n61VarN != null) {
                iD2 = n61VarN.J.d();
            }
            if (tn1VarI2 != null) {
                zi8.b(tn1Var, tn1VarI2, -iD2);
            }
        } else {
            w51 w51Var3 = n61Var.I;
            w51 w51Var4 = n61Var2.K;
            tn1 tn1VarI3 = zi8.i(w51Var3, 1);
            int iD3 = w51Var3.d();
            n61 n61VarM2 = m();
            if (n61VarM2 != null) {
                iD3 = n61VarM2.I.d();
            }
            if (tn1VarI3 != null) {
                zi8.b(tn1Var2, tn1VarI3, iD3);
            }
            tn1 tn1VarI4 = zi8.i(w51Var4, 1);
            int iD4 = w51Var4.d();
            n61 n61VarN2 = n();
            if (n61VarN2 != null) {
                iD4 = n61VarN2.K.d();
            }
            if (tn1VarI4 != null) {
                zi8.b(tn1Var, tn1VarI4, -iD4);
            }
        }
        tn1Var2.a = this;
        tn1Var.a = this;
    }

    @Override // o.zi8
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return;
            }
            ((zi8) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // o.zi8
    public final void f() {
        this.c = null;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((zi8) it.next()).f();
        }
    }

    @Override // o.zi8
    public final long j() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            zi8 zi8Var = (zi8) arrayList.get(i);
            j = ((long) zi8Var.i.f) + zi8Var.j() + j + ((long) zi8Var.h.f);
        }
        return j;
    }

    @Override // o.zi8
    public final boolean k() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((zi8) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final n61 m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return null;
            }
            n61 n61Var = ((zi8) arrayList.get(i)).b;
            if (n61Var.f0 != 8) {
                return n61Var;
            }
            i++;
        }
    }

    public final n61 n() {
        ArrayList arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            n61 n61Var = ((zi8) arrayList.get(size)).b;
            if (n61Var.f0 != 8) {
                return n61Var;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        for (zi8 zi8Var : this.k) {
            sb.append("<");
            sb.append(zi8Var);
            sb.append("> ");
        }
        return sb.toString();
    }
}
