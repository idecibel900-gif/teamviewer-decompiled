package o;

/* JADX INFO: loaded from: classes.dex */
public final class lh5 extends vh5 {
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final float i;

    public lh5(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = z;
        this.g = z2;
        this.h = f4;
        this.i = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lh5)) {
            return false;
        }
        lh5 lh5Var = (lh5) obj;
        return Float.compare(this.c, lh5Var.c) == 0 && Float.compare(this.d, lh5Var.d) == 0 && Float.compare(this.e, lh5Var.e) == 0 && this.f == lh5Var.f && this.g == lh5Var.g && Float.compare(this.h, lh5Var.h) == 0 && Float.compare(this.i, lh5Var.i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + e41.e(this.h, to7.f(to7.f(e41.e(this.e, e41.e(this.d, Float.hashCode(this.c) * 31, 31), 31), 31, this.f), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder sbN = e41.n("RelativeArcTo(horizontalEllipseRadius=", this.c, ", verticalEllipseRadius=", this.d, ", theta=");
        sbN.append(this.e);
        sbN.append(", isMoreThanHalf=");
        sbN.append(this.f);
        sbN.append(", isPositiveArc=");
        sbN.append(this.g);
        sbN.append(", arcStartDx=");
        sbN.append(this.h);
        sbN.append(", arcStartDy=");
        sbN.append(this.i);
        sbN.append(")");
        return sbN.toString();
    }
}
