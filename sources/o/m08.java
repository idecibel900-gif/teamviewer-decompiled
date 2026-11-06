package o;

/* JADX INFO: loaded from: classes.dex */
public final class m08 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public m08(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof m08)) {
            return false;
        }
        m08 m08Var = (m08) obj;
        long j = m08Var.a;
        int i = rv0.i;
        return z68.a(this.a, j) && z68.a(this.b, m08Var.b) && z68.a(this.c, m08Var.c) && z68.a(this.d, m08Var.d) && z68.a(this.e, m08Var.e) && z68.a(this.f, m08Var.f);
    }

    public final int hashCode() {
        int i = rv0.i;
        return Long.hashCode(this.f) + fx3.c(fx3.c(fx3.c(fx3.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
