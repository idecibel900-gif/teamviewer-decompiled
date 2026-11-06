package o;

/* JADX INFO: loaded from: classes.dex */
public final class ch5 extends vh5 {
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final float i;

    public ch5(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
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
        if (!(obj instanceof ch5)) {
            return false;
        }
        ch5 ch5Var = (ch5) obj;
        return Float.compare(this.c, ch5Var.c) == 0 && Float.compare(this.d, ch5Var.d) == 0 && Float.compare(this.e, ch5Var.e) == 0 && this.f == ch5Var.f && this.g == ch5Var.g && Float.compare(this.h, ch5Var.h) == 0 && Float.compare(this.i, ch5Var.i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + e41.e(this.h, to7.f(to7.f(e41.e(this.e, e41.e(this.d, Float.hashCode(this.c) * 31, 31), 31), 31, this.f), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder sbN = e41.n("ArcTo(horizontalEllipseRadius=", this.c, ", verticalEllipseRadius=", this.d, ", theta=");
        sbN.append(this.e);
        sbN.append(", isMoreThanHalf=");
        sbN.append(this.f);
        sbN.append(", isPositiveArc=");
        sbN.append(this.g);
        sbN.append(", arcStartX=");
        sbN.append(this.h);
        sbN.append(", arcStartY=");
        sbN.append(this.i);
        sbN.append(")");
        return sbN.toString();
    }
}
