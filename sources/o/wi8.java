package o;

/* JADX INFO: loaded from: classes.dex */
public final class wi8 {
    public final float a;
    public final float b;

    public wi8(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final float[] a() {
        float f = this.a;
        float f2 = this.b;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi8)) {
            return false;
        }
        wi8 wi8Var = (wi8) obj;
        return Float.compare(this.a, wi8Var.a) == 0 && Float.compare(this.b, wi8Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "WhitePoint(x=" + this.a + ", y=" + this.b + ")";
    }
}
