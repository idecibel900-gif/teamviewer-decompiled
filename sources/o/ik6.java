package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/ik6;", "Lo/ls4;", "Lo/jk6;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ik6 extends ls4 {
    public final tk6 b;
    public final gb5 c;
    public final boolean d;
    public final ym2 e;
    public final mw4 f;
    public final nb0 g;
    public final boolean h;
    public final li i;

    public ik6(li liVar, nb0 nb0Var, ym2 ym2Var, mw4 mw4Var, gb5 gb5Var, tk6 tk6Var, boolean z, boolean z2) {
        this.b = tk6Var;
        this.c = gb5Var;
        this.d = z;
        this.e = ym2Var;
        this.f = mw4Var;
        this.g = nb0Var;
        this.h = z2;
        this.i = liVar;
    }

    @Override // o.ls4
    public final es4 create() {
        jk6 jk6Var = new jk6();
        jk6Var.C = this.b;
        jk6Var.D = this.c;
        jk6Var.E = this.d;
        jk6Var.F = this.e;
        jk6Var.G = this.f;
        jk6Var.H = this.g;
        jk6Var.I = this.h;
        jk6Var.J = this.i;
        return jk6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ik6.class != obj.getClass()) {
            return false;
        }
        ik6 ik6Var = (ik6) obj;
        return this.b.equals(ik6Var.b) && this.c == ik6Var.c && this.d == ik6Var.d && im3.n(this.e, ik6Var.e) && im3.n(this.f, ik6Var.f) && im3.n(this.g, ik6Var.g) && this.h == ik6Var.h && im3.n(this.i, ik6Var.i);
    }

    public final int hashCode() {
        int iF = to7.f(to7.f((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d), 31, false);
        ym2 ym2Var = this.e;
        int iHashCode = (iF + (ym2Var != null ? ym2Var.hashCode() : 0)) * 31;
        mw4 mw4Var = this.f;
        int iHashCode2 = (iHashCode + (mw4Var != null ? mw4Var.hashCode() : 0)) * 31;
        nb0 nb0Var = this.g;
        int iF2 = to7.f((iHashCode2 + (nb0Var != null ? nb0Var.hashCode() : 0)) * 31, 31, this.h);
        li liVar = this.i;
        return iF2 + (liVar != null ? liVar.hashCode() : 0);
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        mw4 mw4Var = this.f;
        ((jk6) es4Var).Z0(this.i, this.g, this.e, mw4Var, this.c, this.b, this.h, this.d);
    }
}
