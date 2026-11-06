package o;

/* JADX INFO: loaded from: classes.dex */
public final class p46 implements a17 {
    public final w07 b;

    public p46(w07 w07Var) {
        this.b = w07Var;
    }

    @Override // o.a17
    public final Object e(hc1 hc1Var) {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p46) && this.b.equals(((p46) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "RealSizeResolver(size=" + this.b + ")";
    }
}
