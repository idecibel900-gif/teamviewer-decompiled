package o;

/* JADX INFO: loaded from: classes.dex */
public final class wm5 {
    public final rm5 a;
    public final gm5 b;

    public wm5(rm5 rm5Var, gm5 gm5Var) {
        this.a = rm5Var;
        this.b = gm5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wm5)) {
            return false;
        }
        wm5 wm5Var = (wm5) obj;
        return im3.n(this.b, wm5Var.b) && im3.n(this.a, wm5Var.a);
    }

    public final int hashCode() {
        rm5 rm5Var = this.a;
        int iHashCode = (rm5Var != null ? rm5Var.hashCode() : 0) * 31;
        gm5 gm5Var = this.b;
        return iHashCode + (gm5Var != null ? gm5Var.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.a + ", paragraphSyle=" + this.b + ")";
    }
}
