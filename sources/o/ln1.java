package o;

/* JADX INFO: loaded from: classes.dex */
public final class ln1 implements in1 {
    public final float m;
    public final float n;

    public ln1(float f, float f2) {
        this.m = f;
        this.n = f2;
    }

    @Override // o.in1
    public final float Z() {
        return this.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ln1)) {
            return false;
        }
        ln1 ln1Var = (ln1) obj;
        return Float.compare(this.m, ln1Var.m) == 0 && Float.compare(this.n, ln1Var.n) == 0;
    }

    @Override // o.in1
    public final float getDensity() {
        return this.m;
    }

    public final int hashCode() {
        return Float.hashCode(this.n) + (Float.hashCode(this.m) * 31);
    }

    public final String toString() {
        return "DensityImpl(density=" + this.m + ", fontScale=" + this.n + ")";
    }
}
