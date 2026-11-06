package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/em3;", "Lo/ls4;", "Lo/gm3;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class em3 extends ls4 {
    @Override // o.ls4
    public final es4 create() {
        gm3 gm3Var = new gm3();
        gm3Var.A = dm3.n;
        gm3Var.B = true;
        return gm3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof em3 ? (em3) obj : null) != null;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (dm3.n.hashCode() * 31);
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        gm3 gm3Var = (gm3) es4Var;
        gm3Var.A = dm3.n;
        gm3Var.B = true;
    }
}
