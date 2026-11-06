package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/wr7;", "Lo/ls4;", "Lo/xr7;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class wr7 extends ls4 {
    public final ot7 b;

    public wr7(ot7 ot7Var) {
        this.b = ot7Var;
    }

    @Override // o.ls4
    public final es4 create() {
        return new xr7(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wr7)) {
            return false;
        }
        return im3.n(this.b, ((wr7) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        xr7 xr7Var = (xr7) es4Var;
        xr7Var.getClass();
        ot7 ot7VarC = y57.C(this.b, vn4.p0(xr7Var).M);
        xr7Var.U0(ot7VarC, (mr2) xk0.q(xr7Var, b11.k));
        vr7 vr7Var = xr7Var.C;
        if (vr7Var == null) {
            throw fx3.l("Min size state is not set.");
        }
        vr7.a(vr7Var, null, null, ot7VarC, 23);
        vn4.p0(xr7Var).S();
    }
}
