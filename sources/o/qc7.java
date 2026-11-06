package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/qc7;", "Lo/ls4;", "Lo/wc7;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class qc7 extends ls4 {
    public final ux4 b;
    public final nc7 c;

    public qc7(ux4 ux4Var, nc7 nc7Var) {
        this.b = ux4Var;
        this.c = nc7Var;
    }

    @Override // o.ls4
    public final es4 create() {
        return new wc7(this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qc7)) {
            return false;
        }
        qc7 qc7Var = (qc7) obj;
        return im3.n(qc7Var.c, this.c) && im3.n(qc7Var.b, this.b);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "StyleElement(styleState=" + this.b + ", style=" + this.c + ")";
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        wc7 wc7Var = (wc7) es4Var;
        wc7Var.D = this.c;
        wc7Var.a1(false);
        ux4 ux4Var = this.b;
        if (ux4Var == null) {
            ux4Var = new ux4(null);
        }
        if (im3.n(wc7Var.K, ux4Var)) {
            return;
        }
        wc7Var.K = ux4Var;
        wc7Var.a1(false);
        tc7 tc7Var = wc7Var.C;
        if (tc7Var != null) {
            vn4.n0(tc7Var, 2).i1();
        } else {
            hk0.l("StyleOuterNode with no corresponding StyleInnerNode");
        }
    }
}
