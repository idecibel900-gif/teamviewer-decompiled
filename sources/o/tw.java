package o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class tw implements Collection {
    public final /* synthetic */ vw m;

    public tw(vw vwVar) {
        this.m = vwVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.m.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.m.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.m.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new qw(this.m, (byte) 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        vw vwVar = this.m;
        int iA = vwVar.a(obj);
        if (iA < 0) {
            return false;
        }
        vwVar.g(iA);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        vw vwVar = this.m;
        int i = vwVar.f278o;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(vwVar.i(i2))) {
                vwVar.g(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        vw vwVar = this.m;
        int i = vwVar.f278o;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(vwVar.i(i2))) {
                vwVar.g(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.m.f278o;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        vw vwVar = this.m;
        int i = vwVar.f278o;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = vwVar.i(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        vw vwVar = this.m;
        int i = vwVar.f278o;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = vwVar.i(i2);
        }
        return objArr;
    }
}
