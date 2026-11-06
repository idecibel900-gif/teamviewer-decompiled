package o;

/* JADX INFO: loaded from: classes2.dex */
public final class u12 extends k58 {
    public final k58 b;
    public final k58 c;

    public u12(k58 k58Var, k58 k58Var2) {
        this.b = k58Var;
        this.c = k58Var2;
    }

    @Override // o.k58
    public final boolean a() {
        return this.b.a() || this.c.a();
    }

    @Override // o.k58
    public final boolean b() {
        return this.b.b() || this.c.b();
    }

    @Override // o.k58
    public final up c(up upVar) {
        upVar.getClass();
        return this.c.c(this.b.c(upVar));
    }

    @Override // o.k58
    public final h58 d(oz3 oz3Var) {
        h58 h58VarD = this.b.d(oz3Var);
        return h58VarD == null ? this.c.d(oz3Var) : h58VarD;
    }

    @Override // o.k58
    public final oz3 f(oz3 oz3Var, ub8 ub8Var) {
        oz3Var.getClass();
        ub8Var.getClass();
        return this.c.f(this.b.f(oz3Var, ub8Var), ub8Var);
    }
}
