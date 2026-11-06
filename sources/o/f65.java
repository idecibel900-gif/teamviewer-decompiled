package o;

/* JADX INFO: loaded from: classes2.dex */
public final class f65 implements nw3 {
    public final nw3 a;
    public final gq6 b;

    public f65(nw3 nw3Var) {
        nw3Var.getClass();
        this.a = nw3Var;
        this.b = new gq6(nw3Var.d());
    }

    @Override // o.nw3
    public final void a(bb7 bb7Var, Object obj) {
        if (obj != null) {
            bb7Var.o(this.a, obj);
        } else {
            bb7Var.l();
        }
    }

    @Override // o.nw3
    public final Object b(aj1 aj1Var) {
        if (aj1Var.r()) {
            return aj1Var.a(this.a);
        }
        return null;
    }

    @Override // o.nw3
    public final fq6 d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && f65.class == obj.getClass() && im3.n(this.a, ((f65) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
