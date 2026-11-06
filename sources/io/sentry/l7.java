package io.sentry;

/* JADX INFO: loaded from: classes.dex */
public final class l7 implements j0 {
    public final String a;
    public final String b;

    public l7() {
        String property = System.getProperty("java.version");
        String property2 = System.getProperty("java.vendor");
        this.a = property;
        this.b = property2;
    }

    @Override // io.sentry.j0
    public final v5 b(v5 v5Var, p0 p0Var) {
        e(v5Var);
        return v5Var;
    }

    @Override // io.sentry.j0
    public final io.sentry.protocol.f0 c(io.sentry.protocol.f0 f0Var, p0 p0Var) {
        e(f0Var);
        return f0Var;
    }

    public final void e(h5 h5Var) {
        io.sentry.protocol.e eVar = h5Var.n;
        if (eVar.i() == null) {
            eVar.v(new io.sentry.protocol.y());
        }
        io.sentry.protocol.y yVarI = eVar.i();
        if (yVarI != null && yVarI.m == null && yVarI.n == null) {
            yVarI.m = this.b;
            yVarI.n = this.a;
        }
    }
}
