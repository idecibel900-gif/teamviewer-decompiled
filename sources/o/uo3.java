package o;

/* JADX INFO: loaded from: classes2.dex */
public final class uo3 {
    public static final uo3 e = new uo3(null, false);
    public final b65 a;
    public final fw4 b;
    public final boolean c;
    public final boolean d;

    public uo3(b65 b65Var, fw4 fw4Var, boolean z, boolean z2) {
        this.a = b65Var;
        this.b = fw4Var;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo3)) {
            return false;
        }
        uo3 uo3Var = (uo3) obj;
        return this.a == uo3Var.a && this.b == uo3Var.b && this.c == uo3Var.c && this.d == uo3Var.d;
    }

    public final int hashCode() {
        b65 b65Var = this.a;
        int iHashCode = (b65Var == null ? 0 : b65Var.hashCode()) * 31;
        fw4 fw4Var = this.b;
        return Boolean.hashCode(this.d) + to7.f((iHashCode + (fw4Var != null ? fw4Var.hashCode() : 0)) * 31, 31, this.c);
    }

    public final String toString() {
        return "JavaTypeQualifiers(nullability=" + this.a + ", mutability=" + this.b + ", definitelyNotNull=" + this.c + ", isNullabilityQualifierForWarning=" + this.d + ')';
    }

    public /* synthetic */ uo3(b65 b65Var, boolean z) {
        this(b65Var, null, z, false);
    }
}
