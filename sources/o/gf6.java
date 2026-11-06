package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class gf6 implements Iterator {
    public final ff6 m;
    public ky n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f889o;

    public gf6(hf6 hf6Var) {
        ff6 ff6Var = new ff6(hf6Var);
        this.m = ff6Var;
        this.n = new ky(ff6Var.next());
        this.f889o = hf6Var.n;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f889o > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.n.hasNext()) {
            this.n = new ky(this.m.next());
        }
        this.f889o--;
        return Byte.valueOf(this.n.a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
