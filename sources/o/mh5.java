package o;

/* JADX INFO: loaded from: classes.dex */
public final class mh5 extends vh5 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public mh5(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mh5)) {
            return false;
        }
        mh5 mh5Var = (mh5) obj;
        return Float.compare(this.c, mh5Var.c) == 0 && Float.compare(this.d, mh5Var.d) == 0 && Float.compare(this.e, mh5Var.e) == 0 && Float.compare(this.f, mh5Var.f) == 0 && Float.compare(this.g, mh5Var.g) == 0 && Float.compare(this.h, mh5Var.h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + e41.e(this.g, e41.e(this.f, e41.e(this.e, e41.e(this.d, Float.hashCode(this.c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = e41.n("RelativeCurveTo(dx1=", this.c, ", dy1=", this.d, ", dx2=");
        sbN.append(this.e);
        sbN.append(", dy2=");
        sbN.append(this.f);
        sbN.append(", dx3=");
        sbN.append(this.g);
        sbN.append(", dy3=");
        sbN.append(this.h);
        sbN.append(")");
        return sbN.toString();
    }
}
