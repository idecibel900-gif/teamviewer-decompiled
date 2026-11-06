package o;

/* JADX INFO: loaded from: classes.dex */
public final class lw6 {
    public static final lw6 d = new lw6(j51.j(4278190080L), 0, 0.0f);
    public final long a;
    public final long b;
    public final float c;

    public lw6(long j, long j2, float f) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lw6)) {
            return false;
        }
        lw6 lw6Var = (lw6) obj;
        long j = lw6Var.a;
        int i = rv0.i;
        return z68.a(this.a, j) && t65.b(this.b, lw6Var.b) && this.c == lw6Var.c;
    }

    public final int hashCode() {
        int i = rv0.i;
        return Float.hashCode(this.c) + fx3.c(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbO = e41.o("Shadow(color=", rv0.h(this.a), ", offset=", t65.g(this.b), ", blurRadius=");
        sbO.append(this.c);
        sbO.append(")");
        return sbO.toString();
    }
}
