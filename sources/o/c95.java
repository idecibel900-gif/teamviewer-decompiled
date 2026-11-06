package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class c95 extends uw {
    public final xp m;
    public final int n;

    public c95(int i, xp xpVar) {
        this.m = xpVar;
        this.n = i;
    }

    @Override // o.uw
    public final int a() {
        return 1;
    }

    @Override // o.uw
    public final void b(int i, xp xpVar) {
        throw new IllegalStateException();
    }

    @Override // o.uw
    public final Object get(int i) {
        if (i == this.n) {
            return this.m;
        }
        return null;
    }

    @Override // o.uw, java.lang.Iterable
    public final Iterator iterator() {
        return new dq6(this, (byte) 2);
    }
}
