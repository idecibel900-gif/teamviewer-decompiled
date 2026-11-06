package o;

/* JADX INFO: loaded from: classes.dex */
public final class e13 implements i13 {
    public final l33 a;
    public final boolean b;

    public e13(l33 l33Var, boolean z) {
        this.a = l33Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e13)) {
            return false;
        }
        e13 e13Var = (e13) obj;
        return this.a.equals(e13Var.a) && this.b == e13Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Delete(group=" + this.a + ", isGroupEmpty=" + this.b + ")";
    }
}
