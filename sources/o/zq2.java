package o;

/* JADX INFO: loaded from: classes.dex */
public final class zq2 extends vm1 implements o65, v01 {
    public final br2 C;
    public t34 D;

    public zq2() {
        br2 br2Var = new br2(0, new ea1(2, this, zq2.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, (byte) 1), 9);
        U0(br2Var);
        this.C = br2Var;
    }

    @Override // o.o65
    public final void n0() {
        k76 k76Var = new k76();
        bt1.J(this, new ql1(k76Var, this, (byte) 4));
        t34 t34Var = (t34) k76Var.m;
        if (this.C.Z0().b()) {
            t34 t34Var2 = this.D;
            if (t34Var2 != null) {
                t34Var2.b();
            }
            if (t34Var != null) {
                t34Var.a();
            } else {
                t34Var = null;
            }
            this.D = t34Var;
        }
    }
}
