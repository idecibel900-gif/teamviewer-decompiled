package o;

/* JADX INFO: loaded from: classes.dex */
public final class d90 {
    public final float a;
    public final t57 b;

    public d90(float f, t57 t57Var) {
        this.a = f;
        this.b = t57Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d90)) {
            return false;
        }
        d90 d90Var = (d90) obj;
        return w32.b(this.a, d90Var.a) && this.b.equals(d90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + w32.c(this.a) + ", brush=" + this.b + ")";
    }
}
