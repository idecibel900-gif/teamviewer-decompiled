package o;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class kq8 extends vq8 implements ListIterator {
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1294o;
    public final sq8 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq8(sq8 sq8Var, int i) {
        super((byte) 0);
        int size = sq8Var.size();
        if (i < 0 || i > size) {
            hk0.r(i67.J(i, size, "index"));
            throw null;
        }
        this.n = size;
        this.f1294o = i;
        this.p = sq8Var;
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
        return this.f1294o < this.n;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f1294o > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            yq4.p();
            return null;
        }
        int i = this.f1294o;
        this.f1294o = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f1294o;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            yq4.p();
            return null;
        }
        int i = this.f1294o - 1;
        this.f1294o = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f1294o - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
