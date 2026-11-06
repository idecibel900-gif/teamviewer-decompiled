package o;

/* JADX INFO: loaded from: classes.dex */
public final class k71 {
    public final String a;
    public final int b;
    public final l71 c;
    public final ra1 d;
    public final String e;

    public k71(String str, int i, l71 l71Var, ra1 ra1Var, String str2) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = l71Var;
        this.d = ra1Var;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k71)) {
            return false;
        }
        k71 k71Var = (k71) obj;
        return im3.n(this.a, k71Var.a) && this.b == k71Var.b && this.c == k71Var.c && this.d == k71Var.d && this.e.equals(k71Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + fx3.a(this.b, this.a.hashCode() * 31, 31)) * 31;
        ra1 ra1Var = this.d;
        return this.e.hashCode() + ((iHashCode + (ra1Var == null ? 0 : ra1Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactFilterOption(label=");
        sb.append(this.a);
        sb.append(", iconRes=");
        sb.append(this.b);
        sb.append(", value=");
        sb.append(this.c);
        sb.append(", statisticEvent=");
        sb.append(this.d);
        sb.append(", testTag=");
        return e41.l(sb, this.e, ")");
    }
}
