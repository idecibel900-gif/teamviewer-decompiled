package o;

/* JADX INFO: loaded from: classes.dex */
public final class pi6 {
    public final float a;
    public final long b;
    public final rl2 c;

    public pi6(float f, long j, rl2 rl2Var) {
        this.a = f;
        this.b = j;
        this.c = rl2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pi6)) {
            return false;
        }
        pi6 pi6Var = (pi6) obj;
        return Float.compare(this.a, pi6Var.a) == 0 && d18.a(this.b, pi6Var.b) && im3.n(this.c, pi6Var.c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.a) * 31;
        int i = d18.c;
        return this.c.hashCode() + fx3.c(iHashCode, 31, this.b);
    }

    public final String toString() {
        return "Scale(scale=" + this.a + ", transformOrigin=" + d18.d(this.b) + ", animationSpec=" + this.c + ")";
    }
}
