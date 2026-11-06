package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class s17 implements Iterator {
    public static final s17 n = new s17(0);
    public final /* synthetic */ byte m;

    public /* synthetic */ s17(byte b) {
        this.m = b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.m) {
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.m) {
            case 0:
                throw new NoSuchElementException();
            default:
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.m) {
            case 0:
                throw new IllegalStateException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
