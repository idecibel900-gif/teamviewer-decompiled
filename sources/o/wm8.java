package o;

/* JADX INFO: loaded from: classes.dex */
public final class wm8 {
    public String a;
    public lm8 b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wm8)) {
            return false;
        }
        wm8 wm8Var = (wm8) obj;
        return im3.n(this.a, wm8Var.a) && this.b == wm8Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.a + ", state=" + this.b + ")";
    }
}
