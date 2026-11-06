package o;

/* JADX INFO: loaded from: classes2.dex */
public final class g58 {
    public final d58 a;
    public final po3 b;

    public g58(d58 d58Var, po3 po3Var) {
        d58Var.getClass();
        po3Var.getClass();
        this.a = d58Var;
        this.b = po3Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g58)) {
            return false;
        }
        g58 g58Var = (g58) obj;
        return im3.n(g58Var.a, this.a) && im3.n(g58Var.b, this.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        return this.b.hashCode() + (iHashCode * 31) + iHashCode;
    }

    public final String toString() {
        return "DataToEraseUpperBound(typeParameter=" + this.a + ", typeAttr=" + this.b + ')';
    }
}
