package o;

/* JADX INFO: loaded from: classes2.dex */
public final class ix2 {
    public final hx2 a;
    public final int b;

    public ix2(hx2 hx2Var, int i) {
        this.a = hx2Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ix2)) {
            return false;
        }
        ix2 ix2Var = (ix2) obj;
        return this.a.equals(ix2Var.a) && this.b == ix2Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KindWithArity(kind=");
        sb.append(this.a);
        sb.append(", arity=");
        return e41.j(sb, this.b, ')');
    }
}
