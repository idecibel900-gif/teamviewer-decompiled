package o;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class k1 extends j1 implements ListIterator {
    public final /* synthetic */ m1 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(m1 m1Var, int i) {
        super(m1Var, (byte) 0);
        this.p = m1Var;
        int iA = m1Var.a();
        if (i < 0 || i > iA) {
            hk0.r(ua5.l("index: ", i, iA, ", size: "));
            throw null;
        }
        this.n = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.n > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.n;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            yq4.p();
            return null;
        }
        int i = this.n - 1;
        this.n = i;
        return this.p.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.n - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
