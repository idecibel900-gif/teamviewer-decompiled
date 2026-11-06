package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/kk6;", "Lo/ls4;", "Lo/sk6;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class kk6 extends ls4 {
    public final tk6 b;
    public final gb5 c;
    public final boolean d;
    public final boolean e;
    public final mw4 f;

    public kk6(tk6 tk6Var, gb5 gb5Var, boolean z, boolean z2, mw4 mw4Var) {
        this.b = tk6Var;
        this.c = gb5Var;
        this.d = z;
        this.e = z2;
        this.f = mw4Var;
    }

    @Override // o.ls4
    public final es4 create() {
        return new sk6(null, null, null, this.f, this.c, this.b, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kk6)) {
            return false;
        }
        kk6 kk6Var = (kk6) obj;
        return im3.n(this.b, kk6Var.b) && this.c == kk6Var.c && this.d == kk6Var.d && this.e == kk6Var.e && im3.n(this.f, kk6Var.f);
    }

    public final int hashCode() {
        int iF = to7.f(to7.f((this.c.hashCode() + (this.b.hashCode() * 31)) * 961, 31, this.d), 961, this.e);
        mw4 mw4Var = this.f;
        return (iF + (mw4Var != null ? mw4Var.hashCode() : 0)) * 31;
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        ((sk6) es4Var).p1(null, null, null, this.f, this.c, this.b, this.d, this.e);
    }
}
