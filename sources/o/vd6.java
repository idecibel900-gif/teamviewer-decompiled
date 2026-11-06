package o;

/* JADX INFO: loaded from: classes.dex */
public final class vd6 {
    public final long a = rv0.h;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd6)) {
            return false;
        }
        long j = ((vd6) obj).a;
        int i = rv0.i;
        return z68.a(this.a, j);
    }

    public final int hashCode() {
        int i = rv0.i;
        return Long.hashCode(this.a) * 961;
    }

    public final String toString() {
        return fx3.g("RippleConfiguration(color=", rv0.h(this.a), ", focus=null, rippleAlpha=null)");
    }
}
