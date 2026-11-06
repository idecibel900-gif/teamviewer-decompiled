package o;

/* JADX INFO: loaded from: classes.dex */
public final class x32 implements ae1 {
    public final float a;

    public x32(float f) {
        this.a = f;
    }

    @Override // o.ae1
    public final float a(long j, in1 in1Var) {
        return in1Var.d0(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x32) && w32.b(this.a, ((x32) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + ".dp)";
    }
}
