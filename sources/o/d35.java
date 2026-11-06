package o;

/* JADX INFO: loaded from: classes.dex */
public final class d35 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public d35(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d35)) {
            return false;
        }
        d35 d35Var = (d35) obj;
        return this.a == d35Var.a && this.b == d35Var.b && this.c == d35Var.c && this.d == d35Var.d && this.e == d35Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + to7.f(to7.f(to7.f(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkState(isConnected=");
        sb.append(this.a);
        sb.append(", isValidated=");
        sb.append(this.b);
        sb.append(", isMetered=");
        fx3.s(sb, this.c, ", isNotRoaming=", this.d, ", isBlocked=");
        return ua5.n(")", sb, this.e);
    }
}
