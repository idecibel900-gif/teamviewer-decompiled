package o;

/* JADX INFO: loaded from: classes.dex */
public final class m3 {
    public final String a;
    public final pw2 b;

    public m3(String str, pw2 pw2Var) {
        this.a = str;
        this.b = pw2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3)) {
            return false;
        }
        m3 m3Var = (m3) obj;
        return im3.n(this.a, m3Var.a) && im3.n(this.b, m3Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        pw2 pw2Var = this.b;
        return iHashCode + (pw2Var != null ? pw2Var.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.a + ", action=" + this.b + ")";
    }
}
