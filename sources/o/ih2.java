package o;

/* JADX INFO: loaded from: classes.dex */
public final class ih2 {
    public final float a;
    public final rl2 b;

    public ih2(float f, rl2 rl2Var) {
        this.a = f;
        this.b = rl2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ih2)) {
            return false;
        }
        ih2 ih2Var = (ih2) obj;
        return Float.compare(this.a, ih2Var.a) == 0 && im3.n(this.b, ih2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Fade(alpha=" + this.a + ", animationSpec=" + this.b + ")";
    }
}
