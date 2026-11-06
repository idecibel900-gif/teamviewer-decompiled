package o;

/* JADX INFO: loaded from: classes.dex */
public final class oh5 extends vh5 {
    public final float c;
    public final float d;

    public oh5(float f, float f2) {
        super(3);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oh5)) {
            return false;
        }
        oh5 oh5Var = (oh5) obj;
        return Float.compare(this.c, oh5Var.c) == 0 && Float.compare(this.d, oh5Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        return "RelativeLineTo(dx=" + this.c + ", dy=" + this.d + ")";
    }
}
