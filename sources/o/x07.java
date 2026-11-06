package o;

/* JADX INFO: loaded from: classes.dex */
public final class x07 implements Comparable {
    public final int m;
    public final int n;

    public x07(int i, int i2) {
        this.m = i;
        this.n = i2;
    }

    public final x07 a(x07 x07Var) {
        int i = x07Var.n;
        int i2 = this.m;
        int i3 = i2 * i;
        int i4 = x07Var.m;
        int i5 = this.n;
        return i3 <= i4 * i5 ? new x07(i4, (i5 * i4) / i2) : new x07((i2 * i) / i5, i);
    }

    public final x07 b(x07 x07Var) {
        int i = x07Var.n;
        int i2 = this.m;
        int i3 = i2 * i;
        int i4 = x07Var.m;
        int i5 = this.n;
        return i3 >= i4 * i5 ? new x07(i4, (i5 * i4) / i2) : new x07((i2 * i) / i5, i);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        x07 x07Var = (x07) obj;
        int i = this.n * this.m;
        int i2 = x07Var.n * x07Var.m;
        if (i2 < i) {
            return 1;
        }
        return i2 > i ? -1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x07.class == obj.getClass()) {
            x07 x07Var = (x07) obj;
            if (this.m == x07Var.m && this.n == x07Var.n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.m * 31) + this.n;
    }

    public final String toString() {
        return this.m + "x" + this.n;
    }
}
