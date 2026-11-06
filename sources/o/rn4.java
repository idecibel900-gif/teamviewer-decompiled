package o;

/* JADX INFO: loaded from: classes.dex */
public final class rn4 {
    public final zv0 a;
    public final h68 b;
    public final tx6 c;
    public final cu4 d;

    public rn4(zv0 zv0Var, h68 h68Var, tx6 tx6Var, cu4 cu4Var) {
        this.a = zv0Var;
        this.b = h68Var;
        this.c = tx6Var;
        this.d = cu4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rn4.class != obj.getClass()) {
            return false;
        }
        rn4 rn4Var = (rn4) obj;
        return im3.n(this.a, rn4Var.a) && im3.n(this.b, rn4Var.b) && im3.n(this.c, rn4Var.c) && im3.n(this.d, rn4Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Values(colorScheme=" + this.a + ", typography=" + this.b + ", shapes=" + this.c + ", motionScheme=" + this.d + ")";
    }
}
