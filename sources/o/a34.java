package o;

/* JADX INFO: loaded from: classes.dex */
public final class a34 {
    public final int a;
    public final int b;

    public a34(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (!(i >= 0)) {
            ni3.a("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        ni3.a("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a34)) {
            return false;
        }
        a34 a34Var = (a34) obj;
        return this.a == a34Var.a && this.b == a34Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return fx3.d(this.a, this.b, "Interval(start=", ", end=", ")");
    }
}
