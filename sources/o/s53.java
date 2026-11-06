package o;

/* JADX INFO: loaded from: classes.dex */
public final class s53 {
    public final v56 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public s53(v56 v56Var, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = v56Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s53)) {
            return false;
        }
        s53 s53Var = (s53) obj;
        return this.a.equals(s53Var.a) && this.b == s53Var.b && this.c == s53Var.c && this.d == s53Var.d && this.e == s53Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + to7.f(to7.f(to7.f(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HingeInfo(bounds=");
        sb.append(this.a);
        sb.append(", isFlat=");
        sb.append(this.b);
        sb.append(", isVertical=");
        fx3.s(sb, this.c, ", isSeparating=", this.d, ", isOccluding=");
        return ua5.n(")", sb, this.e);
    }
}
