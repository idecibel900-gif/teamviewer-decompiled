package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class f44 extends es4 implements dp6 {
    public Function0 A;
    public b44 B;
    public gb5 C;
    public boolean D;
    public rj6 E;
    public final d44 F = new d44(this, 0);
    public d44 G;

    public f44(Function0 function0, b44 b44Var, gb5 gb5Var, boolean z) {
        this.A = function0;
        this.B = b44Var;
        this.C = gb5Var;
        this.D = z;
        U0();
    }

    @Override // o.es4
    public final boolean J0() {
        return false;
    }

    public final void U0() {
        this.E = new rj6(new e44(this, (byte) 0), new e44(this, (byte) 1));
        this.G = this.D ? new d44(this, (byte) 1) : null;
    }

    @Override // o.dp6
    public final void z(op6 op6Var) {
        fw3[] fw3VarArr;
        lp6.l(op6Var);
        op6Var.d(kp6.P, this.F);
        gb5 gb5Var = this.C;
        rj6 rj6Var = this.E;
        if (gb5Var == gb5.m) {
            if (rj6Var == null) {
                im3.e0("scrollAxisRange");
                throw null;
            }
            np6 np6Var = kp6.w;
            fw3VarArr = lp6.a;
            fw3 fw3Var = fw3VarArr[13];
            np6Var.getClass();
            op6Var.d(np6Var, rj6Var);
        } else {
            if (rj6Var == null) {
                im3.e0("scrollAxisRange");
                throw null;
            }
            np6 np6Var2 = kp6.v;
            fw3VarArr = lp6.a;
            fw3 fw3Var2 = fw3VarArr[12];
            np6Var2.getClass();
            op6Var.d(np6Var2, rj6Var);
        }
        d44 d44Var = this.G;
        if (d44Var != null) {
            op6Var.d(zo6.f, new m3(null, d44Var));
        }
        op6Var.d(zo6.C, new m3(null, new y46(new e44(this, (byte) 2), (byte) 12)));
        b44 b44Var = this.B;
        b44Var.getClass();
        iv0 iv0Var = new iv0(((Number) b44Var.a.getValue()).intValue(), 1);
        np6 np6Var3 = kp6.f;
        fw3 fw3Var3 = fw3VarArr[24];
        np6Var3.getClass();
        op6Var.d(np6Var3, iv0Var);
    }
}
