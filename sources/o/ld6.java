package o;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class ld6 implements ListIterator, su3 {
    public final /* synthetic */ byte m = 1;
    public final Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1353o;

    public ld6(dn4 dn4Var, int i) {
        this.f1353o = dn4Var;
        this.n = ((List) dn4Var.n).listIterator(lv0.D0(i, dn4Var));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.m) {
            case 0:
                ListIterator listIterator = (ListIterator) this.n;
                listIterator.add(obj);
                listIterator.previous();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                return ((ListIterator) obj).hasPrevious();
            case 1:
                return ((ListIterator) obj).hasPrevious();
            default:
                return ((i76) obj).m < ((fd7) this.f1353o).p - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                return ((ListIterator) obj).hasNext();
            case 1:
                return ((ListIterator) obj).hasNext();
            default:
                return ((i76) obj).m >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                return ((ListIterator) obj).previous();
            case 1:
                return ((ListIterator) obj).previous();
            default:
                i76 i76Var = (i76) obj;
                int i = i76Var.m + 1;
                fd7 fd7Var = (fd7) this.f1353o;
                xk0.N(i, fd7Var.p);
                i76Var.m = i;
                return fd7Var.get(i);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int iPreviousIndex;
        int size;
        byte b = this.m;
        Object obj = this.f1353o;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                iPreviousIndex = ((ListIterator) obj2).previousIndex();
                size = ((md6) obj).size();
                break;
            case 1:
                iPreviousIndex = ((ListIterator) obj2).previousIndex();
                size = ((dn4) obj).size();
                break;
            default:
                return ((i76) obj2).m + 1;
        }
        return (size - 1) - iPreviousIndex;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                return ((ListIterator) obj).next();
            case 1:
                return ((ListIterator) obj).next();
            default:
                i76 i76Var = (i76) obj;
                int i = i76Var.m;
                fd7 fd7Var = (fd7) this.f1353o;
                xk0.N(i, fd7Var.p);
                i76Var.m = i - 1;
                return fd7Var.get(i);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int iNextIndex;
        int size;
        byte b = this.m;
        Object obj = this.f1353o;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                iNextIndex = ((ListIterator) obj2).nextIndex();
                size = ((md6) obj).size();
                break;
            case 1:
                iNextIndex = ((ListIterator) obj2).nextIndex();
                size = ((dn4) obj).size();
                break;
            default:
                return ((i76) obj2).m;
        }
        return (size - 1) - iNextIndex;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.m) {
            case 0:
                ((ListIterator) this.n).remove();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.m) {
            case 0:
                ((ListIterator) this.n).set(obj);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public ld6(md6 md6Var, int i) {
        this.f1353o = md6Var;
        this.n = md6Var.m.listIterator(lv0.D0(i, md6Var));
    }

    public ld6(i76 i76Var, fd7 fd7Var) {
        this.n = i76Var;
        this.f1353o = fd7Var;
    }
}
