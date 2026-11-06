package o;

/* JADX INFO: loaded from: classes.dex */
public final class a42 {
    public final long a;

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a42) {
            return this.a == ((a42) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        long j = this.a;
        return j != 9205357640488583168L ? fx3.g(w32.c(b(j)), " x ", w32.c(a(j))) : "DpSize.Unspecified";
    }
}
