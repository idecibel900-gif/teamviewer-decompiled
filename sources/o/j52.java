package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Lo/j52;", "T", "Lo/ls4;", "Lo/k52;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class j52<T> extends ls4 {
    public final nf b;
    public final hw2 c;

    public j52(nf nfVar, hw2 hw2Var) {
        this.b = nfVar;
        this.c = hw2Var;
    }

    @Override // o.ls4
    public final es4 create() {
        k52 k52Var = new k52();
        k52Var.A = this.b;
        k52Var.B = this.c;
        k52Var.C = gb5.m;
        return k52Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j52)) {
            return false;
        }
        j52 j52Var = (j52) obj;
        return im3.n(this.b, j52Var.b) && this.c == j52Var.c;
    }

    public final int hashCode() {
        return gb5.m.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        k52 k52Var = (k52) es4Var;
        nf nfVar = k52Var.A;
        nf nfVar2 = this.b;
        boolean zN = im3.n(nfVar, nfVar2);
        k52Var.A = nfVar2;
        k52Var.B = this.c;
        k52Var.C = gb5.m;
        if (zN) {
            return;
        }
        k52Var.D = false;
        vn4.p0(k52Var).S();
    }
}
