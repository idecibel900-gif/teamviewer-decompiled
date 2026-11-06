package o;

/* JADX INFO: loaded from: classes.dex */
public final class kh5 extends vh5 {
    public final float c;
    public final float d;

    public kh5(float f, float f2) {
        super(1);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kh5)) {
            return false;
        }
        kh5 kh5Var = (kh5) obj;
        return Float.compare(this.c, kh5Var.c) == 0 && Float.compare(this.d, kh5Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        return "ReflectiveQuadTo(x=" + this.c + ", y=" + this.d + ")";
    }
}
