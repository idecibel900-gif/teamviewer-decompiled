package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/od5;", "Lo/ls4;", "Lo/qd5;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class od5 extends ls4 {
    public final nd5 b;

    public od5(nd5 nd5Var, at4 at4Var) {
        this.b = nd5Var;
    }

    @Override // o.ls4
    public final es4 create() {
        qd5 qd5Var = new qd5();
        qd5Var.A = this.b;
        return qd5Var;
    }

    public final boolean equals(Object obj) {
        od5 od5Var = obj instanceof od5 ? (od5) obj : null;
        if (od5Var == null) {
            return false;
        }
        return im3.n(this.b, od5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        ((qd5) es4Var).A = this.b;
    }
}
