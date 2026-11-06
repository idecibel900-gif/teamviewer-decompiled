package o;

/* JADX INFO: loaded from: classes.dex */
public final class ng0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public ng0(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final ng0 a(long j, long j2, long j3, long j4) {
        return new ng0(j != 16 ? j : this.a, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ng0)) {
            return false;
        }
        ng0 ng0Var = (ng0) obj;
        long j = ng0Var.a;
        int i = rv0.i;
        return z68.a(this.a, j) && z68.a(this.b, ng0Var.b) && z68.a(this.c, ng0Var.c) && z68.a(this.d, ng0Var.d);
    }

    public final int hashCode() {
        int i = rv0.i;
        return Long.hashCode(this.d) + fx3.c(fx3.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
