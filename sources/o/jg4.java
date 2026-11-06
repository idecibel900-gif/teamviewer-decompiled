package o;

/* JADX INFO: loaded from: classes2.dex */
public final class jg4 extends hg4 {
    public static final jg4 p = new jg4(1, 0);

    public jg4(long j, long j2) {
        super(j, j2, 1L);
    }

    @Override // o.hg4
    public final boolean equals(Object obj) {
        if (!(obj instanceof jg4)) {
            return false;
        }
        if (isEmpty() && ((jg4) obj).isEmpty()) {
            return true;
        }
        jg4 jg4Var = (jg4) obj;
        return this.m == jg4Var.m && this.n == jg4Var.n;
    }

    @Override // o.hg4
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Long.hashCode(this.n) + (Long.hashCode(this.m) * 31);
    }

    @Override // o.hg4
    public final boolean isEmpty() {
        return this.m > this.n;
    }

    @Override // o.hg4
    public final String toString() {
        return this.m + ".." + this.n;
    }
}
