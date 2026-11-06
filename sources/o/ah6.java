package o;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ah6 implements Map.Entry {
    public final Object m;
    public final Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ah6 f323o;
    public ah6 p;

    public ah6(Object obj, Object obj2) {
        this.m = obj;
        this.n = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ah6)) {
            return false;
        }
        ah6 ah6Var = (ah6) obj;
        return this.m.equals(ah6Var.m) && this.n.equals(ah6Var.n);
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
        return this.n.hashCode() ^ this.m.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.m + "=" + this.n;
    }
}
