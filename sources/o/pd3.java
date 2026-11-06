package o;

/* JADX INFO: loaded from: classes.dex */
public final class pd3 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public pd3(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public static /* synthetic */ pd3 b(pd3 pd3Var, long j, long j2, long j3, int i) {
        if ((i & 1) != 0) {
            j = pd3Var.a;
        }
        long j4 = j;
        long j5 = pd3Var.c;
        if ((i & 8) != 0) {
            j3 = pd3Var.d;
        }
        return pd3Var.a(j4, j2, j5, j3);
    }

    public final pd3 a(long j, long j2, long j3, long j4) {
        return new pd3(j != 16 ? j : this.a, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof pd3)) {
            return false;
        }
        pd3 pd3Var = (pd3) obj;
        long j = pd3Var.a;
        int i = rv0.i;
        return z68.a(this.a, j) && z68.a(this.b, pd3Var.b) && z68.a(this.c, pd3Var.c) && z68.a(this.d, pd3Var.d);
    }

    public final int hashCode() {
        int i = rv0.i;
        return Long.hashCode(this.d) + fx3.c(fx3.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
