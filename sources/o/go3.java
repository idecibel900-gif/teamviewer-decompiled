package o;

/* JADX INFO: loaded from: classes2.dex */
public final class go3 {
    public static final go3 d = new go3(za6.STRICT, 6);
    public final za6 a;
    public final vz3 b;
    public final za6 c;

    public go3(za6 za6Var, int i) {
        this(za6Var, (i & 2) != 0 ? new vz3(1, 0, 0) : null, za6Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go3)) {
            return false;
        }
        go3 go3Var = (go3) obj;
        return this.a == go3Var.a && im3.n(this.b, go3Var.b) && this.c == go3Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        vz3 vz3Var = this.b;
        return this.c.hashCode() + ((iHashCode + (vz3Var == null ? 0 : vz3Var.p)) * 31);
    }

    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.a + ", sinceVersion=" + this.b + ", reportLevelAfter=" + this.c + ')';
    }

    public go3(za6 za6Var, vz3 vz3Var, za6 za6Var2) {
        this.a = za6Var;
        this.b = vz3Var;
        this.c = za6Var2;
    }
}
