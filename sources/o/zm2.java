package o;

/* JADX INFO: loaded from: classes.dex */
public final class zm2 {
    public final float a;
    public final float b;
    public final long c;

    public zm2(float f, float f2, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zm2)) {
            return false;
        }
        zm2 zm2Var = (zm2) obj;
        return Float.compare(this.a, zm2Var.a) == 0 && Float.compare(this.b, zm2Var.b) == 0 && this.c == zm2Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + e41.e(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return e41.k(e41.n("FlingInfo(initialVelocity=", this.a, ", distance=", this.b, ", duration="), this.c, ")");
    }
}
