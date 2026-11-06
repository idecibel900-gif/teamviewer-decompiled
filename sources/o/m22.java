package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/m22;", "Lo/ls4;", "Lo/n22;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class m22 extends ls4 {
    public final m34 b;

    public m22(m34 m34Var) {
        this.b = m34Var;
    }

    @Override // o.ls4
    public final es4 create() {
        n22 n22Var = new n22();
        n22Var.A = this.b;
        return n22Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m22) && im3.n(this.b, ((m22) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.b + ")";
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        n22 n22Var = (n22) es4Var;
        m34 m34Var = n22Var.A;
        m34 m34Var2 = this.b;
        if (im3.n(m34Var, m34Var2) || !n22Var.m.z) {
            return;
        }
        m34 m34Var3 = n22Var.A;
        m34Var3.d();
        m34Var3.b = null;
        m34Var3.c = -1;
        m34Var2.j = n22Var;
        n22Var.A = m34Var2;
    }
}
