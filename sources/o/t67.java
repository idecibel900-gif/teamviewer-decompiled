package o;

/* JADX INFO: loaded from: classes.dex */
public final class t67 implements ti2 {
    public final te3 a;
    public final String b;
    public final zg1 c;

    public t67(te3 te3Var, String str, zg1 zg1Var) {
        this.a = te3Var;
        this.b = str;
        this.c = zg1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t67)) {
            return false;
        }
        t67 t67Var = (t67) obj;
        return im3.n(this.a, t67Var.a) && im3.n(this.b, t67Var.b) && this.c == t67Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "SourceFetchResult(source=" + this.a + ", mimeType=" + this.b + ", dataSource=" + this.c + ")";
    }
}
