package o;

/* JADX INFO: loaded from: classes.dex */
public final class ih5 extends vh5 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public ih5(float f, float f2, float f3, float f4) {
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
        if (!(obj instanceof ih5)) {
            return false;
        }
        ih5 ih5Var = (ih5) obj;
        return Float.compare(this.c, ih5Var.c) == 0 && Float.compare(this.d, ih5Var.d) == 0 && Float.compare(this.e, ih5Var.e) == 0 && Float.compare(this.f, ih5Var.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + e41.e(this.e, e41.e(this.d, Float.hashCode(this.c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = e41.n("QuadTo(x1=", this.c, ", y1=", this.d, ", x2=");
        sbN.append(this.e);
        sbN.append(", y2=");
        sbN.append(this.f);
        sbN.append(")");
        return sbN.toString();
    }
}
