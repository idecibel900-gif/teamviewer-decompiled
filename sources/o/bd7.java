package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class bd7 extends vm1 implements ln5, xp2, uq2 {
    public Function0 C;
    public boolean D;
    public final vg7 E;

    public bd7(Function0 function0) {
        this.C = function0;
        ki kiVar = new ki(this, (byte) 3);
        bn5 bn5Var = qg7.a;
        vg7 vg7Var = new vg7(null, null, kiVar);
        U0(vg7Var);
        this.E = vg7Var;
    }

    @Override // o.xp2
    public final void D(wq2 wq2Var) {
        this.D = wq2Var.b();
    }

    @Override // o.ln5
    public final void D0(bn5 bn5Var, cn5 cn5Var, long j) {
        this.E.D0(bn5Var, cn5Var, j);
    }

    @Override // o.ln5
    public final void E() {
        this.E.E();
    }

    @Override // o.ln5
    public final long m() {
        b42 b42Var = e8.y;
        in1 in1Var = vn4.p0(this).L;
        b42Var.getClass();
        int i = q08.b;
        return n37.r(in1Var.q0(10.0f), in1Var.q0(40.0f), in1Var.q0(10.0f), in1Var.q0(40.0f));
    }
}
