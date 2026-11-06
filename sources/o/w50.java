package o;

/* JADX INFO: loaded from: classes.dex */
public final class w50 implements ge {
    public final float a;

    public w50(float f) {
        this.a = f;
    }

    @Override // o.ge
    public final int a(int i, int i2, j04 j04Var) {
        float f = (i2 - i) / 2.0f;
        j04 j04Var2 = j04.m;
        float f2 = this.a;
        if (j04Var != j04Var2) {
            f2 *= -1.0f;
        }
        return Math.round((1.0f + f2) * f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w50) && Float.compare(this.a, ((w50) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "Horizontal(bias=" + this.a + ")";
    }
}
