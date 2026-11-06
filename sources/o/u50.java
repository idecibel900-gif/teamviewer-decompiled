package o;

/* JADX INFO: loaded from: classes.dex */
public final class u50 implements ge {
    public final float a;

    public u50(float f) {
        this.a = f;
    }

    @Override // o.ge
    public final int a(int i, int i2, j04 j04Var) {
        return Math.round((1.0f + this.a) * ((i2 - i) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u50) && Float.compare(this.a, ((u50) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "Horizontal(bias=" + this.a + ")";
    }
}
