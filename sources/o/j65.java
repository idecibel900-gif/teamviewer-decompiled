package o;

/* JADX INFO: loaded from: classes.dex */
public final class j65 {
    public final int a;
    public final Integer b;

    public j65(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j65)) {
            return false;
        }
        j65 j65Var = (j65) obj;
        return this.a == j65Var.a && im3.n(this.b, j65Var.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.a + ", dataOffset=" + this.b + ")";
    }
}
