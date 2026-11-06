package o;

/* JADX INFO: loaded from: classes.dex */
public final class bo6 {
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

    public bo6(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof bo6)) {
            return false;
        }
        bo6 bo6Var = (bo6) obj;
        long j = bo6Var.a;
        int i = rv0.i;
        return z68.a(this.a, j) && z68.a(this.b, bo6Var.b) && z68.a(this.c, bo6Var.c) && z68.a(this.d, bo6Var.d) && z68.a(this.e, bo6Var.e) && z68.a(this.f, bo6Var.f) && z68.a(this.g, bo6Var.g) && z68.a(this.h, bo6Var.h) && z68.a(this.i, bo6Var.i) && z68.a(this.j, bo6Var.j) && z68.a(this.k, bo6Var.k) && z68.a(this.l, bo6Var.l) && z68.a(this.m, bo6Var.m);
    }

    public final int hashCode() {
        int i = rv0.i;
        return Long.hashCode(this.m) + fx3.c(fx3.c(fx3.c(fx3.c(fx3.c(fx3.c(fx3.c(fx3.c(fx3.c(fx3.c(fx3.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }
}
