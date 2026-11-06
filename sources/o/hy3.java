package o;

/* JADX INFO: loaded from: classes.dex */
public final class hy3 {
    public final Float a;
    public p72 b;

    public hy3(Float f, p72 p72Var) {
        this.a = f;
        this.b = p72Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hy3)) {
            return false;
        }
        hy3 hy3Var = (hy3) obj;
        return hy3Var.a.equals(this.a) && im3.n(hy3Var.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + fx3.a(0, this.a.hashCode() * 31, 31);
    }
}
