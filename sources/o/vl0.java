package o;

/* JADX INFO: loaded from: classes2.dex */
public final class vl0 extends g07 implements am0 {
    public final h58 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final yl0 f2325o;
    public final boolean p;
    public final g48 q;

    public vl0(h58 h58Var, yl0 yl0Var, boolean z, g48 g48Var) {
        h58Var.getClass();
        g48Var.getClass();
        this.n = h58Var;
        this.f2325o = yl0Var;
        this.p = z;
        this.q = g48Var;
    }

    @Override // o.oz3
    public final g48 n0() {
        return this.q;
    }

    @Override // o.oz3
    public final k48 o0() {
        return this.f2325o;
    }

    @Override // o.oz3
    public final boolean p0() {
        return this.p;
    }

    @Override // o.oz3
    public final oz3 q0(uz3 uz3Var) {
        return new vl0(this.n.d(uz3Var), this.f2325o, this.p, this.q);
    }

    @Override // o.g07, o.m98
    public final m98 s0(boolean z) {
        if (z == this.p) {
            return this;
        }
        return new vl0(this.n, this.f2325o, z, this.q);
    }

    @Override // o.m98
    /* JADX INFO: renamed from: t0 */
    public final m98 q0(uz3 uz3Var) {
        return new vl0(this.n.d(uz3Var), this.f2325o, this.p, this.q);
    }

    @Override // o.g07
    public final String toString() {
        StringBuilder sb = new StringBuilder("Captured(");
        sb.append(this.n);
        sb.append(')');
        sb.append(this.p ? "?" : "");
        return sb.toString();
    }

    @Override // o.g07
    /* JADX INFO: renamed from: v0 */
    public final g07 s0(boolean z) {
        if (z == this.p) {
            return this;
        }
        return new vl0(this.n, this.f2325o, z, this.q);
    }

    @Override // o.m98
    /* JADX INFO: renamed from: w0 */
    public final g07 u0(g48 g48Var) {
        g48Var.getClass();
        return new vl0(this.n, this.f2325o, this.p, g48Var);
    }
}
