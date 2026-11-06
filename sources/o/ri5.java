package o;

/* JADX INFO: loaded from: classes.dex */
public final class ri5 implements ae1 {
    public final float a;

    public ri5(float f) {
        this.a = f;
        if (f < 0.0f || f > 100.0f) {
            ni3.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // o.ae1
    public final float a(long j, in1 in1Var) {
        return (this.a / 100.0f) * y07.b(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ri5) && Float.compare(this.a, ((ri5) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + "%)";
    }
}
