package o;

/* JADX INFO: loaded from: classes2.dex */
public final class oq3 implements nw3 {
    public static final oq3 a = new oq3();
    public static final hq6 b = et1.r("o.lq3", eo5.e, new fq6[0], new ek3(3));

    @Override // o.nw3
    public final void a(bb7 bb7Var, Object obj) {
        lq3 lq3Var = (lq3) obj;
        lq3Var.getClass();
        us1.o(bb7Var);
        if (lq3Var instanceof gr3) {
            bb7Var.o(hr3.a, lq3Var);
            return;
        }
        if (lq3Var instanceof cr3) {
            bb7Var.o(er3.a, lq3Var);
        } else if (lq3Var instanceof xp3) {
            bb7Var.o(zp3.a, lq3Var);
        } else {
            gk0.s();
        }
    }

    @Override // o.nw3
    public final Object b(aj1 aj1Var) {
        return us1.n(aj1Var).A0();
    }

    @Override // o.nw3
    public final fq6 d() {
        return b;
    }
}
