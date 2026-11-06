package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public final class wm4 implements Map, su3 {
    public final jx4 m;
    public fc2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public fc2 f2429o;
    public nd7 p;

    public wm4(jx4 jx4Var) {
        this.m = jx4Var;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.m.c(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.m.d(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        fc2 fc2Var = this.n;
        if (fc2Var != null) {
            return fc2Var;
        }
        fc2 fc2Var2 = new fc2(this.m, (byte) 0);
        this.n = fc2Var2;
        return fc2Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wm4.class != obj.getClass()) {
            return false;
        }
        return this.m.equals(((wm4) obj).m);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.m.g(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.m.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.m.i();
    }

    @Override // java.util.Map
    public final Set keySet() {
        fc2 fc2Var = this.f2429o;
        if (fc2Var != null) {
            return fc2Var;
        }
        fc2 fc2Var2 = new fc2(this.m, (byte) 1);
        this.f2429o = fc2Var2;
        return fc2Var2;
    }

    @Override // java.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.m.e;
    }

    public final String toString() {
        return this.m.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        nd7 nd7Var = this.p;
        if (nd7Var != null) {
            return nd7Var;
        }
        nd7 nd7Var2 = new nd7(this.m);
        this.p = nd7Var2;
        return nd7Var2;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
