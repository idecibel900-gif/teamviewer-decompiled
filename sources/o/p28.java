package o;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/p28;", "Lo/ls4;", "Lo/q28;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class p28 extends ls4 {
    public final xv7 b;
    public final mw4 c;
    public final xg3 d;
    public final boolean e;
    public final pe6 f;
    public final Function0 g;

    public p28(xv7 xv7Var, mw4 mw4Var, xg3 xg3Var, boolean z, pe6 pe6Var, Function0 function0) {
        this.b = xv7Var;
        this.c = mw4Var;
        this.d = xg3Var;
        this.e = z;
        this.f = pe6Var;
        this.g = function0;
    }

    @Override // o.ls4
    public final es4 create() {
        q28 q28Var = new q28(this.c, this.d, false, this.e, null, this.f, this.g);
        q28Var.Y = this.b;
        return q28Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p28.class != obj.getClass()) {
            return false;
        }
        p28 p28Var = (p28) obj;
        return this.b == p28Var.b && im3.n(this.c, p28Var.c) && im3.n(this.d, p28Var.d) && this.e == p28Var.e && this.f.equals(p28Var.f) && this.g == p28Var.g;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        mw4 mw4Var = this.c;
        int iHashCode2 = (iHashCode + (mw4Var != null ? mw4Var.hashCode() : 0)) * 31;
        xg3 xg3Var = this.d;
        return this.g.hashCode() + fx3.a(this.f.a, to7.f(to7.f((iHashCode2 + (xg3Var != null ? xg3Var.hashCode() : 0)) * 31, 31, false), 31, this.e), 31);
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        q28 q28Var = (q28) es4Var;
        xv7 xv7Var = q28Var.Y;
        xv7 xv7Var2 = this.b;
        if (xv7Var != xv7Var2) {
            q28Var.Y = xv7Var2;
            vn4.p0(q28Var).U();
        }
        q28Var.k1(this.c, this.d, false, this.e, null, this.f, this.g);
    }
}
