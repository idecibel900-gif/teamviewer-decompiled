package o;

/* JADX INFO: loaded from: classes.dex */
public final class hh5 extends vh5 {
    public final float c;
    public final float d;

    public hh5(float f, float f2) {
        super(3);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh5)) {
            return false;
        }
        hh5 hh5Var = (hh5) obj;
        return Float.compare(this.c, hh5Var.c) == 0 && Float.compare(this.d, hh5Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        return "MoveTo(x=" + this.c + ", y=" + this.d + ")";
    }
}
