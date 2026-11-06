package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class aq6 implements Iterator, hc1, su3 {
    public byte m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Iterator f348o;
    public hc1 p;

    public final RuntimeException a() {
        byte b = this.m;
        if (b == 4) {
            return new NoSuchElementException();
        }
        if (b == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + ((int) this.m));
    }

    public final void b(Object obj, hc1 hc1Var) {
        this.n = obj;
        this.m = (byte) 3;
        this.p = hc1Var;
        hc1Var.getClass();
    }

    @Override // o.hc1
    public final de1 getContext() {
        return ba2.m;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            byte b = this.m;
            if (b != 0) {
                if (b != 1) {
                    if (b == 2 || b == 3) {
                        return true;
                    }
                    if (b == 4) {
                        return false;
                    }
                    throw a();
                }
                Iterator it = this.f348o;
                it.getClass();
                if (it.hasNext()) {
                    this.m = (byte) 2;
                    return true;
                }
                this.f348o = null;
            }
            this.m = (byte) 5;
            hc1 hc1Var = this.p;
            hc1Var.getClass();
            this.p = null;
            hc1Var.resumeWith(f88.a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.m;
        if (b == 0 || b == 1) {
            if (hasNext()) {
                return next();
            }
            yq4.p();
            return null;
        }
        if (b == 2) {
            this.m = (byte) 1;
            Iterator it = this.f348o;
            it.getClass();
            return it.next();
        }
        if (b != 3) {
            throw a();
        }
        this.m = (byte) 0;
        Object obj = this.n;
        this.n = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // o.hc1
    public final void resumeWith(Object obj) {
        ct1.a0(obj);
        this.m = (byte) 4;
    }
}
