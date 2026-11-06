package o;

/* JADX INFO: loaded from: classes2.dex */
public final class cn4 {
    public final String a;
    public final yk3 b;

    public cn4(String str, yk3 yk3Var) {
        this.a = str;
        this.b = yk3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn4)) {
            return false;
        }
        cn4 cn4Var = (cn4) obj;
        return this.a.equals(cn4Var.a) && this.b.equals(cn4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.a + ", range=" + this.b + ')';
    }
}
