package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Lo/we;", "T", "Lo/ls4;", "Lo/gf;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class we<T> extends ls4 {
    public final nf b;
    public final boolean c;
    public final ca0 d;

    public we(nf nfVar, boolean z, ca0 ca0Var) {
        this.b = nfVar;
        this.c = z;
        this.d = ca0Var;
    }

    @Override // o.ls4
    public final es4 create() {
        gf gfVar = new gf(uf0.m, this.c, null, gb5.m);
        gfVar.V = this.b;
        gfVar.W = this.d;
        return gfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we)) {
            return false;
        }
        we weVar = (we) obj;
        return im3.n(this.b, weVar.b) && this.c == weVar.c && im3.n(this.d, weVar.d);
    }

    public final int hashCode() {
        int iF = to7.f((gb5.m.hashCode() + (this.b.hashCode() * 31)) * 31, 28629151, this.c);
        ca0 ca0Var = this.d;
        return iF + (ca0Var != null ? ca0Var.hashCode() : 0);
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        boolean z;
        boolean z2;
        gf gfVar = (gf) es4Var;
        ca0 ca0Var = this.d;
        gfVar.W = ca0Var;
        nf nfVar = gfVar.V;
        nf nfVar2 = this.b;
        if (im3.n(nfVar, nfVar2)) {
            z = false;
        } else {
            gfVar.V = nfVar2;
            gfVar.r1(ca0Var);
            z = true;
        }
        gb5 gb5Var = gfVar.C;
        gb5 gb5Var2 = gb5.m;
        if (gb5Var != gb5Var2) {
            gfVar.C = gb5Var2;
            z2 = true;
        } else {
            z2 = z;
        }
        gfVar.o1(gfVar.D, this.c, null, gb5Var2, z2);
    }
}
