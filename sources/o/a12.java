package o;

/* JADX INFO: loaded from: classes.dex */
public final class a12 {
    public final boolean a;
    public final boolean b;
    public final hn6 c;
    public final boolean d;

    public a12(int i) {
        boolean z = (i & 1) != 0;
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        this.a = z;
        this.b = z2;
        this.c = hn6.m;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a12)) {
            return false;
        }
        a12 a12Var = (a12) obj;
        return this.a == a12Var.a && this.b == a12Var.b && this.c == a12Var.c && this.d == a12Var.d;
    }

    public final int hashCode() {
        return (((Boolean.hashCode(true) + to7.f((this.c.hashCode() + to7.f(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d)) * 31) + 2) * 31;
    }
}
