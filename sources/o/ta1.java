package o;

/* JADX INFO: loaded from: classes.dex */
public final class ta1 {
    public final int a;
    public final long b;
    public final ua1 c;
    public final l07 d;

    public ta1(int i, long j, ua1 ua1Var, l07 l07Var) {
        this.a = i;
        this.b = j;
        this.c = ua1Var;
        this.d = l07Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ta1)) {
            return false;
        }
        ta1 ta1Var = (ta1) obj;
        return this.a == ta1Var.a && this.b == ta1Var.b && this.c == ta1Var.c && im3.n(this.d, ta1Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + fx3.c(Integer.hashCode(this.a) * 31, 31, this.b)) * 31;
        l07 l07Var = this.d;
        return iHashCode + (l07Var == null ? 0 : l07Var.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.a + ", timestamp=" + this.b + ", type=" + this.c + ", structureCompat=" + this.d + ")";
    }
}
