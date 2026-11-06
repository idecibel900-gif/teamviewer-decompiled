package o;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/c44;", "Lo/ls4;", "Lo/f44;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class c44 extends ls4 {
    public final Function0 b;
    public final b44 c;
    public final gb5 d;
    public final boolean e;

    public c44(Function0 function0, b44 b44Var, gb5 gb5Var, boolean z) {
        this.b = function0;
        this.c = b44Var;
        this.d = gb5Var;
        this.e = z;
    }

    @Override // o.ls4
    public final es4 create() {
        return new f44(this.b, this.c, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c44)) {
            return false;
        }
        c44 c44Var = (c44) obj;
        return this.b == c44Var.b && im3.n(this.c, c44Var.c) && this.d == c44Var.d && this.e == c44Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + to7.f((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31, 31, this.e);
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        f44 f44Var = (f44) es4Var;
        f44Var.A = this.b;
        f44Var.B = this.c;
        gb5 gb5Var = f44Var.C;
        gb5 gb5Var2 = this.d;
        if (gb5Var != gb5Var2) {
            f44Var.C = gb5Var2;
            vn4.p0(f44Var).U();
        }
        boolean z = f44Var.D;
        boolean z2 = this.e;
        if (z == z2) {
            return;
        }
        f44Var.D = z2;
        f44Var.U0();
        vn4.p0(f44Var).U();
    }
}
