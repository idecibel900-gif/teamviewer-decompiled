package o;

/* JADX INFO: loaded from: classes.dex */
public final class k06 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public k06(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof k06)) {
            return false;
        }
        k06 k06Var = (k06) obj;
        long j = k06Var.a;
        int i = rv0.i;
        return z68.a(this.a, j) && z68.a(this.b, k06Var.b) && z68.a(this.c, k06Var.c) && z68.a(this.d, k06Var.d);
    }

    public final int hashCode() {
        int i = rv0.i;
        return Long.hashCode(this.d) + fx3.c(fx3.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
