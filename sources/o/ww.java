package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class ww implements Iterator, su3 {
    public byte m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2452o = -1;
    public final /* synthetic */ xw p;

    public ww(xw xwVar) {
        this.p = xwVar;
    }

    public final boolean a() {
        int i;
        Object[] objArr;
        this.m = (byte) 3;
        do {
            i = this.f2452o + 1;
            this.f2452o = i;
            objArr = this.p.m;
            if (i >= objArr.length) {
                break;
            }
        } while (objArr[i] == null);
        if (i >= objArr.length) {
            this.m = (byte) 2;
            return false;
        }
        Object obj = objArr[i];
        obj.getClass();
        this.n = obj;
        this.m = (byte) 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.m;
        if (b == 0) {
            return a();
        }
        if (b == 1) {
            return true;
        }
        if (b == 2) {
            return false;
        }
        hk0.g("hasNext called when the iterator is in the FAILED state.");
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.m;
        if (b == 1) {
            this.m = (byte) 0;
            return this.n;
        }
        if (b == 2 || !a()) {
            yq4.p();
            return null;
        }
        this.m = (byte) 0;
        return this.n;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
