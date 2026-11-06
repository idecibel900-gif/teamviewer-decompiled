package o;

/* JADX INFO: loaded from: classes.dex */
public final class se implements bq4 {
    public final w50 a;
    public final w50 b;

    public se(w50 w50Var, w50 w50Var2) {
        this.a = w50Var;
        this.b = w50Var2;
    }

    @Override // o.bq4
    public final int a(zk3 zk3Var, long j, int i, j04 j04Var) {
        int iA = this.b.a(0, zk3Var.f(), j04Var);
        return zk3Var.a + iA + (-this.a.a(0, i, j04Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se)) {
            return false;
        }
        se seVar = (se) obj;
        return this.a.equals(seVar.a) && this.b.equals(seVar.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + (Float.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        return "Horizontal(menuAlignment=" + this.a + ", anchorAlignment=" + this.b + ")";
    }
}
