package o;

/* JADX INFO: loaded from: classes.dex */
public final class bz3 {
    public final String a;
    public final vp3 b;
    public final xv3 c;
    public final pv3 d;
    public final int e;

    public bz3(String str, vp3 vp3Var, xv3 xv3Var, pv3 pv3Var, int i) {
        str.getClass();
        this.a = str;
        this.b = vp3Var;
        this.c = xv3Var;
        this.d = pv3Var;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz3)) {
            return false;
        }
        bz3 bz3Var = (bz3) obj;
        return im3.n(this.a, bz3Var.a) && this.b.equals(bz3Var.b) && this.c.equals(bz3Var.c) && im3.n(this.d, bz3Var.d) && this.e == bz3Var.e;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        pv3 pv3Var = this.d;
        return Integer.hashCode(this.e) + ((iHashCode + (pv3Var == null ? 0 : pv3Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Binding(jsonName=");
        sb.append(this.a);
        sb.append(", adapter=");
        sb.append(this.b);
        sb.append(", property=");
        sb.append(this.c);
        sb.append(", parameter=");
        sb.append(this.d);
        sb.append(", propertyIndex=");
        return e41.j(sb, this.e, ')');
    }
}
