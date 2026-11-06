package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class xk3 implements Iterator, su3 {
    public final int m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2526o;
    public int p;

    public xk3(int i, int i2, int i3) {
        this.m = i3;
        this.n = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.f2526o = z;
        this.p = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2526o;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public final int nextInt() {
        int i = this.p;
        if (i != this.n) {
            this.p = this.m + i;
            return i;
        }
        if (this.f2526o) {
            this.f2526o = false;
            return i;
        }
        yq4.p();
        return 0;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
