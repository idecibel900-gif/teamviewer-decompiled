package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class fd7 implements List, tu3 {
    public final j57 m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f786o;
    public int p;

    public fd7(j57 j57Var, int i, int i2) {
        this.m = j57Var;
        this.n = i;
        this.f786o = xk0.y(j57Var);
        this.p = i2 - i;
    }

    public final void a() {
        if (xk0.y(this.m) == this.f786o) {
            return;
        }
        gk0.c();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        a();
        int i = this.n + this.p;
        j57 j57Var = this.m;
        j57Var.add(i, obj);
        this.p++;
        this.f786o = xk0.y(j57Var);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        int i2 = i + this.n;
        j57 j57Var = this.m;
        boolean zAddAll = j57Var.addAll(i2, collection);
        if (zAddAll) {
            this.p = collection.size() + this.p;
            this.f786o = xk0.y(j57Var);
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.p > 0) {
            a();
            int i = this.p;
            int i2 = this.n;
            j57 j57Var = this.m;
            j57Var.c(i2, i + i2);
            this.p = 0;
            this.f786o = xk0.y(j57Var);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        a();
        xk0.N(i, this.p);
        return this.m.get(this.n + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int iNextInt;
        a();
        int i = this.p;
        int i2 = this.n;
        Iterator it = ct1.b0(i2, i + i2).iterator();
        do {
            xk3 xk3Var = (xk3) it;
            if (!xk3Var.f2526o) {
                return -1;
            }
            iNextInt = xk3Var.nextInt();
        } while (!im3.n(obj, this.m.get(iNextInt)));
        return iNextInt - i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.p == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        int i = this.p;
        int i2 = this.n;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (im3.n(obj, this.m.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        a();
        i76 i76Var = new i76();
        i76Var.m = i - 1;
        return new ld6(i76Var, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        a();
        int i2 = this.n + i;
        j57 j57Var = this.m;
        Object objRemove = j57Var.remove(i2);
        this.p--;
        this.f786o = xk0.y(j57Var);
        return objRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        c2 c2Var;
        n47 n47VarH;
        boolean zI;
        a();
        j57 j57Var = this.m;
        int i2 = this.n;
        int i3 = this.p + i2;
        int size = j57Var.size();
        do {
            synchronized (xk0.w) {
                o97 o97Var = j57Var.m;
                o97Var.getClass();
                o97 o97Var2 = (o97) v47.f(o97Var);
                i = o97Var2.d;
                c2Var = o97Var2.c;
            }
            c2Var.getClass();
            kk5 kk5VarF = c2Var.f();
            kk5VarF.subList(i2, i3).retainAll(collection);
            c2 c2VarC = kk5VarF.c();
            if (im3.n(c2VarC, c2Var)) {
                break;
            }
            o97 o97Var3 = j57Var.m;
            o97Var3.getClass();
            synchronized (v47.c) {
                n47VarH = v47.h();
                zI = xk0.i((o97) v47.w(o97Var3, j57Var, n47VarH), i, c2VarC, true);
            }
            v47.l(n47VarH, j57Var);
        } while (!zI);
        int size2 = size - j57Var.size();
        if (size2 > 0) {
            this.f786o = xk0.y(this.m);
            this.p -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        xk0.N(i, this.p);
        a();
        int i2 = i + this.n;
        j57 j57Var = this.m;
        Object obj2 = j57Var.set(i2, obj);
        this.f786o = xk0.y(j57Var);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.p;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.p) {
            up5.a("fromIndex or toIndex are out of bounds");
        }
        a();
        int i3 = this.n;
        return new fd7(this.m, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return hm3.D(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return hm3.E(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        a();
        int i2 = this.n + i;
        j57 j57Var = this.m;
        j57Var.add(i2, obj);
        this.p++;
        this.f786o = xk0.y(j57Var);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.p, collection);
    }
}
