package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/hp7;", "Lo/ls4;", "Lo/jp7;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class hp7 extends ls4 {
    public final ir7 b;

    public hp7(ir7 ir7Var) {
        this.b = ir7Var;
    }

    @Override // o.ls4
    public final es4 create() {
        return new jp7(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hp7) {
            return this.b == ((hp7) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        ((jp7) es4Var).C = this.b;
    }
}
