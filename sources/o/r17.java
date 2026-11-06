package o;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class r17 implements Iterator {
    public final /* synthetic */ byte m;
    public int n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1882o;
    public Iterator p;
    public final /* synthetic */ AbstractMap q;

    public /* synthetic */ r17(AbstractMap abstractMap, byte b) {
        this.m = b;
        this.q = abstractMap;
    }

    public final Iterator a() {
        byte b = this.m;
        AbstractMap abstractMap = this.q;
        switch (b) {
            case 0:
                Iterator it = this.p;
                if (it != null) {
                    return it;
                }
                Iterator it2 = ((m17) abstractMap).f1427o.entrySet().iterator();
                this.p = it2;
                return it2;
            default:
                Iterator it3 = this.p;
                if (it3 != null) {
                    return it3;
                }
                Iterator it4 = ((n17) abstractMap).n.entrySet().iterator();
                this.p = it4;
                return it4;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.m;
        AbstractMap abstractMap = this.q;
        switch (b) {
            case 0:
                return this.n + 1 < ((m17) abstractMap).n.size() || a().hasNext();
            default:
                n17 n17Var = (n17) abstractMap;
                return this.n + 1 < n17Var.m.size() || (!n17Var.n.isEmpty() && a().hasNext());
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.m;
        AbstractMap abstractMap = this.q;
        switch (b) {
            case 0:
                this.f1882o = true;
                int i = this.n + 1;
                this.n = i;
                m17 m17Var = (m17) abstractMap;
                return i < m17Var.n.size() ? (Map.Entry) m17Var.n.get(this.n) : (Map.Entry) a().next();
            default:
                this.f1882o = true;
                int i2 = this.n + 1;
                this.n = i2;
                n17 n17Var = (n17) abstractMap;
                return i2 < n17Var.m.size() ? (Map.Entry) n17Var.m.get(this.n) : (Map.Entry) a().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        byte b = this.m;
        AbstractMap abstractMap = this.q;
        switch (b) {
            case 0:
                m17 m17Var = (m17) abstractMap;
                if (!this.f1882o) {
                    hk0.l("remove() was called before next()");
                } else {
                    this.f1882o = false;
                    int i = m17.r;
                    m17Var.b();
                    if (this.n >= m17Var.n.size()) {
                        a().remove();
                    } else {
                        int i2 = this.n;
                        this.n = i2 - 1;
                        m17Var.f(i2);
                    }
                }
                break;
            default:
                n17 n17Var = (n17) abstractMap;
                if (!this.f1882o) {
                    hk0.l("remove() was called before next()");
                } else {
                    this.f1882o = false;
                    int i3 = n17.r;
                    n17Var.b();
                    if (this.n >= n17Var.m.size()) {
                        a().remove();
                    } else {
                        int i4 = this.n;
                        this.n = i4 - 1;
                        n17Var.h(i4);
                    }
                }
                break;
        }
    }
}
