package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class y67 implements p01, Iterable, su3 {
    public final h17 m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final n96 f2583o;

    public y67(h17 h17Var, int i, wx2 wx2Var, n96 n96Var) {
        this.m = h17Var;
        this.n = i;
        this.f2583o = n96Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y67)) {
            return false;
        }
        y67 y67Var = (y67) obj;
        return y67Var.n == this.n && y67Var.m == this.m && y67Var.f2583o.equals(this.f2583o);
    }

    public final int hashCode() {
        return this.f2583o.hashCode() + ((this.m.hashCode() + (this.n * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new w67(this.m, this.n, null, this.f2583o);
    }
}
