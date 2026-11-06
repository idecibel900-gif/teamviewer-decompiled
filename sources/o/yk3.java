package o;

/* JADX INFO: loaded from: classes2.dex */
public final class yk3 extends wk3 {
    public static final yk3 p = new yk3(1, 0, 1);

    @Override // o.wk3
    public final boolean equals(Object obj) {
        if (!(obj instanceof yk3)) {
            return false;
        }
        if (isEmpty() && ((yk3) obj).isEmpty()) {
            return true;
        }
        yk3 yk3Var = (yk3) obj;
        return this.m == yk3Var.m && this.n == yk3Var.n;
    }

    @Override // o.wk3
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.m * 31) + this.n;
    }

    @Override // o.wk3
    public final boolean isEmpty() {
        return this.m > this.n;
    }

    @Override // o.wk3
    public final String toString() {
        return this.m + ".." + this.n;
    }
}
