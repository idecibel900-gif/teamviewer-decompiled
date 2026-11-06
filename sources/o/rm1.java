package o;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/rm1;", "Lo/ls4;", "Lo/tm1;", "adaptive-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class rm1 extends ls4 {
    public final Function1 b;

    public rm1(Function1 function1) {
        this.b = function1;
    }

    @Override // o.ls4
    public final es4 create() {
        tm1 tm1Var = new tm1();
        tm1Var.A = this.b;
        return tm1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rm1) && this.b == ((rm1) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(false) * 31);
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        tm1 tm1Var = (tm1) es4Var;
        tm1Var.getClass();
        tm1Var.A = this.b;
    }
}
