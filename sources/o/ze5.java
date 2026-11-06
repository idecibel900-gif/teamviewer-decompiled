package o;

/* JADX INFO: loaded from: classes.dex */
public final class ze5 {
    public final pr5 a;
    public final pr5 b;
    public final ir c;
    public boolean d;
    public final float e;

    public ze5() {
        pr5 pr5Var = pr5.a;
        this.a = pr5Var;
        this.b = pr5Var;
        this.c = oe5.a;
        this.d = false;
        this.e = Float.NaN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ze5)) {
            return false;
        }
        ze5 ze5Var = (ze5) obj;
        return im3.n(this.a, ze5Var.a) && im3.n(this.b, ze5Var.b) && im3.n(this.c, ze5Var.c) && this.d == ze5Var.d && w32.b(this.e, ze5Var.e);
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + to7.f((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        boolean z = this.d;
        String strC = w32.c(this.e);
        StringBuilder sb = new StringBuilder("PaneScaffoldParentDataImpl(preferredWidthInternal=");
        sb.append(this.a);
        sb.append(", preferredHeightInternal=");
        sb.append(this.b);
        sb.append(", paneMargins=");
        sb.append(this.c);
        sb.append(", isAnimatedPane=");
        sb.append(z);
        sb.append(", minTouchTargetSize=");
        return e41.l(sb, strC, ")");
    }
}
