package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002¨\u0006\u0004"}, d2 = {"Lo/mn;", "S", "Lo/ls4;", "Lo/on;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class mn<S> extends ls4 {
    public final n18 b;
    public final px4 c;
    public final pn d;

    public mn(n18 n18Var, px4 px4Var, pn pnVar) {
        this.b = n18Var;
        this.c = px4Var;
        this.d = pnVar;
    }

    @Override // o.ls4
    public final es4 create() {
        return new on(this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mn)) {
            return false;
        }
        mn mnVar = (mn) obj;
        return im3.n(mnVar.b, this.b) && mnVar.c.equals(this.c);
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        n18 n18Var = this.b;
        return this.c.hashCode() + ((iHashCode + (n18Var != null ? n18Var.hashCode() : 0)) * 31);
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        on onVar = (on) es4Var;
        onVar.A = this.b;
        onVar.B = this.c;
        onVar.C = this.d;
    }
}
