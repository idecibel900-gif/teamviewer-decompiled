package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class hg4 implements Iterable, su3 {
    public final long m;
    public final long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f971o;

    public hg4(long j, long j2, long j3) {
        if (j3 == 0) {
            hk0.g("Step must be non-zero.");
            throw null;
        }
        if (j3 == Long.MIN_VALUE) {
            hk0.g("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.m = j;
        if (j3 > 0) {
            if (j < j2) {
                long j4 = j2 % j3;
                long j5 = j % j3;
                long j6 = ((j4 < 0 ? j4 + j3 : j4) - (j5 < 0 ? j5 + j3 : j5)) % j3;
                j2 -= j6 < 0 ? j6 + j3 : j6;
            }
        } else {
            if (j3 >= 0) {
                hk0.g("Step is zero.");
                throw null;
            }
            if (j > j2) {
                long j7 = -j3;
                long j8 = j % j7;
                long j9 = j2 % j7;
                long j10 = ((j8 < 0 ? j8 + j7 : j8) - (j9 < 0 ? j9 + j7 : j9)) % j7;
                j2 += j10 < 0 ? j10 + j7 : j10;
            }
        }
        this.n = j2;
        this.f971o = j3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof hg4)) {
            return false;
        }
        if (isEmpty() && ((hg4) obj).isEmpty()) {
            return true;
        }
        hg4 hg4Var = (hg4) obj;
        return this.m == hg4Var.m && this.n == hg4Var.n && this.f971o == hg4Var.f971o;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Long.hashCode(this.f971o) + fx3.c(Long.hashCode(this.m) * 31, 31, this.n);
    }

    public boolean isEmpty() {
        long j = this.f971o;
        long j2 = this.n;
        long j3 = this.m;
        if (j > 0) {
            return j3 > j2;
        }
        return j3 < j2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ig4(this.m, this.n, this.f971o);
    }

    public String toString() {
        StringBuilder sb;
        long j = this.f971o;
        long j2 = this.n;
        long j3 = this.m;
        if (j > 0) {
            sb = new StringBuilder();
            sb.append(j3);
            sb.append("..");
            sb.append(j2);
            sb.append(" step ");
            sb.append(j);
        } else {
            sb = new StringBuilder();
            sb.append(j3);
            sb.append(" downTo ");
            sb.append(j2);
            sb.append(" step ");
            sb.append(-j);
        }
        return sb.toString();
    }
}
