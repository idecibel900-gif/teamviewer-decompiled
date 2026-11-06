package o;

/* JADX INFO: loaded from: classes.dex */
public final class ki0 {
    public static final ki0 b = new ki0();
    public final c35 a;

    public ki0() {
        this.a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ki0) {
            return im3.n(this.a, ((ki0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        c35 c35Var = this.a;
        if (c35Var != null) {
            return c35Var.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "WriteResult(response=" + this.a + ")";
    }

    public ki0(c35 c35Var) {
        this.a = c35Var;
    }
}
