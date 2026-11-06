package o;

/* JADX INFO: loaded from: classes.dex */
public final class si6 implements ae1 {
    public final ae1 a;
    public final float b;

    public si6(ae1 ae1Var, float f) {
        ae1Var.getClass();
        this.a = ae1Var;
        this.b = f;
    }

    @Override // o.ae1
    public final float a(long j, in1 in1Var) {
        in1Var.getClass();
        return this.a.a(j, in1Var) * this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si6)) {
            return false;
        }
        si6 si6Var = (si6) obj;
        return im3.n(this.a, si6Var.a) && Float.compare(this.b, si6Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ScaledCornerSize(base=" + this.a + ", fraction=" + this.b + ")";
    }
}
