package o;

/* JADX INFO: loaded from: classes2.dex */
public final class eq0 {
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

    public eq0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
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

    public static e87 a(xv7 xv7Var, ux2 ux2Var) {
        if (xv7Var == xv7.n) {
            ux2Var.W(1539238463);
            e87 e87VarC0 = xs1.c0(du4.p, ux2Var);
            ux2Var.p(false);
            return e87VarC0;
        }
        ux2Var.W(1539331773);
        e87 e87VarC1 = xs1.c0(du4.f656o, ux2Var);
        ux2Var.p(false);
        return e87VarC1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof eq0)) {
            return false;
        }
        eq0 eq0Var = (eq0) obj;
        long j = eq0Var.a;
        int i = rv0.i;
        return z68.a(this.a, j) && z68.a(this.b, eq0Var.b) && z68.a(this.m, eq0Var.m) && z68.a(this.c, eq0Var.c) && z68.a(this.d, eq0Var.d) && z68.a(this.e, eq0Var.e) && z68.a(this.f, eq0Var.f) && z68.a(this.g, eq0Var.g) && z68.a(this.h, eq0Var.h) && z68.a(this.i, eq0Var.i) && z68.a(this.j, eq0Var.j) && z68.a(this.k, eq0Var.k) && z68.a(this.l, eq0Var.l);
    }

    public final int hashCode() {
        int i = rv0.i;
        return Long.hashCode(this.l) + fx3.c(fx3.c(fx3.c(fx3.c(fx3.c(fx3.c(fx3.c(fx3.c(fx3.c(fx3.c(fx3.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.m), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }
}
