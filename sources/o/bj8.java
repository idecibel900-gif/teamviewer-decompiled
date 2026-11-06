package o;

/* JADX INFO: loaded from: classes.dex */
public final class bj8 {
    public final ll8 a;
    public final np5 b;

    public bj8(ll8 ll8Var, np5 np5Var) {
        this.a = ll8Var;
        this.b = np5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj8)) {
            return false;
        }
        bj8 bj8Var = (bj8) obj;
        return this.a.equals(bj8Var.a) && this.b.equals(bj8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowAdaptiveInfo(windowSizeClass=" + this.a + ", windowPosture=" + this.b + ")";
    }
}
