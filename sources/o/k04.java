package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/k04;", "Lo/ls4;", "Lo/q04;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class k04 extends ls4 {
    public final iw2 b;

    public k04(iw2 iw2Var) {
        this.b = iw2Var;
    }

    @Override // o.ls4
    public final es4 create() {
        q04 q04Var = new q04();
        q04Var.A = this.b;
        return q04Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k04) {
            return this.b == ((k04) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        ((q04) es4Var).A = this.b;
    }
}
