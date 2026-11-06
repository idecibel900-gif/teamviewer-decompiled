package o;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/y52;", "Lo/ls4;", "Lo/z52;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class y52 extends ls4 {
    public final Function1 b;

    public y52(Function1 function1) {
        this.b = function1;
    }

    @Override // o.ls4
    public final es4 create() {
        z52 z52Var = new z52();
        z52Var.A = this.b;
        return z52Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y52) {
            return this.b == ((y52) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        ((z52) es4Var).A = this.b;
    }
}
