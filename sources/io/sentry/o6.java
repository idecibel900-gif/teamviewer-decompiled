package io.sentry;

/* JADX INFO: loaded from: classes.dex */
public final class o6 extends l5 {
    public final long m;
    public final long n;

    public o6() {
        this(System.currentTimeMillis(), System.nanoTime());
    }

    @Override // io.sentry.l5, java.lang.Comparable
    /* JADX INFO: renamed from: a */
    public final int compareTo(l5 l5Var) {
        if (!(l5Var instanceof o6)) {
            return super.compareTo(l5Var);
        }
        o6 o6Var = (o6) l5Var;
        long j = o6Var.m;
        long j2 = this.m;
        return j2 == j ? Long.compare(this.n, o6Var.n) : Long.compare(j2, j);
    }

    @Override // io.sentry.l5
    public final long b(l5 l5Var) {
        return l5Var instanceof o6 ? this.n - ((o6) l5Var).n : super.b(l5Var);
    }

    @Override // io.sentry.l5
    public final long c(l5 l5Var) {
        if (!(l5Var instanceof o6)) {
            return super.c(l5Var);
        }
        o6 o6Var = (o6) l5Var;
        long j = o6Var.n;
        int iCompareTo = compareTo(l5Var);
        long j2 = this.n;
        if (iCompareTo < 0) {
            return d() + (j - j2);
        }
        return o6Var.d() + (j2 - j);
    }

    @Override // io.sentry.l5
    public final long d() {
        return this.m * 1000000;
    }

    public o6(long j, long j2) {
        this.m = j;
        this.n = j2;
    }
}
