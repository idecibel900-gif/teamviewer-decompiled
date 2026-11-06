package o;

/* JADX INFO: loaded from: classes2.dex */
public final class u68 implements Comparable {
    public final int m;

    public /* synthetic */ u68(int i) {
        this.m = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return im3.t(this.m ^ Integer.MIN_VALUE, ((u68) obj).m ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u68) {
            return this.m == ((u68) obj).m;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.m);
    }

    public final String toString() {
        return String.valueOf(((long) this.m) & 4294967295L);
    }
}
