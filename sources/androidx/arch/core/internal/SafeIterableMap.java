package androidx.arch.core.internal;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import o.ah6;
import o.zg6;

/* JADX INFO: loaded from: classes.dex */
public final class SafeIterableMap implements Iterable {
    public ah6 m;
    public ah6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final WeakHashMap f11o = new WeakHashMap();
    public int p = 0;

    public final Object a(Object obj, Object obj2) {
        ah6 ah6Var = this.m;
        while (ah6Var != null && !ah6Var.m.equals(obj)) {
            ah6Var = ah6Var.f323o;
        }
        if (ah6Var != null) {
            return ah6Var.n;
        }
        ah6 ah6Var2 = new ah6(obj, obj2);
        this.p++;
        ah6 ah6Var3 = this.n;
        if (ah6Var3 == null) {
            this.m = ah6Var2;
            this.n = ah6Var2;
            return null;
        }
        ah6Var3.f323o = ah6Var2;
        ah6Var2.p = ah6Var3;
        this.n = ah6Var2;
        return null;
    }

    public final boolean equals(Object obj) {
        zg6 zg6Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SafeIterableMap)) {
            return false;
        }
        SafeIterableMap safeIterableMap = (SafeIterableMap) obj;
        if (this.p != safeIterableMap.p) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = safeIterableMap.iterator();
        while (true) {
            zg6Var = (zg6) it;
            if (!zg6Var.hasNext()) {
                break;
            }
            zg6 zg6Var2 = (zg6) it2;
            if (!zg6Var2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) zg6Var.next();
            Object next = zg6Var2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (zg6Var.hasNext() || ((zg6) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            zg6 zg6Var = (zg6) it;
            if (!zg6Var.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) zg6Var.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ah6 ah6Var = this.m;
        ah6 ah6Var2 = this.n;
        zg6 zg6Var = new zg6();
        zg6Var.m = ah6Var2;
        zg6Var.n = ah6Var;
        this.f11o.put(zg6Var, Boolean.FALSE);
        return zg6Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            zg6 zg6Var = (zg6) it;
            if (!zg6Var.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) zg6Var.next()).toString());
            if (zg6Var.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
