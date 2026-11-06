package o;

/* JADX INFO: loaded from: classes.dex */
public final class av6 implements e82 {
    public final int a;
    public final int b;

    public av6(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // o.e82
    public final void a(h82 h82Var) {
        boolean z = h82Var.d != -1;
        cv0 cv0Var = h82Var.a;
        if (z) {
            h82Var.d = -1;
            h82Var.e = -1;
        }
        int iV = ct1.v(this.a, 0, cv0Var.k());
        int iV2 = ct1.v(this.b, 0, cv0Var.k());
        if (iV != iV2) {
            if (iV < iV2) {
                h82Var.e(iV, iV2);
            } else {
                h82Var.e(iV2, iV);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof av6)) {
            return false;
        }
        av6 av6Var = (av6) obj;
        return this.a == av6Var.a && this.b == av6Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return fx3.d(this.a, this.b, "SetComposingRegionCommand(start=", ", end=", ")");
    }
}
