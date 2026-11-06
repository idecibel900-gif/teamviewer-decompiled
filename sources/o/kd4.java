package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes.dex */
public final class kd4 implements Collection, su3 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final kd4 f1251o = new kd4(ea2.m);
    public final List m;
    public final int n;

    public kd4(List list) {
        this.m = list;
        this.n = list.size();
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof jd4)) {
            return false;
        }
        return this.m.contains((jd4) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.m.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kd4) {
            return this.m.equals(((kd4) obj).m);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.m.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.m.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.m.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.n;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return hm3.D(this);
    }

    public final String toString() {
        return fx3.i("LocaleList(localeList=", this.m, ")");
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return hm3.E(this, objArr);
    }
}
