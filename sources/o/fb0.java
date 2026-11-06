package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/fb0;", "Lo/ls4;", "Lo/ib0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class fb0 extends ls4 {
    public final hb0 b;

    public fb0(hb0 hb0Var) {
        this.b = hb0Var;
    }

    @Override // o.ls4
    public final es4 create() {
        ib0 ib0Var = new ib0();
        ib0Var.A = this.b;
        return ib0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fb0) {
            return im3.n(this.b, ((fb0) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        ib0 ib0Var = (ib0) es4Var;
        hb0 hb0Var = ib0Var.A;
        if (hb0Var != null) {
            hb0Var.a.j(ib0Var);
        }
        hb0 hb0Var2 = this.b;
        if (hb0Var2 != null) {
            hb0Var2.a.b(ib0Var);
        }
        ib0Var.A = hb0Var2;
    }
}
