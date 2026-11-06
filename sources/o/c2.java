package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class c2 extends m1 {
    public abstract c2 b(int i, Object obj);

    public abstract c2 c(Object obj);

    @Override // o.r0, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // o.r0, java.util.Collection, java.util.List
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

    public c2 d(Collection collection) {
        kk5 kk5VarF = f();
        kk5VarF.addAll(collection);
        return kk5VarF.c();
    }

    public abstract kk5 f();

    public abstract c2 g(b2 b2Var);

    public abstract c2 h(int i);

    public abstract c2 i(int i, Object obj);

    @Override // o.m1, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // o.m1, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // o.m1, java.util.List
    public final List subList(int i, int i2) {
        return new df3(this, i, i2);
    }
}
