package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/yg3;", "Lo/ls4;", "Lo/ah3;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class yg3 extends ls4 {
    public final boolean b;
    public final mw4 c;
    public final cq7 d;
    public final pw6 e;

    public yg3(boolean z, mw4 mw4Var, cq7 cq7Var, pw6 pw6Var) {
        this.b = z;
        this.c = mw4Var;
        this.d = cq7Var;
        this.e = pw6Var;
    }

    @Override // o.ls4
    public final es4 create() {
        return new ah3(this.b, this.c, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg3)) {
            return false;
        }
        yg3 yg3Var = (yg3) obj;
        return this.b == yg3Var.b && im3.n(this.c, yg3Var.c) && this.d.equals(yg3Var.d) && im3.n(this.e, yg3Var.e) && w32.b(2.0f, 2.0f) && w32.b(1.0f, 1.0f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + to7.f(Boolean.hashCode(this.b) * 31, 31, false)) * 31)) * 31;
        pw6 pw6Var = this.e;
        return Float.hashCode(1.0f) + e41.e(2.0f, (iHashCode + (pw6Var != null ? pw6Var.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        String strC = w32.c(2.0f);
        String strC2 = w32.c(1.0f);
        StringBuilder sb = new StringBuilder("IndicatorLineElement(enabled=");
        sb.append(this.b);
        sb.append(", isError=false, interactionSource=");
        sb.append(this.c);
        sb.append(", colors=");
        sb.append(this.d);
        sb.append(", textFieldShape=");
        sb.append(this.e);
        sb.append(", focusedIndicatorLineThickness=");
        return e41.m(sb, strC, ", unfocusedIndicatorLineThickness=", strC2, ")");
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        boolean z;
        ah3 ah3Var = (ah3) es4Var;
        boolean z2 = ah3Var.C;
        boolean z3 = this.b;
        boolean z4 = true;
        if (z2 != z3) {
            ah3Var.C = z3;
            z = true;
        } else {
            z = false;
        }
        mw4 mw4Var = ah3Var.D;
        mw4 mw4Var2 = this.c;
        if (mw4Var != mw4Var2) {
            ah3Var.D = mw4Var2;
            n87 n87Var = ah3Var.H;
            hc1 hc1Var = null;
            if (n87Var != null) {
                n87Var.j(null);
            }
            ah3Var.H = im3.R(ah3Var.I0(), null, null, new zg3(ah3Var, hc1Var, (byte) 3), 3);
        }
        cq7 cq7Var = ah3Var.I;
        cq7 cq7Var2 = this.d;
        if (!im3.n(cq7Var, cq7Var2)) {
            ah3Var.I = cq7Var2;
            z = true;
        }
        pw6 pw6Var = ah3Var.K;
        pw6 pw6Var2 = this.e;
        if (!im3.n(pw6Var, pw6Var2)) {
            if (!im3.n(ah3Var.K, pw6Var2)) {
                ah3Var.K = pw6Var2;
                ah3Var.M.U0();
            }
            z = true;
        }
        if (!w32.b(ah3Var.E, 2.0f)) {
            ah3Var.E = 2.0f;
            z = true;
        }
        if (w32.b(ah3Var.F, 1.0f)) {
            z4 = z;
        } else {
            ah3Var.F = 1.0f;
        }
        if (z4) {
            ah3Var.X0();
        }
    }
}
