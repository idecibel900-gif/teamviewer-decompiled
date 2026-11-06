package o;

/* JADX INFO: loaded from: classes.dex */
public final class pe2 implements qj8 {
    public final qj8 a;
    public final qj8 b;

    public pe2(qj8 qj8Var, qj8 qj8Var2) {
        this.a = qj8Var;
        this.b = qj8Var2;
    }

    @Override // o.qj8
    public final int a(in1 in1Var, j04 j04Var) {
        int iA = this.a.a(in1Var, j04Var) - this.b.a(in1Var, j04Var);
        if (iA < 0) {
            return 0;
        }
        return iA;
    }

    @Override // o.qj8
    public final int b(in1 in1Var) {
        int iB = this.a.b(in1Var) - this.b.b(in1Var);
        if (iB < 0) {
            return 0;
        }
        return iB;
    }

    @Override // o.qj8
    public final int c(in1 in1Var, j04 j04Var) {
        int iC = this.a.c(in1Var, j04Var) - this.b.c(in1Var, j04Var);
        if (iC < 0) {
            return 0;
        }
        return iC;
    }

    @Override // o.qj8
    public final int d(in1 in1Var) {
        int iD = this.a.d(in1Var) - this.b.d(in1Var);
        if (iD < 0) {
            return 0;
        }
        return iD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pe2)) {
            return false;
        }
        pe2 pe2Var = (pe2) obj;
        return im3.n(pe2Var.a, this.a) && im3.n(pe2Var.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.a + " - " + this.b + ")";
    }
}
