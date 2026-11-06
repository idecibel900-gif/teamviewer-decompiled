package o;

/* JADX INFO: loaded from: classes.dex */
public final class qh5 extends vh5 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public qh5(float f, float f2, float f3, float f4) {
        super(1);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh5)) {
            return false;
        }
        qh5 qh5Var = (qh5) obj;
        return Float.compare(this.c, qh5Var.c) == 0 && Float.compare(this.d, qh5Var.d) == 0 && Float.compare(this.e, qh5Var.e) == 0 && Float.compare(this.f, qh5Var.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + e41.e(this.e, e41.e(this.d, Float.hashCode(this.c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = e41.n("RelativeQuadTo(dx1=", this.c, ", dy1=", this.d, ", dx2=");
        sbN.append(this.e);
        sbN.append(", dy2=");
        sbN.append(this.f);
        sbN.append(")");
        return sbN.toString();
    }
}
