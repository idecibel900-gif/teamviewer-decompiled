package o;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ba4 {
    public static boolean q = false;
    public final ts5 d;
    public final iu m;
    public zw p;
    public int a = 1000;
    public boolean b = false;
    public int c = 0;
    public int e = 32;
    public int f = 32;
    public boolean h = false;
    public boolean[] i = new boolean[32];
    public int j = 1;
    public int k = 0;
    public int l = 32;
    public k67[] n = new k67[1000];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f411o = 0;
    public zw[] g = new zw[32];

    public ba4() {
        s();
        iu iuVar = new iu((byte) 12, false);
        iuVar.f1103o = new vo5();
        iuVar.p = new vo5();
        iuVar.n = new k67[32];
        this.m = iuVar;
        ts5 ts5Var = new ts5(iuVar);
        ts5Var.f = new k67[128];
        ts5Var.g = new k67[128];
        ts5Var.h = 0;
        ts5Var.i = new a65(ts5Var);
        this.d = ts5Var;
        this.p = new zw(iuVar);
    }

    public static int n(Object obj) {
        k67 k67Var = ((w51) obj).i;
        if (k67Var != null) {
            return (int) (k67Var.q + 0.5f);
        }
        return 0;
    }

    public final k67 a(int i) {
        vo5 vo5Var = (vo5) this.m.p;
        int i2 = vo5Var.b;
        Object obj = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            Object[] objArr = vo5Var.a;
            Object obj2 = objArr[i3];
            objArr[i3] = null;
            vo5Var.b = i3;
            obj = obj2;
        }
        k67 k67Var = (k67) obj;
        if (k67Var == null) {
            k67Var = new k67(i);
            k67Var.x = i;
        } else {
            k67Var.c();
            k67Var.x = i;
        }
        int i4 = this.f411o;
        int i5 = this.a;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            this.a = i6;
            this.n = (k67[]) Arrays.copyOf(this.n, i6);
        }
        k67[] k67VarArr = this.n;
        int i7 = this.f411o;
        this.f411o = i7 + 1;
        k67VarArr[i7] = k67Var;
        return k67Var;
    }

    public final void b(k67 k67Var, k67 k67Var2, int i, float f, k67 k67Var3, k67 k67Var4, int i2, int i3) {
        zw zwVarL = l();
        if (k67Var2 == k67Var3) {
            zwVarL.d.g(k67Var, 1.0f);
            zwVarL.d.g(k67Var4, 1.0f);
            zwVarL.d.g(k67Var2, -2.0f);
        } else {
            nw nwVar = zwVarL.d;
            if (f == 0.5f) {
                nwVar.g(k67Var, 1.0f);
                zwVarL.d.g(k67Var2, -1.0f);
                zwVarL.d.g(k67Var3, -1.0f);
                zwVarL.d.g(k67Var4, 1.0f);
                if (i > 0 || i2 > 0) {
                    zwVarL.b = (-i) + i2;
                }
            } else if (f <= 0.0f) {
                nwVar.g(k67Var, -1.0f);
                zwVarL.d.g(k67Var2, 1.0f);
                zwVarL.b = i;
            } else if (f >= 1.0f) {
                nwVar.g(k67Var4, -1.0f);
                zwVarL.d.g(k67Var3, 1.0f);
                zwVarL.b = -i2;
            } else {
                float f2 = 1.0f - f;
                nwVar.g(k67Var, f2 * 1.0f);
                zwVarL.d.g(k67Var2, f2 * (-1.0f));
                zwVarL.d.g(k67Var3, (-1.0f) * f);
                zwVarL.d.g(k67Var4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    zwVarL.b = (i2 * f) + ((-i) * f2);
                }
            }
        }
        if (i3 != 8) {
            zwVarL.a(this, i3);
        }
        c(zwVarL);
    }

    /* JADX WARN: Code duplicated, block: B:119:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f5  */
    public final void c(zw zwVar) {
        boolean z;
        boolean z2;
        k67 k67VarF;
        if (this.k + 1 >= this.l || this.j + 1 >= this.f) {
            o();
        }
        if (zwVar.e) {
            z = false;
        } else {
            ArrayList arrayList = zwVar.c;
            if (this.g.length != 0) {
                boolean z3 = false;
                while (!z3) {
                    int iD = zwVar.d.d();
                    for (int i = 0; i < iD; i++) {
                        k67 k67VarE = zwVar.d.e(i);
                        if (k67VarE.f1232o != -1 || k67VarE.r) {
                            arrayList.add(k67VarE);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            k67 k67Var = (k67) arrayList.get(i2);
                            if (k67Var.r) {
                                zwVar.h(this, k67Var, true);
                            } else {
                                zwVar.i(this, this.g[k67Var.f1232o], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z3 = true;
                    }
                }
                if (zwVar.a != null && zwVar.d.d() == 0) {
                    zwVar.e = true;
                    this.b = true;
                }
            }
            if (zwVar.e()) {
                return;
            }
            float f = zwVar.b;
            float f2 = 0.0f;
            if (f < 0.0f) {
                zwVar.b = f * (-1.0f);
                nw nwVar = zwVar.d;
                int i3 = nwVar.h;
                for (int i4 = 0; i3 != -1 && i4 < nwVar.a; i4++) {
                    float[] fArr = nwVar.g;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = nwVar.f[i3];
                }
            }
            int iD2 = zwVar.d.d();
            float f3 = 0.0f;
            float f4 = 0.0f;
            k67 k67Var2 = null;
            k67 k67Var3 = null;
            int i5 = 0;
            boolean z4 = false;
            boolean z5 = false;
            while (i5 < iD2) {
                float f5 = zwVar.d.f(i5);
                k67 k67VarE2 = zwVar.d.e(i5);
                float f6 = f2;
                if (k67VarE2.x == 1) {
                    if (k67Var2 == null) {
                        if (k67VarE2.w <= 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        k67Var2 = k67VarE2;
                        f3 = f5;
                    } else {
                        if (f3 > f5) {
                            if (k67VarE2.w > 1) {
                                z4 = false;
                            }
                            k67Var2 = k67VarE2;
                            f3 = f5;
                        } else if (z4 || k67VarE2.w > 1) {
                        }
                        z4 = true;
                        k67Var2 = k67VarE2;
                        f3 = f5;
                    }
                } else if (k67Var2 == null && f5 < f6) {
                    if (k67Var3 == null) {
                        if (k67VarE2.w <= 1) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        k67Var3 = k67VarE2;
                        f4 = f5;
                    } else {
                        if (f4 > f5) {
                            if (k67VarE2.w > 1) {
                                z5 = false;
                            }
                            k67Var3 = k67VarE2;
                            f4 = f5;
                        } else if (z5 || k67VarE2.w > 1) {
                        }
                        z5 = true;
                        k67Var3 = k67VarE2;
                        f4 = f5;
                    }
                }
                i5++;
                f2 = f6;
            }
            float f7 = f2;
            if (k67Var2 == null) {
                k67Var2 = k67Var3;
            }
            if (k67Var2 == null) {
                z2 = true;
            } else {
                zwVar.g(k67Var2);
                z2 = false;
            }
            if (zwVar.d.d() == 0) {
                zwVar.e = true;
            }
            if (z2) {
                if (this.j + 1 >= this.f) {
                    o();
                }
                k67 k67VarA = a(3);
                int i6 = this.c + 1;
                this.c = i6;
                this.j++;
                k67VarA.n = i6;
                iu iuVar = this.m;
                ((k67[]) iuVar.n)[i6] = k67VarA;
                zwVar.a = k67VarA;
                int i7 = this.k;
                h(zwVar);
                if (this.k == i7 + 1) {
                    zw zwVar2 = this.p;
                    zwVar2.a = null;
                    zwVar2.d.b();
                    for (int i8 = 0; i8 < zwVar.d.d(); i8++) {
                        zwVar2.d.a(zwVar.d.e(i8), zwVar.d.f(i8), true);
                    }
                    r(this.p);
                    if (k67VarA.f1232o == -1) {
                        if (zwVar.a == k67VarA && (k67VarF = zwVar.f(null, k67VarA)) != null) {
                            zwVar.g(k67VarF);
                        }
                        if (!zwVar.e) {
                            zwVar.a.e(this, zwVar);
                        }
                        ((vo5) iuVar.f1103o).b(zwVar);
                        this.k--;
                    }
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            k67 k67Var4 = zwVar.a;
            if (k67Var4 == null) {
                return;
            }
            if (k67Var4.x != 1 && zwVar.b < f7) {
                return;
            }
        }
        if (z) {
            return;
        }
        h(zwVar);
    }

    public final void d(k67 k67Var, int i) {
        int i2 = k67Var.f1232o;
        if (i2 == -1) {
            k67Var.d(this, i);
            for (int i3 = 0; i3 < this.c + 1; i3++) {
                k67 k67Var2 = ((k67[]) this.m.n)[i3];
            }
            return;
        }
        if (i2 == -1) {
            zw zwVarL = l();
            zwVarL.a = k67Var;
            float f = i;
            k67Var.q = f;
            zwVarL.b = f;
            zwVarL.e = true;
            c(zwVarL);
            return;
        }
        zw zwVar = this.g[i2];
        if (zwVar.e) {
            zwVar.b = i;
            return;
        }
        if (zwVar.d.d() == 0) {
            zwVar.e = true;
            zwVar.b = i;
            return;
        }
        zw zwVarL2 = l();
        if (i < 0) {
            zwVarL2.b = i * (-1);
            zwVarL2.d.g(k67Var, 1.0f);
        } else {
            zwVarL2.b = i;
            zwVarL2.d.g(k67Var, -1.0f);
        }
        c(zwVarL2);
    }

    public final void e(k67 k67Var, k67 k67Var2, int i, int i2) {
        if (i2 == 8 && k67Var2.r && k67Var.f1232o == -1) {
            k67Var.d(this, k67Var2.q + i);
            return;
        }
        zw zwVarL = l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            zwVarL.b = i;
        }
        nw nwVar = zwVarL.d;
        if (z) {
            nwVar.g(k67Var, 1.0f);
            zwVarL.d.g(k67Var2, -1.0f);
        } else {
            nwVar.g(k67Var, -1.0f);
            zwVarL.d.g(k67Var2, 1.0f);
        }
        if (i2 != 8) {
            zwVarL.a(this, i2);
        }
        c(zwVarL);
    }

    public final void f(k67 k67Var, k67 k67Var2, int i, int i2) {
        zw zwVarL = l();
        k67 k67VarM = m();
        k67VarM.p = 0;
        zwVarL.b(k67Var, k67Var2, k67VarM, i);
        if (i2 != 8) {
            zwVarL.d.g(j(i2), (int) (zwVarL.d.c(k67VarM) * (-1.0f)));
        }
        c(zwVarL);
    }

    public final void g(k67 k67Var, k67 k67Var2, int i, int i2) {
        zw zwVarL = l();
        k67 k67VarM = m();
        k67VarM.p = 0;
        zwVarL.c(k67Var, k67Var2, k67VarM, i);
        if (i2 != 8) {
            zwVarL.d.g(j(i2), (int) (zwVarL.d.c(k67VarM) * (-1.0f)));
        }
        c(zwVarL);
    }

    public final void h(zw zwVar) {
        int i;
        if (zwVar.e) {
            zwVar.a.d(this, zwVar.b);
        } else {
            zw[] zwVarArr = this.g;
            int i2 = this.k;
            zwVarArr[i2] = zwVar;
            k67 k67Var = zwVar.a;
            k67Var.f1232o = i2;
            this.k = i2 + 1;
            k67Var.e(this, zwVar);
        }
        if (this.b) {
            int i3 = 0;
            while (i3 < this.k) {
                if (this.g[i3] == null) {
                    System.out.println("WTF");
                }
                zw zwVar2 = this.g[i3];
                if (zwVar2 != null && zwVar2.e) {
                    zwVar2.a.d(this, zwVar2.b);
                    ((vo5) this.m.f1103o).b(zwVar2);
                    this.g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.k;
                        if (i4 >= i) {
                            break;
                        }
                        zw[] zwVarArr2 = this.g;
                        int i6 = i4 - 1;
                        zw zwVar3 = zwVarArr2[i4];
                        zwVarArr2[i6] = zwVar3;
                        k67 k67Var2 = zwVar3.a;
                        if (k67Var2.f1232o == i4) {
                            k67Var2.f1232o = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.g[i5] = null;
                    }
                    this.k = i - 1;
                    i3--;
                }
                i3++;
            }
            this.b = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.k; i++) {
            zw zwVar = this.g[i];
            zwVar.a.q = zwVar.b;
        }
    }

    public final k67 j(int i) {
        if (this.j + 1 >= this.f) {
            o();
        }
        k67 k67VarA = a(4);
        float[] fArr = k67VarA.t;
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        k67VarA.n = i2;
        k67VarA.p = i;
        ((k67[]) this.m.n)[i2] = k67VarA;
        ts5 ts5Var = this.d;
        ts5Var.i.n = k67VarA;
        Arrays.fill(fArr, 0.0f);
        fArr[k67VarA.p] = 1.0f;
        ts5Var.j(k67VarA);
        return k67VarA;
    }

    public final k67 k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.j + 1 >= this.f) {
            o();
        }
        if (!(obj instanceof w51)) {
            return null;
        }
        w51 w51Var = (w51) obj;
        k67 k67Var = w51Var.i;
        if (k67Var == null) {
            w51Var.h();
            k67Var = w51Var.i;
        }
        int i = k67Var.n;
        iu iuVar = this.m;
        if (i != -1 && i <= this.c && ((k67[]) iuVar.n)[i] != null) {
            return k67Var;
        }
        if (i != -1) {
            k67Var.c();
        }
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        k67Var.n = i2;
        k67Var.x = 1;
        ((k67[]) iuVar.n)[i2] = k67Var;
        return k67Var;
    }

    public final zw l() {
        Object obj;
        iu iuVar = this.m;
        vo5 vo5Var = (vo5) iuVar.f1103o;
        int i = vo5Var.b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = vo5Var.a;
            obj = objArr[i2];
            objArr[i2] = null;
            vo5Var.b = i2;
        } else {
            obj = null;
        }
        zw zwVar = (zw) obj;
        if (zwVar == null) {
            return new zw(iuVar);
        }
        zwVar.a = null;
        zwVar.d.b();
        zwVar.b = 0.0f;
        zwVar.e = false;
        return zwVar;
    }

    public final k67 m() {
        if (this.j + 1 >= this.f) {
            o();
        }
        k67 k67VarA = a(3);
        int i = this.c + 1;
        this.c = i;
        this.j++;
        k67VarA.n = i;
        ((k67[]) this.m.n)[i] = k67VarA;
        return k67VarA;
    }

    public final void o() {
        int i = this.e * 2;
        this.e = i;
        this.g = (zw[]) Arrays.copyOf(this.g, i);
        iu iuVar = this.m;
        iuVar.n = (k67[]) Arrays.copyOf((k67[]) iuVar.n, this.e);
        int i2 = this.e;
        this.i = new boolean[i2];
        this.f = i2;
        this.l = i2;
    }

    public final void p() {
        ts5 ts5Var = this.d;
        if (ts5Var.e()) {
            i();
            return;
        }
        if (!this.h) {
            q(ts5Var);
            return;
        }
        for (int i = 0; i < this.k; i++) {
            if (!this.g[i].e) {
                q(ts5Var);
                return;
            }
        }
        i();
    }

    public final void q(ts5 ts5Var) {
        for (int i = 0; i < this.k; i++) {
            zw zwVar = this.g[i];
            int i2 = 1;
            if (zwVar.a.x != 1) {
                float f = 0.0f;
                if (zwVar.b < 0.0f) {
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        i3 += i2;
                        float f2 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.k) {
                            zw zwVar2 = this.g[i6];
                            if (zwVar2.a.x != i2 && !zwVar2.e && zwVar2.b < f) {
                                int iD = zwVar2.d.d();
                                int i8 = 0;
                                while (i8 < iD) {
                                    k67 k67VarE = zwVar2.d.e(i8);
                                    float fC = zwVar2.d.c(k67VarE);
                                    if (fC > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = k67VarE.s[i9] / fC;
                                            if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = k67VarE.n;
                                                i4 = i6;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i6++;
                            f = 0.0f;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            zw zwVar3 = this.g[i4];
                            zwVar3.a.f1232o = -1;
                            zwVar3.g(((k67[]) this.m.n)[i5]);
                            k67 k67Var = zwVar3.a;
                            k67Var.f1232o = i4;
                            k67Var.e(this, zwVar3);
                        } else {
                            z = true;
                        }
                        if (i3 > this.j / 2) {
                            z = true;
                        }
                        f = 0.0f;
                        i2 = 1;
                    }
                    break;
                }
            }
        }
        r(ts5Var);
        i();
    }

    public final void r(zw zwVar) {
        boolean z;
        int i = 0;
        for (int i2 = 0; i2 < this.j; i2++) {
            this.i[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            i3++;
            if (i3 >= this.j * 2) {
                return;
            }
            k67 k67Var = zwVar.a;
            if (k67Var != null) {
                this.i[k67Var.n] = true;
            }
            k67 k67VarD = zwVar.d(this.i);
            if (k67VarD != null) {
                boolean[] zArr = this.i;
                int i4 = k67VarD.n;
                if (zArr[i4]) {
                    return;
                } else {
                    zArr[i4] = true;
                }
            }
            if (k67VarD != null) {
                float f = Float.MAX_VALUE;
                int i5 = i;
                int i6 = -1;
                while (i5 < this.k) {
                    zw zwVar2 = this.g[i5];
                    if (zwVar2.a.x != 1 && !zwVar2.e) {
                        nw nwVar = zwVar2.d;
                        int i7 = nwVar.h;
                        if (i7 == -1) {
                            z = false;
                            break;
                        }
                        int i8 = i;
                        while (true) {
                            if (i7 == -1 || i8 >= nwVar.a) {
                                z = false;
                                break;
                            } else if (nwVar.e[i7] == k67VarD.n) {
                                z = true;
                                break;
                            } else {
                                i7 = nwVar.f[i7];
                                i8++;
                            }
                        }
                        if (z) {
                            float fC = zwVar2.d.c(k67VarD);
                            if (fC < 0.0f) {
                                float f2 = (-zwVar2.b) / fC;
                                if (f2 < f) {
                                    i6 = i5;
                                    f = f2;
                                }
                            }
                        }
                    }
                    i5++;
                    i = 0;
                }
                if (i6 > -1) {
                    zw zwVar3 = this.g[i6];
                    zwVar3.a.f1232o = -1;
                    zwVar3.g(k67VarD);
                    k67 k67Var2 = zwVar3.a;
                    k67Var2.f1232o = i6;
                    k67Var2.e(this, zwVar3);
                }
            } else {
                z2 = true;
            }
            i = 0;
        }
    }

    public final void s() {
        for (int i = 0; i < this.k; i++) {
            zw zwVar = this.g[i];
            if (zwVar != null) {
                ((vo5) this.m.f1103o).b(zwVar);
            }
            this.g[i] = null;
        }
    }

    public final void t() {
        iu iuVar;
        int i = 0;
        while (true) {
            iuVar = this.m;
            k67[] k67VarArr = (k67[]) iuVar.n;
            if (i >= k67VarArr.length) {
                break;
            }
            k67 k67Var = k67VarArr[i];
            if (k67Var != null) {
                k67Var.c();
            }
            i++;
        }
        vo5 vo5Var = (vo5) iuVar.p;
        k67[] k67VarArr2 = this.n;
        int length = this.f411o;
        vo5Var.getClass();
        if (length > k67VarArr2.length) {
            length = k67VarArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            k67 k67Var2 = k67VarArr2[i2];
            int i3 = vo5Var.b;
            Object[] objArr = vo5Var.a;
            if (i3 < objArr.length) {
                objArr[i3] = k67Var2;
                vo5Var.b = i3 + 1;
            }
        }
        this.f411o = 0;
        Arrays.fill((k67[]) iuVar.n, (Object) null);
        this.c = 0;
        ts5 ts5Var = this.d;
        ts5Var.h = 0;
        ts5Var.b = 0.0f;
        this.j = 1;
        for (int i4 = 0; i4 < this.k; i4++) {
            zw zwVar = this.g[i4];
        }
        s();
        this.k = 0;
        this.p = new zw(iuVar);
    }
}
