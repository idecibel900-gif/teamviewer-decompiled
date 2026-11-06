package o;

/* JADX INFO: loaded from: classes.dex */
public final class y50 implements he {
    public final float a;
    public final float b;

    public y50(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // o.he
    public final long a(long j, long j2, j04 j04Var) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        j04 j04Var2 = j04.m;
        float f3 = this.a;
        if (j04Var != j04Var2) {
            f3 *= -1.0f;
        }
        float f4 = (1.0f + this.b) * f2;
        int iRound = Math.round((f3 + 1.0f) * f);
        return (((long) Math.round(f4)) & 4294967295L) | (((long) iRound) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y50)) {
            return false;
        }
        y50 y50Var = (y50) obj;
        return Float.compare(this.a, y50Var.a) == 0 && Float.compare(this.b, y50Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BiasAlignment(horizontalBias=" + this.a + ", verticalBias=" + this.b + ")";
    }
}
