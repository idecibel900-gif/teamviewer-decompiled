package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class bk6 extends es4 implements r04, dp6 {
    public hk6 A;
    public boolean B;

    @Override // o.r04
    public final int H(rg4 rg4Var, zn4 zn4Var, int i) {
        if (this.B) {
            i = Integer.MAX_VALUE;
        }
        return zn4Var.k(i);
    }

    @Override // o.r04
    public final eo4 a(fo4 fo4Var, zn4 zn4Var, long j) {
        xk0.m(j, this.B ? gb5.m : gb5.n);
        jl5 jl5VarC = zn4Var.C(r61.b(j, 0, this.B ? r61.i(j) : Integer.MAX_VALUE, 0, this.B ? Integer.MAX_VALUE : r61.h(j), 5));
        int i = jl5VarC.m;
        int i2 = r61.i(j);
        if (i > i2) {
            i = i2;
        }
        int i3 = jl5VarC.n;
        int iH = r61.h(j);
        if (i3 > iH) {
            i3 = iH;
        }
        int i4 = jl5VarC.n - i3;
        int i5 = jl5VarC.m - i;
        if (!this.B) {
            i4 = i5;
        }
        hk6 hk6Var = this.A;
        yf5 yf5Var = hk6Var.f;
        yf5 yf5Var2 = hk6Var.a;
        yf5Var.A(i4);
        n47 n47VarC = el5.c();
        Function1 function1E = n47VarC != null ? n47VarC.e() : null;
        n47 n47VarF = el5.f(n47VarC);
        try {
            if (yf5Var2.z() > i4) {
                yf5Var2.A(i4);
            }
            el5.h(n47VarC, n47VarF, function1E);
            this.A.b.A(this.B ? i3 : i);
            this.A.c.A(this.B ? jl5VarC.n : jl5VarC.m);
            this.A.d.setValue(Boolean.FALSE);
            return fo4Var.u(i, i3, fa2.m, new i56((byte) 1, i4, this, jl5VarC));
        } catch (Throwable th) {
            el5.h(n47VarC, n47VarF, function1E);
            throw th;
        }
    }

    @Override // o.r04
    public final int a0(rg4 rg4Var, zn4 zn4Var, int i) {
        if (this.B) {
            i = Integer.MAX_VALUE;
        }
        return zn4Var.o(i);
    }

    @Override // o.r04
    public final int g(rg4 rg4Var, zn4 zn4Var, int i) {
        if (!this.B) {
            i = Integer.MAX_VALUE;
        }
        return zn4Var.a(i);
    }

    @Override // o.r04
    public final int r0(rg4 rg4Var, zn4 zn4Var, int i) {
        if (!this.B) {
            i = Integer.MAX_VALUE;
        }
        return zn4Var.V(i);
    }

    @Override // o.dp6
    public final void z(op6 op6Var) {
        lp6.l(op6Var);
        final byte b = 0;
        final byte b2 = 1;
        rj6 rj6Var = new rj6(new Function0(this) { // from class: o.ak6
            public final /* synthetic */ bk6 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                int iZ;
                byte b3 = b;
                bk6 bk6Var = this.n;
                switch (b3) {
                    case 0:
                        iZ = bk6Var.A.a.z();
                        break;
                    default:
                        iZ = bk6Var.A.f.z();
                        break;
                }
                return Float.valueOf(iZ);
            }
        }, new Function0(this) { // from class: o.ak6
            public final /* synthetic */ bk6 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                int iZ;
                byte b3 = b2;
                bk6 bk6Var = this.n;
                switch (b3) {
                    case 0:
                        iZ = bk6Var.A.a.z();
                        break;
                    default:
                        iZ = bk6Var.A.f.z();
                        break;
                }
                return Float.valueOf(iZ);
            }
        });
        if (this.B) {
            np6 np6Var = kp6.w;
            fw3 fw3Var = lp6.a[13];
            np6Var.getClass();
            op6Var.d(np6Var, rj6Var);
            return;
        }
        np6 np6Var2 = kp6.v;
        fw3 fw3Var2 = lp6.a[12];
        np6Var2.getClass();
        op6Var.d(np6Var2, rj6Var);
    }
}
