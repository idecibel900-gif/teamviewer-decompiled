package o;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/a71;", "Lo/ls4;", "Lo/b71;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class a71 extends ls4 {
    public final Function1 b;

    public a71(Function1 function1) {
        this.b = function1;
    }

    @Override // o.ls4
    public final es4 create() {
        b71 b71Var = new b71();
        b71Var.C = this.b;
        return b71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a71) && ((a71) obj).b == this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        b71 b71Var = (b71) es4Var;
        Function1 function1 = b71Var.C;
        Function1 function2 = this.b;
        if (function2 != function1) {
            b71Var.C = function2;
            b71Var.V0();
        }
    }
}
