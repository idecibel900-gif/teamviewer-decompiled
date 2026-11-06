package o;

import android.view.autofill.AutofillValue;

/* JADX INFO: loaded from: classes.dex */
public final class yd1 extends vm1 implements dp6 {
    public e18 C;
    public zr7 D;
    public j64 E;
    public boolean F;
    public boolean G;
    public boolean H;
    public v65 I;
    public pr7 J;
    public bf3 K;
    public sq2 L;

    public static void X0(j64 j64Var, String str, boolean z, boolean z2) {
        if (z || !z2) {
            return;
        }
        ns7 ns7Var = j64Var.e;
        od1 od1Var = j64Var.v;
        if (ns7Var == null) {
            int length = str.length();
            od1Var.invoke(new zr7(4, h57.a(length, length), str));
        } else {
            zr7 zr7VarJ = j64Var.d.j(qf0.L(new an1(), new cx0(str, 1)));
            ns7Var.a(null, zr7VarJ);
            od1Var.invoke(zr7VarJ);
        }
    }

    @Override // o.dp6
    public final boolean F0() {
        return true;
    }

    @Override // o.dp6
    public final void z(op6 op6Var) {
        boolean z = this.H;
        xo xoVar = this.D.a;
        fw3[] fw3VarArr = lp6.a;
        np6 np6Var = kp6.F;
        fw3[] fw3VarArr2 = lp6.a;
        fw3 fw3Var = fw3VarArr2[18];
        np6Var.getClass();
        op6Var.d(np6Var, xoVar);
        xo xoVar2 = this.C.a;
        np6 np6Var2 = kp6.G;
        fw3 fw3Var2 = fw3VarArr2[19];
        np6Var2.getClass();
        op6Var.d(np6Var2, xoVar2);
        long j = this.D.b;
        np6 np6Var3 = kp6.H;
        fw3 fw3Var3 = fw3VarArr2[20];
        gt7 gt7Var = new gt7(j);
        np6Var3.getClass();
        op6Var.d(np6Var3, gt7Var);
        lp6.c(op6Var, yl7.u);
        lp6.f(op6Var, new pi(AutofillValue.forText(au8.U(this.D.a))));
        boolean z2 = false;
        lp6.b(op6Var, new xd1(this, (byte) 0));
        int i = this.K.d;
        if (i == 6) {
            vb1.a.getClass();
            lp6.e(op6Var, ub1.c);
        } else if (i == 7 || i == 8) {
            vb1.a.getClass();
            lp6.e(op6Var, ub1.b);
        } else if (i == 4) {
            vb1.a.getClass();
            lp6.e(op6Var, ub1.d);
        }
        boolean z3 = this.G;
        f88 f88Var = f88.a;
        if (!z3) {
            op6Var.d(kp6.j, f88Var);
        }
        if (z) {
            op6Var.d(kp6.N, f88Var);
        }
        if (this.G && !this.F) {
            z2 = true;
        }
        np6 np6Var4 = kp6.Q;
        fw3 fw3Var4 = fw3VarArr2[28];
        Boolean boolValueOf = Boolean.valueOf(z2);
        np6Var4.getClass();
        op6Var.d(np6Var4, boolValueOf);
        lp6.a(op6Var, new xd1(this, (byte) 1));
        if (z2) {
            op6Var.d(zo6.k, new m3(null, new xd1(this, (byte) 2)));
            op6Var.d(zo6.f2726o, new m3(null, new xd1(this, op6Var)));
        }
        op6Var.d(zo6.j, new m3(null, new b9(this, (byte) 5)));
        int i2 = this.K.e;
        wd1 wd1Var = new wd1(this, (byte) 6);
        op6Var.d(kp6.J, new af3(i2));
        op6Var.d(zo6.p, new m3(null, wd1Var));
        op6Var.d(zo6.b, new m3(null, new wd1(this, (byte) 7)));
        op6Var.d(zo6.c, new m3(null, new wd1(this, (byte) 1)));
        if (!gt7.c(this.D.b) && !z) {
            op6Var.d(zo6.q, new m3(null, new wd1(this, (byte) 2)));
            if (this.G && !this.F) {
                op6Var.d(zo6.r, new m3(null, new wd1(this, (byte) 3)));
            }
        }
        if (!this.G || this.F) {
            return;
        }
        op6Var.d(zo6.s, new m3(null, new wd1(this, (byte) 5)));
    }
}
