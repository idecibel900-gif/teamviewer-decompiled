package o;

/* JADX INFO: loaded from: classes.dex */
public final class ao1 {
    public static final ao1 c = new ao1(0, 0);
    public final long a;
    public final long b;

    public ao1(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ao1) {
            ao1 ao1Var = (ao1) obj;
            return dl3.b(this.a, ao1Var.a) && this.b == ao1Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
