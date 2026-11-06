package o;

/* JADX INFO: loaded from: classes.dex */
public final class dv6 implements e82 {
    public final int a;
    public final int b;

    public dv6(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // o.e82
    public final void a(h82 h82Var) {
        int iV = ct1.v(this.a, 0, h82Var.a.k());
        int iV2 = ct1.v(this.b, 0, h82Var.a.k());
        if (iV < iV2) {
            h82Var.f(iV, iV2);
        } else {
            h82Var.f(iV2, iV);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dv6)) {
            return false;
        }
        dv6 dv6Var = (dv6) obj;
        return this.a == dv6Var.a && this.b == dv6Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return fx3.d(this.a, this.b, "SetSelectionCommand(start=", ", end=", ")");
    }
}
