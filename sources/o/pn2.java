package o;

/* JADX INFO: loaded from: classes.dex */
public final class pn2 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public pn2(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof pn2)) {
            return false;
        }
        pn2 pn2Var = (pn2) obj;
        if (w32.b(this.a, pn2Var.a) && w32.b(this.b, pn2Var.b) && w32.b(this.c, pn2Var.c)) {
            return w32.b(this.d, pn2Var.d);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + e41.e(this.c, e41.e(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }
}
