package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes2.dex */
@lq6(with = er3.class)
public final class cr3 extends lq3 implements Map<String, lq3>, su3 {
    public static final br3 Companion = new br3();
    public final Map m;

    public cr3(Map map) {
        map.getClass();
        this.m = map;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ lq3 compute(String str, BiFunction<? super String, ? super lq3, ? extends lq3> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ lq3 computeIfAbsent(String str, Function<? super String, ? extends lq3> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ lq3 computeIfPresent(String str, BiFunction<? super String, ? super lq3, ? extends lq3> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.m.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof lq3)) {
            return false;
        }
        return this.m.containsValue((lq3) obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, lq3>> entrySet() {
        return this.m.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return im3.n(this.m, obj);
    }

    @Override // java.util.Map
    public final lq3 get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (lq3) this.m.get((String) obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.m.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.m.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.m.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ lq3 merge(String str, lq3 lq3Var, BiFunction<? super lq3, ? super lq3, ? extends lq3> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ lq3 put(String str, lq3 lq3Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends lq3> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ lq3 putIfAbsent(String str, lq3 lq3Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final lq3 remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ lq3 replace(String str, lq3 lq3Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super lq3, ? extends lq3> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.m.size();
    }

    public final String toString() {
        return lv0.t0(this.m.entrySet(), ",", "{", "}", new ek3((byte) 4), 24);
    }

    @Override // java.util.Map
    public final Collection<lq3> values() {
        return this.m.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, lq3 lq3Var, lq3 lq3Var2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
