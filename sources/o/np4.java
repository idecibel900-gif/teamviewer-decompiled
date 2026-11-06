package o;

/* JADX INFO: loaded from: classes.dex */
public final class np4 {
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

    public np4(long j, long j2, long j3, long j4, long j5, long j6) {
        int i = rv0.i;
        long j7 = rv0.h;
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j7;
        this.i = j7;
        this.j = j7;
        this.k = j7;
        this.l = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof np4)) {
            return false;
        }
        np4 np4Var = (np4) obj;
        long j = np4Var.a;
        int i = rv0.i;
        return z68.a(this.a, j) && z68.a(this.g, np4Var.g) && z68.a(this.b, np4Var.b) && z68.a(this.c, np4Var.c) && z68.a(this.d, np4Var.d) && z68.a(this.e, np4Var.e) && z68.a(this.f, np4Var.f) && z68.a(this.h, np4Var.h) && z68.a(this.i, np4Var.i) && z68.a(this.j, np4Var.j) && z68.a(this.k, np4Var.k) && z68.a(this.l, np4Var.l);
    }

    public final int hashCode() {
        int i = rv0.i;
        return Long.hashCode(this.l) + fx3.c(fx3.c(fx3.c(fx3.c(fx3.c(fx3.c(fx3.c(fx3.c(fx3.c(fx3.c(Long.hashCode(this.a) * 31, 31, this.g), 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }
}
