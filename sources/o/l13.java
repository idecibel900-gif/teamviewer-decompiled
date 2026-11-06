package o;

/* JADX INFO: loaded from: classes.dex */
public final class l13 {
    public final String a;
    public final m13 b;
    public final g02 c;
    public final String d;

    public l13(String str, m13 m13Var, g02 g02Var, String str2) {
        str.getClass();
        g02Var.getClass();
        this.a = str;
        this.b = m13Var;
        this.c = g02Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l13)) {
            return false;
        }
        l13 l13Var = (l13) obj;
        return im3.n(this.a, l13Var.a) && this.b == l13Var.b && this.c == l13Var.c && this.d.equals(l13Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "GroupDeviceSortOption(label=" + this.a + ", value=" + this.b + ", statisticEvent=" + this.c + ", testTag=" + this.d + ")";
    }
}
