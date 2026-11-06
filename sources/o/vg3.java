package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/vg3;", "Lo/ls4;", "Lo/wg3;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class vg3 extends ls4 {
    public final mw4 b;
    public final xg3 c;

    public vg3(mw4 mw4Var, xg3 xg3Var) {
        this.b = mw4Var;
        this.c = xg3Var;
    }

    @Override // o.ls4
    public final es4 create() {
        um1 um1VarA = this.c.a(this.b);
        wg3 wg3Var = new wg3();
        wg3Var.C = um1VarA;
        wg3Var.U0(um1VarA);
        return wg3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vg3)) {
            return false;
        }
        vg3 vg3Var = (vg3) obj;
        return im3.n(this.b, vg3Var.b) && im3.n(this.c, vg3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        wg3 wg3Var = (wg3) es4Var;
        um1 um1VarA = this.c.a(this.b);
        wg3Var.V0(wg3Var.C);
        wg3Var.C = um1VarA;
        wg3Var.U0(um1VarA);
    }
}
