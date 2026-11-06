package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class zg6 extends ch6 implements Iterator {
    public ah6 m;
    public ah6 n;

    @Override // o.ch6
    public final void a(ah6 ah6Var) {
        ah6 ah6Var2 = this.m;
        ah6 ah6Var3 = null;
        if (ah6Var2 == ah6Var && ah6Var == this.n) {
            this.n = null;
            this.m = null;
            ah6Var2 = null;
        }
        ah6 ah6Var4 = ah6Var2;
        if (ah6Var2 == ah6Var) {
            ah6Var4 = ah6Var2.p;
            this.m = ah6Var4;
        }
        ah6 ah6Var5 = this.n;
        if (ah6Var5 == ah6Var) {
            if (ah6Var5 != ah6Var4 && ah6Var4 != null) {
                ah6Var3 = ah6Var5.f323o;
            }
            this.n = ah6Var3;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.n != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        ah6 ah6Var = this.n;
        ah6 ah6Var2 = this.m;
        this.n = (ah6Var == ah6Var2 || ah6Var2 == null) ? null : ah6Var.f323o;
        return ah6Var;
    }
}
