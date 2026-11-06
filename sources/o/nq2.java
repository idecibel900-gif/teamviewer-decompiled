package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/nq2;", "Lo/ls4;", "Lo/rq2;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class nq2 extends ls4 {
    public final pq2 b;

    public nq2(pq2 pq2Var) {
        this.b = pq2Var;
    }

    @Override // o.ls4
    public final es4 create() {
        rq2 rq2Var = new rq2();
        rq2Var.A = this.b;
        return rq2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nq2) && this.b.equals(((nq2) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "FocusPropertiesElement(scope=" + this.b + ")";
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        ((rq2) es4Var).A = this.b;
    }
}
