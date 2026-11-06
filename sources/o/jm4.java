package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class jm4 extends x1 {
    public final /* synthetic */ byte m;
    public final im4 n;

    public /* synthetic */ jm4(im4 im4Var, byte b) {
        this.m = b;
        this.n = im4Var;
    }

    @Override // o.x1
    public final int a() {
        byte b = this.m;
        im4 im4Var = this.n;
        switch (b) {
            case 0:
                break;
        }
        return im4Var.u;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.m) {
            case 0:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        byte b = this.m;
        collection.getClass();
        switch (b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        byte b = this.m;
        im4 im4Var = this.n;
        switch (b) {
            case 0:
                im4Var.clear();
                break;
            default:
                im4Var.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        byte b = this.m;
        im4 im4Var = this.n;
        switch (b) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                int iG = im4Var.g(entry.getKey());
                if (iG < 0) {
                    return false;
                }
                Object[] objArr = im4Var.n;
                objArr.getClass();
                return im3.n(objArr[iG], entry.getValue());
            default:
                return im4Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.m) {
            case 0:
                collection.getClass();
                return this.n.e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        byte b = this.m;
        im4 im4Var = this.n;
        switch (b) {
            case 0:
                break;
        }
        return im4Var.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.m;
        im4 im4Var = this.n;
        switch (b) {
            case 0:
                return new fm4(im4Var, (byte) 0);
            default:
                return new fm4(im4Var, (byte) 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        byte b = this.m;
        im4 im4Var = this.n;
        switch (b) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    im4Var.c();
                    int iG = im4Var.g(entry.getKey());
                    if (iG >= 0) {
                        Object[] objArr = im4Var.n;
                        objArr.getClass();
                        if (im3.n(objArr[iG], entry.getValue())) {
                            im4Var.k(iG);
                            return true;
                        }
                    }
                }
                return false;
            default:
                im4Var.c();
                int iG2 = im4Var.g(obj);
                if (iG2 < 0) {
                    return false;
                }
                im4Var.k(iG2);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        byte b = this.m;
        im4 im4Var = this.n;
        collection.getClass();
        switch (b) {
            case 0:
                im4Var.c();
                break;
            default:
                im4Var.c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        byte b = this.m;
        im4 im4Var = this.n;
        collection.getClass();
        switch (b) {
            case 0:
                im4Var.c();
                break;
            default:
                im4Var.c();
                break;
        }
        return super.retainAll(collection);
    }
}
