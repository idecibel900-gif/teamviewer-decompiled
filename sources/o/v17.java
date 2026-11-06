package o;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class v17 extends x1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f2266o = 0;
    public Object m;
    public int n;

    @Override // o.x1
    public final int a() {
        return this.n;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Object obj2;
        int i = this.n;
        if (i == 0) {
            this.m = obj;
        } else {
            Object obj3 = this.m;
            if (i == 1) {
                if (im3.n(obj3, obj)) {
                    return false;
                }
                this.m = new Object[]{this.m, obj};
            } else if (i < 5) {
                obj3.getClass();
                Object[] objArr = (Object[]) obj3;
                if (cx.B0(obj, objArr)) {
                    return false;
                }
                int i2 = this.n;
                if (i2 == 4) {
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    LinkedHashSet linkedHashSet = new LinkedHashSet(xm4.Q(objArrCopyOf.length));
                    cx.d1(objArrCopyOf, linkedHashSet);
                    linkedHashSet.add(obj);
                    obj2 = linkedHashSet;
                } else {
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i2 + 1);
                    objArrCopyOf2[objArrCopyOf2.length - 1] = obj;
                    obj2 = objArrCopyOf2;
                }
                this.m = obj2;
            } else {
                obj3.getClass();
                if (!e8.h(obj3).add(obj)) {
                    return false;
                }
            }
        }
        this.n++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.m = null;
        this.n = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (a() == 0) {
            return false;
        }
        if (a() == 1) {
            return im3.n(this.m, obj);
        }
        int iA = a();
        Object obj2 = this.m;
        if (iA < 5) {
            obj2.getClass();
            return cx.B0(obj, (Object[]) obj2);
        }
        obj2.getClass();
        return ((Set) obj2).contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.n;
        if (i == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        Object obj = this.m;
        if (i == 1) {
            return new dq6(obj, (byte) 1);
        }
        if (i < 5) {
            obj.getClass();
            return new ek5((Object[]) obj);
        }
        obj.getClass();
        return e8.h(obj).iterator();
    }
}
