package o;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class q97 implements Iterator, su3 {
    public final l57 m;
    public final Iterator n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1813o;
    public Map.Entry p;
    public Map.Entry q;
    public final /* synthetic */ byte r;

    public q97(l57 l57Var, Iterator it, byte b) {
        this.r = b;
        this.m = l57Var;
        this.n = it;
        this.f1813o = l57Var.b().d;
        a();
    }

    public final void a() {
        this.p = this.q;
        Iterator it = this.n;
        this.q = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.q != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.r) {
            case 0:
                a();
                if (this.p != null) {
                    return new p97(this);
                }
                throw new IllegalStateException();
            case 1:
                Map.Entry entry = this.q;
                if (entry == null) {
                    throw new IllegalStateException();
                }
                a();
                return entry.getKey();
            default:
                Map.Entry entry2 = this.q;
                if (entry2 == null) {
                    throw new IllegalStateException();
                }
                a();
                return entry2.getValue();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        l57 l57Var = this.m;
        if (l57Var.b().d != this.f1813o) {
            gk0.c();
            return;
        }
        Map.Entry entry = this.p;
        if (entry == null) {
            throw new IllegalStateException();
        }
        l57Var.remove(entry.getKey());
        this.p = null;
        this.f1813o = l57Var.b().d;
    }
}
