package o;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class m17 extends AbstractMap {
    public static final /* synthetic */ int r = 0;
    public final byte m;
    public List n = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Map f1427o = Collections.EMPTY_MAP;
    public boolean p;
    public volatile pw q;

    /* JADX WARN: Multi-variable type inference failed */
    public m17(int i) {
        this.m = i;
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
        int size = this.n.size();
        int i4 = size - 1;
        if (i4 < 0) {
            i = 0;
            while (i <= i4) {
                i3 = (i + i4) / 2;
                iCompareTo = comparable.compareTo(((p17) this.n.get(i3)).m);
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
            int iCompareTo2 = comparable.compareTo(((p17) this.n.get(i4)).m);
            if (iCompareTo2 > 0) {
                i2 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i4;
                }
                i = 0;
                while (i <= i4) {
                    i3 = (i + i4) / 2;
                    iCompareTo = comparable.compareTo(((p17) this.n.get(i3)).m);
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
        if (this.p) {
            gk0.u();
        }
    }

    public final Iterable c() {
        return this.f1427o.isEmpty() ? qf0.r : this.f1427o.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.n.isEmpty()) {
            this.n.clear();
        }
        if (this.f1427o.isEmpty()) {
            return;
        }
        this.f1427o.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f1427o.containsKey(comparable);
    }

    public final SortedMap d() {
        b();
        if (this.f1427o.isEmpty() && !(this.f1427o instanceof TreeMap)) {
            this.f1427o = new TreeMap();
        }
        return (SortedMap) this.f1427o;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((p17) this.n.get(iA)).setValue(obj);
        }
        b();
        boolean zIsEmpty = this.n.isEmpty();
        byte b = this.m;
        if (zIsEmpty && !(this.n instanceof ArrayList)) {
            this.n = new ArrayList(b);
        }
        int i = -(iA + 1);
        if (i >= b) {
            return d().put(comparable, obj);
        }
        if (this.n.size() == b) {
            p17 p17Var = (p17) this.n.remove(b - 1);
            d().put(p17Var.m, p17Var.n);
        }
        this.n.add(i, new p17(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.q == null) {
            this.q = new pw(this, (byte) 1);
        }
        return this.q;
    }

    public final Object f(int i) {
        b();
        Object obj = ((p17) this.n.remove(i)).n;
        if (!this.f1427o.isEmpty()) {
            Iterator it = d().entrySet().iterator();
            List list = this.n;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new p17(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((p17) this.n.get(iA)).n : this.f1427o.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return f(iA);
        }
        if (this.f1427o.isEmpty()) {
            return null;
        }
        return this.f1427o.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f1427o.size() + this.n.size();
    }
}
