package o;

/* JADX INFO: loaded from: classes.dex */
public final class kb0 extends es4 implements cb0, g04 {
    public cb1 A;
    public boolean B;

    public static final v56 U0(kb0 kb0Var, e45 e45Var, x8 x8Var) {
        v56 v56Var;
        if (kb0Var.z && kb0Var.B) {
            e45 e45VarO0 = vn4.o0(kb0Var);
            if (!e45Var.a1().z) {
                e45Var = null;
            }
            if (e45Var != null && (v56Var = (v56) x8Var.a()) != null) {
                return v56Var.i(e45VarO0.b(e45Var, false).d());
            }
        }
        return null;
    }

    @Override // o.es4
    public final boolean J0() {
        return false;
    }

    @Override // o.g04
    public final void Y(i04 i04Var) {
        this.B = true;
    }

    @Override // o.cb0
    public final Object o(e45 e45Var, x8 x8Var, jc1 jc1Var) {
        Object objJ = hm3.j(new t5((Object) this, (Object) e45Var, (Object) x8Var, (Object) new n5(this, e45Var, x8Var, (byte) 8), (hc1) null, (byte) 1), jc1Var);
        return objJ == ne1.m ? objJ : f88.a;
    }
}
