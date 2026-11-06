package o;

/* JADX INFO: loaded from: classes.dex */
public final class e18 {
    public final xo a;
    public final v65 b;

    public e18(xo xoVar, v65 v65Var) {
        this.a = xoVar;
        this.b = v65Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e18)) {
            return false;
        }
        e18 e18Var = (e18) obj;
        return im3.n(this.a, e18Var.a) && this.b.equals(e18Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.a) + ", offsetMapping=" + this.b + ")";
    }
}
