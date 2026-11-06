package o;

/* JADX INFO: loaded from: classes.dex */
public final class ix1 implements lx1 {
    public final k33 a;
    public final long b;

    public ix1(long j, k33 k33Var) {
        this.a = k33Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ix1)) {
            return false;
        }
        ix1 ix1Var = (ix1) obj;
        return this.a.equals(ix1Var.a) && this.b == ix1Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ToExtraPane(detailId=" + this.a + ", extraId=" + this.b + ")";
    }
}
