package o;

/* JADX INFO: loaded from: classes.dex */
public final class jh2 {
    public final Object a;
    public final yy0 b;

    public jh2(o37 o37Var, yy0 yy0Var) {
        this.a = o37Var;
        this.b = yy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jh2) {
            jh2 jh2Var = (jh2) obj;
            return im3.n(this.a, jh2Var.a) && this.b == jh2Var.b;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.a + ", transition=" + this.b + ")";
    }
}
