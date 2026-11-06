package o;

/* JADX INFO: loaded from: classes.dex */
public final class b21 {
    public final long a;
    public final a21 b;

    public b21(long j, a21 a21Var) {
        this.a = j;
        this.b = a21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b21)) {
            return false;
        }
        b21 b21Var = (b21) obj;
        return this.a == b21Var.a && this.b == b21Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ResponseData(sessionId=" + this.a + ", response=" + this.b + ")";
    }
}
