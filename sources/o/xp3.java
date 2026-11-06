package o;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes2.dex */
@lq6(with = zp3.class)
public final class xp3 extends lq3 implements List<lq3>, su3 {
    public static final wp3 Companion = new wp3();
    public final List m;

    public xp3(List list) {
        list.getClass();
        this.m = list;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, lq3 lq3Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends lq3> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof lq3)) {
            return false;
        }
        return this.m.contains((lq3) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return this.m.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return im3.n(this.m, obj);
    }

    @Override // java.util.List
    public final lq3 get(int i) {
        return (lq3) this.m.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.m.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof lq3)) {
            return -1;
        }
        return this.m.indexOf((lq3) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.m.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.m.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof lq3)) {
            return -1;
        }
        return this.m.lastIndexOf((lq3) obj);
    }

    @Override // java.util.List
    public final ListIterator<lq3> listIterator() {
        return this.m.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ lq3 remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<lq3> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ lq3 set(int i, lq3 lq3Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.m.size();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super lq3> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<lq3> subList(int i, int i2) {
        return this.m.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return hm3.E(this, objArr);
    }

    public final String toString() {
        return lv0.t0(this.m, ",", "[", "]", null, 56);
    }

    @Override // java.util.List
    public final ListIterator<lq3> listIterator(int i) {
        return this.m.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return hm3.D(this);
    }
}
