package o;

/* JADX INFO: loaded from: classes.dex */
public final class z81 {
    public final String a;
    public final a91 b;
    public final ra1 c;
    public final String d;

    public z81(String str, a91 a91Var, ra1 ra1Var, String str2) {
        str.getClass();
        this.a = str;
        this.b = a91Var;
        this.c = ra1Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z81)) {
            return false;
        }
        z81 z81Var = (z81) obj;
        return im3.n(this.a, z81Var.a) && this.b == z81Var.b && this.c == z81Var.c && this.d.equals(z81Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        ra1 ra1Var = this.c;
        return this.d.hashCode() + ((iHashCode + (ra1Var == null ? 0 : ra1Var.hashCode())) * 31);
    }

    public final String toString() {
        return "ContactSortOption(label=" + this.a + ", value=" + this.b + ", statisticEvent=" + this.c + ", testTag=" + this.d + ")";
    }
}
