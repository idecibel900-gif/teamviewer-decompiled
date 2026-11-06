package o;

/* JADX INFO: loaded from: classes.dex */
public final class c88 implements qj8 {
    public final qj8 a;
    public final qj8 b;

    public c88(qj8 qj8Var, qj8 qj8Var2) {
        this.a = qj8Var;
        this.b = qj8Var2;
    }

    @Override // o.qj8
    public final int a(in1 in1Var, j04 j04Var) {
        return Math.max(this.a.a(in1Var, j04Var), this.b.a(in1Var, j04Var));
    }

    @Override // o.qj8
    public final int b(in1 in1Var) {
        return Math.max(this.a.b(in1Var), this.b.b(in1Var));
    }

    @Override // o.qj8
    public final int c(in1 in1Var, j04 j04Var) {
        return Math.max(this.a.c(in1Var, j04Var), this.b.c(in1Var, j04Var));
    }

    @Override // o.qj8
    public final int d(in1 in1Var) {
        return Math.max(this.a.d(in1Var), this.b.d(in1Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c88)) {
            return false;
        }
        c88 c88Var = (c88) obj;
        return im3.n(c88Var.a, this.a) && im3.n(c88Var.b, this.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " ∪ " + this.b + ")";
    }
}
