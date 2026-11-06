package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class zj5 implements Map, su3 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final zj5 f2711o = new zj5(s28.e, 0);
    public final s28 m;
    public final int n;

    public zj5(s28 s28Var, int i) {
        this.m = s28Var;
        this.n = i;
    }

    public bk5 a() {
        return new bk5(this);
    }

    public /* bridge */ bk5 b() {
        return a();
    }

    public final zj5 c(Object obj, pa4 pa4Var) {
        io.sentry.android.core.u0 u0VarU = this.m.u(obj != null ? obj.hashCode() : 0, 0, obj, pa4Var);
        return u0VarU == null ? this : new zj5((s28) u0VarU.f127o, this.n + (u0VarU.n ? 1 : 0));
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.m.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set setEntrySet = entrySet();
        if (setEntrySet.isEmpty()) {
            return false;
        }
        Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (im3.n(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new gk5(this, (byte) 0);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this.n != map.size()) {
            return false;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : setEntrySet) {
            if (entry != null) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = get(key);
                if (im3.n(value, obj2) && (obj2 != null || containsKey(key))) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.m.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.n == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new gk5(this, (byte) 1);
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
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.n;
    }

    public final String toString() {
        return lv0.t0(entrySet(), ", ", "{", "}", new q0(this, (byte) 2), 24);
    }

    @Override // java.util.Map
    public final Collection values() {
        return new en4(this, (byte) 1);
    }
}
