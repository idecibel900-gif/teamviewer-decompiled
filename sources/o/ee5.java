package o;

/* JADX INFO: loaded from: classes.dex */
public final class ee5 extends fe5 {
    public final float a;

    public ee5(float f) {
        this.a = f;
    }

    @Override // o.fe5
    public final int b(int i, in1 in1Var) {
        return ct1.v(vn4.s0(i * this.a), 0, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ee5) {
            return this.a == ((ee5) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "PaneExpansionAnchor(Proportion = " + this.a + ")";
    }
}
