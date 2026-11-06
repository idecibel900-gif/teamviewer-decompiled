package o;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class yl0 implements xl0 {
    public final h58 a;
    public i35 b;

    public yl0(h58 h58Var) {
        h58Var.getClass();
        this.a = h58Var;
        h58Var.a();
    }

    @Override // o.k48
    public final ys0 a() {
        return null;
    }

    @Override // o.k48
    public final Collection b() {
        h58 h58Var = this.a;
        oz3 oz3VarB = h58Var.a() == ub8.q ? h58Var.b() : h().o();
        oz3VarB.getClass();
        return qf0.K(oz3VarB);
    }

    @Override // o.k48
    public final boolean c() {
        return false;
    }

    @Override // o.xl0
    public final h58 d() {
        return this.a;
    }

    @Override // o.k48
    public final List getParameters() {
        return ea2.m;
    }

    @Override // o.k48
    public final wy3 h() {
        wy3 wy3VarH = this.a.b().o0().h();
        wy3VarH.getClass();
        return wy3VarH;
    }

    public final String toString() {
        return "CapturedTypeConstructor(" + this.a + ')';
    }
}
