package o;

/* JADX INFO: loaded from: classes.dex */
public final class ji0 {
    public final c35 a;

    public ji0(c35 c35Var) {
        this.a = c35Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ji0) && im3.n(this.a, ((ji0) obj).a);
    }

    public final int hashCode() {
        c35 c35Var = this.a;
        if (c35Var != null) {
            return c35Var.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ReadResult(request=null, response=" + this.a + ")";
    }
}
