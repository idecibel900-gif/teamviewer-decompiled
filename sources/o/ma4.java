package o;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ma4 implements Map.Entry {
    public ma4 m;
    public ma4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ma4 f1454o;
    public ma4 p;
    public ma4 q;
    public final Object r;
    public final int s;
    public Object t;
    public int u;

    public ma4(ma4 ma4Var, Object obj, int i, ma4 ma4Var2, ma4 ma4Var3) {
        this.m = ma4Var;
        this.r = obj;
        this.s = i;
        this.u = 1;
        this.p = ma4Var2;
        this.q = ma4Var3;
        ma4Var3.p = this;
        ma4Var2.q = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.r;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.t;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.r;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.t;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.r;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.t;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.t;
        this.t = obj;
        return obj2;
    }

    public final String toString() {
        return this.r + "=" + this.t;
    }

    public ma4() {
        this.r = null;
        this.s = -1;
        this.q = this;
        this.p = this;
    }
}
