package o;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class q17 implements Map.Entry, Comparable {
    public final Comparable m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n17 f1796o;

    public q17(n17 n17Var, Comparable comparable, Object obj) {
        this.f1796o = n17Var;
        this.m = comparable;
        this.n = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.m.compareTo(((q17) obj).m);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.m;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.n;
                    Object value = entry.getValue();
                    if (obj2 == null) {
                        zEquals2 = value == null;
                    } else {
                        zEquals2 = obj2.equals(value);
                    }
                    if (zEquals2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.m;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.n;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.m;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.n;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f1796o.b();
        Object obj2 = this.n;
        this.n = obj;
        return obj2;
    }

    public final String toString() {
        return this.m + "=" + this.n;
    }
}
