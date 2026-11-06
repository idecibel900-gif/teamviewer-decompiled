package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/d88;", "Lo/ls4;", "Lo/e88;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class d88 extends ls4 {
    public final qj8 b;

    public d88(qj8 qj8Var) {
        this.b = qj8Var;
    }

    @Override // o.ls4
    public final es4 create() {
        e88 e88Var = new e88();
        e88Var.C = this.b;
        return e88Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d88) {
            return im3.n(((d88) obj).b, this.b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        e88 e88Var = (e88) es4Var;
        qj8 qj8Var = e88Var.C;
        qj8 qj8Var2 = this.b;
        if (im3.n(qj8Var2, qj8Var)) {
            return;
        }
        e88Var.C = qj8Var2;
        e88Var.V0();
    }
}
