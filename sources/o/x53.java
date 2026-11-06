package o;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes.dex */
public final class x53 implements List, su3 {
    public final zw4 m = new zw4(16);
    public final ow4 n = new ow4(16);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2482o = -1;

    public final long a() {
        long jB = bt1.b(Float.POSITIVE_INFINITY, false, false);
        int i = this.f2482o + 1;
        int i2 = this.m.b - 1;
        if (i > i2) {
            return jB;
        }
        while (i >= 0) {
            ow4 ow4Var = this.n;
            if (i >= ow4Var.b) {
                break;
            }
            long j = ow4Var.a[i];
            if (zu1.r(j, jB) < 0) {
                jB = j;
            }
            if ((zu1.w(jB) < 0.0f && zu1.A(jB)) || i == i2) {
                return jB;
            }
            i++;
        }
        hk0.r("Index must be between 0 and size");
        return 0L;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b(int i, int i2) {
        ow4 ow4Var;
        int i3;
        if (i >= i2) {
            return;
        }
        this.m.l(i, i2);
        if (i < 0 || i > (i3 = (ow4Var = this.n).b) || i2 < 0 || i2 > i3) {
            hk0.r("Index must be between 0 and size");
            return;
        }
        if (i2 < i) {
            hk0.g("The end index must be < start index");
        } else if (i2 != i) {
            if (i2 < i3) {
                long[] jArr = ow4Var.a;
                cx.H0(jArr, jArr, i, i2, i3);
            }
            ow4Var.b -= i2 - i;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f2482o = -1;
        this.m.d();
        this.n.b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof es4) && indexOf((es4) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((es4) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object objF = this.m.f(i);
        objF.getClass();
        return (es4) objF;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof es4)) {
            return -1;
        }
        es4 es4Var = (es4) obj;
        zw4 zw4Var = this.m;
        int i = zw4Var.b - 1;
        if (i < 0) {
            return -1;
        }
        int i2 = 0;
        while (!im3.n(zw4Var.f(i2), es4Var)) {
            if (i2 == i) {
                return -1;
            }
            i2++;
        }
        return i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.m.h();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new v53(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof es4) {
            es4 es4Var = (es4) obj;
            zw4 zw4Var = this.m;
            for (int i = zw4Var.b - 1; -1 < i; i--) {
                if (im3.n(zw4Var.f(i), es4Var)) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new v53(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.m.b;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return new w53(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return hm3.D(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return hm3.E(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new v53(this, i, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
