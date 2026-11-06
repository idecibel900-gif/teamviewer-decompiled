package o;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class n17 extends AbstractMap {
    public static final /* synthetic */ int r = 0;
    public List m;
    public Map n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1533o;
    public volatile pw p;
    public Map q;

    public static n17 f() {
        n17 n17Var = new n17();
        n17Var.m = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        n17Var.n = map;
        n17Var.q = map;
        return n17Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    public final int a(Comparable comparable) {
        int i;
        int i2;
        int i3;
        int iCompareTo;
        int size = this.m.size();
        int i4 = size - 1;
        if (i4 < 0) {
            i = 0;
            while (i <= i4) {
                i3 = (i + i4) / 2;
                iCompareTo = comparable.compareTo(((q17) this.m.get(i3)).m);
                if (iCompareTo < 0) {
                    i4 = i3 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i3;
                    }
                    i = i3 + 1;
                }
            }
            i2 = i + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((q17) this.m.get(i4)).m);
            if (iCompareTo2 > 0) {
                i2 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i4;
                }
                i = 0;
                while (i <= i4) {
                    i3 = (i + i4) / 2;
                    iCompareTo = comparable.compareTo(((q17) this.m.get(i3)).m);
                    if (iCompareTo < 0) {
                        i4 = i3 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i3;
                        }
                        i = i3 + 1;
                    }
                }
                i2 = i + 1;
            }
        }
        return -i2;
    }

    public final void b() {
        if (this.f1533o) {
            gk0.u();
        }
    }

    public final Map.Entry c(int i) {
        return (Map.Entry) this.m.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.m.isEmpty()) {
            this.m.clear();
        }
        if (this.n.isEmpty()) {
            return;
        }
        this.n.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.n.containsKey(comparable);
    }

    public final Set d() {
        return this.n.isEmpty() ? Collections.EMPTY_SET : this.n.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.n.isEmpty() && !(this.n instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.n = treeMap;
            this.q = treeMap.descendingMap();
        }
        return (SortedMap) this.n;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.p == null) {
            this.p = new pw(this, (byte) 2);
        }
        return this.p;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n17)) {
            return super.equals(obj);
        }
        n17 n17Var = (n17) obj;
        int size = size();
        if (size == n17Var.size()) {
            int size2 = this.m.size();
            if (size2 != n17Var.m.size()) {
                return ((AbstractSet) entrySet()).equals(n17Var.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (c(i).equals(n17Var.c(i))) {
                }
            }
            if (size2 != size) {
                return this.n.equals(n17Var.n);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((q17) this.m.get(iA)).setValue(obj);
        }
        b();
        if (this.m.isEmpty() && !(this.m instanceof ArrayList)) {
            this.m = new ArrayList(16);
        }
        int i = -(iA + 1);
        if (i >= 16) {
            return e().put(comparable, obj);
        }
        if (this.m.size() == 16) {
            q17 q17Var = (q17) this.m.remove(15);
            e().put(q17Var.m, q17Var.n);
        }
        this.m.add(i, new q17(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((q17) this.m.get(iA)).n : this.n.get(comparable);
    }

    public final Object h(int i) {
        b();
        Object obj = ((q17) this.m.remove(i)).n;
        if (!this.n.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.m;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new q17(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.m.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += ((q17) this.m.get(i)).hashCode();
        }
        return this.n.size() > 0 ? this.n.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return h(iA);
        }
        if (this.n.isEmpty()) {
            return null;
        }
        return this.n.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.n.size() + this.m.size();
    }
}
