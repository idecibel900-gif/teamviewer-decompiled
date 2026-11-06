package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a30 extends n61 {
    public n61[] p0;
    public int q0;
    public int r0;
    public boolean s0;
    public int t0;
    public boolean u0;

    public final void N(int i, ArrayList arrayList, yi8 yi8Var) {
        for (int i2 = 0; i2 < this.q0; i2++) {
            n61 n61Var = this.p0[i2];
            ArrayList arrayList2 = yi8Var.a;
            if (!arrayList2.contains(n61Var)) {
                arrayList2.add(n61Var);
            }
        }
        for (int i3 = 0; i3 < this.q0; i3++) {
            zu1.s(this.p0[i3], i, arrayList, yi8Var);
        }
    }

    public final boolean O() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.q0;
            if (i4 >= i) {
                break;
            }
            n61 n61Var = this.p0[i4];
            if ((this.s0 || n61Var.c()) && ((((i2 = this.r0) == 0 || i2 == 1) && !n61Var.y()) || (((i3 = this.r0) == 2 || i3 == 3) && !n61Var.z()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.q0; i5++) {
            n61 n61Var2 = this.p0[i5];
            if (this.s0 || n61Var2.c()) {
                if (!z2) {
                    int i6 = this.r0;
                    if (i6 == 0) {
                        iMax = n61Var2.g(2).c();
                    } else if (i6 == 1) {
                        iMax = n61Var2.g(4).c();
                    } else if (i6 == 2) {
                        iMax = n61Var2.g(3).c();
                    } else if (i6 == 3) {
                        iMax = n61Var2.g(5).c();
                    }
                    z2 = true;
                }
                int i7 = this.r0;
                if (i7 == 0) {
                    iMax = Math.min(iMax, n61Var2.g(2).c());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, n61Var2.g(4).c());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, n61Var2.g(3).c());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, n61Var2.g(5).c());
                }
            }
        }
        int i8 = iMax + this.t0;
        int i9 = this.r0;
        if (i9 == 0 || i9 == 1) {
            F(i8, i8);
        } else {
            G(i8, i8);
        }
        this.u0 = true;
        return true;
    }

    public final int P() {
        int i = this.r0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // o.n61
    public final void b(ba4 ba4Var, boolean z) {
        boolean z2;
        int i;
        int i2;
        w51[] w51VarArr = this.P;
        w51 w51Var = this.H;
        w51VarArr[0] = w51Var;
        int i3 = 2;
        w51 w51Var2 = this.I;
        w51VarArr[2] = w51Var2;
        w51 w51Var3 = this.J;
        w51VarArr[1] = w51Var3;
        w51 w51Var4 = this.K;
        w51VarArr[3] = w51Var4;
        for (w51 w51Var5 : w51VarArr) {
            w51Var5.i = ba4Var.k(w51Var5);
        }
        int i4 = this.r0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        w51 w51Var6 = w51VarArr[i4];
        if (!this.u0) {
            O();
        }
        if (this.u0) {
            this.u0 = false;
            int i5 = this.r0;
            if (i5 == 0 || i5 == 1) {
                ba4Var.d(w51Var.i, this.X);
                ba4Var.d(w51Var3.i, this.X);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    ba4Var.d(w51Var2.i, this.Y);
                    ba4Var.d(w51Var4.i, this.Y);
                    return;
                }
                return;
            }
        }
        int i6 = 0;
        while (true) {
            if (i6 >= this.q0) {
                z2 = false;
                break;
            }
            n61 n61Var = this.p0[i6];
            if ((this.s0 || n61Var.c()) && ((((i2 = this.r0) == 0 || i2 == 1) && n61Var.o0[0] == 3 && n61Var.H.f != null && n61Var.J.f != null) || ((i2 == 2 || i2 == 3) && n61Var.o0[1] == 3 && n61Var.I.f != null && n61Var.K.f != null))) {
                z2 = true;
                break;
            }
            i6++;
        }
        boolean z3 = w51Var.e() || w51Var3.e();
        boolean z4 = w51Var2.e() || w51Var4.e();
        int i7 = !(!z2 && (((i = this.r0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.q0) {
            n61 n61Var2 = this.p0[i8];
            if (this.s0 || n61Var2.c()) {
                k67 k67VarK = ba4Var.k(n61Var2.P[this.r0]);
                w51[] w51VarArr2 = n61Var2.P;
                int i9 = this.r0;
                w51 w51Var7 = w51VarArr2[i9];
                w51Var7.i = k67VarK;
                w51 w51Var8 = w51Var7.f;
                int i10 = (w51Var8 == null || w51Var8.d != this) ? 0 : w51Var7.g;
                if (i9 == 0 || i9 == i3) {
                    k67 k67Var = w51Var6.i;
                    int i11 = this.t0 - i10;
                    zw zwVarL = ba4Var.l();
                    k67 k67VarM = ba4Var.m();
                    k67VarM.p = 0;
                    zwVarL.c(k67Var, k67VarK, k67VarM, i11);
                    ba4Var.c(zwVarL);
                } else {
                    k67 k67Var2 = w51Var6.i;
                    int i12 = this.t0 + i10;
                    zw zwVarL2 = ba4Var.l();
                    k67 k67VarM2 = ba4Var.m();
                    k67VarM2.p = 0;
                    zwVarL2.b(k67Var2, k67VarK, k67VarM2, i12);
                    ba4Var.c(zwVarL2);
                }
                ba4Var.e(w51Var6.i, k67VarK, this.t0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.r0;
        if (i13 == 0) {
            ba4Var.e(w51Var3.i, w51Var.i, 0, 8);
            ba4Var.e(w51Var.i, this.S.J.i, 0, 4);
            ba4Var.e(w51Var.i, this.S.H.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            ba4Var.e(w51Var.i, w51Var3.i, 0, 8);
            ba4Var.e(w51Var.i, this.S.H.i, 0, 4);
            ba4Var.e(w51Var.i, this.S.J.i, 0, 0);
        } else if (i13 == 2) {
            ba4Var.e(w51Var4.i, w51Var2.i, 0, 8);
            ba4Var.e(w51Var2.i, this.S.K.i, 0, 4);
            ba4Var.e(w51Var2.i, this.S.I.i, 0, 0);
        } else if (i13 == 3) {
            ba4Var.e(w51Var2.i, w51Var4.i, 0, 8);
            ba4Var.e(w51Var2.i, this.S.I.i, 0, 4);
            ba4Var.e(w51Var2.i, this.S.K.i, 0, 0);
        }
    }

    @Override // o.n61
    public final boolean c() {
        return true;
    }

    @Override // o.n61
    public final String toString() {
        String strL = e41.l(new StringBuilder("[Barrier] "), this.g0, " {");
        for (int i = 0; i < this.q0; i++) {
            n61 n61Var = this.p0[i];
            if (i > 0) {
                strL = strL.concat(", ");
            }
            strL = strL + n61Var.g0;
        }
        return strL.concat("}");
    }

    @Override // o.n61
    public final boolean y() {
        return this.u0;
    }

    @Override // o.n61
    public final boolean z() {
        return this.u0;
    }
}
