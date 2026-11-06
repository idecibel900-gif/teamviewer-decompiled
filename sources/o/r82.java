package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collector;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes2.dex */
public final class r82 extends ArrayList {
    /* JADX WARN: Multi-variable type inference failed */
    public final x35 a() {
        if (isEmpty()) {
            return null;
        }
        return (x35) get(0);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            ((x35) it.next()).K();
        }
        super.clear();
    }

    @Override // java.util.ArrayList
    public final Object clone() {
        r82 r82Var = new r82(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            r82Var.add(((o82) it.next()).m());
        }
        return r82Var;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        x35 x35Var = (x35) super.remove(iIndexOf);
        x35Var.K();
        return true;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.ArrayList, java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        Iterator<E> it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (predicate.test((x35) it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        for (int i = 0; i < size(); i++) {
            o82 o82Var = (o82) ((x35) unaryOperator.apply((x35) get(i)));
            db8.o0(o82Var);
            x35 x35Var = (x35) super.set(i, o82Var);
            x35Var.M(o82Var);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        Iterator<E> it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains((x35) it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        o82 o82Var = (o82) obj;
        db8.o0(o82Var);
        x35 x35Var = (x35) super.set(i, o82Var);
        x35Var.M(o82Var);
        return (o82) x35Var;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        Stream map = stream().map(new k82((byte) 2));
        String[] strArr = lb7.a;
        return (String) map.collect(Collector.of(new hb7("\n"), new ib7(), new jb7(), new k82((byte) 3), new Collector.Characteristics[0]));
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        x35 x35Var = (x35) super.remove(i);
        x35Var.K();
        return (o82) x35Var;
    }
}
