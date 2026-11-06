package o;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class t17 implements Iterator {
    public boolean m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ u17 f2070o;

    public t17(u17 u17Var) {
        this.f2070o = u17Var;
        this.n = ((AbstractList) u17Var).modCount;
    }

    public final void a() {
        u17 u17Var = this.f2070o;
        int i = ((AbstractList) u17Var).modCount;
        int i2 = this.n;
        if (i == i2) {
            return;
        }
        throw new ConcurrentModificationException("ModCount: " + ((AbstractList) u17Var).modCount + "; expected: " + i2);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.m;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.m) {
            yq4.p();
            return null;
        }
        this.m = true;
        a();
        return this.f2070o.n;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        this.f2070o.clear();
    }
}
