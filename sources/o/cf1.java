package o;

/* JADX INFO: loaded from: classes.dex */
public final class cf1 extends vn4 {
    public final ge s0;

    public cf1(w50 w50Var) {
        this.s0 = w50Var;
    }

    @Override // o.vn4
    public final int W(int i, int i2, j04 j04Var) {
        return this.s0.a(i2, i, j04Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cf1) && im3.n(this.s0, ((cf1) obj).s0);
    }

    public final int hashCode() {
        return this.s0.hashCode();
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.s0 + ")";
    }
}
