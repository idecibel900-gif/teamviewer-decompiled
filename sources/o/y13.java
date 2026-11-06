package o;

/* JADX INFO: loaded from: classes.dex */
public final class y13 {
    public final r13 a;
    public final String b;

    public y13(r13 r13Var, String str) {
        r13Var.getClass();
        str.getClass();
        this.a = r13Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y13)) {
            return false;
        }
        y13 y13Var = (y13) obj;
        return im3.n(this.a, y13Var.a) && im3.n(this.b, y13Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SearchContext(browseContext=" + this.a + ", query=" + this.b + ")";
    }
}
