package o;

/* JADX INFO: loaded from: classes.dex */
public final class l33 {
    public final k33 a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public l33(k33 k33Var, String str, boolean z, boolean z2) {
        this.a = k33Var;
        this.b = str;
        this.c = z;
        this.d = z2;
    }

    public static l33 a(l33 l33Var, String str) {
        k33 k33Var = l33Var.a;
        boolean z = l33Var.c;
        boolean z2 = l33Var.d;
        k33Var.getClass();
        return new l33(k33Var, str, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l33)) {
            return false;
        }
        l33 l33Var = (l33) obj;
        return im3.n(this.a, l33Var.a) && im3.n(this.b, l33Var.b) && this.c == l33Var.c && this.d == l33Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.d) + to7.f((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        return "GroupInfo(id=" + this.a + ", name=" + this.b + ", isLegacy=" + this.c + ", isEditableLegacyGroup=" + this.d + ")";
    }

    public /* synthetic */ l33(k33 k33Var, String str, int i) {
        this(k33Var, (i & 2) != 0 ? null : str, false, false);
    }
}
