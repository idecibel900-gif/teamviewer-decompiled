package o;

/* JADX INFO: loaded from: classes.dex */
public final class ab0 implements xa0 {
    public final in1 a;
    public final long b;

    public ab0(md7 md7Var, long j) {
        this.a = md7Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab0)) {
            return false;
        }
        ab0 ab0Var = (ab0) obj;
        return im3.n(this.a, ab0Var.a) && r61.c(this.b, ab0Var.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.a + ", constraints=" + r61.m(this.b) + ")";
    }
}
