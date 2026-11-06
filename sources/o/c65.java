package o;

/* JADX INFO: loaded from: classes2.dex */
public final class c65 {
    public final b65 a;
    public final boolean b;

    public c65(b65 b65Var) {
        this.a = b65Var;
        this.b = false;
    }

    public static c65 a(c65 c65Var, b65 b65Var, boolean z, int i) {
        if ((i & 1) != 0) {
            b65Var = c65Var.a;
        }
        if ((i & 2) != 0) {
            z = c65Var.b;
        }
        c65Var.getClass();
        b65Var.getClass();
        return new c65(b65Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c65)) {
            return false;
        }
        c65 c65Var = (c65) obj;
        return this.a == c65Var.a && this.b == c65Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.a + ", isForWarningOnly=" + this.b + ')';
    }

    public c65(b65 b65Var, boolean z) {
        this.a = b65Var;
        this.b = z;
    }
}
