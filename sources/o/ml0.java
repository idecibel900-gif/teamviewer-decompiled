package o;

/* JADX INFO: loaded from: classes.dex */
public final class ml0 {
    public in1 a;
    public j04 b;
    public ll0 c;
    public long d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml0)) {
            return false;
        }
        ml0 ml0Var = (ml0) obj;
        return im3.n(this.a, ml0Var.a) && this.b == ml0Var.b && im3.n(this.c, ml0Var.c) && y07.a(this.d, ml0Var.d);
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + y07.d(this.d) + ")";
    }
}
