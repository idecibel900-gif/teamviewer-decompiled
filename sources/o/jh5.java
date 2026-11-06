package o;

/* JADX INFO: loaded from: classes.dex */
public final class jh5 extends vh5 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public jh5(float f, float f2, float f3, float f4) {
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
        if (!(obj instanceof jh5)) {
            return false;
        }
        jh5 jh5Var = (jh5) obj;
        return Float.compare(this.c, jh5Var.c) == 0 && Float.compare(this.d, jh5Var.d) == 0 && Float.compare(this.e, jh5Var.e) == 0 && Float.compare(this.f, jh5Var.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + e41.e(this.e, e41.e(this.d, Float.hashCode(this.c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = e41.n("ReflectiveCurveTo(x1=", this.c, ", y1=", this.d, ", x2=");
        sbN.append(this.e);
        sbN.append(", y2=");
        sbN.append(this.f);
        sbN.append(")");
        return sbN.toString();
    }
}
