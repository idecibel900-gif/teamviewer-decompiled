package o;

/* JADX INFO: loaded from: classes.dex */
public final class jx1 implements lx1 {
    public final k33 a;

    public jx1(k33 k33Var) {
        k33Var.getClass();
        this.a = k33Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jx1) && im3.n(this.a, ((jx1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ToGroupDetailPane(groupId=" + this.a + ")";
    }
}
