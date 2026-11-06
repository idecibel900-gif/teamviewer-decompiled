package o;

import java.util.AbstractList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class v53 implements ListIterator, su3 {
    public final /* synthetic */ byte m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2278o;
    public int p;
    public final Object q;

    public v53(j57 j57Var, int i) {
        this.m = (byte) 3;
        this.q = j57Var;
        this.n = i - 1;
        this.f2278o = -1;
        this.p = xk0.y(j57Var);
    }

    public void a() {
        if (((AbstractList) ((ra4) this.q).q).modCount == this.p) {
            return;
        }
        gk0.c();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        byte b = this.m;
        Object obj2 = this.q;
        switch (b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                ra4 ra4Var = (ra4) obj2;
                int i = this.n;
                this.n = i + 1;
                ra4Var.add(i, obj);
                this.f2278o = -1;
                this.p = ((AbstractList) ra4Var).modCount;
                return;
            case 2:
                b();
                sa4 sa4Var = (sa4) obj2;
                int i2 = this.n;
                this.n = i2 + 1;
                sa4Var.add(i2, obj);
                this.f2278o = -1;
                this.p = ((AbstractList) sa4Var).modCount;
                return;
            default:
                c();
                j57 j57Var = (j57) obj2;
                j57Var.add(this.n + 1, obj);
                this.f2278o = -1;
                this.n++;
                this.p = xk0.y(j57Var);
                return;
        }
    }

    public void b() {
        if (((AbstractList) ((sa4) this.q)).modCount == this.p) {
            return;
        }
        gk0.c();
    }

    public void c() {
        if (xk0.y((j57) this.q) == this.p) {
            return;
        }
        gk0.c();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        byte b = this.m;
        Object obj = this.q;
        switch (b) {
            case 0:
                return this.n < this.p;
            case 1:
                return this.n < ((ra4) obj).f1907o;
            case 2:
                return this.n < ((sa4) obj).n;
            default:
                return this.n < ((j57) obj).size() - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.m) {
            case 0:
                return this.n > this.f2278o;
            case 1:
                return this.n > 0;
            case 2:
                return this.n > 0;
            default:
                return this.n >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        byte b = this.m;
        Object obj = this.q;
        switch (b) {
            case 0:
                zw4 zw4Var = ((x53) obj).m;
                int i = this.n;
                this.n = i + 1;
                Object objF = zw4Var.f(i);
                objF.getClass();
                return (es4) objF;
            case 1:
                a();
                int i2 = this.n;
                ra4 ra4Var = (ra4) obj;
                if (i2 >= ra4Var.f1907o) {
                    yq4.p();
                    return null;
                }
                this.n = i2 + 1;
                this.f2278o = i2;
                return ra4Var.m[ra4Var.n + i2];
            case 2:
                b();
                int i3 = this.n;
                sa4 sa4Var = (sa4) obj;
                if (i3 >= sa4Var.n) {
                    yq4.p();
                    return null;
                }
                this.n = i3 + 1;
                this.f2278o = i3;
                return sa4Var.m[i3];
            default:
                c();
                int i4 = this.n + 1;
                this.f2278o = i4;
                j57 j57Var = (j57) obj;
                xk0.N(i4, j57Var.size());
                Object obj2 = j57Var.get(i4);
                this.n = i4;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.m) {
            case 0:
                return this.n - this.f2278o;
            case 1:
                return this.n;
            case 2:
                return this.n;
            default:
                return this.n + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        byte b = this.m;
        Object obj = this.q;
        switch (b) {
            case 0:
                zw4 zw4Var = ((x53) obj).m;
                int i = this.n - 1;
                this.n = i;
                Object objF = zw4Var.f(i);
                objF.getClass();
                return (es4) objF;
            case 1:
                a();
                int i2 = this.n;
                if (i2 <= 0) {
                    yq4.p();
                    return null;
                }
                int i3 = i2 - 1;
                this.n = i3;
                this.f2278o = i3;
                ra4 ra4Var = (ra4) obj;
                return ra4Var.m[ra4Var.n + i3];
            case 2:
                b();
                int i4 = this.n;
                if (i4 <= 0) {
                    yq4.p();
                    return null;
                }
                int i5 = i4 - 1;
                this.n = i5;
                this.f2278o = i5;
                return ((sa4) obj).m[i5];
            default:
                c();
                j57 j57Var = (j57) obj;
                xk0.N(this.n, j57Var.size());
                int i6 = this.n;
                this.f2278o = i6;
                Object obj2 = j57Var.get(i6);
                this.n--;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.m) {
            case 0:
                return (this.n - this.f2278o) - 1;
            case 1:
                i = this.n;
                break;
            case 2:
                i = this.n;
                break;
            default:
                return this.n;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        byte b = this.m;
        Object obj = this.q;
        switch (b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                ra4 ra4Var = (ra4) obj;
                a();
                int i = this.f2278o;
                if (i == -1) {
                    hk0.l("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                ra4Var.b(i);
                this.n = this.f2278o;
                this.f2278o = -1;
                this.p = ((AbstractList) ra4Var).modCount;
                return;
            case 2:
                sa4 sa4Var = (sa4) obj;
                b();
                int i2 = this.f2278o;
                if (i2 == -1) {
                    hk0.l("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                sa4Var.b(i2);
                this.n = this.f2278o;
                this.f2278o = -1;
                this.p = ((AbstractList) sa4Var).modCount;
                return;
            default:
                c();
                j57 j57Var = (j57) obj;
                j57Var.remove(this.f2278o);
                this.n--;
                this.f2278o = -1;
                this.p = xk0.y(j57Var);
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        byte b = this.m;
        Object obj2 = this.q;
        switch (b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                int i = this.f2278o;
                if (i != -1) {
                    ((ra4) obj2).set(i, obj);
                    return;
                } else {
                    hk0.l("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            case 2:
                b();
                int i2 = this.f2278o;
                if (i2 != -1) {
                    ((sa4) obj2).set(i2, obj);
                    return;
                } else {
                    hk0.l("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            default:
                j57 j57Var = (j57) obj2;
                c();
                int i3 = this.f2278o;
                if (i3 < 0) {
                    hk0.l("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                    return;
                } else {
                    j57Var.set(i3, obj);
                    this.p = xk0.y(j57Var);
                    return;
                }
        }
    }

    public v53(sa4 sa4Var, int i) {
        this.m = (byte) 2;
        this.q = sa4Var;
        this.n = i;
        this.f2278o = -1;
        this.p = ((AbstractList) sa4Var).modCount;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v53(x53 x53Var, int i, int i2) {
        this(x53Var, (i2 & 1) != 0 ? 0 : i, 0, x53Var.m.b);
        this.m = (byte) 0;
    }

    public v53(x53 x53Var, int i, int i2, int i3) {
        this.m = (byte) 0;
        this.q = x53Var;
        this.n = i;
        this.f2278o = i2;
        this.p = i3;
    }

    public v53(ra4 ra4Var, int i) {
        this.m = (byte) 1;
        this.q = ra4Var;
        this.n = i;
        this.f2278o = -1;
        this.p = ((AbstractList) ra4Var).modCount;
    }
}
