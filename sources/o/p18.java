package o;

/* JADX INFO: loaded from: classes.dex */
public final class p18 implements o18 {
    public final Object a;
    public final Object b;

    public p18(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // o.o18
    public final Object b() {
        return this.a;
    }

    @Override // o.o18
    public final Object d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o18)) {
            return false;
        }
        o18 o18Var = (o18) obj;
        return im3.n(this.a, o18Var.b()) && im3.n(this.b, o18Var.d());
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
