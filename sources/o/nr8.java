package o;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class nr8 extends vq8 implements ListIterator {
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1597o;
    public final yr8 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr8(yr8 yr8Var, int i) {
        super((byte) 1);
        int size = yr8Var.size();
        v67.u(i, size);
        this.n = size;
        this.f1597o = i;
        this.p = yr8Var;
    }

    public final Object a(int i) {
        return this.p.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f1597o < this.n;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f1597o > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            yq4.p();
            return null;
        }
        int i = this.f1597o;
        this.f1597o = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f1597o;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            yq4.p();
            return null;
        }
        int i = this.f1597o - 1;
        this.f1597o = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f1597o - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
