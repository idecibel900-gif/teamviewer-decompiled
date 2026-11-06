package o;

/* JADX INFO: loaded from: classes.dex */
public final class z87 implements jo {
    public final jo a;
    public final long b;

    public z87(rl2 rl2Var, long j) {
        this.a = rl2Var;
        this.b = j;
    }

    @Override // o.jo
    public final ec8 a(yn1 yn1Var) {
        return new a97(this.a.a(yn1Var), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z87)) {
            return false;
        }
        z87 z87Var = (z87) obj;
        return z87Var.b == this.b && im3.n(z87Var.a, this.a);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
