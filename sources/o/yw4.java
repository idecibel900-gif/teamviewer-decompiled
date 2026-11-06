package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class yw4 implements List, tu3 {
    public final /* synthetic */ byte m;
    public final List n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f2652o;
    public int p;

    public /* synthetic */ yw4(List list, int i, int i2, byte b) {
        this.m = b;
        this.n = list;
        this.f2652o = i;
        this.p = i2;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        byte b = this.m;
        int i2 = this.f2652o;
        List list = this.n;
        switch (b) {
            case 0:
                list.add(i + i2, obj);
                this.p++;
                break;
            default:
                list.add(i + i2, obj);
                this.p++;
                break;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        byte b = this.m;
        int i2 = this.f2652o;
        List list = this.n;
        switch (b) {
            case 0:
                collection.getClass();
                list.addAll(i + i2, collection);
                this.p = collection.size() + this.p;
                return collection.size() > 0;
            default:
                list.addAll(i + i2, collection);
                int size = collection.size();
                this.p += size;
                return size > 0;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        byte b = this.m;
        List list = this.n;
        int i = this.f2652o;
        switch (b) {
            case 0:
                int i2 = this.p - 1;
                if (i <= i2) {
                    while (true) {
                        list.remove(i2);
                        if (i2 != i) {
                            i2--;
                        }
                    }
                }
                this.p = i;
                break;
            default:
                int i3 = this.p - 1;
                if (i <= i3) {
                    while (true) {
                        list.remove(i3);
                        if (i3 != i) {
                            i3--;
                        }
                    }
                }
                this.p = i;
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.m;
        List list = this.n;
        int i = this.f2652o;
        switch (b) {
            case 0:
                int i2 = this.p;
                while (i < i2) {
                    if (im3.n(list.get(i), obj)) {
                        return true;
                    }
                    i++;
                }
                return false;
            default:
                int i3 = this.p;
                while (i < i3) {
                    if (im3.n(list.get(i), obj)) {
                        return true;
                    }
                    i++;
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.m) {
            case 0:
                collection.getClass();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!contains(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        byte b = this.m;
        int i2 = this.f2652o;
        List list = this.n;
        switch (b) {
            case 0:
                i65.a(i, this);
                break;
            default:
                yx4.a(i, this);
                break;
        }
        return list.get(i + i2);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        byte b = this.m;
        List list = this.n;
        int i = this.f2652o;
        switch (b) {
            case 0:
                int i2 = this.p;
                for (int i3 = i; i3 < i2; i3++) {
                    if (im3.n(list.get(i3), obj)) {
                        return i3 - i;
                    }
                }
                return -1;
            default:
                int i4 = this.p;
                for (int i5 = i; i5 < i4; i5++) {
                    if (im3.n(list.get(i5), obj)) {
                        return i5 - i;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.m) {
            case 0:
                return this.p == this.f2652o;
            default:
                return this.p == this.f2652o;
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
        byte b = this.m;
        List list = this.n;
        int i = this.f2652o;
        switch (b) {
            case 0:
                int i2 = this.p - 1;
                if (i > i2) {
                    return -1;
                }
                while (!im3.n(list.get(i2), obj)) {
                    if (i2 == i) {
                        return -1;
                    }
                    i2--;
                }
                return i2 - i;
            default:
                int i3 = this.p - 1;
                if (i > i3) {
                    return -1;
                }
                while (!im3.n(list.get(i3), obj)) {
                    if (i3 == i) {
                        return -1;
                    }
                    i3--;
                }
                return i3 - i;
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

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        byte b = this.m;
        int i = this.f2652o;
        List list = this.n;
        switch (b) {
            case 0:
                int i2 = this.p;
                while (i < i2) {
                    if (im3.n(list.get(i), obj)) {
                        list.remove(i);
                        this.p--;
                        return true;
                    }
                    i++;
                }
                return false;
            default:
                int i3 = this.p;
                while (i < i3) {
                    if (im3.n(list.get(i), obj)) {
                        list.remove(i);
                        this.p--;
                        return true;
                    }
                    i++;
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.m) {
            case 0:
                collection.getClass();
                int i = this.p;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    remove(it.next());
                }
                return i != this.p;
            default:
                int i2 = this.p;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    remove(it2.next());
                }
                return i2 != this.p;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        byte b = this.m;
        int i = this.f2652o;
        List list = this.n;
        switch (b) {
            case 0:
                collection.getClass();
                int i2 = this.p;
                int i3 = i2 - 1;
                if (i <= i3) {
                    while (true) {
                        if (!collection.contains(list.get(i3))) {
                            list.remove(i3);
                            this.p--;
                        }
                        if (i3 != i) {
                            i3--;
                        }
                    }
                }
                return i2 != this.p;
            default:
                int i4 = this.p;
                int i5 = i4 - 1;
                if (i <= i5) {
                    while (true) {
                        if (!collection.contains(list.get(i5))) {
                            list.remove(i5);
                            this.p--;
                        }
                        if (i5 != i) {
                            i5--;
                        }
                    }
                }
                return i4 != this.p;
        }
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        byte b = this.m;
        int i2 = this.f2652o;
        List list = this.n;
        switch (b) {
            case 0:
                i65.a(i, this);
                break;
            default:
                yx4.a(i, this);
                break;
        }
        return list.set(i + i2, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i;
        int i2;
        switch (this.m) {
            case 0:
                i = this.p;
                i2 = this.f2652o;
                break;
            default:
                i = this.p;
                i2 = this.f2652o;
                break;
        }
        return i - i2;
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
    public final boolean add(Object obj) {
        byte b = this.m;
        List list = this.n;
        switch (b) {
            case 0:
                int i = this.p;
                this.p = i + 1;
                list.add(i, obj);
                break;
            default:
                int i2 = this.p;
                this.p = i2 + 1;
                list.add(i2, obj);
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        byte b = this.m;
        List list = this.n;
        switch (b) {
            case 0:
                collection.getClass();
                list.addAll(this.p, collection);
                this.p = collection.size() + this.p;
                return collection.size() > 0;
            default:
                list.addAll(this.p, collection);
                int size = collection.size();
                this.p += size;
                return size > 0;
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        byte b = this.m;
        int i2 = this.f2652o;
        List list = this.n;
        switch (b) {
            case 0:
                i65.a(i, this);
                Object objRemove = list.remove(i + i2);
                this.p--;
                return objRemove;
            default:
                yx4.a(i, this);
                Object objRemove2 = list.remove(i + i2);
                this.p--;
                return objRemove2;
        }
    }
}
