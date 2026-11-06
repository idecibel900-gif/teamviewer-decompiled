package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class mx4 implements fv3, Set, su3 {
    public final kx4 m;
    public final kx4 n;

    public mx4(kx4 kx4Var) {
        this.m = kx4Var;
        this.n = kx4Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.n.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        kx4 kx4Var = this.n;
        int i = kx4Var.d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            kx4Var.j(it.next());
        }
        return i != kx4Var.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.n.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.m.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.m.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mx4.class != obj.getClass()) {
            return false;
        }
        return this.m.equals(((mx4) obj).m);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.m.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.m.g();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new ry2(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.n.l(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        kx4 kx4Var = this.n;
        int i = kx4Var.d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            kx4Var.i(it.next());
        }
        return i != kx4Var.d;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0053 A[LOOP:0: B:5:0x0014->B:17:0x0053, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0056 A[EDGE_INSN: B:24:0x0056->B:18:0x0056 BREAK  A[LOOP:0: B:5:0x0014->B:17:0x0053], SYNTHETIC] */
    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        kx4 kx4Var = this.n;
        Object[] objArr = kx4Var.b;
        int i = kx4Var.d;
        long[] jArr = kx4Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!lv0.h0(collection, objArr[i5])) {
                                kx4Var.m(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return i != kx4Var.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.m.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return hm3.E(this, objArr);
    }

    public final String toString() {
        return this.m.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return hm3.D(this);
    }
}
