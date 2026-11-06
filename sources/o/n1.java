package o;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class n1 implements ListIterator, su3 {
    public int m;
    public int n;

    public n1(int i, int i2) {
        this.m = i;
        this.n = i2;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.m < this.n;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.m > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.m;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.m - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
