package o;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class p17 implements Comparable, Map.Entry {
    public final Comparable m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ m17 f1694o;

    public p17(m17 m17Var, Comparable comparable, Object obj) {
        this.f1694o = m17Var;
        this.m = comparable;
        this.n = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.m.compareTo(((p17) obj).m);
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
        this.f1694o.b();
        Object obj2 = this.n;
        this.n = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.m);
        String strValueOf2 = String.valueOf(this.n);
        StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 1);
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        return sb.toString();
    }
}
