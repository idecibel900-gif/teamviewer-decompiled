package o;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class sw implements Iterator, Map.Entry {
    public int m;
    public int n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2062o;
    public final /* synthetic */ vw p;

    public sw(vw vwVar) {
        this.p = vwVar;
        this.m = vwVar.f278o - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f2062o) {
            hk0.l("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.n;
            vw vwVar = this.p;
            if (im3.n(key, vwVar.f(i)) && im3.n(entry.getValue(), vwVar.i(this.n))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f2062o) {
            return this.p.f(this.n);
        }
        hk0.l("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f2062o) {
            return this.p.i(this.n);
        }
        hk0.l("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.n < this.m;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f2062o) {
            hk0.l("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.n;
        vw vwVar = this.p;
        Object objF = vwVar.f(i);
        Object objI = vwVar.i(this.n);
        return (objF == null ? 0 : objF.hashCode()) ^ (objI != null ? objI.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            yq4.p();
            return null;
        }
        this.n++;
        this.f2062o = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f2062o) {
            throw new IllegalStateException();
        }
        this.p.g(this.n);
        this.n--;
        this.m--;
        this.f2062o = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f2062o) {
            return this.p.h(this.n, obj);
        }
        hk0.l("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
