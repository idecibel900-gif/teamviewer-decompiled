package o;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class sh2 implements Map.Entry, su3 {
    public final u84 m;
    public final w84 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public sh2 f2022o;
    public sh2 p;
    public boolean q;

    public sh2(u84 u84Var, w84 w84Var) {
        this.m = u84Var;
        this.n = w84Var;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sh2) {
            sh2 sh2Var = (sh2) obj;
            return this.m.equals(sh2Var.m) && this.n == sh2Var.n;
        }
        return false;
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
        return this.n.hashCode() + (this.m.hashCode() * 31);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "Entry(key=" + this.m + ", value=" + this.n + ")";
    }
}
