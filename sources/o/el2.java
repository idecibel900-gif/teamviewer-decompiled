package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class el2 implements Iterator, su3 {
    public final Iterator m;
    public int n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f723o;
    public final /* synthetic */ fl2 p;

    public el2(fl2 fl2Var) {
        this.p = fl2Var;
        this.m = fl2Var.a.iterator();
    }

    public final void a() {
        Object next;
        fl2 fl2Var;
        do {
            Iterator it = this.m;
            if (!it.hasNext()) {
                this.n = 0;
                return;
            } else {
                next = it.next();
                fl2Var = this.p;
            }
        } while (((Boolean) fl2Var.c.invoke(next)).booleanValue() != fl2Var.b);
        this.f723o = next;
        this.n = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.n == -1) {
            a();
        }
        return this.n == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.n == -1) {
            a();
        }
        if (this.n == 0) {
            yq4.p();
            return null;
        }
        Object obj = this.f723o;
        this.f723o = null;
        this.n = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
