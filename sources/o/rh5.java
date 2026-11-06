package o;

/* JADX INFO: loaded from: classes.dex */
public final class rh5 extends vh5 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public rh5(float f, float f2, float f3, float f4) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rh5)) {
            return false;
        }
        rh5 rh5Var = (rh5) obj;
        return Float.compare(this.c, rh5Var.c) == 0 && Float.compare(this.d, rh5Var.d) == 0 && Float.compare(this.e, rh5Var.e) == 0 && Float.compare(this.f, rh5Var.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + e41.e(this.e, e41.e(this.d, Float.hashCode(this.c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = e41.n("RelativeReflectiveCurveTo(dx1=", this.c, ", dy1=", this.d, ", dx2=");
        sbN.append(this.e);
        sbN.append(", dy2=");
        sbN.append(this.f);
        sbN.append(")");
        return sbN.toString();
    }
}
