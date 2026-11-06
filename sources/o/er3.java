package o;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class er3 implements nw3 {
    public static final er3 a = new er3();
    public static final dr3 b = dr3.b;

    @Override // o.nw3
    public final void a(bb7 bb7Var, Object obj) {
        cr3 cr3Var = (cr3) obj;
        cr3Var.getClass();
        us1.o(bb7Var);
        new ja4(gb7.a, oq3.a).a(bb7Var, cr3Var);
    }

    @Override // o.nw3
    public final Object b(aj1 aj1Var) {
        us1.n(aj1Var);
        return new cr3((Map) new ja4(gb7.a, oq3.a).i(aj1Var));
    }

    @Override // o.nw3
    public final fq6 d() {
        return b;
    }
}
