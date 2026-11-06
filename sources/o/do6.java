package o;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/do6;", "Lo/ls4;", "Lo/fo6;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class do6 extends ls4 {
    public final boolean b;
    public final mw4 c;
    public final xg3 d;
    public final boolean e;
    public final boolean f;
    public final pe6 g;
    public final Function0 h;

    public do6(boolean z, mw4 mw4Var, xg3 xg3Var, boolean z2, boolean z3, pe6 pe6Var, Function0 function0) {
        this.b = z;
        this.c = mw4Var;
        this.d = xg3Var;
        this.e = z2;
        this.f = z3;
        this.g = pe6Var;
        this.h = function0;
    }

    @Override // o.ls4
    public final es4 create() {
        fo6 fo6Var = new fo6(this.c, this.d, this.e, this.f, null, this.g, this.h);
        fo6Var.Y = this.b;
        return fo6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || do6.class != obj.getClass()) {
            return false;
        }
        do6 do6Var = (do6) obj;
        return this.b == do6Var.b && im3.n(this.c, do6Var.c) && im3.n(this.d, do6Var.d) && this.e == do6Var.e && this.f == do6Var.f && im3.n(this.g, do6Var.g) && this.h == do6Var.h;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.b) * 31;
        mw4 mw4Var = this.c;
        int iHashCode2 = (iHashCode + (mw4Var != null ? mw4Var.hashCode() : 0)) * 31;
        xg3 xg3Var = this.d;
        int iF = to7.f(to7.f((iHashCode2 + (xg3Var != null ? xg3Var.hashCode() : 0)) * 31, 31, this.e), 31, this.f);
        pe6 pe6Var = this.g;
        return this.h.hashCode() + ((iF + (pe6Var != null ? Integer.hashCode(pe6Var.a) : 0)) * 31);
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        fo6 fo6Var = (fo6) es4Var;
        boolean z = fo6Var.Y;
        boolean z2 = this.b;
        if (z != z2) {
            fo6Var.Y = z2;
            vn4.p0(fo6Var).U();
        }
        fo6Var.k1(this.c, this.d, this.e, this.f, null, this.g, this.h);
    }
}
