package o;

/* JADX INFO: loaded from: classes.dex */
public final class qi1 {
    public final xd3 a;
    public final boolean b;

    public qi1(xd3 xd3Var, boolean z) {
        this.a = xd3Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qi1)) {
            return false;
        }
        qi1 qi1Var = (qi1) obj;
        return this.a.equals(qi1Var.a) && this.b == qi1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DecodeResult(image=" + this.a + ", isSampled=" + this.b + ")";
    }
}
