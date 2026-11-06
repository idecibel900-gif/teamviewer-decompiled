package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/z53;", "Lo/ls4;", "Lo/a63;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z53 extends ls4 {
    public final w50 b;

    public z53(w50 w50Var) {
        this.b = w50Var;
    }

    @Override // o.ls4
    public final es4 create() {
        a63 a63Var = new a63();
        a63Var.A = this.b;
        return a63Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        z53 z53Var = obj instanceof z53 ? (z53) obj : null;
        if (z53Var == null) {
            return false;
        }
        return this.b.equals(z53Var.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a);
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        ((a63) es4Var).A = this.b;
    }
}
