package o;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/uv7;", "Lo/ls4;", "Lo/wv7;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class uv7 extends ls4 {
    public final boolean b;
    public final mw4 c;
    public final boolean d;
    public final boolean e;
    public final pe6 f;
    public final Function1 g;

    public uv7(boolean z, mw4 mw4Var, boolean z2, boolean z3, pe6 pe6Var, Function1 function1) {
        this.b = z;
        this.c = mw4Var;
        this.d = z2;
        this.e = z3;
        this.f = pe6Var;
        this.g = function1;
    }

    @Override // o.ls4
    public final es4 create() {
        return new wv7(this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uv7.class != obj.getClass()) {
            return false;
        }
        uv7 uv7Var = (uv7) obj;
        return this.b == uv7Var.b && im3.n(this.c, uv7Var.c) && this.d == uv7Var.d && this.e == uv7Var.e && this.f.equals(uv7Var.f) && this.g == uv7Var.g;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.b) * 31;
        mw4 mw4Var = this.c;
        return this.g.hashCode() + fx3.a(this.f.a, to7.f(to7.f((iHashCode + (mw4Var != null ? mw4Var.hashCode() : 0)) * 961, 31, this.d), 31, this.e), 31);
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        wv7 wv7Var = (wv7) es4Var;
        boolean z = wv7Var.Y;
        boolean z2 = this.b;
        if (z != z2) {
            wv7Var.Y = z2;
            vn4.p0(wv7Var).U();
        }
        wv7Var.Z = this.g;
        wv7Var.k1(this.c, null, this.d, this.e, null, this.f, wv7Var.a0);
    }
}
