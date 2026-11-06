package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class t28 implements Iterator, su3 {
    public Object[] m = s28.e.d;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2073o;

    public final void a(Object[] objArr, int i, int i2) {
        this.m = objArr;
        this.n = i;
        this.f2073o = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2073o < this.n;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
