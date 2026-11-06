package o;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/ad7;", "Lo/ls4;", "Lo/bd7;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ad7 extends ls4 {
    public final Function0 b;

    public ad7(Function0 function0) {
        this.b = function0;
    }

    @Override // o.ls4
    public final es4 create() {
        return new bd7(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ad7) {
            return this.b == ((ad7) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        ((bd7) es4Var).C = this.b;
    }
}
