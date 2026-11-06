package o;

/* JADX INFO: loaded from: classes2.dex */
public final class ar3 implements nw3 {
    public static final ar3 a = new ar3();
    public static final hq6 b = et1.s("o.zq3", kq6.d, new fq6[0]);

    @Override // o.nw3
    public final void a(bb7 bb7Var, Object obj) {
        ((zq3) obj).getClass();
        us1.o(bb7Var);
        bb7Var.l();
    }

    @Override // o.nw3
    public final Object b(aj1 aj1Var) {
        us1.n(aj1Var);
        if (aj1Var.r()) {
            throw new jq3(vs1.u("Expected 'null' literal", null, -1, null, null));
        }
        return zq3.INSTANCE;
    }

    @Override // o.nw3
    public final fq6 d() {
        return b;
    }
}
