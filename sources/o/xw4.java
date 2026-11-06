package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class xw4 implements List, tu3 {
    public final /* synthetic */ byte m;
    public final Object n;

    public /* synthetic */ xw4(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        byte b = this.m;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                zw4 zw4Var = (zw4) obj2;
                if (i < 0 || i > (i2 = zw4Var.b)) {
                    zw4Var.p(i);
                    throw null;
                }
                int i3 = i2 + 1;
                Object[] objArr = zw4Var.a;
                if (objArr.length < i3) {
                    zw4Var.m(i3, objArr);
                }
                Object[] objArr2 = zw4Var.a;
                int i4 = zw4Var.b;
                if (i != i4) {
                    cx.G0(i + 1, i, i4, objArr2, objArr2);
                }
                objArr2[i] = obj;
                zw4Var.b++;
                return;
            default:
                ((xx4) obj2).a(i, obj);
                return;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                collection.getClass();
                zw4 zw4Var = (zw4) obj;
                if (i < 0 || i > zw4Var.b) {
                    zw4Var.p(i);
                    throw null;
                }
                int i2 = 0;
                if (collection.isEmpty()) {
                    return false;
                }
                int size = collection.size() + zw4Var.b;
                Object[] objArr = zw4Var.a;
                if (objArr.length < size) {
                    zw4Var.m(size, objArr);
                }
                Object[] objArr2 = zw4Var.a;
                if (i != zw4Var.b) {
                    cx.G0(collection.size() + i, i, zw4Var.b, objArr2, objArr2);
                }
                for (Object obj2 : collection) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        qf0.U();
                        throw null;
                    }
                    objArr2[i2 + i] = obj2;
                    i2 = i3;
                }
                zw4Var.b = collection.size() + zw4Var.b;
                return true;
            default:
                return ((xx4) obj).e(i, collection);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                ((zw4) obj).d();
                break;
            default:
                ((xx4) obj).g();
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.m;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                return ((zw4) obj2).g(obj) >= 0;
            default:
                return ((xx4) obj2).h(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                collection.getClass();
                zw4 zw4Var = (zw4) obj;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (zw4Var.g(it.next()) < 0) {
                        return false;
                    }
                }
                return true;
            default:
                xx4 xx4Var = (xx4) obj;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!xx4Var.h(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                i65.a(i, this);
                return ((zw4) obj).f(i);
            default:
                yx4.a(i, this);
                return ((xx4) obj).m[i];
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        byte b = this.m;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                return ((zw4) obj2).g(obj);
            default:
                return ((xx4) obj2).i(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                return ((zw4) obj).h();
            default:
                return ((xx4) obj).f2559o == 0;
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.m) {
            case 0:
                return new ww4(this, 0, (byte) 0);
            default:
                return new ww4(this, 0, (byte) 1);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        byte b = this.m;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                zw4 zw4Var = (zw4) obj2;
                Object[] objArr = zw4Var.a;
                int i2 = zw4Var.b;
                if (obj == null) {
                    i = i2 - 1;
                    while (-1 < i) {
                        if (objArr[i] != null) {
                            i--;
                        }
                    }
                    return -1;
                }
                i = i2 - 1;
                while (-1 < i) {
                    if (!obj.equals(objArr[i])) {
                        i--;
                    }
                }
                return -1;
                return i;
            default:
                xx4 xx4Var = (xx4) obj2;
                Object[] objArr2 = xx4Var.m;
                for (int i3 = xx4Var.f2559o - 1; i3 >= 0; i3--) {
                    if (im3.n(obj, objArr2[i3])) {
                        return i3;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.m) {
            case 0:
                return new ww4(this, 0, (byte) 0);
            default:
                return new ww4(this, 0, (byte) 1);
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                i65.a(i, this);
                return ((zw4) obj).k(i);
            default:
                yx4.a(i, this);
                return ((xx4) obj).k(i);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                collection.getClass();
                zw4 zw4Var = (zw4) obj;
                int i = zw4Var.b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    zw4Var.j(it.next());
                }
                return i != zw4Var.b;
            default:
                xx4 xx4Var = (xx4) obj;
                if (!collection.isEmpty()) {
                    int i2 = xx4Var.f2559o;
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        xx4Var.j(it2.next());
                    }
                    if (i2 != xx4Var.f2559o) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                collection.getClass();
                zw4 zw4Var = (zw4) obj;
                int i = zw4Var.b;
                Object[] objArr = zw4Var.a;
                for (int i2 = i - 1; -1 < i2; i2--) {
                    if (!collection.contains(objArr[i2])) {
                        zw4Var.k(i2);
                    }
                }
                return i != zw4Var.b;
            default:
                xx4 xx4Var = (xx4) obj;
                int i3 = xx4Var.f2559o;
                for (int i4 = i3 - 1; -1 < i4; i4--) {
                    if (!collection.contains(xx4Var.m[i4])) {
                        xx4Var.k(i4);
                    }
                }
                return i3 != xx4Var.f2559o;
        }
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        byte b = this.m;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                i65.a(i, this);
                return ((zw4) obj2).n(i, obj);
            default:
                yx4.a(i, this);
                Object[] objArr = ((xx4) obj2).m;
                Object obj3 = objArr[i];
                objArr[i] = obj;
                return obj3;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                return ((zw4) obj).b;
            default:
                return ((xx4) obj).f2559o;
        }
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.m) {
            case 0:
                i65.b(this, i, i2);
                return new yw4(this, i, i2, (byte) 0);
            default:
                yx4.b(this, i, i2);
                return new yw4(this, i, i2, (byte) 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.m) {
            case 0:
                objArr.getClass();
                break;
        }
        return hm3.E(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.m) {
            case 0:
                break;
        }
        return hm3.D(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.m) {
            case 0:
                return new ww4(this, i, (byte) 0);
            default:
                return new ww4(this, i, (byte) 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        byte b = this.m;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                return ((zw4) obj2).j(obj);
            default:
                return ((xx4) obj2).j(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        byte b = this.m;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                ((zw4) obj2).a(obj);
                break;
            default:
                ((xx4) obj2).b(obj);
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                collection.getClass();
                zw4 zw4Var = (zw4) obj;
                int i = zw4Var.b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    zw4Var.a(it.next());
                }
                return i != zw4Var.b;
            default:
                xx4 xx4Var = (xx4) obj;
                return xx4Var.e(xx4Var.f2559o, collection);
        }
    }
}
