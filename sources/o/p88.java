package o;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class p88 implements ListIterator {
    public final /* synthetic */ byte m;
    public ListIterator n;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.m) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.m) {
            case 0:
                break;
        }
        return this.n.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.m) {
            case 0:
                break;
        }
        return this.n.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.m) {
            case 0:
                break;
        }
        return (String) this.n.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.m) {
            case 0:
                break;
        }
        return this.n.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.m) {
            case 0:
                break;
        }
        return (String) this.n.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.m) {
            case 0:
                break;
        }
        return this.n.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.m) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.m) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
