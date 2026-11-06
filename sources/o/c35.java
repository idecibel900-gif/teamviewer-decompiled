package o;

/* JADX INFO: loaded from: classes.dex */
public final class c35 {
    public final int a;
    public final long b;
    public final long c;
    public final w25 d;
    public final a77 e;
    public final Object f;

    public c35(int i, long j, long j2, w25 w25Var, a77 a77Var, Object obj) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = w25Var;
        this.e = a77Var;
        this.f = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c35)) {
            return false;
        }
        c35 c35Var = (c35) obj;
        return this.a == c35Var.a && this.b == c35Var.b && this.c == c35Var.c && im3.n(this.d, c35Var.d) && im3.n(this.e, c35Var.e) && im3.n(this.f, c35Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.a.hashCode() + fx3.c(fx3.c(this.a * 31, 31, this.b), 31, this.c)) * 31;
        a77 a77Var = this.e;
        int iHashCode2 = (iHashCode + (a77Var == null ? 0 : a77Var.m.hashCode())) * 31;
        Object obj = this.f;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkResponse(code=" + this.a + ", requestMillis=" + this.b + ", responseMillis=" + this.c + ", headers=" + this.d + ", body=" + this.e + ", delegate=" + this.f + ")";
    }
}
