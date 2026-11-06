package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/b34;", "Lo/ls4;", "Lo/e34;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class b34 extends ls4 {
    public final g44 b;
    public final eb0 c;
    public final gb5 d;

    public b34(g44 g44Var, eb0 eb0Var, gb5 gb5Var) {
        this.b = g44Var;
        this.c = eb0Var;
        this.d = gb5Var;
    }

    @Override // o.ls4
    public final es4 create() {
        e34 e34Var = new e34();
        e34Var.A = this.b;
        e34Var.B = this.c;
        e34Var.C = this.d;
        return e34Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b34)) {
            return false;
        }
        b34 b34Var = (b34) obj;
        return im3.n(this.b, b34Var.b) && im3.n(this.c, b34Var.c) && this.d == b34Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + to7.f((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, false);
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        e34 e34Var = (e34) es4Var;
        e34Var.A = this.b;
        e34Var.B = this.c;
        e34Var.C = this.d;
    }
}
