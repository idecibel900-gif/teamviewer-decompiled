package o;

/* JADX INFO: loaded from: classes.dex */
public final class fh7 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final long m;
    public final long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f800o;
    public final long p;

    public fh7(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
        this.k = j11;
        this.l = j12;
        this.m = j13;
        this.n = j14;
        this.f800o = j15;
        this.p = j16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof fh7)) {
            return false;
        }
        fh7 fh7Var = (fh7) obj;
        long j = fh7Var.a;
        int i = rv0.i;
        return z68.a(this.a, j) && z68.a(this.b, fh7Var.b) && z68.a(this.c, fh7Var.c) && z68.a(this.d, fh7Var.d) && z68.a(this.e, fh7Var.e) && z68.a(this.f, fh7Var.f) && z68.a(this.g, fh7Var.g) && z68.a(this.h, fh7Var.h) && z68.a(this.i, fh7Var.i) && z68.a(this.j, fh7Var.j) && z68.a(this.k, fh7Var.k) && z68.a(this.l, fh7Var.l) && z68.a(this.m, fh7Var.m) && z68.a(this.n, fh7Var.n) && z68.a(this.f800o, fh7Var.f800o) && z68.a(this.p, fh7Var.p);
    }

    public final int hashCode() {
        int i = rv0.i;
        return Long.hashCode(this.p) + fx3.c(fx3.c(fx3.c(fx3.c(fx3.c(fx3.c(fx3.c(fx3.c(fx3.c(fx3.c(fx3.c(fx3.c(fx3.c(fx3.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.f800o);
    }
}
