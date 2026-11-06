package o;

/* JADX INFO: loaded from: classes.dex */
public final class sh5 extends vh5 {
    public final float c;
    public final float d;

    public sh5(float f, float f2) {
        super(1);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh5)) {
            return false;
        }
        sh5 sh5Var = (sh5) obj;
        return Float.compare(this.c, sh5Var.c) == 0 && Float.compare(this.d, sh5Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        return "RelativeReflectiveQuadTo(dx=" + this.c + ", dy=" + this.d + ")";
    }
}
