package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/vd1;", "Lo/ls4;", "Lo/yd1;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class vd1 extends ls4 {
    public final e18 b;
    public final zr7 c;
    public final j64 d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final v65 h;
    public final pr7 i;
    public final bf3 j;
    public final sq2 k;

    public vd1(e18 e18Var, zr7 zr7Var, j64 j64Var, boolean z, boolean z2, boolean z3, v65 v65Var, pr7 pr7Var, bf3 bf3Var, sq2 sq2Var) {
        this.b = e18Var;
        this.c = zr7Var;
        this.d = j64Var;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = v65Var;
        this.i = pr7Var;
        this.j = bf3Var;
        this.k = sq2Var;
    }

    @Override // o.ls4
    public final es4 create() {
        yd1 yd1Var = new yd1();
        yd1Var.C = this.b;
        yd1Var.D = this.c;
        yd1Var.E = this.d;
        yd1Var.F = this.e;
        yd1Var.G = this.f;
        yd1Var.H = this.g;
        yd1Var.I = this.h;
        pr7 pr7Var = this.i;
        yd1Var.J = pr7Var;
        yd1Var.K = this.j;
        yd1Var.L = this.k;
        pr7Var.g = new wd1(yd1Var, (byte) 4);
        return yd1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vd1) {
            vd1 vd1Var = (vd1) obj;
            if (this.b.equals(vd1Var.b) && im3.n(this.c, vd1Var.c) && this.d == vd1Var.d && this.e == vd1Var.e && this.f == vd1Var.f && this.g == vd1Var.g && this.h.equals(vd1Var.h) && this.i == vd1Var.i && im3.n(this.j, vd1Var.j) && im3.n(this.k, vd1Var.k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + to7.f(to7.f(to7.f((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31, 31, this.e), 31, this.f), 31, this.g)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoreTextFieldSemanticsModifier(transformedText=");
        sb.append(this.b);
        sb.append(", value=");
        sb.append(this.c);
        sb.append(", state=");
        sb.append(this.d);
        sb.append(", readOnly=");
        sb.append(this.e);
        sb.append(", enabled=");
        fx3.s(sb, this.f, ", isPassword=", this.g, ", offsetMapping=");
        sb.append(this.h);
        sb.append(", manager=");
        sb.append(this.i);
        sb.append(", imeOptions=");
        sb.append(this.j);
        sb.append(", focusRequester=");
        sb.append(this.k);
        sb.append(")");
        return sb.toString();
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        yd1 yd1Var = (yd1) es4Var;
        boolean z = yd1Var.G;
        byte b = 0;
        boolean z2 = z && !yd1Var.F;
        boolean z3 = yd1Var.H;
        bf3 bf3Var = yd1Var.K;
        pr7 pr7Var = yd1Var.J;
        boolean z4 = this.e;
        boolean z5 = this.f;
        boolean z6 = z5 && !z4;
        yd1Var.C = this.b;
        zr7 zr7Var = this.c;
        yd1Var.D = zr7Var;
        yd1Var.E = this.d;
        yd1Var.F = z4;
        yd1Var.G = z5;
        yd1Var.I = this.h;
        pr7 pr7Var2 = this.i;
        yd1Var.J = pr7Var2;
        bf3 bf3Var2 = this.j;
        yd1Var.K = bf3Var2;
        yd1Var.L = this.k;
        if (z5 != z || z6 != z2 || !im3.n(bf3Var2, bf3Var) || this.g != z3 || !gt7.c(zr7Var.b)) {
            vn4.p0(yd1Var).U();
        }
        if (pr7Var2 != pr7Var) {
            pr7Var2.g = new wd1(yd1Var, b);
        }
    }
}
