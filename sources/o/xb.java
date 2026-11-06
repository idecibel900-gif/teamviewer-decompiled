package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/xb;", "Lo/ls4;", "Lo/yb;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class xb extends ls4 {
    public final sr7 b;

    public xb(sr7 sr7Var) {
        this.b = sr7Var;
    }

    @Override // o.ls4
    public final es4 create() {
        yb ybVar = new yb();
        ybVar.C = this.b;
        q0 q0Var = new q0(ybVar, (byte) 5);
        wb wbVar = new wb();
        wbVar.A = q0Var;
        ybVar.U0(wbVar);
        return ybVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xb) {
            return this.b == ((xb) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        ((yb) es4Var).C = this.b;
    }
}
