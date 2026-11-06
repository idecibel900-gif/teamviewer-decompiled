package o;

/* JADX INFO: loaded from: classes.dex */
public final class gh5 extends vh5 {
    public final float c;
    public final float d;

    public gh5(float f, float f2) {
        super(3);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gh5)) {
            return false;
        }
        gh5 gh5Var = (gh5) obj;
        return Float.compare(this.c, gh5Var.c) == 0 && Float.compare(this.d, gh5Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        return "LineTo(x=" + this.c + ", y=" + this.d + ")";
    }
}
