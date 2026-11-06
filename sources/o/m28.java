package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/m28;", "Lo/ls4;", "Lo/n28;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class m28 extends ls4 {
    public final x34 b;

    public m28(x34 x34Var) {
        this.b = x34Var;
    }

    @Override // o.ls4
    public final es4 create() {
        n28 n28Var = new n28();
        n28Var.A = this.b;
        return n28Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m28) && im3.n(this.b, ((m28) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.b + ")";
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        ((n28) es4Var).A = this.b;
    }
}
