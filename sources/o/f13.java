package o;

/* JADX INFO: loaded from: classes.dex */
public final class f13 implements i13 {
    public final l33 a;

    public f13(l33 l33Var) {
        l33Var.getClass();
        this.a = l33Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f13) && im3.n(this.a, ((f13) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DeleteLoading(group=" + this.a + ")";
    }
}
