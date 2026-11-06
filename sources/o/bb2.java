package o;

/* JADX INFO: loaded from: classes.dex */
public final class bb2 {
    public final xd3 a;
    public final boolean b;
    public final zg1 c;
    public final String d;

    public bb2(xd3 xd3Var, boolean z, zg1 zg1Var, String str) {
        this.a = xd3Var;
        this.b = z;
        this.c = zg1Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb2)) {
            return false;
        }
        bb2 bb2Var = (bb2) obj;
        return im3.n(this.a, bb2Var.a) && this.b == bb2Var.b && this.c == bb2Var.c && im3.n(this.d, bb2Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + to7.f(this.a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ExecuteResult(image=" + this.a + ", isSampled=" + this.b + ", dataSource=" + this.c + ", diskCacheKey=" + this.d + ")";
    }
}
