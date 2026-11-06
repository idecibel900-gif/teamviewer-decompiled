package o;

/* JADX INFO: loaded from: classes2.dex */
public final class hr3 implements nw3 {
    public static final hr3 a = new hr3();
    public static final hq6 b = et1.s("o.gr3", is5.l, new fq6[0]);

    @Override // o.nw3
    public final void a(bb7 bb7Var, Object obj) {
        gr3 gr3Var = (gr3) obj;
        gr3Var.getClass();
        us1.o(bb7Var);
        if (gr3Var instanceof zq3) {
            bb7Var.o(ar3.a, zq3.INSTANCE);
        } else {
            bb7Var.o(xq3.a, (wq3) gr3Var);
        }
    }

    @Override // o.nw3
    public final Object b(aj1 aj1Var) {
        ab7 ab7VarN = us1.n(aj1Var);
        lq3 lq3VarA0 = ab7VarN.A0();
        if (lq3VarA0 instanceof gr3) {
            return (gr3) lq3VarA0;
        }
        throw new jq3(vs1.u(ua5.o(w86.a, lq3VarA0.getClass(), new StringBuilder("Unexpected JSON element, expected JsonPrimitive, had ")), null, -1, null, ab7VarN.B0().a.g ? vs1.I(-1, lq3VarA0.toString()).toString() : null));
    }

    @Override // o.nw3
    public final fq6 d() {
        return b;
    }
}
