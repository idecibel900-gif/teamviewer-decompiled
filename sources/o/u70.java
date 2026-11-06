package o;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/u70;", "Lo/ls4;", "Lo/v70;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class u70 extends ls4 {
    public final Function1 b;

    public u70(Function1 function1) {
        this.b = function1;
    }

    @Override // o.ls4
    public final es4 create() {
        return new v70(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u70) {
            return this.b == ((u70) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        v70 v70Var = (v70) es4Var;
        Function1 function1 = this.b;
        v70Var.A = function1;
        nv1.N(v70Var, function1);
    }
}
