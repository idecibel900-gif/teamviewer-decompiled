package o;

/* JADX INFO: loaded from: classes.dex */
public final class i12 {
    public final int a;
    public final int b;

    public i12(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i12)) {
            return false;
        }
        i12 i12Var = (i12) obj;
        return this.a == i12Var.a && this.b == i12Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return fx3.d(this.a, this.b, "Dimension(width=", ", height=", ")");
    }
}
