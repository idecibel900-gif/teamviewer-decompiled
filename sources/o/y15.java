package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/y15;", "Lo/ls4;", "Lo/b25;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class y15 extends ls4 {
    public final u15 b;
    public final x15 c;

    public y15(u15 u15Var, x15 x15Var) {
        this.b = u15Var;
        this.c = x15Var;
    }

    @Override // o.ls4
    public final es4 create() {
        return new b25(this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y15)) {
            return false;
        }
        y15 y15Var = (y15) obj;
        return im3.n(y15Var.b, this.b) && im3.n(y15Var.c, this.c);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        x15 x15Var = this.c;
        return iHashCode + (x15Var != null ? x15Var.hashCode() : 0);
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        b25 b25Var = (b25) es4Var;
        b25Var.A = this.b;
        x15 x15Var = b25Var.B;
        if (x15Var.a == b25Var) {
            x15Var.a = null;
            x15Var.d = null;
            x15Var.c = vn4.g0;
        }
        x15 x15Var2 = this.c;
        if (x15Var2 == null) {
            x15Var = new x15();
            b25Var.B = x15Var;
        } else if (x15Var2 != x15Var) {
            b25Var.B = x15Var2;
            x15Var = x15Var2;
        }
        if (b25Var.z) {
            x15Var.a = b25Var;
            x15Var.b = null;
            b25Var.C = null;
            x15Var.c = new vm3(b25Var, (byte) 18);
            x15Var.d = b25Var.I0();
        }
    }
}
