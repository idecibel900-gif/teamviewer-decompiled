package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/sj3;", "Lo/ls4;", "Lo/uj3;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class sj3 extends ls4 {
    public final qj8 b;

    public sj3(qj8 qj8Var) {
        this.b = qj8Var;
    }

    @Override // o.ls4
    public final es4 create() {
        return new uj3(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sj3) {
            return im3.n(((sj3) obj).b, this.b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        uj3 uj3Var = (uj3) es4Var;
        qj8 qj8Var = uj3Var.C;
        qj8 qj8Var2 = this.b;
        if (im3.n(qj8Var2, qj8Var)) {
            return;
        }
        uj3Var.C = qj8Var2;
        uj3Var.V0();
    }
}
