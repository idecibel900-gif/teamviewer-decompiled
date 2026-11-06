package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/l53;", "Lo/ls4;", "Lo/n53;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class l53 extends ls4 {
    public final ot7 b;
    public final int c;
    public final int d;

    public l53(ot7 ot7Var, int i, int i2) {
        this.b = ot7Var;
        this.c = i;
        this.d = i2;
    }

    @Override // o.ls4
    public final es4 create() {
        n53 n53Var = new n53();
        n53Var.A = this.b;
        n53Var.B = this.c;
        n53Var.C = this.d;
        n53Var.E = -1;
        n53Var.F = -1;
        return n53Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l53)) {
            return false;
        }
        l53 l53Var = (l53) obj;
        return im3.n(this.b, l53Var.b) && this.c == l53Var.c && this.d == l53Var.d;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c) * 31) + this.d;
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        n53 n53Var = (n53) es4Var;
        ot7 ot7Var = n53Var.A;
        ot7 ot7Var2 = this.b;
        boolean zN = im3.n(ot7Var, ot7Var2);
        int i = this.c;
        int i2 = this.d;
        if (zN && n53Var.B == i && n53Var.C == i2) {
            return;
        }
        n53Var.A = ot7Var2;
        n53Var.B = i;
        n53Var.C = i2;
        n53Var.G = y57.C(ot7Var2, vn4.p0(n53Var).M);
        n53Var.D = true;
        vn4.p0(n53Var).S();
    }
}
