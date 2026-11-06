package o;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/uh7;", "Lo/ls4;", "Lo/vh7;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class uh7 extends ls4 {
    public final Function1 b;

    public uh7(Function1 function1) {
        this.b = function1;
    }

    @Override // o.ls4
    public final es4 create() {
        vh7 vh7Var = new vh7(db8.E);
        vh7Var.D = this.b;
        return vh7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uh7) {
            return this.b == ((uh7) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        vh7 vh7Var = (vh7) es4Var;
        Function1 function1 = vh7Var.D;
        Function1 function2 = this.b;
        if (function1 != function2) {
            vh7Var.D = function2;
            wk8 wk8Var = vh7Var.E;
            if (wk8Var != null) {
                qj8 qj8Var = (qj8) function2.invoke(wk8Var);
                if (im3.n(qj8Var, vh7Var.C)) {
                    return;
                }
                vh7Var.C = qj8Var;
                vh7Var.V0();
            }
        }
    }
}
