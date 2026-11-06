package o;

/* JADX INFO: loaded from: classes.dex */
public final class cs7 {
    public static final cs7 c = new cs7(1.0f, 0.0f);
    public final float a;
    public final float b;

    public cs7(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs7)) {
            return false;
        }
        cs7 cs7Var = (cs7) obj;
        return this.a == cs7Var.a && this.b == cs7Var.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TextGeometricTransform(scaleX=" + this.a + ", skewX=" + this.b + ")";
    }
}
