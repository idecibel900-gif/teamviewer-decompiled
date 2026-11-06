package o;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/nb2;", "Lo/ls4;", "Lo/ac2;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class nb2 extends ls4 {
    public final u18 b;
    public final n18 c;
    public final n18 d;
    public final n18 e;
    public final bc2 f;
    public final hf2 g;
    public final dy6 h;
    public final Function0 i;
    public final ob2 j;

    public nb2(u18 u18Var, n18 n18Var, n18 n18Var2, n18 n18Var3, bc2 bc2Var, hf2 hf2Var, dy6 dy6Var, Function0 function0, ob2 ob2Var) {
        this.b = u18Var;
        this.c = n18Var;
        this.d = n18Var2;
        this.e = n18Var3;
        this.f = bc2Var;
        this.g = hf2Var;
        this.h = dy6Var;
        this.i = function0;
        this.j = ob2Var;
    }

    @Override // o.ls4
    public final es4 create() {
        return new ac2(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nb2)) {
            return false;
        }
        nb2 nb2Var = (nb2) obj;
        return nb2Var.b == this.b && im3.n(nb2Var.c, this.c) && im3.n(nb2Var.d, this.d) && im3.n(nb2Var.e, this.e) && nb2Var.f.equals(this.f) && im3.n(nb2Var.g, this.g) && nb2Var.h == this.h && nb2Var.i == this.i && im3.n(nb2Var.j, this.j);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        n18 n18Var = this.c;
        int iHashCode2 = (iHashCode + (n18Var != null ? n18Var.hashCode() : 0)) * 31;
        n18 n18Var2 = this.d;
        int iHashCode3 = (iHashCode2 + (n18Var2 != null ? n18Var2.hashCode() : 0)) * 31;
        n18 n18Var3 = this.e;
        return this.h.hashCode() + (this.j.hashCode() * 31) + e41.f((this.g.a.hashCode() + ((this.f.a.hashCode() + ((iHashCode3 + (n18Var3 != null ? n18Var3.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.i);
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        ac2 ac2Var = (ac2) es4Var;
        ac2Var.A = this.b;
        ac2Var.B = this.c;
        ac2Var.C = this.d;
        ac2Var.D = this.e;
        ac2Var.E = this.f;
        ac2Var.F = this.g;
        ac2Var.G = this.h;
        ac2Var.H = this.i;
        ac2Var.I = this.j;
    }
}
