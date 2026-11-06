package o;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class km4 extends AbstractCollection implements Collection, tu3 {
    public final /* synthetic */ byte m;
    public final Object n;

    public /* synthetic */ km4(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.m) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.m) {
            case 0:
                collection.getClass();
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                ((im4) obj).clear();
                break;
            default:
                ((bk5) obj).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.m;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                return ((im4) obj2).containsValue(obj);
            default:
                return ((bk5) obj2).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.m) {
            case 0:
                return ((im4) this.n).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                return new fm4((im4) obj, (byte) 2);
            default:
                bk5 bk5Var = (bk5) obj;
                t28[] t28VarArr = new t28[8];
                for (int i = 0; i < 8; i++) {
                    t28VarArr[i] = new u28((byte) 2);
                }
                return new fk5(bk5Var, t28VarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.m) {
            case 0:
                im4 im4Var = (im4) this.n;
                im4Var.c();
                int iH = im4Var.h(obj);
                if (iH < 0) {
                    return false;
                }
                im4Var.k(iH);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.m) {
            case 0:
                collection.getClass();
                ((im4) this.n).c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.m) {
            case 0:
                collection.getClass();
                ((im4) this.n).c();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                return ((im4) obj).u;
            default:
                return ((bk5) obj).r;
        }
    }
}
