package o;

/* JADX INFO: loaded from: classes.dex */
public final class xz0 {
    public final int a;
    public final Integer b;

    public xz0(int i, v67 v67Var, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xz0)) {
            return false;
        }
        xz0 xz0Var = (xz0) obj;
        return this.a == xz0Var.a && im3.n(null, null) && im3.n(this.b, xz0Var.b);
    }

    public final int hashCode() {
        int iHashCode = ((Integer.hashCode(this.a) * 31) + 0) * 31;
        Integer num = this.b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.a + ", sourceInfo=" + ((Object) null) + ", groupOffset=" + this.b + ")";
    }
}
