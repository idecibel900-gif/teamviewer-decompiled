package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/uq0;", "Lo/ls4;", "Lo/tq0;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class uq0 extends ls4 {
    public final px b;

    public uq0(px pxVar) {
        this.b = pxVar;
    }

    @Override // o.ls4
    public final es4 create() {
        tq0 tq0Var = new tq0();
        tq0Var.A = this.b;
        return tq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uq0) {
            return this.b == ((uq0) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        tq0 tq0Var = (tq0) es4Var;
        tq0Var.A = this.b;
        vn4.p0(tq0Var).U();
    }
}
