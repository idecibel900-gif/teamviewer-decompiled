package o;

/* JADX INFO: loaded from: classes.dex */
public final class h13 implements i13 {
    public final l33 a;
    public final String b;

    public h13(l33 l33Var, String str) {
        this.a = l33Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h13)) {
            return false;
        }
        h13 h13Var = (h13) obj;
        return this.a.equals(h13Var.a) && this.b.equals(h13Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Rename(group=" + this.a + ", renameText=" + this.b + ")";
    }
}
