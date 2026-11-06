package o;

/* JADX INFO: loaded from: classes.dex */
public final class sk7 {
    public final o78 a;
    public final o78 b;
    public final al7 c;
    public final hw2 d;
    public final hw2 e;

    public sk7(o78 o78Var, o78 o78Var2, yk7 yk7Var, yy0 yy0Var, int i) {
        o78Var2 = (i & 2) != 0 ? null : o78Var2;
        yk7Var = (i & 4) != 0 ? null : yk7Var;
        yy0Var = (i & 8) != 0 ? null : yy0Var;
        yy0 yy0Var2 = (i & 16) != 0 ? pm8.i : null;
        this.a = o78Var;
        this.b = o78Var2;
        this.c = yk7Var;
        this.d = yy0Var;
        this.e = yy0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sk7)) {
            return false;
        }
        sk7 sk7Var = (sk7) obj;
        return this.a.equals(sk7Var.a) && im3.n(this.b, sk7Var.b) && im3.n(this.c, sk7Var.c) && im3.n(this.d, sk7Var.d) && im3.n(this.e, sk7Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        o78 o78Var = this.b;
        int iHashCode2 = (iHashCode + (o78Var == null ? 0 : o78Var.hashCode())) * 31;
        al7 al7Var = this.c;
        int iHashCode3 = (iHashCode2 + (al7Var == null ? 0 : al7Var.hashCode())) * 31;
        hw2 hw2Var = this.d;
        int iHashCode4 = (iHashCode3 + (hw2Var == null ? 0 : hw2Var.hashCode())) * 31;
        hw2 hw2Var2 = this.e;
        return iHashCode4 + (hw2Var2 != null ? hw2Var2.hashCode() : 0);
    }

    public final String toString() {
        return "TVListContentItem(title=" + this.a + ", subtitle=" + this.b + ", leadingIcon=" + this.c + ", leadingIconContent=" + this.d + ", trailingContent=" + this.e + ")";
    }
}
