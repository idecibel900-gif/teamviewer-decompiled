package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class q88 implements Iterator {
    public final /* synthetic */ byte m;
    public Iterator n;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.m) {
            case 0:
                break;
        }
        return this.n.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.m) {
            case 0:
                break;
        }
        return (String) this.n.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.m) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
