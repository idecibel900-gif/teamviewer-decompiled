package o;

/* JADX INFO: loaded from: classes.dex */
public final class ic8 {
    public final qo a;
    public final p72 b;

    public ic8(qo qoVar, p72 p72Var) {
        this.a = qoVar;
        this.b = p72Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic8)) {
            return false;
        }
        ic8 ic8Var = (ic8) obj;
        return im3.n(this.a, ic8Var.a) && im3.n(this.b, ic8Var.b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.a + ", easing=" + this.b + ", arcMode=ArcMode(value=0))";
    }
}
