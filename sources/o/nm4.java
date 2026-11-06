package o;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class nm4 implements Map.Entry, su3 {
    public final Object m;
    public final Object n;

    public nm4(Object obj, Object obj2) {
        this.m = obj;
        this.n = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nm4)) {
            return false;
        }
        nm4 nm4Var = (nm4) obj;
        return im3.n(this.m, nm4Var.m) && im3.n(this.n, nm4Var.n);
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
        Object obj = this.m;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.n;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "MapEntry(key=" + this.m + ", value=" + this.n + ')';
    }
}
