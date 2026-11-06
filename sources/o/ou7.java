package o;

/* JADX INFO: loaded from: classes.dex */
public final class ou7 {
    public static final ou7 d;
    public final qe5 a;
    public final qe5 b;
    public final qe5 c;

    static {
        qe5 qe5Var = yl7.G;
        d = new ou7(qe5Var, qe5Var, qe5Var);
    }

    public ou7(qe5 qe5Var, qe5 qe5Var2, qe5 qe5Var3) {
        this.a = qe5Var;
        this.b = qe5Var2;
        this.c = qe5Var3;
    }

    public final qe5 a(yu7 yu7Var) {
        int iOrdinal = yu7Var.ordinal();
        if (iOrdinal == 0) {
            return this.a;
        }
        if (iOrdinal == 1) {
            return this.b;
        }
        if (iOrdinal == 2) {
            return this.c;
        }
        gk0.s();
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ou7)) {
            return false;
        }
        ou7 ou7Var = (ou7) obj;
        return im3.n(this.a, ou7Var.a) && im3.n(this.b, ou7Var.b) && im3.n(this.c, ou7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ThreePaneMotion(primaryPaneMotion=" + this.a + ", secondaryPaneMotion=" + this.b + ", tertiaryPaneMotion=" + this.c + ")";
    }
}
