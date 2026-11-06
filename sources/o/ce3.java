package o;

/* JADX INFO: loaded from: classes.dex */
public final class ce3 implements ti2 {
    public final xd3 a;
    public final boolean b;
    public final zg1 c;

    public ce3(xd3 xd3Var, boolean z, zg1 zg1Var) {
        this.a = xd3Var;
        this.b = z;
        this.c = zg1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ce3)) {
            return false;
        }
        ce3 ce3Var = (ce3) obj;
        return this.a.equals(ce3Var.a) && this.b == ce3Var.b && this.c == ce3Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + to7.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ImageFetchResult(image=" + this.a + ", isSampled=" + this.b + ", dataSource=" + this.c + ")";
    }
}
