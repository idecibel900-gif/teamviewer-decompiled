package o;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class um2 extends m98 implements sz3 {
    public final g07 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final g07 f2226o;

    public um2(g07 g07Var, g07 g07Var2) {
        g07Var.getClass();
        g07Var2.getClass();
        this.n = g07Var;
        this.f2226o = g07Var2;
    }

    @Override // o.oz3
    public zo4 I() {
        return v0().I();
    }

    @Override // o.oz3
    public final List m0() {
        return v0().m0();
    }

    @Override // o.oz3
    public final g48 n0() {
        return v0().n0();
    }

    @Override // o.oz3
    public final k48 o0() {
        return v0().o0();
    }

    @Override // o.oz3
    public final boolean p0() {
        return v0().p0();
    }

    public String toString() {
        return qo1.e.X(this);
    }

    public g07 v0() {
        return this.n;
    }

    public String w0(qo1 qo1Var, qo1 qo1Var2) {
        boolean zO = qo1Var2.a.o();
        g07 g07Var = this.f2226o;
        g07 g07Var2 = this.n;
        if (!zO) {
            return qo1Var.E(qo1Var.X(g07Var2), qo1Var.X(g07Var), n37.m(this));
        }
        return "(" + qo1Var.X(g07Var2) + ".." + qo1Var.X(g07Var) + ')';
    }
}
