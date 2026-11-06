package o;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class ww4 implements ListIterator, su3 {
    public final /* synthetic */ byte m;
    public final List n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2454o;

    public ww4(List list, int i, byte b) {
        this.m = b;
        switch (b) {
            case 1:
                this.n = list;
                this.f2454o = i;
                break;
            default:
                this.n = list;
                this.f2454o = i - 1;
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        byte b = this.m;
        List list = this.n;
        switch (b) {
            case 0:
                int i = this.f2454o + 1;
                this.f2454o = i;
                list.add(i, obj);
                break;
            default:
                list.add(this.f2454o, obj);
                this.f2454o++;
                break;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        byte b = this.m;
        List list = this.n;
        switch (b) {
            case 0:
                return this.f2454o < list.size() - 1;
            default:
                return this.f2454o < list.size();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.m) {
            case 0:
                return this.f2454o >= 0;
            default:
                return this.f2454o > 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        byte b = this.m;
        List list = this.n;
        switch (b) {
            case 0:
                int i = this.f2454o + 1;
                this.f2454o = i;
                return list.get(i);
            default:
                int i2 = this.f2454o;
                this.f2454o = i2 + 1;
                return list.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.m) {
            case 0:
                return this.f2454o + 1;
            default:
                return this.f2454o;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        byte b = this.m;
        List list = this.n;
        switch (b) {
            case 0:
                int i = this.f2454o;
                this.f2454o = i - 1;
                return list.get(i);
            default:
                int i2 = this.f2454o - 1;
                this.f2454o = i2;
                return list.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.m) {
            case 0:
                return this.f2454o;
            default:
                return this.f2454o - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        byte b = this.m;
        List list = this.n;
        switch (b) {
            case 0:
                list.remove(this.f2454o);
                this.f2454o--;
                break;
            default:
                int i = this.f2454o - 1;
                this.f2454o = i;
                list.remove(i);
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        byte b = this.m;
        List list = this.n;
        switch (b) {
            case 0:
                list.set(this.f2454o, obj);
                break;
            default:
                list.set(this.f2454o, obj);
                break;
        }
    }
}
