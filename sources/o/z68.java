package o;

/* JADX INFO: loaded from: classes2.dex */
public final class z68 implements Comparable {
    public final long m;

    public /* synthetic */ z68(long j) {
        this.m = j;
    }

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return im3.u(this.m ^ Long.MIN_VALUE, ((z68) obj).m ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z68) {
            return this.m == ((z68) obj).m;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.m);
    }

    public final String toString() {
        long j = this.m;
        if (j >= 0) {
            qf0.s(10);
            String string = Long.toString(j, 10);
            string.getClass();
            return string;
        }
        long j2 = ((j >>> 1) / 10) << 1;
        long j3 = j - (j2 * 10);
        if (j3 >= 10) {
            j3 -= 10;
            j2++;
        }
        qf0.s(10);
        String string2 = Long.toString(j2, 10);
        string2.getClass();
        qf0.s(10);
        String string3 = Long.toString(j3, 10);
        string3.getClass();
        return string2.concat(string3);
    }
}
