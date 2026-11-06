package o;

/* JADX INFO: loaded from: classes.dex */
public final class xe3 {
    public final we3 a;
    public final int b;

    public xe3(we3 we3Var, int i) {
        this.a = we3Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe3)) {
            return false;
        }
        xe3 xe3Var = (xe3) obj;
        return this.a.equals(xe3Var.a) && this.b == xe3Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ImageVectorEntry(imageVector=" + this.a + ", configFlags=" + this.b + ")";
    }
}
