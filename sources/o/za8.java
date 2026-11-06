package o;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class za8 implements Comparable, Serializable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final za8 f2687o = new za8(0, 0);
    public final long m;
    public final long n;

    public za8(long j, long j2) {
        this.m = j;
        this.n = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        za8 za8Var = (za8) obj;
        za8Var.getClass();
        long j = za8Var.m;
        long j2 = this.m;
        return j2 != j ? Long.compareUnsigned(j2, j) : Long.compareUnsigned(this.n, za8Var.n);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za8)) {
            return false;
        }
        za8 za8Var = (za8) obj;
        return this.m == za8Var.m && this.n == za8Var.n;
    }

    public final int hashCode() {
        return Long.hashCode(this.m ^ this.n);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        i67.o(this.m, bArr, 0, 0, 4);
        bArr[8] = 45;
        i67.o(this.m, bArr, 9, 4, 6);
        bArr[13] = 45;
        i67.o(this.m, bArr, 14, 6, 8);
        bArr[18] = 45;
        i67.o(this.n, bArr, 19, 0, 2);
        bArr[23] = 45;
        i67.o(this.n, bArr, 24, 2, 8);
        return bc7.F(bArr);
    }
}
