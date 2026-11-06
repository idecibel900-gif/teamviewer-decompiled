package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/l63;", "Lo/ls4;", "Lo/p63;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class l63 extends ls4 {
    public final mw4 b;

    public l63(mw4 mw4Var) {
        this.b = mw4Var;
    }

    @Override // o.ls4
    public final es4 create() {
        p63 p63Var = new p63();
        p63Var.A = this.b;
        return p63Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l63) && im3.n(((l63) obj).b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() * 31;
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        p63 p63Var = (p63) es4Var;
        mw4 mw4Var = p63Var.A;
        mw4 mw4Var2 = this.b;
        if (im3.n(mw4Var, mw4Var2)) {
            return;
        }
        p63Var.W0();
        p63Var.A = mw4Var2;
    }
}
