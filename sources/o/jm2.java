package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class jm2 implements Iterator, su3 {
    public final Iterator m;
    public Iterator n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte f1181o;
    public final /* synthetic */ km2 p;

    public jm2(km2 km2Var) {
        this.p = km2Var;
        this.m = km2Var.a.iterator();
    }

    public final boolean a() {
        Iterator it;
        Iterator it2 = this.n;
        if (it2 != null && it2.hasNext()) {
            this.f1181o = (byte) 1;
            return true;
        }
        do {
            Iterator it3 = this.m;
            if (!it3.hasNext()) {
                this.f1181o = (byte) 2;
                this.n = null;
                return false;
            }
            Object next = it3.next();
            km2 km2Var = this.p;
            it = (Iterator) km2Var.c.invoke(km2Var.b.invoke(next));
        } while (!it.hasNext());
        this.n = it;
        this.f1181o = (byte) 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.f1181o;
        if (b == 1) {
            return true;
        }
        if (b == 2) {
            return false;
        }
        return a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.f1181o;
        if (b == 2) {
            yq4.p();
            return null;
        }
        if (b == 0 && !a()) {
            yq4.p();
            return null;
        }
        this.f1181o = (byte) 0;
        Iterator it = this.n;
        it.getClass();
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
