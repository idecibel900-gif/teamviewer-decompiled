package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class j57 implements Parcelable, s97, List, RandomAccess, tu3 {
    public static final Parcelable.Creator<j57> CREATOR = new i57((byte) 0);
    public o97 m;

    public j57(c2 c2Var) {
        n47 n47VarH = v47.h();
        o97 o97Var = new o97(n47VarH.g(), c2Var);
        if (!(n47VarH instanceof lz2)) {
            o97Var.b = new o97(1L, c2Var);
        }
        this.m = o97Var;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        c2 c2Var;
        n47 n47VarH;
        boolean zI;
        do {
            synchronized (xk0.w) {
                o97 o97Var = this.m;
                o97Var.getClass();
                o97 o97Var2 = (o97) v47.f(o97Var);
                i = o97Var2.d;
                c2Var = o97Var2.c;
            }
            c2Var.getClass();
            c2 c2VarC = c2Var.c(obj);
            if (c2VarC.equals(c2Var)) {
                return false;
            }
            o97 o97Var3 = this.m;
            o97Var3.getClass();
            synchronized (v47.c) {
                n47VarH = v47.h();
                zI = xk0.i((o97) v47.w(o97Var3, this, n47VarH), i, c2VarC, true);
            }
            v47.l(n47VarH, this);
        } while (!zI);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        c2 c2Var;
        n47 n47VarH;
        boolean zI;
        do {
            synchronized (xk0.w) {
                o97 o97Var = this.m;
                o97Var.getClass();
                o97 o97Var2 = (o97) v47.f(o97Var);
                i = o97Var2.d;
                c2Var = o97Var2.c;
            }
            c2Var.getClass();
            c2 c2VarD = c2Var.d(collection);
            if (im3.n(c2VarD, c2Var)) {
                return false;
            }
            o97 o97Var3 = this.m;
            o97Var3.getClass();
            synchronized (v47.c) {
                n47VarH = v47.h();
                zI = xk0.i((o97) v47.w(o97Var3, this, n47VarH), i, c2VarD, true);
            }
            v47.l(n47VarH, this);
        } while (!zI);
        return true;
    }

    public final void c(int i, int i2) {
        int i3;
        c2 c2Var;
        n47 n47VarH;
        boolean zI;
        do {
            synchronized (xk0.w) {
                o97 o97Var = this.m;
                o97Var.getClass();
                o97 o97Var2 = (o97) v47.f(o97Var);
                i3 = o97Var2.d;
                c2Var = o97Var2.c;
            }
            c2Var.getClass();
            kk5 kk5VarF = c2Var.f();
            kk5VarF.subList(i, i2).clear();
            c2 c2VarC = kk5VarF.c();
            if (im3.n(c2VarC, c2Var)) {
                return;
            }
            o97 o97Var3 = this.m;
            o97Var3.getClass();
            synchronized (v47.c) {
                n47VarH = v47.h();
                zI = xk0.i((o97) v47.w(o97Var3, this, n47VarH), i3, c2VarC, true);
            }
            v47.l(n47VarH, this);
        } while (!zI);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        n47 n47VarH;
        o97 o97Var = this.m;
        o97Var.getClass();
        synchronized (v47.c) {
            n47VarH = v47.h();
            o97 o97Var2 = (o97) v47.w(o97Var, this, n47VarH);
            synchronized (xk0.w) {
                o97Var2.c = l17.n;
                o97Var2.d++;
                o97Var2.e++;
            }
        }
        v47.l(n47VarH, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return xk0.x(this).c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return xk0.x(this).c.containsAll(collection);
    }

    @Override // o.s97
    public final u97 d() {
        return this.m;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return xk0.x(this).c.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return xk0.x(this).c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return xk0.x(this).c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return xk0.x(this).c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new v53(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        c2 c2Var;
        n47 n47VarH;
        boolean zI;
        do {
            synchronized (xk0.w) {
                o97 o97Var = this.m;
                o97Var.getClass();
                o97 o97Var2 = (o97) v47.f(o97Var);
                i = o97Var2.d;
                c2Var = o97Var2.c;
            }
            c2Var.getClass();
            int iIndexOf = c2Var.indexOf(obj);
            c2 c2VarH = iIndexOf != -1 ? c2Var.h(iIndexOf) : c2Var;
            if (c2VarH.equals(c2Var)) {
                return false;
            }
            o97 o97Var3 = this.m;
            o97Var3.getClass();
            synchronized (v47.c) {
                n47VarH = v47.h();
                zI = xk0.i((o97) v47.w(o97Var3, this, n47VarH), i, c2VarH, true);
            }
            v47.l(n47VarH, this);
        } while (!zI);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        c2 c2Var;
        n47 n47VarH;
        boolean zI;
        do {
            synchronized (xk0.w) {
                o97 o97Var = this.m;
                o97Var.getClass();
                o97 o97Var2 = (o97) v47.f(o97Var);
                i = o97Var2.d;
                c2Var = o97Var2.c;
            }
            c2Var.getClass();
            c2 c2VarG = c2Var.g(new b2(collection, (byte) 0));
            if (im3.n(c2VarG, c2Var)) {
                return false;
            }
            o97 o97Var3 = this.m;
            o97Var3.getClass();
            synchronized (v47.c) {
                n47VarH = v47.h();
                zI = xk0.i((o97) v47.w(o97Var3, this, n47VarH), i, c2VarG, true);
            }
            v47.l(n47VarH, this);
        } while (!zI);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return xk0.D(this, new b2(collection, (byte) 2));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        c2 c2Var;
        n47 n47VarH;
        boolean zI;
        Object obj2 = get(i);
        do {
            synchronized (xk0.w) {
                o97 o97Var = this.m;
                o97Var.getClass();
                o97 o97Var2 = (o97) v47.f(o97Var);
                i2 = o97Var2.d;
                c2Var = o97Var2.c;
            }
            c2Var.getClass();
            c2 c2VarI = c2Var.i(i, obj);
            if (c2VarI.equals(c2Var)) {
                break;
            }
            o97 o97Var3 = this.m;
            o97Var3.getClass();
            synchronized (v47.c) {
                n47VarH = v47.h();
                zI = xk0.i((o97) v47.w(o97Var3, this, n47VarH), i2, c2VarI, false);
            }
            v47.l(n47VarH, this);
        } while (!zI);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return xk0.x(this).c.a();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            up5.a("fromIndex or toIndex are out of bounds");
        }
        return new fd7(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return hm3.D(this);
    }

    public final String toString() {
        o97 o97Var = this.m;
        o97Var.getClass();
        return "SnapshotStateList(value=" + ((o97) v47.f(o97Var)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        c2 c2Var = xk0.x(this).c;
        int iA = c2Var.a();
        parcel.writeInt(iA);
        for (int i2 = 0; i2 < iA; i2++) {
            parcel.writeValue(c2Var.get(i2));
        }
    }

    @Override // o.s97
    public final void x(u97 u97Var) {
        u97Var.b = this.m;
        this.m = (o97) u97Var;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return hm3.E(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new v53(this, i);
    }

    public j57() {
        this(l17.n);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        c2 c2Var;
        n47 n47VarH;
        boolean zI;
        do {
            synchronized (xk0.w) {
                o97 o97Var = this.m;
                o97Var.getClass();
                o97 o97Var2 = (o97) v47.f(o97Var);
                i2 = o97Var2.d;
                c2Var = o97Var2.c;
            }
            c2Var.getClass();
            c2 c2VarB = c2Var.b(i, obj);
            if (c2VarB.equals(c2Var)) {
                return;
            }
            o97 o97Var3 = this.m;
            o97Var3.getClass();
            synchronized (v47.c) {
                n47VarH = v47.h();
                zI = xk0.i((o97) v47.w(o97Var3, this, n47VarH), i2, c2VarB, true);
            }
            v47.l(n47VarH, this);
        } while (!zI);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return xk0.D(this, new jq2((byte) 2, i, collection));
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        c2 c2Var;
        n47 n47VarH;
        boolean zI;
        Object obj = get(i);
        do {
            synchronized (xk0.w) {
                o97 o97Var = this.m;
                o97Var.getClass();
                o97 o97Var2 = (o97) v47.f(o97Var);
                i2 = o97Var2.d;
                c2Var = o97Var2.c;
            }
            c2Var.getClass();
            c2 c2VarH = c2Var.h(i);
            if (c2VarH.equals(c2Var)) {
                break;
            }
            o97 o97Var3 = this.m;
            o97Var3.getClass();
            synchronized (v47.c) {
                n47VarH = v47.h();
                zI = xk0.i((o97) v47.w(o97Var3, this, n47VarH), i2, c2VarH, true);
            }
            v47.l(n47VarH, this);
        } while (!zI);
        return obj;
    }
}
