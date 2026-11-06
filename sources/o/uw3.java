package o;

/* JADX INFO: loaded from: classes2.dex */
public final class uw3 {
    public static final uw3 c = new uw3(null, null);
    public final vw3 a;
    public final ow3 b;

    public uw3(vw3 vw3Var, qw3 qw3Var) {
        String str;
        this.a = vw3Var;
        this.b = qw3Var;
        if ((vw3Var == null) == (qw3Var == null)) {
            return;
        }
        if (vw3Var == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + vw3Var + " requires type to be specified.";
        }
        gk0.h(str);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uw3)) {
            return false;
        }
        uw3 uw3Var = (uw3) obj;
        return this.a == uw3Var.a && im3.n(this.b, uw3Var.b);
    }

    public final int hashCode() {
        vw3 vw3Var = this.a;
        int iHashCode = (vw3Var == null ? 0 : vw3Var.hashCode()) * 31;
        ow3 ow3Var = this.b;
        return iHashCode + (ow3Var != null ? ow3Var.hashCode() : 0);
    }

    public final String toString() {
        vw3 vw3Var = this.a;
        int i = vw3Var == null ? -1 : tw3.a[vw3Var.ordinal()];
        if (i == -1) {
            return "*";
        }
        ow3 ow3Var = this.b;
        if (i == 1) {
            return String.valueOf(ow3Var);
        }
        if (i == 2) {
            return "in " + ow3Var;
        }
        if (i != 3) {
            gk0.s();
            return null;
        }
        return "out " + ow3Var;
    }
}
