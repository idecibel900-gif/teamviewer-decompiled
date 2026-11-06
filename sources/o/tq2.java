package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/tq2;", "Lo/ls4;", "Lo/vq2;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class tq2 extends ls4 {
    public final sq2 b;

    public tq2(sq2 sq2Var) {
        this.b = sq2Var;
    }

    @Override // o.ls4
    public final es4 create() {
        vq2 vq2Var = new vq2();
        vq2Var.A = this.b;
        return vq2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tq2) && im3.n(this.b, ((tq2) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.b + ")";
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        vq2 vq2Var = (vq2) es4Var;
        vq2Var.A.a.j(vq2Var);
        sq2 sq2Var = this.b;
        vq2Var.A = sq2Var;
        sq2Var.a.b(vq2Var);
    }
}
