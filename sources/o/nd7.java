package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes.dex */
public final class nd7 implements Collection, su3 {
    public final /* synthetic */ byte m;
    public final Object n;

    public nd7() {
        this.m = (byte) 0;
        this.n = cb5.a();
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.m) {
            case 0:
                return ((bx4) this.n).a(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.m) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.m) {
            case 0:
                ((bx4) this.n).b();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.m;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                return ((bx4) obj2).c(obj);
            default:
                return ((jx4) obj2).d(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!((bx4) obj).c(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                collection.getClass();
                Collection collection2 = collection;
                if (!collection2.isEmpty()) {
                    Iterator it2 = collection2.iterator();
                    while (it2.hasNext()) {
                        if (!((jx4) obj).d(it2.next())) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                return ((bx4) obj).g == 0;
            default:
                return ((jx4) obj).i();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.m) {
            case 0:
                return new ry2(new dx4((bx4) this.n));
            default:
                return ct1.M(new ec2(this, null, (byte) 3));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.m) {
            case 0:
                return ((bx4) this.n).h(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.m) {
            case 0:
                return ((bx4) this.n).h(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.m) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.m) {
            case 0:
                return ((bx4) this.n).j(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final int size() {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                return ((bx4) obj).g;
            default:
                return ((jx4) obj).e;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.m) {
            case 0:
                break;
            default:
                objArr.getClass();
                break;
        }
        return hm3.E(this, objArr);
    }

    public nd7(jx4 jx4Var) {
        this.m = (byte) 1;
        this.n = jx4Var;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.m) {
            case 0:
                break;
        }
        return hm3.D(this);
    }
}
