package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/lc5;", "Lo/ls4;", "Lo/mc5;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class lc5 extends ls4 {
    @Override // o.ls4
    public final es4 create() {
        mc5 mc5Var = new mc5();
        mc5Var.C = null;
        return mc5Var;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof lc5);
    }

    public final int hashCode() {
        return 0;
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        mc5 mc5Var = (mc5) es4Var;
        um1 um1Var = mc5Var.C;
        if (um1Var != null) {
            mc5Var.V0(um1Var);
        }
        mc5Var.C = null;
        mc5Var.C = null;
    }
}
