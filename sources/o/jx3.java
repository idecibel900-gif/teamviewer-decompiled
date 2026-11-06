package o;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/jx3;", "Lo/ls4;", "Lo/lx3;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class jx3 extends ls4 {
    public final Function1 b;
    public final Function1 c;

    public jx3(Function1 function1, Function1 function2) {
        this.b = function1;
        this.c = function2;
    }

    @Override // o.ls4
    public final es4 create() {
        lx3 lx3Var = new lx3();
        lx3Var.A = this.b;
        lx3Var.B = this.c;
        return lx3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jx3)) {
            return false;
        }
        jx3 jx3Var = (jx3) obj;
        return this.b == jx3Var.b && this.c == jx3Var.c;
    }

    public final int hashCode() {
        Function1 function1 = this.b;
        int iHashCode = (function1 != null ? function1.hashCode() : 0) * 31;
        Function1 function2 = this.c;
        return iHashCode + (function2 != null ? function2.hashCode() : 0);
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        lx3 lx3Var = (lx3) es4Var;
        lx3Var.A = this.b;
        lx3Var.B = this.c;
    }
}
