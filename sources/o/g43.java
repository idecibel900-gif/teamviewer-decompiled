package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class g43 extends n61 {
    public float p0 = -1.0f;
    public int q0 = -1;
    public int r0 = -1;
    public w51 s0 = this.I;
    public int t0 = 0;
    public boolean u0;

    public g43() {
        this.Q.clear();
        this.Q.add(this.s0);
        int length = this.P.length;
        for (int i = 0; i < length; i++) {
            this.P[i] = this.s0;
        }
    }

    @Override // o.n61
    public final void M(ba4 ba4Var, boolean z) {
        if (this.S == null) {
            return;
        }
        w51 w51Var = this.s0;
        ba4Var.getClass();
        int iN = ba4.n(w51Var);
        if (this.t0 == 1) {
            this.X = iN;
            this.Y = 0;
            H(this.S.i());
            K(0);
            return;
        }
        this.X = 0;
        this.Y = iN;
        K(this.S.o());
        H(0);
    }

    public final void N(int i) {
        this.s0.i(i);
        this.u0 = true;
    }

    public final void O(int i) {
        w51 w51Var;
        if (this.t0 == i) {
            return;
        }
        this.t0 = i;
        ArrayList arrayList = this.Q;
        arrayList.clear();
        if (this.t0 == 1) {
            w51Var = this.H;
            this.s0 = w51Var;
        } else {
            w51Var = this.I;
            this.s0 = w51Var;
        }
        arrayList.add(w51Var);
        w51[] w51VarArr = this.P;
        int length = w51VarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            w51VarArr[i2] = this.s0;
        }
    }

    @Override // o.n61
    public final void b(ba4 ba4Var, boolean z) {
        o61 o61Var = this.S;
        if (o61Var == null) {
            return;
        }
        Object objG = o61Var.g(2);
        Object objG2 = o61Var.g(4);
        o61 o61Var2 = this.S;
        boolean z2 = o61Var2 != null && o61Var2.o0[0] == 2;
        if (this.t0 == 0) {
            objG = o61Var.g(3);
            objG2 = o61Var.g(5);
            o61 o61Var3 = this.S;
            z2 = o61Var3 != null && o61Var3.o0[1] == 2;
        }
        if (this.u0) {
            w51 w51Var = this.s0;
            if (w51Var.c) {
                k67 k67VarK = ba4Var.k(w51Var);
                ba4Var.d(k67VarK, this.s0.c());
                if (this.q0 != -1) {
                    if (z2) {
                        ba4Var.f(ba4Var.k(objG2), k67VarK, 0, 5);
                    }
                } else if (this.r0 != -1 && z2) {
                    k67 k67VarK2 = ba4Var.k(objG2);
                    ba4Var.f(k67VarK, ba4Var.k(objG), 0, 5);
                    ba4Var.f(k67VarK2, k67VarK, 0, 5);
                }
                this.u0 = false;
                return;
            }
        }
        if (this.q0 != -1) {
            k67 k67VarK3 = ba4Var.k(this.s0);
            ba4Var.e(k67VarK3, ba4Var.k(objG), this.q0, 8);
            if (z2) {
                ba4Var.f(ba4Var.k(objG2), k67VarK3, 0, 5);
                return;
            }
            return;
        }
        if (this.r0 != -1) {
            k67 k67VarK4 = ba4Var.k(this.s0);
            k67 k67VarK5 = ba4Var.k(objG2);
            ba4Var.e(k67VarK4, k67VarK5, -this.r0, 8);
            if (z2) {
                ba4Var.f(k67VarK4, ba4Var.k(objG), 0, 5);
                ba4Var.f(k67VarK5, k67VarK4, 0, 5);
                return;
            }
            return;
        }
        if (this.p0 != -1.0f) {
            k67 k67VarK6 = ba4Var.k(this.s0);
            k67 k67VarK7 = ba4Var.k(objG2);
            float f = this.p0;
            zw zwVarL = ba4Var.l();
            zwVarL.d.g(k67VarK6, -1.0f);
            zwVarL.d.g(k67VarK7, f);
            ba4Var.c(zwVarL);
        }
    }

    @Override // o.n61
    public final boolean c() {
        return true;
    }

    @Override // o.n61
    public final w51 g(int i) {
        int iB = ua5.B(i);
        if (iB != 1) {
            if (iB != 2) {
                if (iB != 3) {
                    if (iB != 4) {
                        return null;
                    }
                }
            }
            if (this.t0 == 0) {
                return this.s0;
            }
            return null;
        }
        if (this.t0 == 1) {
            return this.s0;
        }
        return null;
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
