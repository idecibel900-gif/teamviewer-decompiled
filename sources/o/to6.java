package o;

/* JADX INFO: loaded from: classes.dex */
public final class to6 {
    public final l43 a;
    public final long b;
    public final so6 c;
    public final boolean d;

    public to6(l43 l43Var, long j, so6 so6Var, boolean z) {
        this.a = l43Var;
        this.b = j;
        this.c = so6Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof to6)) {
            return false;
        }
        to6 to6Var = (to6) obj;
        return this.a == to6Var.a && t65.b(this.b, to6Var.b) && this.c == to6Var.c && this.d == to6Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + fx3.c(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "SelectionHandleInfo(handle=" + this.a + ", position=" + t65.g(this.b) + ", anchor=" + this.c + ", visible=" + this.d + ")";
    }
}
