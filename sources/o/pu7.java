package o;

/* JADX INFO: loaded from: classes.dex */
public final class pu7 {
    public final z06 a;
    public final z06 b;
    public final z06 c;

    public pu7(z06 z06Var, z06 z06Var2, z06 z06Var3) {
        this.a = z06Var;
        this.b = z06Var2;
        this.c = z06Var3;
    }

    public final void a(yu7 yu7Var) {
        int iOrdinal = yu7Var.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return;
        }
        gk0.s();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu7)) {
            return false;
        }
        pu7 pu7Var = (pu7) obj;
        return im3.n(this.a, pu7Var.a) && im3.n(this.b, pu7Var.b) && im3.n(this.c, pu7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
