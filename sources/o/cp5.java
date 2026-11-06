package o;

/* JADX INFO: loaded from: classes.dex */
public final class cp5 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final short f;

    public cp5(boolean z, hn6 hn6Var, boolean z2) {
        h72 h72Var = gk.a;
        int i = !z ? 262152 : 262144;
        i = hn6Var == hn6.n ? i | 8192 : i;
        i = z2 ? i : i | 512;
        boolean z3 = hn6Var == hn6.m;
        this.a = i;
        this.b = z3;
        this.c = true;
        this.d = true;
        this.e = true;
        this.f = (short) 1002;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp5)) {
            return false;
        }
        cp5 cp5Var = (cp5) obj;
        return this.a == cp5Var.a && this.b == cp5Var.b && this.c == cp5Var.c && this.d == cp5Var.d && this.e == cp5Var.e && this.f == cp5Var.f;
    }

    public final int hashCode() {
        return (to7.f(to7.f(to7.f(to7.f(to7.f(this.a * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, false) + this.f) * 31;
    }

    public cp5(int i, boolean z) {
        this((i & 1) != 0 ? false : z, hn6.m, (i & 8) != 0);
    }
}
