package o;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class gm4 implements Map.Entry, uu3 {
    public final im4 m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f906o;

    public gm4(im4 im4Var, int i) {
        this.m = im4Var;
        this.n = i;
        this.f906o = im4Var.t;
    }

    public final void a() {
        if (this.m.t != this.f906o) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return im3.n(entry.getKey(), getKey()) && im3.n(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.m.m[this.n];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.m.n;
        objArr.getClass();
        return objArr[this.n];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        im4 im4Var = this.m;
        im4Var.c();
        Object[] objArr = im4Var.n;
        if (objArr == null) {
            int length = im4Var.m.length;
            if (length < 0) {
                hk0.g("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            im4Var.n = objArr;
        }
        int i = this.n;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
