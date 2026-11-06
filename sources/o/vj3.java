package o;

/* JADX INFO: loaded from: classes.dex */
public final class vj3 implements nd5 {
    public final qj8 a;
    public final md7 b;

    public vj3(qj8 qj8Var, md7 md7Var) {
        this.a = qj8Var;
        this.b = md7Var;
    }

    @Override // o.nd5
    public final float a(j04 j04Var) {
        qj8 qj8Var = this.a;
        md7 md7Var = this.b;
        return md7Var.O(qj8Var.c(md7Var, j04Var));
    }

    @Override // o.nd5
    public final float b(j04 j04Var) {
        qj8 qj8Var = this.a;
        md7 md7Var = this.b;
        return md7Var.O(qj8Var.a(md7Var, j04Var));
    }

    @Override // o.nd5
    public final float c() {
        qj8 qj8Var = this.a;
        md7 md7Var = this.b;
        return md7Var.O(qj8Var.b(md7Var));
    }

    @Override // o.nd5
    public final float d() {
        qj8 qj8Var = this.a;
        md7 md7Var = this.b;
        return md7Var.O(qj8Var.d(md7Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vj3)) {
            return false;
        }
        vj3 vj3Var = (vj3) obj;
        return im3.n(this.a, vj3Var.a) && this.b.equals(vj3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.a + ", density=" + this.b + ")";
    }
}
